package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class epk implements ListenableFuture {
    final WeakReference a;
    public final epf b = new epj(this);

    public epk(epg epgVar) {
        this.a = new WeakReference(epgVar);
    }

    public final void a(Throwable th) {
        eoz eozVar = new eoz(th);
        eow eowVar = epf.b;
        epf epfVar = this.b;
        if (eowVar.d(epfVar, null, eozVar)) {
            epf.b(epfVar);
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.b.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        epg epgVar = (epg) this.a.get();
        boolean zCancel = this.b.cancel(z);
        if (!zCancel || epgVar == null) {
            return zCancel;
        }
        epgVar.a = null;
        epgVar.b = null;
        epgVar.c.c(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
