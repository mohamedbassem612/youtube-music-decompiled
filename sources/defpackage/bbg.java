package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class bbg extends bbf {
    static final bbn g = bbn.o(WindowInsets.CONSUMED, null);

    public bbg(bbn bbnVar, WindowInsets windowInsets) {
        super(bbnVar, windowInsets);
    }

    @Override // defpackage.bbc, defpackage.bbk
    public avw a(int i) {
        return avw.b(avw.a, avw.e(this.a.getInsets(bbl.a(i))));
    }

    @Override // defpackage.bbc, defpackage.bbk
    public avw c(int i) {
        return avw.b(avw.a, avw.e(this.a.getInsetsIgnoringVisibility(bbl.a(i))));
    }

    @Override // defpackage.bbc, defpackage.bbk
    public boolean u(int i) {
        return this.a.isVisible(bbl.a(8));
    }

    public bbg(bbn bbnVar, bbg bbgVar) {
        super(bbnVar, bbgVar);
    }

    @Override // defpackage.bbc, defpackage.bbk
    public final void h(View view) {
    }
}
