package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hqn implements ahcy {
    private final /* synthetic */ int $cid;

    public /* synthetic */ hqn(int i) {
        this.$cid = i;
    }

    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) {
        switch (this.$cid) {
            case 0:
                return ((aaqt) obj).f();
            case 1:
                return ((aaqm) obj).d();
            case 2:
                iqk iqkVar = (iqk) obj;
                ListenableFuture listenableFutureI = ((ayq) iqkVar.a.io()).i();
                hys hysVar = new hys(6);
                Executor executor = iqkVar.b;
                long j = afwl.a;
                afwi afwiVar = new afwi(afty.c(false), hysVar);
                int i = ahcs.c;
                ahcr ahcrVar = new ahcr(listenableFutureI, afwiVar);
                listenableFutureI.addListener(ahcrVar, MoreExecutors.c(executor, ahcrVar));
                return ahcrVar;
            case 3:
                return ((iqn) obj).b();
            case 4:
                return ((iqn) obj).a();
            case 5:
                obq obqVar = (obq) obj;
                ListenableFuture listenableFutureB = obqVar.b();
                gqq gqqVar = new gqq(obqVar, 16);
                Executor executorDirectExecutor = MoreExecutors.directExecutor();
                int i2 = ahcs.c;
                ahcr ahcrVar2 = new ahcr(listenableFutureB, gqqVar);
                listenableFutureB.addListener(ahcrVar2, MoreExecutors.c(executorDirectExecutor, ahcrVar2));
                return ahcrVar2;
            case 6:
                boolean z = olp.a;
                return new kjc(new ahek(false, agke.j((List) obj))).N(new okp(7), MoreExecutors.directExecutor());
            case 7:
                boolean z2 = olp.a;
                onb.g((Exception) obj, "%s: GC failed", "MDDManager");
                return aher.a;
            case 8:
                kmu kmuVar = (kmu) obj;
                throw new qkt(kmuVar.a(), kmuVar.getMessage(), kmuVar);
            case 9:
                return new aher("");
            case 10:
                return ((tpn) obj).a();
            case 11:
                return ((qrx) obj).c();
            case 12:
                return ((qrx) ((omj) obj).a).c();
            case 13:
                return ahng.m(wcm.a(new IllegalArgumentException("Commit aborted due to an exception during PendingEdits execution", (Throwable) obj), -1, 4, 5));
            case 14:
                return ahng.m(new aais((Throwable) obj));
            case 15:
                return ((aflh) obj).c();
            default:
                return ((afsr) obj).a();
        }
    }
}
