package defpackage;

import android.app.Activity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class rlo implements rpv {
    final /* synthetic */ ajwo a;
    final /* synthetic */ Activity b;
    final /* synthetic */ rlp c;

    public rlo(rlp rlpVar, ajwo ajwoVar, Activity activity) {
        this.a = ajwoVar;
        this.b = activity;
        this.c = rlpVar;
    }

    @Override // defpackage.rpv
    public final void a() {
        Activity activity = this.b;
        if (tuk.r(activity)) {
            rlp.b(activity, this.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035  */
    @Override // defpackage.rpv
    public final void b(wnq wnqVar) {
        apzh apzhVar;
        ajwo ajwoVar;
        ajwo ajwoVar2 = this.a;
        if (ajwoVar2 != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apzi.a);
            ajwoVar2.c(aihlVarCheckIsLite);
            if (ajwoVar2.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apzi.a);
                ajwoVar2.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar2.j.k(aihlVarCheckIsLite2.d);
                apzhVar = (apzh) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            } else {
                apzhVar = null;
            }
        } else {
            apzhVar = null;
        }
        if (apzhVar == null || (apzhVar.b & 2) == 0) {
            ajwoVar = null;
        } else {
            ajwoVar = apzhVar.c;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
        }
        this.c.b.h(wnqVar, ajwoVar, null);
    }

    @Override // defpackage.rpv
    public final void c() {
        Activity activity = this.b;
        if (tuk.r(activity)) {
            rlp.b(activity, this.a);
        }
    }
}
