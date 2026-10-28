package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fhe implements View.OnContextClickListener {
    public fip a;

    @Override // android.view.View.OnContextClickListener
    public final boolean onContextClick(View view) {
        fip fipVar = this.a;
        if (fipVar == null) {
            return false;
        }
        gzj.aS();
        if (fhz.c == null) {
            fhz.c = new yx();
        }
        fhz.c.a = view;
        Object objZ = fipVar.b.n().z(fipVar, fhz.c);
        fhz.c.a = null;
        return objZ != null && ((Boolean) objZ).booleanValue();
    }
}
