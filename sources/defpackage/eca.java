package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import internal.org.jni_zero.JniZero;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eca {
    public static final String a = dzf.a("WorkerWrapper");

    public static final Object a(ListenableFuture listenableFuture, dze dzeVar, awoq awoqVar) throws Throwable {
        try {
            if (listenableFuture.isDone()) {
                return b(listenableFuture);
            }
            awud awudVar = new awud(JniZero.q(awoqVar), 1);
            awudVar.w();
            listenableFuture.addListener(new eft(listenableFuture, awudVar, 1), dyu.INSTANCE);
            awudVar.b(new ebz(dzeVar, listenableFuture));
            return awudVar.j();
        } catch (ExecutionException e) {
            throw c(e);
        }
    }

    public static final Object b(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static final Throwable c(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        cause.getClass();
        return cause;
    }
}
