package com.google.mediapipe.framework;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class AndroidAssetUtil {
    public static synchronized boolean a(Context context) {
        return nativeInitializeAssetManager(context, context.getCacheDir().getAbsolutePath());
    }

    private static native boolean nativeInitializeAssetManager(Context context, String str);
}
