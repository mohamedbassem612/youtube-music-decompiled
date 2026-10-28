package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class guy extends gut {
    private final vxe a;

    public guy(vxe vxeVar) {
        this.a = vxeVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(anqc.a);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        apqf apqfVar = ((anqb) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).b;
        if (apqfVar == null) {
            apqfVar = apqf.a;
        }
        aihf builder = apqfVar.toBuilder();
        if (map != null && map.containsKey("selection_values")) {
            Object obj = map.get("selection_values");
            if (obj instanceof List) {
                List list = (List) obj;
                apqf apqfVar2 = (apqf) builder.instance;
                String str = apqfVar2.d == 2 ? (String) apqfVar2.e : "";
                ArrayList arrayList = str == null ? new ArrayList() : aguu.s(str.split(","));
                arrayList.addAll(list);
                ArrayList arrayListR = aguu.r(aguu.I(arrayList, new bym(9)));
                ager agerVar = new ager(",");
                String strB = new agep(agerVar, agerVar).b(arrayListR);
                builder.copyOnWrite();
                apqf apqfVar3 = (apqf) builder.instance;
                apqfVar3.d = 2;
                apqfVar3.e = strB;
            }
        }
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihhVar.e(apqf.b, (apqf) builder.build());
        aigj aigjVar = ajwoVar.c;
        aihhVar.copyOnWrite();
        ajwo ajwoVar2 = (ajwo) aihhVar.instance;
        aigjVar.getClass();
        ajwoVar2.b |= 1;
        ajwoVar2.c = aigjVar;
        this.a.c((ajwo) aihhVar.build(), map);
    }
}
