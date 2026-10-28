package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tds implements avlw, axsp {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/common/lifecycle/rx/LifecycleSubscribingObserver");
    private final Callable b;
    private avmn c;

    public tds(Callable callable) {
        this.b = callable;
    }

    private final void f() {
        avmn avmnVar = this.c;
        if (avmnVar != null && !avmnVar.f()) {
            this.c.dispose();
        }
        this.c = null;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        f();
        ((agrc) ((agrc) ((agrc) a.b()).j(th)).k("com/google/android/libraries/youtube/common/lifecycle/rx/LifecycleSubscribingObserver", "onError", 82, "LifecycleSubscribingObserver.java")).w("Lifecycle-scoped subscription disposed due to unrelated error in lifecycle: %s", this.b);
    }

    @Override // defpackage.axsp
    public final void e(axsq axsqVar) {
        axsqVar.ko(Long.MAX_VALUE);
    }

    @Override // defpackage.avlw
    public final /* bridge */ /* synthetic */ void kk(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            f();
            return;
        }
        if (this.c == null) {
            try {
                avmn avmnVar = (avmn) this.b.call();
                avmnVar.getClass();
                this.c = avmnVar;
            } catch (Exception e) {
                throw new tdr(e);
            }
        }
    }

    @Override // defpackage.avlw
    public final void kn() {
        f();
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
    }
}
