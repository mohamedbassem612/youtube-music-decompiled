package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adhi implements vxc {
    public static final agfr a = aguu.al(new ytj(14));
    private final wbz b;
    private final zwb c;
    private final avmb d;
    private final aeod e;

    public adhi(wbz wbzVar, zwb zwbVar, avmb avmbVar, aeod aeodVar) {
        this.b = wbzVar;
        this.c = zwbVar;
        this.d = avmbVar;
        this.e = aeodVar;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        List<adhf> listF;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(akzp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        akzp akzpVar = (akzp) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        int i = akzpVar.c;
        if ((i & 1) == 0 || (i & 2) == 0 || (listF = this.e.f(akzpVar.d)) == null) {
            return;
        }
        for (adhf adhfVar : listF) {
            wby wbyVarE = this.b.e(this.c.e());
            wbyVarE.g(adhfVar.g).s(this.d).k(new adhh(akzpVar, adhfVar, wbyVarE, 0)).H();
        }
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }
}
