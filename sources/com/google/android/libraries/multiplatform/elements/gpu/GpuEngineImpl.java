package com.google.android.libraries.multiplatform.elements.gpu;

import android.graphics.Bitmap;
import android.hardware.HardwareBuffer;
import android.view.Surface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class GpuEngineImpl implements AutoCloseable {
    private static native long nativeCreate(int i);

    private static native void nativeDestroy(long j);

    private static native boolean nativeDrawFrame(long j);

    public static native void nativeFilterBitmap(int i, Bitmap bitmap, float f);

    public static native void nativeFilterHardwareBuffer(int i, HardwareBuffer hardwareBuffer, float f, int i2);

    private static native int nativeGetBackendType(long j);

    private static native boolean nativeIsSupported(long j);

    private static native void nativePause(long j);

    private static native void nativeResume(long j);

    private static native boolean nativeSurfaceChanged(long j, Surface surface, int i, int i2);

    private static native boolean nativeSurfaceCreated(long j, Surface surface);

    private static native void nativeSurfaceDestroyed(long j);

    private static native boolean nativeWaitForIdle(long j);

    @Override // java.lang.AutoCloseable
    public final void close() {
        throw null;
    }
}
