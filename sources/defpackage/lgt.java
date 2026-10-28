package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lgt implements lgv {
    private final ler b;
    private final Map c = new HashMap();
    private final Map d = new HashMap();
    private int e = 0;
    private lbw f;

    public lgt(ler lerVar) {
        this.b = lerVar;
    }

    private final lbw g() {
        if (this.f == null) {
            this.f = new lgs(this, this.b);
        }
        return this.f;
    }

    public final void a() {
        this.b.o();
        synchronized (this) {
            lbw lbwVar = this.f;
            if (lbwVar != null) {
                lbwVar.a();
            }
            Map map = this.c;
            if (map.isEmpty()) {
                this.d.clear();
                return;
            }
            ler lerVar = this.b;
            boolean zF = lerVar.G().F(null, lcl.bl);
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Map map2 = zF ? (Map) this.d.get(str) : null;
                for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                    String str2 = (String) entry2.getKey();
                    int iIntValue = ((Integer) entry2.getValue()).intValue();
                    if (zF) {
                        long jLongValue = 0;
                        if (map2 != null && map2.containsKey(str2)) {
                            jLongValue = ((Long) map2.get(str2)).longValue();
                        }
                        arrayList.add(new lbx(str, str2, iIntValue, jLongValue));
                    } else {
                        arrayList.add(new lbx(str, str2, iIntValue, 0L));
                    }
                }
            }
            map.clear();
            this.d.clear();
            this.e = 0;
            lerVar.j().y(arrayList);
        }
    }

    public final synchronized void b(String str, String str2, int i) {
        f(str, str2, i, 0L);
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x000f: MONITOR_EXIT (r1 I:??[OBJECT, ARRAY]) A[Catch: all -> 0x0011, TRY_ENTER, TRY_LEAVE] (LINE:16), block:B:11:0x000f */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final synchronized void c(String str, long j) {
        Object obj;
        try {
            f("execution_time_millis", str, 1, j);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0010: MONITOR_EXIT (r1 I:??[OBJECT, ARRAY]) A[Catch: all -> 0x0012, TRY_ENTER, TRY_LEAVE] (LINE:17), block:B:11:0x0010 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final synchronized void d(String str) {
        Object obj;
        try {
            f("event_dropped_count", str, 1, 0L);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0010: MONITOR_EXIT (r1 I:??[OBJECT, ARRAY]) A[Catch: all -> 0x0012, TRY_ENTER, TRY_LEAVE] (LINE:17), block:B:11:0x0010 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // defpackage.lgv
    public final synchronized void e(String str, String str2) {
        Object obj;
        try {
            f("param_dropped_count", str2, 1, 0L);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void f(String str, String str2, int i, long j) {
        Map map = this.c;
        Map map2 = (Map) map.get(str);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(str, map2);
        }
        if (str2 == null) {
            str2 = "";
        }
        Integer num = (Integer) map2.get(str2);
        map2.put(str2, Integer.valueOf(num == null ? i : num.intValue() + i));
        ler lerVar = this.b;
        if (lerVar.G().F(null, lcl.bl) && j != 0) {
            Map map3 = this.d;
            Map map4 = (Map) map3.get(str);
            if (map4 == null) {
                map4 = new HashMap();
                map3.put(str, map4);
            }
            Long l = (Long) map4.get(str2);
            if (l != null) {
                j += l.longValue();
            }
            map4.put(str2, Long.valueOf(j));
        }
        int i2 = this.e + i;
        this.e = i2;
        if (i2 < 50) {
            if (!g().d()) {
                g().c(5000L);
            }
        } else {
            lbw lbwVar = this.f;
            if (lbwVar != null) {
                lbwVar.a();
            }
            lerVar.aU().j(new lei(this, 10));
        }
    }
}
