package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dar implements cvi {
    private cvk a;
    private dax b;
    private boolean c;

    private final boolean h(cvj cvjVar) {
        dat datVar = new dat();
        if (datVar.b(cvjVar, true) && (datVar.a & 2) == 2) {
            int iMin = Math.min(datVar.e, 8);
            bwb bwbVar = new bwb(iMin);
            ((cvb) cvjVar).n(bwbVar.b, 0, iMin, false);
            bwbVar.P(0);
            if (bwbVar.d() >= 5 && bwbVar.n() == 127 && bwbVar.w() == 1179402563) {
                this.b = new daq();
                return true;
            }
            bwbVar.P(0);
            try {
                if (aua.f(1, bwbVar, true)) {
                    this.b = new day();
                    return true;
                }
            } catch (bsz unused) {
            }
            bwbVar.P(0);
            if (dav.d(bwbVar, dav.a)) {
                this.b = new dav();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cvi
    public final /* synthetic */ List a() {
        return agpi.a;
    }

    @Override // defpackage.cvi
    public final void b(cvk cvkVar) {
        this.a = cvkVar;
    }

    @Override // defpackage.cvi
    public final void d(long j, long j2) {
        dax daxVar = this.b;
        if (daxVar != null) {
            das dasVar = daxVar.b;
            dasVar.a.a();
            dasVar.b.L(0);
            dasVar.c = -1;
            dasVar.d = false;
            dasVar.e = false;
            dasVar.f = -1L;
            if (j == 0) {
                daxVar.b(!daxVar.n);
                return;
            }
            if (daxVar.k != 0) {
                daxVar.f = daxVar.g(j2);
                dau dauVar = daxVar.e;
                int i = bwp.a;
                dauVar.c(daxVar.f);
                daxVar.k = 2;
            }
        }
    }

    @Override // defpackage.cvi
    public final boolean e(cvj cvjVar) {
        try {
            return h(cvjVar);
        } catch (bsz unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x022f A[EDGE_INSN: B:120:0x022f->B:91:0x01ac BREAK  A[LOOP:1: B:94:0x01af->B:101:0x01cf]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0100  */
    /* JADX WARN: Code duplicated, block: B:76:0x0135  */
    /* JADX WARN: Type inference failed for: r2v7, types: [dau, java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // defpackage.cvi
    public final int g(cvj cvjVar, qha qhaVar) throws bsz {
        int i;
        boolean z;
        byte[] bArr;
        long j;
        byte[] bArrE;
        this.a.getClass();
        boolean z2 = true;
        if (this.b == null) {
            if (!h(cvjVar)) {
                throw new bsz("Failed to determine bitstream type", null, true, 1);
            }
            cvjVar.k();
        }
        if (!this.c) {
            cwj cwjVarS = this.a.s(0, 1);
            this.a.t();
            dax daxVar = this.b;
            daxVar.d = this.a;
            daxVar.c = cwjVarS;
            daxVar.b(true);
            this.c = true;
        }
        dax daxVar2 = this.b;
        daxVar2.c.getClass();
        int i2 = bwp.a;
        int i3 = daxVar2.k;
        if (i3 == 0) {
            i = 0;
            while (true) {
                das dasVar = daxVar2.b;
                if (!dasVar.a(cvjVar)) {
                    daxVar2.k = 3;
                    return -1;
                }
                cvb cvbVar = (cvb) cvjVar;
                long j2 = cvbVar.b;
                long j3 = daxVar2.g;
                daxVar2.m = j2 - j3;
                bwb bwbVar = dasVar.b;
                if (!daxVar2.c(bwbVar, j3, daxVar2.p)) {
                    bse bseVar = (bse) daxVar2.p.a;
                    daxVar2.l = bseVar.K;
                    if (daxVar2.o) {
                        z = true;
                    } else {
                        daxVar2.c.b(bseVar);
                        z = true;
                        daxVar2.o = true;
                    }
                    ?? r2 = daxVar2.p.b;
                    if (r2 == 0) {
                        long j4 = cvbVar.a;
                        if (j4 == -1) {
                            daxVar2.e = new daw();
                        } else {
                            dat datVar = dasVar.a;
                            daxVar2.e = new dao(daxVar2, daxVar2.g, j4, datVar.d + datVar.e, datVar.b, (datVar.a & 4) != 0 ? z : false);
                        }
                        daxVar2.k = 2;
                        bArr = bwbVar.b;
                        if (bArr.length != 65025) {
                            break;
                        }
                        bwbVar.N(Arrays.copyOf(bArr, Math.max(65025, bwbVar.d)), bwbVar.d);
                        break;
                    }
                    daxVar2.e = r2;
                    daxVar2.k = 2;
                    bArr = bwbVar.b;
                    if (bArr.length != 65025) {
                        break;
                    }
                    bwbVar.N(Arrays.copyOf(bArr, Math.max(65025, bwbVar.d)), bwbVar.d);
                    break;
                }
                daxVar2.g = cvbVar.b;
            }
            return i;
        }
        if (i3 == 1) {
            i = 0;
            ((cvb) cvjVar).p((int) daxVar2.g, false);
            daxVar2.k = 2;
            return i;
        }
        if (i3 == 2) {
            long jA = daxVar2.e.a(cvjVar);
            if (jA >= 0) {
                qhaVar.a = jA;
                return 1;
            }
            if (jA < -1) {
                daxVar2.h(-(jA + 2));
            }
            if (!daxVar2.n) {
                cvz cvzVarB = daxVar2.e.b();
                cvzVarB.getClass();
                daxVar2.d.z(cvzVarB);
                cwj cwjVar = daxVar2.c;
                cvzVarB.a();
                cwjVar.f();
                daxVar2.n = true;
            }
            if (daxVar2.m > 0 || daxVar2.b.a(cvjVar)) {
                daxVar2.m = 0L;
                das dasVar2 = daxVar2.b;
                long j5 = dasVar2.f;
                if (j5 > daxVar2.h) {
                    daxVar2.h = j5;
                    daxVar2.i = j5;
                    daxVar2.j = 0L;
                }
                bwb bwbVar2 = dasVar2.b;
                long jA2 = daxVar2.a(bwbVar2);
                dat datVar2 = dasVar2.a;
                if (!dasVar2.d) {
                    z2 = false;
                    break;
                }
                int i4 = dasVar2.c;
                if (i4 != -1) {
                    boolean z3 = false;
                    while (true) {
                        if (i4 >= datVar2.c) {
                            z2 = true;
                            break;
                        }
                        int i5 = datVar2.f[i4];
                        z3 = (!(i5 > 0 ? false : z2)) | z3;
                        if (i5 < 255 && z3) {
                            z2 = false;
                            break;
                        }
                        i4++;
                        z2 = true;
                    }
                }
                if (!z2 || jA2 < 0) {
                    j = 0;
                } else {
                    int i6 = datVar2.a;
                    if ((i6 & 1) == 0 || (i6 & 4) != 0) {
                        j = 0;
                    } else {
                        long j6 = datVar2.b - jA2;
                        j = 0;
                        if (j6 > daxVar2.h) {
                            daxVar2.h = j6;
                        }
                    }
                }
                if (jA2 >= j) {
                    long j7 = daxVar2.h;
                    if (j7 + jA2 >= daxVar2.f) {
                        long jF = daxVar2.f(j7);
                        if ((datVar2.a & 4) == 0 || !z2) {
                            bArrE = null;
                        } else {
                            long j8 = datVar2.b;
                            if (j8 >= j) {
                                long j9 = j8 - daxVar2.i;
                                long j10 = daxVar2.j + jA2;
                                if (j9 >= j) {
                                    long j11 = j10 - j9;
                                    if (j11 > j) {
                                        bArrE = daxVar2.e(j11);
                                    } else {
                                        bArrE = null;
                                    }
                                } else {
                                    bArrE = null;
                                }
                            } else {
                                bArrE = null;
                            }
                        }
                        if (bArrE != null) {
                            int i7 = bwbVar2.d;
                            daxVar2.c.d(new bwb(ahng.R(i7)), 4, 2);
                            daxVar2.c.c(bwbVar2, i7);
                            cwj cwjVar2 = daxVar2.c;
                            bwb bwbVar3 = new bwb(bArrE);
                            int length = bArrE.length;
                            cwjVar2.d(bwbVar3, length, 2);
                            daxVar2.c.e(jF, 268435457, i7 + 4 + length, 0, null);
                        } else {
                            daxVar2.c.c(bwbVar2, bwbVar2.d);
                            daxVar2.c.e(jF, 1, bwbVar2.d, 0, null);
                        }
                        daxVar2.f = -1L;
                    }
                    daxVar2.j += jA2;
                }
                daxVar2.h += jA2;
                if (!z2) {
                    return 0;
                }
                long j12 = datVar2.b;
                if (j12 < j) {
                    return 0;
                }
                daxVar2.i = j12;
                daxVar2.j = j;
                return 0;
            }
            daxVar2.k = 3;
        }
        return -1;
    }

    @Override // defpackage.cvi
    public final void c() {
    }

    @Override // defpackage.cvi
    public final /* synthetic */ void f() {
    }
}
