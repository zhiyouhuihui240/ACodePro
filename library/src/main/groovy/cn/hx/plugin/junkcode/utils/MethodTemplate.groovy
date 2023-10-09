package cn.hx.plugin.junkcode.utils

import com.squareup.javapoet.ClassName
import com.squareup.javapoet.FieldSpec
import com.squareup.javapoet.MethodSpec
import com.squareup.javapoet.ParameterizedTypeName
import com.squareup.javapoet.TypeName
import com.squareup.javapoet.TypeSpec

import javax.lang.model.element.Modifier
import java.text.DateFormat
import java.text.ParseException
import java.util.regex.Matcher
import java.util.regex.Pattern

/**
 * 方法模板
 */
class MethodTemplate {

    static random = new Random()

    static allTemplate(MethodSpec.Builder methodBuilder){
        if ( ConstantKey.otherClassNameList.size() > 3) {
            RandomUtil.removeRandomValue()
        }
        if ( ConstantKey.classStr == "" || ConstantKey.packageName == "" || ConstantKey.simpleName == "" || ConstantKey.packageName == "cn.hx.plugin.junkcode.utils") {
            ConstantKey.packageName = "cn.hx.plugin.junkcode.utils"
            ConstantKey.simpleName = "Utils"
            ConstantKey.classStr = "logg"
        }
        def bundleClassName = ClassName.get("${ConstantKey.packageName}", "${ConstantKey.simpleName}")
        switch (random.nextInt(28)) {
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

    static generateRandomMethods0(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        def log1 = ClassName.get("android.util", "Log")
        def str1 = ClassName.get("cn.hx.plugin.junkcode.demo", "R")
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)

//        methodBuilder.addStatement("\$T.out.println(\$S)", System.class, "$bundleClassName")    // 打印
//        methodBuilder.addStatement("\$T.out.println(\$S)", System.class, "${ConstantKey.classObj}")    // 打印
        // 调用android项目中的字符串
//        methodBuilder.addStatement("\$T.out.println(\$T.string.yes)", System.class, ClassName.get("cn.hx.plugin.junkcode.demo", "R"))
//        methodBuilder.addStatement("\$T.d(\$S, String.valueOf(\$T.\$L))", log1, "TAG", str1, "string.yes")  // 打印日志
    }

    static template0(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.addStatement("double sum = ${RandomUtil.generateRandomNum()}")
        methodBuilder.addStatement("int count = ${RandomUtil.generateRandomNum()}")
        methodBuilder.beginControlFlow("while (true)")
        methodBuilder.addStatement("\$T scanner = new \$T(\$T.in)",Scanner.class, Scanner.class, System)
        methodBuilder.addStatement("int guess = scanner.nextInt()")
        methodBuilder.beginControlFlow("if (guess == ${RandomUtil.generateRandomNum()})")
        methodBuilder.addStatement("break")
        methodBuilder.endControlFlow();
        methodBuilder.addStatement("sum += guess")
        methodBuilder.addStatement("count++")
        methodBuilder.endControlFlow()
        methodBuilder.beginControlFlow("if (count == 0)")
        methodBuilder.endControlFlow()
    }
    static template1(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)// 添加方法体
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.beginControlFlow("for (int i = 5; i >= 1; i--)")
        methodBuilder.beginControlFlow("for (int j = 1; j <= i; j++)")
//        methodBuilder.addStatement("System.out.print(\$S)", "*");
        methodBuilder.endControlFlow();
//        methodBuilder.addStatement("System.out.println()");
        methodBuilder.endControlFlow();
      }
    static template2(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)// 添加方法体
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.addStatement("int answer = (int) (Math.random() * 100) + 1");
        methodBuilder.beginControlFlow("while (true)");
        methodBuilder.addStatement("\$T scanner = new \$T(\$T.in)",Scanner.class, Scanner.class, System)
        methodBuilder.addStatement("int guess = scanner.nextInt()")
        methodBuilder.beginControlFlow("if (guess == answer)")
//        methodBuilder.addStatement("System.out.println(\$S + answer)", "Congratulations! The answer is ");
        methodBuilder.addStatement("break");
        methodBuilder.endControlFlow();
        methodBuilder.addStatement("String hint = guess < answer ? \$S : \$S", "too low", "too high");
//        methodBuilder.addStatement("System.out.println(hint)");
        methodBuilder.endControlFlow();
//        methodBuilder.addStatement("System.out.println(\$S)", "Guess number game finished!");
    }
    static template3(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.addStatement("String str = \$S", "hello world");
        methodBuilder.addStatement("String result = \$S", "");
        methodBuilder.beginControlFlow("for (int i = 0; i < str.length(); i++)");
        methodBuilder.addStatement("char ch = str.charAt(i)");
        methodBuilder.beginControlFlow("if (result.indexOf(ch) == -1)");
        methodBuilder.addStatement("result += ch");
        methodBuilder.endControlFlow();
        methodBuilder.endControlFlow();
    }
    static template4(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        def dataObj = ClassName.get("java.util","Date")
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)// 添加方法体
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.returns(Boolean.class)
        methodBuilder.addStatement("\$T df = \$T.getInstance()", DateFormat.class, DateFormat.class);
        methodBuilder.addStatement("String dateStr = \$S", "2021-10-03")
        methodBuilder.addStatement("\$T date = null", dataObj);
        methodBuilder.beginControlFlow("try");
        methodBuilder.addStatement("date = df.parse(dateStr)");
        methodBuilder.endControlFlow();
        methodBuilder.beginControlFlow("catch (\$T e)", ParseException.class);
        methodBuilder.addStatement("e.printStackTrace()");
        methodBuilder.endControlFlow();
        methodBuilder.addStatement("int dayOfWeek = date.getDay()");

        // 添加方法结束语句
        methodBuilder.beginControlFlow("if (dayOfWeek == 0 || dayOfWeek == 6)");
        methodBuilder.addStatement("return true");
        methodBuilder.endControlFlow();
        methodBuilder.addStatement("return false");
    }
    static template5(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)// 添加方法体
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.returns(List.class)
        methodBuilder.addStatement("\$T list = new \$T<\$T>()", List.class, ArrayList.class, String.class);
        methodBuilder.addStatement("list.add(\$S)", "AAA");
        methodBuilder.addStatement("list.add(\$S)", "BBB");
        methodBuilder.addStatement("list.add(\$S)", "CCC");
        methodBuilder.addStatement("list.add(\$S)", "AAA");
        methodBuilder.addStatement("list.add(\$S)", "DDD");
        methodBuilder.addStatement("\$T set = new \$T<\$T>(list)", Set.class, HashSet.class, String.class);
        methodBuilder.addStatement("\$T result = new \$T(set)", List.class, ArrayList.class)
        methodBuilder.addStatement("return result");
    }
    static template6(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)// 添加方法体
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.addStatement("int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}");
        methodBuilder.addStatement("int n = matrix.length");
        methodBuilder.beginControlFlow("for (int i = 0; i < n; i++)");
        methodBuilder.beginControlFlow("for (int j = i + 1; j < n; j++)");
        methodBuilder.addStatement("int temp = matrix[i][j]");
        methodBuilder.addStatement("matrix[i][j] = matrix[j][i]");
        methodBuilder.addStatement("matrix[j][i] = temp");
        methodBuilder.endControlFlow();
        methodBuilder.endControlFlow();
    }
    static template7(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.returns(Boolean.class)
        methodBuilder.addStatement("String pattern = \$S", "\\d{3}-\\d{2}-\\d{4}");
        methodBuilder.addStatement("String input = \$S", "123-45-6789");
        methodBuilder.addStatement("\$T p = \$T.compile(pattern)", Pattern.class, Pattern.class);
        methodBuilder.addStatement("\$T m = p.matcher(input)", Matcher.class);
        methodBuilder.addStatement("return m.matches()");
    }
    static template8(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)// 添加方法体
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.returns(Integer.class)
        methodBuilder.addStatement("int n = 5");
        methodBuilder.addStatement("int result = 1");
        methodBuilder.beginControlFlow("for (int i = 1; i <= n; i++)");
        methodBuilder.addStatement("result *= i");
        methodBuilder.endControlFlow()
        methodBuilder.addStatement("System.out.println(\$S + result)", "Factorial calculated: ");
        methodBuilder.addStatement("return result");
    }
    static template9(MethodSpec.Builder methodBuilder, ClassName bundleClassName){    // 添加方法体
        TypeName map = ParameterizedTypeName.get(Map.class, String.class, Integer.class); // 指定Map的键值类型
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
                .returns(map)
//                .addCode("Map<String, Integer> map = new HashMap<>();\nmap.put(\"test1\", 1);\nmap.put(\"test2\", 2);\nreturn map;")
        methodBuilder.addStatement("Map<String, Integer> map = new \$T<>()", HashMap)
        methodBuilder.addStatement("map.put(\"test1\", 1)")
        methodBuilder.addStatement("map.put(\"test1\", 2)")
        methodBuilder.addStatement("return map")
    }
    static template10(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)// 添加方法体
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.returns(String.class)
        methodBuilder.addStatement("String plaintext = \$S", "hello world");
        methodBuilder.addStatement("String result = \$S", "");
        methodBuilder.beginControlFlow("for (int i = 0; i < plaintext.length(); i++)");
        methodBuilder.addStatement("char ch = plaintext.charAt(i)");
        methodBuilder.addStatement("int code = (int) ch + 1");
        methodBuilder.addStatement("result += (char) code");
        methodBuilder.endControlFlow()
        methodBuilder.addStatement("System.out.println(\$S + result)", "Encrypted message: ");
        methodBuilder.addStatement("return result");
    }
    static template11(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)// 添加方法体
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.returns(Integer.class)
        methodBuilder.addStatement("int[] arr = new int[] {3, 1, 4, 2, 5}");
        methodBuilder.addStatement("int max = arr[0]");
        methodBuilder.beginControlFlow("for (int i = 1; i < arr.length; i++)");
        methodBuilder.beginControlFlow("if (arr[i] > max)");
        methodBuilder.addStatement("max = arr[i]");
        methodBuilder.endControlFlow();
        methodBuilder.endControlFlow();
        // 添加方法结束语句
        methodBuilder.addStatement("System.out.println(\$S + max)", "Max value found: ");
        methodBuilder.addStatement("return max");
    }
    static template12(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)// 添加方法体
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.returns(String.class)
        methodBuilder.addStatement("String result = \$S", "");
        methodBuilder.beginControlFlow("for (int i = 1; i <= 5; i++)");
        methodBuilder.addStatement("result += \$S + i", "num");
        methodBuilder.endControlFlow();
        methodBuilder.addStatement("System.out.println(\$S + result)", "Concatenated string: ");
        methodBuilder.addStatement("return result");
    }
    static template13(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)// 添加方法体
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.returns(Boolean.class)
        methodBuilder.addStatement("int n = 11");
        methodBuilder.beginControlFlow("if (n <= 1)");
        methodBuilder.addStatement("return false");
        methodBuilder.endControlFlow();
        methodBuilder.beginControlFlow("for (int i = 2; i <= Math.sqrt(n); i++)");
        methodBuilder.beginControlFlow("if (n % i == 0)");
        methodBuilder.addStatement("return false");
        methodBuilder.endControlFlow();
        methodBuilder.endControlFlow();
        methodBuilder.addStatement("System.out.println(\$S)", "Number is prime!");
        methodBuilder.addStatement("return true");
    }
    static template14(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)// 添加方法体
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.addStatement("int[] arr = new int[] {3, 1, 4, 2, 5}");
        methodBuilder.beginControlFlow("for (int i = 0; i < arr.length - 1; i++)");
        methodBuilder.beginControlFlow("for (int j = 0; j < arr.length - i - 1; j++)");
        methodBuilder.beginControlFlow("if (arr[j] > arr[j+1])");
        methodBuilder.addStatement("int temp = arr[j]");
        methodBuilder.addStatement("arr[j] = arr[j+1]");
        methodBuilder.addStatement("arr[j+1] = temp");
        methodBuilder.endControlFlow();
        methodBuilder.endControlFlow();
        methodBuilder.endControlFlow();
    }
    static template15(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)// 添加方法体
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.returns(Boolean.class)
        methodBuilder.addStatement("int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8}");
        methodBuilder.addStatement("int target = 5");
        methodBuilder.addStatement("int left = 0");
        methodBuilder.addStatement("int right = arr.length - 1");
        methodBuilder.beginControlFlow("while (left <= right)");
        methodBuilder.addStatement("int mid = (left + right) / 2");
        methodBuilder.beginControlFlow("if (arr[mid] == target)");
        methodBuilder.addStatement("return true");
        methodBuilder.endControlFlow();
        methodBuilder.beginControlFlow("else if (arr[mid] > target)");
        methodBuilder.addStatement("right = mid - 1");
        methodBuilder.endControlFlow();
        methodBuilder.beginControlFlow("else");
        methodBuilder.addStatement("left = mid + 1");
        methodBuilder.endControlFlow();
        methodBuilder.endControlFlow();
        methodBuilder.addStatement("return true");
    }
    static template16(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)// 添加方法体
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.addStatement("int n = 5");
        methodBuilder.addStatement("int fact = 1");
        methodBuilder.beginControlFlow("for (int i = 1; i <= n; i++)");
        methodBuilder.addStatement("fact *= i");
        methodBuilder.endControlFlow();
    }
    static template17(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)// 添加方法体
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.returns(Integer.class)
        methodBuilder.addStatement("int n = 5");
        methodBuilder.addStatement("int prev = 0");
        methodBuilder.addStatement("int curr = 1");
        methodBuilder.beginControlFlow("for (int i = 2; i <= n; i++)");
        methodBuilder.addStatement("int temp = curr");
        methodBuilder.addStatement("curr += prev");
        methodBuilder.addStatement("prev = temp");
        methodBuilder.endControlFlow();
        methodBuilder.addStatement("return curr");
    }
    static template18(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.returns(Double.class)
        methodBuilder.addStatement("double radius = 5.0");
        methodBuilder.addStatement("double area = Math.PI * radius * radius");
        methodBuilder.addStatement("return area");
    }
    static template19(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.returns(Integer.class)
        methodBuilder.addStatement("int length = 5");
        methodBuilder.addStatement("int width = 3");
        methodBuilder.addStatement("int area = length * width");
        methodBuilder.addStatement("return area");
    }
    static template20(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        def randomStr = RandomUtil.generateRandomabcABC()
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        def stack = ClassName.get("java.util", "Stack")
        def gson = ClassName.get("com.google.gson", "Gson")
        def jObject = ClassName.get("com.google.gson", "JsonObject")
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)// 添加方法体
        methodBuilder.returns(String.class)
        methodBuilder.addStatement("String jsonString = \"{\\\"name\\\": \\\"Tom\\\", \\\"age\\\": 25}\"");
        methodBuilder.addStatement("\$T jsonObject = new \$T().fromJson(jsonString, \$T.class)", jObject, gson, jObject)
        methodBuilder.addStatement("String name = jsonObject.get(\"name\").getAsString()");
        methodBuilder.addStatement("int age = jsonObject.get(\"age\").getAsInt()");
        methodBuilder.addStatement("String result = \"Name: \" + name + \", Age: \" + age");
        methodBuilder.addStatement("System.out.println(result)");
        methodBuilder.addStatement("return result");
    }
    static template21(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.returns(Double.class)
        methodBuilder.addStatement("int[] numbers = {2, 4, 6, 8, 10}");
        methodBuilder.addStatement("double total = 0");
        methodBuilder.addStatement("for (int i = 0; i < numbers.length; i++) { total += numbers[i]; }");
        methodBuilder.addStatement("double average = total / numbers.length");
        methodBuilder.addStatement("return average");
    }
    static template22(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        // 添加方法体
        methodBuilder.addStatement("int[] numbers = {5, 3, 1, 4, 2}");
        methodBuilder.addStatement("\$T.sort(numbers)", Arrays );
    }
    static template23(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.returns(String.class)
        methodBuilder.addStatement("String str = \"hello world\"");
        methodBuilder.addStatement("char[] charArray = str.toCharArray()");
        methodBuilder.addStatement("int left = 0, right = charArray.length - 1");
        methodBuilder.beginControlFlow("while (left < right)");
        methodBuilder.addStatement("char temp = charArray[left]");
        methodBuilder.addStatement("charArray[left] = charArray[right]");
        methodBuilder.addStatement("charArray[right] = temp");
        methodBuilder.addStatement("left++");
        methodBuilder.addStatement("right--");
        methodBuilder.endControlFlow();
        methodBuilder.addStatement("String reversedString = new String(charArray)");
        methodBuilder.addStatement("return reversedString");
    }
    static template24(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.returns(String.class)
        methodBuilder.addStatement("String str = \"hello world\"");
        methodBuilder.addStatement("char[] charArray = str.toCharArray()");
        methodBuilder.beginControlFlow("for (int i = 0; i < charArray.length; i++)");
        methodBuilder.beginControlFlow("if (charArray[i] == 'l')");
        methodBuilder.addStatement("charArray[i] = 'L'");
        methodBuilder.endControlFlow();
        methodBuilder.endControlFlow();
        methodBuilder.addStatement("String replacedString = new String(charArray)");
        methodBuilder.addStatement("System.out.println(replacedString)");
        methodBuilder.addStatement("return replacedString");
    }
    static template25(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        def n = RandomUtil.randomLength(32)
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)// 添加方法体
        methodBuilder.returns(Integer.class)
        methodBuilder.beginControlFlow("if ($n == 0)")
                .addStatement("return 0")
                .endControlFlow();
        methodBuilder.beginControlFlow("if ($n == 1)")
                .addStatement("return 1")
                .endControlFlow();
        methodBuilder.addStatement("int a = 0");
        methodBuilder.addStatement("int b = 1");
        methodBuilder.addStatement("int c = 0");
        methodBuilder.beginControlFlow("for (int i = 2; i <= $n; i++)")
                .addStatement("c = a + b")
                .addStatement("a = b")
                .addStatement("b = c")
                .endControlFlow();

        // 添加方法结束语句
        methodBuilder.addStatement("return c");
    }
    static template26(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)// 添加方法体
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.addStatement("int time = 0");
        methodBuilder.beginControlFlow("while (time < 10)")
                .addStatement("int distance = time * time")
                .beginControlFlow("if (distance <= 100)")
                .endControlFlow()
                .beginControlFlow("else")
                .addStatement("break")
                .endControlFlow()
                .addStatement("time++")
                .endControlFlow();
    }
    static template27(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        // java.util.Stack
        def randomStr = "${RandomUtil.generateRandomString(12)}"
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        def stack = ClassName.get("java.util", "Stack")
        def strClass = ClassName.get("java.lang", "String")
        def splitClass = ClassName.get("kotlin.text", "split")
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)// 添加方法体
//        methodBuilder.addStatement("\$T[] tokens = "${RandomUtil.generateRandomabcABC()}".split(\" \")", strClass)
        methodBuilder.addStatement("\$T str = \"$randomStr\"", String.class)
        methodBuilder.addStatement("\$T[] tokens = str.split(\" \")", strClass)
        methodBuilder.addStatement("\$T<Integer> operandStack = new \$T<Integer>()", stack, stack)
        methodBuilder.beginControlFlow("for (String token : tokens)")
                .beginControlFlow("if (token.matches(\"\\\\d+\"))")
                .addStatement("operandStack.push(Integer.parseInt(token))")
                .endControlFlow()
                .beginControlFlow("else")
                .addStatement("int operand2 = operandStack.pop()")
                .addStatement("int operand1 = operandStack.pop()")
                .beginControlFlow("switch (token)")
                .beginControlFlow("case \"+\":")
                .addStatement("operandStack.push(operand1 + operand2)")
                .addStatement("break")
                .endControlFlow()
                .beginControlFlow("case \"-\":")
                .addStatement("operandStack.push(operand1 - operand2)")
                .addStatement("break")
                .endControlFlow()
                .beginControlFlow("case \"*\":")
                .addStatement("operandStack.push(operand1 * operand2)")
                .addStatement("break")
                .endControlFlow()
                .beginControlFlow("case \"/\":")
                .addStatement("operandStack.push(operand1 / operand2)")
                .addStatement("break")
                .endControlFlow()
                .endControlFlow()
                .endControlFlow()
                .endControlFlow()
    }
    static template(MethodSpec.Builder methodBuilder, ClassName bundleClassName){
        methodBuilder.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        methodBuilder.addStatement("\$T.${ConstantKey.classStr}()", bundleClassName)
        methodBuilder.returns(Boolean.class)
        methodBuilder.beginControlFlow("if (num <= 1)")
                .addStatement("return false")
                .endControlFlow();
        methodBuilder.beginControlFlow("for (int i = 2; i * i <= num; i++)")
                .beginControlFlow("if (num % i == 0)")
                .addStatement("return false")
                .endControlFlow()
                .endControlFlow();
        methodBuilder.addStatement("return true");
    }

}