package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gvc extends gut {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/command/MusicLibraryPinCommandResolver");
    public final ttm b;
    public final awmd c;
    public final jin d;
    public final aapw e;
    private final awut f;
    private final vxz g;

    public gvc(aapw aapwVar, ttm ttmVar, vxz vxzVar, awmd awmdVar, jin jinVar, awut awutVar) {
        aapwVar.getClass();
        ttmVar.getClass();
        vxzVar.getClass();
        awmdVar.getClass();
        jinVar.getClass();
        this.e = aapwVar;
        this.b = ttmVar;
        this.g = vxzVar;
        this.c = awmdVar;
        this.d = jinVar;
        this.f = awutVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void a(ajwo ajwoVar) {
        ajwoVar.getClass();
        aihl aihlVar = anqp.a;
        aihlVar.getClass();
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            throw new IllegalArgumentException("Command does not contain MusicLibraryPinCommand.");
        }
        if (this.g.l(266, 45833553L, false)) {
            aihl aihlVar2 = anqp.a;
            aihlVar2.getClass();
            anqo anqoVar = (anqo) aext.x(ajwoVar, aihlVar2);
            wpw wpwVarG = this.e.g();
            wpwVarG.e(anqoVar.b);
            wpwVarG.o(vxg.a(ajwoVar).G());
            aihl aihlVar3 = appx.b;
            aihlVar3.getClass();
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar3);
            ajwoVar.c(aihlVarCheckIsLite2);
            if (ajwoVar.j.n(aihlVarCheckIsLite2.d)) {
                aihlVar3.getClass();
                appw appwVar = (appw) aext.x(ajwoVar, aihlVar3);
                String str = appwVar.c;
                str.getClass();
                if (str.length() > 0) {
                    wpwVarG.p(appwVar.c);
                }
            }
            awro.t(this.f, null, 0, new gmc(this, wpwVarG, (awoq) null, 5), 3);
        }
    }
}
