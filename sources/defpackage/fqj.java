package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fqj extends nf {
    private RecyclerView b;

    @Override // defpackage.nf, defpackage.oq
    public final int[] c(np npVar, View view) {
        return fhz.ax(npVar, this.b) ? new int[]{0, 0} : super.c(npVar, view);
    }

    @Override // defpackage.oq
    public final void f(RecyclerView recyclerView) {
        this.b = recyclerView;
        super.f(recyclerView);
    }
}
