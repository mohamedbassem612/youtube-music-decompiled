package defpackage;

import android.view.View;
import android.widget.OverScroller;
import androidx.car.app.model.Alert;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aeuq implements Runnable {
    final /* synthetic */ aeur a;
    private final CoordinatorLayout b;
    private final View c;

    public aeuq(aeur aeurVar, CoordinatorLayout coordinatorLayout, View view) {
        this.a = aeurVar;
        this.b = coordinatorLayout;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aeur aeurVar;
        OverScroller overScroller;
        View view = this.c;
        if (view == null || (overScroller = (aeurVar = this.a).d) == null) {
            return;
        }
        boolean zComputeScrollOffset = overScroller.computeScrollOffset();
        CoordinatorLayout coordinatorLayout = this.b;
        if (!zComputeScrollOffset) {
            aeurVar.w(coordinatorLayout, view);
        } else {
            aeurVar.u(coordinatorLayout, view, aeurVar.d.getCurrY(), Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY);
            view.postOnAnimation(this);
        }
    }
}
