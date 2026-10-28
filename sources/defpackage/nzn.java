package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nzn implements nxa {
    public final int f;
    public final nqt g;
    public final String h;
    public final boolean i;
    public final nzw k;
    public final adam n;
    public final ci o;
    private final Executor p;
    public final Object b = new Object();
    public final nzu c = new nzu();
    public final nzu d = new nzu();
    public final nzu e = new nzu();
    public final List j = new ArrayList();
    public final AtomicReference l = new AtomicReference();
    public final AtomicReference m = new AtomicReference();

    public nzn(String str, int i, nzw nzwVar, Executor executor, adam adamVar, nqt nqtVar, boolean z, ci ciVar) {
        this.f = i;
        this.p = executor;
        this.n = adamVar;
        this.k = nzwVar;
        this.g = nqtVar;
        this.h = str;
        this.i = z;
        this.o = ciVar;
    }

    @Override // defpackage.nxa
    public final void a() {
        synchronized (this.b) {
            this.c.b();
            this.d.b();
            this.e.b();
            this.j.clear();
        }
    }

    @Override // defpackage.nxa
    public final void b() {
        this.c.c();
    }

    @Override // defpackage.nxa
    public final void c() {
        this.e.c();
        this.p.execute(new mga(this, 14));
    }

    @Override // defpackage.nxa
    public final synchronized void d(boolean z) {
        try {
            if (z) {
                a();
            } else {
                this.p.execute(new mga(this, 15));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.nxa
    public final void e(Boolean bool) {
        a.ap(this.m, bool);
    }

    @Override // defpackage.nxa
    public final void f(String str) {
        if (str != null) {
            a.ap(this.l, str);
        }
    }

    @Override // defpackage.nxa
    public final void g() {
        this.c.d();
    }

    @Override // defpackage.nxa
    public final void h() {
        this.e.d();
    }

    public final void i(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nzp nzpVar = (nzp) it.next();
            nzpVar.d = Integer.valueOf(i);
            this.k.g(this.h, nzpVar.a());
        }
    }
}
