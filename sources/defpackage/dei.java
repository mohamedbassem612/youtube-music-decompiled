package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dei implements dew {
    public int b;
    private final ddr c;
    private int d;
    private boolean e;
    private boolean f;
    private boolean g;
    private int h;
    private boolean i;
    private long j;
    private nzd k;
    private final dqp l = new dqp(new byte[10], (byte[]) null);
    public int a = 0;

    public dei(ddr ddrVar) {
        this.c = ddrVar;
    }

    private final void d(int i) {
        this.a = i;
        this.d = 0;
    }

    private final boolean e(bwb bwbVar, byte[] bArr, int i) {
        int iMin = Math.min(bwbVar.d(), i - this.d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            bwbVar.Q(iMin);
        } else {
            bwbVar.K(bArr, this.d, iMin);
        }
        int i2 = this.d + iMin;
        this.d = i2;
        return i2 == i;
    }

    @Override // defpackage.dew
    public final void a(bwb bwbVar, int i) {
        int i2;
        int i3;
        long j;
        long jB;
        long j2;
        this.k.getClass();
        int i4 = -1;
        int i5 = 2;
        if ((i & 1) != 0) {
            int i6 = this.a;
            if (i6 != 0 && i6 != 1) {
                if (i6 != 2) {
                    int i7 = this.b;
                    if (i7 != -1) {
                        bvx.e("PesReader", a.bP(i7, "Unexpected start indicator: expected ", " more bytes"));
                    }
                    this.c.d();
                } else {
                    bvx.e("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            if (bwbVar.d == 0) {
                this.c.c();
            }
            d(1);
        }
        int i8 = i;
        while (bwbVar.d() > 0) {
            int i9 = this.a;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 != i5) {
                        int iD = bwbVar.d();
                        int i10 = this.b;
                        int i11 = i10 != i4 ? iD - i10 : 0;
                        if (i11 > 0) {
                            iD -= i11;
                            bwbVar.O(bwbVar.c + iD);
                        }
                        ddr ddrVar = this.c;
                        ddrVar.a(bwbVar);
                        int i12 = this.b;
                        if (i12 != i4) {
                            int i13 = i12 - iD;
                            this.b = i13;
                            if (i13 == 0) {
                                ddrVar.d();
                                d(1);
                            }
                        }
                    } else {
                        int iMin = Math.min(10, this.h);
                        dqp dqpVar = this.l;
                        if (e(bwbVar, (byte[]) dqpVar.c, iMin) && e(bwbVar, null, this.h)) {
                            dqpVar.q(0);
                            this.j = -9223372036854775807L;
                            if (this.e) {
                                dqpVar.s(4);
                                long jI = dqpVar.i(3);
                                dqpVar.s(1);
                                j = -9223372036854775807L;
                                int i14 = dqpVar.i(15) << 15;
                                dqpVar.s(1);
                                long jI2 = dqpVar.i(15);
                                dqpVar.s(1);
                                if (this.g || !this.f) {
                                    j2 = jI;
                                } else {
                                    dqpVar.s(4);
                                    j2 = jI;
                                    long jI3 = ((long) dqpVar.i(3)) << 30;
                                    dqpVar.s(1);
                                    int i15 = dqpVar.i(15) << 15;
                                    dqpVar.s(1);
                                    long jI4 = dqpVar.i(15);
                                    dqpVar.s(1);
                                    if (this.k.b(jI3 | ((long) i15) | jI4) != -9223372036854775807L) {
                                        this.g = true;
                                    }
                                }
                                jB = this.k.b((j2 << 30) | ((long) i14) | jI2);
                                this.j = jB;
                            } else {
                                j = -9223372036854775807L;
                                jB = -9223372036854775807L;
                            }
                            if (jB != j || this.k.j()) {
                                i8 |= true != this.i ? 0 : 4;
                                this.c.e(this.j, i8);
                                d(3);
                                i4 = -1;
                                i5 = 2;
                            } else {
                                d(0);
                                i3 = -1;
                                i2 = 2;
                            }
                        }
                    }
                    i2 = i5;
                    i3 = i4;
                } else {
                    dqp dqpVar2 = this.l;
                    if (e(bwbVar, (byte[]) dqpVar2.c, 9)) {
                        int i16 = 0;
                        dqpVar2.q(0);
                        int i17 = dqpVar2.i(24);
                        if (i17 != 1) {
                            bvx.e("PesReader", a.bR(i17, "Unexpected start code prefix: "));
                            this.b = -1;
                            i3 = -1;
                            i2 = 2;
                        } else {
                            dqpVar2.s(8);
                            int i18 = dqpVar2.i(16);
                            dqpVar2.s(5);
                            this.i = dqpVar2.u();
                            i2 = 2;
                            dqpVar2.s(2);
                            this.e = dqpVar2.u();
                            this.f = dqpVar2.u();
                            dqpVar2.s(6);
                            int i19 = dqpVar2.i(8);
                            this.h = i19;
                            i3 = -1;
                            if (i18 == 0) {
                                this.b = -1;
                            } else {
                                int i20 = (i18 - 3) - i19;
                                this.b = i20;
                                if (i20 < 0) {
                                    bvx.e("PesReader", a.bR(i20, "Found negative packet payload size: "));
                                    this.b = -1;
                                }
                            }
                            i16 = 2;
                        }
                        d(i16);
                    } else {
                        i3 = -1;
                        i2 = 2;
                    }
                }
            } else {
                i2 = i5;
                i3 = i4;
                bwbVar.Q(bwbVar.d());
            }
            i4 = i3;
            i5 = i2;
        }
    }

    @Override // defpackage.dew
    public final void b() {
        this.a = 0;
        this.d = 0;
        this.g = false;
        this.c.f();
    }

    @Override // defpackage.dew
    public final void c(nzd nzdVar, cvk cvkVar, dev devVar) {
        this.k = nzdVar;
        this.c.b(cvkVar, devVar);
    }
}
