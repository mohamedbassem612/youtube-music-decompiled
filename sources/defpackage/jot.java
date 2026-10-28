package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jot implements View.OnTouchListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ jot(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.$cid;
        if (i == 0) {
            agsn agsnVar = joz.a;
            return twb.c((Context) this.a);
        }
        if (i == 1) {
            izd izdVar = (izd) this.a;
            boolean zOnTouchEvent = izdVar.a.onTouchEvent(motionEvent);
            hbf hbfVar = izdVar.f;
            if (hbfVar == null) {
                return zOnTouchEvent;
            }
            if (!hbfVar.f(motionEvent) && !zOnTouchEvent) {
                return false;
            }
        } else {
            if (i == 2) {
                agsn agsnVar2 = joz.a;
                return twb.c((Context) this.a);
            }
            if (i != 3) {
                if (((vqs) this.a).k.l(349, 45794400L, true) && motionEvent.getY() < view.getPaddingTop()) {
                    return false;
                }
                view.performClick();
            } else {
                if (motionEvent.getAction() != 1) {
                    return false;
                }
                abwk abwkVar = ((abfx) this.a).i;
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                ruf rufVarJ = abwkVar.j();
                if (rufVarJ != null) {
                    ((rzd) rufVarJ.a.io()).a = rawX;
                    ((rzd) rufVarJ.b.io()).a = rawY;
                    sog sogVar = rufVarJ.e;
                    if (sogVar != null) {
                        sogVar.u(rawX, rawY);
                    }
                }
                view.performClick();
            }
        }
        return true;
    }
}
