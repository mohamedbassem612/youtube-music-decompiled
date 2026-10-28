package defpackage;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class oqv implements nrp {
    public int a = 1;
    private final RecyclerView b;

    public oqv(RecyclerView recyclerView) {
        this.b = recyclerView;
    }

    private final void d(int i, od odVar) {
        np npVar = this.b.n;
        if (npVar != null) {
            odVar.b = i;
            npVar.startSmoothScroll(odVar);
        }
    }

    @Override // defpackage.nrp
    public final RecyclerView a() {
        return this.b;
    }

    @Override // defpackage.nrp
    public final void b(int i, od odVar) {
        d(i, odVar);
    }

    @Override // defpackage.nrp
    public final void c(int i, boolean z) {
        RecyclerView recyclerView = this.b;
        if (z) {
            d(i, gzj.aL(recyclerView.getContext(), this.a));
        } else {
            recyclerView.ab(i);
        }
    }
}
