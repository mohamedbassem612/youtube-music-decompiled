package defpackage;

import android.view.WindowInsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class bbd extends bbc {
    private avw g;

    public bbd(bbn bbnVar, bbd bbdVar) {
        super(bbnVar, bbdVar);
        this.g = null;
        this.g = bbdVar.g;
    }

    @Override // defpackage.bbk
    public boolean A() {
        return this.a.isConsumed();
    }

    @Override // defpackage.bbk
    public final avw w() {
        avw avwVar = this.g;
        if (avwVar != null) {
            return avwVar;
        }
        WindowInsets windowInsets = this.a;
        avw avwVarD = avw.d(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        this.g = avwVarD;
        return avwVarD;
    }

    @Override // defpackage.bbk
    public bbn x() {
        return bbn.o(this.a.consumeStableInsets(), null);
    }

    @Override // defpackage.bbk
    public bbn y() {
        return bbn.o(this.a.consumeSystemWindowInsets(), null);
    }

    @Override // defpackage.bbk
    public void z(avw avwVar) {
        this.g = avwVar;
    }

    public bbd(bbn bbnVar, WindowInsets windowInsets) {
        super(bbnVar, windowInsets);
        this.g = null;
    }
}
