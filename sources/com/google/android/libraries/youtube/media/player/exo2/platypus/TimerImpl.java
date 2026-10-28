package com.google.android.libraries.youtube.media.player.exo2.platypus;

import com.google.android.libraries.youtube.media.interfaces.Executor;
import com.google.android.libraries.youtube.media.interfaces.Timer;
import com.google.android.libraries.youtube.media.interfaces.TimerFactory;
import defpackage.ahno;
import defpackage.xeu;
import defpackage.yno;
import defpackage.zjr;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class TimerImpl extends Timer {
    Future a;
    Callable b;
    private final xeu c;
    private final zjr d;

    /* JADX INFO: compiled from: PG */
    class Factory extends TimerFactory {
        private final xeu a;
        private final zjr b;

        public Factory(xeu xeuVar, zjr zjrVar) {
            this.a = xeuVar;
            this.b = zjrVar;
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.TimerFactory
        public final Timer createOneShotTimer(Executor executor, final long j, long j2, final Runnable runnable) {
            try {
                ahno.F(executor != null);
                ahno.F(runnable != null);
                boolean z = executor instanceof ExecutorImpl;
                ahno.F(z);
                if (runnable == null || !z) {
                    return null;
                }
                final ExecutorImpl executorImpl = (ExecutorImpl) executor;
                TimerImpl timerImpl = new TimerImpl(new Callable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.TimerImpl$Factory$$ExternalSyntheticLambda1
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return executorImpl.a(j, TimeUnit.NANOSECONDS, runnable);
                    }
                }, this.a, this.b);
                timerImpl.a();
                return timerImpl;
            } catch (Throwable th) {
                yno.Q(this.a, th, "Fail to scheduleAfter");
                if (this.b.dU()) {
                    return null;
                }
                throw th;
            }
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.TimerFactory
        public final Timer createRepeatingTimer(Executor executor, final long j, final long j2, long j3, final Runnable runnable) {
            try {
                ahno.F(executor != null);
                ahno.F(runnable != null);
                boolean z = executor instanceof ExecutorImpl;
                ahno.F(z);
                if (runnable == null || !z) {
                    return null;
                }
                final ExecutorImpl executorImpl = (ExecutorImpl) executor;
                TimerImpl timerImpl = new TimerImpl(new Callable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.TimerImpl$Factory$$ExternalSyntheticLambda0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        long j4 = j;
                        long j5 = j2;
                        ExecutorImpl executorImpl2 = executorImpl;
                        Runnable runnable2 = runnable;
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        return executorImpl2.a ? ahno.aj(new ExecutorImpl$$ExternalSyntheticLambda4(executorImpl2, runnable2), j4, j5, timeUnit, executorImpl2.e, executorImpl2.b) : ahno.aj(new ExecutorImpl$$ExternalSyntheticLambda1(runnable2), j4, j5, timeUnit, executorImpl2.e, executorImpl2.b);
                    }
                }, this.a, this.b);
                timerImpl.a();
                return timerImpl;
            } catch (Throwable th) {
                yno.Q(this.a, th, "Fail to scheduleAfter");
                if (this.b.dU()) {
                    return null;
                }
                throw th;
            }
        }
    }

    public TimerImpl(Callable callable, xeu xeuVar, zjr zjrVar) {
        this.b = callable;
        this.c = xeuVar;
        this.d = zjrVar;
    }

    final void a() {
        Callable callable;
        if (this.a != null || (callable = this.b) == null) {
            return;
        }
        try {
            this.a = (Future) callable.call();
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.Timer
    public final boolean active() {
        try {
            Future future = this.a;
            return (future == null || future.isDone()) ? false : true;
        } catch (Throwable th) {
            yno.Q(this.c, th, "Active timer");
            if (this.d.dU()) {
                throw th;
            }
            return false;
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.Timer
    public final void deactivate() {
        try {
            Future future = this.a;
            if (future != null) {
                future.cancel(false);
                this.b = null;
            }
        } catch (Throwable th) {
            yno.Q(this.c, th, "Deactivate timer");
            if (!this.d.dU()) {
                throw th;
            }
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.Timer
    public final void reset() {
        Future future = this.a;
        if (future == null || future.isDone()) {
            return;
        }
        try {
            this.a.cancel(false);
            Callable callable = this.b;
            if (callable != null) {
                this.a = (Future) callable.call();
            }
        } catch (Throwable th) {
            yno.Q(this.c, th, "Reset timer");
        }
    }
}
