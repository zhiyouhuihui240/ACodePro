package cn.hx.plugin.junkcode.utils

import com.squareup.javapoet.ClassName
import com.squareup.javapoet.MethodSpec
import com.squareup.javapoet.TypeSpec

import javax.lang.model.element.Modifier


class MethodsUtil {


    static random = new Random()

    static generateR(MethodSpec.Builder methodBuilder, String str, ClassName fullName, Boolean isLoad,  HashMap<String, List<String>> otherAllPathMap) {
        getOtherPathClassName()
        switch (random.nextInt(7)) {
            case 0:
                generateRandomMethods6(methodBuilder, str, fullName, isLoad)
                break
            case 1:
                generateRandomMethods5(methodBuilder, str, fullName, isLoad)
                break
            case 2:
                generateRandomMethods4(methodBuilder, str, fullName, isLoad)
                break
            case 3:
                generateRandomMethods3(methodBuilder, str, fullName, isLoad)
                break
            case 4:
                generateRandomMethods2(methodBuilder, str, fullName, isLoad)
                break
            case 5:
                generateRandomMethods1(methodBuilder, str, fullName, isLoad, otherAllPathMap)
                break
            case 6:
                generateRandomMethods(methodBuilder, str, fullName, isLoad)
                break
            default:
                generateRandomMethods7(methodBuilder, str, fullName, isLoad)
        }
    }

    static generateRandomMethods(MethodSpec.Builder methodBuilder, String str, ClassName fullName, Boolean isLoad ){
        def str1 = "${CoonUtil.generateRandomNum()}${CoonUtil.generateRandomNum()}${CoonUtil.generateRandomNum()}"
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
//                .returns(String.class)
        if(isLoad){
            methodBuilder.addStatement("\$T.$str()", fullName)
        }
//        methodBuilder.addStatement("${ConstantKey.otherAllPathMap}")    // 只存储了一个值
    }

    static generateRandomMethods1(MethodSpec.Builder methodBuilder, String str, ClassName fullName , Boolean isLoad, HashMap<String, List<String>> otherAllPathMap) {
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        if(isLoad){
            methodBuilder.addStatement("\$T.$str()", fullName)
        }
//        methodBuilder.addStatement("$otherAllPathMap")

    }

    static generateRandomMethods2(MethodSpec.Builder methodBuilder, String str, ClassName fullName , Boolean isLoad){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
            if(isLoad){
                methodBuilder.addStatement("\$T.$str()", fullName)
            }
        if (ConstantKey.otherPathClassNameValue.toString() != "" || ConstantKey.otherPathClassNameObj != "") {
            methodBuilder.addStatement(" ${ConstantKey.otherPathClassNameValue.toString()}() , ${ ConstantKey.otherPathClassNameObj }")
//            methodBuilder.addStatement("\$T.${ConstantKey.otherPathClassNameValue.toString()}()", ConstantKey.otherPathClassNameObj)
        }
        methodBuilder.returns(void.class)
        methodBuilder.addParameter(String[].class, "args")
        methodBuilder.beginControlFlow("for (\$T arg : args)", String.class)
        methodBuilder.addStatement("\$T.out.println(arg)", System.class)
        methodBuilder.endControlFlow()
    }

    static generateRandomMethods3(MethodSpec.Builder methodBuilder, String str, ClassName fullName, Boolean isLoad ){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
            if(isLoad){
                methodBuilder.addStatement("\$T.$str()", fullName)
            }
        if (ConstantKey.otherPathClassNameValue.toString() != "" || ConstantKey.otherPathClassNameObj != "") {
            methodBuilder.addStatement(" ${ConstantKey.otherPathClassNameValue.toString()}() , ${ ConstantKey.otherPathClassNameObj }")
//            methodBuilder.addStatement("\$T.${ConstantKey.otherPathClassNameValue.toString()}()", ConstantKey.otherPathClassNameObj)
        }
        methodBuilder.returns(Date.class)
        methodBuilder.addStatement("return new \$T()", Date.class)
    }

    static generateRandomMethods4(MethodSpec.Builder methodBuilder, String str, ClassName fullName, Boolean isLoad ){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC).beginControlFlow("try")
                .addStatement("throw new Exception(\$S)", "Failed")
                .nextControlFlow("catch (\$T e)", Exception.class)
        if(isLoad){
            methodBuilder.addStatement("\$T.$str()", fullName)
        }
        if (ConstantKey.otherPathClassNameValue.toString() != "" || ConstantKey.otherPathClassNameObj != "") {
            methodBuilder.addStatement(" ${ConstantKey.otherPathClassNameValue.toString()}() , ${ ConstantKey.otherPathClassNameObj }")
//            methodBuilder.addStatement("\$T.${ConstantKey.otherPathClassNameValue.toString()}()", ConstantKey.otherPathClassNameObj)
        }
        methodBuilder.endControlFlow()
    }

    static generateRandomMethods5(MethodSpec.Builder methodBuilder, String str, ClassName fullName , Boolean isLoad){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        if(isLoad){
            methodBuilder.addStatement("\$T.$str()", fullName)
        }
        if (ConstantKey.otherPathClassNameValue.toString() != "" || ConstantKey.otherPathClassNameObj != "") {
            methodBuilder.addStatement(" ${ConstantKey.otherPathClassNameValue.toString()}() , ${ ConstantKey.otherPathClassNameObj }")
//            methodBuilder.addStatement("\$T.${ConstantKey.otherPathClassNameValue.toString()}()", ConstantKey.otherPathClassNameObj)
        }
        methodBuilder.addCode("" + "int total = 0;\n" + "for (int i = 0; i < 10; i++) {\n" + "  total += i;\n" + "}\n")

    }

    static generateRandomMethods6(MethodSpec.Builder methodBuilder, String str, ClassName fullName , Boolean isLoad){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .addStatement("long now = \$T.currentTimeMillis()", System.class)
                .beginControlFlow("if (\$T.currentTimeMillis() < now)", System.class)
                .addStatement("\$T.out.println(\$S)", System.class, "Time travelling, woo hoo!")
                .nextControlFlow("else if (\$T.currentTimeMillis() == now)", System.class)
                .addStatement("\$T.out.println(\$S)", System.class, "Time stood still!")
                .nextControlFlow("else")
                .addStatement("\$T.out.println(\$S)", System.class, "Ok, time still moving forward")
        if(isLoad){
            methodBuilder.addStatement("\$T.$str()", fullName)
        }
        if (ConstantKey.otherPathClassNameValue.toString() != "" || ConstantKey.otherPathClassNameObj != "") {
            methodBuilder.addStatement(" ${ConstantKey.otherPathClassNameValue.toString()}() , ${ ConstantKey.otherPathClassNameObj }")
//            methodBuilder.addStatement("\$T.${ConstantKey.otherPathClassNameValue.toString()}()", ConstantKey.otherPathClassNameObj)
        }
        methodBuilder.endControlFlow()
    }

    static generateRandomMethods7(MethodSpec.Builder methodBuilder, String str, ClassName fullName , Boolean isLoad){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        if(isLoad){
            methodBuilder.addStatement("\$T.$str()", fullName)
        }
        if (ConstantKey.otherPathClassNameValue.toString() != "" || ConstantKey.otherPathClassNameValue !=null || ConstantKey.otherPathClassNameObj != "") {
            methodBuilder.addStatement(" ${ConstantKey.otherPathClassNameValue.toString()}() , ${ ConstantKey.otherPathClassNameObj }")
//            methodBuilder.addStatement("\$T.${ConstantKey.otherPathClassNameValue.toString()}()", ConstantKey.otherPathClassNameObj)
        }
        methodBuilder.returns(void.class)
        methodBuilder.addParameter(String[].class, "args")
        methodBuilder.addStatement("\$T.out.println(\$S)", System.class, "Hello")
    }

    // for 循环
    static generateRandomMethods8(MethodSpec.Builder methodBuilder, String str, ClassName fullName , Boolean isLoad) {
        def randomNum = CoonUtil.generateRandomNum()
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
    static generateRandomMethods9(MethodSpec.Builder methodBuilder, String str, ClassName fullName, Boolean isLoad) {
        def randomNum = CoonUtil.generateRandomNum()

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
                .addStatement(CoonUtil.getRandomMethod(stringList))
                .addStatement(CoonUtil.getRandomMethod(stringList))
                .addStatement(CoonUtil.getRandomMethod(stringList))
                .build())
    }

    static generateActivityRandom1(TypeSpec.Builder typeBuilder, ClassName bundleClassName,String layoutName, String namespace, List<String> stringList){
        typeBuilder.addMethod(MethodSpec.methodBuilder("onResume")
                .addAnnotation(Override.class)
                .addModifiers(Modifier.PROTECTED)
                .addStatement("super.onResume()")
                .addStatement(CoonUtil.getRandomMethod(stringList))
                .addStatement(CoonUtil.getRandomMethod(stringList))
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
                .addStatement(CoonUtil.getRandomMethod(stringList))
                .build())
    }

}