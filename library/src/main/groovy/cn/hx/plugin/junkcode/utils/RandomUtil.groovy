package cn.hx.plugin.junkcode.utils

import com.squareup.javapoet.ClassName
import com.squareup.javapoet.MethodSpec
import com.squareup.javapoet.TypeSpec

import javax.lang.model.element.Modifier
import java.security.SecureRandom
class RandomUtil {

    /**
     * 规则类型与无规则类型
     * 规则类型：较为正式的命名
     * 无规则类型：随机生成
     */
    static random = new Random()

    static abc = "abcdefghijklmnopqrstuvwxyz".toCharArray()
    static color = "0123456789abcdef".toCharArray()
    static num = "0123456789".toCharArray()
    static ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray()
    static abcABC = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray()
    static abcABC123 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray()




    // 获取该类中随机的变量，不做删除处理，这样可以对该变量进行多次赋值
    // 同时，需要进行判断该变量的类型
    static String randomVariableName(MethodSpec.Builder methodBuilder) {
        // 随机获取一个键
        def variableName =  ConstantKey.classVariableTypeName.keySet().toArray()[random.nextInt(ConstantKey.classVariableTypeName.size())]
        // 根据键获取对应的值
        def variableType = ConstantKey.classVariableTypeName.get(variableName)
        // todo: 对类变量进行赋值,调用
        assignValue (methodBuilder, variableName.toString(), variableType.toString())
    }


    static assignValue(MethodSpec.Builder methodBuilder,String variableName, String variableType) {
        switch (variableType) {
            case 'TextView':
                break
            case 'ImageView':
                break
            case 'Button':
                break
            case 'ConstraintLayout':
                break
            case 'TableLayout':
                break
            case 'View':
                break
            case 'NestedScrollView':
                break
            case 'LinearLayout':
                break
            case 'RelativeLayout':
                break
            case 'RadioButton':
                break
            case 'FrameLayout':
                break
            case 'CardView':
                break
            case 'RecyclerView':
                break
            case 'ViewPager2':
                break
            case 'String':
            case 'Str':
            case 'string':
            case 'str':
                methodBuilder.addStatement("$variableName = \"${stringRandomLength(3,56)}\"")
                break
            case 'Int':
                case 'int':
                methodBuilder.addStatement("$variableName = ${randomLength(3,1000000)}")
                break

            case 'Double':
                case 'double':
                methodBuilder.addStatement("$variableName = ${randomLength(3,1000000)}d")
                break
            case 'Float':
                methodBuilder.addStatement("$variableName = ${randomLength(3,1000000)}f")
                break
//            case 'Byte':
//                methodBuilder.addStatement("$variableName = ${randomLength(3,1000000)}")
//                break
//            case 'Short':
//                methodBuilder.addStatement("$variableName = ${randomLength(3,1000000)}")
//                break
            case 'Long':
                methodBuilder.addStatement("$variableName = ${randomLength(3,1000000)}L")
                break
            case 'Boolean':
            case 'boolean':
                methodBuilder.addStatement("$variableName = ${randomBoolean()}")
                break
            default:
                methodBuilder.addStatement("$variableName = \"${stringRandomLength(3,56)}\"")
        }
    }



    // 生成id代码
    static String generateId() {
        def sb = new StringBuilder()
        for (i in 0..5) {
            sb.append(abc[random.nextInt(abc.size())])
        }
        return sb.toString()
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


    // 随机生成指定长度的字符串
    static generateRandomString(int length) {
        def random = new Random()
        def sb = new StringBuilder(length)
        def alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
        length.times { sb.append(alphabet.charAt(random.nextInt(alphabet.size()))) }
        return sb.toString()
    }


    // 生成指定长度范围内的随机字符串
    static stringRandomLength(int minLength, int maxLength) {
        def random = new Random()
        def sb = new StringBuilder(maxLength)
        def alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
        def length = random.nextInt(maxLength - minLength + 1) + minLength
        length.times { sb.append(alphabet.charAt(random.nextInt(alphabet.size()))) }
        return sb.toString()
    }


    static Integer generateRandomNum() {
        def sb = new StringBuilder()
        sb.append(num[random.nextInt(num.size())])
        return sb.toInteger()
    }


// 返回 3-length之间的随机数
    static Integer randomLength(int length) {
        SecureRandom secureRandom = new SecureRandom()
        int randomNum = secureRandom.nextInt(length) + 3
        return randomNum
    }

    // 返回 plus-length之间的随机数
    static Integer randomLength(int plus, int length) {
        SecureRandom secureRandom = new SecureRandom()
        int randomNum = secureRandom.nextInt(length) + plus
        return randomNum
    }

    // 返回true or false
    static Boolean randomBoolean() {
        return Math.random() < 0.5
    }

    static String generateRandomabcABC() {
        def sb = new StringBuilder()
        sb.append(abcABC[random.nextInt(abcABC.size())])
        return sb.toString()
    }


    static String generateRandomabcABC123() {
        def sb = new StringBuilder()
        sb.append(abcABC123[random.nextInt(abcABC123.size())])
        return sb.toString()
    }


    static String getRandomMethod(stringList){
        def unm = generateRandomNum()
        def num = stringList.size()
        if (unm >= num) {
            unm = 0
        }
        return "${stringList[unm]}()"
    }


    // 随机生成一个Service名称,类名和包名
    static public String generateServiceName(int index) {
        def a =generateRandomStr(index)
        def b =generateRandomStr(index)
        def c =generateRandomStr(index)
        return "$a.$b.$c"
    }


    // 随机生成一个Meta-data名称,类名和包名
    static public String generateMetaDataName(int index) {
        def a =generateRandomStr(index)
        def b =generateRandomStr(index)
        def c =generateRandomStr(index)
        return "$a.$b.$c"
    }


    static String generateRandomabcABC123(int index){
        def sb = new StringBuilder()
        for (i in 0..4) {
            sb.append(abcABC123[random.nextInt(abcABC123.size())])
        }
        int temp = index
        while (temp >= 0) {
            sb.append(abcABC123[temp % abcABC123.size()])
            temp = temp / abcABC123.size()
            if (temp == 0) {
                temp = -1
            }
        }
        sb.append(index.toString())
        return sb.toString()
    }


    static String generateRandomStr(int index){
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



    // todo: 判断是否是 SDK 路径下生成的文件
    static Boolean fetchSDK(ArrayList<String> otherPackageNameList, ArrayList<String> otherClassNameList){
        def sdk = "cn.hx.plugin.junkcode.utils.Utils"
        def isSDK = false
        if (otherPackageNameList.size() > 1 && otherClassNameList.size() > 1 ) {
            sdk = otherPackageNameList.get(1)
            switch (sdk) {
                case "com.bytedance.sdk.component.utils":
                    isSDK = true
                    break
                case "com.google.android.gms.ads.identifier":
                    isSDK = true
                    break
                case "com.iab.omid.library.applovin":
                    isSDK = true
                    break
                case "com.anythink.core.activity":
                    isSDK = true
                    break
                case "com.bytedance":
                    isSDK = true
                    break
                default:
                    isSDK = false
            }

        }
        return isSDK
    }



    // 随机移除一个值
    static Map.Entry<ClassName, String> removeRandomValue() {
        // 从classObj中随机获取一个key
        List<ClassName> keys = new ArrayList<>(ConstantKey.classObj.keySet())
        if (keys.isEmpty()) {
            return [null, null] as Map.Entry<ClassName, String>
        }
        ClassName randomKey = keys.get(new Random().nextInt(keys.size()))
        // 从这个key对应的value集合中随机获取一个value
        List<String> values = ConstantKey.classObj.get(randomKey)
        String randomValue = ConstantKey.classObj.get(randomKey).get(new Random().nextInt(values.size()))

        def fullClassName = "$randomKey"
        ConstantKey.packageName = fullClassName.substring(0, fullClassName.lastIndexOf("."))
        ConstantKey.simpleName = fullClassName.substring(fullClassName.lastIndexOf(".") + 1)
        ConstantKey.fullPath = fullClassName
        // 移除这个值
//        values.remove(randomValue)
        // 如果这个key下没有值了，就把key移除
//        if (values.isEmpty()) {
//            ConstantKey.classObj.remove(randomKey)
//        }

        ConstantKey.classStr = randomValue

        return [randomKey, randomValue] as Map.Entry<ClassName, String>
    }



}
