package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class iob extends qa {
    final /* synthetic */ ioc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iob(ioc iocVar) {
        super((byte[]) null);
        this.a = iocVar;
    }

    @Override // defpackage.qa
    public final void e(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        ioc iocVar = this.a;
        if (kro.M(iocVar) || iocVar.y == null || (linearLayoutManager = (LinearLayoutManager) recyclerView.n) == null) {
            return;
        }
        if (linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0) {
            iocVar.y.a();
        } else {
            iocVar.y.b();
        }
    }
}
