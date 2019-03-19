package com.hz.zxk.commonutils.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

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
 * Created by zxk on 19-3-4.
 */
public class NetworkUtils {

    /**
     * 判断网络是否可用
     * @param context
     * @return
     */
    public static boolean isNetworkConnection(Context context){
        if(context!=null){
            ConnectivityManager connectivityManager=(ConnectivityManager) context
                    .getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo=connectivityManager.getActiveNetworkInfo();
            if(networkInfo!=null){
                return networkInfo.isAvailable();
            }
        }
        return false;
    }

    /**
     * 判断无线是否可用
     * @param context
     * @return
     */
    public static boolean isWifiConnection(Context context){
        if(context!=null){
            ConnectivityManager connectivityManager=(ConnectivityManager)context
                    .getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo=connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            if(networkInfo!=null){
                return networkInfo.isConnected();
            }
        }
        return false;
    }

    /**
     * 字节转换
     *
     * @param b
     * @return
     */
    public static String networkSpeed(long b) {
        if (b < 1024) {
            return b + "Byte";
        } else if (b < 1024 * 1024) {
            return b / 1024 + "KB";
        } else if (b < 1024 * 1024 * 1024) {
            return ((float) (b * 100 / 1024 / 1024 * 1024)) / 100 + "MB";
        }
        return "0Byte";
    }
}
