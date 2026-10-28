package defpackage;

import android.os.ConditionVariable;
import android.os.MessageQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vxt implements MessageQueue.IdleHandler, tqo {
    public final awmd a;
    public volatile int c;
    public final vxr e;
    private final Executor f;
    public final ConditionVariable b = new ConditionVariable();
    public final FutureTask d = new FutureTask(new rru(this, 5));

    public vxt(awmd awmdVar, Executor executor, vxr vxrVar) {
        this.a = awmdVar;
        this.f = executor;
        this.e = vxrVar;
    }

    @Override // defpackage.tqo
    public final void d(Executor executor) {
        FutureTask futureTask = this.d;
        if (executor != null) {
            executor.execute(futureTask);
        } else {
            futureTask.run();
        }
    }

    @Override // defpackage.tqo
    public final boolean e() {
        return true;
    }

    @Override // defpackage.tqo
    public final boolean f() {
        try {
            return ((Boolean) this.d.get()).booleanValue();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        } catch (ExecutionException unused2) {
            return false;
        }
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        this.f.execute(new vlj(this, 14));
        return false;
    }
}
