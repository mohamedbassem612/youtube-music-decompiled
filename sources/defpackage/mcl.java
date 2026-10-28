package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class mcl extends mbv {
    final /* synthetic */ ahey a;

    public mcl(ahey aheyVar) {
        this.a = aheyVar;
    }

    @Override // defpackage.ahec, defpackage.agjb
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ Object b() {
        return this.a;
    }

    @Override // defpackage.mbv, defpackage.ahey
    /* JADX INFO: renamed from: b */
    public final ahew schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return super.schedule(afwl.i(runnable), j, timeUnit);
    }

    @Override // defpackage.mbv, defpackage.ahey
    /* JADX INFO: renamed from: c */
    public final ahew schedule(Callable callable, long j, TimeUnit timeUnit) {
        return super.schedule(afwl.j(callable), j, timeUnit);
    }

    @Override // defpackage.ahec, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        super.execute(afwl.i(runnable));
    }

    @Override // defpackage.mbv, defpackage.aheg
    protected final /* synthetic */ ahex f() {
        return this.a;
    }

    @Override // defpackage.aheg, defpackage.ahec
    protected final /* synthetic */ ExecutorService g() {
        return this.a;
    }

    @Override // defpackage.mbv
    protected final ahey h() {
        return this.a;
    }

    @Override // defpackage.aheg, defpackage.ahex
    /* JADX INFO: renamed from: i */
    public final ListenableFuture submit(Runnable runnable) {
        return super.submit(afwl.i(runnable));
    }

    @Override // defpackage.aheg, defpackage.ahex
    /* JADX INFO: renamed from: j */
    public final ListenableFuture submit(Callable callable) {
        return super.submit(afwl.j(callable));
    }

    @Override // defpackage.aheg, defpackage.ahex
    /* JADX INFO: renamed from: k */
    public final ListenableFuture submit(Runnable runnable, Object obj) {
        return super.submit(afwl.i(runnable), obj);
    }

    @Override // defpackage.mbv, java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule(runnable, j, timeUnit);
    }

    @Override // defpackage.aheg, defpackage.ahec, java.util.concurrent.ExecutorService
    public final /* bridge */ /* synthetic */ Future submit(Runnable runnable) {
        return submit(runnable);
    }

    @Override // defpackage.mbv, java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        return schedule(callable, j, timeUnit);
    }

    @Override // defpackage.aheg, defpackage.ahec, java.util.concurrent.ExecutorService
    public final /* bridge */ /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return submit(runnable, obj);
    }

    @Override // defpackage.aheg, defpackage.ahec, java.util.concurrent.ExecutorService
    public final /* bridge */ /* synthetic */ Future submit(Callable callable) {
        return submit(callable);
    }
}
