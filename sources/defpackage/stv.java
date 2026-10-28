package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class stv implements vxc, sts {
    private final stu a;

    public stv(stu stuVar) {
        this.a = stuVar;
        stuVar.b(this);
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aqtd.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        aqtd aqtdVar = (aqtd) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        aigj aigjVar = (aqtdVar.c & 4) != 0 ? aqtdVar.e : null;
        stu stuVar = this.a;
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aqtd.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        aqtd aqtdVar2 = (aqtd) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2));
        String str = !aqtdVar2.d.isEmpty() ? aqtdVar2.d : (String) tym.U(map, "accountName", String.class);
        stuVar.h = aigjVar;
        String str2 = ((rlt) stuVar.a.e()).b;
        Context context = stuVar.b;
        if (str == null) {
            str = "ytr";
        }
        Intent intentE = stu.e(context, str2, str, 9);
        if (aigjVar != null) {
            aihf aihfVarI = nsg.i(aigjVar);
            xeu xeuVar = stuVar.f;
            if (xeuVar.b) {
                xff xffVarA = xeuVar.a(aihfVarI, alot.YPC_FAMILY_MANAGE_FLOW_STARTED);
                ztf ztfVar = xffVarA.k.e;
                xffVarA.l = ztfVar.a();
                ztfVar.k(xffVarA);
            } else {
                alos alosVar = (alos) alou.a.createBuilder();
                alosVar.copyOnWrite();
                alou alouVar = (alou) alosVar.instance;
                arof arofVar = (arof) aihfVarI.build();
                arofVar.getClass();
                alouVar.d = arofVar;
                alouVar.c = 262;
                xeuVar.b((alou) alosVar.build());
            }
        }
        stuVar.j.b(intentE, 2001, stuVar);
    }

    @Override // defpackage.stt
    public final boolean f() {
        return true;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }

    @Override // defpackage.sts
    public final void d(boolean z) {
    }
}
