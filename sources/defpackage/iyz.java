package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class iyz extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ izd a;

    public iyz(izd izdVar) {
        this.a = izdVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        xgn xgnVar;
        izd izdVar = this.a;
        if (izdVar.e == null) {
            return false;
        }
        byte[] bArr = izdVar.b;
        if (bArr != null && (xgnVar = izdVar.c) != null) {
            xgnVar.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_DOUBLE_CLICK, new xgj(bArr), null);
        }
        izc izcVar = izdVar.e;
        if (izcVar != null) {
            izcVar.a();
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return this.a.d();
    }
}
