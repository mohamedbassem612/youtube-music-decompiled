package defpackage;

import android.text.Spanned;
import app.rive.semantics.SemanticState;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ssl implements vxc {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/comment/endpoint/UpdateCommentReplyDialogCommand");
    private final srd b;
    private final xgm c;

    public ssl(srd srdVar, xgm xgmVar) {
        srdVar.getClass();
        this.b = srdVar;
        this.c = xgmVar;
    }

    private final xgn d() {
        return this.c.hB();
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        alay alayVar;
        alay alayVar2;
        ajnf ajnfVar;
        alay alayVar3;
        alay alayVar4;
        alay alayVar5;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aqzg.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        aqzg aqzgVar = (aqzg) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        if (aqzgVar.d && d() != null) {
            d().o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(104381)), null);
        }
        aqzh aqzhVar = aqzgVar.c;
        if (aqzhVar == null) {
            aqzhVar = aqzh.a;
        }
        if (aqzhVar.b != 97806346) {
            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/comment/endpoint/UpdateCommentReplyDialogCommand", "resolve", 60, "UpdateCommentReplyDialogCommand.java")).t("Executed UpdateCommentReplyDialogEndpoint with no CommentReplyDialogRenderer.");
            return;
        }
        boolean z = aqzgVar.d;
        Object objS = tym.S(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        boolean z2 = objS instanceof sri;
        if (z2 && z2) {
            aqzh aqzhVar2 = aqzgVar.c;
            if (aqzhVar2 == null) {
                aqzhVar2 = aqzh.a;
            }
            if (aqzhVar2.b == 97806346) {
            } else {
                ajyj ajyjVar = ajyj.a;
            }
            throw null;
        }
        srd srdVar = this.b;
        aqzh aqzhVar3 = aqzgVar.c;
        if (aqzhVar3 == null) {
            aqzhVar3 = aqzh.a;
        }
        ajyj ajyjVar2 = aqzhVar3.b == 97806346 ? (ajyj) aqzhVar3.c : ajyj.a;
        if ((ajyjVar2.b & 32) == 0) {
            ((agrc) ((agrc) srd.a.b()).k("com/google/android/libraries/youtube/comment/controller/CommentDialogController", "updateReply", 890, "CommentDialogController.java")).t("No reply button specified for comment dialog.");
            return;
        }
        ajng ajngVar = ajyjVar2.f;
        if (ajngVar == null) {
            ajngVar = ajng.a;
        }
        if ((ajngVar.b & 1) == 0) {
            ((agrc) ((agrc) srd.a.b()).k("com/google/android/libraries/youtube/comment/controller/CommentDialogController", "updateReply", 893, "CommentDialogController.java")).t("No button renderer specified for comment dialog.");
            return;
        }
        ajng ajngVar2 = ajyjVar2.f;
        if (ajngVar2 == null) {
            ajngVar2 = ajng.a;
        }
        ajnf ajnfVar2 = ajngVar2.c;
        if (ajnfVar2 == null) {
            ajnfVar2 = ajnf.a;
        }
        if ((ajnfVar2.b & SemanticState.Modal) == 0) {
            ((agrc) ((agrc) srd.a.b()).k("com/google/android/libraries/youtube/comment/controller/CommentDialogController", "updateReply", 899, "CommentDialogController.java")).t("No service endpoint specified for comment dialog.");
            return;
        }
        ajyj ajyjVarD = srdVar.d(ajyjVar2);
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
        String str = ajyjVarD.k;
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
        sre sreVar = new sre(2, aqmhVar2, spannedK, spannedK2, null, ajnfVar4, ajnfVar, ajnfVar7, apjiVar2, str, alayVar3, alayVar4, null, ajyjVarD);
        if ((ajyjVarD.b & 8) != 0) {
            alayVar5 = ajyjVarD.d;
            if (alayVar5 == null) {
                alayVar5 = alay.a;
            }
        } else {
            alayVar5 = null;
        }
        srdVar.j(sreVar, vxl.a(null, alayVar5, srdVar.c, false), null, false, z);
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }
}
