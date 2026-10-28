package defpackage;

import j$.util.Optional;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gri extends gut {
    private static final agrf a = agrf.h("com/google/android/apps/youtube/music/browse/command/BrowseSectionListReloadEndpointResolver");
    private static final adud b = new grh(0);
    private final axsp c;

    public gri(axsp axspVar) {
        this.c = axspVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final boolean b() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [adtv, aduc] */
    /* JADX WARN: Type inference failed for: r1v9, types: [adtb] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v4, types: [twi] */
    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmu.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        ajmu ajmuVar = (ajmu) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        ajmv ajmvVar = ajmuVar.d;
        if (ajmvVar == null) {
            ajmvVar = ajmv.a;
        }
        if ((ajmvVar.b & 1) != 0) {
            ?? r1 = (aduc) tym.U(map, "sectionListController", aduc.class);
            if (r1 == 0) {
                akrn akrnVar = null;
                if ((ajmuVar.c & 4) == 0 || !ajmuVar.f) {
                    ajwoVar = null;
                }
                axsp axspVar = this.c;
                tua tuaVarI = tub.i();
                tuaVarI.d(ajmuVar.e);
                tuaVarI.b = ajwoVar;
                ajmv ajmvVar2 = ajmuVar.d;
                if (ajmvVar2 == null) {
                    ajmvVar2 = ajmv.a;
                }
                apho aphoVar = ajmvVar2.c;
                if (aphoVar == null) {
                    aphoVar = apho.a;
                }
                tuaVarI.a = aphoVar;
                tuaVarI.c(ajmuVar.g);
                tuaVarI.d = acjw.d;
                if ((ajmuVar.c & 16) != 0) {
                    alme almeVar = ajmuVar.h;
                    if (almeVar == null) {
                        almeVar = alme.a;
                    }
                    akrnVar = almeVar.b == 153515154 ? (akrn) almeVar.c : akrn.a;
                }
                tuaVarI.c = Optional.ofNullable(akrnVar);
                axspVar.kk(tuaVarI.a());
                ((agrc) ((agrc) a.b().i(agso.a, "BrowseSectionListReload")).k("com/google/android/apps/youtube/music/browse/command/BrowseSectionListReloadEndpointResolver", "resolve", 89, "BrowseSectionListReloadEndpointResolver.java")).t("BrowseSectionListReloadEndpoint called without controller");
                return;
            }
            boolean zBooleanValue = ((Boolean) tym.T(map, "force_refresh", Boolean.FALSE)).booleanValue();
            grj grjVar = (grj) tym.U(map, "request_mutator", grj.class);
            if (!(r1 instanceof adtb)) {
                if (zBooleanValue) {
                    ajmv ajmvVar3 = ajmuVar.d;
                    if (ajmvVar3 == null) {
                        ajmvVar3 = ajmv.a;
                    }
                    apho aphoVar2 = ajmvVar3.c;
                    if (aphoVar2 == null) {
                        aphoVar2 = apho.a;
                    }
                    r1.aF(aawb.ae(aphoVar2), ajwoVar);
                    return;
                }
                ajmv ajmvVar4 = ajmuVar.d;
                if (ajmvVar4 == null) {
                    ajmvVar4 = ajmv.a;
                }
                apho aphoVar3 = ajmvVar4.c;
                if (aphoVar3 == null) {
                    aphoVar3 = apho.a;
                }
                r1.aC(aawb.ae(aphoVar3), ajwoVar);
                return;
            }
            ?? r2 = (adtb) r1;
            if (zBooleanValue) {
                ajmv ajmvVar5 = ajmuVar.d;
                if (ajmvVar5 == null) {
                    ajmvVar5 = ajmv.a;
                }
                apho aphoVar4 = ajmvVar5.c;
                if (aphoVar4 == null) {
                    aphoVar4 = apho.a;
                }
                r2.N(aphoVar4, ajwoVar);
                return;
            }
            ajmv ajmvVar6 = ajmuVar.d;
            if (ajmvVar6 == null) {
                ajmvVar6 = ajmv.a;
            }
            apho aphoVar5 = ajmvVar6.c;
            if (aphoVar5 == null) {
                aphoVar5 = apho.a;
            }
            r2.O(aphoVar5, grjVar != null ? grjVar.a : new gnx(4), b, ajwoVar);
        }
    }
}
