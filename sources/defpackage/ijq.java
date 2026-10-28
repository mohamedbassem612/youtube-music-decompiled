package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ijq extends qa {
    final /* synthetic */ ijr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ijq(ijr ijrVar) {
        super((byte[]) null);
        this.a = ijrVar;
    }

    @Override // defpackage.qa
    public final void e(RecyclerView recyclerView, int i, int i2) {
        np npVar = recyclerView.n;
        npVar.getClass();
        int iFindFirstCompletelyVisibleItemPosition = ((LinearLayoutManager) npVar).findFirstCompletelyVisibleItemPosition();
        ijr ijrVar = this.a;
        if (iFindFirstCompletelyVisibleItemPosition == 0) {
            ijrVar.f.a();
        } else {
            ijrVar.f.b();
        }
    }
}
