package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gty implements vxc {
    private static final agrf d = agrf.h("com/google/android/apps/youtube/music/command/GetSurveyCommandResolver");
    public final ivu a;
    public final xgm b;
    public final vxe c;
    private final Executor e;
    private final aend f;

    public gty(aend aendVar, ivu ivuVar, Executor executor, xgm xgmVar, vxe vxeVar) {
        this.f = aendVar;
        this.a = ivuVar;
        this.e = executor;
        this.b = xgmVar;
        this.c = vxeVar;
    }

    @Override // defpackage.vxc
    public final void a(ajwo ajwoVar) {
        throw null;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, zwb] */
    @Override // defpackage.vxc
    public final /* synthetic */ void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(alee.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(alee.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            alee aleeVar = (alee) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            alyn alynVar = aleeVar.c;
            if (alynVar == null) {
                alynVar = alyn.a;
            }
            aend aendVar = this.f;
            wug wugVar = new wug(aendVar.b, aendVar.d.e());
            wugVar.m();
            wugVar.a = alynVar;
            int iC = afyd.C(aleeVar.d);
            if (iC == 0) {
                iC = 1;
            }
            wugVar.b = iC;
            taf.i(((wnh) aendVar.c).a(wugVar), this.e, new glo(10), new gln(this, 4), null);
        }
    }
}
