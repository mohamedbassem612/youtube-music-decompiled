package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class iof implements zza {
    final /* synthetic */ iog a;
    private final hel b;

    public iof(iog iogVar, hel helVar) {
        this.a = iogVar;
        this.b = helVar;
    }

    @Override // defpackage.tnh
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        wgc wgcVar = (wgc) obj;
        iog iogVar = this.a;
        iogVar.c.c(new hao());
        hel helVar = this.b;
        ajwo ajwoVar = helVar.f;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apni.a);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        iogVar.D.put(iog.m((apng) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))), wgcVar);
        iogVar.i(helVar, wgcVar);
    }

    @Override // defpackage.tng
    public final void jj(toe toeVar) {
        iog iogVar = this.a;
        iogVar.c.c(new haj());
        hel helVar = this.b;
        hei heiVar = helVar.g;
        if (heiVar == hei.e || heiVar == hei.d) {
            return;
        }
        iogVar.h(helVar, toeVar);
    }

    @Override // defpackage.zza
    public final /* synthetic */ void jk() {
    }
}
