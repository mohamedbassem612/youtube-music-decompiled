package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.ext.SdkExtensions;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class rx {
    private static volatile a a;

    private rx() {
    }

    public static void a() {
        if (a == null) {
            synchronized (rx.class) {
                if (a == null) {
                    a = new a();
                }
            }
        }
    }

    public static ResolveInfo b(Context context) {
        return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
    }

    public static String c(ro roVar) {
        roVar.getClass();
        if (roVar instanceof rl) {
            return "image/*";
        }
        if (roVar instanceof rn) {
            return "video/*";
        }
        if (roVar instanceof rm) {
            throw null;
        }
        if (roVar instanceof rk) {
            return null;
        }
        throw new awmj();
    }

    public static boolean d() {
        if (Build.VERSION.SDK_INT < 33) {
            return Build.VERSION.SDK_INT >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
        }
        return true;
    }

    public static int e(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long f(bwb bwbVar, int i, int i2) {
        bwbVar.P(i);
        if (bwbVar.d() >= 5) {
            int i3 = bwbVar.i();
            if ((8388608 & i3) == 0 && ((i3 >> 8) & 8191) == i2 && (i3 & 32) != 0 && bwbVar.n() >= 7 && bwbVar.d() >= 7 && (bwbVar.n() & 16) == 16) {
                byte[] bArr = new byte[6];
                bwbVar.K(bArr, 0, 6);
                return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
            }
        }
        return -9223372036854775807L;
    }

    public static /* synthetic */ int g(int i, int i2) {
        long j = ((long) i) + ((long) i2);
        int i3 = (int) j;
        if (j == i3) {
            return i3;
        }
        throw new ArithmeticException();
    }

    public static int h(dqp dqpVar, int i, int i2, int i3) {
        ahno.F(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        g(g(i4, i5), 1 << i3);
        if (dqpVar.f() < i) {
            return -1;
        }
        int i6 = dqpVar.i(i);
        if (i6 == i4) {
            if (dqpVar.f() < i2) {
                return -1;
            }
            int i7 = dqpVar.i(i2);
            i6 += i7;
            if (i7 == i5) {
                if (dqpVar.f() >= i3) {
                    return i6 + dqpVar.i(i3);
                }
                return -1;
            }
        }
        return i6;
    }

    public static void i(dqp dqpVar) {
        dqpVar.s(3);
        dqpVar.s(8);
        boolean zU = dqpVar.u();
        boolean zU2 = dqpVar.u();
        if (zU) {
            dqpVar.s(5);
        }
        if (zU2) {
            dqpVar.s(6);
        }
    }

    public static void j(dqp dqpVar) {
        int i;
        int i2 = dqpVar.i(2);
        if (i2 == 0) {
            dqpVar.s(6);
            return;
        }
        int iH = h(dqpVar, 5, 8, 16) + 1;
        if (i2 == 1) {
            dqpVar.s(iH * 7);
            return;
        }
        if (i2 == 2) {
            boolean zU = dqpVar.u();
            int i3 = true != zU ? 5 : 1;
            int i4 = true == zU ? 7 : 5;
            int i5 = true == zU ? 8 : 6;
            int i6 = 0;
            while (i6 < iH) {
                if (dqpVar.u()) {
                    dqpVar.s(7);
                    i = 0;
                } else {
                    if (dqpVar.i(2) == 3 && dqpVar.i(i4) * i3 != 0) {
                        dqpVar.r();
                    }
                    i = dqpVar.i(i5) * i3;
                    if (i != 0 && i != 180) {
                        dqpVar.r();
                    }
                    dqpVar.r();
                }
                if (i != 0 && i != 180 && dqpVar.u()) {
                    i6++;
                }
                i6++;
            }
        }
    }

    public static boolean k(dqp dqpVar) {
        dqpVar.s(3);
        boolean zU = dqpVar.u();
        if (zU) {
            dqpVar.s(13);
        }
        return zU;
    }
}
