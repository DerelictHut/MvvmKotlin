package com.dh.base.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Spanned;

import androidx.annotation.ArrayRes;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;

import com.blankj.utilcode.util.ColorUtils;
import com.blankj.utilcode.util.EncodeUtils;
import com.blankj.utilcode.util.ResourceUtils;
import com.blankj.utilcode.util.StringUtils;
import com.blankj.utilcode.util.Utils;

/**
 * @author ...
 */
public class ResUtils {

    public static Context getContext() {
        return Utils.getApp();
    }

    public static Resources getResources() {
        return getContext().getResources();
    }

    public static String getString(@StringRes int id) {
        return getResources().getString(id);
    }

    public static String getString(@StringRes int id, Object... formatArgs) {
        return StringUtils.getString(id, formatArgs);
    }

    public static Spanned getHtml(@StringRes int id, Object... formatArgs) {
        //String的\n替换<br/>,解决不换行问题
        if (formatArgs != null) {
            for (int i = 0; i < formatArgs.length; i++) {
                if (formatArgs[i] instanceof String) {
                    String str = (String) formatArgs[i];
                    formatArgs[i] = str.replaceAll("\\n", "<br/>");
                }
            }
        }
        return (Spanned) EncodeUtils.htmlDecode(getString(id, formatArgs));
    }

    public static String[] getStringArray(@ArrayRes int id) {
        return getResources().getStringArray(id);
    }

    public static int getColor(@ColorRes int id) {
        return ColorUtils.getColor(id);
    }

    public static ColorStateList getColorStateList(@ColorRes int id) {
        return ContextCompat.getColorStateList(getContext(), id);
    }

    public static int getDimension(@DimenRes int id) {
        return (int) getResources().getDimension(id);
    }

    public static Drawable getDrawable(@DrawableRes int id) {
        return ResourceUtils.getDrawable(id);
    }
}
