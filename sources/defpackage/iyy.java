package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class iyy extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ izd a;

    public iyy(izd izdVar) {
        this.a = izdVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        xgn xgnVar;
        izd izdVar = this.a;
        byte[] bArr = izdVar.b;
        if (bArr == null || (xgnVar = izdVar.c) == null) {
            return;
        }
        xgnVar.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_LONG_PRESS, new xgj(bArr), null);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.a.e();
    }
}
