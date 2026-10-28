package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afqs extends ahno {
    private final aunn a;

    public afqs(aunn aunnVar) {
        super(null);
        this.a = aunnVar;
    }

    @Override // defpackage.ahno
    public final agev a(agsu agsuVar) {
        agev agevVarA = super.a(agsuVar);
        if (agevVarA.g()) {
            return agevVarA;
        }
        aunn aunnVar = this.a;
        agrx agrxVar = afqr.a;
        ahvg ahvgVar = ahvh.a;
        agev agevVarH = agev.h((affd) agsuVar.m().d(agrxVar));
        if (!agevVarH.g()) {
            afuv afuvVarH = afwt.h(((afvh) afty.d.get()).c, affe.a, aftg.b);
            if (afuvVarH.b()) {
                affd affdVar = (affd) afuvVarH.a();
                affdVar.getClass();
                agevVarH = new agfa(affdVar);
            }
        }
        if (!agevVarH.g()) {
            return agdf.a;
        }
        ListenableFuture listenableFutureU = ((abhh) aunnVar.io()).u((affd) agevVarH.c());
        aeni aeniVar = new aeni(5);
        long j = afwl.a;
        afwi afwiVar = new afwi(afty.c(false), aeniVar);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        ahby ahbyVar = new ahby(listenableFutureU, afig.class, afwiVar);
        listenableFutureU.addListener(ahbyVar, MoreExecutors.c(executorDirectExecutor, ahbyVar));
        return new agfa(ahbyVar);
    }
}
