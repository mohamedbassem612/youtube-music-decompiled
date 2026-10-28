package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cxc implements cvi {
    private cvk f;
    private boolean h;
    private long i;
    private int j;
    private int k;
    private int l;
    private long m;
    private boolean n;
    private cxb o;
    private cxg p;
    private final bwb a = new bwb(4);
    private final bwb b = new bwb(9);
    private final bwb c = new bwb(11);
    private final bwb d = new bwb();
    private final cxd e = new cxd();
    private int g = 1;

    private final bwb h(cvj cvjVar) {
        bwb bwbVar = this.d;
        if (this.l > bwbVar.e()) {
            bwbVar.N(new byte[Math.max(bwbVar.e() << 1, this.l)], 0);
        } else {
            bwbVar.P(0);
        }
        bwbVar.O(this.l);
        ((cvb) cvjVar).o(bwbVar.b, 0, this.l, false);
        return bwbVar;
    }

    private final void i() {
        if (this.n) {
            return;
        }
        this.f.z(new cvy(-9223372036854775807L, 0L));
        this.n = true;
    }

    @Override // defpackage.cvi
    public final /* synthetic */ List a() {
        return agpi.a;
    }

    @Override // defpackage.cvi
    public final void b(cvk cvkVar) {
        this.f = cvkVar;
    }

    @Override // defpackage.cvi
    public final void d(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // defpackage.cvi
    public final boolean e(cvj cvjVar) {
        bwb bwbVar = this.a;
        cvb cvbVar = (cvb) cvjVar;
        cvbVar.n(bwbVar.b, 0, 3, false);
        bwbVar.P(0);
        if (bwbVar.p() != 4607062) {
            return false;
        }
        cvbVar.n(bwbVar.b, 0, 2, false);
        bwbVar.P(0);
        if ((bwbVar.s() & 250) != 0) {
            return false;
        }
        cvbVar.n(bwbVar.b, 0, 4, false);
        bwbVar.P(0);
        int i = bwbVar.i();
        cvjVar.k();
        cvbVar.m(i, false);
        cvbVar.n(bwbVar.b, 0, 4, false);
        bwbVar.P(0);
        return bwbVar.i() == 0;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008e  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0009 A[SYNTHETIC] */
    @Override // defpackage.cvi
    public final int g(cvj cvjVar, qha qhaVar) {
        long j;
        boolean zC;
        boolean z;
        long j2;
        this.f.getClass();
        while (true) {
            int i = this.g;
            int i2 = 8;
            if (i == 1) {
                bwb bwbVar = this.b;
                if (!cvjVar.o(bwbVar.b, 0, 9, true)) {
                    return -1;
                }
                bwbVar.P(0);
                bwbVar.Q(4);
                int iN = bwbVar.n();
                int i3 = iN & 4;
                int i4 = iN & 1;
                if (i3 != 0 && this.o == null) {
                    this.o = new cxb(this.f.s(8, 1));
                }
                if (i4 != 0 && this.p == null) {
                    this.p = new cxg(this.f.s(9, 2));
                }
                this.f.t();
                this.j = bwbVar.i() - 5;
                this.g = 2;
            } else if (i == 2) {
                ((cvb) cvjVar).p(this.j, false);
                this.j = 0;
                this.g = 3;
            } else if (i == 3) {
                bwb bwbVar2 = this.c;
                if (!cvjVar.o(bwbVar2.b, 0, 11, true)) {
                    return -1;
                }
                bwbVar2.P(0);
                this.k = bwbVar2.n();
                this.l = bwbVar2.p();
                this.m = bwbVar2.p();
                this.m = (((long) (bwbVar2.n() << 24)) | this.m) * 1000;
                bwbVar2.Q(3);
                this.g = 4;
            } else {
                if (i != 4) {
                    throw new IllegalStateException();
                }
                if (this.h) {
                    j = this.i + this.m;
                } else {
                    j = this.e.a == -9223372036854775807L ? 0L : this.m;
                }
                int i5 = this.k;
                if (i5 == 8) {
                    if (this.o != null) {
                        i();
                        zC = this.o.c(h(cvjVar), j);
                    }
                    z = true;
                    if (!this.h && zC) {
                        this.h = true;
                        if (this.e.a == -9223372036854775807L) {
                            j2 = -this.m;
                        } else {
                            j2 = 0;
                        }
                        this.i = j2;
                    }
                    this.j = 4;
                    this.g = 2;
                    if (z) {
                        return 0;
                    }
                } else {
                    i2 = i5;
                }
                if (i2 == 9) {
                    if (this.p != null) {
                        i();
                        zC = this.p.c(h(cvjVar), j);
                        z = true;
                    } else {
                        ((cvb) cvjVar).p(this.l, false);
                        zC = false;
                        z = false;
                    }
                } else if (i2 != 18 || this.n) {
                    ((cvb) cvjVar).p(this.l, false);
                    zC = false;
                    z = false;
                } else {
                    cxd cxdVar = this.e;
                    zC = cxdVar.c(h(cvjVar), j);
                    long j3 = cxdVar.a;
                    if (j3 != -9223372036854775807L) {
                        this.f.z(new cvt(cxdVar.c, cxdVar.b, j3));
                        this.n = true;
                    }
                    z = true;
                }
                if (!this.h) {
                    this.h = true;
                    if (this.e.a == -9223372036854775807L) {
                        j2 = -this.m;
                    } else {
                        j2 = 0;
                    }
                    this.i = j2;
                }
                this.j = 4;
                this.g = 2;
                if (z) {
                    return 0;
                }
            }
        }
    }

    @Override // defpackage.cvi
    public final void c() {
    }

    @Override // defpackage.cvi
    public final /* synthetic */ void f() {
    }
}
