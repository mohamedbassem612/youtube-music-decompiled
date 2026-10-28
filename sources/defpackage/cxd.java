package defpackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cxd extends cxf {
    public long a;
    public long[] b;
    public long[] c;

    public cxd() {
        super(new cvf());
        this.a = -9223372036854775807L;
        this.b = new long[0];
        this.c = new long[0];
    }

    private static Double d(bwb bwbVar) {
        return Double.valueOf(Double.longBitsToDouble(bwbVar.v()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.Date] */
    private static Object e(bwb bwbVar, int i) {
        ?? map;
        if (i == 0) {
            return d(bwbVar);
        }
        if (i == 1) {
            return Boolean.valueOf(bwbVar.n() == 1);
        }
        if (i == 2) {
            return f(bwbVar);
        }
        if (i == 3) {
            map = new HashMap();
            while (true) {
                String strF = f(bwbVar);
                int iN = bwbVar.n();
                if (iN == 9) {
                    break;
                }
                Object objE = e(bwbVar, iN);
                if (objE != null) {
                    map.put(strF, objE);
                }
            }
        } else {
            if (i == 8) {
                return g(bwbVar);
            }
            if (i == 10) {
                int iQ = bwbVar.q();
                ArrayList arrayList = new ArrayList(iQ);
                for (int i2 = 0; i2 < iQ; i2++) {
                    Object objE2 = e(bwbVar, bwbVar.n());
                    if (objE2 != null) {
                        arrayList.add(objE2);
                    }
                }
                return arrayList;
            }
            if (i != 11) {
                return null;
            }
            map = new Date((long) d(bwbVar).doubleValue());
            bwbVar.Q(2);
        }
        return map;
    }

    private static String f(bwb bwbVar) {
        int iS = bwbVar.s();
        int i = bwbVar.c;
        bwbVar.Q(iS);
        return new String(bwbVar.b, i, iS);
    }

    private static HashMap g(bwb bwbVar) {
        int iQ = bwbVar.q();
        HashMap map = new HashMap(iQ);
        for (int i = 0; i < iQ; i++) {
            String strF = f(bwbVar);
            Object objE = e(bwbVar, bwbVar.n());
            if (objE != null) {
                map.put(strF, objE);
            }
        }
        return map;
    }

    @Override // defpackage.cxf
    protected final boolean a(bwb bwbVar) {
        return true;
    }

    @Override // defpackage.cxf
    protected final boolean b(bwb bwbVar, long j) {
        if (bwbVar.n() == 2 && "onMetaData".equals(f(bwbVar)) && bwbVar.d() != 0 && bwbVar.n() == 8) {
            HashMap mapG = g(bwbVar);
            Object obj = mapG.get("duration");
            if (obj instanceof Double) {
                double dDoubleValue = ((Double) obj).doubleValue();
                if (dDoubleValue > 0.0d) {
                    this.a = (long) (dDoubleValue * 1000000.0d);
                }
            }
            Object obj2 = mapG.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.b = new long[size];
                    this.c = new long[size];
                    for (int i = 0; i < size; i++) {
                        Object obj5 = list.get(i);
                        Object obj6 = list2.get(i);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.b = new long[0];
                            this.c = new long[0];
                            break;
                        }
                        this.b[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.c[i] = ((Double) obj5).longValue();
                    }
                }
            }
        }
        return false;
    }
}
