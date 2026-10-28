package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.UrlRequest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axof {
    public final axoy a;
    final Executor b;
    final Executor c;
    public final /* synthetic */ axoh d;

    public axof(axoh axohVar, UrlRequest.Callback callback, Executor executor) {
        this.d = axohVar;
        this.a = new axoy(callback);
        if (axohVar.h) {
            this.b = executor;
            this.c = null;
        } else {
            this.b = new wh(executor, 5);
            this.c = executor;
        }
    }

    final void a(axoi axoiVar, String str) {
        try {
            b(new axmt(this.d, axoiVar, 10), str);
        } catch (RejectedExecutionException e) {
            this.d.b(new axmz("Exception posting task to executor", e));
        }
    }

    final void b(Runnable runnable, String str) {
        new axjt("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnUserExecutor ".concat(str), 0);
        this.b.execute(new axmt(str, runnable, 15));
    }

    public final void c() {
        this.d.d(new axms(this, 17), "maybeReportMetrics");
    }

    final void d() {
        a(new axnx(this, 5), "onResponseStarted");
    }
}
