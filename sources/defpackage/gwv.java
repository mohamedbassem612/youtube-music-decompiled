package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gwv extends gut {
    private final hkl a;

    public gwv(hkl hklVar) {
        this.a = hklVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void a(ajwo ajwoVar) {
        ajwoVar.getClass();
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aphk.a);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aphk.a);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        aphj aphjVar = (aphj) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        int size = aphjVar.b.size();
        hkl hklVar = this.a;
        if (size <= 0) {
            hklVar.h();
            return;
        }
        aiie aiieVar = aphjVar.b;
        if (aiieVar.isEmpty()) {
            return;
        }
        aapw aapwVar = hklVar.s;
        taf.k(hklVar.m, aapwVar.c(aapwVar.d(aiieVar), hklVar.d), new gnx(9), new gnx(10));
    }
}
