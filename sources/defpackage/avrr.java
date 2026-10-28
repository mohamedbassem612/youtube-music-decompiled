package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avrr extends awjq implements Runnable, axsq, avmn {
    final long a;
    final TimeUnit b;
    final avmb c;
    axsq d;
    Collection e;
    final AtomicReference f;

    public avrr(axsp axspVar, long j, TimeUnit timeUnit, avmb avmbVar) {
        super(axspVar, new awie());
        this.f = new AtomicReference();
        this.a = j;
        this.b = timeUnit;
        this.c = avmbVar;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        avnr.b(this.f);
        synchronized (this) {
            this.e = null;
        }
        this.h.b(th);
    }

    @Override // defpackage.awjq, defpackage.awkn
    public final /* bridge */ /* synthetic */ void d(axsp axspVar, Object obj) {
        this.h.kk((Collection) obj);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        kj();
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.d, axsqVar)) {
            this.d = axsqVar;
            try {
                this.e = new ArrayList();
                this.h.e(this);
                if (this.j) {
                    return;
                }
                axsqVar.ko(Long.MAX_VALUE);
                avmb avmbVar = this.c;
                long j = this.a;
                avmn avmnVarD = avmbVar.d(this, j, j, this.b);
                if (a.ap(this.f, avmnVarD)) {
                    return;
                }
                avmnVarD.dispose();
            } catch (Throwable th) {
                avkz.a(th);
                kj();
                awjx.f(th, this.h);
            }
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.f.get() == avnr.DISPOSED;
    }

    @Override // defpackage.axsq
    public final void kj() {
        this.j = true;
        this.d.kj();
        avnr.b(this.f);
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        synchronized (this) {
            Collection collection = this.e;
            if (collection != null) {
                collection.add(obj);
            }
        }
    }

    @Override // defpackage.axsp
    public final void kn() {
        avnr.b(this.f);
        synchronized (this) {
            Collection collection = this.e;
            if (collection == null) {
                return;
            }
            this.e = null;
            avos avosVar = this.i;
            avosVar.j(collection);
            this.k = true;
            if (l()) {
                atqp.t(avosVar, this.h, null, this);
            }
        }
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        i(j);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0053  */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                Collection collection = this.e;
                if (collection != null) {
                    this.e = arrayList;
                    axsp axspVar = this.h;
                    avos avosVar = this.i;
                    if (m()) {
                        long j = this.m.get();
                        if (j != 0) {
                            d(axspVar, collection);
                            if (j != Long.MAX_VALUE) {
                                o();
                            }
                            if (g(-1) != 0) {
                                atqp.t(avosVar, axspVar, this, this);
                            }
                        } else {
                            kj();
                            axspVar.b(new avmx("Could not emit buffer due to lack of requests"));
                        }
                    } else {
                        avosVar.j(collection);
                        if (l()) {
                            atqp.t(avosVar, axspVar, this, this);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            avkz.a(th);
            kj();
            this.h.b(th);
        }
    }
}
