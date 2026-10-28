package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class szt implements szy {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/common/concurrent/LogOnExceptionTaskListener");

    @Override // defpackage.szy
    public final void a(Throwable th) {
        ((agrc) ((agrc) ((agrc) a.b()).j(th)).k("com/google/android/libraries/youtube/common/concurrent/LogOnExceptionTaskListener", "onThrowable", (char) 18, "LogOnExceptionTaskListener.java")).t("Uncaught exception");
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
