package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qrk implements ahcy {
    public final List a;
    public final Executor b;

    public qrk(List list, Executor executor) {
        this.a = list;
        this.b = executor;
    }

    @Override // defpackage.ahcy
    public final /* synthetic */ ListenableFuture a(Object obj) {
        List list = this.a;
        int i = ((agpi) list).d;
        hwe hweVar = (hwe) obj;
        ArrayList arrayList = new ArrayList(i);
        int i2 = 0;
        agqs agqsVarListIterator = ((agke) list).listIterator(0);
        while (agqsVarListIterator.hasNext()) {
            arrayList.add(((qrh) agqsVarListIterator.next()).c());
        }
        qrj qrjVar = new qrj(this, arrayList, i, i2);
        long j = afwl.a;
        ahdb ahdbVar = new ahdb(afty.c(false), qrjVar, 1);
        qrx qrxVar = (qrx) hweVar.a;
        afud afudVar = qrxVar.e;
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        afudVar.a();
        ListenableFuture listenableFutureO = ahng.o(qrxVar.c.a());
        ahdb ahdbVar2 = new ahdb(afty.c(false), new okv(hweVar, ahdbVar, executorDirectExecutor, 4, null), 1);
        Executor executorDirectExecutor2 = MoreExecutors.directExecutor();
        int i3 = ahcs.c;
        ahcq ahcqVar = new ahcq(listenableFutureO, ahdbVar2);
        listenableFutureO.addListener(ahcqVar, MoreExecutors.c(executorDirectExecutor2, ahcqVar));
        agel agelVar = new agel();
        Executor executorDirectExecutor3 = MoreExecutors.directExecutor();
        ahcr ahcrVar = new ahcr(ahcqVar, agelVar);
        ahcqVar.addListener(ahcrVar, MoreExecutors.c(executorDirectExecutor3, ahcrVar));
        ahdb ahdbVar3 = new ahdb(afty.c(false), new qrj(this, i, arrayList, 2), 1);
        Executor executorDirectExecutor4 = MoreExecutors.directExecutor();
        ahcq ahcqVar2 = new ahcq(ahcrVar, ahdbVar3);
        ahcrVar.addListener(ahcqVar2, MoreExecutors.c(executorDirectExecutor4, ahcqVar2));
        return ahcqVar2;
    }
}
