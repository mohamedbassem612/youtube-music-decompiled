package defpackage;

import android.view.WindowInsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class bbf extends bbe {
    private avw g;
    private avw h;
    private avw k;

    public bbf(bbn bbnVar, WindowInsets windowInsets) {
        super(bbnVar, windowInsets);
        this.g = null;
        this.h = null;
        this.k = null;
    }

    @Override // defpackage.bbk
    public avw D() {
        avw avwVar = this.h;
        if (avwVar != null) {
            return avwVar;
        }
        avw avwVarE = avw.e(this.a.getMandatorySystemGestureInsets());
        this.h = avwVarE;
        return avwVarE;
    }

    @Override // defpackage.bbk
    public avw E() {
        avw avwVar = this.g;
        if (avwVar != null) {
            return avwVar;
        }
        avw avwVarE = avw.e(this.a.getSystemGestureInsets());
        this.g = avwVarE;
        return avwVarE;
    }

    @Override // defpackage.bbk
    public avw F() {
        avw avwVar = this.k;
        if (avwVar != null) {
            return avwVar;
        }
        avw avwVarE = avw.e(this.a.getTappableElementInsets());
        this.k = avwVarE;
        return avwVarE;
    }

    @Override // defpackage.bbc, defpackage.bbk
    public bbn e(int i, int i2, int i3, int i4) {
        return bbn.o(this.a.inset(i, i2, i3, i4), null);
    }

    public bbf(bbn bbnVar, bbf bbfVar) {
        super(bbnVar, bbfVar);
        this.g = null;
        this.h = null;
        this.k = null;
    }

    @Override // defpackage.bbd, defpackage.bbk
    public void z(avw avwVar) {
    }
}
