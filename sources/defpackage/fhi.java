package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fhi implements View.OnHoverListener {
    public fip a;
    public fip b;

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.a != null && motionEvent.getActionMasked() == 9) {
            fip fipVar = this.a;
            gzj.aS();
            if (fhz.k == null) {
                fhz.k = new isw();
            }
            isw iswVar = fhz.k;
            iswVar.a = view;
            iswVar.b = motionEvent;
            Object objZ = fipVar.b.n().z(fipVar, fhz.k);
            isw iswVar2 = fhz.k;
            iswVar2.a = null;
            iswVar2.b = null;
            if (objZ != null && ((Boolean) objZ).booleanValue()) {
                return true;
            }
        } else if (this.b != null && motionEvent.getActionMasked() == 10) {
            fip fipVar2 = this.b;
            gzj.aS();
            if (fhz.j == null) {
                fhz.j = new isw();
            }
            isw iswVar3 = fhz.j;
            iswVar3.a = view;
            iswVar3.b = motionEvent;
            Object objZ2 = fipVar2.b.n().z(fipVar2, fhz.j);
            isw iswVar4 = fhz.j;
            iswVar4.a = null;
            iswVar4.b = null;
            if (objZ2 != null && ((Boolean) objZ2).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
