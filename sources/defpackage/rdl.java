package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.DesugarArrays;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rdl {
    public static final /* synthetic */ int c = 0;
    private static final agkj d;
    public ahex a;
    public final agkj b;

    static {
        rdk rdkVar = rdk.a;
        agke agkeVarQ = agke.q(rdkVar);
        rdk rdkVar2 = rdk.b;
        agke agkeVarQ2 = agke.q(rdkVar2);
        rdk rdkVar3 = rdk.c;
        d = agkj.m(rdkVar, agkeVarQ, rdkVar2, agkeVarQ2, rdkVar3, agke.s(rdk.b, rdk.a, rdkVar3), rdk.d, agpi.a);
    }

    public rdl() {
        agkh agkhVar = new agkh(4);
        agkhVar.i((Map) DesugarArrays.stream(rdk.values()).collect(aghu.a(new rcs(2), new rcs(3))));
        this.b = agkhVar.d(true);
    }

    public final synchronized ListenableFuture a(rdk rdkVar, Callable callable) {
        ConcurrentLinkedDeque concurrentLinkedDeque;
        ListenableFuture listenableFutureSubmit;
        if (this.a == null) {
            ahfi ahfiVar = new ahfi();
            ahfiVar.c("engine-task-thread-%d");
            this.a = MoreExecutors.a(Executors.newSingleThreadExecutor(ahfi.a(ahfiVar)));
        }
        agke agkeVar = (agke) d.get(rdkVar);
        agkeVar.getClass();
        Iterable$EL.forEach(agkeVar, new rcp(this, 3));
        concurrentLinkedDeque = (ConcurrentLinkedDeque) this.b.get(rdkVar);
        concurrentLinkedDeque.getClass();
        ahex ahexVar = this.a;
        ahexVar.getClass();
        listenableFutureSubmit = ahexVar.submit(callable);
        concurrentLinkedDeque.add(listenableFutureSubmit);
        return ahng.h(listenableFutureSubmit).a(new jkb(concurrentLinkedDeque, listenableFutureSubmit, 15, null), MoreExecutors.directExecutor());
    }

    public final boolean b() {
        return Collection.EL.stream(this.b.values()).anyMatch(new jor(19));
    }

    public final boolean c() {
        ConcurrentLinkedDeque concurrentLinkedDeque = (ConcurrentLinkedDeque) this.b.get(rdk.a);
        concurrentLinkedDeque.getClass();
        return !concurrentLinkedDeque.isEmpty();
    }
}
