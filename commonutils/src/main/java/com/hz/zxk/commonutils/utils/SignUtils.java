package com.hz.zxk.commonutils.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 　　┏┓　　　　┏┓
 * 　┏┛┻━━━━┛┻┓
 * 　┃　　　　　　　　┃
 * 　┃　　　━　　　　┃
 * 　┃　┳┛　┗┳　　┃
 * 　┃　　　　　　　　┃
 * 　┃　　　┻　　　　┃
 * 　┃　　　　　　　　┃
 * 　┗━━┓　　　┏━┛
 * 　　　　┃　　　┃　　　神兽保佑
 * 　　　　┃　　　┃　　　代码无BUG！
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫
 * <p>
 * Created by zxk on 19-3-5.
 */
public class SignUtils {

    /**
     * MD5加密
     *
     * @param str
     * @return
     */
    public static String getMD5(String str) {
        if (str == null || str.trim().length() <= 0) {
            return "";
        }
        StringBuilder md5 = new StringBuilder();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bytes = messageDigest.digest(str.getBytes());
            for (byte aByte : bytes) {
                String temp = Integer.toHexString(aByte & 0xff);
                if (temp.length() == 1) {
                    temp = "0" + temp;
                }
                md5.append(temp);
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return md5.toString();
    }
}
