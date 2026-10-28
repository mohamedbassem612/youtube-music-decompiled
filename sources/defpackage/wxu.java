package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wxu implements vxc {
    public final ttm a;
    public final wwn b;
    public final ahgb c;
    private final wrb d;

    public wxu(wrb wrbVar, wwn wwnVar, ahgb ahgbVar, ttm ttmVar) {
        wrbVar.getClass();
        this.d = wrbVar;
        wwnVar.getClass();
        this.b = wwnVar;
        ahgbVar.getClass();
        this.c = ahgbVar;
        ttmVar.getClass();
        this.a = ttmVar;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        wrb wrbVar = this.d;
        wrc wrcVar = new wrc(wrbVar.b, wrbVar.c.e());
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aniw.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        wrcVar.a = ((aniw) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).c;
        if ((ajwoVar.b & 1) != 0) {
            wrcVar.n(ajwoVar.c);
        } else {
            wrcVar.m();
        }
        wrbVar.f.d(wrcVar, new gtg(this, 9));
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }
}
