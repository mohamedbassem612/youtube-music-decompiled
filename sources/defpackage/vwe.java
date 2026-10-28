package defpackage;

import com.google.common.util.concurrent.MoreExecutors;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vwe implements vxc {
    private final awmd a;

    public vwe(awmd awmdVar) {
        this.a = awmdVar;
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
    public final void c(ajwo ajwoVar, Map map) {
        ajwoVar.getClass();
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aplv.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            vwb vwbVar = (vwb) this.a.io();
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aplv.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            aplv aplvVar = (aplv) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            aigj aigjVarA = vxg.a(ajwoVar);
            zwa zwaVarE = vwbVar.c.e();
            wof wofVar = vwbVar.e;
            wod wodVarA = wofVar.a(zwaVarE, vwbVar.d.k(), zwaVarE.m());
            ajgq ajgqVarA = ajgq.a(aplvVar.d);
            if (ajgqVarA == null) {
                ajgqVarA = ajgq.ENGAGEMENT_TYPE_UNKNOWN;
            }
            wodVarA.b = ajgqVarA;
            wodVarA.a.addAll(aplvVar.c);
            if (aigjVarA != null) {
                wodVarA.o(aigjVarA.G());
            } else {
                wodVarA.o(vzh.b);
            }
            taf.i(wofVar.b(wodVarA, vwbVar.b, null), MoreExecutors.directExecutor(), new roc(vwbVar, 19), new itt(vwbVar, wodVarA, 16), null);
        }
    }
}
