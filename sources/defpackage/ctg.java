package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ctg implements cuc {
    public bse a;
    public cua b;
    public Executor c;
    final /* synthetic */ cti d;
    private agke e;
    private long f;
    private long g;
    private int h;

    public ctg(cti ctiVar, Context context) {
        this.d = ctiVar;
        bwp.ac(context);
        this.e = agpi.a;
        this.g = -9223372036854775807L;
        this.b = cua.b;
        this.c = cti.a;
    }

    private static final void y(bse bseVar) {
        bsd bsdVar = new bsd(bseVar);
        bsdVar.E = cti.b(bseVar.G);
        new bse(bsdVar);
        throw null;
    }

    @Override // defpackage.cuc
    public final Surface a() {
        ahno.O(false);
        throw null;
    }

    @Override // defpackage.cuc
    public final void b() {
        cti ctiVar = this.d;
        if (ctiVar.j.a() == 0) {
            ctiVar.a();
            return;
        }
        bwn bwnVar = new bwn();
        boolean z = true;
        while (ctiVar.j.a() > 0) {
            axjf axjfVar = (axjf) ctiVar.j.c();
            axjfVar.getClass();
            if (z) {
                int i = axjfVar.c;
                if (i == 0 || i == 1) {
                    axjfVar = new axjf(axjfVar.b, 0, axjfVar.a);
                } else {
                    ctiVar.a();
                }
            }
            bwnVar.e(axjfVar.a, axjfVar);
            z = false;
        }
        ctiVar.j = bwnVar;
    }

    @Override // defpackage.cuc
    public final void c() {
        bwc bwcVar = bwc.a;
        int i = bwcVar.b;
        int i2 = bwcVar.c;
        this.d.m = null;
    }

    @Override // defpackage.cuc
    public final void d(boolean z) {
        this.g = -9223372036854775807L;
        cti ctiVar = this.d;
        if (ctiVar.o == 1) {
            ctiVar.n++;
            cuc cucVar = ctiVar.e;
            cucVar.d(z);
            while (ctiVar.j.a() > 1) {
                ctiVar.j.c();
            }
            if (ctiVar.j.a() == 1) {
                axjf axjfVar = (axjf) ctiVar.j.c();
                axjfVar.getClass();
                cucVar.v(ctiVar.k, axjfVar.b, axjfVar.c, agpi.a);
            }
            ctiVar.p = -9223372036854775807L;
            bvq bvqVar = ctiVar.l;
            bvqVar.getClass();
            bvqVar.d(new cqc(ctiVar, 7));
        }
    }

    @Override // defpackage.cuc
    public final void e(boolean z) {
        cti ctiVar = this.d;
        if (ctiVar.d) {
            ctiVar.e.e(z);
        }
    }

    @Override // defpackage.cuc
    public final void g() {
        cti ctiVar = this.d;
        if (ctiVar.o != 2) {
            bvq bvqVar = ctiVar.l;
            if (bvqVar != null) {
                bvqVar.f();
            }
            ctiVar.m = null;
            ctiVar.o = 2;
        }
    }

    @Override // defpackage.cuc
    public final void h(long j, long j2) {
        this.d.e.h(j + this.f, j2);
    }

    @Override // defpackage.cuc
    public final void i(long j) {
        this.f = j;
    }

    @Override // defpackage.cuc
    public final void j(int i) {
        this.d.e.j(i);
    }

    @Override // defpackage.cuc
    public final void k(cua cuaVar, Executor executor) {
        this.b = cuaVar;
        this.c = executor;
    }

    @Override // defpackage.cuc
    public final void l(Surface surface, bwc bwcVar) {
        cti ctiVar = this.d;
        Pair pair = ctiVar.m;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((bwc) ctiVar.m.second).equals(bwcVar)) {
            return;
        }
        ctiVar.m = Pair.create(surface, bwcVar);
        int i = bwcVar.b;
        int i2 = bwcVar.c;
    }

    @Override // defpackage.cuc
    public final void m(float f) {
        cti ctiVar = this.d;
        ctiVar.i.d(f);
        ctiVar.e.m(f);
    }

    @Override // defpackage.cuc
    public final void n(List list) {
        if (aguu.v(this.e, list)) {
            return;
        }
        this.e = agke.n(list);
        bse bseVar = this.a;
        if (bseVar != null) {
            y(bseVar);
        }
    }

    @Override // defpackage.cuc
    public final void o(ctm ctmVar) {
        ((cst) this.d.e).e = ctmVar;
    }

    @Override // defpackage.cuc
    public final void p() {
        cti ctiVar = this.d;
        if (ctiVar.p >= this.g) {
            ctiVar.e.p();
        }
    }

    @Override // defpackage.cuc
    public final void q() {
        cti ctiVar = this.d;
        if (ctiVar.d) {
            ctiVar.e.q();
        }
    }

    @Override // defpackage.cuc
    public final void r() {
        cti ctiVar = this.d;
        if (ctiVar.d) {
            ctiVar.e.r();
        }
    }

    @Override // defpackage.cuc
    public final boolean s() {
        return false;
    }

    @Override // defpackage.cuc
    public final boolean t() {
        return false;
    }

    @Override // defpackage.cuc
    public final boolean u(boolean z) {
        return this.d.e.u(false);
    }

    @Override // defpackage.cuc
    public final void v(bse bseVar, long j, int i, List list) {
        ahno.O(false);
        this.e = agke.n(list);
        this.a = bseVar;
        y(bseVar);
        long j2 = this.g;
        cti ctiVar = this.d;
        long j3 = -4611686018427387904L;
        if (ctiVar.d) {
            if (j2 != -9223372036854775807L) {
                j3 = 1 + j2;
            }
        } else if (j2 != -9223372036854775807L) {
            return;
        }
        long j4 = j3;
        ctiVar.j.e(j4, new axjf(this.f + j, i, j4));
    }

    @Override // defpackage.cuc
    public final boolean w(long j, csz cszVar) {
        int i;
        ahno.O(false);
        long j2 = j + this.f;
        cti ctiVar = this.d;
        long jA = ctiVar.i.a(j2);
        if (jA != -9223372036854775807L && jA < ctiVar.h && (i = this.h) < 2) {
            this.h = i + 1;
            cszVar.a();
            return true;
        }
        int i2 = ctiVar.q;
        if (i2 == -1 || i2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003d A[Catch: bvn -> 0x00a0, TryCatch #0 {bvn -> 0x00a0, blocks: (B:7:0x0014, B:9:0x0019, B:11:0x001f, B:13:0x0025, B:15:0x0038, B:17:0x003d, B:21:0x004c, B:23:0x0052, B:28:0x006f, B:19:0x0044), top: B:39:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0044 A[Catch: bvn -> 0x00a0, TryCatch #0 {bvn -> 0x00a0, blocks: (B:7:0x0014, B:9:0x0019, B:11:0x001f, B:13:0x0025, B:15:0x0038, B:17:0x003d, B:21:0x004c, B:23:0x0052, B:28:0x006f, B:19:0x0044), top: B:39:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[Catch: bvn -> 0x00a0, TRY_LEAVE, TryCatch #0 {bvn -> 0x00a0, blocks: (B:7:0x0014, B:9:0x0019, B:11:0x001f, B:13:0x0025, B:15:0x0038, B:17:0x003d, B:21:0x004c, B:23:0x0052, B:28:0x006f, B:19:0x0044), top: B:39:0x0014 }] */
    @Override // defpackage.cuc
    public final void x(bse bseVar) throws cub {
        boolean zK;
        bru bruVar;
        cti ctiVar = this.d;
        ahno.O(ctiVar.o == 0);
        bru bruVarB = cti.b(bseVar.G);
        try {
            int i = bruVarB.d;
            if (i != 7) {
                int[] iArr = bvo.a;
                if (i == 6) {
                    zK = bvo.j();
                } else {
                    if (i == 7) {
                        zK = bvo.k("EGL_EXT_gl_colorspace_bt2020_hlg");
                    } else if (i != 2 || i == 10) {
                        bruVarB = bru.a;
                    }
                    bruVar = bruVarB;
                }
                if (zK && Build.VERSION.SDK_INT >= 29) {
                    bvx.e("PlaybackVidGraphWrapper", bwp.K("Color transfer %d is not supported. Falling back to OpenGl tone mapping.", Integer.valueOf(i)));
                    bruVarB = bru.a;
                } else if (i != 2) {
                    bruVarB = bru.a;
                } else {
                    bruVarB = bru.a;
                }
                bruVar = bruVarB;
            } else if (Build.VERSION.SDK_INT >= 34 || !bvo.j()) {
                i = 7;
                int[] iArr2 = bvo.a;
                if (i == 6) {
                    zK = bvo.j();
                } else {
                    if (i == 7) {
                        zK = bvo.k("EGL_EXT_gl_colorspace_bt2020_hlg");
                    } else if (i != 2) {
                        bruVarB = bru.a;
                    } else {
                        bruVarB = bru.a;
                    }
                    bruVar = bruVarB;
                }
                if (zK) {
                    if (i != 2) {
                        bruVarB = bru.a;
                    } else {
                        bruVarB = bru.a;
                    }
                } else if (i != 2) {
                    bruVarB = bru.a;
                } else {
                    bruVarB = bru.a;
                }
                bruVar = bruVarB;
            } else {
                bruVar = new bru(bruVarB.b, bruVarB.c, 6, bruVarB.e, bruVarB.f, bruVarB.g);
            }
            bvd bvdVar = ctiVar.f;
            Looper looperMyLooper = Looper.myLooper();
            looperMyLooper.getClass();
            ctiVar.l = bvdVar.d(looperMyLooper, null);
            try {
                ctiVar.r.o(ctiVar.b, bruVar, brx.a, ctiVar, new bvp(ctiVar.l, new qcb(ctiVar, null)));
                throw null;
            } catch (btv e) {
                throw new cub(e, bseVar);
            }
        } catch (bvn e2) {
            throw new cub(e2, bseVar);
        }
    }

    @Override // defpackage.cuc
    public final void f() {
    }
}
