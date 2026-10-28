package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class szp extends mbv {
    static final List a = new CopyOnWriteArrayList();
    public final vwt b = new vwt((byte[]) null, (byte[]) null, (byte[]) null);
    private final ahey c;

    public szp(ahey aheyVar) {
        this.c = aheyVar;
        a.add(this);
    }

    @Override // defpackage.ahec, defpackage.agjb
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ Object b() {
        return this.c;
    }

    @Override // defpackage.mbv, defpackage.ahey
    /* JADX INFO: renamed from: b */
    public final ahew schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        this.b.R(runnable);
        return super.schedule(runnable, j, timeUnit);
    }

    @Override // defpackage.mbv, defpackage.ahey
    /* JADX INFO: renamed from: c */
    public final ahew schedule(Callable callable, long j, TimeUnit timeUnit) {
        this.b.S(callable);
        return super.schedule(callable, j, timeUnit);
    }

    @Override // defpackage.mbv, defpackage.ahey
    /* JADX INFO: renamed from: d */
    public final ahew scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        this.b.R(runnable);
        return super.scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    @Override // defpackage.mbv, defpackage.ahey
    /* JADX INFO: renamed from: e */
    public final ahew scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        this.b.R(runnable);
        return super.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }

    @Override // defpackage.ahec, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.R(runnable);
        super.execute(runnable);
    }

    @Override // defpackage.mbv, defpackage.aheg
    protected final /* synthetic */ ahex f() {
        return this.c;
    }

    @Override // defpackage.aheg, defpackage.ahec
    protected final /* synthetic */ ExecutorService g() {
        return this.c;
    }

    @Override // defpackage.mbv
    protected final ahey h() {
        return this.c;
    }

    @Override // defpackage.aheg, defpackage.ahex
    /* JADX INFO: renamed from: i */
    public final ListenableFuture submit(Runnable runnable) {
        this.b.R(runnable);
        return super.submit(runnable);
    }

    @Override // defpackage.aheg, defpackage.ahex
    /* JADX INFO: renamed from: j */
    public final ListenableFuture submit(Callable callable) {
        this.b.S(callable);
        return super.submit(callable);
    }

    @Override // defpackage.aheg, defpackage.ahex
    /* JADX INFO: renamed from: k */
    public final ListenableFuture submit(Runnable runnable, Object obj) {
        this.b.R(runnable);
        return super.submit(runnable, obj);
    }

    @Override // defpackage.mbv, java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule(runnable, j, timeUnit);
    }

    @Override // defpackage.mbv, java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    @Override // defpackage.mbv, java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return scheduleWithFixedDelay(runnable, j, j2, timeUnit);
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
