package cn.hx.plugin.junkcode.utils

import com.squareup.javapoet.ClassName
import com.squareup.javapoet.MethodSpec

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
                methodBuilder.addStatement("$variableName = \"${stringRandomChar(3,56)}\"")
                break
            case 'Int':
                case 'int':
                methodBuilder.addStatement("$variableName = ${intRandomNumber(3,1000000)}")
                break

            case 'Double':
                case 'double':
                methodBuilder.addStatement("$variableName = ${intRandomNumber(3,1000000)}d")
                break
            case 'Float':
                methodBuilder.addStatement("$variableName = ${intRandomNumber(3,1000000)}f")
                break
//            case 'Byte':
//                methodBuilder.addStatement("$variableName = ${randomLength(3,1000000)}")
//                break
//            case 'Short':
//                methodBuilder.addStatement("$variableName = ${randomLength(3,1000000)}")
//                break
            case 'Long':
                methodBuilder.addStatement("$variableName = ${intRandomNumber(3,1000000)}L")
                break
            case 'Boolean':
            case 'boolean':
                methodBuilder.addStatement("$variableName = ${randomBoolean()}")
                break
            default:
                methodBuilder.addStatement("$variableName = \"${stringRandomChar(3,56)}\"")
        }
    }




    // 随机获取一个变量类型
    static String randomVariableType(){
        return ClassNumVariable.type[(int)(Math.random() * ClassNumVariable.type.size())]
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


    static canonicalType = ['TextView', 'ImageView', 'Button', 'ConstraintLayout','TableLayout','View',
                            'NestedScrollView','LinearLayout','RelativeLayout','RadioButton','FrameLayout','CardView',
                            'RecyclerView','ViewPager2',
                            'int','String','boolean','float','double']

    // 生成指定长度范围内的随机字符串
    static String stringRandomChar123WithNumber(int minLength, int maxLength) {
        def random = new Random()
        def sb = new StringBuilder(maxLength + 10) // 10 is enough length for the random number
        def alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
        def length = random.nextInt(maxLength - minLength + 1) + minLength
        length.times { sb.append(alphabet.charAt(random.nextInt(alphabet.size()))) }
        // Add random number at the end
        sb.append(intRandomNumber(0, 999999))
        return sb.toString()
    }



    // 生成指定长度范围内的随机字符串, 同时对变量名避免与关键词同名
    static String stringRandomChar(int minLength, int maxLength) {
        def random = new Random()
        def sb = new StringBuilder(maxLength)
        def alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
        def length = random.nextInt(maxLength - minLength + 1) + minLength
        def canonicalType = ['TextView', 'ImageView', 'Button', 'ConstraintLayout','TableLayout','View',
                             'NestedScrollView','LinearLayout','RelativeLayout','RadioButton','FrameLayout','CardView',
                             'RecyclerView','ViewPager2',
                             'Int','int',
                             'String','Str','string','str',
                             'Double','double',
                             'Float','Long','Boolean','boolean',
                             'List','ArrayList','HashMap','HashSet','If','For','While','Switch','Return','Do','New','new',
                'Try','try','Byte','Case','Char','Else','Goto','Break','This','Void','Catch','Class','Const','Const',
                'Final','Super','Throw','While','Import','Native','Public','Return','Static','Throws','Default','Extends',
                'Finally','Package','Private','Abstract','Continue','Protected','Strictfp','Volatile','Interface','Transient',
                'Implements','Instanceof','Synchronized']
        boolean isNewString = false
        while(!isNewString) {
            sb.setLength(0)
            length.times { sb.append(alphabet.charAt(random.nextInt(alphabet.size()))) }
            String newString = sb.substring(0,1).toUpperCase() + sb.substring(1)
            if(!canonicalType.contains(newString)) {
                return sb.toString()
            }
            isNewString = false
        }
        sb.setLength(0)
        length.times { sb.append(alphabet.charAt(random.nextInt(alphabet.size()))) }
        return sb.toString()
    }



    static Integer generateRandomNum() {
        def sb = new StringBuilder()
        sb.append(num[random.nextInt(num.size())])
        return sb.toInteger()
    }


    // 返回 min-max 之间的随机数
    static Integer intRandomNumber(int min, int max) {
        SecureRandom secureRandom = new SecureRandom()
        int randomNum = secureRandom.nextInt(max) + min
        return randomNum
    }

    // 返回true or false
    static Boolean randomBoolean() {
        return Math.random() < 0.5
    }

    //
    static String generateRandomabcABC123() {
        def sb = new StringBuilder()
        sb.append(abcABC123[random.nextInt(abcABC123.size())])
        return sb.toString()
    }


    // 获取本类中生成的方法, 便于内部调用, 目前用于activity中
    static String getRandomMethod(stringList){
        def unm = generateRandomNum()
        def num = stringList.size()
        if (unm >= num) {
            unm = 0
        }
        return "${stringList[unm]}()"
    }


    // 随机生成一个Service名称,类名和包名
    static String generateServiceName(int index) {
        def a =generateRandomStr(index)
        def b =generateRandomStr(index)
        def c =generateRandomStr(index)
        return "$a.$b.$c"
    }
    // 随机生成一个Meta-data名称,类名和包名
    static String generateMetaDataName(int index) {
        def a =generateRandomStr(index)
        def b =generateRandomStr(index)
        def c =generateRandomStr(index)
        return "$a.$b.$c"
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
