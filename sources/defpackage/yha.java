package defpackage;

import android.text.TextUtils;
import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yha {
    public final agfr a;
    public final awmd b;
    public agfr c;
    public final xeu d;
    public final zjr e;
    public final ahey f;
    public final abxv g;
    private final Map h;

    public yha(agfr agfrVar, awmd awmdVar, abxv abxvVar, yfb yfbVar, ygy ygyVar, xeu xeuVar, ahey aheyVar, zjr zjrVar) {
        xjr xjrVar = new xjr(5);
        this.a = agfrVar;
        this.b = awmdVar;
        this.c = xjrVar;
        this.d = xeuVar;
        this.f = aheyVar;
        this.e = zjrVar;
        this.g = abxvVar;
        this.h = agkj.k(0, yfbVar, 3, ygyVar);
    }

    public static final boolean g(Set set, String str, long j, long j2) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str2 = str;
            long j3 = j;
            long j4 = j2;
            if (((jsk) it.next()).o(str2, j3, j4)) {
                return true;
            }
            str = str2;
            j = j3;
            j2 = j4;
        }
        return false;
    }

    static final long i(elr elrVar, long j) {
        int iD = elrVar.D(j);
        return elrVar.H()[iD] + ((((long) elrVar.F()[iD]) * (j - elrVar.I()[iD])) / elrVar.G()[iD]);
    }

    public final yfq a(wgs wgsVar, long j) {
        agkz agkzVarN;
        String strB;
        String str = wgsVar.c;
        if (!TextUtils.isEmpty(str)) {
            String str2 = wgsVar.f;
            typ.f(str2);
            if (this.b.io() != null && (strB = b((agkzVarN = agkz.n((Collection) this.c.io())), str, str2)) != null) {
                elr elrVarA = this.g.A(agkzVarN, strB, false);
                return elrVarA == null ? new yfq(j, -1L, -1L, -1L) : h(agkzVarN, strB, elrVarA, j);
            }
        }
        return new yfq(j, -1L, -1L, -1L);
    }

    public final String b(Set set, String str, String str2) {
        String str3 = null;
        if (str != null) {
            Iterator it = set.iterator();
            long j = Long.MIN_VALUE;
            while (it.hasNext()) {
                jsk jskVar = (jsk) it.next();
                if ((jskVar instanceof ygu) && this.e.aT()) {
                    ygt ygtVarT = ((ygu) jskVar).t(str, str2);
                    if (ygtVarT != null) {
                        String strB = ygtVarT.b();
                        long jBq = zik.bq(strB);
                        if (str3 == null || jBq > j) {
                            str3 = strB;
                            j = jBq;
                        }
                    }
                } else {
                    for (String str4 : jskVar.h()) {
                        if (str4 != null && Objects.equals(str, zik.bx(str4)) && str2.equals(zik.bw(str4))) {
                            long jBq2 = zik.bq(str4);
                            if (str3 == null || jBq2 > j) {
                                str3 = str4;
                                j = jBq2;
                            }
                        }
                    }
                }
            }
        }
        return str3;
    }

    public final Set c() {
        List list = (List) this.c.io();
        jsk jskVar = (jsk) this.a.io();
        agkx agkxVar = new agkx();
        agkxVar.j(list);
        if (jskVar != null) {
            agkxVar.c(jskVar);
        }
        return agkxVar.g();
    }

    public final void d() {
        jsk jskVar = (jsk) this.a.io();
        if (jskVar != null) {
            Iterator it = jskVar.h().iterator();
            while (it.hasNext()) {
                hna.ae(jskVar, (String) it.next());
            }
        }
    }

    public final boolean e(String str, String str2, long j, int i, int i2, int i3) {
        Set setC;
        String strB;
        elr elrVarA;
        typ.f(str);
        typ.f(str2);
        while (i2 <= i3) {
            if (i2 == 1) {
                if (this.b.io() != null && (strB = b((setC = c()), str, str2)) != null && (elrVarA = this.g.A(setC, strB, false)) != null) {
                    int iD = elrVarA.D(j);
                    int iMin = Math.min(elrVarA.H().length - 1, iD + i);
                    if (iMin >= iD && iMin < elrVarA.H().length) {
                        long jI = i(elrVarA, j);
                        if (g(setC, strB, jI, elrVarA.H()[iMin] - jI)) {
                            return true;
                        }
                    }
                }
                i2++;
            } else {
                yfb yfbVar = (yfb) this.h.get(Integer.valueOf(i2));
                if (yfbVar != null && yfbVar.b(str, str2)) {
                    return true;
                }
                i2++;
            }
        }
        return false;
    }

    public final boolean f(wgs wgsVar) {
        elr elrVarA;
        agkz agkzVarN = agkz.n((Collection) this.c.io());
        String strB = b(agkzVarN, wgsVar.c, wgsVar.f);
        if (strB == null || (elrVarA = this.g.A(agkzVarN, strB, false)) == null) {
            return false;
        }
        int length = elrVarA.H().length - 1;
        return g(agkzVarN, strB, 0L, (int) (elrVarA.H()[length] + ((long) elrVarA.F()[length])));
    }

    public final yfq h(Set set, String str, elr elrVar, long j) {
        TreeSet treeSetCC = zik.cC(set, str, elrVar, this.e);
        yfr yfrVar = new yfr(j, 2147483647L);
        yfr yfrVar2 = (yfr) treeSetCC.floor(yfrVar);
        if (yfrVar2 != null) {
            long j2 = yfrVar2.b;
            if (j < j2) {
                int iD = elrVar.D(j2);
                if (iD == elrVar.E() - 1 && yfrVar2.b == elrVar.I()[iD] + elrVar.G()[iD]) {
                    return new yfq(j, i(elrVar, j), Long.MAX_VALUE, i(elrVar, yfrVar2.b));
                }
                long jI = i(elrVar, j);
                long j3 = yfrVar2.b;
                return new yfq(j, jI, j3, i(elrVar, j3));
            }
        }
        return new yfq(j, i(elrVar, j), 0L, -1L);
    }
}
