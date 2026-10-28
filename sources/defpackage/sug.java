package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class sug implements adzw {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ sug(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.adzw
    public final void iP(aihh aihhVar) {
        switch (this.$cid) {
            case 0:
                ((sui) this.a).i.dismiss();
                break;
            case 1:
                ((rll) this.a).b.h();
                break;
            case 2:
                ((svs) this.a).a.run();
                break;
            case 3:
                svs svsVar = (svs) this.a;
                svsVar.d = 1;
                svsVar.b.run();
                break;
            case 4:
                if (aihhVar != null) {
                    swm swmVar = (swm) this.a;
                    if (swmVar.c != null) {
                        ajwo ajwoVar = ((ajnf) aihhVar.instance).r;
                        if (ajwoVar == null) {
                            ajwoVar = ajwo.a;
                        }
                        aihl aihlVarCheckIsLite = aihn.checkIsLite(akdb.b);
                        ajwoVar.c(aihlVarCheckIsLite);
                        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                            ajwo ajwoVar2 = ((ajnf) aihhVar.instance).r;
                            if (ajwoVar2 == null) {
                                ajwoVar2 = ajwo.a;
                            }
                            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aqsy.b);
                            ajwoVar2.c(aihlVarCheckIsLite2);
                            if (!ajwoVar2.j.n(aihlVarCheckIsLite2.d)) {
                            }
                        }
                        xgn xgnVar = swmVar.c;
                        ameb amebVar = ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK;
                        ajwo ajwoVar3 = ((ajnf) aihhVar.instance).r;
                        if (ajwoVar3 == null) {
                            ajwoVar3 = ajwo.a;
                        }
                        xgnVar.o(amebVar, new xgj(ajwoVar3.c, (amud) null), null);
                    }
                }
                break;
            case 5:
                sxb sxbVar = (sxb) this.a;
                aqti aqtiVar = sxbVar.a;
                if (aqtiVar != null && (aqtiVar.b & 4) != 0) {
                    ajng ajngVar = aqtiVar.h;
                    if (ajngVar == null) {
                        ajngVar = ajng.a;
                    }
                    ajnf ajnfVar = ajngVar.c;
                    if (ajnfVar == null) {
                        ajnfVar = ajnf.a;
                    }
                    sxbVar.g(ajnfVar);
                    break;
                }
                break;
            case 6:
                sxb sxbVar2 = (sxb) this.a;
                aqti aqtiVar2 = sxbVar2.a;
                if (aqtiVar2 != null && (aqtiVar2.b & 2) != 0) {
                    ajng ajngVar2 = aqtiVar2.g;
                    if (ajngVar2 == null) {
                        ajngVar2 = ajng.a;
                    }
                    ajnf ajnfVar2 = ajngVar2.c;
                    if (ajnfVar2 == null) {
                        ajnfVar2 = ajnf.a;
                    }
                    sxbVar2.g(ajnfVar2);
                    break;
                }
                break;
            case 7:
                ((unn) this.a).f();
                break;
            default:
                aaue aaueVar = (aaue) this.a;
                xgn xgnVar2 = aaueVar.o;
                if (xgnVar2 != null) {
                    ajnf ajnfVar3 = (ajnf) aihhVar.instance;
                    if ((ajnfVar3.b & SemanticState.Obscured) != 0) {
                        ajwo ajwoVar4 = ajnfVar3.r;
                        if (ajwoVar4 == null) {
                            ajwoVar4 = ajwo.a;
                        }
                        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aoaq.b);
                        ajwoVar4.c(aihlVarCheckIsLite3);
                        if (!ajwoVar4.j.n(aihlVarCheckIsLite3.d)) {
                            ajwo ajwoVar5 = ((ajnf) aihhVar.instance).r;
                            if (ajwoVar5 == null) {
                                ajwoVar5 = ajwo.a;
                            }
                            ajwo ajwoVarF = xgnVar2.f(ajwoVar5);
                            if (ajwoVarF == null) {
                                aihhVar.copyOnWrite();
                                ajnf ajnfVar4 = (ajnf) aihhVar.instance;
                                ajnfVar4.r = null;
                                ajnfVar4.b &= -4097;
                            } else {
                                aihhVar.copyOnWrite();
                                ajnf ajnfVar5 = (ajnf) aihhVar.instance;
                                ajnfVar5.r = ajwoVarF;
                                ajnfVar5.b |= SemanticState.Obscured;
                            }
                        }
                    }
                }
                aaueVar.h.dismiss();
                break;
        }
    }
}
