package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rjz {
    public rjx a;
    public final Map b;
    public final Map c = new LinkedHashMap();
    private final wnw d;
    private final zwb e;
    private final Executor f;

    public rjz(wnw wnwVar, zwb zwbVar, Executor executor, rjx rjxVar, Map map) {
        this.d = wnwVar;
        this.e = zwbVar;
        this.f = executor;
        this.a = rjxVar;
        this.b = new HashMap(map);
        for (Map.Entry entry : map.entrySet()) {
            ((Queue) j$.util.Map.EL.computeIfAbsent(this.c, ((rlt) entry.getValue()).b, new ris(7))).add((String) entry.getKey());
        }
    }

    public final void a() {
        this.a = null;
    }

    public final void b() {
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            String str = (String) ((Queue) it.next()).poll();
            if (str != null) {
                rlt rltVar = (rlt) this.b.get(str);
                rjx rjxVar = this.a;
                if (rjxVar == null || rltVar == null) {
                    return;
                }
                String str2 = rltVar.b;
                rjxVar.a(str2, 4);
                zwa zwaVarE = this.e.e();
                if (zwaVarE == null) {
                    zwaVarE = zvz.a;
                }
                wnw wnwVar = this.d;
                taf.i(wnwVar.c.f(wnwVar.b(zwaVarE, rltVar, str2, 5, str), wnwVar.d), this.f, new gou(this, str2, 15), new rjy(this, str2, rltVar, 0), null);
                return;
            }
            it.remove();
        }
    }
}
