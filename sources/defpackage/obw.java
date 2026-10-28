package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class obw implements obi {
    public final obr a;
    public final AtomicReference b = new AtomicReference();
    private final oaq c;
    private final obu d;
    private final ExecutorService e;

    public obw(oaq oaqVar, obu obuVar, obr obrVar, ExecutorService executorService) {
        this.c = oaqVar;
        this.d = obuVar;
        this.a = obrVar;
        this.e = executorService;
    }

    @Override // defpackage.obi
    public final ListenableFuture a() {
        oaq oaqVar = this.c;
        int iBc = a.bc(oaqVar.c);
        if (iBc == 0) {
            iBc = 1;
        }
        obu obuVar = this.d;
        boolean z = oaqVar.e;
        ListenableFuture listenableFutureA = obuVar.a(iBc);
        if (z && iBc != obuVar.e) {
            aheo aheoVarP = aheo.p(listenableFutureA);
            kke kkeVar = new kke(3);
            Executor executorDirectExecutor = MoreExecutors.directExecutor();
            int i = ahbz.d;
            ahby ahbyVar = new ahby(aheoVarP, Throwable.class, kkeVar);
            aheoVarP.addListener(ahbyVar, MoreExecutors.c(executorDirectExecutor, ahbyVar));
            listenableFutureA = ahbyVar.r(new obt(obuVar), MoreExecutors.directExecutor());
        }
        aheo aheoVarQ = aheo.p(listenableFutureA).q(new gqq(this, 17), MoreExecutors.directExecutor());
        iin iinVar = new iin(this, 4);
        aheoVarQ.addListener(new ahei(aheoVarQ, iinVar), this.e);
        return aheoVarQ;
    }
}
