package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class szr implements szy {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/common/concurrent/DieOnExceptionTaskListener");
    private final Executor b;

    public szr(Executor executor) {
        this.b = executor;
    }

    @Override // defpackage.szy
    public final void a(Throwable th) {
        ((agrc) ((agrc) ((agrc) a.b()).j(th)).k("com/google/android/libraries/youtube/common/concurrent/DieOnExceptionTaskListener", "onThrowable", (char) 25, "DieOnExceptionTaskListener.java")).t("Crashing on uncaught exception");
        this.b.execute(new szq(th, 0));
    }

    @Override // defpackage.szy
    public final /* synthetic */ void c(Throwable th) {
        taq.f(this, th);
    }

    @Override // defpackage.szy
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.szy
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.szy
    public final /* synthetic */ void e() {
    }
}
