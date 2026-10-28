package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
class bbi extends bbh {
    static final bbn h = bbn.o(WindowInsets.CONSUMED, null);

    public bbi(bbn bbnVar, WindowInsets windowInsets) {
        super(bbnVar, windowInsets);
    }

    @Override // defpackage.bbh, defpackage.bbg, defpackage.bbc, defpackage.bbk
    public avw a(int i) {
        return avw.e(this.a.getInsets(bbm.a(i)));
    }

    @Override // defpackage.bbh, defpackage.bbg, defpackage.bbc, defpackage.bbk
    public avw c(int i) {
        return avw.e(this.a.getInsetsIgnoringVisibility(bbm.a(i)));
    }

    @Override // defpackage.bbg, defpackage.bbc, defpackage.bbk
    public boolean u(int i) {
        return this.a.isVisible(bbm.a(8));
    }

    public bbi(bbn bbnVar, bbi bbiVar) {
        super(bbnVar, bbiVar);
    }

    @Override // defpackage.bbc, defpackage.bbk
    public void j(View view) {
    }
}
