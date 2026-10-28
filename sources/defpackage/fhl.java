package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fhl implements View.OnTouchListener {
    public fip a;
    public fip b;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        fip fipVar = this.b;
        if (fipVar != null) {
            fhz.a(fipVar, view, motionEvent);
        }
        fip fipVar2 = this.a;
        if (fipVar2 != null) {
            gzj.aS();
            if (fhz.g == null) {
                fhz.g = new isw();
            }
            isw iswVar = fhz.g;
            iswVar.b = view;
            iswVar.a = motionEvent;
            Object objZ = fipVar2.b.n().z(fipVar2, fhz.g);
            isw iswVar2 = fhz.g;
            iswVar2.b = null;
            iswVar2.a = null;
            if (objZ != null && ((Boolean) objZ).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
