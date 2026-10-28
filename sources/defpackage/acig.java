package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acig {
    public final acic a;
    public final Executor b;
    public final mbc c;
    public volatile acie e;
    public boolean f;
    public volatile yhi h;
    public final LinkedBlockingQueue g = new LinkedBlockingQueue();
    private final Runnable i = new abyz(this, 8);
    public volatile boolean d = false;

    public acig(Executor executor, acic acicVar, mbc mbcVar) {
        this.a = new acid(this, acicVar);
        this.b = executor;
        this.c = mbcVar;
    }

    public final void a(Runnable runnable) {
        if (a.x()) {
            runnable.run();
        } else {
            this.b.execute(runnable);
        }
    }

    public final void b() {
        a(this.i);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, rsu] */
    public final void c() {
        taq.d();
        if (this.h != null) {
            yhi yhiVar = this.h;
            ((acm) yhiVar.b).a = null;
            yhiVar.a.R();
            this.h = null;
        }
        this.e = null;
        this.f = false;
        this.g.clear();
    }

    public final void d(boolean z) {
        this.d = z;
        b();
    }

    public final boolean e() {
        return this.e != null;
    }
}
