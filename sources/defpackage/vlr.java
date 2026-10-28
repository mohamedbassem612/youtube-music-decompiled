package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import app.rive.RivePointerInputMode;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vlr extends adpa implements fli {
    public zs a;
    private final RivePointerInputMode f;

    public vlr(Context context) {
        super(new adrf(context));
        this.a = null;
        this.f = RivePointerInputMode.Observe;
    }

    @Override // defpackage.fli
    public final boolean d(MotionEvent motionEvent, View view) {
        motionEvent.getClass();
        adqc adqcVarB = this.b.b();
        boolean zOnTouchEvent = (adqcVarB == null || adqcVarB.f) ? false : adqcVarB.d.onTouchEvent(motionEvent);
        RivePointerInputMode rivePointerInputMode = this.f;
        RivePointerInputMode rivePointerInputMode2 = RivePointerInputMode.Consume;
        int iOrdinal = rivePointerInputMode.ordinal();
        if (iOrdinal == 0) {
            return zOnTouchEvent;
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return false;
        }
        throw new awmj();
    }

    @Override // defpackage.fli
    public final boolean e(MotionEvent motionEvent) {
        motionEvent.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            return actionMasked == 1 || actionMasked == 2 || actionMasked == 3;
        }
        return getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }
}
