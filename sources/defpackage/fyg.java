package defpackage;

import java.util.List;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fyg extends fys {
    private final kyr a;

    public fyg(kyr kyrVar) {
        super("internal.registerCallback");
        this.a = kyrVar;
    }

    @Override // defpackage.fys
    public final fyy a(kwq kwqVar, List list) {
        Object obj;
        fxw.i(this.d, 3, list);
        kwqVar.v((fyy) list.get(0)).i();
        fyy fyyVarV = kwqVar.v((fyy) list.get(1));
        if (!(fyyVarV instanceof fyx)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        fyy fyyVarV2 = kwqVar.v((fyy) list.get(2));
        if (!(fyyVarV2 instanceof fyv)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        fyv fyvVar = (fyv) fyyVarV2;
        if (!fyvVar.t("type")) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        String strI = fyvVar.f("type").i();
        int iB = fyvVar.t("priority") ? fxw.b(fyvVar.f("priority").h().doubleValue()) : 1000;
        kyr kyrVar = this.a;
        fyx fyxVar = (fyx) fyyVarV;
        if ("create".equals(strI)) {
            obj = kyrVar.a;
        } else {
            if (!"edit".equals(strI)) {
                throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(strI)));
            }
            obj = kyrVar.b;
        }
        TreeMap treeMap = (TreeMap) obj;
        if (treeMap.containsKey(Integer.valueOf(iB))) {
            iB = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(iB), fyxVar);
        return fyy.f;
    }
}
