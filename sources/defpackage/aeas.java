package defpackage;

import android.view.View;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aeas implements adma {
    public final abgo a;
    private final aunn b;
    private final acxt c;
    private final awli d = new awli(Optional.empty());
    private View e;

    public aeas(aunn aunnVar, acxt acxtVar, abgo abgoVar) {
        this.b = aunnVar;
        this.c = acxtVar;
        this.a = abgoVar;
    }

    @Override // defpackage.adma
    public final View a() {
        View view = this.e;
        view.getClass();
        return view;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.e = null;
        this.d.kk(Optional.empty());
        this.c.b(admhVar);
    }

    public final avlr d() {
        return this.d.X(new acpr(this, 12));
    }

    @Override // defpackage.adma
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void hU(adly adlyVar, akyv akyvVar) {
        int i = akyvVar.c;
        if ((i & 1) == 0 || (i & 2) == 0) {
            this.d.kk(Optional.empty());
            return;
        }
        this.d.kk(Optional.of(akyvVar.e));
        apji apjiVar = akyvVar.d;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
        apjiVar.c(aihlVarCheckIsLite);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
        acxm acxmVarC = ((acyx) this.b.io()).c((akrn) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK)));
        acxt acxtVar = this.c;
        acxtVar.h(adlyVar, acxmVarC, false, false);
        this.e = acxtVar.a();
    }
}
