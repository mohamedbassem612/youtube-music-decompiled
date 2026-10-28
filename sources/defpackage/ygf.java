package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ygf {
    static final long a;
    public final zgy b;
    public final zjr c;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a = 5000000L;
    }

    public ygf(zgy zgyVar, zjr zjrVar) {
        zkf.d(zgyVar);
        this.b = zgyVar;
        this.c = zjrVar;
    }

    public static void a(bye byeVar) {
        try {
            byeVar.f();
        } catch (IOException unused) {
        }
    }

    public final elr b(long j, long j2) {
        long j3 = j;
        long j4 = j2;
        if (j3 <= 0 || j4 <= 0) {
            return null;
        }
        long j5 = a;
        double d = j5;
        double d2 = j4;
        int iCeil = (int) Math.ceil(d2 / d);
        int[] iArr = new int[iCeil];
        long[] jArr = new long[iCeil];
        long[] jArr2 = new long[iCeil];
        long[] jArr3 = new long[iCeil];
        int i = 0;
        long j6 = j3;
        while (i < iCeil) {
            double d3 = d2;
            long j7 = (long) ((j3 / d3) * d);
            iArr[i] = (int) Math.min(j7, j6);
            long j8 = i;
            jArr[i] = j7 * j8;
            long jMin = Math.min(j4, j5);
            jArr2[i] = jMin;
            jArr3[i] = j8 * j5;
            j6 -= (long) iArr[i];
            j4 -= jMin;
            i++;
            j3 = j;
            d2 = d3;
        }
        return elr.J(new cuz(iArr, jArr, jArr2, jArr3));
    }
}
