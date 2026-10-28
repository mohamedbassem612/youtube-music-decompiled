package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class vjd extends nf {
    @Override // defpackage.nf, defpackage.oq
    public final int[] c(np npVar, View view) {
        if (npVar.canScrollVertically()) {
            return super.c(npVar, view);
        }
        int[] iArr = new int[2];
        iArr[1] = 0;
        if (npVar.canScrollHorizontally()) {
            nb nbVar = new nb(npVar);
            iArr[0] = nbVar.d(view) - nbVar.j();
        } else {
            iArr[0] = 0;
        }
        return iArr;
    }
}
