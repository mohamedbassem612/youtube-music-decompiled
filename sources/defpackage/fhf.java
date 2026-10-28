package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fhf implements View.OnFocusChangeListener {
    public fip a;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        fip fipVar = this.a;
        if (fipVar != null) {
            gzj.aS();
            if (fhz.f == null) {
                fhz.f = new fsz();
            }
            fsz fszVar = fhz.f;
            fszVar.b = view;
            fszVar.a = z;
            fipVar.b.n().z(fipVar, fhz.f);
            fhz.f.b = null;
        }
    }
}
