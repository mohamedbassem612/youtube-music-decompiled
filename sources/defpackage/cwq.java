package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cwq implements cvi {
    public cwt[] a;
    private final bwb b;
    private final cwp c;
    private final boolean d;
    private final dbl e;
    private int f;
    private cvk g;
    private cwr h;
    private long i;
    private long j;
    private cwt k;
    private int l;
    private long m;
    private long n;
    private int o;
    private boolean p;

    public cwq(int i, dbl dblVar) {
        this.e = dblVar;
        this.d = 1 == (i ^ 1);
        this.b = new bwb(12);
        this.c = new cwp();
        this.g = new cvw(0);
        this.a = new cwt[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.i = -9223372036854775807L;
    }

    private final cwt h(int i) {
        cwt[] cwtVarArr = this.a;
        int length = cwtVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            cwt cwtVar = cwtVarArr[i2];
            if (cwtVar.c == i || cwtVar.d == i) {
                return cwtVar;
            }
        }
        return null;
    }

    @Override // defpackage.cvi
    public final /* synthetic */ List a() {
        return agpi.a;
    }

    @Override // defpackage.cvi
    public final void b(cvk cvkVar) {
        this.f = 0;
        if (this.d) {
            cvkVar = new dbo(cvkVar, this.e);
        }
        this.g = cvkVar;
        this.j = -1L;
    }

    @Override // defpackage.cvi
    public final void d(long j, long j2) {
        this.j = -1L;
        this.k = null;
        for (cwt cwtVar : this.a) {
            if (cwtVar.k == 0) {
                cwtVar.i = 0;
            } else {
                cwtVar.i = cwtVar.n[bwp.an(cwtVar.m, j, true)];
            }
        }
        if (j == 0) {
            this.f = this.a.length != 0 ? 3 : 0;
        } else {
            this.f = 6;
        }
    }

    @Override // defpackage.cvi
    public final boolean e(cvj cvjVar) {
        bwb bwbVar = this.b;
        ((cvb) cvjVar).n(bwbVar.b, 0, 12, false);
        bwbVar.P(0);
        if (bwbVar.j() != 1179011410) {
            return false;
        }
        bwbVar.Q(4);
        return bwbVar.j() == 541677121;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x035b  */
    @Override // defpackage.cvi
    public final int g(cvj cvjVar, qha qhaVar) throws bsz {
        boolean z;
        cwt cwtVar;
        long j;
        long j2;
        int i;
        long j3 = this.j;
        if (j3 != -1) {
            cvb cvbVar = (cvb) cvjVar;
            long j4 = cvbVar.b;
            if (j3 < j4 || j3 > 262144 + j4) {
                qhaVar.a = j3;
                z = true;
            } else {
                cvbVar.p((int) (j3 - j4), false);
                z = false;
            }
        } else {
            z = false;
        }
        this.j = -1L;
        if (z) {
            return 1;
        }
        int i2 = this.f;
        if (i2 == 0) {
            if (!e(cvjVar)) {
                throw new bsz("AVI Header List not found", null, true, 1);
            }
            ((cvb) cvjVar).p(12, false);
            this.f = 1;
            return 0;
        }
        if (i2 == 1) {
            bwb bwbVar = this.b;
            ((cvb) cvjVar).o(bwbVar.b, 0, 12, false);
            bwbVar.P(0);
            cwp cwpVar = this.c;
            cwpVar.a(bwbVar);
            int i3 = cwpVar.a;
            if (i3 != 1414744396) {
                throw new bsz(a.bR(i3, "LIST expected, found: "), null, true, 1);
            }
            int iJ = bwbVar.j();
            if (iJ != 1819436136) {
                throw new bsz(a.bR(iJ, "hdrl expected, found: "), null, true, 1);
            }
            this.l = cwpVar.b;
            this.f = 2;
        } else if (i2 == 2) {
            int i4 = 2;
            int i5 = this.l - 4;
            bwb bwbVar2 = new bwb(i5);
            ((cvb) cvjVar).o(bwbVar2.b, 0, i5, false);
            cwu cwuVarC = cwu.c(1819436136, bwbVar2);
            int i6 = cwuVarC.b;
            if (i6 != 1819436136) {
                throw new bsz(a.bR(i6, "Unexpected header list type "), null, true, 1);
            }
            cwr cwrVar = (cwr) cwuVarC.b(cwr.class);
            if (cwrVar == null) {
                throw new bsz("AviHeader not found", null, true, 1);
            }
            this.h = cwrVar;
            this.i = ((long) cwrVar.c) * ((long) cwrVar.a);
            ArrayList arrayList = new ArrayList();
            agke agkeVar = cwuVarC.a;
            int i7 = ((agpi) agkeVar).d;
            int i8 = 0;
            int i9 = 0;
            while (i8 < i7) {
                cwn cwnVar = (cwn) agkeVar.get(i8);
                if (cwnVar.a() == 1819440243) {
                    cwu cwuVar = (cwu) cwnVar;
                    int i10 = i9 + 1;
                    cws cwsVar = (cws) cwuVar.b(cws.class);
                    cwv cwvVar = (cwv) cwuVar.b(cwv.class);
                    if (cwsVar == null) {
                        bvx.e("AviExtractor", "Missing Stream Header");
                    } else if (cwvVar == null) {
                        bvx.e("AviExtractor", "Missing Stream Format");
                    } else {
                        long jC = cwsVar.c();
                        bse bseVar = cwvVar.a;
                        bsd bsdVar = new bsd(bseVar);
                        bsdVar.c(i9);
                        int i11 = cwsVar.e;
                        if (i11 != 0) {
                            bsdVar.p = i11;
                        }
                        cww cwwVar = (cww) cwuVar.b(cww.class);
                        if (cwwVar != null) {
                            bsdVar.b = cwwVar.a;
                        }
                        int iB = bsy.b(bseVar.q);
                        if (iB != 1) {
                            if (iB == i4) {
                                iB = 2;
                            }
                            if (cwtVar != null) {
                                arrayList.add(cwtVar);
                            }
                            i9 = i10;
                        }
                        cwj cwjVarS = this.g.s(i9, iB);
                        bse bseVar2 = new bse(bsdVar);
                        cwjVarS.b(bseVar2);
                        cwjVarS.f();
                        this.i = Math.max(this.i, jC);
                        cwtVar = new cwt(i9, cwsVar, cwjVarS, bsy.h(bseVar2.q, bseVar2.l));
                        if (cwtVar != null) {
                            arrayList.add(cwtVar);
                        }
                        i9 = i10;
                    }
                    cwtVar = null;
                    if (cwtVar != null) {
                        arrayList.add(cwtVar);
                    }
                    i9 = i10;
                }
                i8++;
                i4 = 2;
            }
            this.a = (cwt[]) arrayList.toArray(new cwt[0]);
            this.g.t();
            this.f = 3;
        } else if (i2 == 3) {
            long j5 = this.m;
            if (j5 == -1 || ((cvb) cvjVar).b == j5) {
                bwb bwbVar3 = this.b;
                cvb cvbVar2 = (cvb) cvjVar;
                cvbVar2.n(bwbVar3.b, 0, 12, false);
                cvjVar.k();
                bwbVar3.P(0);
                cwp cwpVar2 = this.c;
                cwpVar2.a(bwbVar3);
                int iJ2 = bwbVar3.j();
                int i12 = cwpVar2.a;
                if (i12 == 1179011410) {
                    cvbVar2.p(12, false);
                } else {
                    if (i12 == 1414744396 && iJ2 == 1769369453) {
                        long j6 = cvbVar2.b;
                        this.m = j6;
                        j = j6 + ((long) cwpVar2.b) + 8;
                        this.n = j;
                        if (!this.p) {
                            cwr cwrVar2 = this.h;
                            cwrVar2.getClass();
                            if ((cwrVar2.b & 16) != 16) {
                                this.g.z(new cvy(this.i, 0L));
                                this.p = true;
                            } else {
                                this.f = 4;
                            }
                        }
                        this.j = cvbVar2.b + 12;
                        this.f = 6;
                    } else {
                        j = cvbVar2.b + ((long) cwpVar2.b) + 8;
                    }
                    this.j = j;
                }
            } else {
                this.j = j5;
            }
        } else if (i2 == 4) {
            bwb bwbVar4 = this.b;
            cvb cvbVar3 = (cvb) cvjVar;
            cvbVar3.o(bwbVar4.b, 0, 8, false);
            bwbVar4.P(0);
            int iJ3 = bwbVar4.j();
            int iJ4 = bwbVar4.j();
            if (iJ3 == 829973609) {
                this.f = 5;
                this.o = iJ4;
            } else {
                this.j = cvbVar3.b + ((long) iJ4);
            }
        } else {
            if (i2 != 5) {
                cvb cvbVar4 = (cvb) cvjVar;
                long j7 = cvbVar4.b;
                if (j7 >= this.n) {
                    return -1;
                }
                cwt cwtVar2 = this.k;
                if (cwtVar2 != null) {
                    int i13 = cwtVar2.h;
                    cwj cwjVar = cwtVar2.b;
                    int iA = i13 - cwjVar.a(cvjVar, i13, false);
                    cwtVar2.h = iA;
                    if (iA == 0) {
                        if (cwtVar2.g > 0) {
                            cwjVar.e(cwtVar2.a(cwtVar2.i), (cwtVar2.e || Arrays.binarySearch(cwtVar2.n, cwtVar2.i) >= 0) ? 1 : 0, cwtVar2.g, 0, null);
                        }
                        cwtVar2.i++;
                        this.k = null;
                    }
                } else {
                    if ((j7 & 1) == 1) {
                        cvbVar4.p(1, false);
                    }
                    bwb bwbVar5 = this.b;
                    cvbVar4.n(bwbVar5.b, 0, 12, false);
                    bwbVar5.P(0);
                    int iJ5 = bwbVar5.j();
                    if (iJ5 == 1414744396) {
                        bwbVar5.P(8);
                        cvbVar4.p(bwbVar5.j() != 1769369453 ? 8 : 12, false);
                        cvjVar.k();
                    } else {
                        int iJ6 = bwbVar5.j();
                        if (iJ5 == 1263424842) {
                            this.j = cvbVar4.b + ((long) iJ6) + 8;
                        } else {
                            cvbVar4.p(8, false);
                            cvjVar.k();
                            cwt cwtVarH = h(iJ5);
                            if (cwtVarH == null) {
                                this.j = cvbVar4.b + ((long) iJ6);
                            } else {
                                cwtVarH.g = iJ6;
                                cwtVarH.h = iJ6;
                                this.k = cwtVarH;
                            }
                        }
                    }
                }
                return 0;
            }
            bwb bwbVar6 = new bwb(this.o);
            ((cvb) cvjVar).o(bwbVar6.b, 0, this.o, false);
            if (bwbVar6.d() < 16) {
                j2 = 0;
            } else {
                int i14 = bwbVar6.c;
                bwbVar6.Q(8);
                long j8 = bwbVar6.j();
                long j9 = this.m;
                j2 = j8 > j9 ? 0L : j9 + 8;
                bwbVar6.P(i14);
            }
            while (bwbVar6.d() >= 16) {
                int iJ7 = bwbVar6.j();
                int iJ8 = bwbVar6.j();
                long j10 = ((long) bwbVar6.j()) + j2;
                bwbVar6.Q(4);
                cwt cwtVarH2 = h(iJ7);
                if (cwtVarH2 != null) {
                    int i15 = iJ8 & 16;
                    if (cwtVarH2.l == -1) {
                        cwtVarH2.l = j10;
                    }
                    if (i15 == 16 || cwtVarH2.e) {
                        if (cwtVarH2.k == cwtVarH2.n.length) {
                            long[] jArr = cwtVarH2.m;
                            cwtVarH2.m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                            int[] iArr = cwtVarH2.n;
                            cwtVarH2.n = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                        }
                        long[] jArr2 = cwtVarH2.m;
                        int i16 = cwtVarH2.k;
                        jArr2[i16] = j10;
                        cwtVarH2.n[i16] = cwtVarH2.j;
                        cwtVarH2.k = i16 + 1;
                    }
                    cwtVarH2.j++;
                }
            }
            for (cwt cwtVar3 : this.a) {
                cwtVar3.m = Arrays.copyOf(cwtVar3.m, cwtVar3.k);
                cwtVar3.n = Arrays.copyOf(cwtVar3.n, cwtVar3.k);
                if (cwtVar3.e && cwtVar3.a.f != 0 && (i = cwtVar3.k) > 0) {
                    cwtVar3.f = i;
                }
            }
            this.p = true;
            int length = this.a.length;
            cvk cvkVar = this.g;
            if (length == 0) {
                cvkVar.z(new cvy(this.i, 0L));
            } else {
                cvkVar.z(new cwo(this, this.i));
            }
            this.f = 6;
            this.j = this.m;
        }
        return 0;
    }

    @Override // defpackage.cvi
    public final void c() {
    }

    @Override // defpackage.cvi
    public final /* synthetic */ void f() {
    }
}
