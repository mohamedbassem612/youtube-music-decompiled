package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hng extends aajm {
    public final hpy a;
    private final avmm m;

    public hng(hpy hpyVar, aajt aajtVar, grj grjVar, Executor executor, avmb avmbVar, isi isiVar, grj grjVar2, aajv aajvVar) {
        super(aajtVar, grjVar, executor, avmbVar, isiVar, grjVar2, aajvVar);
        this.m = new avmm();
        this.a = hpyVar;
    }

    @Override // defpackage.aajm
    public final ListenableFuture a(List list) {
        List<hmw> list2 = (List) Collection.EL.stream(list).filter(new gqk(11)).map(new hnf(0)).distinct().collect(Collectors.toCollection(new hcd(6)));
        if (list2.isEmpty()) {
            return ahng.n(aakb.a());
        }
        ListenableFuture listenableFutureB = this.i.b();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (hmw hmwVar : list2) {
            if (hmwVar.a() instanceof anyx) {
                anyx anyxVar = (anyx) hmwVar.a();
                arrayList2.add(anyxVar);
                arrayList.add(g(anyxVar.getVideoId()));
            } else if (hmwVar.a() instanceof anuk) {
                anuk anukVar = (anuk) hmwVar.a();
                arrayList3.add(anukVar);
                arrayList.add(f(anukVar.getPlaylistId()));
            } else if (hmwVar.a() instanceof anjx) {
                anjx anjxVar = (anjx) hmwVar.a();
                arrayList4.add(anjxVar);
                arrayList.add(f(anjxVar.getAudioPlaylistId()));
            }
        }
        grj grjVar = this.l;
        ListenableFuture listenableFutureZ = grjVar.z(anyx.class, arrayList2);
        ListenableFuture listenableFutureZ2 = grjVar.z(anuk.class, arrayList3);
        ListenableFuture listenableFutureZ3 = grjVar.z(anjx.class, arrayList4);
        return ahng.h(listenableFutureB, listenableFutureZ, listenableFutureZ2, listenableFutureZ3).a(afwl.j(new hog(this, listenableFutureB, listenableFutureZ, listenableFutureZ2, listenableFutureZ3, arrayList, 1)), this.d);
    }

    @Override // defpackage.aajm
    public final ListenableFuture b(List list) {
        List listH = h(list, hmx.class);
        if (listH.isEmpty()) {
            return ahng.n(aakb.a());
        }
        return afxd.f(this.i.b()).h(new gqb(this, (List) Collection.EL.stream(listH).map(new hnf(1)).collect(Collectors.toCollection(new hcd(6))), 5), this.d);
    }

    public final void c(List list) {
        taf.g(this.a.b(list), new gln(this, 19));
    }

    @Override // defpackage.aajm
    public final void d() {
        if (this.j.R()) {
            i();
            avmm avmmVar = this.m;
            hpy hpyVar = this.a;
            hpt hptVarA = hpu.a();
            hptVarA.f(true);
            hptVarA.c(true);
            hptVarA.b(true);
            avlr avlrVarB = gzj.as(hpyVar, hptVarA.a()).B(new gkq(15));
            avmb avmbVar = this.e;
            avmmVar.c(avlrVarB.O(avmbVar).af(new hib(this, 9)));
            i();
            avmmVar.c(gzj.aw(hpyVar).O(avmbVar).af(new hib(this, 7)));
            i();
            avmmVar.c(gzj.aq(hpyVar, Optional.of(anuk.class)).B(new gkq(14)).O(avmbVar).af(new hib(this, 8)));
            avmmVar.c(gzj.aq(hpyVar, Optional.of(anjx.class)).B(new gkq(16)).O(avmbVar).af(new hib(this, 10)));
            i();
            avmmVar.e(gzj.ar(hpyVar, anuc.class).O(avmbVar).af(new hib(this, 11)), gzj.ar(hpyVar, anjq.class).O(avmbVar).af(new hib(this, 12)));
        }
    }

    @Override // defpackage.aajm
    public final void e() {
        Object obj = this.g;
        if (obj != null) {
            awka.f((AtomicReference) obj);
        }
        this.m.b();
    }
}
