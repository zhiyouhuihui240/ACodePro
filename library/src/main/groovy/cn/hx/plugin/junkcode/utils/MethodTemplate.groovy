package cn.hx.plugin.junkcode.utils

import com.squareup.javapoet.ClassName
import com.squareup.javapoet.CodeBlock
import com.squareup.javapoet.MethodSpec
import com.squareup.javapoet.ParameterizedTypeName
import com.squareup.javapoet.TypeName
import com.squareup.javapoet.TypeSpec
import com.squareup.javapoet.TypeVariableName

import javax.lang.model.element.Modifier
import java.text.DateFormat
import java.text.ParseException
import java.util.function.Consumer
import java.util.regex.Matcher
import java.util.regex.Pattern

/**
 * 方法模板
 */
class MethodTemplate {

    static random = new Random()

    static allTemplate(MethodSpec.Builder methodBuilder){
        RandomUtil.removeRandomValue()
        if ( ConstantKey.classStr == "" || ConstantKey.packageName == "" || ConstantKey.simpleName == "" || ConstantKey.packageName == "cn.hx.plugin.junkcode.utils") {
            ConstantKey.packageName = "cn.hx.plugin.junkcode.utils"
            ConstantKey.simpleName = "Utils"
            ConstantKey.classStr = "logg"
        }
        def bundleClassName = ClassName.get("${ConstantKey.packageName}", "${ConstantKey.simpleName}")
        switch (random.nextInt(27)) {
//        switch (0) {
            case 0:
                template0(methodBuilder, bundleClassName)
                break
            case 1:
                template1(methodBuilder, bundleClassName)
                break
            case 2:
                template2(methodBuilder, bundleClassName)
                break
            case 3:
                template3(methodBuilder, bundleClassName)
                break
            case 4:
                template4(methodBuilder, bundleClassName)
                break
            case 5:
                template5(methodBuilder, bundleClassName)
                break
            case 6:
                template6(methodBuilder, bundleClassName)
                break
            case 7:
                template7(methodBuilder, bundleClassName)
                break
            case 8:
                template8(methodBuilder, bundleClassName)
                break
            case 9:
                template9(methodBuilder, bundleClassName)
                break
            case 10:
                template10(methodBuilder, bundleClassName)
                break
            case 11:
                template11(methodBuilder, bundleClassName)
                break
            case 12:
                template12(methodBuilder, bundleClassName)
                break
            case 13:
                template13(methodBuilder, bundleClassName)
                break
            case 14:
                template14(methodBuilder, bundleClassName)
                break
            case 15:
                template15(methodBuilder, bundleClassName)
                break
            case 16:
                template16(methodBuilder, bundleClassName)
                break
            case 17:
                template17(methodBuilder, bundleClassName)
                break
            case 18:
                template18(methodBuilder, bundleClassName)
                break
            case 19:
                template19(methodBuilder, bundleClassName)
                break
            case 20:
                template20(methodBuilder, bundleClassName)
                break
            case 21:
                template21(methodBuilder, bundleClassName)
                break
            case 22:
                template22(methodBuilder, bundleClassName)
                break
            case 23:
                template23(methodBuilder, bundleClassName)
                break
            case 24:
                template24(methodBuilder, bundleClassName)
                break
            case 25:
                template25(methodBuilder, bundleClassName)
                break
            case 26:
                template26(methodBuilder, bundleClassName)
                break
            case 27:
                template27(methodBuilder, bundleClassName)
                break
            default:
                template(methodBuilder, bundleClassName)
        }
    }

    static template0(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        def ran = RandomUtil.intRandomNumber(1,5)
        // todo: 随机调用类成员变量
        for (int i = 0; i<ran; i++){
            RandomUtil.randomVariableName(methodBuilder)
        }
        def ranStr = RandomUtil.stringRandomChar123WithNumber(2,8)
        def ranStr1 = RandomUtil.stringRandomChar123WithNumber(2,8)
        def ranStr3 = RandomUtil.stringRandomChar123WithNumber(2,8)
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.addStatement("double $ranStr = ${RandomUtil.generateRandomNum()}")
        methodBuilder.addStatement("int $ranStr1 = ${RandomUtil.generateRandomNum()}")
        methodBuilder.beginControlFlow("while (true)")
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("\$T scanner = new \$T(\$T.in)",Scanner.class, Scanner.class, System.class)
        methodBuilder.addStatement("int $ranStr3 = scanner.nextInt()")
        methodBuilder.beginControlFlow("if ($ranStr3 == ${RandomUtil.generateRandomNum()})")
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.addStatement("break")
        methodBuilder.endControlFlow();
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("$ranStr += $ranStr3")
        methodBuilder.addStatement("$ranStr1++")
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.endControlFlow()
        methodBuilder.beginControlFlow("if ($ranStr1 == 0)")
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.endControlFlow()
    }

    static template1(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)// 添加方法体
        def ran = RandomUtil.intRandomNumber(1,5)
        for (int i = 0; i<ran; i++){
            RandomUtil.randomVariableName(methodBuilder)
        }
        def ranStr = RandomUtil.stringRandomChar123WithNumber(2,8)
        def ranStr1 = RandomUtil.stringRandomChar123WithNumber(2,8)
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.beginControlFlow("for (int $ranStr = ${RandomUtil.generateRandomNum()}; $ranStr >= 1; $ranStr--)")
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.beginControlFlow("for (int $ranStr1 = 1; $ranStr1 <= $ranStr; $ranStr1++)")
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.endControlFlow();
        methodBuilder.endControlFlow();
      }
    static template2(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)// 添加方法体
        def ran = RandomUtil.intRandomNumber(1,5)
        for (int i = 0; i<ran; i++){
            RandomUtil.randomVariableName(methodBuilder)
        }
        def ranStr =  RandomUtil.stringRandomChar123WithNumber(2,8)
        def ranStr2 =  RandomUtil.stringRandomChar123WithNumber(2,8)
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.addStatement("int $ranStr = (int) (Math.random() * 100) + 1")
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.beginControlFlow("while (true)")
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("\$T scanner = new \$T(\$T.in)",Scanner.class, Scanner.class, System.class)
        methodBuilder.addStatement("\$T $ranStr2 = ${RandomUtil.intRandomNumber(3,10000)}", int.class)
//        methodBuilder.addStatement("int $ranStr2 = ranStr1.nextInt()")
        methodBuilder.beginControlFlow("if ($ranStr2 == $ranStr)")
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.addStatement("break")
        methodBuilder.endControlFlow()
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        RandomMethods.methodsMinFragment(methodBuilder)
//        methodBuilder.addStatement("String hint = $ranStr2 < $ranStr ? \$S : \$S", "${RandomUtil.generateRandomabcABC123()}", "${RandomUtil.generateRandomabcABC123()}")
        methodBuilder.endControlFlow()
    }

    static template3(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        def ran = RandomUtil.intRandomNumber(1,5)
        for (int i = 0; i<ran; i++){
            RandomUtil.randomVariableName(methodBuilder)
        }
        def ranStr2 = RandomUtil.stringRandomChar123WithNumber(2,8)
        def ranStr3 = RandomUtil.stringRandomChar123WithNumber(2,8)
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.addStatement("String ranStr = \$S", "${RandomUtil.stringRandomChar123WithNumber(5,88)}")
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("String str = \$S", "");
        methodBuilder.beginControlFlow("for (int $ranStr2 = 0; $ranStr2 < ranStr.length(); $ranStr2++)");
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("char $ranStr3 = ranStr.charAt($ranStr2)")
        methodBuilder.beginControlFlow("if (str.indexOf($ranStr3) == -1)");
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("str += $ranStr3");
        methodBuilder.endControlFlow();
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.endControlFlow();
    }

    static template4(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        def dataObj = ClassName.get("java.util","Date")
        // 1970-01-01
        def a = RandomUtil.intRandomNumber(1,8)
        def b = RandomUtil.generateRandomNum()
        def c = RandomUtil.generateRandomNum()
        def d = RandomUtil.generateRandomNum()
        def f = RandomUtil.generateRandomNum()
        def g = RandomUtil.generateRandomNum()
        def h = RandomUtil.generateRandomNum()
        def ii = RandomUtil.generateRandomNum()
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)// 添加方法体
        def ran = RandomUtil.intRandomNumber(1,5)
        for (int i = 0; i<ran; i++){
            RandomUtil.randomVariableName(methodBuilder)
        }
        def ranStr1 = RandomUtil.stringRandomChar123WithNumber(2,8)
        def ranStr3 = RandomUtil.stringRandomChar123WithNumber(2,8)
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.returns(Boolean.class)
        methodBuilder.addStatement("\$T data = \$T.getInstance()", DateFormat.class, DateFormat.class);
        methodBuilder.addStatement("String $ranStr1 = \"$a$b$c$d-$f$g-$h$ii\"")
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("\$T ranStr2 = null", dataObj)
        methodBuilder.beginControlFlow("try")
        methodBuilder.addStatement("ranStr2 = data.parse($ranStr1)")
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.endControlFlow();
        methodBuilder.beginControlFlow("catch (\$T e)", ParseException.class)
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("e.printStackTrace()");
        methodBuilder.endControlFlow();
        methodBuilder.addStatement("int $ranStr3 = ranStr2.getDay()");
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.beginControlFlow("if ($ranStr3 == 0 || $ranStr3 == 6)");
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("return true");
        methodBuilder.endControlFlow();
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.addStatement("return false");
    }
    static template5(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)// 添加方法体
        def ran = RandomUtil.intRandomNumber(1,5)
        for (int i = 0; i<ran; i++){
            RandomUtil.randomVariableName(methodBuilder)
        }
        def ranStr = RandomUtil.stringRandomChar123WithNumber(2,8)
        def ranStr2 = RandomUtil.stringRandomChar123WithNumber(2,8)
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.returns(List.class)
        methodBuilder.addStatement("\$T list = new \$T<\$T>()", List.class, ArrayList.class, String.class);
        methodBuilder.addStatement("list.add(\$S)", "${RandomUtil.stringRandomChar123WithNumber(2,16)}");
        methodBuilder.addStatement("list.add(\$S)", "${RandomUtil.stringRandomChar123WithNumber(2,32)}");
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("list.add(\$S)", "${RandomUtil.stringRandomChar123WithNumber(2,48)}");
        methodBuilder.addStatement("list.add(\$S)", "${RandomUtil.stringRandomChar123WithNumber(2,56)}");
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("\$T $ranStr = new \$T<\$T>(list)", Set.class, HashSet.class, String.class)
        methodBuilder.addStatement("\$T $ranStr2 = new \$T($ranStr)", List.class, ArrayList.class)
        methodBuilder.addStatement("return $ranStr2")
    }







    static template6(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)// 添加方法体
        def ran = RandomUtil.intRandomNumber(1,5)
        for (int i = 0; i<ran; i++){
            RandomUtil.randomVariableName(methodBuilder)
        }
        def ranStr2 = RandomUtil.stringRandomChar123WithNumber(2,8)
        def ranStr3 = RandomUtil.stringRandomChar123WithNumber(2,8)
        def ranStr4 = RandomUtil.stringRandomChar123WithNumber(2,8)
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.addStatement("int[][] ranStr = new int[][]{{${RandomUtil.intRandomNumber(3,56)}, ${RandomUtil.intRandomNumber(3,56)}," +
                " ${RandomUtil.intRandomNumber(3,56)}}, {${RandomUtil.intRandomNumber(3,56)}, ${RandomUtil.intRandomNumber(3,56)}," +
                " ${RandomUtil.intRandomNumber(3,56)}}, {${RandomUtil.intRandomNumber(3,56)}, ${RandomUtil.intRandomNumber(3,56)}, ${RandomUtil.intRandomNumber(3,56)}}}");
        methodBuilder.addStatement("int ranStr1 = ranStr.length")
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("\$T size = ${RandomUtil.intRandomNumber(2,500)}", int.class)
        methodBuilder.beginControlFlow("for (int $ranStr2 = 0; $ranStr2 < size; $ranStr2++)");
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.beginControlFlow("for (int $ranStr3 = $ranStr2 + 1; $ranStr3 < size; $ranStr3++)");
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("int $ranStr4 = ranStr[$ranStr2][$ranStr3]")
        methodBuilder.addStatement("ranStr[$ranStr2][$ranStr3] = ranStr[$ranStr3][$ranStr2]");
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.endControlFlow();
        methodBuilder.endControlFlow();
    }
    static template7(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        def a = RandomUtil.intRandomNumber(1,8)
        def b = RandomUtil.generateRandomNum()
        def c = RandomUtil.generateRandomNum()
        def d = RandomUtil.generateRandomNum()
        def f = RandomUtil.generateRandomNum()
        def g = RandomUtil.generateRandomNum()
        def h = RandomUtil.generateRandomNum()
        def ii = RandomUtil.generateRandomNum()
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        def ran = RandomUtil.intRandomNumber(1,5)
        for (int i = 0; i<ran; i++){
            RandomUtil.randomVariableName(methodBuilder)
        }
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.returns(Boolean.class)
        methodBuilder.addStatement("String pattern = \$S", "\\d{3}-\\d{2}-\\d{4}");
        methodBuilder.addStatement("String input = \$S", "$b$c$d-$a$f-$h$ii$g");
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("\$T p = \$T.compile(pattern)", Pattern.class, Pattern.class);
        methodBuilder.addStatement("\$T m = p.matcher(input)", Matcher.class);
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("return m.matches()");
    }
    static template8(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)// 添加方法体
        def ran = RandomUtil.intRandomNumber(1,5)
        for (int i = 0; i<ran; i++){
            RandomUtil.randomVariableName(methodBuilder)
        }
        def ranStr = RandomUtil.stringRandomChar123WithNumber(2,8)
        def ranStr1 = RandomUtil.stringRandomChar123WithNumber(2,8)
        def ranStr2 = RandomUtil.stringRandomChar123WithNumber(2,8)
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.returns(Integer.class)
        methodBuilder.addStatement("int $ranStr2 = ${RandomUtil.intRandomNumber(3,66)}");
        methodBuilder.addStatement("int $ranStr1 = ${RandomUtil.intRandomNumber(3,88)}")
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.beginControlFlow("for (int $ranStr = 1; $ranStr <= $ranStr2; $ranStr++)")
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("$ranStr1 *= $ranStr")
        methodBuilder.endControlFlow()
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("return $ranStr1")
    }
    static template9(MethodSpec.Builder methodBuilder, ClassName bundleClassName){    // 添加方法体
        TypeName map = ParameterizedTypeName.get(Map.class, String.class, Integer.class) // 指定Map的键值类型
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        def ran = RandomUtil.intRandomNumber(1,5)
        for (int i = 0; i<ran; i++){
            RandomUtil.randomVariableName(methodBuilder)
        }
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
                .returns(map)
//                .addCode("Map<String, Integer> map = new HashMap<>();\nmap.put(\"test1\", 1);\nmap.put(\"test2\", 2);\nreturn map;")
        methodBuilder.addStatement("Map<String, Integer> map = new \$T<>()", HashMap.class)
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("map.put(\"${RandomUtil.stringRandomChar123WithNumber(3,25)}\", ${RandomUtil.intRandomNumber(3,1000)})")
        methodBuilder.addStatement("map.put(\"${RandomUtil.stringRandomChar123WithNumber(5,35)}\", ${RandomUtil.intRandomNumber(3,5000)})")
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("return map")
    }
    static template10(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)// 添加方法体
        def ran = RandomUtil.intRandomNumber(1,5)
        for (int i = 0; i<ran; i++){
            RandomUtil.randomVariableName(methodBuilder)
        }
        def ranStr = RandomUtil.stringRandomChar123WithNumber(2,8)
        def ranStr2 = RandomUtil.stringRandomChar123WithNumber(2,8)
        def ranStr3 = RandomUtil.stringRandomChar123WithNumber(2,8)
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.returns(String.class)
        methodBuilder.addStatement("String ranStr1 = \$S", "${RandomUtil.stringRandomChar123WithNumber(8,64)}");
        methodBuilder.addStatement("String $ranStr2 = \$S", "");
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.beginControlFlow("for (int $ranStr = 0; $ranStr < ranStr1.length(); $ranStr++)");
        methodBuilder.addStatement("char ch = ranStr1.charAt($ranStr)")
        methodBuilder.addStatement("int code = (int) ch + 1")
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("$ranStr2 += (char) code")
        methodBuilder.endControlFlow()
        methodBuilder.addStatement("return $ranStr2")
    }
    static template11(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)// 添加方法体
        def ran = RandomUtil.intRandomNumber(1,5)
        for (int i = 0; i<ran; i++){
            RandomUtil.randomVariableName(methodBuilder)
        }
        def ranStr = RandomUtil.stringRandomChar123WithNumber(2,8)
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.returns(Integer.class)
        methodBuilder.addStatement("int[] arr = new int[] {${RandomUtil.generateRandomNum()}, ${RandomUtil.generateRandomNum()}, " +
                "${RandomUtil.generateRandomNum()}, ${RandomUtil.generateRandomNum()}, ${RandomUtil.generateRandomNum()}}");
        methodBuilder.addStatement("int max = arr[0]")
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.beginControlFlow("for (int $ranStr = 1; $ranStr < arr.length; $ranStr++)");
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.beginControlFlow("if (arr[$ranStr] > max)");
        methodBuilder.addStatement("max = arr[$ranStr]");
        methodBuilder.endControlFlow();
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.endControlFlow();
        methodBuilder.addStatement("return max")
    }
    static template12(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)// 添加方法体
        def ran = RandomUtil.intRandomNumber(1,5)
        for (int i = 0; i<ran; i++){
            RandomUtil.randomVariableName(methodBuilder)
        }
        def ranStr = RandomUtil.stringRandomChar123WithNumber(2,8)
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.returns(String.class)
        methodBuilder.addStatement("String result = \$S", "\"${RandomUtil.stringRandomChar123WithNumber(6,25)}\"");
        methodBuilder.beginControlFlow("for (int $ranStr = 1; $ranStr <= 5; $ranStr++)");
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("result += \$S + $ranStr", "\"${RandomUtil.stringRandomChar123WithNumber(3,12)}\"");
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.endControlFlow();
        methodBuilder.addStatement("return result");
    }
    static template13(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)// 添加方法体
        def ran = RandomUtil.intRandomNumber(1,5)
        for (int i = 0; i<ran; i++){
            RandomUtil.randomVariableName(methodBuilder)
        }
        def ranStr1 = RandomUtil.stringRandomChar123WithNumber(2,8)
        def ranStr = RandomUtil.stringRandomChar123WithNumber(2,8)
        def ranStr2 = RandomUtil.stringRandomChar123WithNumber(2,8)
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.returns(Boolean.class)
        methodBuilder.addStatement("int $ranStr1 = ${RandomUtil.intRandomNumber(3,1000)}");
        methodBuilder.beginControlFlow("if ($ranStr1 <= 1)");
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("return false");
        methodBuilder.endControlFlow();
        methodBuilder.addStatement("\$T $ranStr2 = ${RandomUtil.intRandomNumber(2,500)}", int.class)
        methodBuilder.beginControlFlow("for (int $ranStr = 2; $ranStr <= Math.sqrt($ranStr2); $ranStr++)");
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.beginControlFlow("if ($ranStr1 % $ranStr == 0)");
        methodBuilder.addStatement("return false");
        methodBuilder.endControlFlow();
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.endControlFlow();
        methodBuilder.addStatement("return true");
    }
    static template14(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)// 添加方法体
        def ran = RandomUtil.intRandomNumber(1,5)
        for (int i = 0; i<ran; i++){
            RandomUtil.randomVariableName(methodBuilder)
        }
        def ranStr = RandomUtil.stringRandomChar123WithNumber(2,8)
        def ranStr1 = RandomUtil.stringRandomChar123WithNumber(2,8)
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.addStatement("int[] arr = new int[] {${RandomUtil.intRandomNumber(3,100)}, ${RandomUtil.intRandomNumber(3,100)}, " +
                "${RandomUtil.intRandomNumber(3,100)}, ${RandomUtil.intRandomNumber(3,100)}, ${RandomUtil.intRandomNumber(3,100)}}");
        methodBuilder.beginControlFlow("for (int $ranStr = 0; $ranStr < arr.length - 1; $ranStr++)");
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.beginControlFlow("for (int $ranStr1 = 0; $ranStr1 < arr.length - $ranStr - 1; $ranStr1++)");
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.beginControlFlow("if (arr[$ranStr1] > arr[$ranStr1+1])");
        methodBuilder.addStatement("int temp = arr[$ranStr1]")
        methodBuilder.addStatement("arr[$ranStr1] = arr[$ranStr1+1]")
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("arr[$ranStr1+1] = temp");
        methodBuilder.endControlFlow();
        methodBuilder.endControlFlow();
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.endControlFlow();
    }
    static template15(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)// 添加方法体
        def ran = RandomUtil.intRandomNumber(1,5)
        for (int i = 0; i<ran; i++){
            RandomUtil.randomVariableName(methodBuilder)
        }
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.returns(Boolean.class)
        methodBuilder.addStatement("int[] arr = new int[] {${RandomUtil.intRandomNumber(3,100)}, ${RandomUtil.intRandomNumber(3,100)}" +
                ", ${RandomUtil.intRandomNumber(3,100)}, ${RandomUtil.intRandomNumber(3,100)}, ${RandomUtil.intRandomNumber(3,100)}, " +
                "${RandomUtil.intRandomNumber(3,100)}, ${RandomUtil.intRandomNumber(3,100)}, ${RandomUtil.intRandomNumber(3,100)}}");
        methodBuilder.addStatement("int target = ${RandomUtil.intRandomNumber(3,100)}");
        methodBuilder.addStatement("int left = 0");
        methodBuilder.addStatement("int right = arr.length - 1");
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.beginControlFlow("while (left <= right)");
        methodBuilder.addStatement("int mid = (left + right) / 2");
        methodBuilder.beginControlFlow("if (arr[mid] == target)");
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("return true");
        methodBuilder.endControlFlow();
        methodBuilder.beginControlFlow("else if (arr[mid] > target)");
        methodBuilder.addStatement("right = mid - 1");
        methodBuilder.endControlFlow();
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.endControlFlow();
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("return true");
    }
















    static template16(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)// 添加方法体
        def ran = RandomUtil.intRandomNumber(1,5)
        for (int i = 0; i<ran; i++){
            RandomUtil.randomVariableName(methodBuilder)
        }
        def ranStr = RandomUtil.stringRandomChar123WithNumber(2,8)
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.addStatement("int size = ${RandomUtil.intRandomNumber(3,100)}");
        methodBuilder.addStatement("int fact = ${RandomUtil.intRandomNumber(3,100)}");
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.beginControlFlow("for (int $ranStr = 1; $ranStr <= size; $ranStr++)");
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("fact *= $ranStr");
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.endControlFlow();
    }
    static template17(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)// 添加方法体
        def ran = RandomUtil.intRandomNumber(1,5)
        for (int i = 0; i<ran; i++){
            RandomUtil.randomVariableName(methodBuilder)
        }
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.returns(Integer.class)
        methodBuilder.addStatement("int n = ${RandomUtil.intRandomNumber(3,100)}");
        methodBuilder.addStatement("int prev = 0");
        methodBuilder.addStatement("int curr = 1");
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.beginControlFlow("for (int i = 2; i <= n; i++)");
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("int temp = curr");
        methodBuilder.addStatement("curr += prev");
        methodBuilder.addStatement("prev = temp");
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.endControlFlow();
        methodBuilder.addStatement("return curr");
    }
    static template18(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        def ran = RandomUtil.intRandomNumber(1,5)
        for (int i = 0; i<ran; i++){
            RandomUtil.randomVariableName(methodBuilder)
        }
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.returns(Double.class)
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("double radius = ${RandomUtil.intRandomNumber(3,100)}");
        methodBuilder.addStatement("double area = Math.PI * radius * radius");
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("return area");
    }
    static template19(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        def ran = RandomUtil.intRandomNumber(1,5)
        for (int i = 0; i<ran; i++){
            RandomUtil.randomVariableName(methodBuilder)
        }
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.returns(Integer.class)
        methodBuilder.addStatement("int length = ${RandomUtil.intRandomNumber(3,100)}");
        methodBuilder.addStatement("int width = ${RandomUtil.intRandomNumber(3,100)}");
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("int area = length * width");
        methodBuilder.addStatement("return area");
    }
    // todo: 剩余需要随机生成数据的方法
    static template20(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        def stack = ClassName.get("java.util", "Stack")
        def gson = ClassName.get("com.google.gson", "Gson")
        def jObject = ClassName.get("com.google.gson", "JsonObject")
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)// 添加方法体
        def ran = RandomUtil.intRandomNumber(1,5)
        for (int i = 0; i<ran; i++){
            RandomUtil.randomVariableName(methodBuilder)
        }
        methodBuilder.returns(String.class)
        methodBuilder.addStatement("String jsonString = \"{\\\"name\\\": \\\"Tom\\\", \\\"age\\\": 25}\"");
        methodBuilder.addStatement("\$T jsonObject = new \$T().fromJson(jsonString, \$T.class)", jObject, gson, jObject)
        methodBuilder.addStatement("String name = jsonObject.get(\"name\").getAsString()");
        methodBuilder.addStatement("int age = jsonObject.get(\"age\").getAsInt()");
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("String result = \"Name: \" + name + \", Age: \" + age");
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("return result");
    }
    static template21(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        def ran = RandomUtil.intRandomNumber(1,5)
        for (int i = 0; i<ran; i++){
            RandomUtil.randomVariableName(methodBuilder)
        }
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.returns(Double.class)
        methodBuilder.addStatement("int[] numbers = {2, 4, 6, 8, 10}");
        methodBuilder.addStatement("double total = 0");
        methodBuilder.addStatement("for (int i = 0; i < numbers.length; i++) { total += numbers[i]; }");
        methodBuilder.addStatement("double average = total / numbers.length");
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("return average");
    }
    static template22(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        def ran = RandomUtil.intRandomNumber(1,5)
        for (int i = 0; i<ran; i++){
            RandomUtil.randomVariableName(methodBuilder)
        }
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        // 添加方法体
        methodBuilder.addStatement("int[] numbers = {5, 3, 1, 4, 2}");
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("\$T.sort(numbers)", Arrays.class );
        RandomMethods.methodsMinFragment(methodBuilder)
    }
    static template23(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        def ran = RandomUtil.intRandomNumber(1,5)
        for (int i = 0; i<ran; i++){
            RandomUtil.randomVariableName(methodBuilder)
        }
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.returns(String.class)
        methodBuilder.addStatement("String str = \"hello world\"");
        methodBuilder.addStatement("char[] charArray = str.toCharArray()");
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("int left = 0, right = charArray.length - 1");
        methodBuilder.beginControlFlow("while (left < right)");
        methodBuilder.addStatement("char temp = charArray[left]");
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("charArray[left] = charArray[right]");
        methodBuilder.addStatement("charArray[right] = temp");
        methodBuilder.addStatement("left++");
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("right--");
        methodBuilder.endControlFlow();
        methodBuilder.addStatement("String reversedString = new String(charArray)");
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("return reversedString");
    }
    static template24(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        def ran = RandomUtil.intRandomNumber(1,5)
        for (int i = 0; i<ran; i++){
            RandomUtil.randomVariableName(methodBuilder)
        }
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.returns(String.class)
        methodBuilder.addStatement("String str = \"${RandomUtil.stringRandomChar123WithNumber(5,56)}\"");
        methodBuilder.addStatement("char[] charArray = str.toCharArray()");
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.beginControlFlow("for (int i = 0; i < charArray.length; i++)");
        methodBuilder.beginControlFlow("if (charArray[i] == 'l')");
        methodBuilder.addStatement("charArray[i] = 'L'");
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.endControlFlow();
        methodBuilder.endControlFlow();
        methodBuilder.addStatement("String replacedString = new String(charArray)");
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("return replacedString")
    }
    static template25(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        def n = RandomUtil.intRandomNumber(3,32)
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)// 添加方法体
        def ran = RandomUtil.intRandomNumber(1,5)
        for (int i = 0; i<ran; i++){
            RandomUtil.randomVariableName(methodBuilder)
        }
        methodBuilder.returns(Integer.class)
        methodBuilder.beginControlFlow("if ($n == 0)")
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("return 0")
        methodBuilder.endControlFlow();
        methodBuilder.beginControlFlow("if ($n == 1)")
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("return 1")
        methodBuilder.endControlFlow();
        methodBuilder.addStatement("int a = 0")
        methodBuilder.addStatement("int b = 1")
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("int c = 0")
        methodBuilder.beginControlFlow("for (int i = 2; i <= $n; i++)")
        methodBuilder.addStatement("c = a + b")
        methodBuilder.addStatement("a = b")
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("b = c")
        methodBuilder.endControlFlow()
        RandomMethods.methodsMinFragment(methodBuilder)
        // 添加方法结束语句
        methodBuilder.addStatement("return c");
    }
    static template26(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)// 添加方法体
        def ran = RandomUtil.intRandomNumber(1,5)
        for (int i = 0; i<ran; i++){
            RandomUtil.randomVariableName(methodBuilder)
        }
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.addStatement("int time = 0");
        methodBuilder.beginControlFlow("while (time < 10)")
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("int distance = time * time")
        methodBuilder.beginControlFlow("if (distance <= 100)")
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.endControlFlow()
        methodBuilder.beginControlFlow("else")
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("break")
        methodBuilder.endControlFlow()
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("time++")
        methodBuilder.endControlFlow();
    }
    static template27(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        // java.util.Stack
        def randomStr = "${RandomUtil.stringRandomChar123WithNumber(6,32)}"
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)// 添加方法体
        def ran = RandomUtil.intRandomNumber(1,5)
        for (int i = 0; i<ran; i++){
            RandomUtil.randomVariableName(methodBuilder)
        }
//        methodBuilder.addStatement("\$T[] tokens = "${RandomUtil.generateRandomabcABC()}".split(\" \")", strClass)
        methodBuilder.addStatement("\$T str = \"$randomStr\"", String.class)
        methodBuilder.addStatement("\$T[] tokens = str.split(\" \")", String.class)
        methodBuilder.addStatement("\$T<Integer> operandStack = new \$T<Integer>()", Stack.class, Stack.class)
        methodBuilder.beginControlFlow("for (String token : tokens)")
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.beginControlFlow("if (token.matches(\"\\\\d+\"))")
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("operandStack.push(Integer.parseInt(token))")
        methodBuilder.endControlFlow()
        methodBuilder.beginControlFlow("else")
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("int operand2 = operandStack.pop()")
        methodBuilder.addStatement("int operand1 = operandStack.pop()")
        methodBuilder.beginControlFlow("switch (token)")
        methodBuilder.beginControlFlow("case \"+\":")
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("operandStack.push(operand1 + operand2)")
        methodBuilder.addStatement("break")
        methodBuilder.endControlFlow()
        methodBuilder.beginControlFlow("case \"-\":")
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("operandStack.push(operand1 - operand2)")
        methodBuilder.addStatement("break")
        methodBuilder.endControlFlow()
        methodBuilder.beginControlFlow("case \"*\":")
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("operandStack.push(operand1 * operand2)")
        methodBuilder.addStatement("break")
        methodBuilder.endControlFlow()
        methodBuilder.beginControlFlow("case \"/\":")
        methodBuilder.addStatement("operandStack.push(operand1 / operand2)")
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("break")
        methodBuilder.endControlFlow()
        methodBuilder.endControlFlow()
        methodBuilder.endControlFlow()
        methodBuilder.endControlFlow()
    }



    static template(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        def ranStr = RandomUtil.stringRandomChar123WithNumber(3,8)
        def ranStr1 = RandomUtil.stringRandomChar123WithNumber(3,8)
        def ranStr2 = RandomUtil.stringRandomChar123WithNumber(3,8)
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.addStatement("\$T $ranStr = ${RandomUtil.intRandomNumber(0,20)}",int.class)
        methodBuilder.addStatement("\$T $ranStr1 = ${RandomUtil.intRandomNumber(3,50)}",int.class)
        methodBuilder.returns(Boolean.class)
        methodBuilder.beginControlFlow("if ($ranStr <= 1)")
                .addStatement("return false")
                .endControlFlow()
        methodBuilder.beginControlFlow("for (int $ranStr2 = 2; $ranStr2 * $ranStr2 <= $ranStr; $ranStr2++)")
                .beginControlFlow("if ($ranStr % $ranStr2 == 0)")
        RandomMethods.methodsMinFragment(methodBuilder)
                .addStatement("return false")
                .endControlFlow()
                .endControlFlow();
        RandomMethods.methodsMinFragment(methodBuilder)
        methodBuilder.addStatement("return true")
    }


}