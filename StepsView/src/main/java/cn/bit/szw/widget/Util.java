package cn.bit.szw.widget;

import android.content.Context;

/**
 * Util
 *
 * @author Scott Smith 2017-02-16 12:29
 */
public class Util {
    public static int dp2px(Context context , int dp) {
        return (int) (context.getResources().getDisplayMetrics().density * dp);
    }
}
