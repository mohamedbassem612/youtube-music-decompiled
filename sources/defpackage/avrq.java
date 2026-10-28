package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avrq extends awjq implements Runnable, axsq, avmn {
    final long a;
    final TimeUnit b;
    final avma c;
    Collection d;
    axsq e;
    long f;
    long g;

    public avrq(axsp axspVar, long j, TimeUnit timeUnit, avma avmaVar) {
        super(axspVar, new awie());
        this.a = j;
        this.b = timeUnit;
        this.c = avmaVar;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        synchronized (this) {
            this.d = null;
        }
        this.h.b(th);
        this.c.dispose();
    }

    @Override // defpackage.awjq, defpackage.awkn
    public final /* synthetic */ void d(axsp axspVar, Object obj) {
        axspVar.kk((Collection) obj);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        synchronized (this) {
            this.d = null;
        }
        this.e.kj();
        this.c.dispose();
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.e, axsqVar)) {
            this.e = axsqVar;
            try {
                this.d = new ArrayList();
                this.h.e(this);
                avma avmaVar = this.c;
                long j = this.a;
                avmaVar.c(this, j, j, this.b);
                axsqVar.ko(Long.MAX_VALUE);
            } catch (Throwable th) {
                avkz.a(th);
                this.c.dispose();
                axsqVar.kj();
                awjx.f(th, this.h);
            }
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.c.f();
    }

    @Override // defpackage.axsq
    public final void kj() {
        if (this.j) {
            return;
        }
        this.j = true;
        dispose();
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        synchronized (this) {
            Collection collection = this.d;
            if (collection == null) {
                return;
            }
            collection.add(obj);
            if (collection.size() < Integer.MAX_VALUE) {
                return;
            }
            this.d = null;
            this.f++;
            n(collection, this);
            try {
                ArrayList arrayList = new ArrayList();
                synchronized (this) {
                    this.d = arrayList;
                    this.g++;
                }
            } catch (Throwable th) {
                avkz.a(th);
                kj();
                this.h.b(th);
            }
        }
    }

    @Override // defpackage.axsp
    public final void kn() {
        Collection collection;
        synchronized (this) {
            collection = this.d;
            this.d = null;
        }
        if (collection != null) {
            avos avosVar = this.i;
            avosVar.j(collection);
            this.k = true;
            if (l()) {
                atqp.t(avosVar, this.h, this, this);
            }
            this.c.dispose();
        }
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        i(j);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                Collection collection = this.d;
                if (collection != null && this.f == this.g) {
                    this.d = arrayList;
                    n(collection, this);
                }
            }
        } catch (Throwable th) {
            avkz.a(th);
            kj();
            this.h.b(th);
        }
    }
}
