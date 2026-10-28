package com.google.android.libraries.video.mediaengine.textures;

import android.opengl.GLES30;
import android.util.Half;
import defpackage.a;
import defpackage.bvn;
import defpackage.rgi;
import j$.util.Optional;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class TonemapLutGenerator {
    public Optional a = Optional.empty();
    public Optional b = Optional.empty();

    public static final int a(int i) throws bvn {
        int[] iArr = new int[1];
        GLES30.glGenTextures(1, iArr, 0);
        int i2 = iArr[0];
        GLES30.glBindTexture(32879, i2);
        try {
            FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(393216).order(ByteOrder.nativeOrder()).asFloatBuffer();
            if (!nativeGenerateLut(i, 32, floatBufferAsFloatBuffer)) {
                throw new bvn(a.bR(i, "Failed to generate 3D LUT for color transfer: "));
            }
            floatBufferAsFloatBuffer.rewind();
            ShortBuffer shortBufferAsShortBuffer = ByteBuffer.allocateDirect(floatBufferAsFloatBuffer.remaining() << 1).order(ByteOrder.nativeOrder()).asShortBuffer();
            while (floatBufferAsFloatBuffer.hasRemaining()) {
                shortBufferAsShortBuffer.put(Half.toHalf(floatBufferAsFloatBuffer.get()));
            }
            shortBufferAsShortBuffer.rewind();
            GLES30.glTexImage3D(32879, 0, 34843, 32, 32, 32, 0, 6407, 5131, shortBufferAsShortBuffer);
            GLES30.glTexParameteri(32879, 10241, 9729);
            GLES30.glTexParameteri(32879, 10240, 9729);
            GLES30.glTexParameteri(32879, 10242, 33071);
            GLES30.glTexParameteri(32879, 10243, 33071);
            GLES30.glTexParameteri(32879, 32882, 33071);
            GLES30.glBindTexture(32879, 0);
            rgi.c("upload 3D LUT to GPU");
            return i2;
        } catch (bvn e) {
            GLES30.glDeleteTextures(1, iArr, 0);
            throw e;
        }
    }

    private static native boolean nativeGenerateLut(int i, int i2, FloatBuffer floatBuffer);
}
