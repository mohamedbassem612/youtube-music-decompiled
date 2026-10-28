package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ufw extends GestureDetector.SimpleOnGestureListener {
    private final ukd a;

    public ufw(ukd ukdVar) {
        this.a = ukdVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent == null || motionEvent2 == null) {
            return false;
        }
        float y = motionEvent2.getY() - motionEvent.getY();
        float x = motionEvent2.getX() - motionEvent.getX();
        if (Math.abs(x) > Math.abs(y)) {
            if (Math.abs(x) <= 100.0f || Math.abs(f) <= 100.0f) {
                return false;
            }
            ukd ukdVar = this.a;
            if (x > 0.0f) {
                ukdVar.b(3);
            } else {
                ukdVar.b(1);
            }
        } else {
            if (Math.abs(y) <= 100.0f || Math.abs(f2) <= 100.0f) {
                return false;
            }
            ukd ukdVar2 = this.a;
            if (y > 0.0f) {
                ukdVar2.b(4);
            } else {
                ukdVar2.b(2);
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        motionEvent.getX();
        motionEvent.getY();
        return super.onSingleTapConfirmed(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }
}
