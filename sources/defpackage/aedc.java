package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aedc implements View.OnTouchListener {
    private final ahud a = new ahud((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.a.Z(aedd.b(view, 1.0f, aedd.a(view), 100));
            return false;
        }
        if (action != 1 && action != 3) {
            return false;
        }
        this.a.aa(aedd.b(view, aedd.a(view), 1.0f, 400));
        return false;
    }
}
