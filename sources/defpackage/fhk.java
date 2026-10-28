package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fhk implements View.OnLongClickListener {
    public fip a;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        fip fipVar = this.a;
        if (fipVar == null) {
            return false;
        }
        gzj.aS();
        if (fhz.b == null) {
            fhz.b = new abk();
        }
        fhz.b.a = view;
        Object objZ = fipVar.b.n().z(fipVar, fhz.b);
        fhz.b.a = null;
        return objZ != null && ((Boolean) objZ).booleanValue();
    }
}
