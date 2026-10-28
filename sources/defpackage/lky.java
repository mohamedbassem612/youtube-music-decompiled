package defpackage;

import android.content.Context;
import android.os.SystemClock;
import j$.util.concurrent.ThreadLocalRandom;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lky implements AutoCloseable {
    private final int c;
    private final Context d;
    private final float e;
    private int f = 13;
    private final long a = System.currentTimeMillis();
    private final long b = SystemClock.uptimeMillis();

    public lky(Context context, int i, float f) {
        this.c = i;
        this.d = context;
        this.e = f;
    }

    public final void a() {
        this.f = 0;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Context context = this.d;
        if (lkx.a == null) {
            synchronized (lkx.b) {
                if (lkx.a == null) {
                    lkx.a = new lkx(context);
                }
            }
        }
        int i = this.c;
        lkx lkxVar = lkx.a;
        int i2 = this.f;
        long j = this.a;
        long j2 = this.b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jUptimeMillis = SystemClock.uptimeMillis() - j2;
        if (ThreadLocalRandom.current().nextFloat() < this.e) {
            lkxVar.a(i, i2, j, jCurrentTimeMillis, (int) jUptimeMillis);
        }
    }
}
