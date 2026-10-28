package org.chromium.base;

import android.os.Build;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import defpackage.a;
import defpackage.axig;
import defpackage.axii;
import defpackage.axij;
import defpackage.axir;
import defpackage.axqa;
import defpackage.axqe;
import internal.J.N;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import org.chromium.net.ApiVersion;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class AndroidInfo {
    public static Integer a;
    public static Boolean b;

    private AndroidInfo() {
    }

    public static final axir b(InputStream inputStream) {
        inputStream.getClass();
        return new axij(inputStream);
    }

    public static final void c(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    public static final boolean d(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        bArr.getClass();
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static axqa e(Object obj) {
        return ((axqe) obj).extensions;
    }

    public static void f(Object obj) {
        throw null;
    }

    public static final void g(Object obj) {
        e(obj).c();
    }

    public static int h() {
        return Integer.parseInt(ApiVersion.getCronetVersion().split("\\.")[0]) < 59 ? 3 : 49;
    }

    public static void i(ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
        }
    }

    public static void j(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("ByteBuffer is already full.");
        }
    }

    private static void nativeReadyForFields() {
        IAndroidInfo iAndroidInfo = new IAndroidInfo();
        iAndroidInfo.a = TextUtils.join(", ", Build.SUPPORTED_ABIS);
        iAndroidInfo.b = Build.FINGERPRINT.substring(0, Math.min(Build.FINGERPRINT.length(), SemanticState.Focused));
        iAndroidInfo.c = Build.ID;
        iAndroidInfo.d = Build.BOARD;
        iAndroidInfo.e = Build.BRAND;
        iAndroidInfo.f = Build.TYPE;
        iAndroidInfo.g = Build.VERSION.CODENAME;
        iAndroidInfo.h = Build.DEVICE;
        iAndroidInfo.i = Build.HARDWARE;
        iAndroidInfo.j = "eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE);
        iAndroidInfo.k = Build.MANUFACTURER;
        iAndroidInfo.l = Build.MODEL;
        iAndroidInfo.m = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT >= 36) {
            iAndroidInfo.n = a.at();
        } else {
            iAndroidInfo.n = Build.VERSION.SDK_INT * 100000;
        }
        iAndroidInfo.o = Build.VERSION.SECURITY_PATCH;
        iAndroidInfo.p = Build.VERSION.SDK_INT >= 31 ? Build.SOC_MANUFACTURER : "";
        iAndroidInfo.q = Build.VERSION.INCREMENTAL;
        N.MYc8mtnY(iAndroidInfo.e, iAndroidInfo.h, iAndroidInfo.c, iAndroidInfo.k, iAndroidInfo.l, iAndroidInfo.f, iAndroidInfo.d, iAndroidInfo.b, iAndroidInfo.q, iAndroidInfo.i, iAndroidInfo.g, iAndroidInfo.p, iAndroidInfo.a, iAndroidInfo.m, iAndroidInfo.n, iAndroidInfo.j, iAndroidInfo.o);
    }

    public final void a(long j, axig axigVar, int i, List list, int i2, int i3, List list2) {
        int i4;
        long j2;
        List list3;
        int i5;
        int i6 = i;
        int i7 = i2;
        List list4 = list2;
        if (i7 >= i3) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i8 = i7; i8 < i3; i8++) {
            if (((axii) list.get(i8)).b() < i6) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        axii axiiVar = (axii) list.get(i2);
        axii axiiVar2 = (axii) list.get(i3 - 1);
        if (i6 == axiiVar.b()) {
            int iIntValue = ((Number) list4.get(i7)).intValue();
            i7++;
            i4 = iIntValue;
            axiiVar = (axii) list.get(i7);
        } else {
            i4 = -1;
        }
        int i9 = i7 + 1;
        long j3 = 4;
        if (axiiVar.a(i6) == axiiVar2.a(i6)) {
            int iMin = Math.min(axiiVar.b(), axiiVar2.b());
            int i10 = 0;
            for (int i11 = i6; i11 < iMin && axiiVar.a(i11) == axiiVar2.a(i11); i11++) {
                i10++;
            }
            long j4 = j + (axigVar.b / 4) + 2;
            long j5 = i10;
            axigVar.p(-i10);
            axigVar.p(i4);
            int i12 = i6 + i10;
            while (i6 < i12) {
                axigVar.p(axiiVar.a(i6) & 255);
                i6++;
            }
            if (i9 == i3) {
                if (i12 != ((axii) list.get(i7)).b()) {
                    throw new IllegalStateException("Check failed.");
                }
                axigVar.p(((Number) list4.get(i7)).intValue());
                return;
            } else {
                long j6 = j4 + j5 + 1;
                axig axigVar2 = new axig();
                axigVar.p(-((int) ((axigVar2.b / 4) + j6)));
                a(j6, axigVar2, i12, list, i7, i3, list4);
                axigVar.n(axigVar2);
                return;
            }
        }
        int i13 = 1;
        while (i9 < i3) {
            if (((axii) list.get(i9 - 1)).a(i6) != ((axii) list.get(i9)).a(i6)) {
                i13++;
            }
            i9++;
        }
        long j7 = j + (axigVar.b / 4) + 2;
        int i14 = i13 << 1;
        axigVar.p(i13);
        axigVar.p(i4);
        for (int i15 = i7; i15 < i3; i15++) {
            byte bA = ((axii) list.get(i15)).a(i6);
            if (i15 == i7 || bA != ((axii) list.get(i15 - 1)).a(i6)) {
                axigVar.p(bA & 255);
            }
        }
        axig axigVar3 = new axig();
        int i16 = i7;
        while (i16 < i3) {
            int i17 = i6 + 1;
            byte bA2 = ((axii) list.get(i16)).a(i6);
            int i18 = i16 + 1;
            int i19 = i18;
            while (true) {
                if (i19 >= i3) {
                    j2 = j3;
                    i19 = i3;
                    break;
                } else {
                    j2 = j3;
                    if (bA2 != ((axii) list.get(i19)).a(i6)) {
                        break;
                    }
                    i19++;
                    j3 = j2;
                }
            }
            if (i18 == i19 && i17 == ((axii) list.get(i16)).b()) {
                axigVar.p(((Number) list4.get(i16)).intValue());
                int i20 = i19;
                list3 = list4;
                i5 = i20;
            } else {
                long j8 = ((long) i14) + j7;
                axigVar.p(-((int) ((axigVar3.b / j2) + j8)));
                int i21 = i19;
                list3 = list4;
                i5 = i21;
                a(j8, axigVar3, i17, list, i16, i5, list3);
            }
            i16 = i5;
            list4 = list3;
            i14 = i14;
            j3 = j2;
        }
        axigVar.n(axigVar3);
    }
}
