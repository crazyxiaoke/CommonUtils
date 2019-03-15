package com.hz.zxk.commonutils.utils;

import android.content.Context;

/**
 * @author zhengxiaoke
 * @date 2019/3/15 4:29 PM
 * dp、sp、px转换
 */
public class ConvertPxUtils {

    /**
     * dp转px
     * @param context
     * @param dp
     * @return
     */
    public static int dip2Px(Context context, float dp){
        float scale=context.getResources().getDisplayMetrics().density;
        return (int)(dp*scale+0.5f);
    }

    /**
     * px转dp
     * @param context
     * @param px
     * @return
     */
    public static int px2Dip(Context context,float px){
        float scale=context.getResources().getDisplayMetrics().density;
        return (int)(px/scale+0.5f);
    }

    /**
     * sp转px
     * @param context
     * @param sp
     * @return
     */
    public static int sp2Px(Context context,float sp){
        float scale=context.getResources().getDisplayMetrics().scaledDensity;
        return (int)(sp*scale+0.5f);
    }

    /**
     * px转sp
     * @param context
     * @param px
     * @return
     */
    public static int px2Sp(Context context,float px){
        float scale=context.getResources().getDisplayMetrics().scaledDensity;
        return (int)(px*scale+0.5f);
    }
}
