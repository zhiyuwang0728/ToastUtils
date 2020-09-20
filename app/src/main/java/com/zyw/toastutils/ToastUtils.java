package com.zyw.toastutils;

import android.content.Context;
import android.widget.Toast;

public class ToastUtils {

    public static void onShortToast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

    public static void onLongToast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
    }
}
