package defpackage;

import android.view.View;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adwt {
    public final awmd A;
    public final boolean B;
    public final vxz C;
    public final vxz D;
    public final vxz E;
    public final vwt F;
    public final abhh G;
    private final aebq H;
    private final vxz I;
    private final vxz J;
    private final aecm K;
    private final aaok L;
    public final adxd a;
    public final View b;
    public final admc c;
    public final advo d;
    public final advo e;
    public final wnf f;
    public final tbt g;
    public final advd h;
    public final ttm i;
    public final xgn j;
    public final adtq k;
    public final adww l;
    public final adwj m;
    public final vyo n;
    public final avlh o;
    public final avlh p;
    public final long q;
    public final avmb r;
    public final Queue s;
    public final aecs t;
    public final aunn u;
    public final awmd v;
    public final tqj w;
    public final aunn x;
    public final Executor y;
    public final Executor z;

    public adwt(adxd adxdVar, View view, admc admcVar, advo advoVar, advo advoVar2, wnf wnfVar, tbt tbtVar, advd advdVar, ttm ttmVar, xgn xgnVar, adtq adtqVar, adww adwwVar, adwj adwjVar, vyo vyoVar, avlh avlhVar, avlh avlhVar2, long j, avmb avmbVar, Queue queue, aecs aecsVar, aunn aunnVar, awmd awmdVar, vwt vwtVar, vxz vxzVar, vxz vxzVar2, vxz vxzVar3, abhh abhhVar, tqj tqjVar, aunn aunnVar2, Executor executor, Executor executor2, awmd awmdVar2, boolean z) {
        view.getClass();
        admcVar.getClass();
        wnfVar.getClass();
        tbtVar.getClass();
        advdVar.getClass();
        ttmVar.getClass();
        xgnVar.getClass();
        adwwVar.getClass();
        adwjVar.getClass();
        vyoVar.getClass();
        avlhVar.getClass();
        avlhVar2.getClass();
        queue.getClass();
        aecsVar.getClass();
        this.a = adxdVar;
        this.b = view;
        this.c = admcVar;
        this.d = advoVar;
        this.e = advoVar2;
        this.H = null;
        this.f = wnfVar;
        this.g = tbtVar;
        this.h = advdVar;
        this.i = ttmVar;
        this.j = xgnVar;
        this.k = adtqVar;
        this.l = adwwVar;
        this.m = adwjVar;
        this.n = vyoVar;
        this.o = avlhVar;
        this.p = avlhVar2;
        this.q = j;
        this.r = avmbVar;
        this.s = queue;
        this.t = aecsVar;
        this.u = aunnVar;
        this.v = awmdVar;
        this.I = null;
        this.F = vwtVar;
        this.C = vxzVar;
        this.D = vxzVar2;
        this.J = null;
        this.E = vxzVar3;
        this.G = abhhVar;
        this.w = tqjVar;
        this.x = aunnVar2;
        this.L = null;
        this.y = executor;
        this.z = executor2;
        this.A = awmdVar2;
        this.K = null;
        this.B = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof adwt) {
            adwt adwtVar = (adwt) obj;
            if (awrc.c(this.a, adwtVar.a) && awrc.c(this.b, adwtVar.b) && awrc.c(this.c, adwtVar.c) && awrc.c(this.d, adwtVar.d) && awrc.c(this.e, adwtVar.e)) {
                aebq aebqVar = adwtVar.H;
                if (awrc.c(null, null) && awrc.c(this.f, adwtVar.f) && awrc.c(this.g, adwtVar.g) && awrc.c(this.h, adwtVar.h) && awrc.c(this.i, adwtVar.i) && awrc.c(this.j, adwtVar.j) && awrc.c(this.k, adwtVar.k) && awrc.c(this.l, adwtVar.l) && awrc.c(this.m, adwtVar.m) && awrc.c(this.n, adwtVar.n) && awrc.c(this.o, adwtVar.o) && awrc.c(this.p, adwtVar.p) && this.q == adwtVar.q && awrc.c(this.r, adwtVar.r) && awrc.c(this.s, adwtVar.s) && awrc.c(this.t, adwtVar.t) && awrc.c(this.u, adwtVar.u) && awrc.c(this.v, adwtVar.v)) {
                    vxz vxzVar = adwtVar.I;
                    if (awrc.c(null, null) && awrc.c(this.F, adwtVar.F) && awrc.c(this.C, adwtVar.C) && awrc.c(this.D, adwtVar.D)) {
                        vxz vxzVar2 = adwtVar.J;
                        if (awrc.c(null, null) && awrc.c(this.E, adwtVar.E) && awrc.c(this.G, adwtVar.G) && awrc.c(this.w, adwtVar.w) && awrc.c(this.x, adwtVar.x)) {
                            aaok aaokVar = adwtVar.L;
                            if (awrc.c(null, null) && awrc.c(this.y, adwtVar.y) && awrc.c(this.z, adwtVar.z) && awrc.c(this.A, adwtVar.A)) {
                                aecm aecmVar = adwtVar.K;
                                if (awrc.c(null, null) && this.B == adwtVar.B) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        adxd adxdVar = this.a;
        int iHashCode = ((((adxdVar == null ? 0 : adxdVar.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        advo advoVar = this.d;
        int iHashCode2 = ((iHashCode * 31) + (advoVar == null ? 0 : advoVar.hashCode())) * 31;
        advo advoVar2 = this.e;
        int iHashCode3 = (((((((((((iHashCode2 + (advoVar2 == null ? 0 : advoVar2.hashCode())) * 961) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31;
        adtq adtqVar = this.k;
        int iHashCode4 = (((((((((((((iHashCode3 + (adtqVar == null ? 0 : adtqVar.hashCode())) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31) + this.p.hashCode()) * 31) + ((int) this.q)) * 31;
        avmb avmbVar = this.r;
        int iHashCode5 = (((((iHashCode4 + (avmbVar == null ? 0 : avmbVar.hashCode())) * 31) + this.s.hashCode()) * 31) + this.t.hashCode()) * 31;
        aunn aunnVar = this.u;
        int iHashCode6 = (iHashCode5 + (aunnVar == null ? 0 : aunnVar.hashCode())) * 31;
        awmd awmdVar = this.v;
        int iHashCode7 = (iHashCode6 + (awmdVar == null ? 0 : awmdVar.hashCode())) * 961;
        vwt vwtVar = this.F;
        int iHashCode8 = (iHashCode7 + (vwtVar == null ? 0 : vwtVar.hashCode())) * 31;
        vxz vxzVar = this.C;
        int iHashCode9 = (iHashCode8 + (vxzVar == null ? 0 : vxzVar.hashCode())) * 31;
        vxz vxzVar2 = this.D;
        int iHashCode10 = (iHashCode9 + (vxzVar2 == null ? 0 : vxzVar2.hashCode())) * 961;
        vxz vxzVar3 = this.E;
        int iHashCode11 = (iHashCode10 + (vxzVar3 == null ? 0 : vxzVar3.hashCode())) * 31;
        abhh abhhVar = this.G;
        int iHashCode12 = (iHashCode11 + (abhhVar == null ? 0 : abhhVar.hashCode())) * 31;
        tqj tqjVar = this.w;
        int iHashCode13 = (iHashCode12 + (tqjVar == null ? 0 : tqjVar.hashCode())) * 31;
        aunn aunnVar2 = this.x;
        int iHashCode14 = (iHashCode13 + (aunnVar2 == null ? 0 : aunnVar2.hashCode())) * 961;
        Executor executor = this.y;
        int iHashCode15 = (iHashCode14 + (executor == null ? 0 : executor.hashCode())) * 31;
        Executor executor2 = this.z;
        int iHashCode16 = (iHashCode15 + (executor2 == null ? 0 : executor2.hashCode())) * 31;
        awmd awmdVar2 = this.A;
        return ((iHashCode16 + (awmdVar2 != null ? awmdVar2.hashCode() : 0)) * 961) + a.aj(this.B);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SectionListControllerConfig(transientState=");
        sb.append(this.a);
        sb.append(", view=");
        sb.append(this.b);
        sb.append(", presenterAdapter=");
        sb.append(this.c);
        sb.append(", loadingStatusAdapter=");
        sb.append(this.d);
        sb.append(", previousLoadingStatusAdapter=");
        sb.append(this.e);
        sb.append(", loadingScreenContentAdapter=null, service=");
        sb.append(this.f);
        sb.append(", eventBus=");
        sb.append(this.g);
        sb.append(", uiControllerFactory=");
        sb.append(this.h);
        sb.append(", errorHelper=");
        sb.append(this.i);
        sb.append(", interactionLogger=");
        sb.append(this.j);
        sb.append(", continuationScreenLogger=");
        sb.append(this.k);
        sb.append(", sectionListRefresher=");
        sb.append(this.l);
        sb.append(", refreshUiController=");
        sb.append(this.m);
        sb.append(", hotConfigSupplier=");
        sb.append(this.n);
        sb.append(", sectionListContinuationEventFlowable=");
        sb.append(this.o);
        sb.append(", sectionListConnectivityEventFlowable=");
        sb.append(this.p);
        sb.append(", networkTriggeredContinuationDelayMs=");
        sb.append(this.q);
        sb.append(", bgScheduler=");
        sb.append(this.r);
        sb.append(", visualElementContainers=");
        sb.append(this.s);
        sb.append(", responsiveFeed=");
        sb.append(this.t);
        boolean z = this.B;
        awmd awmdVar = this.A;
        Executor executor = this.z;
        Executor executor2 = this.y;
        aunn aunnVar = this.x;
        tqj tqjVar = this.w;
        abhh abhhVar = this.G;
        vxz vxzVar = this.E;
        vxz vxzVar2 = this.D;
        vxz vxzVar3 = this.C;
        vwt vwtVar = this.F;
        awmd awmdVar2 = this.v;
        aunn aunnVar2 = this.u;
        sb.append(", blocksContainer=");
        sb.append(aunnVar2);
        sb.append(", elementsServices=");
        sb.append(awmdVar2);
        sb.append(", watchUiClientGlobalConfig=null, rxLifecycle=");
        sb.append(vwtVar);
        sb.append(", elementsClientExperimentFlags=");
        sb.append(vxzVar3);
        sb.append(", feedsSystemClient=");
        sb.append(vxzVar2);
        sb.append(", creatorClientConfig=null, homeClient=");
        sb.append(vxzVar);
        sb.append(", responsiveContainersControllerFactory=");
        sb.append(abhhVar);
        sb.append(", bootstrapStore=");
        sb.append(tqjVar);
        sb.append(", sectionListMutationOperationsProcessorImplFactory=");
        sb.append(aunnVar);
        sb.append(", experimentEventLogger=null, backgroundExecutor=");
        sb.append(executor2);
        sb.append(", uiExecutor=");
        sb.append(executor);
        sb.append(", batchContinuationController=");
        sb.append(awmdVar);
        sb.append(", sectionListMutationRegistry=null, enableReattachingUnresolvedContinuations=");
        sb.append(z);
        sb.append(')');
        return sb.toString();
    }
}
