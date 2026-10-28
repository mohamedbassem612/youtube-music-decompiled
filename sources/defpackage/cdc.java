package defpackage;

import android.util.Pair;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cdc {
    public int a;
    public boolean b;
    public cbu c;
    public cda d;
    public final cda[] e;
    public final cda[] f;
    public cda g;
    public cda h;
    public int i;
    public Object j;
    public final ces l;
    public final hhb m;
    private final bvq p;
    private long q;
    private long r;
    private final btl n = new btl();
    private final btm o = new btm();
    public List k = new ArrayList();

    public cdc(ces cesVar, bvq bvqVar, hhb hhbVar, cbu cbuVar, int i) {
        this.l = cesVar;
        this.p = bvqVar;
        this.m = hhbVar;
        this.c = cbuVar;
        this.e = new cda[i];
        this.f = new cda[i];
    }

    private static cnm A(btn btnVar, Object obj, long j, long j2, btm btmVar, btl btlVar) {
        btnVar.m(obj, btlVar);
        btnVar.e(btlVar.c, btmVar, 0L);
        btnVar.a(obj);
        btlVar.k();
        btnVar.m(obj, btlVar);
        int iC = btlVar.c(j);
        return iC == -1 ? new cnm(obj, -1, -1, j2, btlVar.b(j)) : new cnm(obj, iC, btlVar.d(iC), j2, -1);
    }

    private final boolean B(btn btnVar, cnm cnmVar, boolean z) {
        int iA = btnVar.a(cnmVar.a);
        btl btlVar = this.n;
        int i = btnVar.d(iA, btlVar, false).c;
        btm btmVar = this.o;
        return !btnVar.e(i, btmVar, 0L).j && btnVar.i(iA, btlVar, btmVar, this.a, this.b) == -1 && z;
    }

    private final boolean C(btn btnVar, cnm cnmVar) {
        if (!E(cnmVar)) {
            return false;
        }
        Object obj = cnmVar.a;
        return btnVar.e(btnVar.m(obj, this.n).c, this.o, 0L).p == btnVar.a(obj);
    }

    private static boolean D(btn btnVar, int i, long j, btm btmVar) {
        if (j != -9223372036854775807L) {
            return false;
        }
        btnVar.e(i, btmVar, 0L);
        return btmVar.j && !btmVar.l;
    }

    private static final boolean E(cnm cnmVar) {
        return !cnmVar.c() && cnmVar.e == -1;
    }

    private final void F(btn btnVar, Object obj, int i) {
        btl btlVar = this.n;
        btnVar.m(obj, btlVar);
        btlVar.l(i);
        long j = btlVar.h.a(i).i;
    }

    public static final boolean v(cda[] cdaVarArr, long[] jArr, cda cdaVar, long j) {
        for (int i = 0; i < cdaVarArr.length; i++) {
            cda cdaVar2 = cdaVarArr[i];
            if (cdaVar2 != null) {
                for (cda cdaVar3 = cdaVar.h; cdaVar3 != null; cdaVar3 = cdaVar3.h) {
                    if (cdaVar3.equals(cdaVar2)) {
                        return true;
                    }
                }
                if (cdaVar2.equals(cdaVar)) {
                    long j2 = jArr[i];
                    if (j2 == Long.MIN_VALUE || j2 >= j) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    private final long w(btn btnVar, cnm cnmVar) {
        Object obj = cnmVar.a;
        btl btlVar = this.n;
        btnVar.m(obj, btlVar);
        if (cnmVar.c()) {
            return btlVar.e(cnmVar.b, cnmVar.c);
        }
        int i = cnmVar.e;
        if (i == -1) {
            return btlVar.d;
        }
        btlVar.l(i);
        return 0L;
    }

    private final long x(Object obj) {
        for (int i = 0; i < this.k.size(); i++) {
            cda cdaVar = (cda) this.k.get(i);
            if (cdaVar.b.equals(obj)) {
                return cdaVar.g.a.d;
            }
        }
        return -1L;
    }

    private final cdb y(btn btnVar, Object obj, int i, int i2, long j, long j2) {
        cnm cnmVar = new cnm(obj, i, i2, j2, -1);
        Object obj2 = cnmVar.a;
        int i3 = cnmVar.b;
        int i4 = cnmVar.c;
        btl btlVar = this.n;
        long jE = btnVar.m(obj2, btlVar).e(i3, i4);
        if (i2 == btlVar.d(i)) {
            btlVar.h();
        }
        btlVar.i(i3);
        long jMax = 0;
        if (jE != -9223372036854775807L && jE <= 0) {
            jMax = Math.max(0L, (-1) + jE);
        }
        return new cdb(cnmVar, jMax, -9223372036854775807L, j, jE, false, false, false);
    }

    private final cdb z(btn btnVar, Object obj, long j, long j2, long j3, long j4) {
        btl btlVar = this.n;
        btnVar.m(obj, btlVar);
        int iB = btlVar.b(j);
        if (iB != -1) {
            btlVar.i(iB);
        }
        if (iB != -1) {
            btlVar.i(iB);
        }
        cnm cnmVar = new cnm(obj, -1, -1, j4, iB);
        boolean zE = E(cnmVar);
        boolean zC = C(btnVar, cnmVar);
        boolean zB = B(btnVar, cnmVar, zE);
        long jW = w(btnVar, cnmVar);
        return new cdb(cnmVar, (jW == -9223372036854775807L || j < jW) ? j : Math.max(0L, jW - 1), j2, j3, jW, zE, zC, zB);
    }

    public final int a(cda cdaVar) {
        cda[] cdaVarArr;
        cdaVar.getClass();
        if (cdaVar.equals(this.g)) {
            return 0;
        }
        this.g = cdaVar;
        int i = 0;
        while (true) {
            cdaVar = cdaVar.h;
            if (cdaVar == null) {
                cda cdaVar2 = this.g;
                cdaVar2.getClass();
                cdaVar2.g(null);
                q();
                return i;
            }
            int i2 = 0;
            while (true) {
                cdaVarArr = this.e;
                if (i2 >= cdaVarArr.length) {
                    break;
                }
                if (cdaVar.equals(cdaVarArr[i2])) {
                    cda cdaVar3 = this.g;
                    cdaVarArr[i2] = cdaVar3;
                    this.f[i2] = cdaVar3;
                    i = 3;
                }
                i2++;
            }
            int i3 = 0;
            while (true) {
                cda[] cdaVarArr2 = this.f;
                if (i3 < cdaVarArr2.length) {
                    if (cdaVar.equals(cdaVarArr2[i3])) {
                        cdaVarArr2[i3] = cdaVarArr[i3];
                        i |= 2;
                    }
                    i3++;
                }
            }
            cdaVar.f();
            this.i--;
        }
    }

    public final int b(btn btnVar) {
        btn btnVar2;
        cda cdaVar;
        cda cdaVar2 = this.d;
        if (cdaVar2 == null) {
            return 0;
        }
        int iA = btnVar.a(cdaVar2.b);
        while (true) {
            btnVar2 = btnVar;
            iA = btnVar2.i(iA, this.n, this.o, this.a, this.b);
            while (true) {
                cdaVar2.getClass();
                cdaVar = cdaVar2.h;
                if (cdaVar == null || cdaVar2.g.g) {
                    break;
                }
                cdaVar2 = cdaVar;
            }
            if (iA == -1 || cdaVar == null || btnVar2.a(cdaVar.b) != iA) {
                break;
            }
            cdaVar2 = cdaVar;
            btnVar = btnVar2;
        }
        int iA2 = a(cdaVar2);
        cdaVar2.g = l(btnVar2, cdaVar2.g);
        return iA2;
    }

    public final cda c() {
        cda cdaVar;
        cda cdaVar2;
        if (this.d == null) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            cda[] cdaVarArr = this.e;
            int length = cdaVarArr.length;
            cdaVar = this.d;
            if (i2 >= length) {
                break;
            }
            if (cdaVar.equals(cdaVarArr[i2])) {
                cdaVarArr[i2] = this.d.h;
            }
            i2++;
        }
        cdaVar.getClass();
        while (true) {
            cda[] cdaVarArr2 = this.f;
            int length2 = cdaVarArr2.length;
            cdaVar2 = this.d;
            if (i >= length2) {
                break;
            }
            if (cdaVar2.equals(cdaVarArr2[i])) {
                cdaVarArr2[i] = this.d.h;
            }
            i++;
        }
        cdaVar2.getClass();
        cdaVar2.f();
        int i3 = this.i - 1;
        this.i = i3;
        if (i3 == 0) {
            this.g = null;
            cda cdaVar3 = this.d;
            this.j = cdaVar3.b;
            this.r = cdaVar3.g.a.d;
        }
        this.d = this.d.h;
        q();
        return this.d;
    }

    public final cda d(int i) {
        cda[] cdaVarArr = this.f;
        cda cdaVar = cdaVarArr[i];
        cda[] cdaVarArr2 = this.e;
        if (Objects.equals(cdaVar, cdaVarArr2[i])) {
            cda cdaVar2 = cdaVarArr2[i];
            cdaVar2.getClass();
            cdaVarArr[i] = cdaVar2.h;
        }
        cda cdaVar3 = cdaVarArr2[i];
        cdaVar3.getClass();
        cdaVarArr2[i] = cdaVar3.h;
        q();
        cda cdaVar4 = cdaVarArr2[i];
        cdaVar4.getClass();
        return cdaVar4;
    }

    public final cda e() {
        for (cda cdaVar = this.d; cdaVar != null; cdaVar = cdaVar.h) {
            for (cda cdaVar2 : this.f) {
                if (cdaVar.equals(cdaVar2)) {
                    return cdaVar;
                }
            }
        }
        return null;
    }

    public final cda f() {
        for (cda cdaVar = this.d; cdaVar != null; cdaVar = cdaVar.h) {
            for (cda cdaVar2 : this.e) {
                if (cdaVar.equals(cdaVar2)) {
                    return cdaVar;
                }
            }
        }
        return null;
    }

    public final cda g() {
        Object[] objArr = this.e;
        if (objArr.length == 0) {
            return null;
        }
        cda cdaVar = objArr[0];
        for (cda cdaVar2 = this.d; cdaVar2 != null; cdaVar2 = cdaVar2.h) {
            for (Object obj : objArr) {
                if (cdaVar2.equals(obj)) {
                    cdaVar = cdaVar2;
                    break;
                }
            }
        }
        return cdaVar;
    }

    public final cda h(int i) {
        return this.f[i];
    }

    public final cda i(int i) {
        return this.e[i];
    }

    public final cdb j(btn btnVar, cda cdaVar, long j) {
        int i;
        btn btnVar2;
        long j2;
        long j3;
        btm btmVar;
        Object obj;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        cdb cdbVar = cdaVar.g;
        long j9 = cdaVar.j;
        long j10 = cdbVar.e;
        long j11 = (j9 + j10) - j;
        if (cdbVar.g) {
            cnm cnmVar = cdbVar.a;
            Object obj2 = cnmVar.a;
            int iA = btnVar.a(obj2);
            int i2 = this.a;
            boolean z = this.b;
            btm btmVar2 = this.o;
            btl btlVar = this.n;
            int i3 = btnVar.i(iA, btlVar, btmVar2, i2, z);
            if (i3 != -1) {
                int i4 = btnVar.d(i3, btlVar, true).c;
                Object obj3 = btlVar.b;
                obj3.getClass();
                long j12 = cnmVar.d;
                if (btnVar.e(i4, btmVar2, 0L).o == i3) {
                    long jMax = D(btnVar, btlVar.c, btlVar.d, btmVar2) ? Math.max(0L, j11) : -9223372036854775807L;
                    Pair pairL = btnVar.l(btmVar2, btlVar, i4, -9223372036854775807L, jMax);
                    if (pairL != null) {
                        Object obj4 = pairL.first;
                        long jLongValue = ((Long) pairL.second).longValue();
                        cda cdaVar2 = cdaVar.h;
                        if (cdaVar2 == null || !cdaVar2.b.equals(obj4)) {
                            long jX = x(obj4);
                            if (jX == -1) {
                                jX = this.q;
                                this.q = 1 + jX;
                            }
                            j8 = jX;
                        } else {
                            j8 = cdaVar2.g.a.d;
                        }
                        j4 = jLongValue;
                        j7 = jMax;
                        btmVar = btmVar2;
                        obj = obj4;
                        j5 = j8;
                        j6 = -9223372036854775807L;
                    }
                } else {
                    btmVar = btmVar2;
                    obj = obj3;
                    j4 = 0;
                    j5 = j12;
                    j6 = 0;
                    j7 = -9223372036854775807L;
                }
                cnm cnmVarA = A(btnVar, obj, j4, j5, btmVar, btlVar);
                long j13 = j4;
                if (j6 != -9223372036854775807L && cdbVar.d != -9223372036854775807L) {
                    btnVar.m(obj2, btlVar).k();
                    int i5 = btlVar.h.d;
                }
                return k(btnVar, cnmVarA, j6, j13, j7);
            }
        } else {
            cnm cnmVar2 = cdbVar.a;
            Object obj5 = cnmVar2.a;
            btl btlVar2 = this.n;
            btnVar.m(obj5, btlVar2);
            if (!cnmVar2.c()) {
                int i6 = cnmVar2.e;
                if (i6 != -1) {
                    btlVar2.k();
                    if (i6 == -1) {
                        btlVar2.h.a(-1);
                        i = -1;
                    } else {
                        i = i6;
                    }
                } else {
                    i = -1;
                }
                int iD = btlVar2.d(i);
                btlVar2.i(i);
                if (iD != btlVar2.a(i)) {
                    return y(btnVar, obj5, i, iD, j10, cnmVar2.d);
                }
                F(btnVar, obj5, i);
                return z(btnVar, obj5, 0L, -9223372036854775807L, j10, cnmVar2.d);
            }
            int i7 = cnmVar2.b;
            if (btlVar2.a(i7) != -1) {
                int iA2 = btlVar2.h.a(i7).a(cnmVar2.c);
                if (iA2 < 0) {
                    return y(btnVar, obj5, i7, iA2, cdbVar.d, cnmVar2.d);
                }
                long jLongValue2 = cdbVar.d;
                if (jLongValue2 == -9223372036854775807L) {
                    btm btmVar3 = this.o;
                    long jMax2 = D(btnVar, btlVar2.c, btlVar2.d, btmVar3) ? Math.max(0L, j11) : -9223372036854775807L;
                    btnVar2 = btnVar;
                    Pair pairL2 = btnVar2.l(btmVar3, btlVar2, btlVar2.c, -9223372036854775807L, jMax2);
                    if (pairL2 != null) {
                        jLongValue2 = ((Long) pairL2.second).longValue();
                        j3 = jMax2;
                        j2 = -9223372036854775807L;
                    }
                } else {
                    btnVar2 = btnVar;
                    j2 = jLongValue2;
                    j3 = -9223372036854775807L;
                }
                F(btnVar2, obj5, i7);
                return z(btnVar2, obj5, Math.max(0L, jLongValue2), j3, j2, cnmVar2.d);
            }
        }
        return null;
    }

    public final cdb k(btn btnVar, cnm cnmVar, long j, long j2, long j3) {
        Object obj = cnmVar.a;
        btnVar.m(obj, this.n);
        return cnmVar.c() ? y(btnVar, obj, cnmVar.b, cnmVar.c, j, cnmVar.d) : z(btnVar, obj, j2, j3, j, cnmVar.d);
    }

    public final cdb l(btn btnVar, cdb cdbVar) {
        cnm cnmVar = cdbVar.a;
        boolean zE = E(cnmVar);
        boolean zC = C(btnVar, cnmVar);
        boolean zB = B(btnVar, cnmVar, zE);
        long jW = w(btnVar, cnmVar);
        Object obj = cnmVar.a;
        btl btlVar = this.n;
        btnVar.m(obj, btlVar);
        if (cnmVar.c()) {
            btlVar.i(cnmVar.b);
        } else {
            int i = cnmVar.e;
            if (i != -1) {
                btlVar.i(i);
            }
        }
        return new cdb(cnmVar, cdbVar.b, cdbVar.c, cdbVar.d, jW, zE, zC, zB);
    }

    public final cnm m(cdk cdkVar, btn btnVar, Object obj, long j, boolean z, boolean z2) {
        long jX;
        int iA;
        Object obj2 = obj;
        btl btlVar = this.n;
        int i = btnVar.m(obj2, btlVar).c;
        Object obj3 = this.j;
        if (obj3 == null || (iA = btnVar.a(obj3)) == -1 || btnVar.d(iA, btlVar, false).c != i) {
            cda cdaVar = this.d;
            while (true) {
                if (cdaVar == null) {
                    cda cdaVar2 = this.d;
                    while (true) {
                        if (cdaVar2 == null) {
                            jX = x(obj2);
                            if (jX != -1) {
                                break;
                            }
                            jX = this.q;
                            this.q = 1 + jX;
                            if (this.d != null) {
                                break;
                            }
                            this.j = obj2;
                            this.r = jX;
                            break;
                        }
                        int iA2 = btnVar.a(cdaVar2.b);
                        if (iA2 != -1 && btnVar.d(iA2, btlVar, false).c == i) {
                            jX = cdaVar2.g.a.d;
                            break;
                        }
                        cdaVar2 = cdaVar2.h;
                    }
                } else {
                    if (cdaVar.b.equals(obj2)) {
                        jX = cdaVar.g.a.d;
                        break;
                    }
                    cdaVar = cdaVar.h;
                }
            }
        } else {
            jX = this.r;
        }
        long j2 = jX;
        if (!z && !z2) {
            cnm cnmVar = cdkVar.c;
            cnm cnmVarA = A(btnVar, obj2, j, j2, this.o, btlVar);
            if (cnmVar.c() && cnmVar.equals(cnmVarA)) {
                return cnmVar;
            }
            btnVar.m(obj2, btlVar);
            return new cnm(obj2, -1, -1, j2, btlVar.b(j));
        }
        btnVar.m(obj2, btlVar);
        int i2 = btlVar.c;
        btm btmVar = this.o;
        btnVar.e(i2, btmVar, 0L);
        for (int iA3 = btnVar.a(obj); iA3 >= btmVar.o; iA3--) {
            btnVar.d(iA3, btlVar, true);
            btlVar.k();
            if (btlVar.c(btlVar.d) != -1) {
                obj2 = btlVar.b;
                obj2.getClass();
            }
        }
        cnm cnmVarA2 = A(btnVar, obj2, j, j2, btmVar, btlVar);
        int i3 = cnmVarA2.b;
        if (i3 != -1 && !z) {
            Object obj4 = cnmVarA2.a;
            btnVar.m(obj4, btlVar);
            long j3 = btlVar.h.a(i3).a;
            if (j != 0) {
                return new cnm(obj4, -1, -1, cnmVarA2.d, btlVar.b(j));
            }
        }
        return cnmVarA2;
    }

    public final void n(int i) {
        cda[] cdaVarArr = this.f;
        cda cdaVar = cdaVarArr[i];
        cdaVar.getClass();
        cdaVarArr[i] = cdaVar.h;
        q();
    }

    public final void o() {
        if (this.i != 0) {
            cda cdaVar = this.d;
            cdaVar.getClass();
            this.j = cdaVar.b;
            this.r = cdaVar.g.a.d;
            while (cdaVar != null) {
                cdaVar.f();
                cdaVar = cdaVar.h;
            }
            this.d = null;
            this.g = null;
            Arrays.fill(this.e, (Object) null);
            Arrays.fill(this.f, (Object) null);
            this.i = 0;
            q();
        }
    }

    public final void p() {
        cda cdaVar = this.h;
        if (cdaVar == null || cdaVar.j()) {
            this.h = null;
            for (int i = 0; i < this.k.size(); i++) {
                cda cdaVar2 = (cda) this.k.get(i);
                if (!cdaVar2.j()) {
                    this.h = cdaVar2;
                    return;
                }
            }
        }
    }

    public final void q() {
        cda cdaVar;
        agjz agjzVar = new agjz(4);
        for (cda cdaVar2 = this.d; cdaVar2 != null; cdaVar2 = cdaVar2.h) {
            agjzVar.h(cdaVar2.g.a);
        }
        cda[] cdaVarArr = this.e;
        cnm cnmVar = null;
        if (cdaVarArr.length != 0 && (cdaVar = cdaVarArr[0]) != null) {
            cnmVar = cdaVar.g.a;
        }
        this.p.d(new bf(this, agjzVar, cnmVar, 5, (short[]) null));
    }

    public final void r(long j) {
        cda cdaVar = this.g;
        if (cdaVar != null) {
            ahno.O(cdaVar.k());
            if (cdaVar.e) {
                cdaVar.a.m(j - cdaVar.j);
            }
        }
    }

    public final void s() {
        if (this.k.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.k.size(); i++) {
            ((cda) this.k.get(i)).f();
        }
        this.k = arrayList;
        this.h = null;
        p();
    }

    public final boolean t(cnk cnkVar) {
        cda cdaVar = this.g;
        return cdaVar != null && cdaVar.a == cnkVar;
    }

    public final boolean u(cnk cnkVar) {
        cda cdaVar = this.h;
        return cdaVar != null && cdaVar.a == cnkVar;
    }
}
