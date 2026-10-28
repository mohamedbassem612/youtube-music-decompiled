package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acow extends acvv {
    private final ViewGroup a;
    private final acvx b;
    private akrn c;
    private String d;

    public acow(Context context, acvy acvyVar) {
        this.a = new FrameLayout(context);
        this.b = acvyVar.io();
    }

    @Override // defpackage.acvv
    public final View a() {
        return this.a;
    }

    @Override // defpackage.acvv
    public final void c(ajwo ajwoVar) {
        this.d = aecm.ad(ajwoVar);
    }

    @Override // defpackage.acvv
    public final void e(boolean z) {
        this.b.d(this.a, this.c, this.d, true);
    }

    @Override // defpackage.acvv
    public final void h(alqc alqcVar) {
        apez apezVar = alqcVar.d;
        if (apezVar == null) {
            apezVar = apez.a;
        }
        apji apjiVar = (apezVar.b == 1182 ? (apfj) apezVar.c : apfj.a).b;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
        apjiVar.c(aihlVarCheckIsLite);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
        akrn akrnVar = (akrn) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        this.c = akrnVar;
        this.b.d(this.a, akrnVar, this.d, this.j);
    }

    @Override // defpackage.acvv
    public final void j() {
        this.b.b();
        this.c = null;
    }
}
