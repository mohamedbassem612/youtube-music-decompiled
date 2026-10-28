package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cxa implements cvi {
    private cvk c;
    private cwj d;
    private bsx f;
    private cvn g;
    private int h;
    private int i;
    private int j;
    private long k;
    private cuy l;
    private final byte[] a = new byte[42];
    private final bwb b = new bwb(new byte[32768], 0);
    private final qha m = new qha();
    private int e = 0;

    private final long h(bwb bwbVar, boolean z) {
        boolean zK;
        this.g.getClass();
        int i = bwbVar.c;
        while (i <= bwbVar.d - 16) {
            bwbVar.P(i);
            cvn cvnVar = this.g;
            int i2 = this.i;
            qha qhaVar = this.m;
            if (bbm.k(bwbVar, cvnVar, i2, qhaVar)) {
                bwbVar.P(i);
                return qhaVar.a;
            }
            i++;
        }
        if (z) {
            while (true) {
                int i3 = bwbVar.d;
                if (i > i3 - this.h) {
                    bwbVar.P(i3);
                    break;
                }
                bwbVar.P(i);
                try {
                    zK = bbm.k(bwbVar, this.g, this.i, this.m);
                } catch (IndexOutOfBoundsException unused) {
                    zK = false;
                }
                if (bwbVar.c <= bwbVar.d && zK) {
                    bwbVar.P(i);
                    return this.m.a;
                }
                i++;
            }
        } else {
            bwbVar.P(i);
        }
        return -1L;
    }

    private final void i() {
        long j = this.k * 1000000;
        cvn cvnVar = this.g;
        int i = bwp.a;
        this.d.e(j / ((long) cvnVar.e), 1, this.j, 0, null);
    }

    @Override // defpackage.cvi
    public final /* synthetic */ List a() {
        return agpi.a;
    }

    @Override // defpackage.cvi
    public final void b(cvk cvkVar) {
        this.c = cvkVar;
        this.d = cvkVar.s(0, 1);
        cvkVar.t();
    }

    @Override // defpackage.cvi
    public final void d(long j, long j2) {
        if (j == 0) {
            this.e = 0;
        } else {
            cuy cuyVar = this.l;
            if (cuyVar != null) {
                cuyVar.a(j2);
            }
        }
        this.k = j2 != 0 ? -1L : 0L;
        this.j = 0;
        this.b.L(0);
    }

    @Override // defpackage.cvi
    public final boolean e(cvj cvjVar) {
        bbm.h(cvjVar, false);
        bwb bwbVar = new bwb(4);
        ((cvb) cvjVar).n(bwbVar.b, 0, 4, false);
        return bwbVar.w() == 1716281667;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x019d  */
    @Override // defpackage.cvi
    public final int g(cvj cvjVar, qha qhaVar) throws bsz {
        int i;
        cvn cvnVar;
        cvz cvyVar;
        long j;
        boolean z;
        int i2 = this.e;
        if (i2 == 0) {
            i = 0;
            cvjVar.k();
            long jE = cvjVar.e();
            bsx bsxVarH = bbm.h(cvjVar, true);
            ((cvb) cvjVar).p((int) (cvjVar.e() - jE), false);
            this.f = bsxVarH;
            this.e = 1;
        } else {
            if (i2 != 1) {
                int i3 = 3;
                byte[] bArr = null;
                if (i2 != 2) {
                    int i4 = 7;
                    if (i2 == 3) {
                        cvn cvnVarE = this.g;
                        while (true) {
                            cvjVar.k();
                            dqp dqpVar = new dqp(new byte[4], bArr);
                            cvb cvbVar = (cvb) cvjVar;
                            cvbVar.n((byte[]) dqpVar.c, 0, 4, false);
                            boolean zU = dqpVar.u();
                            int i5 = dqpVar.i(i4);
                            int i6 = dqpVar.i(24) + 4;
                            if (i5 == 0) {
                                byte[] bArr2 = new byte[38];
                                cvbVar.o(bArr2, 0, 38, false);
                                cvnVarE = new cvn(bArr2, 4);
                            } else {
                                if (cvnVarE == null) {
                                    throw new IllegalArgumentException();
                                }
                                if (i5 == i3) {
                                    bwb bwbVar = new bwb(i6);
                                    cvbVar.o(bwbVar.b, 0, i6, false);
                                    cvnVarE = cvnVarE.e(bbm.l(bwbVar));
                                } else {
                                    if (i5 == 4) {
                                        bwb bwbVar2 = new bwb(i6);
                                        cvbVar.o(bwbVar2.b, 0, i6, false);
                                        bwbVar2.Q(4);
                                        cvnVar = new cvn(cvnVarE.a, cvnVarE.b, cvnVarE.c, cvnVarE.d, cvnVarE.e, cvnVarE.g, cvnVarE.h, cvnVarE.j, cvnVarE.k, cvnVarE.d(cwk.a(Arrays.asList((Object[]) aua.g(bwbVar2, false, false).a))));
                                    } else if (i5 == 6) {
                                        bwb bwbVar3 = new bwb(i6);
                                        cvbVar.o(bwbVar3.b, 0, i6, false);
                                        bwbVar3.Q(4);
                                        cvnVar = new cvn(cvnVarE.a, cvnVarE.b, cvnVarE.c, cvnVarE.d, cvnVarE.e, cvnVarE.g, cvnVarE.h, cvnVarE.j, cvnVarE.k, cvnVarE.d(new bsx(agke.q(cxv.d(bwbVar3)))));
                                    } else {
                                        cvbVar.p(i6, false);
                                    }
                                    cvnVarE = cvnVar;
                                }
                            }
                            int i7 = bwp.a;
                            this.g = cvnVarE;
                            if (zU) {
                                cvnVarE.getClass();
                                this.h = Math.max(cvnVarE.c, 6);
                                bse bseVarC = this.g.c(this.a, this.f);
                                cwj cwjVar = this.d;
                                bsd bsdVar = new bsd(bseVarC);
                                bsdVar.a("audio/flac");
                                cwjVar.b(new bse(bsdVar));
                                cwj cwjVar2 = this.d;
                                this.g.a();
                                cwjVar2.f();
                                this.e = 4;
                            } else {
                                i3 = 3;
                                bArr = null;
                                i4 = 7;
                            }
                        }
                    } else {
                        if (i2 != 4) {
                            this.d.getClass();
                            cvn cvnVar2 = this.g;
                            cvnVar2.getClass();
                            cuy cuyVar = this.l;
                            if (cuyVar != null && cuyVar.b()) {
                                return cuyVar.f(cvjVar, qhaVar);
                            }
                            if (this.k == -1) {
                                cvjVar.k();
                                cvb cvbVar2 = (cvb) cvjVar;
                                cvbVar2.m(1, false);
                                byte[] bArr3 = new byte[1];
                                cvbVar2.n(bArr3, 0, 1, false);
                                int i8 = bArr3[0] & 1;
                                boolean z2 = 1 == i8;
                                cvbVar2.m(2, false);
                                i4 = 1 != i8 ? 6 : 7;
                                bwb bwbVar4 = new bwb(i4);
                                bwbVar4.O(azz.f(cvjVar, bwbVar4.b, 0, i4));
                                cvjVar.k();
                                qha qhaVar2 = new qha();
                                if (!bbm.j(bwbVar4, cvnVar2, z2, qhaVar2)) {
                                    throw new bsz(null, null, true, 1);
                                }
                                this.k = qhaVar2.a;
                                return 0;
                            }
                            bwb bwbVar5 = this.b;
                            int i9 = bwbVar5.d;
                            if (i9 < 32768) {
                                int iA = cvjVar.a(bwbVar5.b, i9, 32768 - i9);
                                z = iA == -1;
                                if (!z) {
                                    bwbVar5.O(i9 + iA);
                                } else if (bwbVar5.d() == 0) {
                                    i();
                                    return -1;
                                }
                            } else {
                                z = false;
                            }
                            int i10 = bwbVar5.c;
                            int i11 = this.j;
                            int i12 = this.h;
                            if (i11 < i12) {
                                bwbVar5.Q(Math.min(i12 - i11, bwbVar5.d()));
                            }
                            long jH = h(bwbVar5, z);
                            int i13 = bwbVar5.c - i10;
                            bwbVar5.P(i10);
                            this.d.c(bwbVar5, i13);
                            this.j += i13;
                            if (jH != -1) {
                                i();
                                this.j = 0;
                                this.k = jH;
                            }
                            int length = bwbVar5.b.length - bwbVar5.d;
                            if (bwbVar5.d() >= 16 || length >= 16) {
                                return 0;
                            }
                            int iD = bwbVar5.d();
                            byte[] bArr4 = bwbVar5.b;
                            System.arraycopy(bArr4, bwbVar5.c, bArr4, 0, iD);
                            bwbVar5.P(0);
                            bwbVar5.O(iD);
                            return 0;
                        }
                        cvjVar.k();
                        bwb bwbVar6 = new bwb(2);
                        cvb cvbVar3 = (cvb) cvjVar;
                        cvbVar3.n(bwbVar6.b, 0, 2, false);
                        int iS = bwbVar6.s();
                        if ((iS >> 2) != 16382) {
                            cvjVar.k();
                            throw new bsz("First frame does not start with sync code.", null, true, 1);
                        }
                        cvjVar.k();
                        this.i = iS;
                        cvk cvkVar = this.c;
                        int i14 = bwp.a;
                        long j2 = cvbVar3.b;
                        long j3 = cvbVar3.a;
                        final cvn cvnVar3 = this.g;
                        cvnVar3.getClass();
                        eol eolVar = cvnVar3.k;
                        if (eolVar != null && ((long[]) eolVar.b).length > 0) {
                            cvyVar = new cvm(cvnVar3, j2);
                        } else if (j3 != -1) {
                            long j4 = cvnVar3.j;
                            if (j4 > 0) {
                                int i15 = this.i;
                                cvnVar3.getClass();
                                cuv cuvVar = new cuv() { // from class: cwy
                                    @Override // defpackage.cuv
                                    public final long a(long j5) {
                                        return cvnVar3.b(j5);
                                    }
                                };
                                cwz cwzVar = new cwz(cvnVar3, i15);
                                int i16 = cvnVar3.d;
                                long jA = cvnVar3.a();
                                if (i16 > 0) {
                                    j = ((((long) i16) + ((long) cvnVar3.c)) / 2) + 1;
                                } else {
                                    int i17 = cvnVar3.a;
                                    long j5 = 4096;
                                    if (i17 == cvnVar3.b && i17 > 0) {
                                        j5 = i17;
                                    }
                                    j = 64 + (((j5 * ((long) cvnVar3.g)) * ((long) cvnVar3.h)) / 8);
                                }
                                cuy cuyVar2 = new cuy(cuvVar, cwzVar, jA, j4, j2, j3, j, Math.max(6, cvnVar3.c));
                                this.l = cuyVar2;
                                cvyVar = cuyVar2.a;
                            } else {
                                cvyVar = new cvy(cvnVar3.a(), 0L);
                            }
                        } else {
                            cvyVar = new cvy(cvnVar3.a(), 0L);
                        }
                        cvkVar.z(cvyVar);
                        this.e = 5;
                    }
                } else {
                    bwb bwbVar7 = new bwb(4);
                    ((cvb) cvjVar).o(bwbVar7.b, 0, 4, false);
                    if (bwbVar7.w() != 1716281667) {
                        throw new bsz("Failed to read FLAC stream marker.", null, true, 1);
                    }
                    this.e = 3;
                }
                return 0;
            }
            i = 0;
            ((cvb) cvjVar).n(this.a, 0, 42, false);
            cvjVar.k();
            this.e = 2;
        }
        return i;
    }

    @Override // defpackage.cvi
    public final void c() {
    }

    @Override // defpackage.cvi
    public final /* synthetic */ void f() {
    }
}
