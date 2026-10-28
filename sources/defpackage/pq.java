package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class pq extends GestureDetector.SimpleOnGestureListener {
    public boolean a = true;
    final /* synthetic */ pv b;

    public pq(pv pvVar) {
        this.b = pvVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        pv pvVar;
        View viewM;
        oh ohVarJ;
        if (!this.a || (viewM = (pvVar = this.b).m(motionEvent)) == null || (ohVarJ = pvVar.m.j(viewM)) == null) {
            return;
        }
        pp ppVar = pvVar.j;
        if (ppVar.g(pvVar.m, ohVarJ)) {
            int pointerId = motionEvent.getPointerId(0);
            int i = pvVar.i;
            if (pointerId == i) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x = motionEvent.getX(iFindPointerIndex);
                float y = motionEvent.getY(iFindPointerIndex);
                pvVar.c = x;
                pvVar.d = y;
                pvVar.f = 0.0f;
                pvVar.e = 0.0f;
                ppVar.l();
            }
        }
    }
}
