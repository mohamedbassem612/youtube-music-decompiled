package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aajp extends aajk {
    private final aanb g;

    public aajp(aajt aajtVar, grj grjVar, Executor executor, grj grjVar2, isi isiVar, aajv aajvVar, aanb aanbVar) {
        super(aajtVar, grjVar, executor, grjVar2, isiVar, aajvVar);
        this.g = aanbVar;
    }

    private final ListenableFuture g() {
        return afxd.f(this.g.b().i().d()).g(new xwx(20), this.a);
    }

    private final ListenableFuture h() {
        return this.g.b().l().c();
    }

    private final ListenableFuture i(final Predicate predicate, final Predicate predicate2) {
        afxd afxdVarF = afxd.f(h());
        ahcy ahcyVar = new ahcy() { // from class: aajn
            @Override // defpackage.ahcy
            public final ListenableFuture a(Object obj) {
                List list = (List) Collection.EL.stream((List) obj).filter(predicate).collect(Collectors.toCollection(new yoj(6)));
                aajp aajpVar = this.a;
                return afxd.f(aajpVar.f.z(aamo.class, list)).g(new aagw(list, 6), aajpVar.a);
            }
        };
        Executor executor = this.a;
        afxd afxdVarH = afxdVarF.h(ahcyVar, executor);
        afxd afxdVarH2 = afxd.f(g()).h(new ahcy() { // from class: aajo
            @Override // defpackage.ahcy
            public final ListenableFuture a(Object obj) {
                List list = (List) Collection.EL.stream((List) obj).filter(predicate2).collect(Collectors.toCollection(new yoj(6)));
                aajp aajpVar = this.a;
                return afxd.f(aajpVar.f.z(aamh.class, list)).g(new aagw(list, 7), aajpVar.a);
            }
        }, executor);
        return ahng.h(afxdVarH, afxdVarH2).a(afwl.j(new wci(afxdVarH, afxdVarH2, 19)), executor);
    }

    @Override // defpackage.aajk
    public final ListenableFuture a() {
        return i(new aaep(4), new aaep(3));
    }

    @Override // defpackage.aajk
    protected final ListenableFuture b() {
        ListenableFuture listenableFutureH = h();
        ListenableFuture listenableFutureG = g();
        return ahng.h(listenableFutureH, listenableFutureG).a(afwl.j(new wci(listenableFutureH, listenableFutureG, 20)), this.a);
    }

    @Override // defpackage.aajk
    protected final ListenableFuture c(List list) {
        return i(new aajl(list, 2), new aajl(list, 3));
    }
}
