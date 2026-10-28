package defpackage;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Handler;
import android.os.SystemClock;
import android.view.PixelCopy;
import android.view.PixelCopy$OnPixelCopyFinishedListener;
import android.view.Surface;
import java.util.Locale;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zlr {
    public final Bitmap a;
    public final ydm b;
    private final tyy c;
    private final tyy d;
    private final ScheduledExecutorService e;
    private final aunn f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final float k;
    private int l;
    private int m;
    private Future n;
    private long o;
    private final long p;

    public zlr(ScheduledExecutorService scheduledExecutorService, aunn aunnVar, zjr zjrVar, ydm ydmVar, tyy tyyVar, tyy tyyVar2) {
        this.e = scheduledExecutorService;
        this.b = ydmVar;
        this.c = tyyVar;
        this.d = tyyVar2;
        this.k = zjrVar.S().R;
        this.j = zjrVar.S().S;
        this.p = zjrVar.S().T;
        int i = zjrVar.S().Q;
        this.g = Color.red(i);
        this.h = Color.green(i);
        this.i = Color.blue(i);
        this.a = Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
        this.f = aunnVar;
    }

    private final Future f(Runnable runnable, TimeUnit timeUnit) {
        return this.e.schedule(new yag((Object) this, (Object) runnable, (Object) timeUnit, 11, (byte[]) null), 1000L, timeUnit);
    }

    public final synchronized String a() {
        String str;
        Future future = this.n;
        if (future != null) {
            future.cancel(false);
            this.n = null;
        }
        if (this.l == 0) {
            str = "";
        } else {
            str = String.format(Locale.US, "m.%.2f;t.%d", Float.valueOf(this.m / this.l), Integer.valueOf(this.l));
            this.l = 0;
            this.m = 0;
        }
        return str;
    }

    public final synchronized void b(Bitmap bitmap) {
        int[] iArr = new int[100];
        bitmap.getPixels(iArr, 0, 10, 0, 0, 10, 10);
        float f = 0.0f;
        for (int i = 0; i < 100; i++) {
            int i2 = iArr[i];
            int iRed = this.g - Color.red(i2);
            int i3 = this.i;
            double dPow = Math.pow(iRed, 2.0d);
            int iBlue = i3 - Color.blue(i2);
            if (Math.sqrt(dPow + Math.pow(this.h - Color.green(i2), 2.0d) + Math.pow(iBlue, 2.0d)) < this.j) {
                f += 1.0f;
            }
        }
        if (f / 100.0f >= this.k) {
            this.m++;
        }
        this.l++;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, zlm] */
    public final synchronized void c() {
        ?? A;
        Surface surfaceF;
        if (Boolean.TRUE.equals(this.c.a()) || (A = this.d.a()) == 0 || A.B() == zlo.SECURE_SURFACE || (surfaceF = A.f()) == null || !surfaceF.isValid()) {
            return;
        }
        PixelCopy.request(surfaceF, this.a, new PixelCopy$OnPixelCopyFinishedListener() { // from class: zlq
            public final void onPixelCopyFinished(int i) {
                zlr zlrVar = this.a;
                if (i == 0) {
                    zlrVar.b(zlrVar.a);
                } else if (i != 3) {
                    Object obj = zlrVar.b.a;
                    ((yyv) obj).k.post(new rir(obj, i, 13));
                }
            }
        }, (Handler) this.f.io());
    }

    public final synchronized void d() {
        this.o = SystemClock.elapsedRealtime();
        if (this.n != null) {
            return;
        }
        this.n = f(new zdv(this, 18), TimeUnit.MILLISECONDS);
    }

    public final synchronized void e(Runnable runnable, TimeUnit timeUnit) {
        zkf.d(this.n);
        if (this.n.isCancelled()) {
            return;
        }
        long j = this.p;
        if (j == 0 || SystemClock.elapsedRealtime() - this.o <= j) {
            this.n = f(runnable, timeUnit);
        } else {
            this.n = null;
        }
    }
}
