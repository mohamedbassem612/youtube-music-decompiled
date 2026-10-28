package defpackage;

import android.accounts.Account;
import android.content.Intent;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gsq extends gut implements sxt {
    private static final agrf b = agrf.h("com/google/android/apps/youtube/music/command/AgeVerificationEndpointResolver");
    public final mgk a;
    private final vxe c;
    private final cf d;
    private final Executor e;
    private final zwb f;
    private ajwo g;
    private final omj h;

    public gsq(vxe vxeVar, cf cfVar, omj omjVar, Executor executor, mgk mgkVar, zwb zwbVar) {
        this.c = vxeVar;
        this.d = cfVar;
        this.h = omjVar;
        this.e = executor;
        this.a = mgkVar;
        this.f = zwbVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final boolean b() {
        return false;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        zwb zwbVar = this.f;
        if (!zwbVar.u() || ajwoVar == null) {
            return;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajae.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajae.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            ajae ajaeVar = (ajae) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            ajwo ajwoVar2 = ajaeVar.d;
            if (ajwoVar2 == null) {
                ajwoVar2 = ajwo.a;
            }
            this.g = ajwoVar2;
            try {
                Account accountM = this.h.M(zwbVar.e());
                if (accountM != null) {
                    this.e.execute(new zvx(this.d, accountM, ajaeVar.c, new glm(this, 6)));
                }
            } catch (Exception e) {
                ((agrc) ((agrc) ((agrc) b.b().i(agso.a, "AgeVerificationEndpointResolver")).j(e)).k("com/google/android/apps/youtube/music/command/AgeVerificationEndpointResolver", "resolve", '\\', "AgeVerificationEndpointResolver.java")).t("Error verifying age");
            }
        }
    }

    @Override // defpackage.sxt
    public final boolean d(int i, int i2, Intent intent) {
        if (i != 2300) {
            return false;
        }
        ajwo ajwoVar = this.g;
        if (ajwoVar != null) {
            this.c.c(ajwoVar, agkj.j("eligible_for_radio_transition", Boolean.FALSE));
        }
        this.g = null;
        return true;
    }
}
