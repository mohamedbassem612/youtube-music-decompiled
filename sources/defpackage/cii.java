package defpackage;

import android.os.SystemClock;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cii implements bzg {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public volatile boolean b;
    private final bzg c;

    public cii(bzg bzgVar) {
        this.c = bzgVar;
    }

    private static boolean e(byi byiVar, boolean z) {
        return z && !byiVar.f(8);
    }

    @Override // defpackage.bzg
    public final void a(bye byeVar, byi byiVar, boolean z, int i) {
        String str;
        csi csiVar;
        bzg bzgVar = this.c;
        if (bzgVar != null) {
            bzgVar.a(byeVar, byiVar, z, i);
        }
        if (this.b || !e(byiVar, z) || (str = byiVar.c) == null || (csiVar = (csi) this.a.get(str)) == null) {
            return;
        }
        synchronized (csiVar) {
            long j = i;
            csiVar.c += j;
            csiVar.f += j;
        }
    }

    @Override // defpackage.bzg
    public final void b(bye byeVar, byi byiVar, boolean z) {
        String str;
        csi csiVar;
        ArrayDeque arrayDeque;
        bzg bzgVar = this.c;
        if (bzgVar != null) {
            bzgVar.b(byeVar, byiVar, z);
        }
        if (this.b || !e(byiVar, z) || (str = byiVar.c) == null || (csiVar = (csi) this.a.get(str)) == null) {
            return;
        }
        synchronized (csiVar) {
            ahno.O(csiVar.a > 0);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = (int) (jElapsedRealtime - csiVar.b);
            long j2 = 0;
            if (j > 0) {
                csh cshVar = csiVar.g;
                long j3 = csiVar.c;
                long j4 = 1000 * j;
                while (true) {
                    arrayDeque = cshVar.a;
                    if (arrayDeque.size() < 10) {
                        break;
                    }
                    csg csgVar = (csg) arrayDeque.remove();
                    double d = cshVar.b;
                    long j5 = j2;
                    double d2 = csgVar.a;
                    double d3 = csgVar.b;
                    cshVar.b = d - (d2 * d3);
                    cshVar.c -= d3;
                    j2 = j5;
                    jElapsedRealtime = jElapsedRealtime;
                }
                long j6 = jElapsedRealtime;
                long j7 = j2;
                double dSqrt = Math.sqrt(j3);
                SystemClock.elapsedRealtime();
                csg csgVar2 = new csg((j3 * 8000000) / j4, dSqrt);
                arrayDeque.add(csgVar2);
                double d4 = cshVar.b;
                double d5 = csgVar2.a;
                double d6 = csgVar2.b;
                cshVar.b = d4 + (d5 * d6);
                cshVar.c += d6;
                int i = csiVar.e + 1;
                csiVar.e = i;
                if (i > 0 && csiVar.f > j7) {
                    csiVar.d = arrayDeque.isEmpty() ? Long.MIN_VALUE : (long) (cshVar.b / cshVar.c);
                }
                int i2 = (int) j;
                long j8 = csiVar.c;
                long j9 = csiVar.d;
                if (j9 != Long.MIN_VALUE) {
                    csiVar.h.A(i2, j8, j9);
                }
                csiVar.b = j6;
                csiVar.c = j7;
            }
            csiVar.a--;
        }
    }

    @Override // defpackage.bzg
    public final void c(bye byeVar, byi byiVar, boolean z) {
        bzg bzgVar = this.c;
        if (bzgVar != null) {
            bzgVar.c(byeVar, byiVar, z);
        }
    }

    @Override // defpackage.bzg
    public final void d(bye byeVar, byi byiVar, boolean z) {
        String str;
        bzg bzgVar = this.c;
        if (bzgVar != null) {
            bzgVar.d(byeVar, byiVar, z);
        }
        if (this.b || !e(byiVar, z) || (str = byiVar.c) == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.a;
        concurrentHashMap.putIfAbsent(str, new csi(new zs((byte[]) null, (byte[]) null, (byte[]) null)));
        csi csiVar = (csi) concurrentHashMap.get(str);
        if (csiVar != null) {
            synchronized (csiVar) {
                if (csiVar.a == 0) {
                    csiVar.b = SystemClock.elapsedRealtime();
                }
                csiVar.a++;
            }
        }
    }
}
