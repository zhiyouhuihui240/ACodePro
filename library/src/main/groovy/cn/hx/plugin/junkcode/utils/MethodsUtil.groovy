package cn.hx.plugin.junkcode.utils

import com.squareup.javapoet.ClassName
import com.squareup.javapoet.CodeBlock
import com.squareup.javapoet.MethodSpec
import com.squareup.javapoet.ParameterizedTypeName
import com.squareup.javapoet.TypeName
import com.squareup.javapoet.TypeSpec
import com.squareup.javapoet.TypeVariableName

import javax.lang.model.element.Modifier

class MethodsUtil {


    // 生成接口方法
    static  generateInterfaceMethods(TypeSpec.Builder interfaceBuilder){
        def list = ParameterizedTypeName.get(List.class, String.class)
        def ran1 = RandomUtil.stringRandomLength(5,20)
        def abstractMethod1 = MethodSpec.methodBuilder(ran1)
                .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                .build()
        def ran2 = RandomUtil.stringRandomLength(5,20)
        def abstractMethod2 = MethodSpec.methodBuilder(ran2)
                .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                .returns(list)
                .build()
        def ran3 = RandomUtil.stringRandomLength(5,20)
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

    // 生成一个类，其中包含一个静态方法和一个泛型方法：
    static generateStaticExtMethods(TypeSpec.Builder typeBuilder) {
        def staticMethod = MethodSpec.methodBuilder("staticMethod")
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .addParameter(TypeName.get(String.class), "message")
                .returns(void.class)
                .addStatement("\$T.out.println(message)", System.class)
                .build();

//        def T = TypeVariableName.get("T")
//        def type = T.asType() ?: Object.class // 确保类型非空
//        def castedType = TypeName.get(type)
//        def consumer = ParameterizedTypeName.get(Consumer.class, castedType.box())
//
//        def genericMethodBuilder = MethodSpec.methodBuilder("genericMethod")
//                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
//                .addTypeVariable(T)
//                .addParameter(consumer, "function")
//                .returns(void.class)
//                .addStatement("function.accept(null)")
//
//        def genericMethod = genericMethodBuilder.build()

        typeBuilder.addMethod(staticMethod)
//                .addMethod(genericMethod)
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