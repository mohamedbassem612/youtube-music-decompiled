package defpackage;

import android.text.Spanned;
import app.rive.semantics.SemanticState;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ssf implements vxc {
    private final srd a;
    private final xgm b;

    public ssf(srd srdVar, xgm xgmVar) {
        this.a = srdVar;
        this.b = xgmVar;
    }

    private final xgn d() {
        return this.b.hB();
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        arrh arrhVar;
        alay alayVar;
        alay alayVar2;
        alay alayVar3;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(akgf.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        akgf akgfVar = (akgf) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        if (akgfVar.e && d() != null) {
            d().p(new xgj(xhb.b(103918)), null);
            d().o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(104381)), null);
        }
        srd srdVar = this.a;
        akge akgeVar = akgfVar.c;
        if (akgeVar == null) {
            akgeVar = akge.a;
        }
        if (akgeVar.b != 122274699) {
            ((agrc) ((agrc) srd.a.b()).k("com/google/android/libraries/youtube/comment/controller/CommentDialogController", "newComment", 249, "CommentDialogController.java")).t("No comment dialog renderer specified for CreateCommentDialogEndpoint.");
            return;
        }
        akge akgeVar2 = akgfVar.c;
        if (akgeVar2 == null) {
            akgeVar2 = akge.a;
        }
        ajxx ajxxVar = akgeVar2.b == 122274699 ? (ajxx) akgeVar2.c : ajxx.a;
        ajng ajngVar = ajxxVar.f;
        if (ajngVar == null) {
            ajngVar = ajng.a;
        }
        if ((ajngVar.b & 1) == 0) {
            ((agrc) ((agrc) srd.a.b()).k("com/google/android/libraries/youtube/comment/controller/CommentDialogController", "newComment", 258, "CommentDialogController.java")).t("No submit button renderer specified for CreateCommentDialogEndpoint.");
            return;
        }
        ajng ajngVar2 = ajxxVar.f;
        if (ajngVar2 == null) {
            ajngVar2 = ajng.a;
        }
        ajnf ajnfVar = ajngVar2.c;
        if (ajnfVar == null) {
            ajnfVar = ajnf.a;
        }
        if ((ajnfVar.b & SemanticState.Modal) == 0) {
            ((agrc) ((agrc) srd.a.b()).k("com/google/android/libraries/youtube/comment/controller/CommentDialogController", "newComment", 262, "CommentDialogController.java")).t("No service endpoint on submit button specified for CreateCommentDialogEndpoint.");
            return;
        }
        Long lS = srdVar.k.S();
        if (srdVar.b() != null) {
            ajng ajngVar3 = ajxxVar.f;
            if (ajngVar3 == null) {
                ajngVar3 = ajng.a;
            }
            aihf builder = ajngVar3.toBuilder();
            ajng ajngVar4 = ajxxVar.f;
            if (ajngVar4 == null) {
                ajngVar4 = ajng.a;
            }
            ajnf ajnfVarC = ajngVar4.c;
            if (ajnfVarC == null) {
                ajnfVarC = ajnf.a;
            }
            xgn xgnVarB = srdVar.b();
            if (xgnVarB != null) {
                ajnfVarC = srdVar.c(ajnfVarC, xgnVarB.i());
            }
            builder.copyOnWrite();
            ajng ajngVar5 = (ajng) builder.instance;
            ajnfVarC.getClass();
            ajngVar5.c = ajnfVarC;
            ajngVar5.b |= 1;
            ajng ajngVar6 = (ajng) builder.build();
            aihf builder2 = ajxxVar.toBuilder();
            builder2.copyOnWrite();
            ajxx ajxxVar2 = (ajxx) builder2.instance;
            ajngVar6.getClass();
            ajxxVar2.f = ajngVar6;
            ajxxVar2.b |= 8;
            ajxxVar = (ajxx) builder2.build();
        }
        arri arriVar = akgfVar.d;
        if (arriVar == null) {
            arriVar = arri.a;
        }
        if ((arriVar.b & 1) != 0) {
            arri arriVar2 = akgfVar.d;
            if (arriVar2 == null) {
                arriVar2 = arri.a;
            }
            arrh arrhVar2 = arriVar2.c;
            if (arrhVar2 == null) {
                arrhVar2 = arrh.a;
            }
            arrhVar = arrhVar2;
        } else {
            arrhVar = null;
        }
        boolean z = akgfVar.e;
        aqmh aqmhVar = ajxxVar.e;
        if (aqmhVar == null) {
            aqmhVar = aqmh.a;
        }
        aqmh aqmhVar2 = aqmhVar;
        if ((ajxxVar.b & 2) != 0) {
            alayVar = ajxxVar.d;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        Spanned spannedK = ackj.k(null, alayVar, null, false);
        ajng ajngVar7 = ajxxVar.f;
        if (ajngVar7 == null) {
            ajngVar7 = ajng.a;
        }
        ajnf ajnfVar2 = ajngVar7.c;
        if (ajnfVar2 == null) {
            ajnfVar2 = ajnf.a;
        }
        ajnf ajnfVar3 = ajnfVar2;
        ajng ajngVar8 = ajxxVar.g;
        if (ajngVar8 == null) {
            ajngVar8 = ajng.a;
        }
        ajnf ajnfVar4 = ajngVar8.c;
        if (ajnfVar4 == null) {
            ajnfVar4 = ajnf.a;
        }
        ajnf ajnfVar5 = ajnfVar4;
        apji apjiVar = ajxxVar.h;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        apji apjiVar2 = apjiVar;
        String str = ajxxVar.i;
        if ((ajxxVar.b & 2) != 0) {
            alay alayVar4 = ajxxVar.d;
            if (alayVar4 == null) {
                alayVar4 = alay.a;
            }
            alayVar2 = alayVar4;
        } else {
            alayVar2 = null;
        }
        ajxx ajxxVar3 = ajxxVar;
        sre sreVar = new sre(1, aqmhVar2, null, spannedK, arrhVar, ajnfVar3, null, ajnfVar5, apjiVar2, str, null, alayVar2, ajxxVar3, null);
        if ((ajxxVar3.b & 1) != 0) {
            alayVar3 = ajxxVar3.c;
            if (alayVar3 == null) {
                alayVar3 = alay.a;
            }
        } else {
            alayVar3 = null;
        }
        srdVar.j(sreVar, vxl.a(null, alayVar3, srdVar.c, false), lS, false, z);
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }
}
