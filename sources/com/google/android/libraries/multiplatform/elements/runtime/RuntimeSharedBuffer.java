package com.google.android.libraries.multiplatform.elements.runtime;

import dalvik.annotation.optimization.CriticalNative;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class RuntimeSharedBuffer {
    private final long a;

    public RuntimeSharedBuffer(long j) {
        this.a = j;
    }

    public static final long c() {
        return Memory.peekLong(jniGetThreadLocalAddress(), false);
    }

    @CriticalNative
    public static native long jniGetThreadLocalAddress();

    @CriticalNative
    private static native byte jniReadByteFallback(long j);

    @CriticalNative
    private static native float jniReadFloatFallback(long j);

    @CriticalNative
    private static native int jniReadIntFallback(long j);

    @CriticalNative
    private static native long jniReadLongFallback(long j);

    public final int a() {
        return (int) (Float.intBitsToFloat(Memory.peekInt(this.a + 8, false)) + 0.5f);
    }

    public final int b() {
        return (int) (Float.intBitsToFloat(Memory.peekInt(this.a + 4, false)) + 0.5f);
    }
}
