package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ahbz extends aheb implements Runnable {
    public static final /* synthetic */ int d = 0;
    ListenableFuture a;
    Class b;
    Object c;

    public ahbz(ListenableFuture listenableFuture, Class cls, Object obj) {
        listenableFuture.getClass();
        this.a = listenableFuture;
        this.b = cls;
        this.c = obj;
    }

    public static ListenableFuture e(ListenableFuture listenableFuture, Class cls, agek agekVar, Executor executor) {
        ahby ahbyVar = new ahby(listenableFuture, cls, agekVar);
        listenableFuture.addListener(ahbyVar, MoreExecutors.c(executor, ahbyVar));
        return ahbyVar;
    }

    public static ListenableFuture f(ListenableFuture listenableFuture, Class cls, ahcy ahcyVar, Executor executor) {
        ahbx ahbxVar = new ahbx(listenableFuture, cls, ahcyVar);
        listenableFuture.addListener(ahbxVar, MoreExecutors.c(executor, ahbxVar));
        return ahbxVar;
    }

    public abstract Object c(Object obj, Throwable th);

    public abstract void d(Object obj);

    @Override // defpackage.ahch
    protected final void gH() {
        l(this.a);
        this.a = null;
        this.b = null;
        this.c = null;
    }

    @Override // defpackage.ahch
    protected final String jK() {
        ListenableFuture listenableFuture = this.a;
        Class cls = this.b;
        Object obj = this.c;
        String strJK = super.jK();
        String strCs = listenableFuture != null ? a.cs(listenableFuture, "inputFuture=[", "], ") : "";
        if (cls == null || obj == null) {
            if (strJK != null) {
                return strCs.concat(strJK);
            }
            return null;
        }
        return strCs + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + ']';
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object objI;
        ListenableFuture listenableFuture = this.a;
        Class cls = this.b;
        Object obj = this.c;
        if ((((listenableFuture == 0) | (cls == null)) || (obj == null)) || isCancelled()) {
            return;
        }
        this.a = null;
        try {
            th = listenableFuture instanceof ahfq ? ((ahfq) listenableFuture).i() : null;
            if (th == null) {
                ahno.R(listenableFuture.isDone(), "Future was expected to be done: %s", listenableFuture);
                objI = a.i(listenableFuture);
            } else {
                objI = null;
            }
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + String.valueOf(listenableFuture.getClass()) + " threw " + String.valueOf(e.getClass()) + " without a cause");
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            set(objI);
            return;
        }
        if (!cls.isInstance(th)) {
            setFuture(listenableFuture);
            return;
        }
        try {
            Object objC = c(obj, th);
            this.b = null;
            this.c = null;
            d(objC);
        } catch (Throwable th2) {
            try {
                ahng.d(th2);
                setException(th2);
            } finally {
                this.b = null;
                this.c = null;
            }
        }
    }
}
