package defpackage;

import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avst extends awjm {
    final Collection a;
    final avnn b;

    public avst(axsp axspVar, avnn avnnVar, Collection collection) {
        super(axspVar);
        this.b = avnnVar;
        this.a = collection;
    }

    @Override // defpackage.awjm, defpackage.axsp
    public final void b(Throwable th) {
        if (this.h) {
            atqp.n(th);
            return;
        }
        this.h = true;
        this.a.clear();
        this.e.b(th);
    }

    @Override // defpackage.awjm, defpackage.avot
    public final void c() {
        this.a.clear();
        super.c();
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        if (this.h) {
            return;
        }
        if (this.i != 0) {
            this.e.kk(null);
            return;
        }
        try {
            Object objA = this.b.a(obj);
            objA.getClass();
            if (this.a.add(objA)) {
                this.e.kk(obj);
            } else {
                this.f.ko(1L);
            }
        } catch (Throwable th) {
            g(th);
        }
    }

    @Override // defpackage.avop
    public final int kl(int i) {
        return f(i);
    }

    @Override // defpackage.avot
    public final Object km() {
        Object objKm;
        while (true) {
            objKm = this.g.km();
            if (objKm == null) {
                break;
            }
            Collection collection = this.a;
            Object objA = this.b.a(objKm);
            objA.getClass();
            if (collection.add(objA)) {
                break;
            }
            if (this.i == 2) {
                this.f.ko(1L);
            }
        }
        return objKm;
    }

    @Override // defpackage.awjm, defpackage.axsp
    public final void kn() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.a.clear();
        this.e.kn();
    }
}
