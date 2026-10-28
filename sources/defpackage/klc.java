package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class klc {
    private static klc e;
    public int a;
    public final Object b;
    public final Executor c;
    public Object d;

    public klc(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.d = new kkx(this);
        this.a = 1;
        this.c = scheduledExecutorService;
        this.b = context.getApplicationContext();
    }

    public static synchronized klc a(Context context) {
        klc klcVar;
        klcVar = e;
        if (klcVar == null) {
            ksy ksyVar = kyq.a;
            klcVar = new klc(context, ksy.ak(new ktb("MessengerIpcClient", 0)));
            e = klcVar;
        }
        return klcVar;
    }

    private final synchronized int i() {
        int i;
        i = this.a;
        this.a = i + 1;
        return i;
    }

    private final synchronized lpa j(kkz kkzVar) {
        if (!((kkx) this.d).e(kkzVar)) {
            kkx kkxVar = new kkx(this);
            this.d = kkxVar;
            kkxVar.e(kkzVar);
        }
        return (lpa) kkzVar.d.a;
    }

    public final lpa b(int i, Bundle bundle) {
        return j(new kky(i(), i, bundle));
    }

    public final lpa c(int i, Bundle bundle) {
        return j(new klb(i(), i, bundle));
    }

    public final ListenableFuture d() {
        Object obj = this.d;
        if (obj == aimp.SUCCESSFUL) {
            return obj == null ? aher.a : new aher(obj);
        }
        ListenableFuture listenableFutureC = ((qrx) this.b).c();
        gqq gqqVar = new gqq(this, 11);
        Executor executor = this.c;
        long j = afwl.a;
        afwi afwiVar = new afwi(afty.c(false), gqqVar);
        int i = ahcs.c;
        ahcr ahcrVar = new ahcr(listenableFutureC, afwiVar);
        listenableFutureC.addListener(ahcrVar, MoreExecutors.c(executor, ahcrVar));
        return ahcrVar;
    }

    public final ListenableFuture e() {
        return ((qrx) this.b).c();
    }

    public final ListenableFuture f() {
        if (Build.VERSION.SDK_INT >= 36 || this.d == aimp.SUCCESSFUL) {
            return new aher(Boolean.TRUE);
        }
        ListenableFuture listenableFutureD = d();
        hys hysVar = new hys(12);
        Executor executor = this.c;
        long j = afwl.a;
        afwi afwiVar = new afwi(afty.c(false), hysVar);
        int i = ahcs.c;
        ahcr ahcrVar = new ahcr(listenableFutureD, afwiVar);
        listenableFutureD.addListener(ahcrVar, MoreExecutors.c(executor, ahcrVar));
        return ahcrVar;
    }

    public final ListenableFuture g() {
        return (Build.VERSION.SDK_INT >= 36 || this.d == aimp.SUCCESSFUL) ? ahng.n(Boolean.FALSE) : ahno.ar(d(), new iqj(17), this.c);
    }

    public final ListenableFuture h(aimp aimpVar) {
        return ((qrx) this.b).a(new iii(aimpVar, 16), this.c);
    }

    public klc(qrx qrxVar, Executor executor) {
        this.d = aimp.NOT_SET;
        this.a = -1;
        this.b = qrxVar;
        this.c = executor;
    }
}
