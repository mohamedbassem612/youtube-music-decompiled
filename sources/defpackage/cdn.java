package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cdn {
    public final cdm a;
    public int b;
    public Object c;
    public final Looper d;
    public final long e = -9223372036854775807L;
    private final cdl f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;

    public cdn(cdl cdlVar, cdm cdmVar, Looper looper) {
        this.f = cdlVar;
        this.a = cdmVar;
        this.d = looper;
    }

    public final synchronized void a(boolean z) {
        this.h |= z;
        this.i = true;
        notifyAll();
    }

    public final synchronized boolean b() {
        return this.j;
    }

    public final synchronized void c(long j) {
        ahno.O(this.g);
        ahno.O(this.d.getThread() != Thread.currentThread());
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (!this.i) {
            if (j <= 0) {
                throw new TimeoutException("Message delivery timed out.");
            }
            wait(j);
            j = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
    }

    public final synchronized void d() {
        ahno.O(this.g);
        this.j = true;
        a(false);
    }

    public final void e() {
        if (this.g) {
            throw new IllegalStateException();
        }
        this.g = true;
        ccs ccsVar = (ccs) this.f;
        if (!ccsVar.m && ccsVar.f.getThread().isAlive()) {
            ccsVar.e.k(14, this).p();
        } else {
            bvx.e("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }

    public final void f(Object obj) {
        if (this.g) {
            throw new IllegalStateException();
        }
        this.c = obj;
    }

    public final void g(int i) {
        if (this.g) {
            throw new IllegalStateException();
        }
        this.b = i;
    }
}
