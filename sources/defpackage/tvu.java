package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tvu extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ SwipeLayout a;

    public tvu(SwipeLayout swipeLayout) {
        this.a = swipeLayout;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        SwipeLayout swipeLayout = this.a;
        if (!swipeLayout.u() && swipeLayout.getParent() != null) {
            swipeLayout.performLongClick();
        }
        swipeLayout.r();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        SwipeLayout swipeLayout = this.a;
        if (swipeLayout.u()) {
            return;
        }
        swipeLayout.q(motionEvent.getX(), motionEvent.getY());
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        SwipeLayout swipeLayout = this.a;
        if (x < swipeLayout.d.getLeft()) {
            View viewC = swipeLayout.c();
            if (viewC == null) {
                return false;
            }
            viewC.performClick();
            return false;
        }
        if (motionEvent.getX() >= swipeLayout.d.getRight()) {
            View viewD = swipeLayout.d();
            if (viewD == null) {
                return false;
            }
            viewD.performClick();
            return false;
        }
        if (swipeLayout.u()) {
            return false;
        }
        swipeLayout.performClick();
        swipeLayout.q(motionEvent.getX(), motionEvent.getY());
        return false;
    }
}
