package cn.hx.plugin.junkcode.utils

import com.squareup.javapoet.ClassName
import com.squareup.javapoet.MethodSpec
import com.squareup.javapoet.TypeSpec

import javax.lang.model.element.Modifier

class MethodsUtil {

    static random = new Random()

    static generateR(MethodSpec.Builder methodBuilder, String str, ClassName fullName, Boolean isLoad,  HashMap<String, List<String>> otherAllPathMap) {
        getOtherPathClassName()
        if ( ConstantKey.otherClassNameList.size() > 3) {
            RandomUtil.removeRandomValue()
        }

        if ( ConstantKey.classStr == "" || ConstantKey.packageName == "" || ConstantKey.simpleName == "" || ConstantKey.packageName == "cn.hx.plugin.junkcode.utils") {
            ConstantKey.packageName = "cn.hx.plugin.junkcode.utils"
            ConstantKey.simpleName = "Utils"
            ConstantKey.classStr = "logg"
        }

        def log = "android.util.Log"
        switch (0) {
            case 0:
                generateRandomMethods0(methodBuilder, str, fullName, isLoad, log)
//                generateRandomMethods6(methodBuilder, str, fullName, isLoad, classObj)
                break
            case 1:
                generateRandomMethods5(methodBuilder, str, fullName, isLoad, log)
//                generateRandomMethods5(methodBuilder, str, fullName, isLoad, classObj)
                break
            case 2:
                generateRandomMethods4(methodBuilder, str, fullName, isLoad, log)
//                generateRandomMethods4(methodBuilder, str, fullName, isLoad, classObj)
                break
            case 3:
                generateRandomMethods3(methodBuilder, str, fullName, isLoad, log)
//                generateRandomMethods3(methodBuilder, str, fullName, isLoad, classObj)
                break
            case 4:
                generateRandomMethods2(methodBuilder, str, fullName, isLoad, log)
//                generateRandomMethods2(methodBuilder, str, fullName, isLoad, classObj)
                break
            case 5:
                generateRandomMethods1(methodBuilder, str, fullName, isLoad, otherAllPathMap)
//                generateRandomMethods1(methodBuilder, str, fullName, isLoad, otherAllPathMap, classObj)
                break
            case 6:
                generateRandomMethods(methodBuilder, str, fullName, isLoad, log)
                break
            default:
                generateRandomMethods(methodBuilder, str, fullName, isLoad, log)
//                generateRandomMethods8(methodBuilder, str, fullName, isLoad, classObj)
        }
    }
    
    
    static generateRandomMethods0(MethodSpec.Builder methodBuilder, String str, ClassName fullName, Boolean isLoad, log){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        def log1 = ClassName.get("android.util", "Log")
        def bundleClassName = ClassName.get("${ConstantKey.packageName}", "${ConstantKey.simpleName}")
        def str1 = ClassName.get("cn.hx.plugin.junkcode.demo", "R")
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.addStatement("\$T.out.println(\$S)", System.class, "$bundleClassName")    // 打印
        methodBuilder.addStatement("\$T.out.println(\$S)", System.class, "${ConstantKey.classObj}")    // 打印
        // 调用android项目中的字符串
//        methodBuilder.addStatement("\$T.out.println(\$T.string.yes)", System.class, ClassName.get("cn.hx.plugin.junkcode.demo", "R"))
//         methodBuilder.addStatement("\$T.\$L(\$S, \$S)", log1, "d","TAG","")
        methodBuilder.addStatement("\$T.d(\$S, String.valueOf(\$T.\$L))", log1, "TAG", str1, "string.yes")  // 打印日志
    }


    static generateRandomMethods(MethodSpec.Builder methodBuilder, String str, ClassName fullName, Boolean isLoad, log){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        def log1 = ClassName.get("android.util", "Log")
        def bundleClassName = ClassName.get("${ConstantKey.packageName}", "${ConstantKey.simpleName}")
        def str1 = ClassName.get("cn.hx.plugin.junkcode.demo", "R")
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.addStatement("\$T.out.println(\$S)", System.class, "$bundleClassName")    // 打印
        methodBuilder.addStatement("\$T.out.println(\$S)", System.class, "${ConstantKey.classObj}")    // 打印
        // 调用android项目中的字符串
//        methodBuilder.addStatement("\$T.out.println(\$T.string.yes)", System.class, ClassName.get("cn.hx.plugin.junkcode.demo", "R"))
//         methodBuilder.addStatement("\$T.\$L(\$S, \$S)", log1, "d","TAG","")
        methodBuilder.addStatement("\$T.d(\$S, String.valueOf(\$T.\$L))", log1, "TAG", str1, "string.yes")  // 打印日志
    }



    static generateRandomMethods1(MethodSpec.Builder methodBuilder, String str, ClassName fullName , Boolean isLoad, HashMap<String, List<String>> otherAllPathMap){
//    static generateRandomMethods1(MethodSpec.Builder methodBuilder, String str, ClassName fullName , Boolean isLoad, HashMap<String, List<String>> otherAllPathMap, Map.Entry<ClassName, String> classObj){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        def bundleClassName = ClassName.get("${ConstantKey.packageName}", "${ConstantKey.simpleName}")
        def log1 = ClassName.get("android.util", "Log")
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)    // 调用其他类的方法
        methodBuilder.addStatement("\$T.out.println(\$S)", System.class, "$bundleClassName")    // 打印
    }

    static generateRandomMethods2(MethodSpec.Builder methodBuilder, String str, ClassName fullName , Boolean isLoad, log){
//    static generateRandomMethods2(MethodSpec.Builder methodBuilder, String str, ClassName fullName , Boolean isLoad, Map.Entry<ClassName, String> classObj){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        def bundleClassName = ClassName.get("${ConstantKey.packageName}", "${ConstantKey.simpleName}")
        def log1 = ClassName.get("android.util", "Log")
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.addStatement("\$T.out.println(\$S)", System.class, "$bundleClassName")

        // methodBuilder.addStatement("\$T.\$L(\$S, \$S)", log1, "d","TAG","${ConstantKey.targetPath}")
//        methodBuilder.returns(Date.class)
//        methodBuilder.addStatement("return new \$T()", Date.class)
    }

    static generateRandomMethods3(MethodSpec.Builder methodBuilder, String str, ClassName fullName, Boolean isLoad, log){
//    static generateRandomMethods3(MethodSpec.Builder methodBuilder, String str, ClassName fullName, Boolean isLoad, Map.Entry<ClassName, String> classObj){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        def bundleClassName = ClassName.get("${ConstantKey.packageName}", "${ConstantKey.simpleName}")
        def log1 = ClassName.get("android.util", "Log")
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.addStatement("\$T.out.println(\$S)", System.class, "$bundleClassName")

        // methodBuilder.addStatement("\$T.\$L(\$S, \$S)", log1, "d","TAG","${ConstantKey.targetPath}")
//        methodBuilder.returns(Date.class)
//        methodBuilder.addStatement("return new \$T()", Date.class)
    }

    static generateRandomMethods4(MethodSpec.Builder methodBuilder, String str, ClassName fullName, Boolean isLoad, log){
//    static generateRandomMethods4(MethodSpec.Builder methodBuilder, String str, ClassName fullName, Boolean isLoad,  Map.Entry<ClassName, String> classObj){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC).beginControlFlow("try")
                .addStatement("throw new Exception(\$S)", "Failed")
                .nextControlFlow("catch (\$T e)", Exception.class)
        def bundleClassName = ClassName.get("${ConstantKey.packageName}", "${ConstantKey.simpleName}")
        def log1 = ClassName.get("android.util", "Log")
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.addStatement("\$T.out.println(\$S)", System.class, "$bundleClassName")

        // methodBuilder.addStatement("\$T.\$L(\$S, \$S)", log1, "d","TAG","${ConstantKey.targetPath}")
        methodBuilder.endControlFlow()
    }

    static generateRandomMethods5(MethodSpec.Builder methodBuilder, String str, ClassName fullName , Boolean isLoad, log){
//    static generateRandomMethods5(MethodSpec.Builder methodBuilder, String str, ClassName fullName , Boolean isLoad,  Map.Entry<ClassName, String> classObj){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        def bundleClassName = ClassName.get("${ConstantKey.packageName}", "${ConstantKey.simpleName}")
        def log1 = ClassName.get("android.util", "Log")
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.addStatement("\$T.out.println(\$S)", System.class, "$bundleClassName")
        // methodBuilder.addStatement("\$T.\$L(\$S, \$S)", log1, "d","TAG","${ConstantKey.targetPath}")
        methodBuilder.addCode("" + "int tewfs = 0;\n" + "for (int i = 0; i < 10; i++) {\n" + "  tewfs += i;\n" + "}\n")
    }

    static generateRandomMethods6(MethodSpec.Builder methodBuilder, String str, ClassName fullName , Boolean isLoad, log){
//    static generateRandomMethods6(MethodSpec.Builder methodBuilder, String str, ClassName fullName , Boolean isLoad,  Map.Entry<ClassName, String> classObj){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .addStatement("long now = \$T.currentTimeMillis()", System.class)
                .beginControlFlow("if (\$T.currentTimeMillis() < now)", System.class)
                .addStatement("\$T.out.println(\$S)", System.class, "Time travelling, woo hoo!")
                .nextControlFlow("else if (\$T.currentTimeMillis() == now)", System.class)
                .addStatement("\$T.out.println(\$S)", System.class, "Time stood still!")
                .nextControlFlow("else")
                .addStatement("\$T.out.println(\$S)", System.class, "Ok, time still moving forward")
        def bundleClassName = ClassName.get("${ConstantKey.packageName}", "${ConstantKey.simpleName}")
        def log1 = ClassName.get("android.util", "Log")
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.addStatement("\$T.out.println(\$S)", System.class, "$bundleClassName")

        // methodBuilder.addStatement("\$T.\$L(\$S, \$S)", log1, "d","TAG","${ConstantKey.targetPath}")
        methodBuilder.endControlFlow()
    }

    static generateRandomMethods7(MethodSpec.Builder methodBuilder, String str, ClassName fullName , Boolean isLoad, log){
//    static generateRandomMethods7(MethodSpec.Builder methodBuilder, String str, ClassName fullName , Boolean isLoad,  Map.Entry<ClassName, String> classObj){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        def bundleClassName = ClassName.get("${ConstantKey.packageName}", "${ConstantKey.simpleName}")
        def log1 = ClassName.get("android.util", "Log")
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        // methodBuilder.addStatement("\$T.\$L(\$S, \$S)", log1, "d","TAG","${ConstantKey.targetPath}")
        methodBuilder.returns(void.class)
        methodBuilder.addParameter(String[].class, "args")
        methodBuilder.addStatement("\$T.out.println(\$S)", System.class, "Hello")
    }

    // for 循环
    static generateRandomMethods8(MethodSpec.Builder methodBuilder, String str, ClassName fullName , Boolean isLoad, log){
//    static generateRandomMethods8(MethodSpec.Builder methodBuilder, String str, ClassName fullName , Boolean isLoad,  Map.Entry<ClassName, String> classObj){
        def randomNum = RandomUtil.generateRandomNum()
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        if (isLoad) {
            methodBuilder.addStatement("\$T.$str()", fullName)
        } else {
            methodBuilder.beginControlFlow("switch ($randomNum)")
            for (int i = 0; i < randomNum; i++) {
                methodBuilder.beginControlFlow("case $i:")
                methodBuilder.addStatement("// do something when random number is $i")
                methodBuilder.endControlFlow()
            }
            methodBuilder.endControlFlow()
        }
    }

    // switch 分支
    static generateRandomMethods9(MethodSpec.Builder methodBuilder, String str, ClassName fullName, Boolean isLoad,  Map.Entry<ClassName, String> classObj){
        def randomNum = RandomUtil.generateRandomNum()

//        fullName = ClassName.get("${otherPackageNameList.get(1)}", "${otherClassNameList.get(1)}")

        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        if (isLoad) {
            methodBuilder.addStatement("\$T.$str()", fullName)
        }
        else {
            methodBuilder.beginControlFlow("switch ($randomNum)")
            methodBuilder.addCode("case 0:\n")
            methodBuilder.addCode("  // do something for case 0\n")
            methodBuilder.addStatement("  break")

            methodBuilder.addCode("case 1:\n")
            methodBuilder.addCode("  // do something for case 1\n")
            methodBuilder.addStatement("  break")

            methodBuilder.addCode("case 2:\n")
            methodBuilder.addCode("  // do something for case 2\n")
            methodBuilder.addStatement("  break")

            methodBuilder.addCode("case 3:\n")
            methodBuilder.addCode("  // do something for case 3\n")
            methodBuilder.addStatement("  break")

            methodBuilder.addCode("case 4:\n")
            methodBuilder.addCode("  // do something for case 4\n")
            methodBuilder.addStatement("  break")

            methodBuilder.addCode("case 5:\n")
            methodBuilder.addCode("  // do something for case 5\n")
            methodBuilder.addStatement("  break")

            methodBuilder.addCode("case 6:\n")
            methodBuilder.addCode("  // do something for case 6\n")
            methodBuilder.addStatement("  break")

            methodBuilder.addCode("case 7:\n")
            methodBuilder.addCode("  // do something for case 7\n")
            methodBuilder.addStatement("  break")

            methodBuilder.addCode("case 8:\n")
            methodBuilder.addCode("  // do something for case 8\n")
            methodBuilder.addStatement("  break")

            methodBuilder.addCode("case 9:\n")
            methodBuilder.addCode("  // do something for case 9\n")
            methodBuilder.addStatement("  break")

            methodBuilder.endControlFlow()
        }
    }

    static getOtherPathClassName() {
        def map = ConstantKey.getOtherAllPathMap()
        if (map.size() > 0) {
            int index = new Random().nextInt(map.size())
            def randomEntry = map.entrySet().toArray()[index]
            def key = randomEntry.key // 获取Key值
            ConstantKey.otherPathClassNameValue = randomEntry.value // 获取Value值
            def parts = key.split("\\.")
            // 使用split方法对 key值进行分割，"com.google.android.gms.ads.identifier.XdBEtwP"
            def part1 = parts[0..(parts.size() - 2)].join(".") // 按照"."进行分割后，将第1个到倒数第2个子串拼接起来得到part1
            def part2 = parts[-1] // 获取最后一个子串作为part2
            ConstantKey.otherPathClassNameObj = ClassName.get("${part1}", "${part2}")
        }
    }

//  todo: 生成 Activity 的回调函数 --------------

    static generateActivityRandom(TypeSpec.Builder typeBuilder, ClassName bundleClassName,String layoutName, String namespace, List<String> stringList){

        typeBuilder.addMethod(MethodSpec.methodBuilder("onCreate")
                .addAnnotation(Override.class)
                .addModifiers(Modifier.PROTECTED)
                .addParameter(bundleClassName, "savedInstanceState")
                .addStatement("super.onCreate(savedInstanceState)")
                .addStatement("setContentView(\$T.layout.${layoutName})", ClassName.get(namespace, "R"))
                .addStatement(RandomUtil.getRandomMethod(stringList))
                .addStatement(RandomUtil.getRandomMethod(stringList))
                .addStatement(RandomUtil.getRandomMethod(stringList))
                .build())
    }

    static generateActivityRandom1(TypeSpec.Builder typeBuilder, ClassName bundleClassName,String layoutName, String namespace, List<String> stringList){
        typeBuilder.addMethod(MethodSpec.methodBuilder("onResume")
                .addAnnotation(Override.class)
                .addModifiers(Modifier.PROTECTED)
                .addStatement("super.onResume()")
                .addStatement(RandomUtil.getRandomMethod(stringList))
                .addStatement(RandomUtil.getRandomMethod(stringList))
                .build())
    }

    static generateActivityRandom2(TypeSpec.Builder typeBuilder, ClassName bundleClassName,String layoutName, String namespace, List<String> stringList){
        typeBuilder.addMethod(MethodSpec.methodBuilder("onDestroy")
                .addAnnotation(Override.class)
                .addModifiers(Modifier.PROTECTED)
                .addStatement("super.onDestroy()")
                .build())
    }

    static generateActivityRandom3(TypeSpec.Builder typeBuilder, ClassName bundleClassName,String layoutName, String namespace, List<String> stringList){
        typeBuilder.addMethod(MethodSpec.methodBuilder("onBackPressed")
                .addAnnotation(Override.class)
                .addModifiers(Modifier.PUBLIC)
                .addStatement("super.onBackPressed()")
                .addStatement(RandomUtil.getRandomMethod(stringList))
                .build())
    }


}