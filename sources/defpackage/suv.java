package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class suv implements vxc {
    private final wvi a;
    private final cf b;
    private final sud c = new sud();
    private final Executor d;
    private final vxe e;
    private final vxz f;
    private final xte g;

    public suv(wvi wviVar, cf cfVar, xte xteVar, Executor executor, vxe vxeVar, vxz vxzVar) {
        this.a = wviVar;
        this.b = cfVar;
        this.g = xteVar;
        this.d = executor;
        this.e = vxeVar;
        this.f = vxzVar;
    }

    @Override // defpackage.vxc
    public final boolean b() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [awmd, java.lang.Object] */
    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        cf cfVar = this.b;
        if (cfVar.getLifecycle().a().a(bob.e)) {
            sud sudVar = this.c;
            sudVar.iR(false);
            sudVar.h(cfVar.getSupportFragmentManager(), sud.k);
        }
        wvi wviVar = this.a;
        wvf wvfVarA = wviVar.a();
        aihl aihlVarCheckIsLite = aihn.checkIsLite(arom.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        Object objC = objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK);
        vxz vxzVar = this.f;
        arom aromVar = (arom) objC;
        if (vxzVar.m(13, 45620268L)) {
            vxe vxeVar = this.e;
            ajwn ajwnVar = aromVar.e;
            if (ajwnVar == null) {
                ajwnVar = ajwn.a;
            }
            nsh.g(vxeVar, ajwnVar);
        }
        wvfVarA.d = wvf.j(aromVar.c);
        wvfVarA.n(ajwoVar.c);
        xte xteVar = this.g;
        sud sudVar2 = this.c;
        svp svpVar = (svp) tym.U(map, "PostTransactionCallback", svp.class);
        xeu xeuVar = (xeu) xteVar.a.io();
        xeuVar.getClass();
        ttm ttmVar = (ttm) xteVar.e.io();
        ttmVar.getClass();
        vwt vwtVar = (vwt) xteVar.d.io();
        vwtVar.getClass();
        xgn xgnVar = (xgn) xteVar.b.io();
        xgnVar.getClass();
        cfVar.getClass();
        aromVar.getClass();
        abfv abfvVar = (abfv) xteVar.f.io();
        abfvVar.getClass();
        vxzVar.getClass();
        wyk wykVar = new wyk(xeuVar, ttmVar, vwtVar, xteVar.c, xgnVar, cfVar, sudVar2, aromVar, svpVar, abfvVar, vxzVar);
        taf.k(cfVar, wviVar.d(wvfVarA, this.d), new jlz(wykVar, 14), new jlz(wykVar, 15));
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }
}
