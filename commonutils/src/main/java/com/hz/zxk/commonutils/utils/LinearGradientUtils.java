package com.hz.zxk.commonutils.utils;

import android.graphics.Color;

/**
 * @author zhengxiaoke
 * @date 2019/3/15 8:46 PM
 */
public class LinearGradientUtils {
    private int startColor;
    private int endColor;

    public LinearGradientUtils(int startColor,int endColor){
        this.startColor=startColor;
        this.endColor=endColor;
    }

    public void setStartColor(int startColor) {
        this.startColor = startColor;
    }

    public void setEndColor(int endColor) {
        this.endColor = endColor;
    }

    public int getColor(float radio){
        int redStart= Color.red(startColor);
        int blueStart=Color.blue(startColor);
        int greenStart=Color.green(startColor);

        int redEnd=Color.red(endColor);
        int blueEnd=Color.blue(endColor);
        int greenEnd=Color.blue(endColor);

        int red=(int)(redStart+(redEnd-redStart)*radio+0.5);
        int blue=(int)(blueStart+(blueEnd-blueStart)*radio+0.5);
        int green=(int)(greenStart+(greenEnd-greenStart)*radio+0.5);

        return Color.argb(255,red,blue,green);
    }
}
