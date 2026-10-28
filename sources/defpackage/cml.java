package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cml implements cnk, cnj {
    public final cnk a;
    public long b;
    long c;
    long d;
    public cmo e;
    public boolean f;
    private final boolean g;
    private cnj h;
    private cmk[] i;
    private long j;
    private boolean k;
    private boolean l;

    public cml(cnk cnkVar, boolean z, long j, long j2, boolean z2) {
        this.a = cnkVar;
        this.i = new cmk[0];
        this.j = true != z ? -9223372036854775807L : j;
        this.b = -9223372036854775807L;
        this.g = z2;
        k(j, j2);
    }

    public static void r(ccu ccuVar, long j, long j2) {
        Object obj = ccuVar.b;
        obj.getClass();
        bse bseVar = (bse) obj;
        int i = bseVar.M;
        if (i == 0) {
            if (bseVar.N == 0) {
                return;
            } else {
                i = 0;
            }
        }
        if (j != 0) {
            i = 0;
        }
        int i2 = j2 == Long.MIN_VALUE ? bseVar.N : 0;
        bsd bsdVar = new bsd(bseVar);
        bsdVar.K = i;
        bsdVar.L = i2;
        ccuVar.b = new bse(bsdVar);
    }

    private static long t(long j, long j2, long j3) {
        long jMax = Math.max(j, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }

    @Override // defpackage.cnk
    public final long a(long j, cdv cdvVar) {
        long j2 = this.c;
        if (j == j2) {
            return j2;
        }
        long j3 = cdvVar.d;
        long jT = bwp.t(j3, 0L, j - j2);
        long j4 = cdvVar.e;
        long j5 = this.d;
        long jT2 = bwp.t(j4, 0L, j5 == Long.MIN_VALUE ? Long.MAX_VALUE : j5 - j);
        if (jT != j3 || jT2 != j4) {
            cdvVar = new cdv(jT, jT2);
        }
        return this.a.a(j, cdvVar);
    }

    @Override // defpackage.cop
    public final /* bridge */ /* synthetic */ void b(coq coqVar) {
        cnj cnjVar = this.h;
        cnjVar.getClass();
        cnjVar.b(this);
    }

    @Override // defpackage.cnk, defpackage.coq
    public final long d() {
        long jD = this.a.d();
        if (this.f) {
            long j = this.d;
            if (j == Long.MIN_VALUE) {
                return jD;
            }
            if (jD != Long.MIN_VALUE) {
                return Math.min(j, jD);
            }
        } else if (jD != Long.MIN_VALUE) {
            long j2 = this.d;
            if (j2 == Long.MIN_VALUE || jD < j2) {
                return jD;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.cnk
    public final long e() {
        long jT;
        if (s()) {
            this.k = true;
            jT = this.j;
            this.j = -9223372036854775807L;
            this.b = jT;
            long jE = e();
            if (jE != -9223372036854775807L) {
                return jE;
            }
        } else {
            long jE2 = this.a.e();
            if (jE2 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            jT = t(jE2, this.c, this.d);
            if (jT == this.b) {
                return -9223372036854775807L;
            }
            this.b = jT;
        }
        return jT;
    }

    @Override // defpackage.cnk
    public final long f(long j) {
        this.j = -9223372036854775807L;
        for (cmk cmkVar : this.i) {
            if (cmkVar != null) {
                cmkVar.b = false;
            }
        }
        return t(this.a.f(j), this.c, this.d);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0072  */
    @Override // defpackage.cnk
    public final long g(cqs[] cqsVarArr, boolean[] zArr, coo[] cooVarArr, boolean[] zArr2, long j) {
        cqs cqsVar;
        int length = cooVarArr.length;
        this.i = new cmk[length];
        coo[] cooVarArr2 = new coo[length];
        int i = 0;
        while (true) {
            coo cooVar = null;
            if (i >= cooVarArr.length) {
                break;
            }
            cmk[] cmkVarArr = this.i;
            cmk cmkVar = (cmk) cooVarArr[i];
            cmkVarArr[i] = cmkVar;
            if (cmkVar != null) {
                cooVar = cmkVar.a;
            }
            cooVarArr2[i] = cooVar;
            i++;
        }
        long jG = this.a.g(cqsVarArr, zArr, cooVarArr2, zArr2, j);
        long jT = t(jG, j, this.d);
        int i2 = 0;
        boolean z = false;
        while (true) {
            boolean z2 = true;
            if (i2 >= cooVarArr.length) {
                break;
            }
            coo cooVar2 = cooVarArr2[i2];
            cmk[] cmkVarArr2 = this.i;
            if (cooVar2 == null) {
                cmkVarArr2[i2] = null;
            } else {
                cmk cmkVar2 = cmkVarArr2[i2];
                if (cmkVar2 == null || cmkVar2.a != cooVar2) {
                    if (!s()) {
                        z2 = false;
                    } else if (jG >= j) {
                        if (jG == 0 || (cqsVar = cqsVarArr[i2]) == null) {
                            z2 = false;
                        } else {
                            bse bseVarC = cqsVar.c();
                            if (bsy.h(bseVarC.q, bseVarC.l)) {
                                z2 = false;
                            }
                        }
                    }
                    cmkVarArr2 = this.i;
                    coo cooVar3 = cooVarArr2[i2];
                    cooVar3.getClass();
                    cmkVarArr2[i2] = new cmk(this, cooVar3, z2);
                    z |= z2;
                }
            }
            cooVarArr[i2] = cmkVarArr2[i2];
            i2++;
        }
        this.j = true != z ? -9223372036854775807L : jT;
        if (this.l) {
            this.k = true;
        }
        return jT;
    }

    @Override // defpackage.cnj
    public final void gp(cnk cnkVar) {
        if (this.e == null) {
            cnj cnjVar = this.h;
            cnjVar.getClass();
            cnjVar.gp(this);
        }
    }

    @Override // defpackage.cnk, defpackage.coq
    public final long gt() {
        long jGt = this.a.gt();
        if (this.f) {
            long j = this.d;
            if (j == Long.MIN_VALUE) {
                return jGt;
            }
            if (jGt != Long.MIN_VALUE) {
                return Math.min(j, jGt);
            }
        } else if (jGt != Long.MIN_VALUE) {
            long j2 = this.d;
            if (j2 == Long.MIN_VALUE || jGt < j2) {
                return jGt;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.cnk
    public final /* synthetic */ long h(long j) {
        return Long.MIN_VALUE;
    }

    @Override // defpackage.cnk
    public final coy i() {
        return this.a.i();
    }

    @Override // defpackage.cnk
    public final void j() throws cmo {
        cmo cmoVar = this.e;
        if (cmoVar != null) {
            throw cmoVar;
        }
        this.a.j();
    }

    public final void k(long j, long j2) {
        this.c = j;
        this.d = j2;
        if (this.g) {
            long jH = this.a.h(j2);
            if (jH != Long.MIN_VALUE && jH != j2) {
                throw new IllegalStateException(ahno.E("Period updating end positions not supported, %s!=%s", Long.valueOf(jH), Long.valueOf(j2)));
            }
            this.f = jH == j2;
        }
    }

    @Override // defpackage.cnk
    public final void l(cnj cnjVar, long j) {
        this.h = cnjVar;
        this.a.l(this, j);
    }

    @Override // defpackage.cnk, defpackage.coq
    public final void m(long j) {
        this.a.m(j);
    }

    @Override // defpackage.cnk
    public final void n() {
        this.l = true;
        this.a.n();
    }

    @Override // defpackage.cnk, defpackage.coq
    public final boolean o(ccy ccyVar) {
        return this.a.o(ccyVar);
    }

    @Override // defpackage.cnk, defpackage.coq
    public final boolean p() {
        return this.a.p();
    }

    @Override // defpackage.cnk
    public final void q(long j) {
        this.a.q(j);
    }

    final boolean s() {
        return (this.j == -9223372036854775807L || this.k) ? false : true;
    }

    public cml(cnk cnkVar, boolean z, long j, long j2) {
        this(cnkVar, z, j, j2, bsc.c(5));
    }
}
