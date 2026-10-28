package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hne extends aajk {
    private final hpk g;

    public hne(aajt aajtVar, grj grjVar, Executor executor, grj grjVar2, isi isiVar, aajv aajvVar, hpk hpkVar) {
        super(aajtVar, grjVar, executor, grjVar2, isiVar, aajvVar);
        this.g = hpkVar;
    }

    private final ListenableFuture g(final Predicate predicate, final Predicate predicate2, final Predicate predicate3) {
        hpk hpkVar = this.g;
        final ListenableFuture listenableFutureD = hpkVar.d();
        final ListenableFuture listenableFutureC = hpkVar.c();
        final ListenableFuture listenableFutureA = hpkVar.a();
        return ahng.h(listenableFutureD, listenableFutureC, listenableFutureA).b(afwl.c(new ahcx() { // from class: hnc
            @Override // defpackage.ahcx
            public final ListenableFuture a() {
                List list = (List) Collection.EL.stream((agke) ahng.v(listenableFutureD)).filter(predicate).collect(Collectors.toCollection(new hcd(5)));
                List list2 = (List) Collection.EL.stream((agke) ahng.v(listenableFutureC)).filter(predicate2).collect(Collectors.toCollection(new hcd(5)));
                List list3 = (List) Collection.EL.stream((agke) ahng.v(listenableFutureA)).filter(predicate3).collect(Collectors.toCollection(new hcd(5)));
                hne hneVar = this.a;
                grj grjVar = hneVar.f;
                afxd afxdVarF = afxd.f(grjVar.z(anyx.class, list));
                gmv gmvVar = new gmv(list, 20);
                Executor executor = hneVar.a;
                afxd afxdVarG = afxdVarF.g(gmvVar, executor);
                afxd afxdVarG2 = afxd.f(grjVar.z(anuk.class, list2)).g(new hnd(list2, 1), executor);
                afxd afxdVarG3 = afxd.f(grjVar.z(anjx.class, list3)).g(new hnd(list3, 0), executor);
                return ahng.h(afxdVarG, afxdVarG2, afxdVarG3).a(afwl.j(new egz(afxdVarG, afxdVarG2, afxdVarG3, 9)), executor);
            }
        }), this.a);
    }

    @Override // defpackage.aajk
    public final ListenableFuture a() {
        return g(new gqk(7), new gqk(8), new gqk(9));
    }

    @Override // defpackage.aajk
    protected final ListenableFuture b() {
        hpk hpkVar = this.g;
        ListenableFuture listenableFutureD = hpkVar.d();
        ListenableFuture listenableFutureC = hpkVar.c();
        ListenableFuture listenableFutureA = hpkVar.a();
        return ahng.h(listenableFutureD, listenableFutureC, listenableFutureA).a(afwl.j(new egz(listenableFutureD, listenableFutureC, listenableFutureA, 8)), this.a);
    }

    @Override // defpackage.aajk
    protected final ListenableFuture c(List list) {
        return g(new gnh(list, 10), new gnh(list, 11), new gnh(list, 9));
    }
}
