package com.google.android.libraries.youtube.media.player.exo2.platypus;

import com.google.android.libraries.youtube.media.interfaces.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import defpackage.ahew;
import defpackage.ahey;
import defpackage.ahfg;
import defpackage.ajtv;
import defpackage.alot;
import defpackage.mbc;
import defpackage.tab;
import defpackage.taf;
import defpackage.xeu;
import defpackage.xff;
import defpackage.yno;
import defpackage.zik;
import defpackage.zjr;
import defpackage.ztf;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class ExecutorImpl extends Executor implements java.util.concurrent.Executor {
    public final boolean a;
    final ahey b;
    final java.util.concurrent.Executor c;
    final xeu d;
    public final mbc e;
    private final zjr f;

    public ExecutorImpl(ahey aheyVar, xeu xeuVar, zjr zjrVar, mbc mbcVar) {
        this.a = zjrVar.i.l(239, 45711912L, false);
        this.b = aheyVar;
        this.c = new ahfg(aheyVar);
        this.d = xeuVar;
        this.f = zjrVar;
        this.e = mbcVar;
    }

    private final void c(ListenableFuture listenableFuture) {
        taf.i(listenableFuture, MoreExecutors.directExecutor(), new tab() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.ExecutorImpl$$ExternalSyntheticLambda2
            @Override // defpackage.twi
            /* JADX INFO: renamed from: b */
            public final void a(Throwable th) {
                this.a.b(th);
            }
        }, taf.c, new ExecutorImpl$$ExternalSyntheticLambda3());
    }

    final ListenableFuture a(long j, TimeUnit timeUnit, Runnable runnable) {
        boolean z = this.a;
        ahey aheyVar = this.b;
        if (z) {
            return aheyVar.schedule(new ExecutorImpl$$ExternalSyntheticLambda4(this, runnable), j, timeUnit);
        }
        ahew ahewVarSchedule = aheyVar.schedule(new ExecutorImpl$$ExternalSyntheticLambda1(runnable), j, timeUnit);
        c(ahewVarSchedule);
        return ahewVarSchedule;
    }

    public final void b(Throwable th) {
        xeu xeuVar = this.d;
        if (!xeuVar.b) {
            xeuVar.b(yno.cy(th, 3, ajtv.ERROR_LEVEL_WARNING, "Platypus executor error."));
            return;
        }
        xff xffVarA = xeuVar.a(yno.cx(th, 3, ajtv.ERROR_LEVEL_WARNING, "Platypus executor error."), alot.CLIENT_ERROR);
        ztf ztfVar = xffVarA.k.e;
        xffVarA.l = ztfVar.a();
        ztfVar.k(xffVarA);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        schedule(runnable);
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.Executor
    public final boolean isOnExecutor() {
        return Thread.holdsLock(zik.class);
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.Executor
    public final void schedule(Runnable runnable) {
        if (runnable != null) {
            try {
                if (this.a) {
                    this.c.execute(new ExecutorImpl$$ExternalSyntheticLambda0(this, runnable));
                } else {
                    c(this.b.schedule(new ExecutorImpl$$ExternalSyntheticLambda1(runnable), 0L, TimeUnit.SECONDS));
                }
            } catch (Throwable th) {
                yno.Q(this.d, th, "Fail to schedule");
                if (!this.f.dU()) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.Executor
    public final void scheduleAfter(long j, Runnable runnable) {
        if (runnable != null) {
            try {
                a(j, TimeUnit.MILLISECONDS, runnable);
            } catch (Throwable th) {
                yno.Q(this.d, th, "Fail to scheduleAfter");
                if (!this.f.dU()) {
                    throw th;
                }
            }
        }
    }
}
