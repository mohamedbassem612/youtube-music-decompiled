package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gtw extends gut {
    public final gfp a;
    public final cf b;
    public final hdp c;
    public final Executor d;
    private final jki e;

    /* JADX WARN: Type inference failed for: r7v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [awmd, java.lang.Object] */
    public gtw(Executor executor, gfp gfpVar, jki jkiVar, cf cfVar, kwq kwqVar) {
        this.d = executor;
        this.a = gfpVar;
        this.e = jkiVar;
        this.b = cfVar;
        Context context = (Context) kwqVar.a.io();
        context.getClass();
        Executor executor2 = (Executor) kwqVar.d.io();
        executor2.getClass();
        zwb zwbVar = (zwb) kwqVar.b.io();
        zwbVar.getClass();
        syn synVar = (syn) kwqVar.c.io();
        synVar.getClass();
        cfVar.getClass();
        this.c = new hdp(context, executor2, zwbVar, synVar, cfVar);
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aldp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        cc ccVarB = this.e.b();
        if (!(ccVarB instanceof hdj)) {
            hdp hdpVar = this.c;
            afxd afxdVarF = afxd.f(hdpVar.f.n(hdpVar.d.e()));
            hba hbaVar = new hba(hdpVar, 2);
            Executor executor = hdpVar.c;
            taf.n(afxdVarF.h(hbaVar, executor).b(Throwable.class, new hdn(3), executor), this.d, new gov(this, ajwoVar, 4));
            return;
        }
        hdj hdjVar = (hdj) ccVarB;
        Bundle bundle = new Bundle();
        bundle.putByteArray("invoking_navigation", ajwoVar.toByteArray());
        hdjVar.setArguments(bundle);
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aldp.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        hdjVar.z((aldp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)));
    }
}
