package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class tvx extends qa {
    final /* synthetic */ tvy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tvx(tvy tvyVar) {
        super((byte[]) null);
        this.a = tvyVar;
    }

    @Override // defpackage.qa
    public final void fO(RecyclerView recyclerView, int i) {
        tvy tvyVar = this.a;
        if (recyclerView == tvyVar.b) {
            for (SwipeLayout swipeLayout : tvyVar.a) {
                if (swipeLayout.isAttachedToWindow() && swipeLayout.u()) {
                    swipeLayout.p(0, 0.0f);
                }
            }
        }
    }
}
