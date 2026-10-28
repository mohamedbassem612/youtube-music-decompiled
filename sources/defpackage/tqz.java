package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tqz {
    tra b;
    tra c;
    volatile int e;
    volatile int f;
    volatile int g;
    volatile int h;
    volatile boolean i;
    volatile int j;
    public final mbc k;
    private final Executor l;
    private final boolean n;
    private final boolean o;
    private int p;
    final List d = new ArrayList();
    public final awlk a = new awlk();
    private final awly m = new awlu(new awlt(16));

    public tqz(Executor executor, mbc mbcVar, boolean z, boolean z2) {
        this.l = executor;
        this.k = mbcVar;
        this.n = z;
        this.o = z2;
    }

    public final synchronized void a(tra traVar) {
        while (traVar != null) {
            tra traVar2 = traVar.f;
            tra traVar3 = this.c;
            if (traVar3 == null) {
                this.c = traVar;
                this.b = traVar;
            } else {
                traVar3.f = traVar;
                this.c = traVar;
            }
            traVar.f = null;
            traVar = traVar2;
        }
        f();
    }

    public final synchronized void b(int i) {
        this.h += i;
        f();
    }

    public final synchronized void c(List list) {
        list.addAll(this.d);
    }

    public final synchronized void d(int i) {
        if (this.i) {
            this.j += i;
        }
        this.e += i;
    }

    final void e() {
        int iMax;
        if (!this.i || (iMax = Math.max(0, (this.e - this.j) - this.f)) > this.h) {
            return;
        }
        int i = this.h - iMax;
        int i2 = this.p;
        if (i > i2) {
            this.m.kk(Integer.valueOf(i - i2));
            this.p = i;
        }
        if (iMax == 0) {
            this.a.kn();
            this.m.kn();
        }
    }

    final void f() {
        tra traVar;
        synchronized (this) {
            traVar = null;
            tra traVar2 = null;
            while (this.g < this.h && this.b != null) {
                this.g++;
                tra traVar3 = this.b;
                tra traVar4 = traVar3.f;
                this.b = traVar4;
                if (traVar4 == null) {
                    this.c = null;
                }
                if (traVar2 == null) {
                    traVar = traVar3;
                } else {
                    traVar2.f = traVar3;
                }
                traVar3.f = null;
                traVar2 = traVar3;
            }
        }
        while (traVar != null) {
            tra traVar5 = traVar.f;
            traVar.f = null;
            boolean z = this.n;
            boolean z2 = this.o;
            traVar.e = this;
            traVar.b = true;
            traVar.c = z;
            traVar.d = z2;
            mbc mbcVar = this.k;
            if (mbcVar != null) {
                traVar.g.g = mbcVar;
            }
            this.l.execute(afwl.i(traVar));
            traVar = traVar5;
        }
    }

    public final synchronized void g() {
        this.i = true;
        e();
    }
}
