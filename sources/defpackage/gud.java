package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gud implements vxc {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/command/IterateCommandsCommandResolver");
    public final vxe b;
    private final Executor c;
    private final gzd d;

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [awmd, java.lang.Object] */
    public gud(vxe vxeVar, cf cfVar, Executor executor, kwq kwqVar) {
        this.b = vxeVar;
        Context context = (Context) kwqVar.a.io();
        context.getClass();
        cfVar.getClass();
        Executor executor2 = (Executor) kwqVar.b.io();
        executor2.getClass();
        zwb zwbVar = (zwb) kwqVar.c.io();
        zwbVar.getClass();
        syn synVar = (syn) kwqVar.d.io();
        synVar.getClass();
        this.d = new gzd(context, executor2, zwbVar, synVar);
        this.c = executor;
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
        aihl aihlVarCheckIsLite = aihn.checkIsLite(amgo.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(amgo.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        amgo amgoVar = (amgo) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        aiie aiieVar = amgoVar.c;
        if (aiieVar.isEmpty()) {
            ((agrc) ((agrc) a.c()).k("com/google/android/apps/youtube/music/command/IterateCommandsCommandResolver", "resolve", 58, "IterateCommandsCommandResolver.java")).t("No commands to iterate.");
            return;
        }
        String str = amgoVar.d;
        aijp aijpVar = amgoVar.e;
        if (aijpVar == null) {
            aijpVar = aijp.a;
        }
        aijp aijpVar2 = aijpVar;
        gzd gzdVar = this.d;
        int size = aiieVar.size();
        afxd afxdVarF = afxd.f(gzdVar.e.n(gzdVar.d.e()));
        vwa vwaVar = new vwa(gzdVar, str, aijpVar2, size, 1);
        Executor executor = gzdVar.c;
        taf.i(afxdVarF.h(vwaVar, executor).b(Throwable.class, new cbs(14), executor), this.c, new glo(11), new gov(this, aiieVar, 5), null);
    }
}
