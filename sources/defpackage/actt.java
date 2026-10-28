package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class actt {
    public final avmm a = new avmm();
    public apfp b;
    public apfp c;
    public boolean d;
    private final abvn e;
    private final hno f;

    public actt(abvn abvnVar, hno hnoVar) {
        this.e = abvnVar;
        this.f = hnoVar;
    }

    public static apfp a(ajwo ajwoVar) {
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                return (apfp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            }
        }
        return null;
    }

    public final void b() {
        abvn abvnVar = this.e;
        int i = 4;
        this.a.e(abvnVar.H().al(new acte(this, 7), new acrr(i)), abvnVar.C().p().W(new ablh(19)).al(new acte(this, 8), new acrr(i)));
    }

    public final boolean c(apfp apfpVar) {
        boolean zEquals;
        if (apfpVar == null) {
            return false;
        }
        apfp apfpVar2 = this.c;
        if (apfpVar2 == null) {
            apfpVar2 = this.b;
        }
        if (((vxz) this.f.k).m(50, 45679026L)) {
            zEquals = apfpVar2 != null && apfpVar2.o.equals(apfpVar.o) && apfpVar2.p.equals(apfpVar.p);
        } else {
            zEquals = Objects.equals(apfpVar2, apfpVar);
        }
        return this.d && zEquals;
    }
}
