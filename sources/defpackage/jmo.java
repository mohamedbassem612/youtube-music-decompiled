package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jmo implements absj, absi {
    public final Activity a;
    public final vxe b;
    public final xgm c;
    public akdd d;
    public acwl e;
    public final abfv f;

    public jmo(Activity activity, vxe vxeVar, xgm xgmVar, abfv abfvVar) {
        this.a = activity;
        this.b = vxeVar;
        this.c = xgmVar;
        this.f = abfvVar;
    }

    @Override // defpackage.absi
    public final Activity a() {
        return this.a;
    }

    @Override // defpackage.absi
    public final void b() {
        acwl acwlVar = this.e;
        if (acwlVar != null) {
            abfv abfvVar = acwlVar.d;
            if (abfvVar == null || !abfvVar.k()) {
                AlertDialog alertDialog = acwlVar.c;
                if (alertDialog != null && alertDialog.isShowing()) {
                    acwlVar.b(7);
                }
            } else {
                Optional optional = (Optional) abfvVar.b;
                optional.isPresent();
                Optional optionalA = ((acwq) optional.get()).a();
                if (true == optionalA.isPresent()) {
                    ((bp) optionalA.get()).iN();
                }
            }
            this.e = null;
        }
    }
}
