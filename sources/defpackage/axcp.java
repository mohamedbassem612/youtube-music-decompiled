package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axcp implements ListenableFuture {
    private final awwd a;
    private final SettableFuture b = SettableFuture.create();
    private boolean c;

    public axcp(awwd awwdVar) {
        this.a = awwdVar;
    }

    private static final void c(Object obj) throws Throwable {
        if (obj instanceof axco) {
            throw new CancellationException().initCause(((axco) obj).a);
        }
    }

    public final void a(Object obj) {
        this.b.set(obj);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.b.addListener(runnable, executor);
    }

    public final void b(Throwable th) {
        boolean z = th instanceof CancellationException;
        SettableFuture settableFuture = this.b;
        if (z) {
            settableFuture.set(new axco((CancellationException) th));
        } else if (settableFuture.setException(th)) {
            this.c = true;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (!this.b.cancel(z)) {
            return false;
        }
        this.a.p(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws Throwable {
        Object obj = this.b.get();
        c(obj);
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        SettableFuture settableFuture = this.b;
        if (settableFuture.isCancelled()) {
            return true;
        }
        if (isDone() && !this.c) {
            try {
                if (a.i(settableFuture) instanceof axco) {
                    return true;
                }
            } catch (CancellationException unused) {
                return true;
            } catch (ExecutionException unused2) {
                this.c = true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isDone()) {
            try {
                Object objI = a.i(this.b);
                if (objI instanceof axco) {
                    sb.append("CANCELLED, cause=[" + ((axco) objI).a + ']');
                } else {
                    sb.append("SUCCESS, result=[" + objI + ']');
                }
            } catch (CancellationException unused) {
                sb.append("CANCELLED");
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[" + e.getCause() + ']');
            } catch (Throwable th) {
                sb.append("UNKNOWN, cause=[" + th.getClass() + " thrown from get()]");
            }
        } else {
            sb.append("PENDING, delegate=[" + this.b + ']');
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws Throwable {
        Object obj = this.b.get(j, timeUnit);
        c(obj);
        return obj;
    }
}
