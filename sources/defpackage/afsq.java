package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afsq {
    public static final agrf a = agrf.h("com/google/apps/tiktok/sync/monitoring/SyncMonitoringDispatcherImpl");
    public final awmd b;
    public final awmd c;
    public final ahpu d;
    private final awmd e;

    public afsq(ahpu ahpuVar, awmd awmdVar, awmd awmdVar2, awmd awmdVar3) {
        this.d = ahpuVar;
        this.e = awmdVar;
        this.b = awmdVar2;
        this.c = awmdVar3;
    }

    public final ListenableFuture a(ListenableFuture listenableFuture, ahcy ahcyVar) {
        Set set = (Set) this.e.io();
        int size = set.size();
        aguu.ag(size, "expectedSize");
        agkx agkxVar = new agkx(size);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            agkxVar.c(new afsp(ahcyVar, (afsr) it.next(), 0));
        }
        return this.d.h(new ojf(listenableFuture, 18), agkxVar.g());
    }
}
