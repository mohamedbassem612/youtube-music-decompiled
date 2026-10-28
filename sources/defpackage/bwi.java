package defpackage;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bwi {
    final /* synthetic */ aesp a;
    private final int b;
    private int c;
    private boolean d;
    private long e;

    public bwi(aesp aespVar, int i) {
        this.a = aespVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [bvq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [bvq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [bth, java.lang.Object] */
    public final void a() {
        aesp aespVar = this.a;
        ?? r1 = aespVar.h;
        int iO = r1.o();
        if (!r1.G() || r1.n() == 1 || r1.n() == 4 || iO == 0 || iO == 1) {
            if (this.d) {
                aespVar.f.b(4);
            }
            this.d = false;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!this.d || this.c != iO) {
            this.d = true;
            this.e = jElapsedRealtime;
            this.c = iO;
            ?? r0 = aespVar.f;
            r0.b(4);
            r0.i(4, this.b);
            return;
        }
        long j = jElapsedRealtime - this.e;
        int i = this.b;
        if (j >= i) {
            ((cch) aespVar.d).l(new bwj(4, i));
        }
    }
}
