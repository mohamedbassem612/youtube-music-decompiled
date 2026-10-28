package com.google.vr.sdk.audio;

import android.util.Log;
import app.rive.semantics.SemanticState;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class GvrAudioSurround {
    private static UnsatisfiedLinkError b;
    public long a;

    static {
        try {
            System.loadLibrary("gvr_audio");
        } catch (UnsatisfiedLinkError e) {
            b = e;
        }
    }

    public GvrAudioSurround(int i, int i2, int i3) {
        this.a = 0L;
        UnsatisfiedLinkError unsatisfiedLinkError = b;
        if (unsatisfiedLinkError != null) {
            throw unsatisfiedLinkError;
        }
        this.a = nativeInitialize(i, i2, i3, SemanticState.ReadOnly);
    }

    private native long nativeInitialize(int i, int i2, int i3, int i4);

    private native void nativeRelease(long j);

    private native void nativeSetOrientationQuaternion(long j, float f, float f2, float f3, float f4);

    public final void a() {
        nativeRelease(this.a);
        this.a = 0L;
    }

    public final void b(float f, float f2, float f3, float f4) {
        nativeSetOrientationQuaternion(this.a, f, f2, f3, f4);
    }

    protected final void finalize() throws Throwable {
        try {
            if (this.a != 0) {
                Log.w("GvrAudioSurround", "GvrAudioSurround not correctly released");
                a();
            }
        } finally {
            super.finalize();
        }
    }

    public native int nativeAddInput(long j, ByteBuffer byteBuffer, int i, int i2);

    public native void nativeFlush(long j);

    public native int nativeGetAvailableOutputSize(long j);

    public native int nativeGetOutput(long j, ByteBuffer byteBuffer, int i, int i2);

    public native boolean nativeTriggerProcessing(long j);
}
