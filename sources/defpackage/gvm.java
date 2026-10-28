package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gvm extends gut {
    private final hnq a;

    public gvm(hnq hnqVar) {
        this.a = hnqVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(anxl.a);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        jko jkoVarEdit = this.a.a.edit();
        jkoVarEdit.a("auto_offline_edu_shelf_dismissed", true);
        jkoVarEdit.apply();
    }
}
