package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aajr extends aajm {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/features/appsearch/indexing/DefaultAppSearchIncrementalIndexer");
    private final aunn m;
    private final aanb n;

    public aajr(aajt aajtVar, grj grjVar, Executor executor, avmb avmbVar, isi isiVar, grj grjVar2, aajv aajvVar, aunn aunnVar, aanb aanbVar) {
        super(aajtVar, grjVar, executor, avmbVar, isiVar, grjVar2, aajvVar);
        this.m = aunnVar;
        this.n = aanbVar;
    }

    @Override // defpackage.aajm
    public final ListenableFuture a(List list) {
        List<aaiw> listH = h(list, aaiw.class);
        List<aaiv> listH2 = h(list, aaiv.class);
        if (listH.isEmpty() && listH2.isEmpty()) {
            return ahng.n(aakb.a());
        }
        ListenableFuture listenableFutureB = this.i.b();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (aaiw aaiwVar : listH) {
            arrayList2.add(aaiwVar.a());
            arrayList.add(g(aaiwVar.a().d()));
        }
        grj grjVar = this.l;
        ListenableFuture listenableFutureZ = grjVar.z(aamo.class, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (aaiv aaivVar : listH2) {
            arrayList3.add(aaivVar.a());
            arrayList.add(f(aaivVar.a().a));
        }
        ListenableFuture listenableFutureZ2 = grjVar.z(aamh.class, arrayList3);
        return ahno.av(listenableFutureB, listenableFutureZ, listenableFutureZ2).k(new hni((Object) this, (Object) listenableFutureB, listenableFutureZ, listenableFutureZ2, (Object) arrayList, 12), this.d);
    }

    @Override // defpackage.aajm
    public final ListenableFuture b(List list) {
        List listH = h(list, aaiy.class);
        List listH2 = h(list, aaix.class);
        if (listH.isEmpty() && listH2.isEmpty()) {
            return ahng.n(aakb.a());
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listH.iterator();
        while (it.hasNext()) {
            arrayList.add(((aaiy) it.next()).a());
        }
        Iterator it2 = listH2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((aaix) it2.next()).a());
        }
        return afxd.f(this.i.b()).h(new row(this, arrayList, 18, null), this.d);
    }

    @Override // defpackage.aajm
    public final void d() {
        if (this.j.R()) {
            ((tbt) this.m.io()).f(this);
        }
    }

    @Override // defpackage.aajm
    public final void e() {
        ((tbt) this.m.io()).l(this);
        Object obj = this.g;
        if (obj != null) {
            awka.f((AtomicReference) obj);
        }
    }

    @tcc
    void handleOfflinePlaylistAddEvent(aahj aahjVar) {
        i();
        this.n.b().i().l(aahjVar.a, new aajq(this, aahjVar, 0));
    }

    @tcc
    void handleOfflinePlaylistDeleteEvent(aahm aahmVar) {
        i();
        String strA = aaka.a(aahmVar.a);
        if (strA == null) {
            throw new NullPointerException("Null playlistUri");
        }
        this.c.kk(new aajf(strA, null));
    }

    @tcc
    void handleOfflineSingleVideoAddEvent(aaht aahtVar) {
        i();
        acom acomVar = new acom();
        acomVar.b(aahtVar.a.a);
        this.c.kk(acomVar.a());
    }

    @tcc
    void handleOfflineVideoDeleteEvent(aaia aaiaVar) {
        i();
        String strB = aaka.b(aaiaVar.a);
        if (strB == null) {
            throw new NullPointerException("Null videoUri");
        }
        this.c.kk(new aajh(strB, null));
    }
}
