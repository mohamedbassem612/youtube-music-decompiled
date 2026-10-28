package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.youtube.music.ui.tabs.TabbedView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class gmq extends qa {
    final /* synthetic */ gms a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmq(gms gmsVar) {
        super((byte[]) null);
        this.a = gmsVar;
    }

    @Override // defpackage.qa
    public final void e(RecyclerView recyclerView, int i, int i2) {
        gms gmsVar = this.a;
        gmsVar.F();
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.n;
        if (linearLayoutManager == null || linearLayoutManager.findFirstCompletelyVisibleItemPosition() != 0) {
            TabbedView tabbedView = gmsVar.A;
            if (tabbedView != null) {
                tabbedView.m();
                return;
            }
            return;
        }
        TabbedView tabbedView2 = gmsVar.A;
        if (tabbedView2 != null) {
            tabbedView2.n();
        }
    }
}
