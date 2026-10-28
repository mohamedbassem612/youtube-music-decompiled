package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class obj {
    private final aunn a;
    private final aunn b;
    private final ExecutorService c;
    private final aunn d;
    private ListenableFuture e = null;

    public obj(aunn aunnVar, aunn aunnVar2, ExecutorService executorService, aunn aunnVar3) {
        this.a = aunnVar;
        this.b = aunnVar2;
        this.c = executorService;
        this.d = aunnVar3;
    }

    public final synchronized ListenableFuture a() {
        ListenableFuture listenableFuture;
        listenableFuture = this.e;
        listenableFuture.getClass();
        return listenableFuture;
    }

    public final synchronized void b() {
        if (this.e != null) {
            return;
        }
        Set set = (Set) this.b.io();
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((obi) it.next()).a());
        }
        omj omjVar = (omj) this.d.io();
        ahdn ahdnVar = new ahdn(agke.j(arrayList), true);
        hys hysVar = new hys(13);
        ExecutorService executorService = this.c;
        int i = ahcs.c;
        ahcr ahcrVar = new ahcr(ahdnVar, hysVar);
        ahdnVar.addListener(ahcrVar, MoreExecutors.c(executorService, ahcrVar));
        omjVar.m(2, ahcrVar);
        this.e = ahcrVar;
        Iterator it2 = ((Set) this.a.io()).iterator();
        while (it2.hasNext()) {
            ((obi) it2.next()).a();
        }
        this.e.getClass();
    }
}
