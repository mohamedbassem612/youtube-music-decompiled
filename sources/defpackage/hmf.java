package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hmf {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/offline/OrphanedPersistedEntitiesCleaner");
    public final hpy b;
    public final Executor c;
    public final vxz d;
    public final hef e;
    private final wco f;

    public hmf(wco wcoVar, hef hefVar, hpy hpyVar, Executor executor, vxz vxzVar) {
        this.f = wcoVar;
        this.e = hefVar;
        this.b = hpyVar;
        this.c = executor;
        this.d = vxzVar;
    }

    public final void a(final int i, final int i2, boolean z, zwa zwaVar) {
        ListenableFuture listenableFuture;
        wco wcoVar = this.f;
        int i3 = 1;
        int i4 = 0;
        if (z) {
            avmc avmcVarQ = wcoVar.b(zwaVar).q(i);
            tzj tzjVar = new tzj();
            avmcVarQ.F(new tzi(tzjVar));
            listenableFuture = tzjVar;
        } else {
            avmc avmcVarQ2 = wcoVar.b(zwaVar).q(i);
            tzj tzjVar2 = new tzj();
            avmcVarQ2.F(new tzi(tzjVar2));
            ahcy ahcyVar = new ahcy() { // from class: hme
                @Override // defpackage.ahcy
                public final ListenableFuture a(Object obj) {
                    final agke agkeVar = (agke) obj;
                    agke agkeVar2 = (agke) Collection.EL.stream(agkeVar).map(new aact(i2, 1)).collect(aghu.a);
                    hmf hmfVar = this.a;
                    ListenableFuture listenableFutureB = hmfVar.b.b(agkeVar2);
                    final int i5 = i;
                    agek agekVar = new agek() { // from class: hmc
                        @Override // defpackage.agek
                        public final Object apply(Object obj2) {
                            agke agkeVar3 = (agke) Collection.EL.stream(agkeVar).filter(new hkn((agkz) Collection.EL.stream((List) obj2).filter(new gqn(3)).map(new hds(3)).collect(aghu.b), 2)).collect(aghu.a);
                            if (!agkeVar3.isEmpty()) {
                                ((agrc) ((agrc) hmf.a.b()).k("com/google/android/apps/youtube/music/offline/OrphanedPersistedEntitiesCleaner", "getOrphanedEntityKeys", 175, "OrphanedPersistedEntitiesCleaner.java")).x("Has orphaned entities, cleaned up %d entities with type=%d.", agkeVar3.size(), i5);
                            }
                            return agkeVar3;
                        }
                    };
                    long j = afwl.a;
                    afwi afwiVar = new afwi(afty.c(false), agekVar);
                    int i6 = ahcs.c;
                    Executor executor = hmfVar.c;
                    ahcr ahcrVar = new ahcr(listenableFutureB, afwiVar);
                    listenableFutureB.addListener(ahcrVar, MoreExecutors.c(executor, ahcrVar));
                    return ahcrVar;
                }
            };
            Executor executor = this.c;
            long j = afwl.a;
            ahdb ahdbVar = new ahdb(afty.c(false), ahcyVar, 1);
            int i5 = ahcs.c;
            ahcq ahcqVar = new ahcq(tzjVar2, ahdbVar);
            tzjVar2.addListener(ahcqVar, MoreExecutors.c(executor, ahcqVar));
            listenableFuture = ahcqVar;
        }
        Executor executor2 = this.c;
        hmb hmbVar = new hmb(i4);
        hve hveVar = new hve(this, zwaVar, i3);
        Executor executor3 = taf.a;
        taa taaVar = new taa(hveVar, null, hmbVar);
        long j2 = afwl.a;
        listenableFuture.addListener(new ahei(listenableFuture, new afwj(afty.c(false), taaVar, 0)), executor2);
    }
}
