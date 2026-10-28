package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kht {
    public static final Object a = new Object();
    khs d;
    Runnable e;
    private final long f;
    private final String g;
    long b = -1;
    long c = 0;
    private final Handler h = new afkg(Looper.getMainLooper(), (byte[]) null);

    public kht(long j, String str) {
        this.f = j;
        this.g = str;
        new khn("RequestTracker", str);
    }

    private final void f(int i, Object obj) {
        khn.e();
        Object obj2 = a;
        synchronized (obj2) {
            if (this.d != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                khs khsVar = this.d;
                kro.l(khsVar);
                khsVar.a(this.g, this.b, i, obj, this.c, jCurrentTimeMillis);
            }
            this.b = -1L;
            this.d = null;
            synchronized (obj2) {
                try {
                    Runnable runnable = this.e;
                    if (runnable != null) {
                        this.h.removeCallbacks(runnable);
                        this.e = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void a(long j, khs khsVar) {
        khs khsVar2;
        long j2;
        long j3;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Object obj = a;
        synchronized (obj) {
            khsVar2 = this.d;
            j2 = this.b;
            j3 = this.c;
            this.b = j;
            this.d = khsVar;
            this.c = jCurrentTimeMillis;
        }
        if (khsVar2 != null) {
            khsVar2.b(this.g, j2, j3, jCurrentTimeMillis);
        }
        synchronized (obj) {
            Runnable runnable = this.e;
            if (runnable != null) {
                this.h.removeCallbacks(runnable);
            }
            kcx kcxVar = new kcx(this, 9);
            this.e = kcxVar;
            this.h.postDelayed(kcxVar, this.f);
        }
    }

    public final boolean b(long j) {
        boolean z;
        synchronized (a) {
            long j2 = this.b;
            z = false;
            if (j2 != -1 && j2 == j) {
                z = true;
            }
        }
        return z;
    }

    public final boolean c() {
        boolean z;
        synchronized (a) {
            z = this.b != -1;
        }
        return z;
    }

    public final void d(int i) {
        synchronized (a) {
            if (c()) {
                String.format(Locale.ROOT, "clearing request %d", Long.valueOf(this.b));
                f(i, null);
            }
        }
    }

    public final void e(long j, int i, Object obj) {
        synchronized (a) {
            if (b(j)) {
                String.format(Locale.ROOT, "request %d completed", Long.valueOf(j));
                f(i, obj);
            }
        }
    }
}
