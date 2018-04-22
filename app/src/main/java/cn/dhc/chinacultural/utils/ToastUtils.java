package cn.dhc.chinacultural.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by zbw on 2017/1/12.
 */

public class ToastUtils {
    private ToastUtils()
    {
		/* cannot be instantiated */
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    public static boolean isShow = true;

    private static Toast mToast;
    /**
     * 短时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showShort(Context context, CharSequence message)
    {
        if (isShow) {
            if(null==mToast)
                mToast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
            else
                mToast.setText(message);
            mToast.show();
        }
    }


    /**
     * 长时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showLong(Context context, CharSequence message)
    {
        if (isShow) {
            if(null==mToast)
                mToast = Toast.makeText(context, message, Toast.LENGTH_LONG);
            else
                mToast.setText(message);
            mToast.show();
        }
    }



    /**
     * 自定义显示Toast时间
     *
     * @param context
     * @param message
     * @param duration
     */
    public static void show(Context context, CharSequence message, int duration)
    {
        if (isShow) {
            if (null == mToast)
                mToast = Toast.makeText(context, message, duration);
            else
                mToast.setText(message);
            mToast.show();
        }
    }

}
