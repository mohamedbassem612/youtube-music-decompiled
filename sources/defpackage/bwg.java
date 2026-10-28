package defpackage;

import android.os.SystemClock;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bwg {
    final /* synthetic */ aesp a;
    private final int b;
    private Object c;
    private int d;
    private int e;
    private long f;
    private boolean g;
    private long h;

    public bwg(aesp aespVar, int i) {
        this.a = aespVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bvq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [bvq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [bth, java.lang.Object] */
    public final void a() {
        aesp aespVar = this.a;
        ?? r1 = aespVar.h;
        if (!r1.g()) {
            if (this.g) {
                aespVar.f.b(2);
            }
            this.g = false;
            return;
        }
        btn btnVarW = r1.w();
        Object objF = btnVarW.n() ? null : btnVarW.f(r1.m());
        int iJ = r1.j();
        int iK = r1.k();
        long jR = r1.r();
        if (objF != null && iJ == -1) {
            jR -= btnVarW.m(objF, (btl) aespVar.i).g();
            iJ = -1;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.g && Objects.equals(objF, this.c) && iJ == this.d && iK == this.e && jR == this.f) {
            long j = jElapsedRealtime - this.h;
            int i = this.b;
            if (j >= i) {
                ((cch) aespVar.d).l(new bwj(2, i));
                return;
            }
            return;
        }
        this.g = true;
        this.h = jElapsedRealtime;
        this.c = objF;
        this.d = iJ;
        this.e = iK;
        this.f = jR;
        ?? r0 = aespVar.f;
        r0.b(2);
        r0.i(2, this.b);
    }
}
