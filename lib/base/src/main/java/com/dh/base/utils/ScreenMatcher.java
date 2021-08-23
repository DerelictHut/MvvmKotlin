package com.dh.base.utils;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.util.DisplayMetrics;

import com.blankj.utilcode.util.ActivityUtils;
import com.dh.base.utils.BaseUtils;
import com.dh.base.utils.ResUtils;

/**
 * @author ...
 */
public class ScreenMatcher {
    //原始值
    private static float mSrcDensity;
    private static float mSrcScaledDensity;
    private static int mSrcDensityDpi;
    //修正值
    private static float mFixDensity;
    private static float mFixScaledDensity;
    private static int mFixDensityDpi;

    public static void fix() {
        DisplayMetrics metrics = com.dh.base.utils.ResUtils.getResources().getDisplayMetrics();
        if (mSrcDensity == 0) {
            mSrcDensity = metrics.density;
            mSrcScaledDensity = metrics.scaledDensity;
            mSrcDensityDpi = metrics.densityDpi;
            com.dh.base.utils.ResUtils.getContext().registerComponentCallbacks(new ComponentCallbacks() {
                @Override
                public void onConfigurationChanged(Configuration newConfig) {
                    if (newConfig != null && newConfig.fontScale > 0) {
                        mSrcScaledDensity = com.dh.base.utils.ResUtils.getResources().getDisplayMetrics().scaledDensity;
                    }
                }

                @Override
                public void onLowMemory() {

                }
            });
        }
        if (mFixDensity == 0) {
//            float hDensity = metrics.heightPixels / height;
            float wDensity = metrics.widthPixels / BaseUtils.SCREEN_MATCHER_WIDTH;
            mFixDensity = wDensity;
            mFixScaledDensity = mFixDensity * (mSrcScaledDensity / mSrcDensity);
            mFixDensityDpi = (int) (mFixDensity * 160);
        }
        metrics.density = mFixDensity;
        metrics.scaledDensity = mFixScaledDensity;
        metrics.densityDpi = mFixDensityDpi;

        Activity topActivity = ActivityUtils.getTopActivity();
        if (topActivity != null) {
            //修改当前activity
            DisplayMetrics activityDisplayMetrics = topActivity.getResources().getDisplayMetrics();
            activityDisplayMetrics.density = mFixDensity;
            activityDisplayMetrics.scaledDensity = mFixScaledDensity;
            activityDisplayMetrics.densityDpi = mFixDensityDpi;
        }
    }

    public static void recover() {
        DisplayMetrics metrics = com.dh.base.utils.ResUtils.getResources().getDisplayMetrics();
        metrics.density = mSrcDensity;
        metrics.scaledDensity = mSrcScaledDensity;
        metrics.densityDpi = mSrcDensityDpi;
        Activity topActivity = ActivityUtils.getTopActivity();
        if (topActivity != null) {
            //修改当前activity
            DisplayMetrics activityDisplayMetrics = topActivity.getResources().getDisplayMetrics();
            activityDisplayMetrics.density = mSrcDensity;
            activityDisplayMetrics.scaledDensity = mSrcScaledDensity;
            activityDisplayMetrics.densityDpi = mSrcDensityDpi;
        }
    }

    public static void recoverDensity() {
        DisplayMetrics metrics = ResUtils.getResources().getDisplayMetrics();
        metrics.density = mSrcDensity;
    }

    public static float getSrcDensity() {
        return mSrcDensity;
    }

    public static float getFixDensity() {
        return mFixDensity;
    }
}
