package cn.hx.plugin.junkcode.utils;

import java.util.logging.Logger;

/**
 * @author admin
 */
public class Utils {

    static String str = RandomUtil.stringRandomChar(2,25);

    static public void logg(){
        Logger.getLogger("TAG").info(str.toString());
    }


}
