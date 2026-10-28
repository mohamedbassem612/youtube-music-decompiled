package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import internal.org.jni_zero.JniZero;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ape {
    public static final int a(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i >= 262143 ? 255 : 18;
    }

    public static final long b(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int iA = a(i5);
        int iA2 = a(i6);
        if (iA + iA2 > 31) {
            c(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = iA2 - 13;
        return ((long) ((i9 >> 1) + (i9 & 1))) | (((long) i) << 2) | (((long) (i7 & (~(i7 >> 31)))) << 33) | (((long) i3) << (iA2 + 2)) | (((long) (i8 & (~(i8 >> 31)))) << (iA2 + 33));
    }

    public static final void c(int i, int i2) {
        throw new IllegalArgumentException(a.cj(i2, i, "Can't represent a width of ", " and height of ", " in Constraints"));
    }

    public static final long d(int i, int i2) {
        if (((i ^ (-1)) & (i2 ^ (-1))) >= 0) {
            api.a(awrc.D(a.cj(i2, i, "\n        maxWidth(", ") must be >= than minWidth(0),\n        maxHeight(", ") must be >= than minHeight(0),\n        minWidth(0) and minHeight(0) must be >= 0\n        ")));
        }
        return b(0, i, 0, i2);
    }

    public static final long e(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + 0.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + 0.0f;
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static ListenableFuture f(aqk aqkVar) {
        aqi aqiVar = new aqi();
        aqm aqmVar = new aqm(aqiVar);
        aqiVar.b = aqmVar;
        aqiVar.a = aqkVar.getClass();
        try {
            Object objA = aqkVar.a(aqiVar);
            if (objA != null) {
                aqiVar.a = objA;
            }
        } catch (Exception e) {
            aqmVar.a(e);
        }
        return aqmVar;
    }

    public static final float g(float f) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f)) & 8589934591L) / 3)) + 709952852);
        float f2 = fIntBitsToFloat - ((fIntBitsToFloat - (f / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    public static final Map h(dpt dptVar, String str) throws Exception {
        Map mapE;
        dpb dpbVarA = dptVar.a(a.bT(str, "PRAGMA table_info(`", "`)"));
        try {
            if (dpbVarA.l()) {
                int iK = k(dpbVarA, "name");
                int iK2 = k(dpbVarA, "type");
                int iK3 = k(dpbVarA, "notnull");
                int iK4 = k(dpbVarA, "pk");
                int iK5 = k(dpbVarA, "dflt_value");
                awog awogVar = new awog(8);
                do {
                    String strD = dpbVarA.d(iK);
                    awogVar.put(strD, new dok(strD, dpbVarA.d(iK2), dpbVarA.b(iK3) != 0, (int) dpbVarA.b(iK4), dpbVarA.k(iK5) ? null : dpbVarA.d(iK5), 2));
                } while (dpbVarA.l());
                mapE = awogVar.e();
                dpbVarA.close();
            } else {
                mapE = awnp.a;
                dpbVarA.close();
            }
            return mapE;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    dpbVarA.close();
                    throw th2;
                } catch (Throwable th3) {
                    avkz.d(th, th3);
                    throw th2;
                }
            }
        }
    }

    public static final Set i(dpt dptVar, String str) throws Exception {
        dpb dpbVarA = dptVar.a(a.bT(str, "PRAGMA foreign_key_list(`", "`)"));
        try {
            int iK = k(dpbVarA, "id");
            int iK2 = k(dpbVarA, "seq");
            int iK3 = k(dpbVarA, "table");
            int iK4 = k(dpbVarA, "on_delete");
            int iK5 = k(dpbVarA, "on_update");
            int iK6 = k(dpbVarA, "id");
            int iK7 = k(dpbVarA, "seq");
            int iK8 = k(dpbVarA, "from");
            int iK9 = k(dpbVarA, "to");
            awoa awoaVar = new awoa(10);
            while (dpbVarA.l()) {
                awoaVar.add(new doj((int) dpbVarA.b(iK6), (int) dpbVarA.b(iK7), dpbVarA.d(iK8), dpbVarA.d(iK9)));
            }
            List listAl = atqq.al(awoaVar.f());
            dpbVarA.j();
            awol awolVar = new awol();
            while (dpbVarA.l()) {
                if (dpbVarA.b(iK2) == 0) {
                    int iB = (int) dpbVarA.b(iK);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<doj> arrayList3 = new ArrayList();
                    for (Object obj : listAl) {
                        if (((doj) obj).a == iB) {
                            arrayList3.add(obj);
                        }
                    }
                    for (doj dojVar : arrayList3) {
                        arrayList.add(dojVar.b);
                        arrayList2.add(dojVar.c);
                    }
                    awolVar.add(new dol(dpbVarA.d(iK3), dpbVarA.d(iK4), dpbVarA.d(iK5), arrayList, arrayList2));
                }
            }
            Set setB = awolVar.b();
            dpbVarA.close();
            return setB;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    dpbVarA.close();
                    throw th2;
                } catch (Throwable th3) {
                    avkz.d(th, th3);
                    throw th2;
                }
            }
        }
    }

    public static final Set j(dpt dptVar, String str) throws Exception {
        String str2;
        String str3;
        dom domVar;
        dptVar = dptVar;
        String str4 = "name";
        String str5 = "`)";
        dpb dpbVarA = dptVar.a(a.bT(str, "PRAGMA index_list(`", "`)"));
        try {
            int iK = k(dpbVarA, "name");
            int iK2 = k(dpbVarA, "origin");
            int iK3 = k(dpbVarA, "unique");
            int i = -1;
            if (iK != -1 && iK2 != -1 && iK3 != -1) {
                awol awolVar = new awol();
                while (dpbVarA.l()) {
                    if (awrc.c("c", dpbVarA.d(iK2))) {
                        String strD = dpbVarA.d(iK);
                        boolean z = dpbVarA.b(iK3) == 1;
                        dpb dpbVarA2 = dptVar.a(a.bT(strD, "PRAGMA index_xinfo(`", str5));
                        try {
                            int iK4 = k(dpbVarA2, "seqno");
                            int iK5 = k(dpbVarA2, "cid");
                            int iK6 = k(dpbVarA2, str4);
                            int iK7 = k(dpbVarA2, "desc");
                            if (iK4 == i || iK5 == i || iK6 == i || iK7 == i) {
                                str2 = str4;
                                dpbVarA = dpbVarA;
                                str3 = str5;
                                dpbVarA2.close();
                                domVar = null;
                            } else {
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                while (dpbVarA2.l()) {
                                    str4 = str4;
                                    dpbVarA = dpbVarA;
                                    try {
                                        if (((int) dpbVarA2.b(iK5)) >= 0) {
                                            int iB = (int) dpbVarA2.b(iK4);
                                            String strD2 = dpbVarA2.d(iK6);
                                            String str6 = dpbVarA2.b(iK7) > 0 ? "DESC" : "ASC";
                                            String str7 = str5;
                                            Integer numValueOf = Integer.valueOf(iB);
                                            linkedHashMap.put(numValueOf, strD2);
                                            linkedHashMap2.put(numValueOf, str6);
                                            str5 = str7;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        Throwable th2 = th;
                                        try {
                                            throw th2;
                                        } catch (Throwable th3) {
                                            try {
                                                dpbVarA2.close();
                                                throw th3;
                                            } catch (Throwable th4) {
                                                avkz.d(th2, th4);
                                                throw th3;
                                            }
                                        }
                                    }
                                }
                                str2 = str4;
                                dpbVarA = dpbVarA;
                                str3 = str5;
                                List listAm = atqq.am(linkedHashMap.entrySet(), new cru(2));
                                ArrayList arrayList = new ArrayList(atqq.N(listAm, 10));
                                Iterator it = listAm.iterator();
                                while (it.hasNext()) {
                                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                                }
                                List listAp = atqq.ap(arrayList);
                                List listAm2 = atqq.am(linkedHashMap2.entrySet(), new cru(3));
                                ArrayList arrayList2 = new ArrayList(atqq.N(listAm2, 10));
                                Iterator it2 = listAm2.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                                }
                                domVar = new dom(strD, z, listAp, atqq.ap(arrayList2));
                                try {
                                    dpbVarA2.close();
                                } catch (Throwable th5) {
                                    th = th5;
                                    Throwable th6 = th;
                                    try {
                                        throw th6;
                                    } catch (Throwable th7) {
                                        try {
                                            dpbVarA.close();
                                            throw th7;
                                        } catch (Throwable th8) {
                                            avkz.d(th6, th8);
                                            throw th7;
                                        }
                                    }
                                }
                            }
                            if (domVar == null) {
                                dpbVarA.close();
                            } else {
                                awolVar.add(domVar);
                                str4 = str2;
                                dpbVarA = dpbVarA;
                                str5 = str3;
                                i = -1;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            dpbVarA = dpbVarA;
                        }
                    }
                }
                dpb dpbVar = dpbVarA;
                Set setB = awolVar.b();
                dpbVar.close();
                return setB;
            }
            dpbVarA.close();
            return null;
        } catch (Throwable th10) {
            th = th10;
            dpbVarA = dpbVarA;
        }
    }

    public static final int k(dpb dpbVar, String str) {
        int iL = l(dpbVar, str);
        if (iL >= 0) {
            return iL;
        }
        int iL2 = l(dpbVar, "`" + str + '`');
        if (iL2 < 0) {
            return -1;
        }
        return iL2;
    }

    public static final int l(dpb dpbVar, String str) {
        int iA = dpbVar.a();
        for (int i = 0; i < iA; i++) {
            if (awrc.c(str, dpbVar.c(i))) {
                return i;
            }
        }
        return -1;
    }

    public static final int m(dpb dpbVar, String str) {
        int iK = k(dpbVar, str);
        if (iK >= 0) {
            return iK;
        }
        int iA = dpbVar.a();
        ArrayList arrayList = new ArrayList(iA);
        for (int i = 0; i < iA; i++) {
            arrayList.add(dpbVar.c(i));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + atqq.aD(arrayList, null, null, null, null, 63) + ']');
    }

    public static final int n(dpt dptVar) throws Exception {
        dpb dpbVarA = dptVar.a("SELECT changes()");
        try {
            dpbVarA.l();
            int iB = (int) dpbVarA.b(0);
            dpbVarA.close();
            return iB;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    dpbVarA.close();
                } catch (Throwable th3) {
                    avkz.d(th, th3);
                }
                throw th2;
            }
        }
    }

    public static final long o(dpt dptVar) throws Exception {
        if (n(dptVar) == 0) {
            return -1L;
        }
        dpb dpbVarA = dptVar.a("SELECT last_insert_rowid()");
        try {
            dpbVarA.l();
            long jB = dpbVarA.b(0);
            JniZero.j(dpbVarA, null);
            return jB;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                JniZero.j(dpbVarA, th);
                throw th2;
            }
        }
    }
}
