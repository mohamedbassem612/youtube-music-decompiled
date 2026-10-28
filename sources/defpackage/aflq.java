package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aflq implements aflp {
    private final dzt a;

    public aflq(dzt dztVar) {
        this.a = dztVar;
    }

    @Override // defpackage.aflp
    public final ListenableFuture a(String str) {
        return aguu.aB(((dzl) this.a.a(str)).c);
    }

    @Override // defpackage.aflp
    public final ListenableFuture b(UUID uuid) {
        return aguu.aB(((dzl) this.a.b(uuid)).c);
    }

    @Override // defpackage.aflp
    public final ListenableFuture c(String str, int i, List list) {
        return aguu.aB(((dzl) this.a.e(str, i, list)).c);
    }

    @Override // defpackage.aflp
    public final ListenableFuture d(ayq ayqVar) {
        return aguu.aB(((dzl) this.a.f(ayqVar)).c);
    }

    @Override // defpackage.aflp
    public final ListenableFuture e(String str, int i, ayq ayqVar) {
        ListenableFuture listenableFuture = ((dzl) this.a.g(str, i, ayqVar)).c;
        abzy abzyVar = new abzy(14);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        long j = afwl.a;
        afwi afwiVar = new afwi(afty.c(false), abzyVar);
        int i2 = ahcs.c;
        ahcr ahcrVar = new ahcr(listenableFuture, afwiVar);
        listenableFuture.addListener(ahcrVar, MoreExecutors.c(executorDirectExecutor, ahcrVar));
        return ahcrVar;
    }

    @Override // defpackage.aflp
    public final /* synthetic */ ListenableFuture f(String str, int i, ayq ayqVar) {
        return aguu.aG(this, str, i, ayqVar);
    }

    @Override // defpackage.aflp
    public final ListenableFuture g(dov dovVar) {
        return this.a.i(dovVar);
    }
}
