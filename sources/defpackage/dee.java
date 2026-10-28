package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dee implements ddr {
    private String e;
    private cwj f;
    private boolean i;
    private int k;
    private int l;
    private int n;
    private int o;
    private int s;
    private boolean u;
    private final String a = "video/mp2t";
    private int d = 0;
    private final bwb b = new bwb(new byte[15], 2);
    private final dqp v = new dqp((byte[]) null);
    private final bwb c = new bwb();
    private final def p = new def();
    private int q = -2147483647;
    private int r = -1;
    private long t = -1;
    private boolean j = true;
    private boolean m = true;
    private double g = -9.223372036854776E18d;
    private double h = -9.223372036854776E18d;

    private static final void g(bwb bwbVar, bwb bwbVar2, boolean z) {
        int i = bwbVar.c;
        int iMin = Math.min(bwbVar.d(), bwbVar2.d());
        bwbVar.K(bwbVar2.b, bwbVar2.c, iMin);
        bwbVar2.Q(iMin);
        if (z) {
            bwbVar.P(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:192:0x03a7  */
    @Override // defpackage.ddr
    public final void a(bwb bwbVar) throws bsz {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        char c;
        byte[] bArr;
        double d;
        int i6;
        int i7;
        char c2;
        long j;
        this.f.getClass();
        while (bwbVar.d() > 0) {
            int i8 = this.d;
            int i9 = 8;
            int i10 = 1;
            if (i8 == 0) {
                int i11 = this.k;
                if ((i11 & 2) != 0) {
                    if ((i11 & 4) == 0) {
                        while (bwbVar.d() > 0) {
                            int i12 = this.l << 8;
                            this.l = i12;
                            int iN = i12 | bwbVar.n();
                            this.l = iN;
                            if ((iN & 16777215) == 12583333) {
                                bwbVar.P(bwbVar.c - 3);
                                this.l = 0;
                            }
                        }
                    }
                    this.d = 1;
                    break;
                }
                bwbVar.P(bwbVar.d);
            } else {
                int i13 = 3;
                if (i8 != 1) {
                    def defVar = this.p;
                    int i14 = defVar.a;
                    if (i14 == 1 || i14 == 17) {
                        g(bwbVar, this.c, true);
                    }
                    int iMin = Math.min(bwbVar.d(), defVar.c - this.n);
                    this.f.c(bwbVar, iMin);
                    int i15 = this.n + iMin;
                    this.n = i15;
                    if (i15 != defVar.c) {
                        continue;
                    } else {
                        int i16 = defVar.a;
                        if (i16 == 1) {
                            dqp dqpVar = new dqp(this.c.b, (byte[]) null);
                            int i17 = dqpVar.i(8);
                            int i18 = dqpVar.i(5);
                            if (i18 != 31) {
                                switch (i18) {
                                    case 0:
                                        i4 = 96000;
                                        break;
                                    case 1:
                                        i4 = 88200;
                                        break;
                                    case 2:
                                        i4 = 64000;
                                        break;
                                    case 3:
                                        i4 = 48000;
                                        break;
                                    case 4:
                                        i4 = 44100;
                                        break;
                                    case 5:
                                        i4 = 32000;
                                        break;
                                    case 6:
                                        i4 = 24000;
                                        break;
                                    case 7:
                                        i4 = 22050;
                                        break;
                                    case 8:
                                        i4 = 16000;
                                        break;
                                    case 9:
                                        i4 = 12000;
                                        break;
                                    case 10:
                                        i4 = 11025;
                                        break;
                                    case 11:
                                        i4 = 8000;
                                        break;
                                    case 12:
                                        i4 = 7350;
                                        break;
                                    case 13:
                                    case 14:
                                    default:
                                        throw new bsz(a.bR(i18, "Unsupported sampling rate index "), null, false, 1);
                                    case 15:
                                        i4 = 57600;
                                        break;
                                    case 16:
                                        i4 = 51200;
                                        break;
                                    case 17:
                                        i4 = 40000;
                                        break;
                                    case 18:
                                        i4 = 38400;
                                        break;
                                    case 19:
                                        i4 = 34150;
                                        break;
                                    case 20:
                                        i4 = 28800;
                                        break;
                                    case 21:
                                        i4 = 25600;
                                        break;
                                    case 22:
                                        i4 = 20000;
                                        break;
                                    case 23:
                                        i4 = 19200;
                                        break;
                                    case 24:
                                        i4 = 17075;
                                        break;
                                    case 25:
                                        i4 = 14400;
                                        break;
                                    case 26:
                                        i4 = 12800;
                                        break;
                                    case 27:
                                        i4 = 9600;
                                        break;
                                }
                            } else {
                                i4 = dqpVar.i(24);
                            }
                            int i19 = dqpVar.i(3);
                            int i20 = 4;
                            if (i19 == 0) {
                                i5 = 768;
                            } else if (i19 == 1) {
                                i5 = SemanticState.ReadOnly;
                            } else if (i19 == 2 || i19 == 3) {
                                i5 = SemanticState.Modal;
                            } else {
                                if (i19 != 4) {
                                    throw new bsz(a.bR(i19, "Unsupported coreSbrFrameLengthIndex "), null, false, 1);
                                }
                                i5 = SemanticState.Obscured;
                            }
                            int i21 = i5;
                            if (i19 == 0 || i19 == 1) {
                                c = 0;
                            } else if (i19 == 2) {
                                c = 2;
                            } else if (i19 == 3) {
                                c = 3;
                            } else {
                                if (i19 != 4) {
                                    throw new bsz(a.bR(i19, "Unsupported coreSbrFrameLengthIndex "), null, false, 1);
                                }
                                c = 1;
                            }
                            dqpVar.s(2);
                            rx.j(dqpVar);
                            int i22 = dqpVar.i(5);
                            int i23 = 0;
                            int iH = 0;
                            while (true) {
                                int i24 = i10;
                                int i25 = 16;
                                if (i23 < i22 + 1) {
                                    int i26 = dqpVar.i(3);
                                    iH += rx.h(dqpVar, 5, 8, 16) + 1;
                                    if ((i26 == 0 || i26 == 2) && dqpVar.u()) {
                                        rx.j(dqpVar);
                                    }
                                    i23++;
                                    i10 = i24;
                                } else {
                                    int iH2 = rx.h(dqpVar, 4, 8, 16) + 1;
                                    dqpVar.r();
                                    int i27 = 0;
                                    while (i27 < iH2) {
                                        int i28 = dqpVar.i(2);
                                        if (i28 == 0) {
                                            i6 = i13;
                                            rx.k(dqpVar);
                                            if (c > 0) {
                                                rx.i(dqpVar);
                                            }
                                        } else if (i28 != i24) {
                                            if (i28 == i13) {
                                                rx.h(dqpVar, i20, i9, i25);
                                                int iH3 = rx.h(dqpVar, i20, i9, i25);
                                                if (dqpVar.u()) {
                                                    rx.h(dqpVar, i9, i25, 0);
                                                }
                                                dqpVar.r();
                                                if (iH3 > 0) {
                                                    dqpVar.s(iH3 << 3);
                                                }
                                            }
                                            i6 = i13;
                                        } else {
                                            if (rx.k(dqpVar)) {
                                                dqpVar.r();
                                            }
                                            if (c > 0) {
                                                rx.i(dqpVar);
                                                i7 = dqpVar.i(2);
                                                c2 = c;
                                            } else {
                                                i7 = 0;
                                                c2 = 0;
                                            }
                                            if (i7 > 0) {
                                                dqpVar.s(6);
                                                int i29 = dqpVar.i(2);
                                                dqpVar.s(i20);
                                                if (dqpVar.u()) {
                                                    dqpVar.s(5);
                                                }
                                                if (i7 == 2 || i7 == i13) {
                                                    dqpVar.s(6);
                                                }
                                                if (i29 == 2) {
                                                    dqpVar.r();
                                                }
                                            }
                                            i6 = i13;
                                            int iFloor = ((int) Math.floor(Math.log(iH - 1) / 0.6931471805599453d)) + 1;
                                            int i30 = dqpVar.i(2);
                                            if (i30 > 0 && dqpVar.u()) {
                                                dqpVar.s(iFloor);
                                            }
                                            if (dqpVar.u()) {
                                                dqpVar.s(iFloor);
                                            }
                                            if (c2 == 0 && i30 == 0) {
                                                dqpVar.r();
                                            }
                                        }
                                        i27++;
                                        i13 = i6;
                                        i9 = 8;
                                        i25 = 16;
                                        i20 = 4;
                                        i24 = 1;
                                    }
                                    int i31 = i13;
                                    if (dqpVar.u()) {
                                        int i32 = 8;
                                        int iH4 = rx.h(dqpVar, 2, 4, 8) + 1;
                                        bArr = null;
                                        int i33 = 0;
                                        while (i33 < iH4) {
                                            int iH5 = rx.h(dqpVar, 4, i32, 16);
                                            int iH6 = rx.h(dqpVar, 4, i32, 16);
                                            if (iH5 == 7) {
                                                int i34 = dqpVar.i(4) + 1;
                                                dqpVar.s(4);
                                                byte[] bArr2 = new byte[i34];
                                                int i35 = 0;
                                                while (i35 < i34) {
                                                    bArr2[i35] = (byte) dqpVar.i(i32);
                                                    i35++;
                                                    i32 = 8;
                                                }
                                                bArr = bArr2;
                                            } else {
                                                dqpVar.s(iH6 << i31);
                                            }
                                            i33++;
                                            i32 = 8;
                                        }
                                    } else {
                                        bArr = null;
                                    }
                                    switch (i4) {
                                        case 14700:
                                        case 16000:
                                            d = 3.0d;
                                            break;
                                        case 22050:
                                        case 24000:
                                            d = 2.0d;
                                            break;
                                        case 29400:
                                        case 32000:
                                        case 58800:
                                        case 64000:
                                            d = 1.5d;
                                            break;
                                        case 44100:
                                        case 48000:
                                        case 88200:
                                        case 96000:
                                            d = 1.0d;
                                            break;
                                        default:
                                            throw new bsz(a.bR(i4, "Unsupported sampling rate "), null, false, 1);
                                    }
                                    this.q = (int) (((double) i4) * d);
                                    this.r = (int) (((double) i21) * d);
                                    long j2 = this.t;
                                    long j3 = defVar.b;
                                    if (j2 != j3) {
                                        this.t = j3;
                                        String strConcat = i17 != -1 ? "mhm1".concat(String.valueOf(String.format(".%02X", Integer.valueOf(i17)))) : "mhm1";
                                        agke agkeVarR = (bArr == null || bArr.length <= 0) ? null : agke.r(bwp.e, bArr);
                                        bsd bsdVar = new bsd();
                                        bsdVar.a = this.e;
                                        bsdVar.a(this.a);
                                        bsdVar.e("audio/mhm1");
                                        bsdVar.I = this.q;
                                        bsdVar.k = strConcat;
                                        bsdVar.r = agkeVarR;
                                        this.f.b(new bse(bsdVar));
                                    }
                                    i2 = 1;
                                    this.u = true;
                                }
                            }
                        } else {
                            if (i16 == 17) {
                                dqp dqpVar2 = new dqp(this.c.b, (byte[]) null);
                                if (dqpVar2.u()) {
                                    dqpVar2.s(2);
                                    i3 = dqpVar2.i(13);
                                } else {
                                    i3 = 0;
                                }
                                this.s = i3;
                            } else if (i16 == 2) {
                                if (this.u) {
                                    this.j = false;
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                int i36 = this.r - this.s;
                                double d2 = this.q;
                                long jRound = Math.round(this.g);
                                double d3 = i36;
                                if (this.i) {
                                    this.i = false;
                                    this.g = this.h;
                                } else {
                                    this.g += (d3 * 1000000.0d) / d2;
                                }
                                this.f.e(jRound, i, this.o, 0, null);
                                this.u = false;
                                this.s = 0;
                                this.o = 0;
                            }
                            i2 = 1;
                        }
                        this.d = i2;
                    }
                } else {
                    bwb bwbVar2 = this.b;
                    g(bwbVar, bwbVar2, false);
                    if (bwbVar2.d() == 0) {
                        int i37 = bwbVar2.d;
                        dqp dqpVar3 = this.v;
                        dqpVar3.p(bwbVar2.b, i37);
                        def defVar2 = this.p;
                        dqpVar3.g();
                        int iH7 = rx.h(dqpVar3, 3, 8, 8);
                        defVar2.a = iH7;
                        if (iH7 != -1) {
                            ahno.F(true);
                            a.d(a.d(3L, 255L), 4294967296L);
                            if (dqpVar3.f() >= 2) {
                                j = dqpVar3.j(2);
                                if (j == 3) {
                                    if (dqpVar3.f() >= 8) {
                                        long j4 = dqpVar3.j(8);
                                        long j5 = j4 + 3;
                                        if (j4 != 255) {
                                            j = j5;
                                        } else if (dqpVar3.f() < 32) {
                                            j = -1;
                                        } else {
                                            j = j5 + dqpVar3.j(32);
                                        }
                                    } else {
                                        j = -1;
                                    }
                                }
                            } else {
                                j = -1;
                            }
                            defVar2.b = j;
                            if (j != -1) {
                                if (j > 16) {
                                    throw new bsz(a.bS(j, "Contains sub-stream with an invalid packet label "), null, false, 1);
                                }
                                if (j == 0) {
                                    int i38 = defVar2.a;
                                    if (i38 == 1) {
                                        throw new bsz("Mpegh3daConfig packet with invalid packet label 0", null, true, 1);
                                    }
                                    if (i38 == 2) {
                                        throw new bsz("Mpegh3daFrame packet with invalid packet label 0", null, true, 1);
                                    }
                                    if (i38 == 17) {
                                        throw new bsz("AudioTruncation packet with invalid packet label 0", null, true, 1);
                                    }
                                }
                                int iH8 = rx.h(dqpVar3, 11, 24, 24);
                                defVar2.c = iH8;
                                if (iH8 != -1) {
                                    this.n = 0;
                                    this.o += iH8 + i37;
                                    bwbVar2.P(0);
                                    this.f.c(bwbVar2, bwbVar2.d);
                                    bwbVar2.L(2);
                                    this.c.L(defVar2.c);
                                    this.m = true;
                                    this.d = 2;
                                }
                            }
                        }
                        int i39 = bwbVar2.d;
                        if (i39 < 15) {
                            bwbVar2.O(i39 + 1);
                            this.m = false;
                        }
                    } else {
                        this.m = false;
                    }
                }
            }
        }
    }

    @Override // defpackage.ddr
    public final void b(cvk cvkVar, dev devVar) {
        devVar.c();
        this.e = devVar.b();
        this.f = cvkVar.s(devVar.a(), 1);
    }

    @Override // defpackage.ddr
    public final void e(long j, int i) {
        this.k = i;
        if (!this.j && (this.o != 0 || !this.m)) {
            this.i = true;
        }
        if (j != -9223372036854775807L) {
            double d = j;
            if (this.i) {
                this.h = d;
            } else {
                this.g = d;
            }
        }
    }

    @Override // defpackage.ddr
    public final void f() {
        this.d = 0;
        this.l = 0;
        this.b.L(2);
        this.n = 0;
        this.o = 0;
        this.q = -2147483647;
        this.r = -1;
        this.s = 0;
        this.t = -1L;
        this.u = false;
        this.i = false;
        this.m = true;
        this.j = true;
        this.g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override // defpackage.ddr
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.ddr
    public final /* synthetic */ void d() {
    }
}
