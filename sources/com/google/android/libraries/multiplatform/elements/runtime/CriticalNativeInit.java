package com.google.android.libraries.multiplatform.elements.runtime;

import dalvik.annotation.optimization.CriticalNative;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class CriticalNativeInit {
    private CriticalNativeInit() {
    }

    @CriticalNative
    private static native boolean critical32(int i);

    @CriticalNative
    private static native boolean critical64(long j);
}
