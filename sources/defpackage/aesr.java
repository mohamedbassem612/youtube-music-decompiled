package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aesr implements szy {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/systemhealth/termination/LogMoreOnExceptionTaskListener");
    private final awmd b;

    public aesr(awmd awmdVar) {
        this.b = awmdVar;
    }

    @Override // defpackage.szy
    public final void a(Throwable th) {
        ((agrc) ((agrc) ((agrc) a.b()).j(th)).k("com/google/android/libraries/youtube/systemhealth/termination/LogMoreOnExceptionTaskListener", "onThrowable", (char) 30, "LogMoreOnExceptionTaskListener.java")).t("Background Thread Uncaught Exception, log serverside");
        ((aciz) this.b.io()).r(Thread.currentThread(), th);
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
