package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.youtube.engagementpanel.LinearScrollToItemLayoutManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class vrw extends aecm {
    final /* synthetic */ vrx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vrw(vrx vrxVar) {
        super(null);
        this.a = vrxVar;
    }

    @Override // defpackage.aecm
    public final void a(wgd wgdVar, boolean z) {
        LinearScrollToItemLayoutManager linearScrollToItemLayoutManager;
        int iAS;
        int iAS2;
        if (z) {
            apoq apoqVar = wgdVar.a;
            vrx vrxVar = this.a;
            RecyclerView recyclerView = vrxVar.i;
            if (recyclerView != null && (linearScrollToItemLayoutManager = (LinearScrollToItemLayoutManager) recyclerView.n) != null) {
                linearScrollToItemLayoutManager.setReverseLayout(((apoqVar.c & 262144) == 0 || (iAS2 = a.aS(apoqVar.o)) == 0 || iAS2 != 3) ? false : true);
                boolean z2 = ((apoqVar.c & 2097152) == 0 || (iAS = a.aS(apoqVar.r)) == 0 || iAS != 3) ? false : true;
                linearScrollToItemLayoutManager.c = z2;
                linearScrollToItemLayoutManager.a.a = z2;
            }
            vrxVar.u(apoqVar);
        }
    }
}
