package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aawy {
    public final ywx a;
    final /* synthetic */ aawz b;
    private abnx[] c;
    private long d;

    public aawy(aawz aawzVar, ywx ywxVar) {
        this.b = aawzVar;
        this.a = ywxVar;
    }

    private final abnx[] d(ywx ywxVar, long j) {
        long j2;
        List listA = aawz.a(ywxVar, "Stitched-Video-Id");
        List listA2 = aawz.a(ywxVar, "Stitched-Video-Duration-Us");
        List listA3 = aawz.a(ywxVar, "Stitched-Video-Cpn");
        List listA4 = aawz.a(ywxVar, "Stitched-Video-Start-Time-Within-Ad-Us");
        List listA5 = aawz.a(ywxVar, "Stitched-Video-Absolute-Loudness-Lkfs");
        int size = listA.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap map = new HashMap();
        int i = 0;
        long j3 = 0;
        long j4 = j;
        for (int i2 = 0; i2 < size; i2++) {
            try {
                TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                long j5 = Long.parseLong((String) listA2.get(i2)) / 1000;
                TimeUnit timeUnit2 = TimeUnit.MICROSECONDS;
                long j6 = Long.parseLong((String) listA4.get(i2)) / 1000;
                Object objValueOf = null;
                if (i2 < listA5.size() && listA5.get(i2) != null) {
                    objValueOf = Float.valueOf(Float.parseFloat((String) listA5.get(i2)));
                }
                j3 += j5;
                long j7 = j4 + j5;
                String str = (String) listA3.get(i2);
                aawx aawxVar = (aawx) linkedHashMap.remove(str);
                if (aawxVar != null) {
                    objValueOf = aawxVar.c;
                    j2 = aawxVar.a;
                } else {
                    j2 = j4;
                }
                linkedHashMap.put(str, new aawx(j2, j7, (Float) objValueOf));
                if (!map.containsKey(str)) {
                    map.put(str, Long.valueOf(j2 - j6));
                }
                j4 = j7;
            } catch (NumberFormatException unused) {
            }
        }
        abnx[] abnxVarArr = new abnx[linkedHashMap.size()];
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            long jLongValue = ((Long) j$.util.Map.EL.getOrDefault(map, entry.getKey(), Long.valueOf(((aawx) entry.getValue()).a))).longValue();
            String str2 = (String) entry.getKey();
            long j8 = ((aawx) entry.getValue()).a;
            long j9 = ((aawx) entry.getValue()).b;
            Object obj = ((aawx) entry.getValue()).c;
            abnxVarArr[i] = new abnx(str2, j8, j9, jLongValue);
            i++;
        }
        this.d = j3;
        return abnxVarArr;
    }

    public final long a() {
        if (this.c == null) {
            this.c = d(this.a, this.b.b);
        }
        aawz aawzVar = this.b;
        return aawzVar.b + this.d;
    }

    public final boolean b() {
        return "true".equals(this.a.b.get("Is-Ad-Break-Finished"));
    }

    public final abnx[] c() {
        abnx[] abnxVarArrD = this.c;
        if (abnxVarArrD == null) {
            abnxVarArrD = d(this.a, this.b.b);
        }
        this.c = abnxVarArrD;
        return abnxVarArrD;
    }
}
