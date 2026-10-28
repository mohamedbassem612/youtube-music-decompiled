package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fqi extends mu {
    private RecyclerView b;

    private static final int j(np npVar, View view) {
        if (view == null) {
            return -1;
        }
        return npVar.getPosition(view);
    }

    @Override // defpackage.mu, defpackage.oq
    public final int[] c(np npVar, View view) {
        int[] iArrC = super.c(npVar, view);
        if (npVar.getItemCount() != 0) {
            View childAt = npVar.getChildAt(0);
            View childAt2 = npVar.getChildAt(npVar.getChildCount() - 1);
            boolean zCanScrollHorizontally = this.b.canScrollHorizontally(-1);
            boolean zCanScrollHorizontally2 = this.b.canScrollHorizontally(1);
            int iJ = j(npVar, childAt);
            int iJ2 = j(npVar, childAt2);
            if ((!zCanScrollHorizontally && iJ != -1) || (!zCanScrollHorizontally2 && iJ2 != -1)) {
                return new int[]{0, 0};
            }
        }
        return iArrC;
    }

    @Override // defpackage.oq
    public final void f(RecyclerView recyclerView) {
        this.b = recyclerView;
        super.f(recyclerView);
    }
}
