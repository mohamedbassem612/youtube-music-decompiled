package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sua implements vxc {
    public final vxe a;
    public final sud b = new sud();
    public final ttm c;
    public final xte d;
    private final cf e;
    private final svo f;
    private final vxz g;

    public sua(cf cfVar, vxe vxeVar, xte xteVar, svo svoVar, vxz vxzVar, ttm ttmVar) {
        this.e = cfVar;
        this.a = vxeVar;
        this.d = xteVar;
        this.f = svoVar;
        this.g = vxzVar;
        this.c = ttmVar;
    }

    @Override // defpackage.vxc
    public final void a(ajwo ajwoVar) {
        throw null;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void c(ajwo ajwoVar, Map map) {
        if (this.g.m(14, 45634041L)) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aldt.b);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aldt.b);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                Object objC = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
                sud sudVar = this.b;
                sudVar.iR(false);
                sudVar.gT(this.e.getSupportFragmentManager(), sud.k);
                this.f.b(new stz(this, ajwoVar, (aldt) objC));
            }
        }
    }
}
