package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mld extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ mle a;

    public mld(mle mleVar) {
        this.a = mleVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        mle mleVar = this.a;
        mleVar.j = motionEvent.getX();
        mleVar.k = motionEvent.getY();
        mleVar.l = 1;
        return true;
    }
}
