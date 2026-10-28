package defpackage;

import android.view.View;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jmc extends aevq {
    final /* synthetic */ jmg a;

    public jmc(jmg jmgVar) {
        this.a = jmgVar;
    }

    @Override // defpackage.aevq
    public final void b(View view, int i) {
        ajwo ajwoVar;
        if (i == 1) {
            jmg jmgVar = this.a;
            jmgVar.u();
            if (jmgVar.P()) {
                jmgVar.E.a().H(false);
                return;
            } else {
                if (jmgVar.ac != null) {
                    jmgVar.D();
                    jmgVar.J(false);
                    return;
                }
                return;
            }
        }
        if (i == 4) {
            jmg jmgVar2 = this.a;
            if (jmgVar2.aA.m(210, 45741213L) && jmgVar2.E != null && jmgVar2.P()) {
                jmgVar2.E.a().I(3);
                if (!jmgVar2.ay.a().isEmpty() || jmgVar2.ah) {
                    return;
                }
                jmgVar2.q();
                return;
            }
            return;
        }
        if (i == 5) {
            jmg jmgVar3 = this.a;
            if (!jmgVar3.aA.m(210, 45741213L) || (ajwoVar = jmgVar3.aa) == null) {
                return;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apym.b);
            ajwoVar.c(aihlVarCheckIsLite);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
            apym apymVar = (apym) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
            if ((apymVar.c & SemanticState.Focused) != 0) {
                vxe vxeVar = jmgVar3.k;
                ajwo ajwoVar2 = apymVar.k;
                if (ajwoVar2 == null) {
                    ajwoVar2 = ajwo.a;
                }
                vxeVar.a(ajwoVar2);
            }
        }
    }

    @Override // defpackage.aevq
    public final void a(View view, float f) {
    }
}
