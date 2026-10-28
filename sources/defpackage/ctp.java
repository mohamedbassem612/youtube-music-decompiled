package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Choreographer;
import android.view.Surface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ctp {
    private final cto c;
    private final ctu d;
    private final long e;
    private boolean f;
    private long i;
    private boolean k;
    private boolean m;
    private boolean n;
    private long o;
    private long p;
    private long q;
    private long r;
    private int g = 0;
    private long h = -9223372036854775807L;
    private long j = -9223372036854775807L;
    private float l = 1.0f;
    public bvd b = bvd.a;
    public long a = 50000;

    public ctp(Context context, cto ctoVar, long j) {
        this.c = ctoVar;
        this.e = j;
        this.d = new ctu(context);
        q();
    }

    private final void p(int i) {
        this.g = Math.min(this.g, i);
    }

    private final void q() {
        this.o = -9223372036854775807L;
        this.p = -9223372036854775807L;
        this.q = -9223372036854775807L;
        this.r = -9223372036854775807L;
    }

    private final void r(long j, long j2) {
        this.p = this.o;
        this.o = j;
        this.r = this.q;
        this.q = j2;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01f3 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00af  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (r37.c.bh(r6, r40, r42, r47, true) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ac, code lost:
    
        if (r37.c.bg(r2, r7) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bc, code lost:
    
        if (r40 >= r44) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c3, code lost:
    
        if (r37.f != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(long r38, long r40, long r42, long r44, boolean r46, boolean r47, long r48, long r50, boolean r52, defpackage.ctn r53) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctp.a(long, long, long, long, boolean, boolean, long, long, boolean, ctn):int");
    }

    public final int b(long j, long j2, long j3, long j4, long j5, long j6, ctn ctnVar) {
        try {
            return a(j, j2, j3, j4, false, false, j5, j6, true, ctnVar);
        } catch (cbo e) {
            throw new IllegalStateException(e);
        }
    }

    public final void c() {
        if (this.g == 0) {
            this.g = 1;
        }
    }

    public final void d(boolean z) {
        this.k = z;
        long j = this.e;
        this.j = j > 0 ? this.b.b() + j : -9223372036854775807L;
    }

    public final void e() {
        this.f = true;
        this.i = bwp.y(this.b.b());
        ctu ctuVar = this.d;
        ctuVar.d = true;
        ctuVar.c();
        if (!ctuVar.b) {
            Context context = ctuVar.a;
            int i = ctr.e;
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            ctr cttVar = null;
            if (displayManager != null) {
                try {
                    Choreographer choreographer = Choreographer.getInstance();
                    cttVar = Build.VERSION.SDK_INT >= 33 ? new ctt(choreographer, displayManager) : new cts(choreographer, displayManager);
                } catch (RuntimeException e) {
                    bvx.f("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
                }
            }
            ctuVar.c = cttVar;
            ctuVar.b = true;
        }
        ctr ctrVar = ctuVar.c;
        if (ctrVar != null) {
            ctrVar.a();
        }
        ctuVar.d(false);
    }

    public final void f() {
        this.f = false;
        this.j = -9223372036854775807L;
        ctu ctuVar = this.d;
        ctuVar.d = false;
        ctr ctrVar = ctuVar.c;
        if (ctrVar != null) {
            ctrVar.b();
        }
        ctuVar.b();
        q();
    }

    public final void g(int i) {
        if (i == 0) {
            this.g = 1;
        } else if (i != 1) {
            p(2);
        } else {
            this.g = 0;
        }
        this.d.c();
    }

    public final void h() {
        this.d.c();
        this.h = -9223372036854775807L;
        p(1);
        this.j = -9223372036854775807L;
        this.n = false;
        q();
    }

    public final void i(int i) {
        ctu ctuVar = this.d;
        if (ctuVar.h != i) {
            ctuVar.h = i;
            ctuVar.d(true);
        }
    }

    public final void j(Surface surface) {
        this.m = surface != null;
        this.n = false;
        ctu ctuVar = this.d;
        if (ctuVar.e != surface) {
            ctuVar.b();
            ctuVar.e = surface;
            ctuVar.d(true);
        }
        p(1);
    }

    public final void k(float f) {
        ahno.F(f > 0.0f);
        if (f != this.l) {
            this.l = f;
            ctu ctuVar = this.d;
            ctuVar.g = f;
            ctuVar.d(false);
        }
    }

    public final void l(float f) {
        ctu ctuVar = this.d;
        if (ctuVar.f != f) {
            ctuVar.f = f;
            ctuVar.d(false);
        }
    }

    public final boolean m() {
        return this.j != -9223372036854775807L;
    }

    public final boolean n(boolean z) {
        if (z && (this.g == 3 || (this.n && !this.m))) {
            this.j = -9223372036854775807L;
            return true;
        }
        if (this.j != -9223372036854775807L) {
            if (this.b.b() < this.j) {
                return true;
            }
            this.j = -9223372036854775807L;
        }
        return false;
    }

    public final boolean o() {
        int i = this.g;
        this.g = 3;
        this.i = bwp.y(this.b.b());
        return i != 3;
    }
}
