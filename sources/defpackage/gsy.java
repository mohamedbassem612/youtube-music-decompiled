package defpackage;

import j$.util.Optional;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gsy extends gut {
    private final gfp a;
    private final gfq b;
    private final xit c;
    private final vxz d;

    public gsy(gfp gfpVar, gfq gfqVar, xit xitVar, vxz vxzVar) {
        this.a = gfpVar;
        this.b = gfqVar;
        this.c = xitVar;
        this.d = vxzVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final boolean b() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, xir] */
    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmj.a);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        gnl gnlVar = gnl.a;
        heg hegVar = new heg((short[]) null);
        if (this.d.l(14, 45680269L, false)) {
            Optional optionalA = this.b.a();
            if (true == optionalA.isPresent()) {
                optionalA.get().f(tau.ACTION_ABANDONED);
            }
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajmj.a);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            hegVar.e(hmy.P(((ajmf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).c, this.c));
        }
        this.a.e(ajwoVar, map, hegVar.d());
    }
}
