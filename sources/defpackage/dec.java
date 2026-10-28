package defpackage;

import app.rive.semantics.SemanticState;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dec implements ddr {
    private final String a;
    private final int b;
    private final String c = "video/mp2t";
    private final bwb d;
    private cwj e;
    private String f;
    private bse g;
    private int h;
    private int i;
    private int j;
    private int k;
    private long l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private long r;
    private int s;
    private long t;
    private int u;
    private String v;
    private final dqp w;

    public dec(String str, int i) {
        this.a = str;
        this.b = i;
        bwb bwbVar = new bwb(SemanticState.ReadOnly);
        this.d = bwbVar;
        this.w = new dqp(bwbVar.b, (byte[]) null);
        this.l = -9223372036854775807L;
    }

    private final int g(dqp dqpVar) throws bsz {
        int iF = dqpVar.f();
        aerm aermVarB = cun.b(dqpVar, true);
        this.v = (String) aermVarB.c;
        this.s = aermVarB.b;
        this.u = aermVarB.a;
        return iF - dqpVar.f();
    }

    private static long h(dqp dqpVar) {
        return dqpVar.i((dqpVar.i(2) + 1) << 3);
    }

    @Override // defpackage.ddr
    public final void a(bwb bwbVar) throws bsz {
        int i;
        int i2;
        int i3;
        boolean zU;
        this.e.getClass();
        while (bwbVar.d() > 0) {
            int i4 = this.h;
            if (i4 != 0) {
                if (i4 == 1) {
                    int iN = bwbVar.n();
                    if ((iN & 224) == 224) {
                        this.k = iN;
                        this.h = 2;
                    } else if (iN != 86) {
                        this.h = 0;
                    }
                } else if (i4 != 2) {
                    int iMin = Math.min(bwbVar.d(), this.j - this.i);
                    dqp dqpVar = this.w;
                    bwbVar.K((byte[]) dqpVar.c, this.i, iMin);
                    int i5 = this.i + iMin;
                    this.i = i5;
                    if (i5 == this.j) {
                        dqpVar.q(0);
                        if (dqpVar.u()) {
                            if (this.m) {
                            }
                            this.h = 0;
                        } else {
                            this.m = true;
                            int i6 = dqpVar.i(1);
                            if (i6 == 1) {
                                i3 = dqpVar.i(1);
                                i2 = 1;
                            } else {
                                i2 = i6;
                                i3 = 0;
                            }
                            this.n = i3;
                            if (i3 != 0) {
                                throw new bsz(null, null, true, 1);
                            }
                            if (i2 == 1) {
                                h(dqpVar);
                                i2 = 1;
                            }
                            if (!dqpVar.u()) {
                                throw new bsz(null, null, true, 1);
                            }
                            this.o = dqpVar.i(6);
                            int i7 = dqpVar.i(4);
                            int i8 = dqpVar.i(3);
                            if (i7 != 0 || i8 != 0) {
                                throw new bsz(null, null, true, 1);
                            }
                            if (i2 == 0) {
                                int iH = dqpVar.h();
                                int iG = g(dqpVar);
                                dqpVar.q(iH);
                                byte[] bArr = new byte[(iG + 7) / 8];
                                dqpVar.v(bArr, iG);
                                bsd bsdVar = new bsd();
                                bsdVar.a = this.f;
                                bsdVar.a(this.c);
                                bsdVar.e("audio/mp4a-latm");
                                bsdVar.k = this.v;
                                bsdVar.G = this.u;
                                bsdVar.I = this.s;
                                bsdVar.r = Collections.singletonList(bArr);
                                bsdVar.d = this.a;
                                bsdVar.f = this.b;
                                bse bseVar = new bse(bsdVar);
                                if (!bseVar.equals(this.g)) {
                                    this.g = bseVar;
                                    this.t = 1024000000 / ((long) bseVar.K);
                                    this.e.b(bseVar);
                                }
                            } else {
                                dqpVar.s(((int) h(dqpVar)) - g(dqpVar));
                            }
                            int i9 = dqpVar.i(3);
                            this.p = i9;
                            if (i9 == 0) {
                                dqpVar.s(8);
                            } else if (i9 == 1) {
                                dqpVar.s(9);
                            } else if (i9 == 3 || i9 == 4 || i9 == 5) {
                                dqpVar.s(6);
                            } else {
                                if (i9 != 6 && i9 != 7) {
                                    throw new IllegalStateException();
                                }
                                dqpVar.s(1);
                            }
                            boolean zU2 = dqpVar.u();
                            this.q = zU2;
                            this.r = 0L;
                            if (zU2) {
                                if (i2 != 1) {
                                    do {
                                        zU = dqpVar.u();
                                        this.r = (this.r << 8) + ((long) dqpVar.i(8));
                                    } while (zU);
                                } else {
                                    this.r = h(dqpVar);
                                }
                            }
                            if (dqpVar.u()) {
                                dqpVar.s(8);
                            }
                        }
                        if (this.n != 0) {
                            throw new bsz(null, null, true, 1);
                        }
                        if (this.o != 0) {
                            throw new bsz(null, null, true, 1);
                        }
                        if (this.p != 0) {
                            throw new bsz(null, null, true, 1);
                        }
                        int i10 = 0;
                        while (true) {
                            int i11 = dqpVar.i(8);
                            i = i10 + i11;
                            if (i11 != 255) {
                                break;
                            } else {
                                i10 = i;
                            }
                        }
                        int iH2 = dqpVar.h();
                        int i12 = iH2 & 7;
                        bwb bwbVar2 = this.d;
                        if (i12 == 0) {
                            bwbVar2.P(iH2 >> 3);
                        } else {
                            dqpVar.v(bwbVar2.b, i << 3);
                            bwbVar2.P(0);
                        }
                        this.e.c(this.d, i);
                        ahno.O(this.l != -9223372036854775807L);
                        this.e.e(this.l, 1, i, 0, null);
                        this.l += this.t;
                        if (this.q) {
                            dqpVar.s((int) this.r);
                        }
                        this.h = 0;
                    } else {
                        continue;
                    }
                } else {
                    int iN2 = ((this.k & (-225)) << 8) | bwbVar.n();
                    this.j = iN2;
                    bwb bwbVar3 = this.d;
                    if (iN2 > bwbVar3.b.length) {
                        bwbVar3.L(iN2);
                        this.w.o(bwbVar3.b);
                    }
                    this.i = 0;
                    this.h = 3;
                }
            } else if (bwbVar.n() == 86) {
                this.h = 1;
            }
        }
    }

    @Override // defpackage.ddr
    public final void b(cvk cvkVar, dev devVar) {
        devVar.c();
        this.e = cvkVar.s(devVar.a(), 1);
        this.f = devVar.b();
    }

    @Override // defpackage.ddr
    public final void e(long j, int i) {
        this.l = j;
    }

    @Override // defpackage.ddr
    public final void f() {
        this.h = 0;
        this.l = -9223372036854775807L;
        this.m = false;
    }

    @Override // defpackage.ddr
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.ddr
    public final /* synthetic */ void d() {
    }
}
