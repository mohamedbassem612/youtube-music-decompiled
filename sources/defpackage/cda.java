package defpackage;

import java.util.Arrays;
import java.util.IdentityHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cda {
    public final cnk a;
    public final Object b;
    public final coo[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public cdb g;
    public cda h;
    public coy i = coy.a;
    public long j;
    public pob k;
    private final boolean[] l;
    private final boolean[] m;
    private final cdq[] n;
    private final cqz o;
    private final cdj p;

    /* JADX WARN: Type inference failed for: r7v10, types: [cnn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [cno, java.lang.Object] */
    public cda(cdq[] cdqVarArr, long j, cqz cqzVar, cra craVar, cdj cdjVar, cdb cdbVar, pob pobVar, boolean z) {
        this.n = cdqVarArr;
        this.j = j;
        this.o = cqzVar;
        this.p = cdjVar;
        this.b = cdbVar.a.a;
        this.g = cdbVar;
        this.k = pobVar;
        int length = cdqVarArr.length;
        this.c = new coo[length];
        this.l = new boolean[length];
        this.m = new boolean[length];
        cnm cnmVar = cdbVar.a;
        long j2 = cdbVar.b;
        Object objQ = cau.q(cnmVar.a);
        cnm cnmVarA = cnmVar.a(cau.p(cnmVar.a));
        cdh cdhVar = (cdh) cdjVar.c.get(objQ);
        cdhVar.getClass();
        cdjVar.f.add(cdhVar);
        xsc xscVar = (xsc) cdjVar.e.get(cdhVar);
        if (xscVar != null) {
            xscVar.a.w(xscVar.b);
        }
        cdhVar.c.add(cnmVarA);
        cne cneVarC = cdhVar.a.c(cnmVarA, craVar, j2);
        cdjVar.b.put(cneVarC, cdhVar);
        cdjVar.c();
        this.a = cneVarC;
        if (z) {
            cneVarC.n();
        }
    }

    private final void q() {
        if (!k()) {
            return;
        }
        int i = 0;
        while (true) {
            pob pobVar = this.k;
            if (i >= pobVar.a) {
                return;
            }
            boolean zD = pobVar.d(i);
            cqs cqsVar = ((cqs[]) this.k.e)[i];
            if (zD && cqsVar != null) {
                cqsVar.j();
            }
            i++;
        }
    }

    private final void r() {
        if (!k()) {
            return;
        }
        int i = 0;
        while (true) {
            pob pobVar = this.k;
            if (i >= pobVar.a) {
                return;
            }
            boolean zD = pobVar.d(i);
            cqs cqsVar = ((cqs[]) this.k.e)[i];
            if (zD && cqsVar != null) {
                cqsVar.k();
            }
            i++;
        }
    }

    public final long a() {
        if (!this.e) {
            return this.g.b;
        }
        long jGt = this.f ? this.a.gt() : Long.MIN_VALUE;
        return jGt == Long.MIN_VALUE ? this.g.e : jGt;
    }

    public final long b() {
        if (this.e) {
            return this.a.d();
        }
        return 0L;
    }

    public final long c() {
        return this.g.b + this.j;
    }

    public final void d(ccy ccyVar) {
        ahno.O(k());
        this.a.o(ccyVar);
    }

    public final void e(cnj cnjVar, long j) {
        this.d = true;
        this.a.l(cnjVar, j);
    }

    public final void f() {
        q();
        cnk cnkVar = this.a;
        cdj cdjVar = this.p;
        try {
            IdentityHashMap identityHashMap = cdjVar.b;
            cdh cdhVar = (cdh) identityHashMap.remove(cnkVar);
            cdhVar.getClass();
            cdhVar.a.k(cnkVar);
            cdhVar.c.remove(((cne) cnkVar).a);
            if (!identityHashMap.isEmpty()) {
                cdjVar.c();
            }
            cdjVar.d(cdhVar);
        } catch (RuntimeException e) {
            bvx.d("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void g(cda cdaVar) {
        if (cdaVar != this.h) {
            q();
            this.h = cdaVar;
            r();
        }
    }

    public final void h(int i) {
        this.l[i] = true;
    }

    public final boolean i() {
        if (this.e) {
            return !this.f || this.a.gt() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean j() {
        if (this.e) {
            return i() || a() - this.g.b >= -9223372036854775807L;
        }
        return false;
    }

    public final boolean k() {
        return this.h == null;
    }

    public final boolean l(int i) {
        return this.l[i];
    }

    public final void m(float f, btn btnVar) {
        this.e = true;
        Arrays.fill(this.l, false);
        this.i = this.a.i();
        pob pobVarP = p(f, btnVar);
        cdb cdbVar = this.g;
        long jMax = cdbVar.b;
        long j = cdbVar.e;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jO = o(pobVarP, jMax);
        long j2 = this.j;
        cdb cdbVar2 = this.g;
        this.j = j2 + (cdbVar2.b - jO);
        this.g = cdbVar2.b(jO, cdbVar2.c);
    }

    public final long n(pob pobVar, long j, boolean z, boolean[] zArr) {
        cdq[] cdqVarArr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= pobVar.a) {
                break;
            }
            boolean[] zArr2 = this.m;
            if (z || !pobVar.e(this.k, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            cdqVarArr = this.n;
            if (i2 >= cdqVarArr.length) {
                break;
            }
            cdqVarArr[i2].j();
            i2++;
        }
        q();
        this.k = pobVar;
        r();
        cnk cnkVar = this.a;
        Object obj = pobVar.e;
        boolean[] zArr3 = this.m;
        coo[] cooVarArr = this.c;
        cqs[] cqsVarArr = (cqs[]) obj;
        long jG = cnkVar.g(cqsVarArr, zArr3, cooVarArr, zArr, j);
        for (cdq cdqVar : cdqVarArr) {
            cdqVar.j();
        }
        this.f = false;
        for (int i3 = 0; i3 < cooVarArr.length; i3++) {
            if (cooVarArr[i3] != null) {
                ahno.O(pobVar.d(i3));
                cdqVarArr[i3].j();
                this.f = true;
            } else {
                ahno.O(cqsVarArr[i3] == null);
            }
        }
        return jG;
    }

    public final long o(pob pobVar, long j) {
        return n(pobVar, j, false, new boolean[this.n.length]);
    }

    public final pob p(float f, btn btnVar) {
        coy coyVar = this.i;
        cnm cnmVar = this.g.a;
        cqz cqzVar = this.o;
        cdq[] cdqVarArr = this.n;
        pob pobVarQ = cqzVar.q(cdqVarArr, coyVar, cnmVar, btnVar);
        for (int i = 0; i < pobVarQ.a; i++) {
            boolean z = true;
            if (pobVarQ.d(i)) {
                if (((cqs[]) pobVarQ.e)[i] == null) {
                    cdqVarArr[i].j();
                    z = false;
                }
                ahno.O(z);
            } else {
                ahno.O(((cqs[]) pobVarQ.e)[i] == null);
            }
        }
        for (cqs cqsVar : (cqs[]) pobVarQ.e) {
            if (cqsVar != null) {
                cqsVar.l(f);
            }
        }
        return pobVarQ;
    }
}
