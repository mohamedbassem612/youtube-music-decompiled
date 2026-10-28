package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fxx extends fys {
    private final fyl a;

    public fxx(fyl fylVar) {
        super("internal.eventLogger");
        this.a = fylVar;
    }

    @Override // defpackage.fys
    public final fyy a(kwq kwqVar, List list) {
        fxw.i(this.d, 3, list);
        String strI = kwqVar.v((fyy) list.get(0)).i();
        long jA = (long) fxw.a(kwqVar.v((fyy) list.get(1)).h().doubleValue());
        fyy fyyVarV = kwqVar.v((fyy) list.get(2));
        Map mapG = fyyVarV instanceof fyv ? fxw.g((fyv) fyyVarV) : new HashMap();
        fyl fylVar = this.a;
        HashMap map = new HashMap();
        for (String str : mapG.keySet()) {
            map.put(str, fyk.c(str, fylVar.a.b(str), mapG.get(str)));
        }
        fylVar.c.add(new fyk(strI, jA, map));
        return fyy.f;
    }
}
