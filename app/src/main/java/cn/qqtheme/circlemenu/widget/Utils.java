package cn.qqtheme.circlemenu.widget;

import android.content.Context;
import android.graphics.Bitmap;

/**
 * 描述
 *
 * @author 李玉江[QQ:1032694760]
 * @since 2015/11/25
 * Created By Android Studio
 */
public class Utils {


    /**
     * dp转换为px
     *
     * @param context
     * @param dpValue
     * @return
     */
    public static int toPx(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        int pxValue = (int) (dpValue * scale + 0.5f);
        return pxValue;
    }

    /**
     * 缩放图片，会变形
     *
     * @param bitmap
     * @param newWidth
     * @param newHeight
     * @return
     */
    public static Bitmap scale(Bitmap bitmap, int newWidth, int newHeight) {
        return Bitmap.createScaledBitmap(bitmap, newWidth, newHeight, true);
    }

}
