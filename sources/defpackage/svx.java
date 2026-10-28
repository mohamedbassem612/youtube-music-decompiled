package defpackage;

import android.content.ComponentName;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class svx extends stw {
    public final vxe b;
    private final stu c;

    public svx(stu stuVar, vxe vxeVar) {
        super(stuVar);
        this.c = stuVar;
        this.b = vxeVar;
    }

    @Override // defpackage.stw, defpackage.vxc
    public final void a(ajwo ajwoVar) {
        this.c.e.add(new svw(this, ajwoVar));
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aqta.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        aqta aqtaVar = (aqta) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        aigj aigjVar = (aqtaVar.c & 16) != 0 ? aqtaVar.g : null;
        stu stuVar = this.a;
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aqta.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        int i = ((aqta) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2))).d;
        stuVar.i = aigjVar;
        Intent intentPutExtra = new Intent().setComponent(new ComponentName(stuVar.b, "com.google.android.libraries.families.FamilyActivity")).putExtra("appId", i).putExtra("flowType", 4).putExtra("extra.accountName", ((rlt) stuVar.a.e()).b);
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
        stuVar.j.b(intentPutExtra, 2002, stuVar);
    }
}
