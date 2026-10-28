package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fhb implements View.OnClickListener {
    private final fip a;

    public fhb(fip fipVar) {
        this.a = fipVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean zBm = gzj.bm();
        if (zBm) {
            fiu fiuVar = this.a.b;
            if (fiuVar != null) {
                fiuVar.getClass().getName().length();
            }
            boolean z = fna.a;
        }
        try {
            fip fipVar = this.a;
            gzj.aS();
            if (fhz.a == null) {
                fhz.a = new yw();
            }
            fhz.a.a = view;
            fipVar.b.n().z(fipVar, fhz.a);
            fhz.a.a = null;
            if (zBm) {
                boolean z2 = fna.a;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (zBm) {
                    boolean z3 = fna.a;
                }
                throw th2;
            }
        }
    }
}
