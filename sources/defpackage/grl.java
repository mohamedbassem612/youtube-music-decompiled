package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class grl extends qa {
    final /* synthetic */ grm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public grl(grm grmVar) {
        super((byte[]) null);
        this.a = grmVar;
    }

    @Override // defpackage.qa
    public final void e(RecyclerView recyclerView, int i, int i2) {
        np npVar = recyclerView.n;
        if (npVar instanceof LinearLayoutManager) {
            int iFindFirstCompletelyVisibleItemPosition = ((LinearLayoutManager) npVar).findFirstCompletelyVisibleItemPosition();
            grm grmVar = this.a;
            if (iFindFirstCompletelyVisibleItemPosition == 0) {
                ggd ggdVar = grmVar.k;
                if (ggdVar != null) {
                    ggdVar.a();
                    return;
                }
                return;
            }
            ggd ggdVar2 = grmVar.k;
            if (ggdVar2 != null) {
                ggdVar2.b();
            }
        }
    }
}
