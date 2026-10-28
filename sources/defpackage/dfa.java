package defpackage;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dfa implements cvi {
    private cvk a;
    private cwj b;
    private dey e;
    private int c = 0;
    private long d = -1;
    private int f = -1;
    private long g = -1;

    @Override // defpackage.cvi
    public final /* synthetic */ List a() {
        return agpi.a;
    }

    @Override // defpackage.cvi
    public final void b(cvk cvkVar) {
        this.a = cvkVar;
        this.b = cvkVar.s(0, 1);
        cvkVar.t();
    }

    @Override // defpackage.cvi
    public final void d(long j, long j2) {
        this.c = j == 0 ? 0 : 4;
        dey deyVar = this.e;
        if (deyVar != null) {
            deyVar.b(j2);
        }
    }

    @Override // defpackage.cvi
    public final boolean e(cvj cvjVar) {
        return dfc.a(cvjVar);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:57:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:59:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:60:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:62:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:65:0x01f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:68:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:69:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:70:0x0203  */
    /* JADX WARN: Code duplicated, block: B:73:0x020b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0224  */
    /* JADX WARN: Type inference failed for: r10v4, types: [boolean, int] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // defpackage.cvi
    public final int g(cvj cvjVar, qha qhaVar) throws bsz {
        byte[] bArr;
        int i;
        byte[] bArr2;
        dfb dfbVar;
        int i2;
        int i3;
        int iP;
        int i4;
        this.b.getClass();
        int i5 = bwp.a;
        int i6 = this.c;
        int i7 = 0;
        if (i6 != 0) {
            long jT = -1;
            if (i6 == 1) {
                byte[] bArr3 = dfc.a;
                bwb bwbVar = new bwb(8);
                yvt yvtVarB = yvt.b(cvjVar, bwbVar);
                if (yvtVarB.b != 1685272116) {
                    cvjVar.k();
                } else {
                    cvb cvbVar = (cvb) cvjVar;
                    cvbVar.m(8, false);
                    bwbVar.P(0);
                    cvbVar.n(bwbVar.b, 0, 8, false);
                    jT = bwbVar.t();
                    cvbVar.p(((int) yvtVarB.a) + 8, false);
                }
                this.d = jT;
                this.c = 2;
            } else if (i6 == 2) {
                byte[] bArr4 = dfc.a;
                bwb bwbVar2 = new bwb(16);
                long j = dfc.b(1718449184, cvjVar, bwbVar2).a;
                ahno.O(((j > 16L ? 1 : (j == 16L ? 0 : -1)) ^ (-1)) >>> 31);
                cvb cvbVar2 = (cvb) cvjVar;
                cvbVar2.n(bwbVar2.b, 0, 16, false);
                bwbVar2.P(0);
                int iL = bwbVar2.l();
                int iL2 = bwbVar2.l();
                int iK = bwbVar2.k();
                bwbVar2.k();
                int iL3 = bwbVar2.l();
                int iL4 = bwbVar2.l();
                int i8 = ((int) j) - 16;
                if (i8 > 0) {
                    bArr = new byte[i8];
                    cvbVar2.n(bArr, 0, i8, false);
                    if (iL == 65534) {
                        if (i8 == 24) {
                            bwb bwbVar3 = new bwb(bArr);
                            bwbVar3.l();
                            int iL5 = bwbVar3.l();
                            if (iL5 != 0 && iL5 != iL4) {
                                throw new bsz("validBits ( " + iL5 + ")  != bitsPerSample( " + iL4 + ") are not supported", null, false, 1);
                            }
                            int iK2 = bwbVar3.k();
                            if (!aty.l(iK2, iL2)) {
                                throw new bsz("Channel mask " + iK2 + " is invalid or does not match channel count " + iL2, null, false, 1);
                            }
                            int iL6 = bwbVar3.l();
                            byte[] bArr5 = new byte[14];
                            bwbVar3.K(bArr5, 0, 14);
                            if (!Arrays.equals(bArr5, dfc.a) && !Arrays.equals(bArr5, dfc.b)) {
                                throw new bsz("invalid wav format extension guid", null, false, 1);
                            }
                            i7 = iK2;
                            bArr2 = bArr;
                            i = iL6;
                        } else {
                            i = 65534;
                        }
                        cvbVar2.p((int) (cvjVar.e() - cvbVar2.b), false);
                        dfbVar = new dfb(i, iL2, iK, iL3, iL4, bArr2, i7);
                        i2 = dfbVar.a;
                        if (i2 == 17) {
                            this.e = new dex(this.a, this.b, dfbVar);
                        } else if (i2 == 6) {
                            this.e = new dez(this.a, this.b, dfbVar, "audio/g711-alaw", -1);
                        } else if (i2 == 7) {
                            this.e = new dez(this.a, this.b, dfbVar, "audio/g711-mlaw", -1);
                        } else {
                            i3 = dfbVar.e;
                            if (i2 == 1) {
                                iP = bwp.p(i3);
                                i4 = iP;
                            } else if (i2 == 3) {
                                iP = bwp.m(i3);
                                i4 = iP;
                            } else if (i2 != 65534) {
                                i4 = 0;
                            } else {
                                iP = bwp.p(i3);
                                i4 = iP;
                            }
                            if (i4 == 0) {
                                throw new bsz(a.bR(i2, "Unsupported WAV format type: "), null, false, 1);
                            }
                            this.e = new dez(this.a, this.b, dfbVar, "audio/raw", i4);
                        }
                        this.c = 3;
                    }
                    bArr2 = bArr;
                    cvbVar2.p((int) (cvjVar.e() - cvbVar2.b), false);
                    dfbVar = new dfb(i, iL2, iK, iL3, iL4, bArr2, i7);
                    i2 = dfbVar.a;
                    if (i2 == 17) {
                        this.e = new dex(this.a, this.b, dfbVar);
                    } else if (i2 == 6) {
                        this.e = new dez(this.a, this.b, dfbVar, "audio/g711-alaw", -1);
                    } else if (i2 == 7) {
                        this.e = new dez(this.a, this.b, dfbVar, "audio/g711-mlaw", -1);
                    } else {
                        i3 = dfbVar.e;
                        if (i2 == 1) {
                            iP = bwp.p(i3);
                            i4 = iP;
                        } else if (i2 == 3) {
                            iP = bwp.m(i3);
                            i4 = iP;
                        } else if (i2 != 65534) {
                            i4 = 0;
                        } else {
                            iP = bwp.p(i3);
                            i4 = iP;
                        }
                        if (i4 == 0) {
                            throw new bsz(a.bR(i2, "Unsupported WAV format type: "), null, false, 1);
                        }
                        this.e = new dez(this.a, this.b, dfbVar, "audio/raw", i4);
                    }
                    this.c = 3;
                } else {
                    bArr = bwp.e;
                }
                i = iL;
                bArr2 = bArr;
                cvbVar2.p((int) (cvjVar.e() - cvbVar2.b), false);
                dfbVar = new dfb(i, iL2, iK, iL3, iL4, bArr2, i7);
                i2 = dfbVar.a;
                if (i2 == 17) {
                    this.e = new dex(this.a, this.b, dfbVar);
                } else if (i2 == 6) {
                    this.e = new dez(this.a, this.b, dfbVar, "audio/g711-alaw", -1);
                } else if (i2 == 7) {
                    this.e = new dez(this.a, this.b, dfbVar, "audio/g711-mlaw", -1);
                } else {
                    i3 = dfbVar.e;
                    if (i2 == 1) {
                        iP = bwp.p(i3);
                        i4 = iP;
                    } else if (i2 == 3) {
                        iP = bwp.m(i3);
                        i4 = iP;
                    } else if (i2 != 65534) {
                        i4 = 0;
                    } else {
                        iP = bwp.p(i3);
                        i4 = iP;
                    }
                    if (i4 == 0) {
                        throw new bsz(a.bR(i2, "Unsupported WAV format type: "), null, false, 1);
                    }
                    this.e = new dez(this.a, this.b, dfbVar, "audio/raw", i4);
                }
                this.c = 3;
            } else if (i6 != 3) {
                ahno.O(this.g != -1);
                long j2 = this.g - ((cvb) cvjVar).b;
                dey deyVar = this.e;
                deyVar.getClass();
                if (deyVar.c(cvjVar, j2)) {
                    return -1;
                }
            } else {
                byte[] bArr6 = dfc.a;
                cvjVar.k();
                yvt yvtVarB2 = dfc.b(1684108385, cvjVar, new bwb(8));
                cvb cvbVar3 = (cvb) cvjVar;
                cvbVar3.p(8, false);
                Pair pairCreate = Pair.create(Long.valueOf(cvbVar3.b), Long.valueOf(yvtVarB2.a));
                this.f = ((Long) pairCreate.first).intValue();
                long jLongValue = ((Long) pairCreate.second).longValue();
                long j3 = this.d;
                if (j3 != -1 && jLongValue == 4294967295L) {
                    jLongValue = j3;
                }
                long j4 = ((long) this.f) + jLongValue;
                this.g = j4;
                long j5 = cvbVar3.a;
                if (j5 != -1 && j4 > j5) {
                    bvx.e("WavExtractor", a.cr(j5, j4, "Data exceeds input length: ", ", "));
                    this.g = j5;
                    j4 = j5;
                }
                dey deyVar2 = this.e;
                deyVar2.getClass();
                deyVar2.a(this.f, j4);
                this.c = 4;
            }
        } else {
            cvb cvbVar4 = (cvb) cvjVar;
            ahno.O(cvbVar4.b == 0);
            int i9 = this.f;
            if (i9 != -1) {
                cvbVar4.p(i9, false);
                this.c = 4;
            } else {
                if (!dfc.a(cvjVar)) {
                    throw new bsz("Unsupported or unrecognized wav file type.", null, true, 1);
                }
                cvbVar4.p((int) (cvjVar.e() - cvbVar4.b), false);
                this.c = 1;
            }
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
