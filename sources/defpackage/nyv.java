package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.ViewParent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nyv extends oa {
    private boolean a = false;
    private boolean b = false;

    @Override // defpackage.oa, defpackage.nt
    public final boolean m(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean z;
        np npVar;
        if (!this.a) {
            this.a = true;
            ViewParent parent = recyclerView.getParent();
            while (true) {
                if (parent == null) {
                    z = false;
                    break;
                }
                if ((parent instanceof RecyclerView) && (npVar = ((RecyclerView) parent).n) != null && npVar.canScrollVertically()) {
                    z = true;
                    break;
                }
                parent = parent.getParent();
            }
            this.b = z;
        }
        if (this.b && motionEvent.getAction() == 2) {
            recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
        }
        return false;
    }
}
