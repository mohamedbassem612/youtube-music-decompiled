package defpackage;

import app.rive.semantics.SemanticState;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ddo implements ddr {
    private static final byte[] c = {73, 68, 51};
    private final boolean d;
    private final String f;
    private final int g;
    private final String h;
    private String i;
    private cwj j;
    private cwj k;
    private int l;
    private int m;
    private int n;
    private boolean o;
    private boolean p;
    private int s;
    private boolean t;
    private int u;
    private cwj v;
    private long w;
    private final dqp x = new dqp(new byte[7], (byte[]) null);
    private final bwb e = new bwb(Arrays.copyOf(c, 10));
    private int q = -1;
    private int r = -1;
    public long a = -9223372036854775807L;
    public long b = -9223372036854775807L;

    public ddo(boolean z, String str, int i, String str2) {
        this.d = z;
        this.f = str;
        this.g = i;
        this.h = str2;
        i();
    }

    public static boolean g(int i) {
        return (i & 65526) == 65520;
    }

    private final void h() {
        this.p = false;
        i();
    }

    private final void i() {
        this.l = 0;
        this.m = 0;
        this.n = SemanticState.Hidden;
    }

    private final void j() {
        this.l = 3;
        this.m = 0;
    }

    private final void k(cwj cwjVar, long j, int i, int i2) {
        this.l = 4;
        this.m = i;
        this.v = cwjVar;
        this.w = j;
        this.u = i2;
    }

    private final boolean l(bwb bwbVar, byte[] bArr, int i) {
        int iMin = Math.min(bwbVar.d(), i - this.m);
        bwbVar.K(bArr, this.m, iMin);
        int i2 = this.m + iMin;
        this.m = i2;
        return i2 == i;
    }

    private static final boolean m(bwb bwbVar, byte[] bArr, int i) {
        if (bwbVar.d() < i) {
            return false;
        }
        bwbVar.K(bArr, 0, i);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0256  */
    /* JADX WARN: Code duplicated, block: B:105:0x025a  */
    /* JADX WARN: Code duplicated, block: B:107:0x025e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0262  */
    /* JADX WARN: Code duplicated, block: B:138:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x022d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x022d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x022d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x0292 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x028c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x0286 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x026e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:73:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:75:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:77:0x0202  */
    /* JADX WARN: Code duplicated, block: B:82:0x0215  */
    @Override // defpackage.ddr
    public final void a(bwb bwbVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        byte[] bArr;
        int i6;
        int i7;
        byte b;
        int i8;
        int i9;
        int i10;
        byte b2;
        this.j.getClass();
        int i11 = bwp.a;
        while (bwbVar.d() > 0) {
            int i12 = this.l;
            int i13 = 4;
            int i14 = 3;
            int i15 = 2;
            if (i12 == 0) {
                byte[] bArr2 = bwbVar.b;
                int i16 = bwbVar.c;
                int i17 = bwbVar.d;
                while (true) {
                    if (i16 < i17) {
                        int i18 = i16 + 1;
                        byte b3 = bArr2[i16];
                        int i19 = b3 & 255;
                        int i20 = i14;
                        if (this.n == 512 && g((((byte) i19) & 255) | 65280)) {
                            if (!this.p) {
                                int i21 = i16 - 1;
                                bwbVar.P(i16);
                                dqp dqpVar = this.x;
                                if (m(bwbVar, (byte[]) dqpVar.c, 1)) {
                                    dqpVar.q(i13);
                                    int i22 = dqpVar.i(1);
                                    int i23 = this.q;
                                    if (i23 == -1 || i22 == i23) {
                                        if (this.r == -1) {
                                            if (m(bwbVar, (byte[]) dqpVar.c, i13)) {
                                                dqpVar.q(14);
                                                i5 = dqpVar.i(13);
                                                if (i5 >= 7) {
                                                    bArr = bwbVar.b;
                                                    i6 = bwbVar.d;
                                                    i7 = i21 + i5;
                                                    if (i7 >= i6) {
                                                        b = bArr[i7];
                                                        if (b == -1) {
                                                            i10 = i7 + 1;
                                                            if (i10 != i6) {
                                                                b2 = bArr[i10];
                                                                if (g((b2 & 255) | 65280) || ((b2 & 8) >> 3) != i22) {
                                                                }
                                                            }
                                                        } else if (b == 73 || ((i8 = i7 + 1) != i6 && (bArr[i8] != 68 || ((i9 = i7 + 2) != i6 && bArr[i9] != 51)))) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (m(bwbVar, (byte[]) dqpVar.c, 1)) {
                                            dqpVar.q(i15);
                                            if (dqpVar.i(i13) == this.r) {
                                                bwbVar.P(i16 + 1);
                                                if (m(bwbVar, (byte[]) dqpVar.c, i13)) {
                                                    dqpVar.q(14);
                                                    i5 = dqpVar.i(13);
                                                    if (i5 >= 7) {
                                                        bArr = bwbVar.b;
                                                        i6 = bwbVar.d;
                                                        i7 = i21 + i5;
                                                        if (i7 >= i6) {
                                                            b = bArr[i7];
                                                            if (b == -1) {
                                                                i10 = i7 + 1;
                                                                if (i10 != i6) {
                                                                    b2 = bArr[i10];
                                                                    if (g((b2 & 255) | 65280)) {
                                                                    }
                                                                }
                                                            } else if (b == 73) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                i = this.n;
                                i2 = i19 | i;
                                if (i2 != 329) {
                                    i3 = 2;
                                    i4 = 768;
                                } else if (i2 != 511) {
                                    i3 = 2;
                                    i4 = SemanticState.LiveRegion;
                                } else if (i2 != 836) {
                                    i3 = 2;
                                    i4 = SemanticState.ReadOnly;
                                } else if (i2 != 1075) {
                                    this.l = 2;
                                    this.m = i20;
                                    this.u = 0;
                                    this.e.P(0);
                                    bwbVar.P(i18);
                                } else if (i != 256) {
                                    this.n = SemanticState.Hidden;
                                    i14 = i20;
                                    i13 = 4;
                                    i15 = 2;
                                } else {
                                    i20 = i20;
                                    i3 = 2;
                                    i14 = i20;
                                    i16 = i18;
                                    i13 = 4;
                                    i15 = i3;
                                }
                                this.n = i4;
                                i14 = i20;
                                i16 = i18;
                                i13 = 4;
                                i15 = i3;
                            }
                            this.s = (b3 & 8) >> 3;
                            this.o = 1 == ((b3 & 1) ^ 1);
                            if (this.p) {
                                j();
                            } else {
                                this.l = 1;
                                this.m = 0;
                            }
                            bwbVar.P(i18);
                        } else {
                            i = this.n;
                            i2 = i19 | i;
                            if (i2 != 329) {
                                i3 = 2;
                                i4 = 768;
                            } else if (i2 != 511) {
                                i3 = 2;
                                i4 = SemanticState.LiveRegion;
                            } else if (i2 != 836) {
                                i3 = 2;
                                i4 = SemanticState.ReadOnly;
                            } else if (i2 != 1075) {
                                this.l = 2;
                                this.m = i20;
                                this.u = 0;
                                this.e.P(0);
                                bwbVar.P(i18);
                            } else if (i != 256) {
                                this.n = SemanticState.Hidden;
                                i14 = i20;
                                i13 = 4;
                                i15 = 2;
                            } else {
                                i20 = i20;
                                i3 = 2;
                                i14 = i20;
                                i16 = i18;
                                i13 = 4;
                                i15 = i3;
                            }
                            this.n = i4;
                            i14 = i20;
                            i16 = i18;
                            i13 = 4;
                            i15 = i3;
                        }
                    } else {
                        bwbVar.P(i16);
                    }
                }
            } else if (i12 != 1) {
                if (i12 == 2) {
                    bwb bwbVar2 = this.e;
                    if (l(bwbVar, bwbVar2.b, 10)) {
                        this.k.c(bwbVar2, 10);
                        bwbVar2.P(6);
                        k(this.k, 0L, 10, bwbVar2.m() + 10);
                    }
                } else if (i12 != 3) {
                    int iMin = Math.min(bwbVar.d(), this.u - this.m);
                    this.v.c(bwbVar, iMin);
                    int i24 = this.m + iMin;
                    this.m = i24;
                    if (i24 == this.u) {
                        ahno.O(this.b != -9223372036854775807L);
                        this.v.e(this.b, 1, this.u, 0, null);
                        this.b += this.w;
                        i();
                    }
                } else {
                    int i25 = true != this.o ? 5 : 7;
                    dqp dqpVar2 = this.x;
                    if (l(bwbVar, (byte[]) dqpVar2.c, i25)) {
                        dqpVar2.q(0);
                        if (this.t) {
                            dqpVar2.s(10);
                        } else {
                            int i26 = dqpVar2.i(2) + 1;
                            if (i26 != 2) {
                                bvx.e("AdtsReader", a.bP(i26, "Detected audio object type: ", ", but assuming AAC LC."));
                            }
                            dqpVar2.s(5);
                            int i27 = dqpVar2.i(3);
                            int i28 = this.r;
                            int i29 = cun.a;
                            byte[] bArr3 = {(byte) (((i28 >> 1) & 7) | 16), (byte) (((i28 << 7) & SemanticState.Focused) | ((i27 << 3) & 120))};
                            aerm aermVarA = cun.a(bArr3);
                            bsd bsdVar = new bsd();
                            bsdVar.a = this.i;
                            bsdVar.a(this.h);
                            bsdVar.e("audio/mp4a-latm");
                            bsdVar.k = (String) aermVarA.c;
                            bsdVar.G = aermVarA.a;
                            bsdVar.I = aermVarA.b;
                            bsdVar.r = Collections.singletonList(bArr3);
                            bsdVar.d = this.f;
                            bsdVar.f = this.g;
                            bse bseVar = new bse(bsdVar);
                            this.a = 1024000000 / ((long) bseVar.K);
                            this.j.b(bseVar);
                            this.t = true;
                        }
                        dqpVar2.s(4);
                        int i30 = dqpVar2.i(13);
                        int i31 = i30 - 7;
                        if (this.o) {
                            i31 = i30 - 9;
                        }
                        k(this.j, this.a, 0, i31);
                    }
                }
            } else if (bwbVar.d() != 0) {
                dqp dqpVar3 = this.x;
                ((byte[]) dqpVar3.c)[0] = bwbVar.b[bwbVar.c];
                dqpVar3.q(2);
                int i32 = dqpVar3.i(4);
                int i33 = this.r;
                if (i33 == -1 || i32 == i33) {
                    if (!this.p) {
                        this.p = true;
                        this.q = this.s;
                        this.r = i32;
                    }
                    j();
                } else {
                    h();
                }
            }
        }
    }

    @Override // defpackage.ddr
    public final void b(cvk cvkVar, dev devVar) {
        devVar.c();
        this.i = devVar.b();
        cwj cwjVarS = cvkVar.s(devVar.a(), 1);
        this.j = cwjVarS;
        this.v = cwjVarS;
        if (!this.d) {
            this.k = new cvf();
            return;
        }
        devVar.c();
        cwj cwjVarS2 = cvkVar.s(devVar.a(), 5);
        this.k = cwjVarS2;
        bsd bsdVar = new bsd();
        bsdVar.a = devVar.b();
        bsdVar.a(this.h);
        bsdVar.e("application/id3");
        cwjVarS2.b(new bse(bsdVar));
    }

    @Override // defpackage.ddr
    public final void e(long j, int i) {
        this.b = j;
    }

    @Override // defpackage.ddr
    public final void f() {
        this.b = -9223372036854775807L;
        h();
    }

    @Override // defpackage.ddr
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.ddr
    public final /* synthetic */ void d() {
    }
}
