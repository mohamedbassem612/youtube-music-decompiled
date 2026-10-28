package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class acrb extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ acrc a;

    public acrb(acrc acrcVar) {
        this.a = acrcVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        acrc acrcVar = this.a;
        acrcVar.a = true;
        acrcVar.d.al();
    }
}
