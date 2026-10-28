package defpackage;

import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class bbj extends bbi {
    public bbj(bbn bbnVar, WindowInsets windowInsets) {
        super(bbnVar, windowInsets);
    }

    @Override // defpackage.bbc, defpackage.bbk
    public List f(int i) {
        return this.a.getBoundingRects(bbm.a(i));
    }

    @Override // defpackage.bbc, defpackage.bbk
    public List g(int i) {
        return this.a.getBoundingRectsIgnoringVisibility(bbm.a(i));
    }

    public bbj(bbn bbnVar, bbj bbjVar) {
        super(bbnVar, bbjVar);
    }

    @Override // defpackage.bbc, defpackage.bbk
    public void k() {
    }
}
