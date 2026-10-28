package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vsl implements View.OnTouchListener {
    private final /* synthetic */ int $cid;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.$cid;
        if (i == 0) {
            a.O(view);
            return false;
        }
        if (i == 1) {
            agrf agrfVar = gls.a;
        } else {
            if (i == 2) {
                a.O(view);
                return false;
            }
            if (i == 3) {
                a.O(view);
                return false;
            }
            if (i == 4) {
                int i2 = adco.h;
                a.O(view);
                return false;
            }
        }
        return true;
    }
}
