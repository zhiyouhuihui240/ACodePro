package cn.hx.plugin.junkcode.utils

import com.squareup.javapoet.ClassName


class ConstantKey {



    // 随机生成，自由组拼更好，写死的下一次又要重写一遍
    static def mateDataList = ['1df3g1e3w46',"true","false",'https://play.google.com/store','26',
     'compiry.com',"GlideTo","skjfsnv",'www','85', 'PRIVETE_KEY','52','base',
     'mxcxmcf',"werdsfxxc","1332dssxd12sfwe4",'lyi.ckkd','66',
    'wefhkdsjwek',"com.ds.weredk","1f2s2d1f22312dsf",'https://play.google.com/store','26',
    'com.udp.kki',"true","false",'https://play.google.com/store','26']




    static List<String> stringList = new ArrayList<>()

//    static List<String> stringNameList = new ArrayList<>()

    static List<String> otherClassNameList = new ArrayList<>()
    static List<String> otherPackageNameList = new ArrayList<>()
    static List<String> otherClassMethodsNameList = new ArrayList<>()
    static Map<String, List<String>> otherClassMethodsAccessMap = new HashMap<String, List<String>>()
    // 包名 + 类名，方法名
    static Map<String, List<String>> otherAllPathMap = new HashMap<String, List<String>>()

    static String otherPathClassNameObj = ""
    static String otherPathClassNameValue = ""

    // 储存类对象
    static String packageName = ""
    static String simpleName = ""
    static String classStr = ""
    static String fullPath = ""
    static String allActivityList = ""
    static List<String> targetPath = new ArrayList<>()
    static String isCreatorActivity = ""

    // 存储类对象以及该类中所有生成的方法
    static Map<ClassName, List<String>> classObj = new HashMap<ClassName, List<String>>()


    // 获取 随机生成的layout内容
    static String layoutContentString = ""


    // 打印各种信息
    static logDrawable = ""


    // 类成员变量信息
    static List<String> classNumVariableName = new ArrayList<>()




}