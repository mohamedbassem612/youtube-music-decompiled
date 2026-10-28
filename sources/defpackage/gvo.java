package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gvo extends gut {
    private static final agrf a = agrf.h("com/google/android/apps/youtube/music/command/MusicUpdateEditablePlaylistDescriptionCommandResolver");
    private final jki b;

    public gvo(jki jkiVar) {
        this.b = jkiVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVar = anzp.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        bpp bppVarB = this.b.b();
        if (!(bppVarB instanceof ijo)) {
            ((agrc) ((agrc) a.b()).k("com/google/android/apps/youtube/music/command/MusicUpdateEditablePlaylistDescriptionCommandResolver", "resolve", 43, "MusicUpdateEditablePlaylistDescriptionCommandResolver.java")).t("Updating editable playlist description is not supported without an open playlist");
            return;
        }
        ijo ijoVar = (ijo) bppVarB;
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        anzp anzpVar = (anzp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        ijoVar.Q(anzpVar.c == 1 ? (String) anzpVar.d : "");
    }
}
