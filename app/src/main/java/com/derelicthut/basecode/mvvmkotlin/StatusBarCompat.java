package com.derelicthut.basecode.mvvmkotlin;

import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

import com.blankj.utilcode.util.BarUtils;

public class StatusBarCompat {

    private static int statusBarHeight = BarUtils.getStatusBarHeight();

    public static void expendStatusBarHeight(View view){
        if (view != null) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P){
                view.post(new Runnable() {
                    @Override
                    public void run() {
                        WindowInsets windowInsets = view.getRootWindowInsets();
                        if (windowInsets!= null){
                            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
                            if (displayCutout!= null){
                                statusBarHeight = Math.max(statusBarHeight,displayCutout.getSafeInsetTop());
                            }
                        }
                        realExpand(view);
                    }
                });
            }else {
                realExpand(view);
            }
        }
    }

    public static void realExpand(View view) {
        ViewGroup.LayoutParams params = view.getLayoutParams();
        if (params != null) {
            params.height = params.height + statusBarHeight;
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + statusBarHeight
                    , view.getPaddingRight(), view.getPaddingBottom());
        }
    }
}
