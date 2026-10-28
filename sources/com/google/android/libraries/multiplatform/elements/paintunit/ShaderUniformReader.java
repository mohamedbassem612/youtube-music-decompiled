package com.google.android.libraries.multiplatform.elements.paintunit;

import dalvik.annotation.optimization.CriticalNative;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ShaderUniformReader {
    private long a;

    public ShaderUniformReader(int i) {
        this.a = jniGetShaderHandle(i);
    }

    @CriticalNative
    private static native long jniGetShaderHandle(int i);

    @CriticalNative
    private static native int jniGetShaderId(long j);

    @CriticalNative
    private static native int jniGetUniformIntParam(long j, int i);

    @CriticalNative
    private static native float jniGetUniformParam(long j, int i);

    @CriticalNative
    private static native boolean jniIsFilter(long j);

    @CriticalNative
    private static native void jniReleaseShader(long j);

    public final float a(int i) {
        long j = this.a;
        if (j == 0) {
            return 0.0f;
        }
        return jniGetUniformParam(j, i);
    }

    public final int b() {
        long j = this.a;
        if (j == 0) {
            return 0;
        }
        return jniGetShaderId(j);
    }

    public final int c(int i) {
        long j = this.a;
        if (j == 0) {
            return 0;
        }
        return jniGetUniformIntParam(j, i);
    }

    public final void d() {
        long j = this.a;
        if (j != 0) {
            jniReleaseShader(j);
            this.a = 0L;
        }
    }

    public final boolean e() {
        long j = this.a;
        if (j == 0) {
            return false;
        }
        return jniIsFilter(j);
    }
}
