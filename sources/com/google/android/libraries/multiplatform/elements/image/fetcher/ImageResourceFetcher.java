package com.google.android.libraries.multiplatform.elements.image.fetcher;

import android.content.ComponentCallbacks2;
import android.hardware.HardwareBuffer;
import android.util.LruCache;
import defpackage.oud;
import defpackage.oue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ImageResourceFetcher {
    public static final LruCache a = new oud();
    public static final ComponentCallbacks2 b = new oue();
    public static volatile boolean c = false;
    public static final Object d = new Object();

    public static native HardwareBuffer nativeDecodeResource(int i, long j, long j2, int i2, int i3);
}
