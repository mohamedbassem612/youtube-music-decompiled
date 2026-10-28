package defpackage;

import app.rive.semantics.SemanticState;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cxh implements cvi {
    private cvk b;
    private cxo c;
    private cvj d;
    private cwe e;
    private dae f;
    private int h;
    private long i;
    private int j;
    private int l;
    private int n;
    private bwb o;
    private bwb p;
    private final bwb a = new bwb(16);
    private long k = -1;
    private long m = -1;
    private int g = 0;

    private final void h() {
        cvk cvkVar = this.b;
        cvkVar.getClass();
        cvkVar.t();
        this.b.z(new cvy(-9223372036854775807L, 0L));
        this.g = 5;
    }

    private final void i(long j) {
        long j2 = this.k;
        long j3 = this.l;
        cxo cxoVar = new cxo(0L, j2 - j3, j, j2, this.i - j3);
        this.c = cxoVar;
        cvk cvkVar = this.b;
        cvkVar.getClass();
        cwj cwjVarS = cvkVar.s(SemanticState.ReadOnly, 4);
        bsd bsdVar = new bsd();
        bsdVar.a("image/heic");
        bsdVar.l = new bsx(-9223372036854775807L, cxoVar);
        cwjVarS.b(new bse(bsdVar));
    }

    @Override // defpackage.cvi
    public final /* synthetic */ List a() {
        return agpi.a;
    }

    @Override // defpackage.cvi
    public final void b(cvk cvkVar) {
        this.b = cvkVar;
    }

    @Override // defpackage.cvi
    public final void c() {
        if (this.f != null) {
            this.f = null;
        }
    }

    @Override // defpackage.cvi
    public final void d(long j, long j2) {
        if (j != 0) {
            if (this.g == 3) {
                dae daeVar = this.f;
                daeVar.getClass();
                daeVar.d(j, j2);
                return;
            }
            return;
        }
        this.g = 0;
        this.j = 0;
        this.k = -1L;
        this.m = -1L;
        this.n = 0;
        this.o = null;
        this.p = null;
        if (this.f != null) {
            this.f = null;
        }
    }

    @Override // defpackage.cvi
    public final boolean e(cvj cvjVar) {
        return bcy.e(cvjVar, true);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x022f A[LOOP:3: B:97:0x01ed->B:120:0x022f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:178:0x0227 A[SYNTHETIC] */
    @Override // defpackage.cvi
    public final int g(cvj cvjVar, qha qhaVar) throws bsz {
        long j;
        int iS;
        long jX;
        long jX2;
        long j2;
        long jX3;
        String strS;
        while (true) {
            int i = this.g;
            int i2 = 3;
            int i3 = 8;
            int i4 = 2;
            int i5 = 1;
            if (i == 0) {
                if (this.j == 0) {
                    bwb bwbVar = this.a;
                    if (!cvjVar.o(bwbVar.b, 0, 8, true)) {
                        h();
                        return -1;
                    }
                    this.j = 8;
                    bwbVar.P(0);
                    this.i = bwbVar.w();
                    this.h = bwbVar.i();
                }
                long jX4 = this.i;
                if (jX4 == 1) {
                    bwb bwbVar2 = this.a;
                    ((cvb) cvjVar).o(bwbVar2.b, 8, 8, false);
                    this.j += 8;
                    jX4 = bwbVar2.x();
                    this.i = jX4;
                }
                int i6 = this.h;
                if (i6 == 1836086884) {
                    this.k = ((cvb) cvjVar).b;
                    this.l = this.j;
                    this.j = 0;
                    bwb bwbVar3 = this.o;
                    bwb bwbVar4 = this.p;
                    if (bwbVar3 != null && bwbVar4 != null) {
                        bwbVar3.P(0);
                        int i7 = bwbVar3.i();
                        int i8 = czv.a;
                        int iS2 = ((i7 >> 24) & 255) == 0 ? bwbVar3.s() : bwbVar3.q();
                        int i9 = 0;
                        while (true) {
                            if (i9 < iS2 && bwbVar3.d() >= i3) {
                                int i10 = bwbVar3.c;
                                int i11 = bwbVar3.i();
                                if (i11 >= i3) {
                                    if (bwbVar3.i() == 1768842853) {
                                        int i12 = (bwbVar3.i() >> 24) & 255;
                                        iS = i12 < i2 ? bwbVar3.s() : bwbVar3.i();
                                        if (i12 >= 2) {
                                            bwbVar3.Q(2);
                                            int i13 = bwbVar3.i();
                                            bwbVar3.S();
                                            if (i13 == 1835625829 && (strS = bwbVar3.S()) != null && strS.equals("application/rdf+xml")) {
                                                break;
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                    bwbVar3.P(i10 + i11);
                                    i9++;
                                    i2 = 3;
                                    i3 = 8;
                                }
                            }
                            iS = -1;
                            break;
                        }
                        if (iS != -1) {
                            bwbVar4.P(0);
                            int i14 = bwbVar4.i() >> 24;
                            int iN = bwbVar4.n();
                            int i15 = iN >> 4;
                            int i16 = iN & 15;
                            int iN2 = bwbVar4.n();
                            int i17 = iN2 >> 4;
                            int i18 = iN2 & 15;
                            int i19 = i14 & 255;
                            int iS3 = i19 < 2 ? bwbVar4.s() : bwbVar4.i();
                            int i20 = 0;
                            while (i20 < iS3) {
                                int iS4 = i19 < i4 ? bwbVar4.s() : bwbVar4.i();
                                if (i19 == i5 || i19 == i4) {
                                    bwbVar4.Q(i4);
                                }
                                bwbVar4.Q(i4);
                                if (i17 == 4) {
                                    jX = bwbVar4.w();
                                } else {
                                    jX = i17 == 8 ? bwbVar4.x() : 0L;
                                }
                                int iS5 = bwbVar4.s();
                                int i21 = 0;
                                while (i21 < iS5) {
                                    if ((i19 == i5 || i19 == 2) && i18 > 0) {
                                        bwbVar4.Q(i18);
                                    }
                                    int i22 = 4;
                                    if (i15 == 4) {
                                        jX2 = bwbVar4.w();
                                    } else {
                                        jX2 = i15 == 8 ? bwbVar4.x() : 0L;
                                        i22 = 4;
                                    }
                                    if (i16 == i22) {
                                        jX3 = bwbVar4.w();
                                    } else {
                                        if (i16 == 8) {
                                            jX3 = bwbVar4.x();
                                        } else {
                                            j2 = 0;
                                        }
                                        if (iS4 == iS) {
                                            this.m = jX + jX2;
                                            this.n = (int) j2;
                                            break;
                                        }
                                        i21++;
                                        iS5 = iS5;
                                        i5 = 1;
                                    }
                                    j2 = jX3;
                                    if (iS4 == iS) {
                                        this.m = jX + jX2;
                                        this.n = (int) j2;
                                        break;
                                    }
                                    i21++;
                                    iS5 = iS5;
                                    i5 = 1;
                                }
                                if (iS4 == iS) {
                                    break;
                                }
                                i20++;
                                i4 = 2;
                                i5 = 1;
                            }
                        }
                    }
                    if (this.m != -1) {
                        this.g = 4;
                    } else {
                        i(-9223372036854775807L);
                        this.g = 2;
                    }
                } else if (i6 == 1835365473) {
                    ((cvb) cvjVar).p(4, false);
                    this.j = 0;
                    this.g = 0;
                } else if (i6 == 1768517222) {
                    int i23 = (int) (jX4 - ((long) this.j));
                    bwb bwbVar5 = new bwb(i23);
                    this.o = bwbVar5;
                    ((cvb) cvjVar).o(bwbVar5.b, 0, i23, false);
                    this.j = 0;
                    this.g = 0;
                } else if (i6 == 1768714083) {
                    int i24 = (int) (jX4 - ((long) this.j));
                    bwb bwbVar6 = new bwb(i24);
                    this.p = bwbVar6;
                    ((cvb) cvjVar).o(bwbVar6.b, 0, i24, false);
                    this.j = 0;
                    this.g = 0;
                } else {
                    this.g = 1;
                }
            } else if (i == 1) {
                ((cvb) cvjVar).p((int) (this.i - ((long) this.j)), false);
                this.j = 0;
                this.g = 0;
            } else {
                if (i != 2) {
                    if (i == 3) {
                        if (this.e == null || cvjVar != this.d) {
                            this.d = cvjVar;
                            this.e = new cwe(cvjVar, this.k);
                        }
                        dae daeVar = this.f;
                        daeVar.getClass();
                        int iG = daeVar.g(this.e, qhaVar);
                        if (iG != 1) {
                            return iG;
                        }
                        qhaVar.a += this.k;
                    } else {
                        if (i != 4) {
                            return -1;
                        }
                        cvb cvbVar = (cvb) cvjVar;
                        long j3 = cvbVar.b;
                        long j4 = this.m;
                        if (j3 == j4) {
                            bwb bwbVar7 = new bwb(this.n);
                            cvbVar.o(bwbVar7.b, 0, this.n, false);
                            try {
                                axmq axmqVarA = cwl.a(bwbVar7.C(this.n));
                                j = axmqVarA != null ? axmqVarA.a : -9223372036854775807L;
                            } catch (IOException unused) {
                            }
                            i(j);
                            qhaVar.a = this.k;
                            this.g = 2;
                        } else {
                            qhaVar.a = j4;
                        }
                    }
                    return 1;
                }
                if (this.f == null) {
                    this.f = new dae(dbl.a, 8);
                }
                cwe cweVar = new cwe(cvjVar, this.k);
                this.e = cweVar;
                if (this.f.e(cweVar)) {
                    dae daeVar2 = this.f;
                    long j5 = this.k;
                    cvk cvkVar = this.b;
                    cvkVar.getClass();
                    daeVar2.b(new cwg(j5, cvkVar));
                    this.g = 3;
                } else {
                    h();
                }
            }
        }
    }

    @Override // defpackage.cvi
    public final /* synthetic */ void f() {
    }
}
