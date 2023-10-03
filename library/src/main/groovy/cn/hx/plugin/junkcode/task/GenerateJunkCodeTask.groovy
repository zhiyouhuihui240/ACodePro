package cn.hx.plugin.junkcode.task

import cn.hx.plugin.junkcode.ext.JunkCodeConfig
import cn.hx.plugin.junkcode.utils.JunkUtil
import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.*

abstract class GenerateJunkCodeTask extends DefaultTask {

    @Nested
    abstract JunkCodeConfig config

    @Input
    abstract Property<String> getNamespace()

    @OutputDirectory
    abstract DirectoryProperty getOutputFolder()

    @OutputDirectory
    abstract DirectoryProperty getJavaOutputFolder()

    @OutputDirectory
    abstract DirectoryProperty getResOutputFolder()

    @OutputFile
    abstract RegularFileProperty getManifestOutputFile()

    @OutputFile
    abstract RegularFileProperty getProguardOutputFile()


    private List<String> packageList = new ArrayList<>()
    private List<String> activityList = new ArrayList<>()

    GenerateJunkCodeTask() {
        getJavaOutputFolder().convention(getOutputFolder().dir("java"))
        getResOutputFolder().convention(getOutputFolder().dir("res"))
        getManifestOutputFile().convention(getOutputFolder().file("AndroidManifest.xml"))
        getProguardOutputFile().convention(getOutputFolder().file("proguard-rules.pro"))
    }

    @TaskAction
    void taskAction() {
        def javaDir = getJavaOutputFolder().get().asFile
        def resDir = getResOutputFolder().get().asFile
        javaDir.deleteDir()
        resDir.deleteDir()
        if (config.javaGenerator) {
            config.javaGenerator.execute(javaDir)
        } else {
            // 得到基本的信息，几个包名，包名名称
            for (int i = 0; i < config.packageCount; i++) {
                String packageName
                if (config.packageCreator) {
                    def packageNameBuilder = new StringBuffer()
                    // config.packageCreator.execute()方法会在实现类中执行，根据传入的参数生成一个包名并存储到 `packageNameBuilder` 对象中。
                    config.packageCreator.execute(new Tuple2(i, packageNameBuilder))
                    packageName = packageNameBuilder.toString()
                }
                else {
                    if (config.packageBase.isEmpty()) {
                        packageName = JunkUtil.generateName(i)
                    } else {
                        packageName = config.packageBase + "." + JunkUtil.generateName(i)
                    }
                }

                // todo：每个路径下，会生成多个类，目前只有 Activity类和普通类型
                // 生成 Activity类文件，(Java代码输出目录，资源输出目录，命名空间，应用程序包名，配置文件)
                def list = JunkUtil.generateActivity(javaDir, resDir, getNamespace().get(), packageName, config)
                activityList.addAll(list)
                // 生成其他类文件
                JunkUtil.generateJava(javaDir, packageName, config)
                packageList.add(packageName)
            }
            //生成混淆文件
            JunkUtil.generateProguard(getProguardOutputFile().get().asFile, packageList)
        }
        if (config.resGenerator) {
            config.resGenerator.execute(resOutDir)
        } else {
            JunkUtil.generateDrawableFiles(resDir, config)
            JunkUtil.generateStringsFile(resDir, config)
            JunkUtil.generateKeep(resDir, config)
        }
        if (config.manifestGenerator) {
            config.manifestGenerator.execute(getManifestOutputFile().get().asFile)
        } else {
            JunkUtil.generateManifest(getManifestOutputFile().get().asFile, activityList)
        }
    }
}