package defpackage;

import app.rive.semantics.SemanticState;
import java.io.EOFException;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class czh implements cvi {
    public boolean a;
    private final int b;
    private final bwb c;
    private final cvu d;
    private final cvr e;
    private final cwj f;
    private cvk g;
    private cwj h;
    private cwj i;
    private int j;
    private bsx k;
    private bsx l;
    private long m;
    private long n;
    private long o;
    private long p;
    private int q;
    private czk r;
    private boolean s;
    private long t;
    private final zs u;

    public czh(int i) {
        this.b = (i & 2) != 0 ? i | 1 : i;
        this.c = new bwb(10);
        this.d = new cvu();
        this.e = new cvr();
        this.m = -9223372036854775807L;
        this.u = new zs((byte[]) null);
        cvf cvfVar = new cvf();
        this.f = cvfVar;
        this.i = cvfVar;
        this.p = -1L;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x020f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0226  */
    /* JADX WARN: Code duplicated, block: B:105:0x0230  */
    /* JADX WARN: Code duplicated, block: B:107:0x0234  */
    /* JADX WARN: Code duplicated, block: B:113:0x0266  */
    /* JADX WARN: Code duplicated, block: B:114:0x0269  */
    /* JADX WARN: Code duplicated, block: B:116:0x0277  */
    /* JADX WARN: Code duplicated, block: B:118:0x028a  */
    /* JADX WARN: Code duplicated, block: B:120:0x028e  */
    /* JADX WARN: Code duplicated, block: B:122:0x029a  */
    /* JADX WARN: Code duplicated, block: B:124:0x029e  */
    /* JADX WARN: Code duplicated, block: B:127:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:194:0x0462  */
    /* JADX WARN: Code duplicated, block: B:196:0x046b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:198:0x046d  */
    /* JADX WARN: Code duplicated, block: B:215:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    /* JADX WARN: Code duplicated, block: B:220:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:222:0x0501  */
    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0066  */
    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x0075 A[PHI: r14
      0x0075: PHI (r14v5 cvb) = (r14v3 cvb), (r14v3 cvb), (r14v3 cvb), (r14v3 cvb), (r14v11 cvb) binds: [B:117:0x0288, B:123:0x029c, B:126:0x02af, B:104:0x022e, B:31:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x015e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0168  */
    /* JADX WARN: Code duplicated, block: B:68:0x016d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0172  */
    /* JADX WARN: Code duplicated, block: B:72:0x0177  */
    /* JADX WARN: Code duplicated, block: B:75:0x017e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0185 A[LOOP:2: B:76:0x0183->B:77:0x0185, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x019a  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:99:0x01fc  */
    private final int h(cvj cvjVar) {
        int i;
        int iA;
        int i2;
        int i3;
        int i4;
        int i5;
        cvb cvbVar;
        int i6;
        int iQ;
        long jW;
        long[] jArr;
        int i7;
        int i8;
        czj czjVar;
        long j;
        cvu cvuVar;
        cvr cvrVar;
        long j2;
        boolean z;
        bsx bsxVar;
        long j3;
        long j4;
        long j5;
        long jK;
        long j6;
        long j7;
        int iL;
        czk czeVar;
        long j8;
        long jK2;
        long j9;
        long jMin;
        float fC;
        czi cziVarA;
        czi cziVarA2;
        int i9;
        long[] jArr2;
        int i10;
        czk czgVar;
        czk czkVarJ;
        cyk cykVar;
        char c;
        long jY;
        long jMax;
        int iN;
        if (this.j == 0) {
            try {
                n(cvjVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.r != null) {
            long j10 = this.o;
            if (j10 != 0) {
                cvb cvbVar2 = (cvb) cvjVar;
                long j11 = cvbVar2.b;
                if (j11 < j10) {
                    i = 0;
                    cvbVar2.p((int) (j10 - j11), false);
                }
            }
            if (this.q == 0) {
                iA = this.i.a(cvjVar, this.q, true);
                i2 = -1;
                if (iA != -1) {
                    i3 = this.q - iA;
                    this.q = i3;
                    if (i3 <= 0) {
                        cwj cwjVar = this.i;
                        long jI = i(this.n);
                        cvu cvuVar2 = this.d;
                        cwjVar.e(jI, 1, cvuVar2.c, 0, null);
                        this.n += (long) cvuVar2.g;
                        i2 = 0;
                        this.q = 0;
                    }
                }
                return i2;
            }
            cvjVar.k();
            if (m(cvjVar)) {
                return -1;
            }
            bwb bwbVar = this.c;
            bwbVar.P(i);
            i4 = bwbVar.i();
            if (!l(i4, this.j) && cvv.a(i4) != -1) {
                cvu cvuVar3 = this.d;
                cvuVar3.a(i4);
                if (this.m == -9223372036854775807L) {
                    this.m = this.r.h(((cvb) cvjVar).b);
                }
                int i11 = cvuVar3.c;
                this.q = i11;
                this.p = ((cvb) cvjVar).b + ((long) i11);
                czk czkVar = this.r;
                if (czkVar instanceof czf) {
                    czf czfVar = (czf) czkVar;
                    long jI2 = i(this.n + ((long) cvuVar3.g));
                    long j12 = this.p;
                    if (!czfVar.i(jI2)) {
                        czfVar.a.f(jI2, j12);
                    }
                    if (this.s && czfVar.i(this.t)) {
                        this.s = false;
                        this.i = this.h;
                    }
                }
                iA = this.i.a(cvjVar, this.q, true);
                i2 = -1;
                if (iA != -1) {
                    i3 = this.q - iA;
                    this.q = i3;
                    if (i3 <= 0) {
                        cwj cwjVar2 = this.i;
                        long jI3 = i(this.n);
                        cvu cvuVar4 = this.d;
                        cwjVar2.e(jI3, 1, cvuVar4.c, 0, null);
                        this.n += (long) cvuVar4.g;
                        i2 = 0;
                        this.q = 0;
                    }
                }
                return i2;
            }
            ((cvb) cvjVar).p(1, false);
            this.j = 0;
            return 0;
        }
        cvu cvuVar5 = this.d;
        bwb bwbVar2 = new bwb(cvuVar5.c);
        cvb cvbVar3 = (cvb) cvjVar;
        cvbVar3.n(bwbVar2.b, 0, cvuVar5.c, false);
        int i12 = 21;
        if ((cvuVar5.a & 1) != 0) {
            if (cvuVar5.e != 1) {
                i12 = 36;
            }
        } else if (cvuVar5.e == 1) {
            i12 = 13;
        }
        if (bwbVar2.d >= i12 + 4) {
            bwbVar2.P(i12);
            i5 = bwbVar2.i();
            if (i5 != 1483304551) {
                if (i5 == 1231971951) {
                    i5 = 1231971951;
                } else if (bwbVar2.d >= 40) {
                    bwbVar2.P(36);
                    if (bwbVar2.i() == 1447187017) {
                        i5 = 1447187017;
                    } else {
                        i5 = 0;
                    }
                } else {
                    i5 = 0;
                }
            }
        } else if (bwbVar2.d >= 40) {
            bwbVar2.P(36);
            if (bwbVar2.i() == 1447187017) {
                i5 = 1447187017;
            } else {
                i5 = 0;
            }
        } else {
            i5 = 0;
        }
        if (i5 == 1231971951) {
            cvbVar = cvbVar3;
            i6 = bwbVar2.i();
            if ((i6 & 1) != 0) {
                iQ = bwbVar2.q();
            } else {
                iQ = -1;
            }
            if ((i6 & 2) != 0) {
                jW = bwbVar2.w();
            } else {
                jW = -1;
            }
            if ((i6 & 4) == 4) {
                jArr2 = new long[100];
                i10 = 0;
                for (i9 = 100; i10 < i9; i9 = 100) {
                    long[] jArr3 = jArr2;
                    jArr3[i10] = bwbVar2.n();
                    i10++;
                    jArr2 = jArr3;
                }
                jArr = jArr2;
            } else {
                jArr = null;
            }
            if ((i6 & 8) != 0) {
                bwbVar2.Q(4);
            }
            if (bwbVar2.d() >= 24) {
                bwbVar2.Q(11);
                fC = bwbVar2.c();
                int iS = bwbVar2.s();
                int iS2 = bwbVar2.s();
                cziVarA = czi.a(iS);
                cziVarA2 = czi.a(iS2);
                if (fC > 0.0f && cziVarA == null && cziVarA2 == null) {
                    czjVar = null;
                } else {
                    czjVar = new czj(fC, cziVarA, cziVarA2);
                }
                bwbVar2.Q(2);
                int iP = bwbVar2.p();
                i8 = iP >> 12;
                i7 = iP & 4095;
            } else {
                i7 = -1;
                i8 = -1;
                czjVar = null;
            }
            j = iQ;
            cvuVar = new cvu(cvuVar5);
            cvrVar = this.e;
            if (!cvrVar.a() && i8 != -1) {
                cvrVar.a = i8;
                cvrVar.b = i7;
            }
            if (czjVar != null) {
                z = false;
                j2 = -9223372036854775807L;
                bsxVar = new bsx(-9223372036854775807L, czjVar);
            } else {
                j2 = -9223372036854775807L;
                z = false;
                bsxVar = null;
            }
            this.l = bsxVar;
            j3 = cvbVar.b;
            cvbVar.p(cvuVar5.c, z);
            if (i5 == 1483304551) {
                j8 = cvbVar.a;
                jK2 = nj.k(cvuVar, j, i8, i7);
                if (jK2 != j2) {
                    if (jW != -1) {
                        if (j8 != -1 || j3 + jW == j8) {
                            jMin = jW;
                        } else {
                            long j13 = j8 - j3;
                            StringBuilder sb = new StringBuilder("Data size mismatch between stream (");
                            sb.append(j13);
                            sb.append(") and Xing frame (");
                            long j14 = jW;
                            sb.append(j14);
                            sb.append("), using smaller value.");
                            bvx.h(sb.toString());
                            jMin = Math.min(j14, j13);
                        }
                        j9 = jMin;
                    } else {
                        j9 = -1;
                    }
                    czeVar = new czm(j3, cvuVar.c, jK2, j9, jArr);
                } else {
                    j4 = jW;
                    j4 = jW;
                    czeVar = null;
                }
            } else {
                j5 = cvbVar.a;
                jK = nj.k(cvuVar, j, i8, i7);
                if (jK != -9223372036854775807L) {
                    j4 = jW;
                    j4 = jW;
                    czeVar = null;
                } else {
                    if (j4 != -1) {
                        j4 = jW;
                        j5 = j3 + j4;
                        j6 = j4 - ((long) cvuVar.c);
                    } else if (j5 != -1) {
                        j4 = jW;
                        j6 = (j5 - j3) - ((long) cvuVar.c);
                    } else {
                        j4 = jW;
                        j4 = jW;
                        czeVar = null;
                    }
                    j7 = j5;
                    iL = nj.l(j6, jK);
                    if (iL != -2147483647) {
                        czeVar = new cze(j7, j3 + ((long) cvuVar.c), iL, ahng.K(afxw.U(j6, j, RoundingMode.HALF_UP)), false, true, jK);
                    } else {
                        j4 = jW;
                        j4 = jW;
                        czeVar = null;
                    }
                }
            }
        } else if (i5 != 1447187017) {
            if (i5 != 1483304551) {
                cvjVar.k();
                cvbVar = cvbVar3;
            } else {
                cvbVar = cvbVar3;
                i6 = bwbVar2.i();
                if ((i6 & 1) != 0) {
                    iQ = bwbVar2.q();
                } else {
                    iQ = -1;
                }
                if ((i6 & 2) != 0) {
                    jW = bwbVar2.w();
                } else {
                    jW = -1;
                }
                if ((i6 & 4) == 4) {
                    jArr2 = new long[100];
                    i10 = 0;
                    while (i10 < i9) {
                        long[] jArr4 = jArr2;
                        jArr4[i10] = bwbVar2.n();
                        i10++;
                        jArr2 = jArr4;
                    }
                    jArr = jArr2;
                } else {
                    jArr = null;
                }
                if ((i6 & 8) != 0) {
                    bwbVar2.Q(4);
                }
                if (bwbVar2.d() >= 24) {
                    bwbVar2.Q(11);
                    fC = bwbVar2.c();
                    int iS3 = bwbVar2.s();
                    int iS4 = bwbVar2.s();
                    cziVarA = czi.a(iS3);
                    cziVarA2 = czi.a(iS4);
                    if (fC > 0.0f) {
                        czjVar = new czj(fC, cziVarA, cziVarA2);
                    } else {
                        czjVar = new czj(fC, cziVarA, cziVarA2);
                    }
                    bwbVar2.Q(2);
                    int iP2 = bwbVar2.p();
                    i8 = iP2 >> 12;
                    i7 = iP2 & 4095;
                } else {
                    i7 = -1;
                    i8 = -1;
                    czjVar = null;
                }
                j = iQ;
                cvuVar = new cvu(cvuVar5);
                cvrVar = this.e;
                if (!cvrVar.a()) {
                    cvrVar.a = i8;
                    cvrVar.b = i7;
                }
                if (czjVar != null) {
                    z = false;
                    j2 = -9223372036854775807L;
                    bsxVar = new bsx(-9223372036854775807L, czjVar);
                } else {
                    j2 = -9223372036854775807L;
                    z = false;
                    bsxVar = null;
                }
                this.l = bsxVar;
                j3 = cvbVar.b;
                cvbVar.p(cvuVar5.c, z);
                if (i5 == 1483304551) {
                    j8 = cvbVar.a;
                    jK2 = nj.k(cvuVar, j, i8, i7);
                    if (jK2 != j2) {
                        if (jW != -1) {
                            if (j8 != -1) {
                                jMin = jW;
                            } else {
                                jMin = jW;
                            }
                            j9 = jMin;
                        } else {
                            j9 = -1;
                        }
                        czeVar = new czm(j3, cvuVar.c, jK2, j9, jArr);
                    }
                } else {
                    j5 = cvbVar.a;
                    jK = nj.k(cvuVar, j, i8, i7);
                    if (jK != -9223372036854775807L) {
                        if (j4 != -1) {
                            j4 = jW;
                            j5 = j3 + j4;
                            j6 = j4 - ((long) cvuVar.c);
                        } else if (j5 != -1) {
                            j4 = jW;
                            j6 = (j5 - j3) - ((long) cvuVar.c);
                        }
                        j7 = j5;
                        iL = nj.l(j6, jK);
                        if (iL != -2147483647) {
                            czeVar = new cze(j7, j3 + ((long) cvuVar.c), iL, ahng.K(afxw.U(j6, j, RoundingMode.HALF_UP)), false, true, jK);
                        }
                    }
                }
            }
            j4 = jW;
            j4 = jW;
            czeVar = null;
        } else {
            long j15 = cvbVar3.a;
            long j16 = cvbVar3.b;
            bwbVar2.Q(6);
            int i13 = bwbVar2.i();
            long j17 = j16 + ((long) cvuVar5.c);
            long j18 = i13;
            int i14 = bwbVar2.i();
            if (i14 <= 0) {
                cvbVar = cvbVar3;
            } else {
                cvbVar = cvbVar3;
                long jB = bwp.B((((long) i14) * ((long) cvuVar5.g)) - 1, cvuVar5.d);
                int iS5 = bwbVar2.s();
                int iS6 = bwbVar2.s();
                int iS7 = bwbVar2.s();
                bwbVar2.Q(2);
                long j19 = j16 + ((long) cvuVar5.c);
                long[] jArr5 = new long[iS5];
                long[] jArr6 = new long[iS5];
                int i15 = 0;
                while (true) {
                    long[] jArr7 = jArr5;
                    long[] jArr8 = jArr6;
                    if (i15 >= iS5) {
                        long j20 = j15;
                        long j21 = j17 + j18;
                        if (j20 != -1 && j20 != j21) {
                            bvx.e("VbriSeeker", a.cr(j21, j20, "VBRI data size mismatch: ", ", "));
                        }
                        if (j21 != j19) {
                            bvx.e("VbriSeeker", "VBRI bytes and ToC mismatch (using max): " + j21 + ", " + j19 + "\nSeeking will be inaccurate.");
                            jMax = Math.max(j21, j19);
                        } else {
                            jMax = j21;
                        }
                        czeVar = new czl(jArr7, jArr8, jB, j17, jMax);
                        break;
                    }
                    jArr7[i15] = (((long) i15) * jB) / ((long) iS5);
                    jArr8[i15] = j19;
                    if (iS7 == 1) {
                        iN = bwbVar2.n();
                    } else if (iS7 == 2) {
                        iN = bwbVar2.s();
                    } else if (iS7 == 3) {
                        iN = bwbVar2.p();
                    } else if (iS7 == 4) {
                        iN = bwbVar2.q();
                    }
                    j19 += ((long) iN) * ((long) iS6);
                    i15++;
                    j15 = j15;
                    jArr5 = jArr7;
                    jArr6 = jArr8;
                }
                cvbVar.p(cvuVar5.c, false);
            }
            czeVar = null;
            cvbVar.p(cvuVar5.c, false);
        }
        bsx bsxVar2 = this.k;
        long j22 = cvbVar.b;
        if (bsxVar2 == null || (cykVar = (cyk) bsxVar2.c(cyk.class, agez.a)) == null) {
            czgVar = null;
        } else {
            cym cymVar = (cym) bsxVar2.c(cym.class, new bym(4));
            if (cymVar == null) {
                jY = -9223372036854775807L;
                c = 0;
            } else {
                c = 0;
                jY = bwp.y(Long.parseLong((String) cymVar.b.get(0)));
            }
            int[] iArr = cykVar.d;
            int length = iArr.length;
            int i16 = length + 1;
            long[] jArr9 = new long[i16];
            long[] jArr10 = new long[i16];
            jArr9[c] = j22;
            jArr10[c] = 0;
            long j23 = 0;
            int i17 = 1;
            while (i17 <= length) {
                int[] iArr2 = iArr;
                int i18 = i17 - 1;
                long j24 = j22 + ((long) (cykVar.b + iArr2[i18]));
                j23 += (long) (cykVar.c + cykVar.e[i18]);
                jArr9[i17] = j24;
                jArr10[i17] = j23;
                i17++;
                iArr = iArr2;
                j22 = j24;
            }
            czgVar = new czg(jArr9, jArr10, jY);
        }
        if (this.a) {
            czkVarJ = new cvy(-9223372036854775807L, 0L);
        } else {
            if (czgVar == null) {
                if (czeVar == null) {
                    czeVar = j(cvjVar);
                }
                czgVar = czeVar;
            }
            int i19 = this.b;
            if ((i19 & 4) != 0 && !czgVar.d()) {
                czkVarJ = new czf(czgVar.a(), cvbVar.b, czgVar.f());
            } else if ((czgVar instanceof cze) || czgVar.d() || (i19 & 1) == 0) {
                czkVarJ = czgVar;
            } else {
                long jA = czgVar.a();
                long jF = czgVar.f() != -1 ? czgVar.f() : cvbVar.a;
                if (jA == -9223372036854775807L || jF == -1) {
                    czkVarJ = j(cvjVar);
                } else {
                    long jG = czgVar.g() != -1 ? czgVar.g() : 0L;
                    int iL2 = nj.l(jF - jG, jA);
                    czkVarJ = iL2 == -2147483647 ? j(cvjVar) : new cze(jF, jG, iL2, -1, false, true, jA);
                }
            }
        }
        this.r = czkVarJ;
        cwj cwjVar3 = this.h;
        czkVarJ.a();
        cwjVar3.f();
        this.g.z(this.r);
        bsx bsxVarE = this.k;
        bsx bsxVar3 = this.l;
        if (bsxVarE == null) {
            bsxVarE = bsxVar3;
        } else if (bsxVar3 != null) {
            bsxVarE = bsxVarE.e(bsxVar3);
        }
        bsd bsdVar = new bsd();
        bsdVar.a("audio/mpeg");
        bsdVar.e(cvuVar5.b);
        bsdVar.p = SemanticState.Obscured;
        bsdVar.G = cvuVar5.e;
        bsdVar.I = cvuVar5.d;
        cvr cvrVar2 = this.e;
        bsdVar.K = cvrVar2.a;
        bsdVar.L = cvrVar2.b;
        bsdVar.l = bsxVarE;
        if (this.r.e() != -2147483647) {
            bsdVar.i = this.r.e();
        }
        this.i.b(new bse(bsdVar));
        this.o = cvbVar.b;
        i = 0;
        if (this.q == 0) {
            iA = this.i.a(cvjVar, this.q, true);
            i2 = -1;
            if (iA != -1) {
                i3 = this.q - iA;
                this.q = i3;
                if (i3 <= 0) {
                    cwj cwjVar4 = this.i;
                    long jI4 = i(this.n);
                    cvu cvuVar6 = this.d;
                    cwjVar4.e(jI4, 1, cvuVar6.c, 0, null);
                    this.n += (long) cvuVar6.g;
                    i2 = 0;
                    this.q = 0;
                }
            }
            return i2;
        }
        cvjVar.k();
        if (m(cvjVar)) {
            return -1;
        }
        bwb bwbVar3 = this.c;
        bwbVar3.P(i);
        i4 = bwbVar3.i();
        if (!l(i4, this.j)) {
        }
        ((cvb) cvjVar).p(1, false);
        this.j = 0;
        return 0;
    }

    private final long i(long j) {
        return this.m + ((j * 1000000) / ((long) this.d.d));
    }

    private final czk j(cvj cvjVar) {
        bwb bwbVar = this.c;
        cvb cvbVar = (cvb) cvjVar;
        cvbVar.n(bwbVar.b, 0, 4, false);
        bwbVar.P(0);
        cvu cvuVar = this.d;
        cvuVar.a(bwbVar.i());
        long j = cvbVar.b;
        int i = this.b & 2;
        return new cze(cvbVar.a, j, cvuVar.f, cvuVar.c, i != 0, true, -9223372036854775807L);
    }

    private final void k() {
        czk czkVar = this.r;
        if ((czkVar instanceof cze) && czkVar.d()) {
            long j = this.p;
            if (j == -1 || j == this.r.f()) {
                return;
            }
            cze czeVar = (cze) this.r;
            this.r = new cze(this.p, czeVar.a, czeVar.c, czeVar.b, czeVar.e, false, czeVar.f);
            cvk cvkVar = this.g;
            cvkVar.getClass();
            cvkVar.z(this.r);
            this.h.getClass();
            this.r.a();
        }
    }

    private static boolean l(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    private final boolean m(cvj cvjVar) {
        czk czkVar = this.r;
        if (czkVar != null) {
            long jF = czkVar.f();
            if (jF != -1 && cvjVar.e() > jF - 4) {
                return true;
            }
        }
        try {
            return !cvjVar.n(this.c.b, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean n(cvj cvjVar, boolean z) throws EOFException {
        int iE;
        int i;
        int iA;
        cvjVar.k();
        cvb cvbVar = (cvb) cvjVar;
        if (cvbVar.b == 0) {
            bsx bsxVarM = this.u.m(cvjVar, null, 131072);
            this.k = bsxVarM;
            if (bsxVarM != null) {
                this.e.b(bsxVarM);
            }
            iE = (int) cvjVar.e();
            if (!z) {
                cvbVar.p(iE, false);
            }
            i = 0;
        } else {
            iE = 0;
            i = 0;
        }
        int i2 = i;
        int i3 = i2;
        while (true) {
            if (m(cvjVar)) {
                if (i2 > 0) {
                    break;
                }
                k();
                throw new EOFException();
            }
            bwb bwbVar = this.c;
            bwbVar.P(0);
            int i4 = bwbVar.i();
            if ((i == 0 || l(i4, i)) && (iA = cvv.a(i4)) != -1) {
                i2++;
                if (i2 != 1) {
                    if (i2 == 4) {
                        break;
                    }
                } else {
                    this.d.a(i4);
                    i = i4;
                }
                cvbVar.m(iA - 4, false);
            } else {
                int i5 = i3 + 1;
                if (i3 == 131072) {
                    if (z) {
                        return false;
                    }
                    k();
                    throw new EOFException();
                }
                if (z) {
                    cvjVar.k();
                    cvbVar.m(iE + i5, false);
                } else {
                    cvbVar.p(1, false);
                }
                i2 = 0;
                i3 = i5;
                i = 0;
            }
        }
        if (z) {
            cvbVar.p(iE + i3, false);
        } else {
            cvjVar.k();
        }
        this.j = i;
        return true;
    }

    @Override // defpackage.cvi
    public final /* synthetic */ List a() {
        return agpi.a;
    }

    @Override // defpackage.cvi
    public final void b(cvk cvkVar) {
        this.g = cvkVar;
        cwj cwjVarS = cvkVar.s(0, 1);
        this.h = cwjVarS;
        this.i = cwjVarS;
        this.g.t();
    }

    @Override // defpackage.cvi
    public final void d(long j, long j2) {
        this.j = 0;
        this.m = -9223372036854775807L;
        this.n = 0L;
        this.q = 0;
        this.p = -1L;
        this.t = j2;
        czk czkVar = this.r;
        if (!(czkVar instanceof czf) || ((czf) czkVar).i(j2)) {
            return;
        }
        this.s = true;
        this.i = this.f;
    }

    @Override // defpackage.cvi
    public final boolean e(cvj cvjVar) {
        return n(cvjVar, true);
    }

    @Override // defpackage.cvi
    public final int g(cvj cvjVar, qha qhaVar) {
        this.h.getClass();
        int i = bwp.a;
        int iH = h(cvjVar);
        if (iH != -1) {
            return iH;
        }
        if (this.r instanceof czf) {
            long j = this.n - 1;
            long jI = -9223372036854775807L;
            if (j >= 0) {
                cvr cvrVar = this.e;
                if (cvrVar.a()) {
                    j = (j - ((long) cvrVar.a)) - ((long) cvrVar.b);
                }
                if (j >= 0) {
                    jI = i(j);
                }
            }
            if (this.r.a() != jI) {
                czk czkVar = this.r;
                ((czf) czkVar).a.a = jI;
                this.g.z(czkVar);
                cwj cwjVar = this.h;
                this.r.a();
                cwjVar.f();
            }
        }
        return -1;
    }

    @Override // defpackage.cvi
    public final void c() {
    }

    @Override // defpackage.cvi
    public final /* synthetic */ void f() {
    }

    public czh() {
        throw null;
    }
}
