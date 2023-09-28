package cn.hx.plugin.junkcode.utils

import cn.hx.plugin.junkcode.ext.JunkCodeConfig
import cn.hx.plugin.junkcode.template.ResTemplate
import com.squareup.javapoet.ClassName
import com.squareup.javapoet.JavaFile
import com.squareup.javapoet.MethodSpec
import com.squareup.javapoet.TypeSpec
import org.gradle.api.Project


import javax.lang.model.element.Modifier
import java.nio.file.Files
import java.nio.file.Path
import java.util.logging.Logger

class JunkUtil {

    static random = new Random()

    static abc = "abcdefghijklmnopqrstuvwxyz".toCharArray()
    static color = "0123456789abcdef".toCharArray()
    static List<String> stringList = new ArrayList<>()
    static List<String> stringNameList = new ArrayList<>()
    static List<String> otherClassNameList = new ArrayList<>()
    static List<String> otherPackageNameList = new ArrayList<>()
    static List<String> otherClassMethodsNameList = new ArrayList<>()
    static Map<String, List<String>> otherClassMethodsAccessMap = new HashMap<String, List<String>>()
    // 包名 + 类名，方法名
    static Map<String, List<String>> otherAllPathMap = new HashMap<String, List<String>>()


    // 随机生成一个名称
    static String generateName(int index) {
        def sb = new StringBuilder()
        for (i in 0..4) {
            sb.append(abc[random.nextInt(abc.size())])
        }
        int temp = index
        while (temp >= 0) {
            sb.append(abc[temp % abc.size()])
            temp = temp / abc.size()
            if (temp == 0) {
                temp = -1
            }
        }
        sb.append(index.toString())
        return sb.toString()
    }


    // 生成随机方法
    static void generateMethods(MethodSpec.Builder methodBuilder, Boolean isLoad) {
        def str = "logg"
        def fullName = "cn.hx.plugin.junkcode.utils.Utils"
        List values = new ArrayList<>()
        def sdk = "cn.hx.plugin.junkcode.utils.Utils"
        def isSDK = false
        def sdkStr = "logg"
        if (otherPackageNameList.size() > 1 && otherClassNameList.size() > 1) {
            // todo: ClassName.get() 可以导入尚未存在的类
            fullName = ClassName.get("${otherPackageNameList.get(1)}", "${otherClassNameList.get(1)}")
            isSDK = CoonUtil.fetchSDK(otherPackageNameList, otherClassNameList)
            if (isSDK) {
                sdk = ClassName.get("${otherPackageNameList.get(1)}", "${otherClassNameList.get(1)}")
            } else {
                sdk = ClassName.get(Utils.class)
            }
            if (otherClassMethodsAccessMap.get(otherClassNameList.get(1)) != null && otherClassMethodsAccessMap.get(otherClassNameList.get(1)).size() > 0) {
//            if (otherClassMethodsAccessMap.get(otherClassNameList.first())!= null && otherClassMethodsAccessMap.get(otherClassNameList.first()).size() >0) {
                values = otherClassMethodsAccessMap.get(otherClassNameList.get(1))
                if (values != null && !values.isEmpty() && values.size() > 0) {
                    String firstValue = values.get(0)
                    values.remove(0)
                    str = firstValue
                    if (!isSDK) {
                        sdkStr = "logg"
                    } else {
                        sdkStr = firstValue
                    }
                } else {
                    String firstValue = values.get(0)
                    str = firstValue
                    if (!isSDK) {
                        sdkStr = "logg"
                    } else {
                        sdkStr = firstValue
                    }
                }
            }
        } else {
            fullName = ClassName.get(Utils.class)
        }

        if (str == "logg") {
            fullName = ClassName.get(Utils.class)
        }
        if (fullName == ClassName.get(Utils.class)) {
            str = "logg"
        }
        MethodsUtil.generateR(methodBuilder, str, fullName, isLoad, otherAllPathMap )
    }


    // 生成 Activity 随机方法
//    static void generateActivityMethods(MethodSpec.Builder methodBuilder) {
//        MethodsUtil.generateR(methodBuilder, str, fullName)
//    }



    // 生成activity
    static List<String> generateActivity(File javaDir, File resDir, String namespace, String packageName, JunkCodeConfig config) {
        otherPackageNameList.add(0, packageName)
        def activityList = new ArrayList()
        // gradle 中指定生成多少个 activity
        for (int i = 0; i < config.activityCountPerPackage; i++) {
            def className
            def layoutName
            if (config.activityCreator) {
                def activityNameBuilder = new StringBuilder()
//                def activityNameBuilder = getRandomActivityName(i)
                def layoutNameBuilder = new StringBuilder()
                def layoutContentBuilder = new StringBuilder()
//                config.activityCreator.execute(new Tuple4(i, getRandomActivityName(i), layoutNameBuilder, layoutContentBuilder))
                config.activityCreator.execute(new Tuple4(i, activityNameBuilder, layoutNameBuilder, layoutContentBuilder))
                className = activityNameBuilder.toString()
                layoutName = layoutNameBuilder.toString()
                writeStringToFile(new File(resDir, "layout/${layoutName}.xml"), layoutContentBuilder.toString())
            } else {
//                def activityPreName = generateName(i)
                // todo：从固有列表中随机获取任意一个 Activity 名称
                def activityPreName = CoonUtil.getRandomActivityName(i)
                // activityPreName.capitalize() 将首字母大写  再拼接 Activity
                className = activityPreName.capitalize() + "Activity"
                layoutName = "${config.resPrefix.toLowerCase()}${packageName.replace(".", "_")}_activity_${activityPreName}"
                generateLayout(resDir, layoutName, config)
            }
            if (!config.excludeActivityJavaFile) {
                // todo: 保存activity的类名
                otherClassNameList.add(0, className)
                def typeBuilder = TypeSpec.classBuilder(className)
                // todo:   activity的继承父类更改为AppCompatActivity
//                typeBuilder.superclass(ClassName.get("android.app", "Activity"))
                typeBuilder.superclass(ClassName.get("androidx.appcompat.app", "AppCompatActivity"))
                typeBuilder.addModifiers(Modifier.PUBLIC)
                if (config.typeGenerator) {
                    config.typeGenerator.execute(typeBuilder)
                } else {
                    // 下一个方法，对之前的数据进行清理
                    stringNameList.clear()
                    stringList.clear()
                    // gradle 中指定生成多少个 methods
                    for (int j = 0; j < config.methodCountPerClass; j++) {
                        def methodName
                        if (config.methodNameCreator) {
                            def methodNameBuilder = new StringBuilder()
                            config.methodNameCreator.execute(new Tuple2(j, methodNameBuilder))
                            methodName = methodNameBuilder.toString()
                        } else {
//                            methodName = generateRandomMethodsName(j)
                            methodName = generateName(j)
                        }

                        stringNameList.add(methodName)
                        def methodBuilder = MethodSpec.methodBuilder(methodName)
                        if (config.methodGenerator) {
                            config.methodGenerator.execute(methodBuilder)
                        } else {
                            generateMethods(methodBuilder, false)
//                            generateActivityMethods(methodBuilder)
                        }
                        typeBuilder.addMethod(methodBuilder.build())

                        // 只添加没有参数的方法，且将新添加的数据放在首位
                        if (methodBuilder.build().parameters.size() == 0) {
                            stringList.add(methodBuilder.build().name)
                            otherClassMethodsNameList.add(0,methodBuilder.build().name)
                            if (otherClassMethodsAccessMap.containsKey(className)) {
                                otherClassMethodsAccessMap.get(className).add(methodBuilder.build().name)
                            } else {
                                List<String> values = new ArrayList<String>()
                                values.add(methodBuilder.build().name)
                                otherClassMethodsAccessMap.put(className, values)
                            }


                            def allPath = "${otherPackageNameList.get(0)}.${otherClassNameList.get(0)}"
                            if (otherAllPathMap.containsKey(allPath)) {
                                otherAllPathMap.get(allPath).add(methodBuilder.build().name)
                            } else {
                                List<String> values = otherAllPathMap.getOrDefault(allPath, new ArrayList<>());
                                values.add(methodBuilder.build().name)
                                otherAllPathMap.put(allPath.toString(), values)
                            }
                        }
                    }
                }

                // 定义回调函数
                def bundleClassName = ClassName.get("android.os", "Bundle")
                MethodsUtil.generateActivityRandom(typeBuilder, bundleClassName, layoutName, namespace, stringList)
                MethodsUtil.generateActivityRandom1(typeBuilder, bundleClassName, layoutName, namespace, stringList)
                MethodsUtil.generateActivityRandom2(typeBuilder, bundleClassName, layoutName, namespace, stringList)
                MethodsUtil.generateActivityRandom3(typeBuilder, bundleClassName, layoutName, namespace, stringList)

                def javaFile = JavaFile.builder(packageName, typeBuilder.build()).build()
                writeJavaToFile(javaDir, javaFile)
                // todo：保存activity的包名
                activityList.add(packageName + "." + className)
            }
        }
        return activityList
    }

    // 生成其他类文件
    static void generateJava(File javaDir, String packageName, JunkCodeConfig config) {
        otherPackageNameList.add(0, packageName)
        for (int i = 0; i < config.otherCountPerPackage; i++) {
            def className
            if (config.classNameCreator) {
                def classNameBuilder = new StringBuilder()
                config.classNameCreator.execute(new Tuple2(i, classNameBuilder))
                className = classNameBuilder.toString()
            } else {
                className = generateName(i).capitalize()
            }
            def typeBuilder = TypeSpec.classBuilder(className)
            otherClassNameList.add(0, className)
            if (config.typeGenerator) {
                config.typeGenerator.execute(typeBuilder)
            } else {
                typeBuilder.addModifiers(Modifier.PUBLIC)
//                otherClassMethodsNameList.clear()
                for (int j = 0; j < config.methodCountPerClass; j++) {
                    def methodName
                    if (config.methodNameCreator) {
                        def methodNameBuilder = new StringBuilder()
                        config.methodNameCreator.execute(new Tuple2(j, methodNameBuilder))
                        methodName = methodNameBuilder.toString()
                    } else {
//                        methodName = generateRandomMethodsName(j)
                        methodName = generateName(j)
                    }
                    def methodBuilder = MethodSpec.methodBuilder(methodName)
                    if (config.methodGenerator) {
                        config.methodGenerator.execute(methodBuilder)
                    } else {
                        generateMethods(methodBuilder, true)
                    }
                    typeBuilder.addMethod(methodBuilder.build())

                    // 只添加没有参数的方法，且将新添加的数据放在首位
                    if (methodBuilder.build().parameters.size() == 0) {
                        otherClassMethodsNameList.add(0,methodBuilder.build().name)
//                        otherClassMethodsAccessMap.put(className, methodBuilder.build().name)

                        if (otherClassMethodsAccessMap.containsKey(className)) {
                            otherClassMethodsAccessMap.get(className).add(methodBuilder.build().name);
                        } else {
                            List<String> values = new ArrayList<String>();
                            values.add(methodBuilder.build().name);
                            otherClassMethodsAccessMap.put(className, values);
                        }


                        def allPath = "${otherPackageNameList.get(0)}.${otherClassNameList.get(0)}"
                        if (otherAllPathMap.containsKey(allPath)) {
                            otherAllPathMap.get(allPath).add(methodBuilder.build().name)
                        } else {
//                            List<String> values = new ArrayList<String>()
                            List<String> values = otherAllPathMap.getOrDefault(allPath, new ArrayList<>())
                            values.add(methodBuilder.build().name)
                            otherAllPathMap.put(allPath.toString(), values)
                        }
                    }
//                    otherClassMethodsNameList.removeLast()
                }
            }
            def javaFile = JavaFile.builder(packageName, typeBuilder.build()).build()
            writeJavaToFile(javaDir, javaFile)
        }
    }


    // 生成 layout 文件
    static void generateLayout(File resDir, String layoutName, JunkCodeConfig config) {
        def layoutFile = new File(resDir, "layout/${layoutName}.xml")
        if (config.layoutGenerator) {
            def contentBuilder = new StringBuilder()
            config.layoutGenerator.execute(contentBuilder)
            writeStringToFile(layoutFile, contentBuilder.toString())
        } else {
            def layoutStr = String.format(ResTemplate.LAYOUT_TEMPLATE, generateId())
            writeStringToFile(layoutFile, layoutStr)
        }
    }


    // 生成 drawable
    static void generateDrawableFiles(File resDir, JunkCodeConfig config) {
        if (config.drawableGenerator) {
            def contentBuilder = new StringBuilder()
            for (int i = 0; i < config.drawableCount; i++) {
                def drawableName = "${config.resPrefix.toLowerCase()}${generateName(i)}"
                contentBuilder.setLength(0)
                config.drawableGenerator.execute(contentBuilder)
                writeStringToFile(new File(resDir, "drawable/${drawableName}.xml"), contentBuilder.toString())
            }
        } else if (config.drawableCreator) {
            def fileNameBuilder = new StringBuilder()
            def contentBuilder = new StringBuilder()
            for (int i = 0; i < config.drawableCount; i++) {
                fileNameBuilder.setLength(0)
                contentBuilder.setLength(0)
                config.drawableCreator.execute(new Tuple3(i, fileNameBuilder, contentBuilder))
                def drawableName = fileNameBuilder.toString()
                writeStringToFile(new File(resDir, "drawable/${drawableName}.xml"), contentBuilder.toString())
            }
        } else {
            for (int i = 0; i < config.drawableCount; i++) {
                def drawableName = "${config.resPrefix.toLowerCase()}${generateName(i)}"
                writeStringToFile(new File(resDir, "drawable/${drawableName}.xml"), String.format(ResTemplate.DRAWABLE, generateColor()))
            }
        }
    }


    // 生成颜色代码
    static String generateColor() {
        def sb = new StringBuilder()
        sb.append("#")
        for (i in 0..5) {
            sb.append(color[random.nextInt(color.size())])
        }
        return sb.toString()
    }

    // 生成id代码
    static String generateId() {
        def sb = new StringBuilder()
        for (i in 0..5) {
            sb.append(abc[random.nextInt(abc.size())])
        }
        return sb.toString()
    }

    // 生成 strings.xml
    static void generateStringsFile(File resDir, JunkCodeConfig config) {
        def stringFile = new File(resDir, "values/strings.xml")
        StringBuilder contentBuilder = new StringBuilder()
        StringBuilder keyBuilder = new StringBuilder()
        StringBuilder valueBuilder = new StringBuilder()
        contentBuilder.append("<resources>\n")
        for (int i = 0; i < config.stringCount; i++) {
            def key
            def value
            if (config.stringCreator) {
                keyBuilder.setLength(0)
                valueBuilder.setLength(0)
                config.stringCreator.execute(new Tuple3(i, keyBuilder, valueBuilder))
                key = keyBuilder.toString()
                value = valueBuilder.toString()
            } else {
                key = "${config.resPrefix.toLowerCase()}${generateName(i)}"
                value = generateName(i)
            }
            contentBuilder.append("<string name=\"${key}\">${value}</string>\n")
        }
        contentBuilder.append("</resources>\n")
        writeStringToFile(stringFile, contentBuilder.toString())
    }

    /**
     * 生成keep.xml
     * @param resDir
     * @param config
     */
    static void generateKeep(File resDir, JunkCodeConfig config) {
        def keepName
        def keepContent
        if (config.keepCreator) {
            def fileNameBuilder = new StringBuilder()
            def contentBuilder = new StringBuilder()
            config.keepCreator.execute(new Tuple2(fileNameBuilder, contentBuilder))
            keepName = fileNameBuilder.toString()
            keepContent = contentBuilder.toString()
        } else {
            if (config.resPrefix.isEmpty()) {
                return
            }
            keepName = "android_junk_code_keep"
            keepContent = "<resources xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "    tools:keep=\"@layout/${config.resPrefix}*, @drawable/${config.resPrefix}*\" />\n"
        }
        def keepFile = new File(resDir, "raw/${keepName}.xml")
        writeStringToFile(keepFile, keepContent)
    }



    // 生成AndroidManifest.xml, todo: 顺序打乱, 读取 manifest文件,然后以数组的形式来将顺序打乱
    static void generateManifest(File manifestFile, List<String> activityList) {
        StringBuilder sb = new StringBuilder()
        sb.append("<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\">\n")
//        sb.append("<uses-permission android:name=\"android.permission.INTERNET\" />\n")
        sb.append("    <application>\n")
        for (i in 0..<activityList.size()) {
            sb.append("        <activity android:name=\"${activityList.get(i)}\"  android:exported=\"false\"/>\n")
                sb.append("        <service android:name=\"${CoonUtil.generateServiceName(i)}\"  android:exported=\"false\"/>\n")
            sb.append("        <meta-data android:name=\"${CoonUtil.generateMetaDataName(i)}\"   android:value=\"${CoonUtil.generateRandomabcABC123(i)}\"/>\n")
        }
        sb.append("    </application>\n")
        sb.append("</manifest>")
        writeStringToFile(manifestFile, sb.toString())
    }


    /**
     * 生成proguard-rules.pro
     * @param manifestFile
     * @param activityList
     */
    static void generateProguard(File proguardFile, List<String> packageList) {
        StringBuilder sb = new StringBuilder()
        for (i in 0..<packageList.size()) {
            sb.append("-keep class ${packageList.get(i)}.**{*;}\n")
        }
        writeStringToFile(proguardFile, sb.toString())
    }

    /**
     * java写入文件
     * @param javaDir
     * @param javaFile
     */
    static void writeJavaToFile(File javaDir, JavaFile javaFile) {
        def outputDirectory = javaDir.toPath()
        if (!javaFile.packageName.isEmpty()) {
            for (String packageComponent : javaFile.packageName.split("\\.")) {
                outputDirectory = outputDirectory.resolve(packageComponent);
            }
            Files.createDirectories(outputDirectory);
        }
        Path outputPath = outputDirectory.resolve(javaFile.typeSpec.name + ".java");
        writeStringToFile(outputPath.toFile(), javaFile.toString())
    }

    /**
     * 字符串写入文件
     * @param file
     * @param data
     */
    static void writeStringToFile(File file, String data) {
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs()
        }
        FileWriter writer
        try {
            writer = new FileWriter(file)
            writer.write(data)
        } catch (Exception e) {
            e.printStackTrace()
        } finally {
            if (writer != null) {
                writer.close()
            }
        }
    }

    /**
     * 是否是AGP7.0.0及以上
     * @param project
     * @return
     */
    static boolean isAGP7_0_0(Project project) {
        def androidComponents = project.extensions.findByName("androidComponents")
        if (androidComponents && androidComponents.hasProperty("pluginVersion")) {
            return true
        }
        return false
    }
    /**
     * 是否是AGP7.4.0及以上
     * @param project
     * @return
     */
    static boolean isAGP7_4_0(Project project) {
        def androidComponents = project.extensions.findByName("androidComponents")
        if (androidComponents && androidComponents.hasProperty("pluginVersion") && (androidComponents.pluginVersion.major > 7 || androidComponents.pluginVersion.minor >= 4)) {
            return true
        }
        return false
    }
}