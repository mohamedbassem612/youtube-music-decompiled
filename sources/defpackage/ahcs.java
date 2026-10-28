package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ahcs extends aheb implements Runnable {
    public static final /* synthetic */ int c = 0;
    ListenableFuture a;
    Object b;

    public ahcs(ListenableFuture listenableFuture, Object obj) {
        listenableFuture.getClass();
        this.a = listenableFuture;
        obj.getClass();
        this.b = obj;
    }

    public static ListenableFuture e(ListenableFuture listenableFuture, agek agekVar, Executor executor) {
        ahcr ahcrVar = new ahcr(listenableFuture, agekVar);
        listenableFuture.addListener(ahcrVar, MoreExecutors.c(executor, ahcrVar));
        return ahcrVar;
    }

    public static ListenableFuture f(ListenableFuture listenableFuture, ahcy ahcyVar, Executor executor) {
        ahcq ahcqVar = new ahcq(listenableFuture, ahcyVar);
        listenableFuture.addListener(ahcqVar, MoreExecutors.c(executor, ahcqVar));
        return ahcqVar;
    }

    public abstract Object c(Object obj, Object obj2);

    public abstract void d(Object obj);

    @Override // defpackage.ahch
    protected final void gH() {
        l(this.a);
        this.a = null;
        this.b = null;
    }

    @Override // defpackage.ahch
    protected final String jK() {
        ListenableFuture listenableFuture = this.a;
        Object obj = this.b;
        String strJK = super.jK();
        String strCs = listenableFuture != null ? a.cs(listenableFuture, "inputFuture=[", "], ") : "";
        if (obj == null) {
            if (strJK != null) {
                return strCs.concat(strJK);
            }
            return null;
        }
        return strCs + "function=[" + obj.toString() + ']';
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.a;
        Object obj = this.b;
        if (!(isCancelled() | (listenableFuture == null)) && !(obj == null)) {
            this.a = null;
            if (listenableFuture.isCancelled()) {
                setFuture(listenableFuture);
                return;
            }
            try {
                ahno.R(listenableFuture.isDone(), "Future was expected to be done: %s", listenableFuture);
                try {
                    Object objC = c(obj, a.i(listenableFuture));
                    this.b = null;
                    d(objC);
                } catch (Throwable th) {
                    try {
                        ahng.d(th);
                        setException(th);
                    } finally {
                        this.b = null;
                    }
                }
            } catch (Error e) {
                setException(e);
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e2) {
                setException(e2.getCause());
            } catch (Exception e3) {
                setException(e3);
            }
        }
    }
}
