package com.google.cardboard.sdk;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class Initialize {
    static {
        System.loadLibrary("cardboard_sdk_jni");
    }

    private Initialize() {
    }

    public static void initialize(Context context) {
        nativeInitialize(context);
    }

    private static native void nativeInitialize(Context context);
}
