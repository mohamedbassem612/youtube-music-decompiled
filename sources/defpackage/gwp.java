package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gwp extends gut {
    private static final agrf a = agrf.h("com/google/android/apps/youtube/music/command/PollPlaylistCommandResolver");
    private final awmd b;

    public gwp(awmd awmdVar) {
        this.b = awmdVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void a(ajwo ajwoVar) {
        aihl aihlVar = aowg.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        aowg aowgVar = (aowg) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        int iAS = a.aS(aowgVar.e);
        if (iAS == 0 || iAS != 2) {
            agrc agrcVar = (agrc) ((agrc) a.c()).k("com/google/android/apps/youtube/music/command/PollPlaylistCommandResolver", "resolve", 38, "PollPlaylistCommandResolver.java");
            int iAS2 = a.aS(aowgVar.e);
            if (iAS2 == 0) {
                iAS2 = 1;
            }
            agrcVar.u("Unsupported PollPlaylistCommand source: %d", iAS2 - 1);
            return;
        }
        iet ietVar = (iet) this.b.io();
        agrx agrxVar = agso.a;
        ietVar.c();
        wsy wsyVarA = ietVar.a();
        wsx wsxVar = new wsx(wsyVarA.b, wsyVarA.e.hw(), aowgVar.d, 2, (aowgVar.c & 4) != 0 ? Optional.of(aowgVar.f) : Optional.empty(), null);
        ietVar.e = Optional.of(aowgVar.d);
        ((abjp) ietVar.b.io()).p(ietVar.f);
        ietVar.d(wsxVar);
    }

    @Override // defpackage.gut, defpackage.vxc
    public final boolean b() {
        return true;
    }
}
