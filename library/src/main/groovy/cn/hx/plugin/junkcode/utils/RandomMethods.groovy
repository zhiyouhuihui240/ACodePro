package cn.hx.plugin.junkcode.utils

import com.squareup.javapoet.ClassName
import com.squareup.javapoet.MethodSpec

import javax.lang.model.element.Modifier

/**
 * 随机生成函数方法
 */
class RandomMethods {

    static randomMethods(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        def ran1 = RandomUtil.intRandomNumber(1,5)
        // todo: 随机调用类成员变量
        for (int i = 0; i<ran1; i++){
            RandomUtil.randomVariableName(methodBuilder)
        }
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        def ran = RandomUtil.intRandomNumber(0,16)
        switch (ran) {
            case 0:
                randomMethods0(methodBuilder)
                break
            case 1:
                randomMethods1(methodBuilder)
                break
            case 2:
                randomMethods2(methodBuilder)
                break
            case 3:
                randomMethods3(methodBuilder)
                break
            case 4:
                randomMethods4(methodBuilder)
                break
            case 5:
                randomMethods5(methodBuilder)
                break
            case 6:
                randomMethods6(methodBuilder)
                break
            case 7:
                randomMethods7(methodBuilder)
                break
            case 8:
                randomMethods8(methodBuilder)
                break
            case 9:
                randomMethods9(methodBuilder)
                break
            case 10:
                randomMethods10(methodBuilder)
                break
            case 11:
                randomMethods11(methodBuilder)
                break
            case 12:
                randomMethods12(methodBuilder)
                break
            case 13:
                randomMethods13(methodBuilder)
                break
            case 14:
                randomMethods14(methodBuilder)
                break
            case 15:
                randomMethods15(methodBuilder)
                break
            default:
                randomMethods16(methodBuilder)
        }
    }

    static randomMethods0(methodBuilder) {
        // while(true){ ... }
        methodBuilder.beginControlFlow("while (true)")
        methodsFragment(methodBuilder)
        methodBuilder.endControlFlow()
    }
    static randomMethods1(methodBuilder) {
        methodBuilder
    }
    static randomMethods2(methodBuilder) {

    }
    static randomMethods3(methodBuilder) {

    }
    static randomMethods4(methodBuilder) {

    }
    static randomMethods5(methodBuilder) {

    }
    static randomMethods6(methodBuilder) {

    }
    static randomMethods7(methodBuilder) {

    }
    static randomMethods8(methodBuilder) {

    }
    static randomMethods9(methodBuilder) {

    }
    static randomMethods10(methodBuilder) {

    }
    static randomMethods11(methodBuilder) {

    }
    static randomMethods12(methodBuilder) {

    }
    static randomMethods13(methodBuilder) {

    }
    static randomMethods14(methodBuilder) {

    }
    static randomMethods15(methodBuilder) {

    }
    static randomMethods16(methodBuilder) {

    }


    static methodsFragment(MethodSpec.Builder methodBuilder){
        def ran = RandomUtil.intRandomNumber(0,16)
        switch (ran) {
            case 0:
                methodsFragment0(methodBuilder)
                break
            case 1:
                methodsFragment1(methodBuilder)
                break
            case 2:
                methodsFragment2(methodBuilder)
                break
            case 3:
                methodsFragment3(methodBuilder)
                break
            case 4:
                methodsFragment4(methodBuilder)
                break
            case 5:
                methodsFragment5(methodBuilder)
                break
            case 6:
                methodsFragment6(methodBuilder)
                break
            case 7:
                methodsFragment7(methodBuilder)
                break
            case 8:
                methodsFragment8(methodBuilder)
                break
            case 9:
                methodsFragment9(methodBuilder)
                break
            case 10:
                methodsFragment10(methodBuilder)
                break
            case 11:
                methodsFragment11(methodBuilder)
                break
            case 12:
                methodsFragment12(methodBuilder)
                break
            case 13:
                methodsFragment13(methodBuilder)
                break
            case 14:
                methodsFragment14(methodBuilder)
                break
            case 15:
                methodsFragment15(methodBuilder)
                break
            default:
                methodsFragment16(methodBuilder)
        }
    }



    static methodsFragment0(methodBuilder) {
        /*
            double sum = 1.0d;
            int count = 4;
            Scanner scanner = new Scanner(System.in);
            int guess = scanner.nextInt();
            if (guess != 7) { methodsSubFragment(methodBuilder) }
            else { methodsSubFragment(methodBuilder) }
            // todo: 还可继续添加内容
         */
        def sum = RandomUtil.stringRandomChar123WithNumber(3,6)
        def count = RandomUtil.stringRandomChar123WithNumber(3,6)
        def guess = RandomUtil.stringRandomChar123WithNumber(3,6)
        // todo: 随机生成一些局部变量
        def ranNum = RandomUtil.intRandomNumber(0,6)
        def ranType = RandomUtil.randomVariableType()
        for (int i =0; i< ranNum; i++) {
            methodBuilder.addStatement("$ranType ${RandomUtil.stringRandomChar123WithNumber(3,8)};")
        }

        methodBuilder.addStatement("double $sum = ${RandomUtil.generateRandomNum()}")
        methodBuilder.addStatement("int $count = ${RandomUtil.generateRandomNum()}")
        methodBuilder.addStatement("\$T scanner = new \$T(\$T.in)",Scanner.class, Scanner.class, System.class)
        methodBuilder.addStatement("int $guess = scanner.nextInt()")
        methodBuilder.beginControlFlow("if ($guess == ${RandomUtil.generateRandomNum()})")
        methodBuilder.endControlFlow()
        methodBuilder.endControlFlow()
        // todo: 还可继续添加内容
    }

    static methodsFragment1(methodBuilder) {

    }
    static methodsFragment2(methodBuilder) {

    }
    static methodsFragment3(methodBuilder) {

    }
    static methodsFragment4(methodBuilder) {

    }
    static methodsFragment5(methodBuilder) {

    }
    static methodsFragment6(methodBuilder) {

    }
    static methodsFragment7(methodBuilder) {

    }
    static methodsFragment8(methodBuilder) {

    }
    static methodsFragment9(methodBuilder) {

    }
    static methodsFragment10(methodBuilder) {

    }
    static methodsFragment11(methodBuilder) {

    }
    static methodsFragment12(methodBuilder) {

    }
    static methodsFragment13(methodBuilder) {

    }
    static methodsFragment14(methodBuilder) {

    }
    static methodsFragment15(methodBuilder) {

    }
    static methodsFragment16(methodBuilder) {

    }






    static methodsSubFragment(MethodSpec.Builder methodBuilder, String sum, String count, String scanner, String guess){
        def ran = RandomUtil.intRandomNumber(0,16)
        switch (ran) {
            case 0:
                methodsSubFragment0(methodBuilder)
                break
            case 1:
                methodsSubFragment1(methodBuilder)
                break
            case 2:
                methodsSubFragment2(methodBuilder)
                break
            case 3:
                methodsSubFragment3(methodBuilder)
                break
            case 4:
                methodsSubFragment4(methodBuilder)
                break
            case 5:
                methodsSubFragment5(methodBuilder)
                break
            case 6:
                methodsSubFragment6(methodBuilder)
                break
            case 7:
                methodsSubFragment7(methodBuilder)
                break
            case 8:
                methodsSubFragment8(methodBuilder)
                break
            case 9:
                methodsSubFragment9(methodBuilder)
                break
            case 10:
                methodsSubFragment10(methodBuilder)
                break
            case 11:
                methodsSubFragment11(methodBuilder)
                break
            case 12:
                methodsSubFragment12(methodBuilder)
                break
            case 13:
                methodsSubFragment13(methodBuilder)
                break
            case 14:
                methodsSubFragment14(methodBuilder)
                break
            case 15:
                methodsSubFragment15(methodBuilder)
                break
            default:
                methodsSubFragment16(methodBuilder)
        }
    }



    static template0(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addStatement("break")
        methodBuilder.endControlFlow()
        methodBuilder.addStatement("sum += guess")
        methodBuilder.addStatement("count++")
        methodBuilder.endControlFlow()
        methodBuilder.beginControlFlow("if (count == 0)")
        methodBuilder.endControlFlow()
    }
    static methodsSubFragment0(methodBuilder) {
        methodBuilder.addStatement("sum += guess")
        methodBuilder.addStatement("count++")
    }
    static methodsSubFragment1(methodBuilder) {

    }
    static methodsSubFragment2(methodBuilder) {

    }
    static methodsSubFragment3(methodBuilder) {

    }
    static methodsSubFragment4(methodBuilder) {

    }
    static methodsSubFragment5(methodBuilder) {

    }
    static methodsSubFragment6(methodBuilder) {

    }
    static methodsSubFragment7(methodBuilder) {

    }
    static methodsSubFragment8(methodBuilder) {

    }
    static methodsSubFragment9(methodBuilder) {

    }
    static methodsSubFragment10(methodBuilder) {

    }
    static methodsSubFragment11(methodBuilder) {

    }
    static methodsSubFragment12(methodBuilder) {

    }
    static methodsSubFragment13(methodBuilder) {

    }
    static methodsSubFragment14(methodBuilder) {

    }
    static methodsSubFragment15(methodBuilder) {

    }
    static methodsSubFragment16(methodBuilder) {

    }






    // 函数方法最小片段，放哪里都合适，需要各种随机
    static methodsMinFragment(MethodSpec.Builder methodBuilder){
        def ran = RandomUtil.intRandomNumber(0,16)
        switch (ran) {
            case 0:
                methodsMinFragment0(methodBuilder)
                break
            case 1:
                methodsMinFragment1(methodBuilder)
                break
            case 2:
                methodsMinFragment2(methodBuilder)
                break
//            case 3:
//                methodsMinFragment3(methodBuilder)
//                break
            case 4:
                methodsMinFragment4(methodBuilder)
                break
//            case 5:
//                methodsMinFragment5(methodBuilder)
//                break
            case 6:
                methodsMinFragment6(methodBuilder)
                break
////            case 7:
////                methodsMinFragment7(methodBuilder)
////                break
            case 8:
                methodsMinFragment8(methodBuilder)
                break
//            case 9:
//                methodsMinFragment9(methodBuilder)
//                break
            case 10:
                methodsMinFragment10(methodBuilder)
                break
            case 11:
                methodsMinFragment11(methodBuilder)
                break
            case 12:
                methodsMinFragment12(methodBuilder)
                break
//            case 13:
//                methodsMinFragment13(methodBuilder)
//                break
            case 14:
                methodsMinFragment14(methodBuilder)
                break
            case 15:
                methodsMinFragment15(methodBuilder)
                break
            default:
                methodsMinFragment16(methodBuilder)
        }
    }
    // 最小化，完整的的片段
    static methodsMinFragment0(methodBuilder) {
        def a = RandomUtil.stringRandomChar123WithNumber(3,8)
        def b = RandomUtil.stringRandomChar123WithNumber(3,8)
        def result = RandomUtil.stringRandomChar123WithNumber(3,8)
        methodBuilder.addStatement("int $a = ${RandomUtil.intRandomNumber(1,10000)}")
        methodBuilder.addStatement("int $b = ${RandomUtil.intRandomNumber(1,10000)}")
        methodBuilder.addStatement("int $result = Math.min($a, $b)")
    }

    static methodsMinFragment1(methodBuilder) {
        def i = RandomUtil.intRandomNumber(10,10000)
        def ranInt = RandomUtil.intRandomNumber(2,8)
        def ranStr = RandomUtil.stringRandomChar123WithNumber(2,8)
        methodBuilder.beginControlFlow("if ($i % $ranInt == 0)")
        // todo: 这里可以重新调用
        methodsMinFragment(methodBuilder)
        methodBuilder.nextControlFlow("else")
        // todo: 这里可以重新调用
        methodsMinFragment(methodBuilder)
        methodBuilder.endControlFlow()
        def ran = RandomUtil.intRandomNumber(2,22)
        methodBuilder.beginControlFlow("for (int $ranStr = 0; $ranStr < $ran; $ranStr++)")
        // todo: 这里可以重新调用
        methodsMinFragment(methodBuilder)
        methodBuilder.endControlFlow()
    }
    static methodsMinFragment2(methodBuilder) {
        def s1 = RandomUtil.stringRandomChar123WithNumber(2,8)
        def s2 = RandomUtil.stringRandomChar123WithNumber(2,8)
        def s3 = RandomUtil.stringRandomChar123WithNumber(2,8)
        methodBuilder.addStatement("\$T $s1 = \"${RandomUtil.stringRandomChar123WithNumber(2,55)} \"", String.class)
        methodBuilder.addStatement("\$T $s2 = \"${RandomUtil.stringRandomChar123WithNumber(2,55)}\"", String.class)
        methodBuilder.addStatement("\$T $s3 = \"$s1$s2\"", String.class)
    }
    static methodsMinFragment3(methodBuilder) {
        def ran = RandomUtil.intRandomNumber(5,100)
        def ranStr1 = RandomUtil.stringRandomChar123WithNumber(3,8)
        def ranStr = RandomUtil.stringRandomChar123WithNumber(3,8)
        methodBuilder.addStatement("\$T<\$T> sfdfsd = new \$T<\$T>()", ArrayList.class, Integer.class,ArrayList.class, Integer.class)
        methodBuilder.beginControlFlow("for (int $ranStr = 1; $ranStr <= $ran; $ranStr++)")
        methodBuilder.beginControlFlow("if ($ranStr % 2 == 0)")
        methodBuilder.beginControlFlow("if ($ranStr % 3 == 0)")
        methodBuilder.addStatement("sfdfsd.add($ranStr * 2)")
        methodBuilder.nextControlFlow("else")
        methodBuilder.addStatement("sfdfsd.add($ranStr)")
        // todo: 这里可以重新调用
        methodsMinFragment(methodBuilder)
        methodBuilder.endControlFlow()
        methodBuilder.endControlFlow()
        methodBuilder.beginControlFlow("for (int $ranStr1 : sfdfsd)")
                // todo: 这里可以重新调用
        methodsMinFragment(methodBuilder)
        methodBuilder.endControlFlow()
    }
    static methodsMinFragment4(methodBuilder) {
        def ran = RandomUtil.intRandomNumber(5,80)
        def ranStr = RandomUtil.stringRandomChar123WithNumber(2,8)
        def ranStr1 = RandomUtil.stringRandomChar123WithNumber(2,8)
        methodBuilder.addStatement("\$T $ranStr1 = Math.sin(2 * $ran) * Math.log10(${ran.toDouble()})", double.class)
        methodBuilder.addStatement("\$T $ranStr = Math.floor($ranStr1 * 100) / 100", double.class)
    }
    static methodsMinFragment5(methodBuilder) {
        def x = RandomUtil.intRandomNumber(5,10000)
        def y = RandomUtil.intRandomNumber(5,10000)
        def sum = RandomUtil.stringRandomChar123WithNumber(2,6)
        def ranStr = RandomUtil.stringRandomChar123WithNumber(3,6)
        def ranStr1 = RandomUtil.stringRandomChar123WithNumber(3,6)
        def product = RandomUtil.stringRandomChar123WithNumber(2,6)
        methodBuilder.addStatement("\$T $ranStr = ${RandomUtil.intRandomNumber(0,120)}", int.class)
        methodBuilder.addStatement("\$T $ranStr1 = ${RandomUtil.intRandomNumber(0,20)}", int.class)
        methodBuilder.beginControlFlow("if ($ranStr <= 0 || $ranStr <= 0)")
        methodBuilder.addStatement("throw new \$T(\"${RandomUtil.stringRandomChar123WithNumber(10,55)}\")", IllegalArgumentException.class)
        methodBuilder.endControlFlow()
        methodBuilder.addStatement("int $sum = $x + $y")
        methodBuilder.addStatement("int $product = $x * $y")
        methodBuilder.beginControlFlow("if ($product % $sum == 0)")
                // todo: 这里可以重新调用
                methodsMinFragment(methodBuilder)
        methodBuilder.nextControlFlow("else")
                // todo: 这里可以重新调用
                methodsMinFragment(methodBuilder)
        methodBuilder.endControlFlow()
        methodBuilder.endControlFlow()
    }
    static methodsMinFragment6(methodBuilder) {
        def i = RandomUtil.intRandomNumber(2,5000)
        def ranStr = RandomUtil.stringRandomChar123WithNumber(2,8)
        methodBuilder.beginControlFlow("if ($i % 2 == 0)")
        // todo: 这里可以重新调用
        methodsMinFragment(methodBuilder)
        methodBuilder.nextControlFlow("else")
        // todo: 这里可以重新调用
        methodsMinFragment(methodBuilder)
        methodBuilder.endControlFlow()
        methodBuilder.beginControlFlow("for (int $ranStr = 0; $ranStr < 5; $ranStr++)")
            // todo: 这里可以重新调用
            methodsMinFragment(methodBuilder)
        methodBuilder.endControlFlow()
    }


    static methodsMinFragment7(methodBuilder) {
        def ran = RandomUtil.intRandomNumber(2,10)
        def sname = RandomUtil.stringRandomChar123WithNumber(3,8)
        ArrayList<Integer> arr = new ArrayList<Integer>()
        for (int i = 0; i<ran; i++) {
            arr.add(RandomUtil.intRandomNumber(1,5000))
        }
        methodBuilder.addStatement("\$T[] $sname = new \$T[${arr.size()}, ${RandomUtil.intRandomNumber(2,5000)}, " +
                "${RandomUtil.intRandomNumber(2,5000)}, ${RandomUtil.intRandomNumber(2,5000)}, " +
                "${RandomUtil.intRandomNumber(2,5000)}]", Integer.class, Integer.class)
        methodBuilder.addStatement("\$T.sort($sname)", Arrays.class)
    }

    // 反转字符串
    static methodsMinFragment8(methodBuilder) {
        def ran = RandomUtil.stringRandomChar123WithNumber(2,24)
        def ran1 = RandomUtil.stringRandomChar123WithNumber(2,55)
        methodBuilder.addStatement("\$T $ran = new StringBuilder(\"$ran1\").reverse().toString()", String.class)
    }


    // 二分查找法
    static methodsMinFragment9(methodBuilder) {
        def ran = RandomUtil.intRandomNumber(2,10)
        def left = RandomUtil.stringRandomChar123WithNumber(3,6)
        def right = RandomUtil.stringRandomChar123WithNumber(3,6)
        def mid = RandomUtil.stringRandomChar123WithNumber(3,6)
        def key = RandomUtil.stringRandomChar123WithNumber(3,6)
        def ranStr = RandomUtil.stringRandomChar123WithNumber(3,8)
        methodBuilder.addStatement("\$T<\$T> serwefsd = new \$T<\$T>()", ArrayList.class, Integer.class, ArrayList.class, Integer.class)
        methodBuilder.addStatement("\$T $key = ${RandomUtil.intRandomNumber(2,6)}", int.class)
        methodBuilder.beginControlFlow("for(int $ranStr =0; $ranStr<$ran; $ranStr++)")
//        methodBuilder.addStatement("$ranStr.add(${RandomUtil.intRandomNumber(20, 5000)})")
        methodBuilder.endControlFlow()
        methodBuilder.addStatement("int $left = 0")
        methodBuilder.addStatement("int $right = serwefsd.size() - 1")
        methodBuilder.beginControlFlow("while ($left <= $right)")
        methodBuilder.addStatement("int $mid = $left + ($right - $left) / 2")
        methodBuilder.beginControlFlow("if (serwefsd.get($mid).equals($key))")
        methodBuilder.endControlFlow()
        methodBuilder.beginControlFlow("else if (serwefsd.get($mid) > $key)")
        methodBuilder.addStatement("$right = $mid - 1")
        methodBuilder.endControlFlow()
        methodBuilder.beginControlFlow("else")
        methodBuilder.addStatement("$left = $mid + 1")
        methodBuilder.endControlFlow()
        methodBuilder.endControlFlow()
    }

    // 冒泡排序
    static methodsMinFragment10(methodBuilder) {
        def sname = RandomUtil.stringRandomChar123WithNumber(3,8)
        def scope = RandomUtil.intRandomNumber(2,25)
        def n = RandomUtil.stringRandomChar123WithNumber(2,9)
        def temp = RandomUtil.stringRandomChar123WithNumber(2,9)
        def ranStr = RandomUtil.stringRandomChar123WithNumber(2,9)
        def ranStr1 = RandomUtil.stringRandomChar123WithNumber(2,9)
        int[] arr = new int[scope]
        for (int i = 0; i< scope;i++){
            arr[i] = i
        }
        methodBuilder.addStatement("int[] $sname ={${arr.join(',')}}")
                .addStatement("int $n = ${RandomUtil.intRandomNumber(3,25)}")
                .beginControlFlow("for (int $ranStr = 0; $ranStr < $n - 1; $ranStr++)")
                .beginControlFlow("for (int $ranStr1 = 0; $ranStr1 < $n - $ranStr - 1; $ranStr1++)")
                .beginControlFlow("if ($sname[$ranStr1] > $sname[$ranStr1 + 1])")
                .addStatement("int $temp = $sname[$ranStr1]")
                .addStatement("$sname[$ranStr1] = $sname[$ranStr1 + 1]")
                .addStatement("$sname[$ranStr1 + 1] = $temp")
                .endControlFlow()
                .endControlFlow()
                .endControlFlow()
    }


    static methodsMinFragment11(methodBuilder) {
        def ranStr = RandomUtil.stringRandomChar123WithNumber(3,8)
        def ranStr1 = RandomUtil.stringRandomChar123WithNumber(3,8)
        def ranStr2 = RandomUtil.stringRandomChar123WithNumber(1,4)
        def ranInt = RandomUtil.intRandomNumber(3,50)
        def ranInt1 = RandomUtil.intRandomNumber(3,50)
        methodBuilder.addStatement("\$T $ranStr1 = $ranInt1", int.class)
        methodBuilder.addStatement("\$T $ranStr = \"$ranInt1\"", String.class)
        methodBuilder.beginControlFlow("for(int $ranStr2=0; $ranStr2<$ranInt;$ranStr2++)")
        methodBuilder.addStatement("$ranStr =\"${RandomUtil.stringRandomChar123WithNumber(3,55)}\"")
        methodBuilder.addStatement("$ranStr1 += $ranInt")
        methodBuilder.endControlFlow()
    }
    // 多重调用
    static methodsMinFragment12(methodBuilder) {
        def ranBoolean = RandomUtil.randomBoolean()
        methodBuilder.beginControlFlow("if ($ranBoolean)")
        // todo: 这里可以重新调用
        methodsMinFragment(methodBuilder)
        methodBuilder.endControlFlow()
        // todo: 这里可以重新调用
        methodsMinFragment(methodBuilder)
    }

    // int ，string
    static methodsMinFragment13(methodBuilder) {
        def ranStr = RandomUtil.stringRandomChar123WithNumber(3,8)
        def ranStr1 = RandomUtil.stringRandomChar123WithNumber(3,8)
        methodBuilder.addStatement("\$T $ranStr = \"${RandomUtil.stringRandomChar123WithNumber(3,55)}\"", String.class)
        methodBuilder.addStatement("\$T $ranStr1 = ${RandomUtil.intRandomNumber(3,100000)}", int.class)
    }

    // 调用函数
    static methodsMinFragment14(methodBuilder) {
        if ( ConstantKey.classStr == "" || ConstantKey.packageName == "" || ConstantKey.simpleName == "" || ConstantKey.packageName == "cn.hx.plugin.junkcode.utils") {
            ConstantKey.packageName = "cn.hx.plugin.junkcode.utils"
            ConstantKey.simpleName = "Utils"
            ConstantKey.classStr = "logg"
        }
        def bundleClassName = ClassName.get("${ConstantKey.packageName}", "${ConstantKey.simpleName}")
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
    }

    // ArrayList
    static methodsMinFragment15(methodBuilder) {
        def ranStr = RandomUtil.stringRandomChar123WithNumber(3,8)
        methodBuilder.addStatement("\$T $ranStr = new \$T()", List.class, ArrayList.class)
    }

    // 布尔值
    static methodsMinFragment16(methodBuilder) {
        def ranStr = RandomUtil.stringRandomChar123WithNumber(3,8)
        def ranBoolean = RandomUtil.randomBoolean()
        methodBuilder.addStatement("\$T $ranStr = $ranBoolean", boolean.class)
    }


}