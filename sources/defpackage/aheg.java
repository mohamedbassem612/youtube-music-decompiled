package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class aheg extends ahec implements AutoCloseable, ahex {
    protected aheg() {
    }

    @Override // defpackage.ahec, java.lang.AutoCloseable
    public /* synthetic */ void close() {
        a.ar(this);
    }

    protected abstract ahex f();

    @Override // defpackage.ahec
    protected /* bridge */ /* synthetic */ ExecutorService g() {
        throw null;
    }

    @Override // defpackage.ahec, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: i */
    public ListenableFuture submit(Runnable runnable) {
        return f().submit(runnable);
    }

    @Override // defpackage.ahec, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: j */
    public ListenableFuture submit(Callable callable) {
        return f().submit(callable);
    }

    @Override // defpackage.ahec, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: k */
    public ListenableFuture submit(Runnable runnable, Object obj) {
        return f().submit(runnable, obj);
    }
}
