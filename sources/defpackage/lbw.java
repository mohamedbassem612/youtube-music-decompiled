package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class lbw {
    private static volatile Handler b;
    public volatile long a;
    private final leb c;
    private final Runnable d;

    protected lbw(leb lebVar) {
        if (lebVar == null) {
            throw new NullPointerException("null reference");
        }
        this.c = lebVar;
        this.d = new ihq(this, lebVar, 9, (short[]) null);
    }

    private final Handler e() {
        Handler handler;
        if (b != null) {
            return b;
        }
        synchronized (lbw.class) {
            if (b == null) {
                b = new afkg(this.c.aS().getMainLooper(), (byte[]) null);
            }
            handler = b;
        }
        return handler;
    }

    public final void a() {
        this.a = 0L;
        e().removeCallbacks(this.d);
    }

    public abstract void b();

    public final void c(long j) {
        a();
        if (j >= 0) {
            leb lebVar = this.c;
            lebVar.aV();
            this.a = System.currentTimeMillis();
            if (e().postDelayed(this.d, j)) {
                return;
            }
            lebVar.aT().c.b("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    public final boolean d() {
        return this.a != 0;
    }
}
