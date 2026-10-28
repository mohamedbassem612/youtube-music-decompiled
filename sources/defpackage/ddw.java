package defpackage;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ddw implements ddr {
    private static final float[] a = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private ddv f;
    private long g;
    private String h;
    private cwj i;
    private boolean j;
    private final kwq l;
    private final boolean[] c = new boolean[4];
    private final ddu d = new ddu();
    private long k = -9223372036854775807L;
    private final deg e = new deg(178);
    private final bwb b = new bwb();

    public ddw(kwq kwqVar) {
        this.l = kwqVar;
    }

    @Override // defpackage.ddr
    public final void a(bwb bwbVar) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        float f;
        this.f.getClass();
        this.i.getClass();
        int i3 = bwbVar.c;
        int i4 = bwbVar.d;
        byte[] bArr = bwbVar.b;
        this.g += (long) bwbVar.d();
        this.i.c(bwbVar, bwbVar.d());
        while (true) {
            int iB = bxf.b(bArr, i3, i4, this.c);
            if (iB == i4) {
                break;
            }
            int i5 = iB + 3;
            byte b = bwbVar.b[i5];
            int i6 = b & 255;
            int i7 = iB - i3;
            if (this.j) {
                i = i4;
            } else {
                if (i7 > 0) {
                    this.d.a(bArr, i3, iB);
                }
                int i8 = i7 < 0 ? -i7 : 0;
                ddu dduVar = this.d;
                int i9 = dduVar.c;
                if (i9 != 0) {
                    i = i4;
                    if (i9 != 1) {
                        if (i9 != 2) {
                            if (i9 != 3) {
                                if (i6 != 179) {
                                    if (i6 == 181) {
                                        i6 = 181;
                                    }
                                }
                                int i10 = dduVar.d - i8;
                                dduVar.d = i10;
                                dduVar.b = false;
                                cwj cwjVar = this.i;
                                int i11 = dduVar.e;
                                String str = this.h;
                                str.getClass();
                                byte[] bArrCopyOf = Arrays.copyOf(dduVar.f, i10);
                                dqp dqpVar = new dqp(bArrCopyOf, (byte[]) null);
                                dqpVar.t(i11);
                                dqpVar.t(4);
                                dqpVar.r();
                                dqpVar.s(8);
                                if (dqpVar.u()) {
                                    dqpVar.s(4);
                                    dqpVar.s(3);
                                }
                                int i12 = dqpVar.i(4);
                                if (i12 == 15) {
                                    int i13 = dqpVar.i(8);
                                    int i14 = dqpVar.i(8);
                                    if (i14 == 0) {
                                        bvx.e("H263Reader", "Invalid aspect ratio");
                                        f = 1.0f;
                                    } else {
                                        f = i13 / i14;
                                    }
                                } else if (i12 < 7) {
                                    f = a[i12];
                                } else {
                                    bvx.e("H263Reader", "Invalid aspect ratio");
                                    f = 1.0f;
                                }
                                if (dqpVar.u()) {
                                    dqpVar.s(2);
                                    dqpVar.s(1);
                                    if (dqpVar.u()) {
                                        dqpVar.s(15);
                                        dqpVar.r();
                                        dqpVar.s(15);
                                        dqpVar.r();
                                        dqpVar.s(15);
                                        dqpVar.r();
                                        dqpVar.s(3);
                                        dqpVar.s(11);
                                        dqpVar.r();
                                        dqpVar.s(15);
                                        dqpVar.r();
                                    }
                                }
                                if (dqpVar.i(2) != 0) {
                                    bvx.e("H263Reader", "Unhandled video object layer shape");
                                }
                                dqpVar.r();
                                int i15 = dqpVar.i(16);
                                dqpVar.r();
                                if (dqpVar.u()) {
                                    if (i15 == 0) {
                                        bvx.e("H263Reader", "Invalid vop_increment_time_resolution");
                                    } else {
                                        int i16 = i15 - 1;
                                        int i17 = 0;
                                        while (i16 > 0) {
                                            i16 >>= 1;
                                            i17++;
                                        }
                                        dqpVar.s(i17);
                                    }
                                }
                                dqpVar.r();
                                int i18 = dqpVar.i(13);
                                dqpVar.r();
                                int i19 = dqpVar.i(13);
                                dqpVar.r();
                                dqpVar.r();
                                bsd bsdVar = new bsd();
                                bsdVar.a = str;
                                bsdVar.a("video/mp2t");
                                bsdVar.e("video/mp4v-es");
                                bsdVar.u = i18;
                                bsdVar.v = i19;
                                bsdVar.B = f;
                                bsdVar.r = Collections.singletonList(bArrCopyOf);
                                cwjVar.b(new bse(bsdVar));
                                this.j = true;
                            } else if ((b & 240) != 32) {
                                bvx.e("H263Reader", "Unexpected start code value");
                                dduVar.b();
                            } else {
                                dduVar.e = dduVar.d;
                                dduVar.c = 4;
                            }
                        } else if (i6 > 31) {
                            bvx.e("H263Reader", "Unexpected start code value");
                            dduVar.b();
                        } else {
                            dduVar.c = 3;
                        }
                    } else if (i6 != 181) {
                        bvx.e("H263Reader", "Unexpected start code value");
                        dduVar.b();
                    } else {
                        dduVar.c = 2;
                    }
                } else {
                    i = i4;
                    if (i6 == 176) {
                        dduVar.c = 1;
                        dduVar.b = true;
                        i6 = 176;
                    }
                }
                dduVar.a(ddu.a, 0, 3);
            }
            this.f.a(bArr, i3, iB);
            deg degVar = this.e;
            if (i7 > 0) {
                degVar.a(bArr, i3, iB);
                i2 = 0;
            } else {
                i2 = -i7;
            }
            if (degVar.d(i2)) {
                int iE = bxf.e(degVar.b, degVar.c);
                bwb bwbVar2 = this.b;
                int i20 = bwp.a;
                bwbVar2.N(degVar.b, iE);
                this.l.D(this.k, bwbVar2);
            }
            if (i6 == 178) {
                z = true;
                if (bwbVar.b[iB + 2] == 1) {
                    degVar.c(178);
                }
                i6 = 178;
            } else {
                z = true;
            }
            int i21 = i - iB;
            this.f.b(this.g - ((long) i21), i21, this.j);
            ddv ddvVar = this.f;
            long j = this.k;
            ddvVar.d = i6;
            ddvVar.c = false;
            if (i6 == 182) {
                z2 = z;
            } else if (i6 == 179) {
                z2 = z;
                i6 = 179;
            } else {
                z2 = false;
            }
            ddvVar.a = z2;
            ddvVar.b = i6 == 182 ? z : false;
            ddvVar.e = 0;
            ddvVar.f = j;
            i3 = i5;
            i4 = i;
        }
        if (!this.j) {
            this.d.a(bArr, i3, i4);
        }
        this.f.a(bArr, i3, i4);
        this.e.a(bArr, i3, i4);
    }

    @Override // defpackage.ddr
    public final void b(cvk cvkVar, dev devVar) {
        devVar.c();
        this.h = devVar.b();
        this.i = cvkVar.s(devVar.a(), 2);
        this.f = new ddv(this.i);
        this.l.E(cvkVar, devVar);
    }

    @Override // defpackage.ddr
    public final void c() {
        ddv ddvVar = this.f;
        ddvVar.getClass();
        ddvVar.b(this.g, 0, this.j);
        this.f.c();
    }

    @Override // defpackage.ddr
    public final void e(long j, int i) {
        this.k = j;
    }

    @Override // defpackage.ddr
    public final void f() {
        bxf.i(this.c);
        this.d.b();
        ddv ddvVar = this.f;
        if (ddvVar != null) {
            ddvVar.c();
        }
        this.e.b();
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    @Override // defpackage.ddr
    public final /* synthetic */ void d() {
    }
}
