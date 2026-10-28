package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class grg extends gut {
    private static final agrf a = agrf.h("com/google/android/apps/youtube/music/browse/command/BrowseSectionListMutationCommandResolver");
    private final jki b;

    public grg(jki jkiVar) {
        this.b = jkiVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void a(ajwo ajwoVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmt.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        apoi apoiVar = ((ajmt) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).c;
        if (apoiVar == null) {
            apoiVar = apoi.a;
        }
        acjx acjxVarAe = aawb.ae(apoiVar);
        if (acjxVarAe == null || acjxVarAe.c().isEmpty()) {
            ((agrc) ((agrc) a.b().i(agso.a, "BrowseSectionListMutation")).k("com/google/android/apps/youtube/music/browse/command/BrowseSectionListMutationCommandResolver", "resolve", 48, "BrowseSectionListMutationCommandResolver.java")).t("BrowseSectionListMutationCommand called without continuation");
            return;
        }
        bpp bppVarB = this.b.b();
        if (!(bppVarB instanceof gpx)) {
            ((agrc) ((agrc) a.b().i(agso.a, "BrowseSectionListMutation")).k("com/google/android/apps/youtube/music/browse/command/BrowseSectionListMutationCommandResolver", "resolve", 77, "BrowseSectionListMutationCommandResolver.java")).t("BrowseSectionListMutationCommand called without a MutableSectionListFragment.");
            return;
        }
        adtv adtvVarD = ((gpx) bppVarB).d();
        if (adtvVarD == null) {
            ((agrc) ((agrc) a.b().i(agso.a, "BrowseSectionListMutation")).k("com/google/android/apps/youtube/music/browse/command/BrowseSectionListMutationCommandResolver", "resolve", 56, "BrowseSectionListMutationCommandResolver.java")).t("MutableSectionListFragment did not provide a section list controller for mutation.");
        } else {
            adtvVarD.aB(acjxVarAe, new grh(1));
        }
    }

    @Override // defpackage.gut, defpackage.vxc
    public final boolean b() {
        return true;
    }
}
