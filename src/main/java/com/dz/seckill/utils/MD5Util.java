package com.dz.seckill.utils;
import org.apache.commons.codec.digest.DigestUtils;

public class MD5Util {
    public static String md5(String src){
        return DigestUtils.md5Hex(src);
    }
    private static final String SALT = "1a2b3c4d";

    public static String inputPassToFormPass(String inputPass){
        String str = ""+SALT.charAt(0)+SALT.charAt(2)+inputPass+SALT.charAt(5)+SALT.charAt(4);
        return md5(str);
    }

    public static String fromPassToDBPass(String fromPass,String salt){
        String str = ""+salt.charAt(0)+salt.charAt(2)+fromPass+salt.charAt(5)+salt.charAt(4);
        return md5(str);
    }

    public static String inputPassToDBPass(String inputPass,String salt){
        String frompass = inputPassToFormPass(inputPass);
        String dbpass = fromPassToDBPass(frompass,salt);
        return dbpass;
    }

    public static void main(String[] args) {
        System.out.printf(inputPassToFormPass("123"));
    }
}
