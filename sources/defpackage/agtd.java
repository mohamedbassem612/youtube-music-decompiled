package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agtd {
    private static final agtg e = new agtb();
    private static final agtf f = new agtc();
    public final agtg c;
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public agtf d = null;

    public agtd(agtg agtgVar) {
        this.c = agtgVar;
    }

    public final void a(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            agrx agrxVar = (agrx) it.next();
            agrxVar.getClass();
            if (agrxVar.b) {
                Map map = this.a;
                agtf agtfVar = f;
                map.remove(agrxVar);
                this.b.put(agrxVar, agtfVar);
            } else {
                Map map2 = this.b;
                agtg agtgVar = e;
                map2.remove(agrxVar);
                this.a.put(agrxVar, agtgVar);
            }
        }
    }
}
