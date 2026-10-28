package defpackage;

import android.graphics.Bitmap;
import android.hardware.HardwareBuffer;
import android.os.Build;
import com.google.android.libraries.multiplatform.elements.gpu.GpuEngineImpl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nvb {
    public static void a(Bitmap bitmap, float f) {
        if (bitmap == null || f <= 0.0f) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 31 && bitmap.getConfig() == Bitmap.Config.HARDWARE) {
            try {
                HardwareBuffer hardwareBuffer = bitmap.getHardwareBuffer();
                if (hardwareBuffer != null) {
                    if (f > 0.0f && f > 0.0f) {
                        try {
                            GpuEngineImpl.nativeFilterHardwareBuffer(2, hardwareBuffer, f, 3);
                        } catch (Throwable th) {
                            try {
                                hardwareBuffer.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    hardwareBuffer.close();
                    return;
                }
            } catch (Throwable unused) {
            }
        }
        if (f > 0.0f) {
            GpuEngineImpl.nativeFilterBitmap(2, bitmap, f);
        }
    }
}
