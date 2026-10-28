package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adod implements acwm {
    final /* synthetic */ akdd a;
    final /* synthetic */ aokc b;
    final /* synthetic */ Map c;
    final /* synthetic */ adof d;

    public adod(adof adofVar, akdd akddVar, aokc aokcVar, Map map) {
        this.a = akddVar;
        this.b = aokcVar;
        this.c = map;
        this.d = adofVar;
    }

    @Override // defpackage.acwm
    public final void b() {
        akdd akddVar = this.a;
        ajnf ajnfVarB = acfz.B(akddVar);
        if (ajnfVarB != null) {
            ajwo ajwoVar = ajnfVarB.q;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(akzc.b);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                return;
            }
        } else {
            ajwo ajwoVar2 = akddVar.r;
            if (ajwoVar2 == null) {
                ajwoVar2 = ajwo.a;
            }
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akzc.b);
            ajwoVar2.c(aihlVarCheckIsLite2);
            if (ajwoVar2.j.n(aihlVarCheckIsLite2.d)) {
                return;
            }
        }
        this.d.a(this.b, this.c);
    }

    @Override // defpackage.acwm
    public final void a() {
    }

    @Override // defpackage.acwm
    public final void c(boolean z) {
    }
}
