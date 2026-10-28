package org.chromium.base;

import android.content.Context;
import defpackage.a;
import defpackage.ank$$ExternalSyntheticApiModelOutline0;
import defpackage.avlu;
import defpackage.awoq;
import defpackage.awud;
import defpackage.awyx;
import defpackage.awzc;
import defpackage.axfp;
import defpackage.axfq;
import defpackage.axiq;
import defpackage.axkl;
import defpackage.axlp;
import defpackage.axlt;
import defpackage.axlx;
import defpackage.axly;
import defpackage.axlz;
import defpackage.axna;
import defpackage.axnm;
import defpackage.lpa;
import defpackage.lpf;
import defpackage.pw$$ExternalSyntheticApiModelOutline0;
import defpackage.yby;
import internal.org.jni_zero.JniZero;
import java.util.concurrent.CancellationException;
import org.chromium.net.CronetException;
import org.chromium.net.InlineExecutionProhibitedException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
@FunctionalInterface
public interface Callback {

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes2.dex */
    public final class Helper {
        public static Object a(axna axnaVar, Class cls) throws Exception {
            try {
                return axnaVar.a();
            } catch (Exception e) {
                if (pw$$ExternalSyntheticApiModelOutline0.m930m((Object) e)) {
                    InlineExecutionProhibitedException inlineExecutionProhibitedException = new InlineExecutionProhibitedException();
                    inlineExecutionProhibitedException.initCause(e);
                    throw inlineExecutionProhibitedException;
                }
                if (pw$$ExternalSyntheticApiModelOutline0.m$1(e)) {
                    throw b(e);
                }
                if (cls.isInstance(e)) {
                    throw e;
                }
                throw e;
            }
        }

        public static CronetException b(Exception exc) {
            if (!pw$$ExternalSyntheticApiModelOutline0.m$1(exc)) {
                throw new IllegalArgumentException("Not an Android Cronet exception", exc);
            }
            if (ank$$ExternalSyntheticApiModelOutline0.m218m((Object) exc)) {
                return new axlz(pw$$ExternalSyntheticApiModelOutline0.m925m((Object) exc));
            }
            if (pw$$ExternalSyntheticApiModelOutline0.m$2(exc)) {
                return new axly(pw$$ExternalSyntheticApiModelOutline0.m924m((Object) exc), false);
            }
            return pw$$ExternalSyntheticApiModelOutline0.m$3(exc) ? new axlt(pw$$ExternalSyntheticApiModelOutline0.m922m((Object) exc)) : new axlx(pw$$ExternalSyntheticApiModelOutline0.m923m((Object) exc));
        }

        public static axkl c(Context context) {
            boolean z = false;
            try {
                Class.forName("axok", false, axnm.class.getClassLoader());
                z = true;
            } catch (ClassNotFoundException unused) {
            }
            return axlp.a(context, true, axnm.a(context).getBoolean("android.net.http.EnableTelemetry", !z));
        }

        public static int d() {
            return Boolean.parseBoolean(System.getProperty("BROTLI_ENABLE_ASSERTS")) ? 1 : 0;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0021  */
        /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
        public static final int e(axiq axiqVar, int i) {
            int i2;
            int length = axiqVar.e.length - 1;
            int i3 = 0;
            while (i3 <= length) {
                int i4 = i + 1;
                i2 = (i3 + length) >>> 1;
                int i5 = axiqVar.f[i2];
                if (i5 < i4) {
                    i3 = i2 + 1;
                } else {
                    if (i5 <= i4) {
                        if (i2 < 0) {
                            return ~i2;
                        }
                        return i2;
                    }
                    length = i2 - 1;
                }
            }
            i2 = (-i3) - 1;
            if (i2 < 0) {
                return ~i2;
            }
            return i2;
        }

        public static int f(int i) {
            switch (i) {
                case -1:
                    return 1;
                case 0:
                    return 2;
                case 1:
                    return 3;
                case 2:
                    return 4;
                case 3:
                    return 5;
                case 4:
                    return 6;
                case 5:
                    return 7;
                case 6:
                    return 8;
                case 7:
                    return 9;
                case 8:
                    return 10;
                case 9:
                    return 11;
                case 10:
                    return 12;
                case 11:
                    return 13;
                case 12:
                    return 14;
                case 13:
                    return 15;
                case 14:
                    return 16;
                case 15:
                    return 17;
                case 16:
                    return 18;
                case 17:
                    return 19;
                default:
                    return 0;
            }
        }

        public static int g(int i) {
            if (i == 99) {
                return 100;
            }
            switch (i) {
                case 0:
                    return 1;
                case 1:
                    return 2;
                case 2:
                    return 3;
                case 3:
                    return 4;
                case 4:
                    return 5;
                case 5:
                    return 6;
                case 6:
                    return 7;
                case 7:
                    return 8;
                case 8:
                    return 9;
                case 9:
                    return 10;
                case 10:
                    return 11;
                case 11:
                    return 12;
                case 12:
                    return 13;
                case 13:
                    return 14;
                case 14:
                    return 15;
                case 15:
                    return 16;
                case 16:
                    return 17;
                case 17:
                    return 18;
                default:
                    return 0;
            }
        }

        public static final Object h(lpa lpaVar, awoq awoqVar) {
            if (!lpaVar.i()) {
                awud awudVar = new awud(JniZero.q(awoqVar), 1);
                awudVar.w();
                lpaVar.l(axfp.a, new axfq(awudVar));
                return awudVar.j();
            }
            Exception excE = lpaVar.e();
            if (excE != null) {
                throw excE;
            }
            if (((lpf) lpaVar).c) {
                throw new CancellationException(a.bV(lpaVar, "Task ", " was cancelled normally."));
            }
            return lpaVar.f();
        }

        public static final awzc i(avlu avluVar) {
            return new awyx(new yby(avluVar, (awoq) null, 4));
        }

        static void onBooleanResultFromNative(Callback callback, boolean z) {
            callback.a();
        }

        static void onIntResultFromNative(Callback callback, int i) {
            callback.a();
        }

        static void onLongResultFromNative(Callback callback, long j) {
            callback.a();
        }

        static void onObjectResultFromNative(Callback callback, Object obj) {
            callback.a();
        }
    }

    void a();
}
