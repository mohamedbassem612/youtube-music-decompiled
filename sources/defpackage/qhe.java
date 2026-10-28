package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.view.Window$OnFrameMetricsAvailableListener;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class qhe implements qed {
    private final Window$OnFrameMetricsAvailableListener a;
    private final aunn b;
    private Activity c;
    private boolean d;
    private final Set e = Collections.newSetFromMap(new WeakHashMap());

    public qhe(aunn aunnVar, Window$OnFrameMetricsAvailableListener window$OnFrameMetricsAvailableListener) {
        this.a = window$OnFrameMetricsAvailableListener;
        this.b = aunnVar;
    }

    private final synchronized void k() {
        Activity activity = this.c;
        if (activity == null || !this.e.add(activity.getWindow())) {
            return;
        }
        activity.getWindow().addOnFrameMetricsAvailableListener(this.a, (Handler) this.b.io());
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037 A[DONT_GENERATE] */
    /* JADX WARN: Instruction removed from duplicated block: B:19:0x0037, please report this as an issue */
    private final synchronized void l(Activity activity) {
        if (activity != null) {
            try {
                if (this.e.remove(activity.getWindow())) {
                    try {
                        activity.getWindow().removeOnFrameMetricsAvailableListener(this.a);
                    } catch (RuntimeException e) {
                        ((agrc) ((agrc) ((agrc) qcq.a.c()).j(e)).k("com/google/android/libraries/performance/primes/metrics/jank/WindowTracker", "detachFromActivity", 'm', "WindowTracker.java")).t("Failed to detach the frame metrics listener");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.qed
    public final void a(Activity activity) {
        synchronized (this) {
            l(activity);
        }
    }

    @Override // defpackage.qed
    public final void b(Activity activity) {
        synchronized (this) {
            this.c = null;
        }
    }

    @Override // defpackage.qed
    public final void c(Activity activity) {
        synchronized (this) {
            this.c = activity;
            if (this.d) {
                k();
            }
        }
    }

    public final synchronized void g() {
        this.d = true;
        k();
    }

    public final synchronized void j() {
        this.d = false;
    }

    @Override // defpackage.qed
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.qed
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.qed
    public final /* synthetic */ void d(Activity activity) {
    }

    @Override // defpackage.qed
    public final /* synthetic */ void e(Activity activity) {
    }

    @Override // defpackage.qed
    public final /* synthetic */ void f(int i) {
    }
}
