package defpackage;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class svv implements vxc {
    private final Context a;
    private final swh b;
    private final vxe c;
    private final xgn d;
    private final abfv e;

    public svv(Context context, swh swhVar, vxe vxeVar, xgn xgnVar, abfv abfvVar) {
        this.a = context;
        this.b = swhVar;
        this.c = vxeVar;
        this.d = xgnVar;
        this.e = abfvVar;
    }

    @Override // defpackage.vxc
    public /* synthetic */ boolean b() {
        return true;
    }

    @Override // defpackage.vxc
    public void c(ajwo ajwoVar, Map map) {
        amfe amfeVar;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aqsy.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        aqsy aqsyVar = (aqsy) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        aqsz aqszVar = aqsyVar.c;
        if (aqszVar == null) {
            aqszVar = aqsz.a;
        }
        akdd akddVar = null;
        if (aqszVar.b == 86135402) {
            aqsz aqszVar2 = aqsyVar.c;
            if (aqszVar2 == null) {
                aqszVar2 = aqsz.a;
            }
            amfeVar = aqszVar2.b == 86135402 ? (amfe) aqszVar2.c : amfe.a;
        } else {
            amfeVar = null;
        }
        if (amfeVar != null) {
            this.b.d(amfeVar);
            return;
        }
        aqsz aqszVar3 = aqsyVar.c;
        if ((aqszVar3 == null ? aqsz.a : aqszVar3).b == 64099105) {
            if (aqszVar3 == null) {
                aqszVar3 = aqsz.a;
            }
            akddVar = aqszVar3.b == 64099105 ? (akdd) aqszVar3.c : akdd.a;
        }
        if (akddVar != null) {
            acwl.i(this.a, akddVar, this.c, this.d, null, true, true, (acwm) tym.U(map, "confirmDialogControllerListener", acwm.class), null, null, null, this.e, false);
        }
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }
}
