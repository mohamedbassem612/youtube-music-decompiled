package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.youtube.music.search.ui.SearchToolbarView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class inz extends qa {
    final /* synthetic */ ioc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inz(ioc iocVar) {
        super((byte[]) null);
        this.a = iocVar;
    }

    @Override // defpackage.qa
    public final void e(RecyclerView recyclerView, int i, int i2) {
        ioc iocVar = this.a;
        iocVar.z.b(iocVar.d());
    }

    @Override // defpackage.qa
    public final void fO(RecyclerView recyclerView, int i) {
        ioc iocVar;
        SearchToolbarView searchToolbarView;
        if (i == 0 || (searchToolbarView = (iocVar = this.a).u) == null) {
            return;
        }
        searchToolbarView.d();
        if (iocVar.F.l(8, 45764180L, false) && iocVar.B && !iocVar.F.l(9, 45780438L, false)) {
            SearchToolbarView searchToolbarView2 = iocVar.u;
            searchToolbarView2.k = false;
            searchToolbarView2.f();
        }
    }
}
