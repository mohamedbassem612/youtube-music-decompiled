package defpackage;

import java.security.InvalidParameterException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tra implements Runnable {
    Runnable a;
    boolean b;
    boolean c;
    boolean d;
    tqz e;
    tra f;
    public final trh g;
    private final qci h;

    public tra(trk trkVar, Runnable runnable) {
        this.g = new trh(trkVar.b, (mbc) null, 64);
        this.a = runnable;
        this.h = trkVar.c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th;
        Runnable runnable = this.a;
        if (runnable == null || this.e == null) {
            if (trj.b != 0) {
                trh trhVar = this.g;
                trhVar.k = new InvalidParameterException(String.format("Task %s, cmd=%s, pool=%s", trhVar.c(), runnable == null ? "null" : "ok", this.e == null ? "null" : "ok"));
                return;
            }
            return;
        }
        if (trj.b != 0) {
            this.g.f(null);
        }
        try {
            AutoCloseable autoCloseableB = this.d ? afwt.b(56, this.h) : trr.a;
            try {
                runnable.run();
                autoCloseableB.close();
            } catch (Throwable th2) {
                try {
                    autoCloseableB.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (RuntimeException e) {
            this.g.k = e;
        }
        this.g.g();
        tqz tqzVar = this.e;
        this.a = null;
        synchronized (tqzVar) {
            tqzVar.g -= this.b ? 1 : 0;
            tqzVar.d.add(this);
            tqzVar.f++;
            tqzVar.e();
        }
        if (this.b) {
            tqzVar.f();
        }
        if (this.c && (th = this.g.k) != null) {
            throw ((RuntimeException) th);
        }
    }
}
