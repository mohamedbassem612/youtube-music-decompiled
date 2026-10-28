package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class afng implements ahcx {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ afng(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // defpackage.ahcx
    public final ListenableFuture a() {
        agpr agprVar;
        ListenableFuture aherVar;
        int i = this.$cid;
        if (i == 0) {
            Object obj = this.c;
            Object obj2 = this.a;
            return ((afnj) obj2).l.h(new jnu(obj, obj2, 9, null), (agkz) this.b);
        }
        if (i == 1) {
            afxd afxdVarF = afxd.f(((syn) this.b).n(this.c.e()));
            Object obj3 = this.a;
            hqj hqjVar = new hqj(obj3, 6);
            Executor executor = ((htp) obj3).h;
            return afxdVarF.h(hqjVar, executor).g(new hrk(obj3, 14), executor);
        }
        if (i == 2) {
            return ((afry) this.a).g(this.b, ((Long) this.c).longValue());
        }
        ?? r0 = this.b;
        ahno.R(r0.isDone(), "Future was expected to be done: %s", r0);
        Set set = (Set) a.i(r0);
        ?? r2 = this.c;
        ahno.R(r2.isDone(), "Future was expected to be done: %s", r2);
        Set set2 = (Set) a.i(r2);
        set.getClass();
        set2.getClass();
        agqb agqbVar = new agqb(set, set2);
        set2.getClass();
        set.getClass();
        agqb agqbVar2 = new agqb(set2, set);
        Object obj4 = this.a;
        afry afryVar = (afry) obj4;
        afryVar.i(agqbVar);
        HashSet hashSet = new HashSet();
        Object obj5 = afryVar.h;
        synchronized (obj5) {
            try {
                for (afsa afsaVar : ((afry) obj4).i.keySet()) {
                    if (agqbVar2.contains(afsaVar.c)) {
                        hashSet.add(afsaVar);
                    }
                }
                synchronized (obj5) {
                    try {
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            ListenableFuture listenableFuture = (ListenableFuture) ((afry) obj4).j.get((afsa) it.next());
                            if (listenableFuture != null) {
                                listenableFuture.cancel(false);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!agqbVar.isEmpty() && agqbVar2.isEmpty()) {
                    return aher.a;
                }
                agprVar = agpr.a;
                if (agprVar == null) {
                    aherVar = aher.a;
                } else {
                    aherVar = new aher(agprVar);
                }
                ListenableFuture listenableFutureF = afryVar.f(aherVar);
                abzy abzyVar = new abzy(17);
                Executor executorDirectExecutor = MoreExecutors.directExecutor();
                long j = afwl.a;
                ahcr ahcrVar = new ahcr(listenableFutureF, new afwi(afty.c(false), abzyVar));
                listenableFutureF.addListener(ahcrVar, MoreExecutors.c(executorDirectExecutor, ahcrVar));
                return ahcrVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ((afry) obj4).i.keySet().removeAll(hashSet);
        afjn afjnVar = ((afry) obj4).d;
        afrr afrrVar = ((afry) obj4).e;
        ListenableFuture listenableFutureSubmit = afrrVar.c.submit(new fzs(afrrVar, hashSet, 18));
        afjnVar.b(listenableFutureSubmit, "SyncManager: removeAccounts");
        afjn.d(149, listenableFutureSubmit, "Error removing accounts from sync. IDs: %s", agqbVar2);
        if (!agqbVar.isEmpty()) {
        }
        agprVar = agpr.a;
        if (agprVar == null) {
            aherVar = aher.a;
        } else {
            aherVar = new aher(agprVar);
        }
        ListenableFuture listenableFutureF2 = afryVar.f(aherVar);
        abzy abzyVar2 = new abzy(17);
        Executor executorDirectExecutor2 = MoreExecutors.directExecutor();
        long j2 = afwl.a;
        ahcr ahcrVar2 = new ahcr(listenableFutureF2, new afwi(afty.c(false), abzyVar2));
        listenableFutureF2.addListener(ahcrVar2, MoreExecutors.c(executorDirectExecutor2, ahcrVar2));
        return ahcrVar2;
    }
}
