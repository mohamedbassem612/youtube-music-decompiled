package defpackage;

import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avxr implements avlk, avmn {
    final avmd a;
    axsq b;
    Collection c;

    public avxr(avmd avmdVar, Collection collection) {
        this.a = avmdVar;
        this.c = collection;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        this.c = null;
        this.b = awka.CANCELLED;
        this.a.b(th);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.b.kj();
        this.b = awka.CANCELLED;
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.b, axsqVar)) {
            this.b = axsqVar;
            this.a.d(this);
            axsqVar.ko(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.b == awka.CANCELLED;
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        this.c.add(obj);
    }

    @Override // defpackage.axsp
    public final void kn() {
        this.b = awka.CANCELLED;
        this.a.ki(this.c);
    }
}
