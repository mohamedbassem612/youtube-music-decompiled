package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gwd extends gut {
    public final Executor a;
    public final cf b;
    public final vxe c;
    public final hbc d;

    /* JADX WARN: Type inference failed for: r7v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [awmd, java.lang.Object] */
    public gwd(Executor executor, cf cfVar, vxe vxeVar, kwq kwqVar) {
        this.a = executor;
        this.b = cfVar;
        this.c = vxeVar;
        Context context = (Context) kwqVar.a.io();
        context.getClass();
        Executor executor2 = (Executor) kwqVar.b.io();
        executor2.getClass();
        zwb zwbVar = (zwb) kwqVar.c.io();
        zwbVar.getClass();
        syn synVar = (syn) kwqVar.d.io();
        synVar.getClass();
        cfVar.getClass();
        this.d = new hbc(context, executor2, zwbVar, synVar, cfVar);
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void a(ajwo ajwoVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aojl.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aojl.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        Object objC = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
        hbc hbcVar = this.d;
        aojl aojlVar = (aojl) objC;
        String str = aojlVar.e;
        afxd afxdVarF = afxd.f(hbcVar.f.n(hbcVar.d.e()));
        hba hbaVar = new hba(hbcVar, 0);
        Executor executor = hbcVar.c;
        int i = 7;
        taf.n(afxdVarF.h(hbaVar, executor).g(new gmv(str, i), executor).b(Throwable.class, new cbs(16), executor), this.a, new gov(this, aojlVar, i));
    }
}
