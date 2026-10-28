package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class qec extends qdw implements qed {
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final qdy c;
    private qci d;

    public qec(qdy qdyVar) {
        this.c = qdyVar;
    }

    @Override // defpackage.qed
    public final void a(Activity activity) {
        this.d = null;
    }

    @Override // defpackage.qed
    public final void c(Activity activity) {
        this.d = null;
    }

    @Override // defpackage.qed
    public final void d(Activity activity) {
        this.d = null;
        Context applicationContext = activity.getApplicationContext();
        if (qel.e(applicationContext, qel.f(applicationContext))) {
            l(new qci(activity.getClass().getSimpleName()));
        } else {
            if (this.b.getAndSet(true)) {
                return;
            }
            ((agrc) ((agrc) qcq.a.c()).k("com/google/android/libraries/performance/primes/foreground/ProcessImportanceForegroundSignalAdapter", "onActivityStarted", 59, "ProcessImportanceForegroundSignalAdapter.java")).t("Activity started with background importance");
        }
    }

    @Override // defpackage.qed
    public final void e(Activity activity) {
        qci qciVarC = qci.c(activity.getClass());
        this.d = qciVarC;
        Context applicationContext = activity.getApplicationContext();
        if (qel.e(applicationContext, qel.f(applicationContext))) {
            return;
        }
        k(qciVarC);
    }

    @Override // defpackage.qed
    public final void f(int i) {
        qci qciVar;
        if (i >= 20 && (qciVar = this.d) != null) {
            k(qciVar);
        }
        this.d = null;
    }

    @Override // defpackage.qdw
    public final void g(qci qciVar) {
        this.c.g(qciVar);
    }

    @Override // defpackage.qed
    public final void h() {
        this.d = null;
    }

    @Override // defpackage.qdw
    public final void j(qci qciVar) {
        this.c.j(qciVar);
    }

    @Override // defpackage.qed
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.qed
    public final /* synthetic */ void b(Activity activity) {
    }
}
