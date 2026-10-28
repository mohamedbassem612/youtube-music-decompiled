package defpackage;

import android.text.Spanned;
import app.rive.semantics.SemanticState;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ssg implements vxc {
    private final xgm a;
    private final wbz b;
    private final vxe c;
    private final zwb d;
    private final lqa e;

    public ssg(lqa lqaVar, xgm xgmVar, zwb zwbVar, wbz wbzVar, vxe vxeVar) {
        this.e = lqaVar;
        this.a = xgmVar;
        this.d = zwbVar;
        this.b = wbzVar;
        this.c = vxeVar;
    }

    private final xgn d() {
        return this.a.hB();
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0148  */
    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        String str;
        alay alayVar;
        alay alayVar2;
        ajnf ajnfVar;
        alay alayVar3;
        alay alayVar4;
        alay alayVar5;
        aipm aipmVar;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(akgi.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        akgi akgiVar = (akgi) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        wby wbyVarE = this.b.e(this.d.e());
        if ((akgiVar.c & 64) != 0 && !akgiVar.h.isEmpty() && (aipmVar = (aipm) wbyVarE.g(akgiVar.h).g(aipm.class).E()) != null && aipmVar.getShouldRequireViewerAck().booleanValue()) {
            vxe vxeVar = this.c;
            ajwo ajwoVar2 = akgiVar.i;
            if (ajwoVar2 == null) {
                ajwoVar2 = ajwo.a;
            }
            vxeVar.a(ajwoVar2);
            return;
        }
        boolean z = akgiVar.g;
        boolean z2 = z || akgiVar.j;
        if (z && d() != null) {
            d().p(new xgj(xhb.b(103918)), null);
            d().o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(104381)), null);
        }
        lqa lqaVar = this.e;
        sri sriVar = (sri) tym.U(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", sri.class);
        akgh akghVar = akgiVar.d;
        if (akghVar == null) {
            akghVar = akgh.a;
        }
        if (akgiVar.e == null) {
            ajww ajwwVar = ajww.a;
        }
        if (akgiVar.f == null) {
            ajww ajwwVar2 = ajww.a;
        }
        if (sriVar != null) {
            throw null;
        }
        int i = akghVar.b;
        if (i == 97806346) {
            ajyj ajyjVar = i == 97806346 ? (ajyj) akghVar.c : ajyj.a;
            Object obj = lqaVar.a;
            if ((ajyjVar.b & 32) == 0) {
                ((agrc) ((agrc) srd.a.b()).k("com/google/android/libraries/youtube/comment/controller/CommentDialogController", "newReply", 464, "CommentDialogController.java")).t("No reply button specified for comment reply dialog.");
                return;
            }
            ajng ajngVar = ajyjVar.f;
            if (ajngVar == null) {
                ajngVar = ajng.a;
            }
            if ((ajngVar.b & 1) == 0) {
                ((agrc) ((agrc) srd.a.b()).k("com/google/android/libraries/youtube/comment/controller/CommentDialogController", "newReply", 467, "CommentDialogController.java")).t("No button renderer specified for comment reply dialog.");
                return;
            }
            ajng ajngVar2 = ajyjVar.f;
            if (ajngVar2 == null) {
                ajngVar2 = ajng.a;
            }
            ajnf ajnfVar2 = ajngVar2.c;
            if (ajnfVar2 == null) {
                ajnfVar2 = ajnf.a;
            }
            if ((ajnfVar2.b & SemanticState.Modal) == 0) {
                ((agrc) ((agrc) srd.a.b()).k("com/google/android/libraries/youtube/comment/controller/CommentDialogController", "newReply", 473, "CommentDialogController.java")).t("No service endpoint specified for comment reply dialog.");
                return;
            }
            srd srdVar = (srd) obj;
            if (!srdVar.i.l(15, 45617682L, false) || ajwoVar == null) {
                str = "";
            } else {
                aihl aihlVar = appx.b;
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                ajwoVar.c(aihlVarCheckIsLite2);
                if (ajwoVar.j.n(aihlVarCheckIsLite2.d)) {
                    aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
                    ajwoVar.c(aihlVarCheckIsLite3);
                    Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite3.d);
                    appw appwVar = (appw) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2));
                    if (appwVar.c.isEmpty()) {
                        str = "";
                    } else {
                        str = appwVar.c;
                    }
                } else {
                    str = "";
                }
            }
            ajyj ajyjVarD = str.isEmpty() ? srdVar.d(ajyjVar) : srdVar.e(ajyjVar, str);
            aqmh aqmhVar = ajyjVarD.c;
            if (aqmhVar == null) {
                aqmhVar = aqmh.a;
            }
            aqmh aqmhVar2 = aqmhVar;
            if ((ajyjVarD.b & SemanticState.Obscured) != 0) {
                alayVar = ajyjVarD.h;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
            } else {
                alayVar = null;
            }
            Spanned spannedK = ackj.k(null, alayVar, null, false);
            if ((ajyjVarD.b & 16) != 0) {
                alayVar2 = ajyjVarD.e;
                if (alayVar2 == null) {
                    alayVar2 = alay.a;
                }
            } else {
                alayVar2 = null;
            }
            Spanned spannedK2 = ackj.k(null, alayVar2, null, false);
            ajng ajngVar3 = ajyjVarD.f;
            if (ajngVar3 == null) {
                ajngVar3 = ajng.a;
            }
            ajnf ajnfVar3 = ajngVar3.c;
            if (ajnfVar3 == null) {
                ajnfVar3 = ajnf.a;
            }
            ajnf ajnfVar4 = ajnfVar3;
            if ((ajyjVarD.b & SemanticState.Focused) != 0) {
                ajng ajngVar4 = ajyjVarD.g;
                if (ajngVar4 == null) {
                    ajngVar4 = ajng.a;
                }
                ajnf ajnfVar5 = ajngVar4.c;
                if (ajnfVar5 == null) {
                    ajnfVar5 = ajnf.a;
                }
                ajnfVar = ajnfVar5;
            } else {
                ajnfVar = null;
            }
            ajng ajngVar5 = ajyjVarD.i;
            if (ajngVar5 == null) {
                ajngVar5 = ajng.a;
            }
            ajnf ajnfVar6 = ajngVar5.c;
            if (ajnfVar6 == null) {
                ajnfVar6 = ajnf.a;
            }
            ajnf ajnfVar7 = ajnfVar6;
            apji apjiVar = ajyjVarD.j;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            apji apjiVar2 = apjiVar;
            String str2 = ajyjVarD.k;
            if ((ajyjVarD.b & SemanticState.Obscured) != 0) {
                alay alayVar6 = ajyjVarD.h;
                if (alayVar6 == null) {
                    alayVar6 = alay.a;
                }
                alayVar3 = alayVar6;
            } else {
                alayVar3 = null;
            }
            if ((ajyjVarD.b & 16) != 0) {
                alay alayVar7 = ajyjVarD.e;
                if (alayVar7 == null) {
                    alayVar7 = alay.a;
                }
                alayVar4 = alayVar7;
            } else {
                alayVar4 = null;
            }
            sre sreVar = new sre(1, aqmhVar2, spannedK, spannedK2, null, ajnfVar4, ajnfVar, ajnfVar7, apjiVar2, str2, alayVar3, alayVar4, null, ajyjVarD);
            if ((ajyjVarD.b & 8) != 0) {
                alayVar5 = ajyjVarD.d;
                if (alayVar5 == null) {
                    alayVar5 = alay.a;
                }
            } else {
                alayVar5 = null;
            }
            srdVar.j(sreVar, vxl.a(null, alayVar5, srdVar.c, false), null, false, z2);
        }
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }
}
