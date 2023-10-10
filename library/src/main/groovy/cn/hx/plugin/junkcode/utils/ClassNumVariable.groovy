package cn.hx.plugin.junkcode.utils

import com.squareup.javapoet.ClassName
import com.squareup.javapoet.FieldSpec
import com.squareup.javapoet.MethodSpec
import com.squareup.javapoet.TypeSpec
import org.omg.PortableInterceptor.INACTIVE

import javax.lang.model.element.Modifier

/**
 * 生成一些类成员变量
 * todo：可以嵌入到方法内
 * todo：控件id
 */
class ClassNumVariable {

    static type = ['TextView', 'ImageView', 'Button', 'ConstraintLayout','TableLayout','View',
                   'NestedScrollView','LinearLayout','RelativeLayout','RadioButton','FrameLayout','CardView',
                   'RecyclerView','ViewPager2',
                   'Int','int',
                   'String','Str','string','str',
                   'Double','double',
                   'Float','Long','Boolean','boolean']
    // todo: 随机生成变量类型，并对变量进行初始化
    static TypeSpec.Builder generateVariableType(TypeSpec.Builder typeBuilder){
        def className
        def randomElement = type[(int)(Math.random() * type.size())]
        def lowerCase = randomElement.substring(0, 1).toLowerCase() + randomElement.substring(1) // 将首字母转为小写
        def variableName = "$lowerCase${RandomUtil.stringRandomLength(2,8)}"
        ConstantKey.classNumVariableName.add(0,variableName)
        ConstantKey.classVariableTypeName.put(variableName, randomElement)

        switch (randomElement) {
            case 'TextView':
                className = ClassName.get("android.widget",randomElement)
                textViewRandom(typeBuilder,  className,variableName, randomElement)
                break
            case 'ImageView':
                className = ClassName.get("android.widget",randomElement)
                imageViewRandom(typeBuilder,  className,variableName, randomElement)
                break
            case 'Button':
                className = ClassName.get("android.widget",randomElement)
                ButtonRandom(typeBuilder,  className,variableName, randomElement)
                break
            case 'ConstraintLayout':
                className = ClassName.get("androidx.constraintlayout.widget",randomElement)
                ConstraintLayoutRandom(typeBuilder,  className,variableName, randomElement)
                break
            case 'TableLayout':
                className = ClassName.get("android.widget",randomElement)
                TableLayoutRandom(typeBuilder,  className,variableName, randomElement)
                break
            case 'View':
                className = ClassName.get("android.view",randomElement)
                ViewRandom(typeBuilder,  className,variableName, randomElement)
                break
            case 'NestedScrollView':
                className = ClassName.get("androidx.core.widget",randomElement)
                NestedScrollViewRandom(typeBuilder,  className,variableName, randomElement)
                break
            case 'LinearLayout':
                className = ClassName.get("android.widget",randomElement)
                LinearLayoutRandom(typeBuilder,  className,variableName, randomElement)
                break
            case 'RelativeLayout':
                className = ClassName.get("android.widget",randomElement)
                RelativeLayoutRandom(typeBuilder,  className,variableName, randomElement)
                break
            case 'RadioButton':
                className = ClassName.get("android.widget",randomElement)
                RadioButtonRandom(typeBuilder,  className,variableName, randomElement)
                break
            case 'FrameLayout':
                className = ClassName.get("android.widget",randomElement)
                FrameLayoutRandom(typeBuilder,  className,variableName, randomElement)
                break
            case 'CardView':
                className = ClassName.get("androidx.cardview.widget",randomElement)
                CardViewRandom(typeBuilder,  className,variableName, randomElement)
                break
            case 'RecyclerView':
                className = ClassName.get("androidx.recyclerview.widget",randomElement)
                RecyclerViewRandom(typeBuilder,  className,variableName, randomElement)
                break
            case 'ViewPager2':
                className = ClassName.get("androidx.viewpager2.widget",randomElement)
                ViewPager2Random(typeBuilder,  className,variableName, randomElement)
                break
            case 'String':
                case 'Str':
                case 'string':
                case 'str':
//                className = ClassName.get("kotlin",randomElement)
                StringRandom(typeBuilder,  variableName, randomElement)
                break
            case 'Int':
                case 'int':
//                className = ClassName.get("kotlin",randomElement)
                IntRandom(typeBuilder,  variableName, randomElement)
                break

            case 'Double':
                case 'double':
//                className = ClassName.get("kotlin",randomElement)
                DoubleRandom(typeBuilder,  variableName, randomElement)
                break
            case 'Float':
//                className = ClassName.get("kotlin",randomElement)
                FloatRandom(typeBuilder,  variableName, randomElement)
                break
//            case 'Byte':
////                className = ClassName.get("kotlin",randomElement)
//                ByteRandom(typeBuilder,  variableName, randomElement)
//                break
//            case 'Short':
////                className = ClassName.get("kotlin",randomElement)
//                ShortRandom(typeBuilder,  variableName, randomElement)
//                break
            case 'Long':
//                className = ClassName.get("kotlin",randomElement)
                LongRandom(typeBuilder,  variableName, randomElement)
                break
            case 'Boolean':
                case 'boolean':
//                className = ClassName.get("kotlin",randomElement)
                BooleanRandom(typeBuilder,  variableName, randomElement)
                break
            default:
//                className = ClassName.get("kotlin","String")
                StringRandom(typeBuilder,  variableName, randomElement)
        }
        return typeBuilder
    }



    static textViewRandom(TypeSpec.Builder typeBuilder, className, variableName, randomElement){
        typeBuilder.addField(className,"$variableName",  Modifier.PRIVATE, Modifier.STATIC)

    }
    static imageViewRandom(TypeSpec.Builder typeBuilder, className, variableName, randomElement){
        typeBuilder.addField(className,"$variableName",  Modifier.PRIVATE, Modifier.STATIC)
    }

    static ButtonRandom(TypeSpec.Builder typeBuilder, className, variableName, randomElement){
        typeBuilder.addField(className,"$variableName",  Modifier.PRIVATE, Modifier.STATIC)

    }
    static ConstraintLayoutRandom(TypeSpec.Builder typeBuilder, className, variableName, randomElement){
        typeBuilder.addField(className,"$variableName",  Modifier.PRIVATE, Modifier.STATIC)

    }
    static TableLayoutRandom(TypeSpec.Builder typeBuilder, className, variableName, randomElement){
        typeBuilder.addField(className,"$variableName",  Modifier.PRIVATE, Modifier.STATIC)
    }
    static ViewRandom(TypeSpec.Builder typeBuilder, className, variableName, randomElement){
        typeBuilder.addField(className,"$variableName",  Modifier.PRIVATE, Modifier.STATIC)

    }
    static NestedScrollViewRandom(TypeSpec.Builder typeBuilder, className, variableName, randomElement){
        typeBuilder.addField(className,"$variableName",  Modifier.PRIVATE, Modifier.STATIC)

    }
    static LinearLayoutRandom(TypeSpec.Builder typeBuilder, className, variableName, randomElement){
        typeBuilder.addField(className,"$variableName",  Modifier.PRIVATE, Modifier.STATIC)

    }
    static RelativeLayoutRandom(TypeSpec.Builder typeBuilder, className, variableName, randomElement){
        typeBuilder.addField(className,"$variableName",  Modifier.PRIVATE, Modifier.STATIC)

    }
    static RadioButtonRandom(TypeSpec.Builder typeBuilder, className, variableName, randomElement){
        typeBuilder.addField(className,"$variableName",  Modifier.PRIVATE, Modifier.STATIC)

    }
    static FrameLayoutRandom(TypeSpec.Builder typeBuilder, className, variableName, randomElement){
        typeBuilder.addField(className,"$variableName",  Modifier.PRIVATE, Modifier.STATIC)

    }
    static CardViewRandom(TypeSpec.Builder typeBuilder, className, variableName, randomElement){
        typeBuilder.addField(className,"$variableName",  Modifier.PRIVATE, Modifier.STATIC)

    }
    static RecyclerViewRandom(TypeSpec.Builder typeBuilder, className, variableName, randomElement){
        typeBuilder.addField(className,"$variableName",  Modifier.PRIVATE, Modifier.STATIC)

    }
    static ViewPager2Random(TypeSpec.Builder typeBuilder, className, variableName, randomElement){
        typeBuilder.addField(className,"$variableName",  Modifier.PRIVATE, Modifier.STATIC)

    }
    static StringRandom(TypeSpec.Builder typeBuilder, variableName, randomElement){
        // todo: 创建一个新的变量，并且进行初始化
//        def randomName = RandomUtil.stringRandomLength(3,56)
//        randomName = FieldSpec.builder(String.class, randomName)
//                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
//                .initializer("\$S", "${RandomUtil.stringRandomLength(2,35)}")
////                .initializer("\$S + \$L", "${RandomUtil.generateRandomabcABC123()}", 5.0d)
//                .build()
//        typeBuilder.addField(randomName)    // 已经初始化的变量
//        ConstantKey.classVariableTypeName.put(randomName, randomElement)
        typeBuilder.addField(String.class,"$variableName",  Modifier.PRIVATE, Modifier.STATIC)  // 没有初始化的变量
    }
    static IntRandom(TypeSpec.Builder typeBuilder,  variableName, randomElement){
//        def randomName = RandomUtil.stringRandomLength(3,10)
//        randomName = FieldSpec.builder(Integer.class, randomName)
//                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
//                .initializer("\$L", "${RandomUtil.randomLength(2,100000)}")
//                .build()
//        typeBuilder.addField(randomName)
//        ConstantKey.classVariableTypeName.put(randomName, randomElement)
        typeBuilder.addField(Integer.class,"$variableName",  Modifier.PRIVATE, Modifier.STATIC)
    }

    static DoubleRandom(TypeSpec.Builder typeBuilder,  variableName, randomElement){
//        def randomName = RandomUtil.stringRandomLength(3,10)
//        randomName = FieldSpec.builder(Double.class, randomName)
//                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
//                .initializer("\$L", "${RandomUtil.randomLength(2,100000)}d")
//                .build()
//        typeBuilder.addField(randomName)
//        ConstantKey.classVariableTypeName.put(randomName, randomElement)
        typeBuilder.addField(Double.class,"$variableName",  Modifier.PRIVATE, Modifier.STATIC)

    }
    static FloatRandom(TypeSpec.Builder typeBuilder,  variableName, randomElement){
        typeBuilder.addField(Float.class,"$variableName",  Modifier.PRIVATE, Modifier.STATIC)

    }
    static ByteRandom(TypeSpec.Builder typeBuilder,  variableName, randomElement){
        typeBuilder.addField(Byte.class,"$variableName",  Modifier.PRIVATE, Modifier.STATIC)

    }
    static ShortRandom(TypeSpec.Builder typeBuilder,  variableName, randomElement){
        typeBuilder.addField(Short.class,"$variableName",  Modifier.PRIVATE, Modifier.STATIC)

    }
    static LongRandom(TypeSpec.Builder typeBuilder,  variableName, randomElement){
        typeBuilder.addField(Long.class,"$variableName",  Modifier.PRIVATE, Modifier.STATIC)

    }
    static BooleanRandom(TypeSpec.Builder typeBuilder,  variableName, randomElement){
//        def randomName = RandomUtil.stringRandomLength(3,10)
//        randomName = FieldSpec.builder(Boolean.class, randomName)
//                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
//                .initializer("\$L", "${RandomUtil.randomBoolean()}")
//                .build()
//        typeBuilder.addField(randomName)
//        ConstantKey.classVariableTypeName.put(randomName, randomElement)
        typeBuilder.addField(Boolean.class,"$variableName",  Modifier.PRIVATE, Modifier.STATIC)

    }



    // todo: 创建一个新的变量，并且进行初始化
    static TypeSpec.Builder initVariable(TypeSpec.Builder typeBuilder){
        def randomElement = type[(int)(Math.random() * type.size())]
        switch (randomElement) {
//            case 'TextView':
//                break
//            case 'ImageView':
//                break
//            case 'Button':
//                break
//            case 'ConstraintLayout':
//                break
//            case 'TableLayout':
//                break
//            case 'View':
//                break
//            case 'NestedScrollView':
//                break
//            case 'LinearLayout':
//                break
//            case 'RelativeLayout':
//                break
//            case 'RadioButton':
//                break
//            case 'FrameLayout':
//                break
//            case 'CardView':
//                break
//            case 'RecyclerView':
//                break
//            case 'ViewPager2':
//                break
            case 'String':
            case 'Str':
            case 'string':
            case 'str':
                initStringVariable(typeBuilder, randomElement)
                break
            case 'Int':
            case 'int':
                initIntVariable(typeBuilder, randomElement)
                break
            case 'Double':
            case 'double':
                initDoubleVariable(typeBuilder, randomElement)
                break
            case 'Float':
                initFloatVariable(typeBuilder, randomElement)
                break
            case 'Long':
                break
            case 'Boolean':
            case 'boolean':
                initBooleanVariable(typeBuilder, randomElement)
                break
            default:
                initStringVariable(typeBuilder, randomElement)
        }
        return typeBuilder
    }


    static initStringVariable(TypeSpec.Builder typeBuilder, String randomElement){
        def randomName = RandomUtil.stringRandomLength(3,15)
        FieldSpec randomField = FieldSpec.builder(String.class, randomName)
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .initializer("\$S", RandomUtil.stringRandomLength(2,55))
                .build()
        ConstantKey.classVariableTypeName.put(randomName, randomElement)
        typeBuilder.addField(randomField)
    }


    static initIntVariable(TypeSpec.Builder typeBuilder, String randomElement){
        def randomName = RandomUtil.stringRandomLength(3,15)
        FieldSpec randomField = FieldSpec.builder(Integer.class, randomName)
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .initializer("\$L", RandomUtil.randomLength(2,10035))
//                .initializer("\$S + \$L", "${RandomUtil.generateRandomabcABC123()}", 5.0d)
                .build()
        ConstantKey.classVariableTypeName.put(randomName, randomElement)
        typeBuilder.addField(randomField)
    }
    static initDoubleVariable(TypeSpec.Builder typeBuilder, String randomElement){
        def randomName = RandomUtil.stringRandomLength(3,15)
        FieldSpec randomField = FieldSpec.builder(Double.class, randomName)
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .initializer("\$Ld", RandomUtil.randomLength(2,10035))
//                .initializer("\$S + \$L", "${RandomUtil.generateRandomabcABC123()}", 5.0d)
                .build()
        ConstantKey.classVariableTypeName.put(randomName, randomElement)
        typeBuilder.addField(randomField)
    }
    static initFloatVariable(TypeSpec.Builder typeBuilder, String randomElement){
        def randomName = RandomUtil.stringRandomLength(3,15)
        FieldSpec randomField = FieldSpec.builder(Float.class, randomName)
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .initializer("\$Lf", RandomUtil.randomLength(2,10035))
//                .initializer("\$S + \$L", "${RandomUtil.generateRandomabcABC123()}", 5.0d)
                .build()
        ConstantKey.classVariableTypeName.put(randomName, randomElement)
        typeBuilder.addField(randomField)
    }
    static initBooleanVariable(TypeSpec.Builder typeBuilder, String randomElement){
        def randomName = RandomUtil.stringRandomLength(3,15)
        FieldSpec randomField = FieldSpec.builder(Boolean.class, randomName)
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .initializer("\$L", RandomUtil.randomBoolean())
                .build()
        ConstantKey.classVariableTypeName.put(randomName, randomElement)
        typeBuilder.addField(randomField)
    }



}