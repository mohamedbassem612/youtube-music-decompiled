package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jbt implements ViewTreeObserver.OnGlobalLayoutListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public /* synthetic */ jbt(hkc hkcVar, int i) {
        this.$cid = i;
        this.a = hkcVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.$cid;
        Object obj = this.a;
        if (i != 0) {
            ((hkc) obj).a();
            return;
        }
        jbw jbwVar = ((jbu) obj).a;
        RecyclerView recyclerView = jbwVar.b;
        recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        ixi ixiVar = jbwVar.c;
        if (ixiVar != null) {
            int iA = ixiVar.a();
            if (jbwVar.f || iA == -1) {
                recyclerView.ab(0);
                jbwVar.f = false;
                return;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.n;
            if (linearLayoutManager != null) {
                int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                if (iFindFirstCompletelyVisibleItemPosition != -1) {
                    if (iA < iFindFirstCompletelyVisibleItemPosition || iA > iFindLastCompletelyVisibleItemPosition) {
                        recyclerView.ab(iA);
                    }
                }
            }
        }
    }

    public jbt(jbu jbuVar, int i) {
        this.$cid = i;
        this.a = jbuVar;
    }
}
