package defpackage;

import android.app.Activity;
import android.os.Looper;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qch implements Executor, qed {
    public final ahey a;
    private final awmd d;
    private final kjc f;
    private final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
    private volatile boolean c = false;
    private final AtomicBoolean e = new AtomicBoolean();

    public qch(ahey aheyVar, kjc kjcVar, awmd awmdVar) {
        this.a = aheyVar;
        this.f = kjcVar;
        this.d = awmdVar;
        qef qefVar = ((qeg) kjcVar.a).a;
        int i = qef.c;
        if (qefVar.b.get() > 0) {
            k();
        } else {
            kjcVar.E(this);
        }
    }

    private final void j() {
        while (true) {
            Runnable runnable = (Runnable) this.b.poll();
            if (runnable == null) {
                return;
            } else {
                this.a.execute(runnable);
            }
        }
    }

    private final void k() {
        this.a.schedule(new ebs(this, 15), 3000L, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.qed
    public final void c(Activity activity) {
        this.f.F(this);
        k();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.c) {
            this.a.execute(runnable);
            return;
        }
        this.b.add(runnable);
        if (this.c) {
            j();
        } else {
            if (this.e.getAndSet(true)) {
                return;
            }
            if (((Boolean) ((agev) this.d.io()).e(Boolean.FALSE)).booleanValue()) {
                Looper.getMainLooper().getQueue().addIdleHandler(new xij(this, 1));
            } else {
                this.a.schedule(new iug(this, 20), 7000L, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void g() {
        this.c = true;
        j();
    }

    @Override // defpackage.qed
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.qed
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.qed
    public final /* synthetic */ void a(Activity activity) {
    }

    @Override // defpackage.qed
    public final /* synthetic */ void b(Activity activity) {
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
