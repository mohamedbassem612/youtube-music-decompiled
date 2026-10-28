package defpackage;

import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class afgt implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ afgt(axfd axfdVar, afff afffVar, afgl afglVar, affd affdVar, int i) {
        this.$cid = i;
        this.a = axfdVar;
        this.b = afffVar;
        this.c = afglVar;
        this.d = affdVar;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, xir] */
    /* JADX WARN: Type inference failed for: r1v14, types: [afvl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v3, types: [afgl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, xir] */
    /* JADX WARN: Type inference failed for: r8v14, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r9v22, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) {
        Object objG;
        int i = this.$cid;
        int i2 = 1;
        if (i == 0) {
            afhn afhnVar = (afhn) obj;
            boolean zContains = ((axfd) this.a).c.contains(afhnVar.b.f);
            ?? r3 = this.c;
            Object obj2 = this.d;
            if (!zContains) {
                ahno.P(afhnVar.c != 3, "Can't auto-select disabled accounts.");
            }
            Object obj3 = this.b;
            afff afffVar = (afff) obj3;
            ahno.P(afffVar.a.compareAndSet(false, true), "AccountOperationContext is already in the mutable state. This may be caused by concurrent access to the object, which is forbidden.");
            qsj qsjVar = new qsj(afffVar, 2);
            try {
                ListenableFuture listenableFutureC = r3.c((affd) obj2);
                qsjVar.close();
                idv idvVar = new idv(obj2, obj3, 8);
                long j = afwl.a;
                afwi afwiVar = new afwi(afty.c(false), idvVar);
                Executor executorDirectExecutor = MoreExecutors.directExecutor();
                int i3 = ahcs.c;
                ahcr ahcrVar = new ahcr(listenableFutureC, afwiVar);
                listenableFutureC.addListener(ahcrVar, MoreExecutors.c(executorDirectExecutor, ahcrVar));
                return ahcrVar;
            } catch (Throwable th) {
                try {
                    qsjVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (i != 1) {
            TimeoutException timeoutException = (TimeoutException) obj;
            ?? r0 = this.b;
            int i4 = afwq.a;
            if (!r0.isDone()) {
                ?? r1 = this.d;
                if (r1 != 0) {
                    timeoutException.setStackTrace(afwq.g(r1, null));
                    if (afwt.a(r1)) {
                        afwq.e(agkj.j(r1, timeoutException));
                    }
                    if (afwt.a(r1)) {
                        afwq.d(agkj.j(r1, timeoutException));
                    }
                }
                ahng.z(this.a, r0);
            }
            return this.c;
        }
        Optional optionalOfNullable = (Optional) obj;
        gqh gqhVar = (gqh) this.b;
        vxz vxzVar = gqhVar.i;
        Object obj4 = this.d;
        if (vxzVar.l(14, 45680269L, false) && vxzVar.l(15, 45680270L, false)) {
            Optional optional = ((gnl) obj4).b;
            gfi gfiVar = new gfi(optionalOfNullable, 19);
            if (true == optional.isPresent()) {
                ?? r2 = optional.get();
                Object obj5 = gfiVar.a;
                aihf aihfVarCreateBuilder = amiu.a.createBuilder();
                boolean zIsPresent = ((Optional) obj5).isPresent();
                aihfVarCreateBuilder.copyOnWrite();
                amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
                amiuVar.c |= SemanticState.Focused;
                amiuVar.C = zIsPresent;
                r2.h((amiu) aihfVarCreateBuilder.build());
            }
        }
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(new aher((gnq) optionalOfNullable.get()));
        }
        gqe gqeVar = new gqe(gqhVar, this.a, (woo) this.c, (gnl) obj4);
        if (true != optionalOfNullable.isPresent()) {
            gqh gqhVar2 = gqeVar.a;
            Runnable runnable = gqeVar.b;
            woo wooVar = gqeVar.c;
            gnl gnlVar = gqeVar.d;
            runnable.run();
            gzj.a(wooVar);
            wom womVar = gqhVar2.f;
            ScheduledExecutorService scheduledExecutorService = gqhVar2.d;
            ListenableFuture listenableFutureH = womVar.h(wooVar, scheduledExecutorService);
            Optional optional2 = gnlVar.b;
            if (optional2.isPresent()) {
                optional2.get().f(tau.BROWSE_REQUEST_SENT);
            } else {
                gqhVar2.c.c(new hal());
            }
            objG = afxd.f(listenableFutureH).g(new hco(gqhVar2, wooVar, gnlVar, i2), scheduledExecutorService);
        } else {
            objG = optionalOfNullable.get();
        }
        return (ListenableFuture) objG;
    }

    public /* synthetic */ afgt(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, afvl afvlVar, ListenableFuture listenableFuture3, int i) {
        this.$cid = i;
        this.b = listenableFuture;
        this.c = listenableFuture2;
        this.d = afvlVar;
        this.a = listenableFuture3;
    }

    public /* synthetic */ afgt(gqh gqhVar, gnl gnlVar, Runnable runnable, woo wooVar, int i) {
        this.$cid = i;
        this.b = gqhVar;
        this.d = gnlVar;
        this.a = runnable;
        this.c = wooVar;
    }
}
