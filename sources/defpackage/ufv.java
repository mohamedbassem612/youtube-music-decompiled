package defpackage;

import android.view.ScaleGestureDetector;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ufv extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        scaleGestureDetector.getScaleFactor();
        return true;
    }
}
