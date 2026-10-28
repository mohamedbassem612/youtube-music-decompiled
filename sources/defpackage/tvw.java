package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class tvw extends oa {
    final /* synthetic */ tvy a;

    public tvw(tvy tvyVar) {
        this.a = tvyVar;
    }

    @Override // defpackage.oa, defpackage.nt
    public final boolean m(RecyclerView recyclerView, MotionEvent motionEvent) {
        tvy tvyVar = this.a;
        if (recyclerView == tvyVar.b && motionEvent.getAction() == 0) {
            for (SwipeLayout swipeLayout : tvyVar.a) {
                if (swipeLayout.isAttachedToWindow()) {
                    Rect rect = new Rect();
                    swipeLayout.getGlobalVisibleRect(rect);
                    if (!rect.contains((int) (motionEvent.getRawX() + 0.5f), (int) (motionEvent.getRawY() + 0.5f)) && swipeLayout.u()) {
                        swipeLayout.p(0, 0.0f);
                    }
                }
            }
        }
        return false;
    }
}
