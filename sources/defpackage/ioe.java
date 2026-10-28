package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.youtube.music.ui.tabs.TabbedView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ioe extends qa {
    final /* synthetic */ iog a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ioe(iog iogVar) {
        super((byte[]) null);
        this.a = iogVar;
    }

    @Override // defpackage.qa
    public final void e(RecyclerView recyclerView, int i, int i2) {
        np npVar = recyclerView.n;
        if (npVar instanceof LinearLayoutManager) {
            int iFindFirstCompletelyVisibleItemPosition = ((LinearLayoutManager) npVar).findFirstCompletelyVisibleItemPosition();
            iog iogVar = this.a;
            if (iFindFirstCompletelyVisibleItemPosition == 0) {
                TabbedView tabbedView = iogVar.E;
                if (tabbedView != null) {
                    tabbedView.n();
                    return;
                }
                return;
            }
            TabbedView tabbedView2 = iogVar.E;
            if (tabbedView2 != null) {
                tabbedView2.m();
            }
        }
    }
}
