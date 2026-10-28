package defpackage;

import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avxp extends awjw implements avlk, axsq {
    private static final long serialVersionUID = -8134157938864266736L;
    axsq a;

    public avxp(axsp axspVar, Collection collection) {
        super(axspVar);
        this.g = collection;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        this.g = null;
        this.f.b(th);
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.a, axsqVar)) {
            this.a = axsqVar;
            this.f.e(this);
            axsqVar.ko(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.awjw, defpackage.axsq
    public final void kj() {
        super.kj();
        this.a.kj();
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        Collection collection = (Collection) this.g;
        if (collection != null) {
            collection.add(obj);
        }
    }

    @Override // defpackage.axsp
    public final void kn() {
        f((Collection) this.g);
    }
}
