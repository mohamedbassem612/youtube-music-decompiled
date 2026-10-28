package defpackage;

import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class szv extends mbv implements AutoCloseable, ahey {
    private final ahey a;
    private final szu b;

    private szv(ahey aheyVar, szu szuVar) {
        this.a = aheyVar;
        this.b = szuVar;
    }

    public static szv l(ahey aheyVar, boolean z) {
        spa spaVar = new spa(new ahfg(aheyVar));
        if (z) {
            spaVar.d();
        }
        return new szv(aheyVar, spaVar.c());
    }

    @Override // defpackage.ahec, defpackage.agjb
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ Object b() {
        return this.a;
    }

    @Override // defpackage.mbv, defpackage.aheg, defpackage.ahec, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        a.ar(this);
    }

    @Override // defpackage.ahec, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.execute(runnable);
    }

    @Override // defpackage.mbv, defpackage.aheg
    protected final /* synthetic */ ahex f() {
        return this.a;
    }

    @Override // defpackage.aheg, defpackage.ahec
    protected final /* synthetic */ ExecutorService g() {
        return this.a;
    }

    @Override // defpackage.mbv
    protected final ahey h() {
        return this.a;
    }
}
