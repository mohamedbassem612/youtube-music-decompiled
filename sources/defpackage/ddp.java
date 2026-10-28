package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ddp implements ddr {
    private final bwb a;
    private final String c;
    private final int d;
    private String f;
    private cwj g;
    private int i;
    private int j;
    private int k;
    private long l;
    private bse m;
    private int n;
    private int o;
    private int p;
    private boolean s;
    private boolean v;
    private boolean w;
    private int h = 0;
    private long t = -9223372036854775807L;
    private long u = -9223372036854775807L;
    private final AtomicInteger b = new AtomicInteger();
    private int q = -1;
    private int r = -1;
    private final String e = "video/mp2t";

    public ddp(String str, int i, int i2) {
        this.a = new bwb(new byte[i2]);
        this.c = str;
        this.d = i;
    }

    private final void g(int i) {
        byte[] bArr = this.a.b;
        bArr[0] = (byte) ((i >> 24) & 255);
        bArr[1] = (byte) ((i >> 16) & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        this.i = 4;
    }

    private final void h(cvg cvgVar) {
        int i;
        int i2 = cvgVar.b;
        if (i2 == -2147483647 || (i = cvgVar.c) == -1) {
            return;
        }
        String str = cvgVar.a;
        if (str == null) {
            bse bseVar = this.m;
            str = bseVar != null ? bseVar.q : null;
        }
        bse bseVar2 = this.m;
        if (bseVar2 != null && !this.s && i == bseVar2.I && i2 == bseVar2.K && Objects.equals(str, bseVar2.q)) {
            return;
        }
        bse bseVar3 = this.m;
        bsd bsdVar = bseVar3 == null ? new bsd() : new bsd(bseVar3);
        bsdVar.a = this.f;
        bsdVar.a(this.e);
        bsdVar.e(str);
        bsdVar.G = i;
        bsdVar.I = i2;
        bsdVar.d = this.c;
        bsdVar.f = this.d;
        bse bseVar4 = new bse(bsdVar);
        this.m = bseVar4;
        this.g.b(bseVar4);
        this.s = false;
    }

    private final boolean i(bwb bwbVar, byte[] bArr, int i) {
        int iMin = Math.min(bwbVar.d(), i - this.i);
        bwbVar.K(bArr, this.i, iMin);
        int i2 = this.i + iMin;
        this.i = i2;
        return i2 == i;
    }

    @Override // defpackage.ddr
    public final void a(bwb bwbVar) throws bsz {
        int i;
        int i2;
        byte b;
        int i3;
        int i4;
        long jC;
        int i5;
        int i6;
        int i7;
        this.g.getClass();
        while (bwbVar.d() > 0) {
            int i8 = 2;
            switch (this.h) {
                case 0:
                    while (bwbVar.d() > 0) {
                        int i9 = this.k << 8;
                        this.k = i9;
                        int iN = i9 | bwbVar.n();
                        this.k = iN;
                        int iB = cvh.b(iN);
                        this.p = iB;
                        if (iB != 0) {
                            g(this.k);
                            this.k = 0;
                            if (!this.w || this.p != 2) {
                                int i10 = this.p;
                                if (i10 == 1) {
                                    this.w = false;
                                    i10 = 1;
                                }
                                int i11 = i10;
                                if (i10 != 3 && i10 != 4) {
                                    if (i11 == 1) {
                                        this.h = 1;
                                    } else {
                                        this.h = 2;
                                    }
                                }
                                this.h = 4;
                            }
                            this.i = 0;
                        }
                        break;
                    }
                    break;
                case 1:
                    bwb bwbVar2 = this.a;
                    if (i(bwbVar, bwbVar2.b, 18)) {
                        this.v = true;
                        byte[] bArr = bwbVar2.b;
                        if (this.m == null) {
                            String str = this.f;
                            String str2 = this.c;
                            int i12 = this.d;
                            dqp dqpVarG = cvh.g(bArr);
                            dqpVarG.s(60);
                            int i13 = cvh.a[dqpVarG.i(6)];
                            int i14 = cvh.b[dqpVarG.i(4)];
                            int i15 = dqpVarG.i(5);
                            int i16 = i15 >= 29 ? -1 : (cvh.c[i15] * 1000) / 2;
                            dqpVarG.s(10);
                            int i17 = i13 + (dqpVarG.i(2) > 0 ? 1 : 0);
                            bsd bsdVar = new bsd();
                            bsdVar.a = str;
                            bsdVar.a("video/mp2t");
                            bsdVar.e("audio/vnd.dts");
                            bsdVar.i = i16;
                            bsdVar.G = i17;
                            bsdVar.I = i14;
                            bsdVar.s = null;
                            bsdVar.d = str2;
                            bsdVar.f = i12;
                            this.m = new bse(bsdVar);
                            this.s = true;
                        }
                        this.n = cvh.a(bArr);
                        byte b2 = bArr[0];
                        if (b2 != -2) {
                            if (b2 != -1) {
                                if (b2 != 31) {
                                    i2 = (bArr[4] & 1) << 6;
                                    i3 = bArr[5] & 252;
                                } else {
                                    i2 = (bArr[r7] & 7) << 4;
                                    b = bArr[6];
                                }
                                i = i2 | (i3 >> 2);
                            } else {
                                i2 = (bArr[4] & 7) << 4;
                                b = bArr[7];
                            }
                            i3 = b & 60;
                            i = i2 | (i3 >> 2);
                        } else {
                            i = ((bArr[r7] & 1) << 6) | ((bArr[4] & 252) >> 2);
                        }
                        this.l = ahng.K(bwp.B((i + 1) << 5, this.m.K));
                        bwbVar2.P(0);
                        this.g.c(bwbVar2, 18);
                        this.h = 6;
                    }
                    break;
                case 2:
                    bwb bwbVar3 = this.a;
                    if (i(bwbVar, bwbVar3.b, 7)) {
                        this.q = cvh.c(bwbVar3.b);
                        this.h = 3;
                    }
                    break;
                case 3:
                    bwb bwbVar4 = this.a;
                    if (i(bwbVar, bwbVar4.b, this.q)) {
                        cvg cvgVarE = cvh.e(bwbVar4.b);
                        h(cvgVarE);
                        this.n = cvgVarE.d;
                        long j = cvgVarE.e;
                        if (j != -9223372036854775807L) {
                            this.l = j;
                        }
                        bwbVar4.P(0);
                        this.g.c(bwbVar4, this.q);
                        this.h = 6;
                    }
                    break;
                case 4:
                    bwb bwbVar5 = this.a;
                    if (i(bwbVar, bwbVar5.b, 6)) {
                        dqp dqpVarG2 = cvh.g(bwbVar5.b);
                        dqpVarG2.s(32);
                        int iH = cvh.h(dqpVarG2, cvh.h) + 1;
                        this.r = iH;
                        int i18 = this.i;
                        if (i18 > iH) {
                            int i19 = i18 - iH;
                            this.i = i18 - i19;
                            bwbVar.P(bwbVar.c - i19);
                        }
                        this.h = 5;
                    }
                    break;
                case 5:
                    bwb bwbVar6 = this.a;
                    if (i(bwbVar, bwbVar6.b, this.r)) {
                        byte[] bArr2 = bwbVar6.b;
                        AtomicInteger atomicInteger = this.b;
                        dqp dqpVarG3 = cvh.g(bArr2);
                        int i20 = dqpVarG3.i(32);
                        int iH2 = cvh.h(dqpVarG3, cvh.d);
                        int i21 = iH2 + 1;
                        char c = i20 == 1078008818 ? (char) 1 : (char) 0;
                        if (c == 0) {
                            i4 = -2147483647;
                            jC = -9223372036854775807L;
                        } else {
                            if (!dqpVarG3.u()) {
                                throw new bsz("Only supports full channel mask-based audio presentation", null, false, 1);
                            }
                            int i22 = iH2 - 1;
                            int i23 = bArr2[i22] << 8;
                            int i24 = bArr2[iH2] & 255;
                            int i25 = bwp.a;
                            int iD = 65535;
                            for (int i26 = 0; i26 < i22; i26++) {
                                byte b3 = bArr2[i26];
                                iD = bwp.d(b3 & 15, bwp.d((b3 & 255) >> 4, iD));
                            }
                            if ((((char) i23) | i24) != iD) {
                                throw new bsz("CRC check failed", null, true, 1);
                            }
                            int i27 = dqpVarG3.i(2);
                            if (i27 == 0) {
                                i5 = SemanticState.LiveRegion;
                            } else if (i27 == 1) {
                                i5 = 480;
                            } else {
                                if (i27 != 2) {
                                    throw new bsz("Unsupported base duration index in DTS UHD header: " + i27, null, true, 1);
                                }
                                i5 = 384;
                            }
                            int i28 = dqpVarG3.i(3) + 1;
                            int i29 = dqpVarG3.i(2);
                            if (i29 == 0) {
                                i6 = 32000;
                            } else if (i29 == 1) {
                                i6 = 44100;
                            } else {
                                if (i29 != 2) {
                                    throw new bsz("Unsupported clock rate index in DTS UHD header: " + i29, null, true, 1);
                                }
                                i6 = 48000;
                            }
                            if (dqpVarG3.u()) {
                                dqpVarG3.s(36);
                            }
                            i4 = (1 << dqpVarG3.i(2)) * i6;
                            jC = bwp.C(i5 * i28, 1000000L, i6);
                        }
                        int i30 = i4;
                        int iH3 = 0;
                        for (char c2 = 0; c2 < c; c2 = 1) {
                            iH3 += cvh.h(dqpVarG3, cvh.e);
                        }
                        if (c != 0) {
                            atomicInteger.set(cvh.h(dqpVarG3, cvh.f));
                        }
                        cvg cvgVar = new cvg("audio/vnd.dts.uhd;profile=p2", 2, i30, i21 + iH3 + (atomicInteger.get() != 0 ? cvh.h(dqpVarG3, cvh.g) : 0), jC);
                        if (this.p == 3) {
                            h(cvgVar);
                        }
                        this.n = cvgVar.d;
                        long j2 = cvgVar.e;
                        if (j2 == -9223372036854775807L) {
                            j2 = 0;
                        }
                        this.l = j2;
                        bwbVar6.P(0);
                        this.g.c(bwbVar6, this.r);
                        this.h = 6;
                    } else {
                        continue;
                    }
                    break;
                case 6:
                    int iMin = Math.min(bwbVar.d(), this.n - this.i);
                    this.g.c(bwbVar, iMin);
                    int i31 = this.i + iMin;
                    this.i = i31;
                    int i32 = this.n;
                    if (i31 == i32) {
                        if (this.p == 1) {
                            this.o = i32;
                            this.i = 0;
                            this.j = 0;
                            this.h = 7;
                        } else {
                            ahno.O(this.t != -9223372036854775807L);
                            int i33 = this.n;
                            int i34 = this.p;
                            if (i34 == 2) {
                                i7 = this.o;
                            } else {
                                i8 = i34;
                                i7 = 0;
                            }
                            int i35 = i33 + i7;
                            long j3 = this.t;
                            this.g.e(j3, i8 == 4 ? 0 : 1, i35, 0, null);
                            this.t += this.l;
                            long j4 = this.u;
                            if (j4 != -9223372036854775807L) {
                                if (j4 != j3) {
                                    this.t = j4;
                                }
                                this.u = -9223372036854775807L;
                            }
                            this.o = 0;
                            this.h = 0;
                        }
                    }
                    break;
                default:
                    for (int i36 = 4; bwbVar.d() > 0 && this.i < i36; i36 = 4) {
                        int i37 = this.j << 8;
                        this.j = i37;
                        this.j = i37 | bwbVar.n();
                        this.i++;
                    }
                    if (this.i == 4) {
                        if (cvh.b(this.j) == 2) {
                            g(this.j);
                            this.p = 2;
                            this.j = 0;
                            this.h = 2;
                        } else {
                            if (this.s) {
                                cwj cwjVar = this.g;
                                bse bseVar = this.m;
                                bseVar.getClass();
                                cwjVar.b(bseVar);
                                this.s = false;
                            }
                            ahno.O(this.t != -9223372036854775807L);
                            long j5 = this.t;
                            this.g.e(j5, 1, this.o, 0, null);
                            this.t += this.l;
                            long j6 = this.u;
                            if (j6 != -9223372036854775807L) {
                                if (j6 != j5) {
                                    this.t = j6;
                                }
                                this.u = -9223372036854775807L;
                            }
                            this.o = 0;
                            int i38 = this.j;
                            this.k = i38;
                            this.j = 0;
                            int iB2 = cvh.b(i38);
                            this.p = iB2;
                            if (iB2 == 3 || iB2 == 4) {
                                g(i38);
                                this.k = 0;
                                this.h = 4;
                            } else if (iB2 == 1) {
                                g(i38);
                                this.k = 0;
                                this.h = 1;
                            } else {
                                this.i = 0;
                                this.h = 0;
                            }
                        }
                    }
                    break;
            }
        }
    }

    @Override // defpackage.ddr
    public final void b(cvk cvkVar, dev devVar) {
        devVar.c();
        this.f = devVar.b();
        this.g = cvkVar.s(devVar.a(), 1);
    }

    @Override // defpackage.ddr
    public final void c() {
        if (this.h == 7) {
            cwj cwjVar = this.g;
            cwjVar.getClass();
            if (this.s) {
                bse bseVar = this.m;
                bseVar.getClass();
                cwjVar.b(bseVar);
                this.s = false;
            }
            long j = this.t;
            if (j != -9223372036854775807L) {
                this.g.e(j, 1, this.o, 0, null);
                this.t += this.l;
            }
            this.o = 0;
            this.i = 0;
            this.k = 0;
            this.j = 0;
            this.h = 0;
        }
    }

    @Override // defpackage.ddr
    public final void e(long j, int i) {
        if (j != -9223372036854775807L) {
            if (this.h != 0) {
                this.u = j;
            } else {
                this.t = j;
                this.u = -9223372036854775807L;
            }
        }
    }

    @Override // defpackage.ddr
    public final void f() {
        this.h = 0;
        this.i = 0;
        this.k = 0;
        this.j = 0;
        this.o = 0;
        this.t = -9223372036854775807L;
        this.u = -9223372036854775807L;
        this.b.set(0);
        this.s = false;
        this.w = this.v;
    }

    @Override // defpackage.ddr
    public final /* synthetic */ void d() {
    }
}
