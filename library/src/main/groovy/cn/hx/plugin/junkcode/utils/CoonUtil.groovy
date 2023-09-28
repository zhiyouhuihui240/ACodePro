package cn.hx.plugin.junkcode.utils



class CoonUtil {

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



    static strList = ['GameActivity', 'PreActivity', 'LauncherActivity', 'HomeActivity', 'SplashActivity',
                      'LoadActivity', 'DialogActivity', 'PrivacyActivity', 'BaseActivity', 'HistoryActivity','CameraActivity',
                      'UserActivity', 'MenuActivity', 'VideoActivity', 'GuideActivity', 'AlarmActivity','RecordActivity',
                      'ChallengeActivity', 'DownloadActivity', 'ShareActivity', 'FavoriteActivity', 'ProActivity','PlayActivity',
                      'PayActivity', 'SaveActivity', 'ExitActivity', 'VipActivity', 'MusicActivity','ResultActivity','TimeActivity',
                      'LoadingActivity', 'ReviewActivity', 'CreatorActivity', 'CountActivity', 'DataActivity','ReloadActivity','CertifyActivity',
                      'SelectActivity', 'LoginActivity', 'FindActivity', 'PhotoActivity', 'MemberActivity','EditorActivity','CustomActivity']

    // 生成activity名称 从strList中随机获取一个元素，并将该元素从列表中删除
    static String getRandomActivityName(int index) {
        if (strList.size() == 0) {
            // 若是不够，则自动生成随机字符串
            def name = generateName(index)
            return name
        }
        int randomIndex = Math.floor(Math.random() * strList.size())
        String randomStr = strList[randomIndex]
        strList.remove(randomIndex)
        return randomStr
    }



    // 随机生成一个方法名称
    static String generateRandomMethodsName(int index) {
        def strList = ['getCurrentTime', 'isLoading', 'initData', 'initView', 'pear', 'createFragment', 'getActivityCount',
                       'setPro', 'setPreview', 'startAct', 'setVip', 'getVip', 'getProvy', 'setNumber', 'getNumber', 'setCertify', 'getCertify',
                       'getNative', 'createTimer', 'getServers', 'internalDialog', 'gotoMarket', 'saveString', 'startMainActivity', 'onBackAct',
                       'loadCertificate', 'aniNavHost', 'decryptBase64', 'decryptFile', 'aesEncrypt', 'aesDecrypt', 'crypt', 'xorDecode', 'xorEncodeData',
                       'loadProfile', 'toAboutActivity', 'toPager', 'hasLoaded', 'isOpen', 'showSystemUI', 'hideSystemUI', 'uncompress', 'internalRating']
// 从列表中随机获取一个字符串
//        def randomStr = strList[Math.floor(Math.random() * strList.size())]
        if (strList.size() == 0) {
            // 若是不够，则自动生成随机字符串
            def name = generateName(index)
            return name
        }
        int randomIndex = (int)Math.floor(Math.random() * strList.size())
        String randomStr = strList[randomIndex]
        strList.remove(randomIndex)
        return randomStr
    }



    static Integer generateRandomNum() {
        def sb = new StringBuilder()
        sb.append(num[random.nextInt(num.size())])
        return sb.toInteger()
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



}