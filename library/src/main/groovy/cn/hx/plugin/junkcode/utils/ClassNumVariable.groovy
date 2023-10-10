package cn.hx.plugin.junkcode.utils

import com.squareup.javapoet.ClassName
import com.squareup.javapoet.FieldSpec
import com.squareup.javapoet.MethodSpec
import com.squareup.javapoet.TypeSpec

import javax.lang.model.element.Modifier

/**
 * 生成一些类成员变量
 * todo：可以嵌入到方法内
 * todo：控件id
 */
class ClassNumVariable {

    static random = new Random()
    static type = ['TextView', 'ImageView', 'Button', 'ConstraintLayout','TableLayout','View',
                   'NestedScrollView','LinearLayout','RelativeLayout','RadioButton','FrameLayout','CardView',
                   'RecyclerView','ViewPager2',
                   'Int','int',
                   'String','Str','string','str',
                   'Double','double',
                   'Float','Byte','Short','Long','Boolean','boolean']
    // 随机生成变量类型
    static TypeSpec.Builder generateVariableType(TypeSpec.Builder typeBuilder){
        def className
        def randomElement = type[(int)(Math.random() * type.size())]
        def lowerCase = randomElement.substring(0, 1).toLowerCase() + randomElement.substring(1) // 将首字母转为小写
        def variableName = "$lowerCase${RandomUtil.stringRandomLength(2,8)}"
        ConstantKey.classNumVariableName.add(0,variableName)
        switch (randomElement) {
            case 'TextView':
                className = ClassName.get("android.widget",randomElement)
                textViewRandom(typeBuilder, className, variableName)
                break
            case 'ImageView':
                className = ClassName.get("android.widget",randomElement)
                imageViewRandom(typeBuilder, className, variableName)
                break
            case 'Button':
                className = ClassName.get("android.widget",randomElement)
                ButtonRandom(typeBuilder, className, variableName)
                break
            case 'ConstraintLayout':
                className = ClassName.get("androidx.constraintlayout.widget",randomElement)
                ConstraintLayoutRandom(typeBuilder, className, variableName)
                break
            case 'TableLayout':
                className = ClassName.get("android.widget",randomElement)
                TableLayoutRandom(typeBuilder, className, variableName)
                break
            case 'View':
                className = ClassName.get("android.view",randomElement)
                ViewRandom(typeBuilder, className, variableName)
                break
            case 'NestedScrollView':
                className = ClassName.get("androidx.core.widget",randomElement)
                NestedScrollViewRandom(typeBuilder, className, variableName)
                break
            case 'LinearLayout':
                className = ClassName.get("android.widget",randomElement)
                LinearLayoutRandom(typeBuilder, className, variableName)
                break
            case 'RelativeLayout':
                className = ClassName.get("android.widget",randomElement)
                RelativeLayoutRandom(typeBuilder, className, variableName)
                break
            case 'RadioButton':
                className = ClassName.get("android.widget",randomElement)
                RadioButtonRandom(typeBuilder, className, variableName)
                break
            case 'FrameLayout':
                className = ClassName.get("android.widget",randomElement)
                FrameLayoutRandom(typeBuilder, className, variableName)
                break
            case 'CardView':
                className = ClassName.get("androidx.cardview.widget",randomElement)
                CardViewRandom(typeBuilder, className, variableName)
                break
            case 'RecyclerView':
                className = ClassName.get("androidx.recyclerview.widget",randomElement)
                RecyclerViewRandom(typeBuilder, className, variableName)
                break
            case 'ViewPager2':
                className = ClassName.get("androidx.viewpager2.widget",randomElement)
                ViewPager2Random(typeBuilder, className, variableName)
                break
            case 'String':
                case 'Str':
                case 'string':
                case 'str':
//                className = ClassName.get("kotlin",randomElement)
                StringRandom(typeBuilder,  variableName)
                break
            case 'Int':
//                className = ClassName.get("kotlin",randomElement)
                IntRandom(typeBuilder,  variableName)
                break

            case 'Double':
//                className = ClassName.get("kotlin",randomElement)
                DoubleRandom(typeBuilder, variableName)
                break
            case 'Float':
//                className = ClassName.get("kotlin",randomElement)
                FloatRandom(typeBuilder, variableName)
                break
            case 'Byte':
//                className = ClassName.get("kotlin",randomElement)
                ByteRandom(typeBuilder, variableName)
                break
            case 'Short':
//                className = ClassName.get("kotlin",randomElement)
                ShortRandom(typeBuilder, variableName)
                break
            case 'Long':
//                className = ClassName.get("kotlin",randomElement)
                LongRandom(typeBuilder, variableName)
                break
            case 'Boolean':
                case 'boolean':
//                className = ClassName.get("kotlin",randomElement)
                BooleanRandom(typeBuilder, variableName)
                break
            default:
//                className = ClassName.get("kotlin","String")
                StringRandom(typeBuilder, variableName)
        }
        return typeBuilder
    }



    static textViewRandom(TypeSpec.Builder typeBuilder, className, variableName){
        typeBuilder.addField(className,"$variableName",  Modifier.PRIVATE)

    }
    static imageViewRandom(TypeSpec.Builder typeBuilder, className, variableName){
        typeBuilder.addField(className,"$variableName",  Modifier.PRIVATE)
    }

    static ButtonRandom(TypeSpec.Builder typeBuilder, className, variableName){
        typeBuilder.addField(className,"$variableName",  Modifier.PRIVATE)

    }
    static ConstraintLayoutRandom(TypeSpec.Builder typeBuilder, className, variableName){
        typeBuilder.addField(className,"$variableName",  Modifier.PRIVATE)

    }
    static TableLayoutRandom(TypeSpec.Builder typeBuilder, className, variableName){
        typeBuilder.addField(className,"$variableName",  Modifier.PRIVATE)
    }
    static ViewRandom(TypeSpec.Builder typeBuilder, className, variableName){
        typeBuilder.addField(className,"$variableName",  Modifier.PRIVATE)

    }
    static NestedScrollViewRandom(TypeSpec.Builder typeBuilder, className, variableName){
        typeBuilder.addField(className,"$variableName",  Modifier.PRIVATE)

    }
    static LinearLayoutRandom(TypeSpec.Builder typeBuilder, className, variableName){
        typeBuilder.addField(className,"$variableName",  Modifier.PRIVATE)

    }
    static RelativeLayoutRandom(TypeSpec.Builder typeBuilder, className, variableName){
        typeBuilder.addField(className,"$variableName",  Modifier.PRIVATE)

    }
    static RadioButtonRandom(TypeSpec.Builder typeBuilder, className, variableName){
        typeBuilder.addField(className,"$variableName",  Modifier.PRIVATE)

    }
    static FrameLayoutRandom(TypeSpec.Builder typeBuilder, className, variableName){
        typeBuilder.addField(className,"$variableName",  Modifier.PRIVATE)

    }
    static CardViewRandom(TypeSpec.Builder typeBuilder, className, variableName){
        typeBuilder.addField(className,"$variableName",  Modifier.PRIVATE)

    }
    static RecyclerViewRandom(TypeSpec.Builder typeBuilder, className, variableName){
        typeBuilder.addField(className,"$variableName",  Modifier.PRIVATE)

    }
    static ViewPager2Random(TypeSpec.Builder typeBuilder, className, variableName){
        typeBuilder.addField(className,"$variableName",  Modifier.PRIVATE)

    }
    static StringRandom(TypeSpec.Builder typeBuilder, variableName){
        typeBuilder.addField(String.class,"$variableName",  Modifier.PRIVATE)

    }
    static IntRandom(TypeSpec.Builder typeBuilder, variableName){
        typeBuilder.addField(Integer.class,"$variableName",  Modifier.PRIVATE)

    }

    static DoubleRandom(TypeSpec.Builder typeBuilder, variableName){
        typeBuilder.addField(Double.class,"$variableName",  Modifier.PRIVATE)

    }
    static FloatRandom(TypeSpec.Builder typeBuilder, variableName){
        typeBuilder.addField(Float.class,"$variableName",  Modifier.PRIVATE)

    }
    static ByteRandom(TypeSpec.Builder typeBuilder, variableName){
        typeBuilder.addField(Byte.class,"$variableName",  Modifier.PRIVATE)

    }
    static ShortRandom(TypeSpec.Builder typeBuilder, variableName){
        typeBuilder.addField(Short.class,"$variableName",  Modifier.PRIVATE)

    }
    static LongRandom(TypeSpec.Builder typeBuilder, variableName){
        typeBuilder.addField(Long.class,"$variableName",  Modifier.PRIVATE)

    }
    static BooleanRandom(TypeSpec.Builder typeBuilder, variableName){
        typeBuilder.addField(Boolean.class,"$variableName",  Modifier.PRIVATE)

    }




}