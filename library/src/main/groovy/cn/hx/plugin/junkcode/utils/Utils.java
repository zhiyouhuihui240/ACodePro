package cn.hx.plugin.junkcode.utils;

import java.util.logging.Logger;

/**
 * @author admin
 */
public class Utils {

    static String str = RandomUtil.generateRandomabcABC123();

    static public void logg(){
        Logger.getLogger("TAG").info(str.toString());
    }


}
