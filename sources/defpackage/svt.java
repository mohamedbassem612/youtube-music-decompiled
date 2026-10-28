package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class svt implements str {
    final /* synthetic */ svu a;
    private final ajwo b;

    public svt(svu svuVar, ajwo ajwoVar) {
        this.a = svuVar;
        this.b = ajwoVar;
    }

    @Override // defpackage.str
    public final void d() {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aqsx.b);
        ajwo ajwoVar = this.b;
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        aqsx aqsxVar = (aqsx) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        if ((aqsxVar.c & 32) != 0) {
            svu svuVar = this.a;
            ajwo ajwoVar2 = aqsxVar.g;
            if (ajwoVar2 == null) {
                ajwoVar2 = ajwo.a;
            }
            svuVar.c.c(ajwoVar2, null);
        }
    }

    @Override // defpackage.str
    public final void e() {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aqsx.b);
        ajwo ajwoVar = this.b;
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        aqsx aqsxVar = (aqsx) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        int i = aqsxVar.c;
        amfe amfeVar = null;
        if ((i & 16) != 0) {
            svu svuVar = this.a;
            ajwo ajwoVar2 = aqsxVar.f;
            if (ajwoVar2 == null) {
                ajwoVar2 = ajwo.a;
            }
            svuVar.c.c(ajwoVar2, null);
            return;
        }
        if ((i & 4) != 0) {
            aqtr aqtrVar = aqsxVar.e;
            if (aqtrVar == null) {
                aqtrVar = aqtr.a;
            }
            amfeVar = aqtrVar.b == 86135402 ? (amfe) aqtrVar.c : amfe.a;
        }
        if (amfeVar != null) {
            this.a.b.d(amfeVar);
        }
    }

    @Override // defpackage.stt
    public final boolean f() {
        return true;
    }
}
