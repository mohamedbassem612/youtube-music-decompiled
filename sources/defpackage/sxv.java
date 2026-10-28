package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class sxv extends ahee implements sxu {
    private final SettableFuture a;

    protected sxv(SettableFuture settableFuture) {
        this.a = settableFuture;
    }

    public static sxv c() {
        return new sxv(SettableFuture.create());
    }

    @Override // defpackage.ahee, defpackage.agjb
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ Object b() {
        return this.a;
    }

    @Override // defpackage.sxu
    public final void b(Object obj, Object obj2) {
        this.a.set(obj2);
    }

    @Override // defpackage.ahee, java.util.concurrent.Future
    public final Object get() {
        return a.i(this.a);
    }

    @Override // defpackage.sxu
    public final void iT(Object obj, Exception exc) {
        if (exc == null) {
            exc = new ExecutionException("No exception provided to CallbackFuture.onError", null);
        }
        this.a.setException(exc);
    }

    @Override // defpackage.ahee
    protected final ListenableFuture ia() {
        return this.a;
    }

    @Override // defpackage.ahee
    protected final /* synthetic */ Future ib() {
        return this.a;
    }

    @Override // defpackage.ahee, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return ahng.b(this.a, j, timeUnit);
    }
}
