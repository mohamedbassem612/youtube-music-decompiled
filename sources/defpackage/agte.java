package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agte extends agth {
    private final Map a;
    private final Map b;
    private final agtg c;
    private final agtf d;

    public agte(agtd agtdVar) {
        HashMap map = new HashMap();
        this.a = map;
        HashMap map2 = new HashMap();
        this.b = map2;
        map.putAll(agtdVar.a);
        map2.putAll(agtdVar.b);
        this.c = agtdVar.c;
        this.d = agtdVar.d;
    }

    @Override // defpackage.agth
    protected final void a(agrx agrxVar, Object obj, Object obj2) {
        agtg agtgVar = (agtg) this.a.get(agrxVar);
        if (agtgVar != null) {
            agtgVar.a(agrxVar, obj, obj2);
        } else {
            this.c.a(agrxVar, obj, obj2);
        }
    }

    @Override // defpackage.agth
    protected final void b(agrx agrxVar, Iterator it, Object obj) {
        agtf agtfVar = (agtf) this.b.get(agrxVar);
        if (agtfVar != null) {
            agtfVar.a(agrxVar, it, obj);
            return;
        }
        agtf agtfVar2 = this.d;
        if (agtfVar2 != null && !this.a.containsKey(agrxVar)) {
            agtfVar2.a(agrxVar, it, obj);
        } else {
            while (it.hasNext()) {
                a(agrxVar, it.next(), obj);
            }
        }
    }
}
