package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ddk implements ddr {
    public long a;
    private final bwb b;
    private final String c;
    private final int d;
    private final String e;
    private String f;
    private cwj g;
    private int h;
    private int i;
    private boolean j;
    private long k;
    private bse l;
    private int m;
    private final dqp n;

    public ddk(String str, int i, String str2) {
        dqp dqpVar = new dqp(new byte[SemanticState.Focused], (byte[]) null);
        this.n = dqpVar;
        this.b = new bwb((byte[]) dqpVar.c);
        this.h = 0;
        this.a = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x023f  */
    @Override // defpackage.ddr
    public final void a(bwb bwbVar) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        byte b;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        this.g.getClass();
        while (bwbVar.d() > 0) {
            int i14 = this.h;
            if (i14 == 0) {
                while (bwbVar.d() > 0) {
                    if (this.j) {
                        int iN = bwbVar.n();
                        if (iN == 119) {
                            this.j = false;
                            this.h = 1;
                            byte[] bArr = this.b.b;
                            bArr[0] = 11;
                            bArr[1] = 119;
                            this.i = 2;
                            break;
                        }
                        this.j = iN == 11;
                    } else {
                        this.j = bwbVar.n() == 11;
                    }
                }
            } else if (i14 != 1) {
                int iMin = Math.min(bwbVar.d(), this.m - this.i);
                this.g.c(bwbVar, iMin);
                int i15 = this.i + iMin;
                this.i = i15;
                if (i15 == this.m) {
                    ahno.O(this.a != -9223372036854775807L);
                    this.g.e(this.a, 1, this.m, 0, null);
                    this.a += this.k;
                    this.h = 0;
                }
            } else {
                bwb bwbVar2 = this.b;
                byte[] bArr2 = bwbVar2.b;
                int iMin2 = Math.min(bwbVar.d(), 128 - this.i);
                bwbVar.K(bArr2, this.i, iMin2);
                int i16 = this.i + iMin2;
                this.i = i16;
                if (i16 == 128) {
                    dqp dqpVar = this.n;
                    dqpVar.q(0);
                    int[] iArr = cuo.a;
                    int iH = dqpVar.h();
                    dqpVar.s(40);
                    int i17 = dqpVar.i(5);
                    dqpVar.q(iH);
                    if (i17 > 10) {
                        dqpVar.s(16);
                        int i18 = dqpVar.i(2);
                        if (i18 == 0) {
                            b = 0;
                        } else if (i18 != 1) {
                            b = i18 != 2 ? (byte) -1 : (byte) 2;
                        } else {
                            b = 1;
                        }
                        dqpVar.s(3);
                        int i19 = dqpVar.i(11) + 1;
                        int i20 = dqpVar.i(2);
                        if (i20 == 3) {
                            i8 = cuo.c[dqpVar.i(2)];
                            i7 = 3;
                            i6 = 6;
                        } else {
                            int i21 = dqpVar.i(2);
                            i6 = cuo.a[i21];
                            i7 = i21;
                            i8 = cuo.b[i20];
                        }
                        i5 = i19 << 1;
                        int i22 = (i5 * i8) / (i6 << 5);
                        int i23 = dqpVar.i(3);
                        boolean zU = dqpVar.u();
                        i3 = cuo.d[i23] + (zU ? 1 : 0);
                        dqpVar.s(10);
                        if (dqpVar.u()) {
                            dqpVar.s(8);
                        }
                        if (i23 == 0) {
                            dqpVar.s(5);
                            if (dqpVar.u()) {
                                dqpVar.s(8);
                            }
                            i9 = 0;
                            i23 = 0;
                        } else {
                            i9 = i23;
                        }
                        if (b == 1) {
                            if (dqpVar.u()) {
                                dqpVar.s(16);
                            }
                            b = 1;
                        }
                        if (dqpVar.u()) {
                            if (i9 > 2) {
                                dqpVar.s(2);
                            }
                            if ((i9 & 1) == 0 || i9 <= 2) {
                                i13 = 6;
                            } else {
                                i13 = 6;
                                dqpVar.s(6);
                            }
                            if ((i9 & 4) != 0) {
                                dqpVar.s(i13);
                            }
                            if (zU && dqpVar.u()) {
                                dqpVar.s(5);
                            }
                            if (b == 0) {
                                if (dqpVar.u()) {
                                    dqpVar.s(6);
                                }
                                if (i9 == 0 && dqpVar.u()) {
                                    dqpVar.s(6);
                                }
                                if (dqpVar.u()) {
                                    dqpVar.s(6);
                                }
                                int i24 = dqpVar.i(2);
                                if (i24 == 1) {
                                    dqpVar.s(5);
                                } else if (i24 == 2) {
                                    dqpVar.s(12);
                                } else if (i24 == 3) {
                                    int i25 = dqpVar.i(5);
                                    if (dqpVar.u()) {
                                        dqpVar.s(5);
                                        if (dqpVar.u()) {
                                            dqpVar.s(4);
                                        }
                                        if (dqpVar.u()) {
                                            dqpVar.s(4);
                                        }
                                        if (dqpVar.u()) {
                                            dqpVar.s(4);
                                        }
                                        if (dqpVar.u()) {
                                            dqpVar.s(4);
                                        }
                                        if (dqpVar.u()) {
                                            dqpVar.s(4);
                                        }
                                        if (dqpVar.u()) {
                                            dqpVar.s(4);
                                        }
                                        if (dqpVar.u()) {
                                            dqpVar.s(4);
                                        }
                                        if (dqpVar.u()) {
                                            if (dqpVar.u()) {
                                                dqpVar.s(4);
                                            }
                                            if (dqpVar.u()) {
                                                dqpVar.s(4);
                                            }
                                        }
                                    }
                                    if (dqpVar.u()) {
                                        dqpVar.s(5);
                                        if (dqpVar.u()) {
                                            dqpVar.s(7);
                                            if (dqpVar.u()) {
                                                dqpVar.s(8);
                                            }
                                        }
                                    }
                                    dqpVar.s((i25 + 2) << 3);
                                    dqpVar.m();
                                }
                                if (i9 < 2) {
                                    if (dqpVar.u()) {
                                        dqpVar.s(14);
                                    }
                                    if (i23 == 0 && dqpVar.u()) {
                                        dqpVar.s(14);
                                    }
                                }
                                if (!dqpVar.u()) {
                                    i10 = i7;
                                    b = 0;
                                } else if (i7 == 0) {
                                    dqpVar.s(5);
                                    b = 0;
                                    i10 = 0;
                                } else {
                                    for (int i26 = 0; i26 < i6; i26++) {
                                        if (dqpVar.u()) {
                                            dqpVar.s(5);
                                        }
                                    }
                                    i10 = i7;
                                    b = 0;
                                }
                            } else {
                                i10 = i7;
                            }
                        } else {
                            i10 = i7;
                        }
                        if (dqpVar.u()) {
                            dqpVar.s(5);
                            if (i9 == 2) {
                                dqpVar.s(4);
                                i9 = 2;
                            }
                            if (i9 >= 6) {
                                dqpVar.s(2);
                            }
                            if (dqpVar.u()) {
                                i12 = 8;
                                dqpVar.s(8);
                            } else {
                                i12 = 8;
                            }
                            if (i9 == 0 && dqpVar.u()) {
                                dqpVar.s(i12);
                            }
                            if (i20 < 3) {
                                dqpVar.r();
                            }
                        }
                        if (b == 0 && i10 != 3) {
                            dqpVar.r();
                        }
                        if (b == 2 && (i10 == 3 || dqpVar.u())) {
                            i11 = 6;
                            dqpVar.s(6);
                        } else {
                            i11 = 6;
                        }
                        str = (dqpVar.u() && dqpVar.i(i11) == 1 && dqpVar.i(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                        i4 = i6 << 8;
                        i2 = i8;
                        i = i22;
                    } else {
                        dqpVar.s(32);
                        int i27 = dqpVar.i(2);
                        str = i27 == 3 ? null : "audio/ac3";
                        int i28 = dqpVar.i(6);
                        i = cuo.e[i28 / 2] * 1000;
                        int iA = cuo.a(i27, i28);
                        dqpVar.s(8);
                        int i29 = dqpVar.i(3);
                        if ((i29 & 1) != 0 && i29 != 1) {
                            dqpVar.s(2);
                        }
                        if ((i29 & 4) != 0) {
                            dqpVar.s(2);
                        }
                        if (i29 == 2) {
                            dqpVar.s(2);
                        }
                        i2 = i27 < 3 ? cuo.b[i27] : -1;
                        i3 = cuo.d[i29] + (dqpVar.u() ? 1 : 0);
                        i4 = 1536;
                        i5 = iA;
                    }
                    int i30 = i3;
                    bse bseVar = this.l;
                    if (bseVar == null || i30 != bseVar.I || i2 != bseVar.K || !Objects.equals(str, bseVar.q)) {
                        bsd bsdVar = new bsd();
                        bsdVar.a = this.f;
                        bsdVar.a(this.e);
                        bsdVar.e(str);
                        bsdVar.G = i30;
                        bsdVar.I = i2;
                        bsdVar.d = this.c;
                        bsdVar.f = this.d;
                        bsdVar.j = i;
                        if ("audio/ac3".equals(str)) {
                            bsdVar.i = i;
                        }
                        bse bseVar2 = new bse(bsdVar);
                        this.l = bseVar2;
                        this.g.b(bseVar2);
                    }
                    this.m = i5;
                    this.k = (((long) i4) * 1000000) / ((long) this.l.K);
                    bwbVar2.P(0);
                    this.g.c(bwbVar2, SemanticState.Focused);
                    this.h = 2;
                }
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
    public final void e(long j, int i) {
        this.a = j;
    }

    @Override // defpackage.ddr
    public final void f() {
        this.h = 0;
        this.i = 0;
        this.j = false;
        this.a = -9223372036854775807L;
    }

    @Override // defpackage.ddr
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.ddr
    public final /* synthetic */ void d() {
    }
}
