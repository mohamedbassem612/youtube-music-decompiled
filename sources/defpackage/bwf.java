package defpackage;

import android.os.SystemClock;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bwf {
    final /* synthetic */ aesp a;
    private final int b;
    private Object c;
    private int d;
    private int e;
    private long f;
    private long g;
    private boolean h;
    private long i;

    public bwf(aesp aespVar, int i) {
        this.a = aespVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [bvq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [bvq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [bth, java.lang.Object] */
    public final void a() {
        aesp aespVar = this.a;
        ?? r1 = aespVar.h;
        if (r1.n() != 2 || !r1.G() || r1.o() != 0) {
            if (this.h) {
                aespVar.f.b(1);
            }
            this.h = false;
            return;
        }
        btn btnVarW = r1.w();
        Object objF = btnVarW.n() ? null : btnVarW.f(r1.m());
        int iJ = r1.j();
        int iK = r1.k();
        long jQ = r1.q();
        long jMax = Math.max(0L, r1.t() - Math.max(0L, jQ - r1.r()));
        if (objF != null && iJ == -1) {
            jQ -= btnVarW.m(objF, (btl) aespVar.i).g();
            iJ = -1;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.h && Objects.equals(objF, this.c) && iJ == this.d && iK == this.e && jQ == this.f && jMax == this.g) {
            long j = jElapsedRealtime - this.i;
            int i = this.b;
            if (j >= i) {
                ((cch) aespVar.d).l(new bwj(1, i));
                return;
            }
            return;
        }
        this.h = true;
        this.i = jElapsedRealtime;
        this.c = objF;
        this.d = iJ;
        this.e = iK;
        this.f = jQ;
        this.g = jMax;
        ?? r0 = aespVar.f;
        r0.b(1);
        r0.i(1, this.b);
    }
}
