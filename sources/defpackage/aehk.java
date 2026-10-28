package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aehk extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ aehl a;

    public aehk(aehl aehlVar) {
        this.a = aehlVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.a.a.p();
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float fAbs;
        float fAbs2;
        if (motionEvent != null) {
            fAbs2 = Math.abs(motionEvent.getX() - motionEvent2.getX());
            fAbs = Math.abs(motionEvent.getY() - motionEvent2.getY());
        } else {
            fAbs = 50.0f;
            fAbs2 = 50.0f;
        }
        if (Math.abs(f) > 500.0f && Math.abs(f) > Math.abs(f2)) {
            if (fAbs2 < 50.0f) {
                return false;
            }
            aehl aehlVar = this.a;
            if (f < 0.0f) {
                aehlVar.a.p();
                return false;
            }
            aehlVar.a.p();
            return false;
        }
        if (Math.abs(f2) <= 500.0f || Math.abs(f2) <= Math.abs(f) || fAbs < 50.0f) {
            return false;
        }
        aehl aehlVar2 = this.a;
        if (f2 < 0.0f) {
            aehlVar2.a.p();
            return false;
        }
        aehlVar2.a.p();
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.a.a.p();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.a.a.p();
        return false;
    }
}
