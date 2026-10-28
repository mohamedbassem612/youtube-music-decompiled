package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tku implements tgg {
    private final tlr a;
    private final boolean b;
    private final ExecutorService c;
    private final ExecutorService d;
    private final tlj e;
    private final AtomicInteger f;
    private final ayq g;
    private final ayq h;

    public tku(tlj tljVar, ayq ayqVar, ayq ayqVar2) {
        this.e = tljVar;
        this.b = tljVar.M();
        this.c = tljVar.B();
        this.d = tljVar.A();
        tkr tkrVar = (tkr) tljVar;
        if (!tkrVar.p) {
            synchronized (tljVar) {
                if (!((tkr) tljVar).p) {
                    tqj tqjVar = ((tkr) tljVar).n;
                    int i = tqr.a;
                    ((tkr) tljVar).o = tqjVar.k(1073808320) ? ((tkr) tljVar).n.k(1073808325) : tym.ah(((tkr) tljVar).c.a());
                    ((tkr) tljVar).p = true;
                }
            }
        }
        this.a = tkrVar.o ? new tlf(this, tljVar.J()) : tlr.b;
        this.f = new AtomicInteger();
        this.h = ayqVar;
        this.g = ayqVar2;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r8v11, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [awmd, java.lang.Object] */
    @Override // defpackage.tgg
    public final tgz a(tns tnsVar, tha thaVar) {
        ahno.P(!(tnsVar instanceof toc), "Streaming requests should use RequestQueueV2");
        ExecutorService executorService = tnsVar.af() == tnr.d ? this.c : this.d;
        ayq ayqVar = this.g;
        tlj tljVar = this.e;
        String strValueOf = String.valueOf(this.f.getAndIncrement());
        ?? r6 = ayqVar.b;
        int i = tqr.a;
        tko tkoVar = null;
        if (r6.k(1073828828) && (!r6.k(1073829864) || !((tre) ayqVar.c.io()).h.n())) {
            tkoVar = (tko) ayqVar.a.io();
        }
        return new tmb(executorService, tnsVar, tljVar, thaVar, strValueOf, r6, tkoVar).a();
    }

    @Override // defpackage.tgg
    public final tns b(tns tnsVar) {
        ahno.P(!(tnsVar instanceof toc), "Streaming requests should use RequestQueueV2");
        tlj tljVar = this.e;
        boolean zC = tnsVar.C();
        Executor executor = ((tkr) tljVar).k;
        if (zC) {
            executor = tnsVar.af() == tnr.d ? this.c : this.d;
        }
        tlo tloVar = new tlo(executor, tnsVar);
        if (!this.a.d(tnsVar, tloVar)) {
            e(tnsVar, tloVar);
        }
        return tnsVar;
    }

    @Override // defpackage.tgg
    public final ListenableFuture c(tns tnsVar) {
        ahno.P(!(tnsVar instanceof toc), "Streaming requests should use RequestQueueV2");
        SettableFuture settableFutureCreate = SettableFuture.create();
        tlm tlmVar = new tlm(settableFutureCreate, tnsVar);
        if (!this.a.d(tnsVar, tlmVar)) {
            e(tnsVar, tlmVar);
        }
        return settableFutureCreate;
    }

    @Override // defpackage.tgg
    public final void d() {
        if (this.b) {
            ExecutorService executorService = this.d;
            if (executorService instanceof ThreadPoolExecutor) {
                ((ThreadPoolExecutor) executorService).prestartAllCoreThreads();
                ExecutorService executorService2 = this.c;
                if (executorService2 == executorService || !(executorService2 instanceof ThreadPoolExecutor)) {
                    return;
                }
                ((ThreadPoolExecutor) executorService2).prestartAllCoreThreads();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r9v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8, types: [awmd, java.lang.Object] */
    final void e(tns tnsVar, tks tksVar) {
        ExecutorService executorService = tnsVar.af() == tnr.d ? this.c : this.d;
        ayq ayqVar = this.h;
        tlj tljVar = this.e;
        tlr tlrVar = this.a;
        String strValueOf = String.valueOf(this.f.getAndIncrement());
        ?? r7 = ayqVar.b;
        int i = tqr.a;
        tko tkoVar = null;
        if (r7.k(1073828828) && (!r7.k(1073829864) || !((tre) ayqVar.c.io()).h.n())) {
            tkoVar = (tko) ayqVar.a.io();
        }
        new tls(executorService, tnsVar, tljVar, tlrVar, tksVar, strValueOf, r7, tkoVar).h();
    }
}
