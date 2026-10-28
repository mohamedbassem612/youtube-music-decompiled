package defpackage;

import android.graphics.Insets;
import android.view.WindowInsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class bbh extends bbg {
    public bbh(bbn bbnVar, WindowInsets windowInsets) {
        super(bbnVar, windowInsets);
    }

    @Override // defpackage.bbg, defpackage.bbc, defpackage.bbk
    public avw a(int i) {
        Insets insets = this.a.getInsets(bbl.a(i));
        return avw.d(insets.left, insets.top, insets.right, insets.bottom);
    }

    @Override // defpackage.bbg, defpackage.bbc, defpackage.bbk
    public avw c(int i) {
        Insets insetsIgnoringVisibility = this.a.getInsetsIgnoringVisibility(bbl.a(i));
        return avw.d(insetsIgnoringVisibility.left, insetsIgnoringVisibility.top, insetsIgnoringVisibility.right, insetsIgnoringVisibility.bottom);
    }

    public bbh(bbn bbnVar, bbh bbhVar) {
        super(bbnVar, bbhVar);
    }
}
