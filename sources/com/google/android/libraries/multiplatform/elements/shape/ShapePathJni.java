package com.google.android.libraries.multiplatform.elements.shape;

import dalvik.annotation.optimization.FastNative;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ShapePathJni {
    private ShapePathJni() {
    }

    @FastNative
    public static native byte[] jniBuildOuterCornerPath(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10);

    @FastNative
    public static native long jniGetNodePathDataPtr(long j);

    @FastNative
    public static native int jniGetNodePathDataSize(long j);

    @FastNative
    public static native byte[] jniParseSvgPath(String str);
}
