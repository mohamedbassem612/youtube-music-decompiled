package defpackage;

import android.os.Handler;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gxn extends gut {
    public final jnj a;
    private final Handler b;

    public gxn(jnj jnjVar, Handler handler) {
        jnjVar.getClass();
        this.a = jnjVar;
        this.b = handler;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        ajwoVar.getClass();
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apyb.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apyb.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            apyb apybVar = (apyb) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            apyc apycVar = apybVar.c;
            if (apycVar == null) {
                apycVar = apyc.a;
            }
            if ((apycVar.b & 1) != 0) {
                apyc apycVar2 = apybVar.c;
                if (apycVar2 == null) {
                    apycVar2 = apyc.a;
                }
                amzh amzhVar = apycVar2.c;
                if (amzhVar == null) {
                    amzhVar = amzh.a;
                }
                this.b.post(new fuc(this, amzhVar, 8));
            }
        }
    }
}
