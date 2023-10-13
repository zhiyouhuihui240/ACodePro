package cn.hx.plugin.junkcode.utils

import com.squareup.javapoet.ClassName
import com.squareup.javapoet.MethodSpec
import com.squareup.javapoet.ParameterizedTypeName
import com.squareup.javapoet.TypeName
import com.squareup.javapoet.TypeSpec

import javax.lang.model.element.Modifier

class MethodsUtil {


    // 生成接口方法
    static  generateInterfaceMethods(TypeSpec.Builder interfaceBuilder){
        def list = ParameterizedTypeName.get(List.class, String.class)
        def ran1 = RandomUtil.stringRandomChar(5,20)
        def abstractMethod1 = MethodSpec.methodBuilder(ran1)
                .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                .build()
        def ran2 = RandomUtil.stringRandomChar(5,20)
        def abstractMethod2 = MethodSpec.methodBuilder(ran2)
                .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                .returns(list)
                .build()
        def ran3 = RandomUtil.stringRandomChar(5,20)
        def defaultMethod = MethodSpec.methodBuilder(ran3)
                .addModifiers(Modifier.PUBLIC, Modifier.DEFAULT)
                .returns(String.class)
                .addStatement("return this.getClass().getSimpleName()")
                .build()
        interfaceBuilder.addModifiers(Modifier.PUBLIC)
                .addSuperinterface(Iterable.class)
                .addMethod(abstractMethod1)
                .addMethod(abstractMethod2)
                .addMethod(defaultMethod)
    }

//  todo: 生成 Activity 的回调函数 --------------

    static generateActivityRandom(TypeSpec.Builder typeBuilder, ClassName bundleClassName,String layoutName, String namespace, List<String> stringList){
//        typeBuilder.addMethod(MethodSpec.methodBuilder("onCreate")
//            .addAnnotation(Override.class)
//            .addModifiers(Modifier.PROTECTED)
//            .addParameter(bundleClassName, "savedInstanceState")
//            .addStatement("super.onCreate(savedInstanceState)")
//            .addStatement("setContentView(\$T.layout.${layoutName})", ClassName.get(namespace, "R"))
//            .build())
        MethodSpec.Builder methodBuilder = MethodSpec.methodBuilder("onCreate")
                .addAnnotation(Override.class)
                .addModifiers(Modifier.PROTECTED)
                .addParameter(bundleClassName, "savedInstanceState")
                .addStatement("super.onCreate(savedInstanceState)")
                .addStatement("setContentView(\$T.layout.${layoutName})", ClassName.get(namespace, "R"))
        typeBuilder = randomInvoke(methodBuilder, stringList, typeBuilder)
        typeBuilder.addMethod(methodBuilder.build())
    }

    static TypeSpec.Builder generateActivityRandom1(TypeSpec.Builder typeBuilder, ClassName bundleClassName, String layoutName, String namespace, List<String> stringList) {
        MethodSpec.Builder methodBuilder = MethodSpec.methodBuilder("onResume")
                .addAnnotation(Override.class)
                .addModifiers(Modifier.PROTECTED)
                .addStatement("super.onResume()")
        typeBuilder = randomInvoke(methodBuilder, stringList, typeBuilder)
        typeBuilder.addMethod(methodBuilder.build())
        return typeBuilder;
    }


    static generateActivityRandom2(TypeSpec.Builder typeBuilder, ClassName bundleClassName,String layoutName, String namespace, List<String> stringList){
        typeBuilder.addMethod(MethodSpec.methodBuilder("onDestroy")
            .addAnnotation(Override.class)
            .addModifiers(Modifier.PROTECTED)
            .addStatement("super.onDestroy()").build())
    }

    static generateActivityRandom3(TypeSpec.Builder typeBuilder, ClassName bundleClassName,String layoutName, String namespace, List<String> stringList){
        MethodSpec.Builder methodBuilder = MethodSpec.methodBuilder("onBackPressed")
                .addAnnotation(Override.class)
                .addModifiers(Modifier.PUBLIC)
                .addStatement("super.onBackPressed()")
        typeBuilder = randomInvoke(methodBuilder, stringList, typeBuilder)
        typeBuilder.addMethod(methodBuilder.build())
        return typeBuilder
    }


    static TypeSpec.Builder randomInvoke(MethodSpec.Builder methodBuilder, List<String> stringList, TypeSpec.Builder typeBuilder) {
        int randomGenerateVariableTypeCount = RandomUtil.intRandomNumber(0,5)
        for (int ii = 0; ii < randomGenerateVariableTypeCount; ii++) {
            RandomMethods.methodsMinFragment(methodBuilder)
        }
        int randomInt = RandomUtil.intRandomNumber(1,5)
        for (int ii = 0; ii < randomInt; ii++) {
            methodBuilder.addStatement(RandomUtil.getRandomMethod(stringList))
        }
        def ran = RandomUtil.intRandomNumber(1,5)
        // todo: 随机调用类成员变量
        for (int i = 0; i<ran; i++){
            RandomUtil.randomVariableName(methodBuilder)
        }

        return typeBuilder
    }

}