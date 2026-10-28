package defpackage;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fsd implements ViewTreeObserver.OnPreDrawListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public fsd(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = this.$cid;
        if (i != 0) {
            Object obj = this.a;
            if (i != 1) {
                ((tus) obj).a();
            } else {
                ((CoordinatorLayout) obj).i(0);
            }
        } else {
            ((fsy) this.a).C();
        }
        return true;
    }

    public /* synthetic */ fsd(tus tusVar, int i) {
        this.$cid = i;
        this.a = tusVar;
    }
}
