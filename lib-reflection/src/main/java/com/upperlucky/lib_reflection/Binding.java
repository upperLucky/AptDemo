package com.upperlucky.lib_reflection;

import android.app.Activity;

import java.lang.reflect.Field;

/**
 * created by yunKun.wen on 2020/11/5
 * desc: 通过反射的方式
 */
public class Binding {
    public static void bind(Activity activity) {
        for (Field field : activity.getClass().getDeclaredFields()) {
            BindView bindView = field.getAnnotation(BindView.class);
            if (bindView != null) {
                try {
                    field.setAccessible(true);
                    field.set(activity, activity.findViewById(bindView.value()));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
