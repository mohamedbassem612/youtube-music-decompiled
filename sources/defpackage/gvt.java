package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gvt extends gut {
    private final jki a;
    private final tbt b;

    public gvt(jki jkiVar, tbt tbtVar) {
        this.a = jkiVar;
        this.b = tbtVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aoap.a);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        String strE = this.a.e();
        if (strE != null) {
            this.b.c(new hcn(strE));
        }
    }
}
