package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gws extends gut {
    private final ilp a;

    public gws(ilp ilpVar) {
        this.a = ilpVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void a(ajwo ajwoVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apcm.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apcm.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        Object objC = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
        ilp ilpVar = this.a;
        apji apjiVar = ((apcm) objC).c;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        apji apjiVar2 = apjiVar;
        aigj aigjVarA = vxg.a(ajwoVar);
        ListenableFuture listenableFuture = ilpVar.l;
        if (listenableFuture != null && !listenableFuture.isDone()) {
            ilpVar.l.cancel(false);
        }
        zwa zwaVarE = ((zwb) ilpVar.e.io()).e();
        ahng.x(ilpVar.a(zwaVarE), afwl.g(new ilm(ilpVar, zwaVarE, apjiVar2, aigjVarA, 0)), ilpVar.j);
    }
}
