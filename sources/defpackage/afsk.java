package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class afsk implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ afsk(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v1, types: [aflp, java.lang.Object] */
    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) {
        if (this.$cid != 0) {
            ?? r0 = this.b;
            Object obj2 = this.a;
            afry afryVar = (afry) obj2;
            ListenableFuture listenableFutureH = afryVar.h(r0);
            afng afngVar = new afng(obj2, r0, (Long) obj, 2);
            long j = afwl.a;
            return aguu.aE(listenableFutureH, new afwh(afty.c(false), afngVar, 0), afryVar.b);
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (dzs dzsVar : (List) obj) {
            if (dzsVar.b == dzr.a) {
                hashSet.add(dzsVar.d);
            }
        }
        agqr it = agkz.n(hashSet).iterator();
        while (it.hasNext()) {
            ?? r2 = this.b;
            dyn dynVar = (dyn) it.next();
            if (!r2.contains(dynVar)) {
                afsl afslVar = (afsl) this.a;
                String strC = afsl.c(dynVar, afslVar.b());
                ahrn ahrnVar = afslVar.f;
                ListenableFuture listenableFutureL = ((jij) ahrnVar.a).L(ahrnVar.c.a(strC), new oly(14));
                aeni aeniVar = new aeni(16);
                Executor executorDirectExecutor = MoreExecutors.directExecutor();
                int i = ahcs.c;
                ahcr ahcrVar = new ahcr(listenableFutureL, aeniVar);
                listenableFutureL.addListener(ahcrVar, MoreExecutors.c(executorDirectExecutor, ahcrVar));
                arrayList.add(ahcrVar);
            }
        }
        ahek ahekVar = new ahek(false, agke.j(arrayList));
        okp okpVar = new okp(13);
        long j2 = afwl.a;
        return ahekVar.a(new ahcz(afty.c(false), okpVar, 1), MoreExecutors.directExecutor());
    }
}
