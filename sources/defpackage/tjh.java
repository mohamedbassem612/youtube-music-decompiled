package defpackage;

import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tjh {
    private final tgk a;
    private final mbc b;
    private long c;
    private long d;

    public tjh(tlj tljVar) {
        tgk tgkVarF = tljVar.F();
        tgkVarF = tgkVarF == null ? tgk.a : tgkVarF;
        mbc mbcVar = ((tkr) tljVar).d;
        this.a = tgkVarF;
        this.b = mbcVar;
        this.c = -1L;
        this.d = -1L;
    }

    private final Duration f(long j) {
        if (j == -1) {
            Duration duration = Duration.ZERO;
            duration.getClass();
            return duration;
        }
        Duration durationOfMillis = Duration.ofMillis(this.b.b() - j);
        durationOfMillis.getClass();
        return durationOfMillis;
    }

    public final void a() {
        this.d = this.b.b();
    }

    public final void b(tns tnsVar, tnx tnxVar) {
        tnsVar.getClass();
        tnxVar.getClass();
        this.a.e(tnsVar, f(this.d));
    }

    public final void c() {
        this.c = this.b.b();
    }

    public final void d(tns tnsVar, tnm tnmVar) {
        tnsVar.getClass();
        tnmVar.getClass();
        this.a.c(tnsVar, tnmVar, f(this.c));
    }

    public final void e(tns tnsVar) {
        tnsVar.getClass();
        this.a.d(tnsVar);
    }
}
