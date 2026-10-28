package defpackage;

import android.content.Context;
import android.content.Intent;
import app.rive.semantics.SemanticState;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class svu extends stq {
    public final swh b;
    public final vxe c;
    private final stu d;

    public svu(stu stuVar, swh swhVar, vxe vxeVar) {
        super(stuVar);
        this.d = stuVar;
        this.b = swhVar;
        this.c = vxeVar;
    }

    @Override // defpackage.stq, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        this.d.a(new svt(this, ajwoVar));
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aqsx.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        aqsx aqsxVar = (aqsx) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        aigj aigjVar = (aqsxVar.c & SemanticState.Focused) != 0 ? aqsxVar.i : null;
        stu stuVar = this.a;
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aqsx.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        String str = ((aqsx) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2))).d;
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aqsx.b);
        ajwoVar.c(aihlVarCheckIsLite3);
        Object objK3 = ajwoVar.j.k(aihlVarCheckIsLite3.d);
        aqsx aqsxVar2 = (aqsx) (objK3 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK3));
        String str2 = aqsxVar2.h.isEmpty() ? null : aqsxVar2.h;
        stuVar.g = aigjVar;
        String str3 = ((rlt) stuVar.a.e()).b;
        Context context = stuVar.b;
        if (str2 == null) {
            str2 = "ytr";
        }
        Intent intentE = stu.e(context, str3, str2, 2);
        if (aigjVar != null) {
            aihf aihfVarJ = nsg.j(aigjVar);
            xeu xeuVar = stuVar.f;
            if (xeuVar.b) {
                xff xffVarA = xeuVar.a(aihfVarJ, alot.YPC_FAMILY_CREATE_FLOW_STARTED);
                ztf ztfVar = xffVarA.k.e;
                xffVarA.l = ztfVar.a();
                ztfVar.k(xffVarA);
            } else {
                alos alosVar = (alos) alou.a.createBuilder();
                alosVar.copyOnWrite();
                alou alouVar = (alou) alosVar.instance;
                aroe aroeVar = (aroe) aihfVarJ.build();
                aroeVar.getClass();
                alouVar.d = aroeVar;
                alouVar.c = 258;
                xeuVar.b((alou) alosVar.build());
            }
        }
        stuVar.j.b(intentE, 2000, stuVar);
    }
}
