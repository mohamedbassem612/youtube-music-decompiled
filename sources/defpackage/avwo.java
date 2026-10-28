package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avwo extends awjw implements avlk {
    private static final long serialVersionUID = -5526049321428043809L;
    final boolean a;
    axsq b;
    boolean c;

    public avwo(axsp axspVar) {
        super(axspVar);
        this.a = true;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        if (this.c) {
            atqp.n(th);
        } else {
            this.c = true;
            this.f.b(th);
        }
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.b, axsqVar)) {
            this.b = axsqVar;
            this.f.e(this);
            axsqVar.ko(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.awjw, defpackage.axsq
    public final void kj() {
        super.kj();
        this.b.kj();
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        if (this.c) {
            return;
        }
        if (this.g == null) {
            this.g = obj;
            return;
        }
        this.c = true;
        this.b.kj();
        this.f.b(new IllegalArgumentException("Sequence contains more than one element!"));
    }

    @Override // defpackage.axsp
    public final void kn() {
        if (this.c) {
            return;
        }
        this.c = true;
        Object obj = this.g;
        this.g = null;
        if (obj == null) {
            obj = null;
        }
        if (obj != null) {
            f(obj);
            return;
        }
        boolean z = this.a;
        axsp axspVar = this.f;
        if (z) {
            axspVar.b(new NoSuchElementException());
        } else {
            axspVar.kn();
        }
    }
}
