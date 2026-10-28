package com.google.research.xeno.effect;

import android.util.Pair;
import com.google.mediapipe.framework.GraphGlSyncToken;
import com.google.mediapipe.framework.TextureFrame;
import com.google.mediapipe.framework.TextureReleaseCallback;
import defpackage.atss;
import defpackage.atst;
import defpackage.atwa;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class Control {
    public final FloatSetting a;
    public final GpuBufferSetting b;
    public final IntSetting c;
    public final RuntimeOptionsSetting d;
    public final ColorSetting e;
    public final DoubleSetting f;

    /* JADX INFO: compiled from: PG */
    public class BoolSetting extends atss {
        private BoolSetting(long j) {
        }
    }

    /* JADX INFO: compiled from: PG */
    public class ColorSetting {
        public final long a;

        private ColorSetting(long j) {
            this.a = j;
        }
    }

    /* JADX INFO: compiled from: PG */
    public class DoubleSetting extends atss {
        public final long b;

        private DoubleSetting(long j) {
            this.b = j;
            Control.nativeGetDoubleRange(j);
        }
    }

    /* JADX INFO: compiled from: PG */
    public class FloatSetting extends atss {
        private final long b;

        private FloatSetting(long j) {
            this.b = j;
            Control.nativeGetFloatRange(j);
        }

        public final void a(float f) {
            long j = this.b;
            Control.nativeGetFloatValue(j);
            Control.nativeSetFloatValue(j, f);
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((atst) it.next()).b();
            }
        }
    }

    /* JADX INFO: compiled from: PG */
    public class GpuBufferSetting {
        private final long a;

        private GpuBufferSetting(long j) {
            this.a = j;
        }

        private static void releaseWithSyncToken(long j, TextureReleaseCallback textureReleaseCallback) {
            textureReleaseCallback.release(new GraphGlSyncToken(j));
        }

        public final void a(TextureFrame textureFrame) {
            long j = this.a;
            if (textureFrame == null) {
                Control.nativeUnsetGpuBufferValue(j);
            } else {
                Control.nativeSetGpuBufferValue(j, textureFrame.getTextureName(), textureFrame.getWidth(), textureFrame.getHeight(), textureFrame);
            }
        }
    }

    /* JADX INFO: compiled from: PG */
    public class IntSetting extends atss {
        public final long b;

        private IntSetting(long j) {
            this.b = j;
            Control.nativeGetIntRange(j);
        }

        public final int a() {
            return Control.nativeGetIntValue(this.b);
        }
    }

    /* JADX INFO: compiled from: PG */
    public class RuntimeOptionsSetting {
        private final long a;

        private RuntimeOptionsSetting(long j) {
            this.a = j;
        }

        public final void a(atwa atwaVar) {
            Control.nativeSetRuntimeOptionsValue(this.a, atwaVar.toByteArray());
        }
    }

    /* JADX INFO: compiled from: PG */
    public class StringSetting extends atss {
        private StringSetting(long j) {
        }
    }

    private Control(BoolSetting boolSetting, FloatSetting floatSetting, GpuBufferSetting gpuBufferSetting, IntSetting intSetting, RuntimeOptionsSetting runtimeOptionsSetting, StringSetting stringSetting, ColorSetting colorSetting, DoubleSetting doubleSetting) {
        this.a = floatSetting;
        this.b = gpuBufferSetting;
        this.c = intSetting;
        this.d = runtimeOptionsSetting;
        this.e = colorSetting;
        this.f = doubleSetting;
    }

    public static native Pair nativeGetDoubleRange(long j);

    public static native double nativeGetDoubleValue(long j);

    public static native Pair nativeGetFloatRange(long j);

    public static native float nativeGetFloatValue(long j);

    public static native Pair nativeGetIntRange(long j);

    public static native int nativeGetIntValue(long j);

    public static native void nativeSetColorValue(long j, byte[] bArr);

    public static native void nativeSetDoubleValue(long j, double d);

    public static native void nativeSetFloatValue(long j, float f);

    public static native void nativeSetGpuBufferValue(long j, int i, int i2, int i3, TextureReleaseCallback textureReleaseCallback);

    public static native void nativeSetIntValue(long j, int i);

    public static native void nativeSetRuntimeOptionsValue(long j, byte[] bArr);

    public static native void nativeUnsetGpuBufferValue(long j);
}
