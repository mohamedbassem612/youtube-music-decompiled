package defpackage;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jas extends pv implements admb {
    private RecyclerView v;

    public jas(jar jarVar) {
        super(jarVar);
    }

    public final void N(adma admaVar) {
        oh ohVarJ;
        RecyclerView recyclerView = this.v;
        if (recyclerView == null || (ohVarJ = recyclerView.j(admaVar.a())) == null) {
            return;
        }
        v(ohVarJ);
    }

    @Override // defpackage.admb
    public final void a(adma admaVar, Object obj) {
        if (admaVar instanceof iyv) {
            ((iyv) admaVar).i(this);
        }
    }

    @Override // defpackage.pv
    public final void o(RecyclerView recyclerView) {
        super.o(recyclerView);
        this.v = recyclerView;
    }
}
