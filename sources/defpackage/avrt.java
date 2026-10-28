package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avrt extends awjq implements Runnable, axsq {
    final long a;
    final long b;
    final TimeUnit c;
    final avma d;
    final List e;
    axsq f;

    public avrt(axsp axspVar, long j, long j2, TimeUnit timeUnit, avma avmaVar) {
        super(axspVar, new awie());
        this.a = j;
        this.b = j2;
        this.c = timeUnit;
        this.d = avmaVar;
        this.e = new LinkedList();
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        this.k = true;
        this.d.dispose();
        f();
        this.h.b(th);
    }

    @Override // defpackage.awjq, defpackage.awkn
    public final /* synthetic */ void d(axsp axspVar, Object obj) {
        axspVar.kk((Collection) obj);
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.f, axsqVar)) {
            this.f = axsqVar;
            try {
                ArrayList arrayList = new ArrayList();
                this.e.add(arrayList);
                this.h.e(this);
                axsqVar.ko(Long.MAX_VALUE);
                avma avmaVar = this.d;
                long j = this.b;
                TimeUnit timeUnit = this.c;
                avmaVar.c(this, j, j, timeUnit);
                avmaVar.b(new avrs(this, arrayList), this.a, timeUnit);
            } catch (Throwable th) {
                avkz.a(th);
                this.d.dispose();
                axsqVar.kj();
                awjx.f(th, this.h);
            }
        }
    }

    final void f() {
        synchronized (this) {
            this.e.clear();
        }
    }

    @Override // defpackage.axsq
    public final void kj() {
        this.j = true;
        this.f.kj();
        this.d.dispose();
        f();
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        synchronized (this) {
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((Collection) it.next()).add(obj);
            }
        }
    }

    @Override // defpackage.axsp
    public final void kn() {
        ArrayList arrayList;
        synchronized (this) {
            List list = this.e;
            arrayList = new ArrayList(list);
            list.clear();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.i.j((Collection) arrayList.get(i));
        }
        this.k = true;
        if (l()) {
            atqp.t(this.i, this.h, this.d, this);
        }
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        i(j);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.j) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                if (!this.j) {
                    this.e.add(arrayList);
                    this.d.b(new avrs(this, arrayList), this.a, this.c);
                }
            }
        } catch (Throwable th) {
            avkz.a(th);
            kj();
            this.h.b(th);
        }
    }
}
