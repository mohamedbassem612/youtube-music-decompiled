package defpackage;

import android.os.SystemClock;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bwh {
    final /* synthetic */ aesp a;
    private final int b;
    private Object c;
    private int d;
    private int e;
    private boolean f;
    private long g;

    public bwh(aesp aespVar, int i) {
        this.a = aespVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bvq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [bvq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [bth, java.lang.Object] */
    public final void a() {
        long jS;
        aesp aespVar = this.a;
        ?? r1 = aespVar.h;
        btn btnVarW = r1.w();
        Object objF = btnVarW.n() ? null : btnVarW.f(r1.m());
        int iJ = r1.j();
        int iK = r1.k();
        long jR = r1.r();
        if (objF == null || iJ != -1) {
            jS = iJ != -1 ? r1.s() : -9223372036854775807L;
        } else {
            btl btlVar = (btl) aespVar.i;
            btnVarW.m(objF, btlVar);
            jR -= btlVar.g();
            jS = btlVar.f();
            iJ = -1;
        }
        boolean zG = r1.g();
        if (!zG || jS == -9223372036854775807L || jR < jS) {
            ?? r0 = aespVar.f;
            r0.b(3);
            if (zG && jS != -9223372036854775807L) {
                r0.i(3, (int) Math.ceil((jS - jR) / r1.u().b));
            }
            this.f = false;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f && Objects.equals(objF, this.c) && iJ == this.d && iK == this.e) {
            long j = jElapsedRealtime - this.g;
            int i = this.b;
            if (j >= i) {
                ((cch) aespVar.d).l(new bwj(3, i));
                return;
            }
            return;
        }
        this.f = true;
        this.g = jElapsedRealtime;
        this.c = objF;
        this.d = iJ;
        this.e = iK;
        ?? r2 = aespVar.f;
        r2.b(3);
        r2.i(3, this.b);
    }
}
