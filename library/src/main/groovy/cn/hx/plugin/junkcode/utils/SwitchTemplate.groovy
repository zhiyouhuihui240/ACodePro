package cn.hx.plugin.junkcode.utils


import com.squareup.javapoet.MethodSpec
import com.squareup.javapoet.TypeSpec

/**
 * 随机生成函数方法
 */
class SwitchTemplate {

    static switchTemplate(MethodSpec.Builder methodBuilder){
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
            case 3:
                methodsMinFragment3(methodBuilder)
                break
            case 4:
                methodsMinFragment4(methodBuilder)
                break
            case 5:
                methodsMinFragment5(methodBuilder)
                break
            case 6:
                methodsMinFragment6(methodBuilder)
                break
            case 7:
                methodsMinFragment7(methodBuilder)
                break
            case 8:
                methodsMinFragment8(methodBuilder)
                break
            case 9:
                methodsMinFragment9(methodBuilder)
                break
            case 10:
                methodsMinFragment10(methodBuilder)
                break
            case 11:
                methodsMinFragment11(methodBuilder)
                break
            case 12:
                methodsMinFragment12(methodBuilder)
                break
            case 13:
                methodsMinFragment13(methodBuilder)
                break
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

    static methodsMinFragment0(methodBuilder) {

    }
    static methodsMinFragment1(methodBuilder) {

    }
    static methodsMinFragment2(methodBuilder) {

    }
    static methodsMinFragment3(methodBuilder) {

    }
    static methodsMinFragment4(methodBuilder) {

    }
    static methodsMinFragment5(methodBuilder) {

    }
    static methodsMinFragment6(methodBuilder) {

    }
    static methodsMinFragment7(methodBuilder) {

    }
    static methodsMinFragment8(methodBuilder) {

    }
    static methodsMinFragment9(methodBuilder) {

    }
    static methodsMinFragment10(methodBuilder) {

    }
    static methodsMinFragment11(methodBuilder) {

    }
    static methodsMinFragment12(methodBuilder) {

    }
    static methodsMinFragment13(methodBuilder) {

    }
    static methodsMinFragment14(methodBuilder) {

    }
    static methodsMinFragment15(methodBuilder) {

    }
    static methodsMinFragment16(methodBuilder) {

    }




    static TypeSpec.Builder generateVariableType(TypeSpec.Builder typeBuilder){
        def className
        def randomElement =  RandomUtil.randomVariableType()
//        def randomElement = type[(int)(Math.random() * type.size())]
        def lowerCase = randomElement.substring(0, 1).toLowerCase() + randomElement.substring(1) // 将首字母转为小写
        def variableName = "$lowerCase${RandomUtil.stringRandomChar(2,8)}"
        ConstantKey.classNumVariableName.add(0,variableName)
        ConstantKey.classVariableTypeName.put(variableName, randomElement)
        switch (randomElement) {
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
                break
            case 'Int':
            case 'int':
                break

            case 'Double':
            case 'double':
                break
            case 'Float':
                break
            case 'Long':
                break
            case 'Boolean':
            case 'boolean':
                break
            default:
                return typeBuilder
        }
        return typeBuilder
    }


}