package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sdf implements aqk {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ sdf(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, tqj] */
    @Override // defpackage.aqk
    public final Object a(aqi aqiVar) {
        int i = 13;
        int i2 = 20;
        switch (this.$cid) {
            case 0:
                int i3 = sdi.a;
                ((AtomicReference) this.a).set(aqiVar);
                return "adSchedulingFuture";
            case 1:
                ((avlb) this.a).kp(new xda(aqiVar, 1));
                return "Cpu Device Signals";
            case 2:
                int i4 = sdi.a;
                ((AtomicReference) this.a).set(aqiVar);
                return "cisaShimAdSchedulingFuture";
            case 3:
                ((acm) this.a).a = aqiVar;
                return "ReelsObjectBinder.";
            case 4:
                aeiv aeivVar = (aeiv) this.a;
                aeivVar.c = aqiVar;
                return "PromiseKeeper: ".concat((String) aeivVar.b);
            case 5:
                int i5 = tqr.a;
                Object obj = this.a;
                ahgb ahgbVar = (ahgb) obj;
                ?? r2 = ahgbVar.e;
                if (r2.k(1073830238)) {
                    if (Build.VERSION.SDK_INT >= 35) {
                        if (r2.k(1073830309)) {
                            ahgbVar.b.execute(afwl.i(new sxk(aqiVar, obj, i)));
                        } else {
                            aqiVar.b(Boolean.valueOf(nsi.d((Context) ahgbVar.a)));
                        }
                    } else if (ahgbVar.F()) {
                        ahgbVar.D(aqiVar);
                    } else {
                        aqiVar.b(Boolean.valueOf(ahgb.G()));
                    }
                } else if (ahgbVar.F()) {
                    ahgbVar.D(aqiVar);
                } else {
                    aqiVar.b(Boolean.valueOf(ahgb.G()));
                }
                return "EnhancedProcessStartDetector.isBackgroundStart";
            case 6:
                ((unj) this.a).peer().j(new tvj(aqiVar, i2));
                return "hasUncommittedEdits";
            case 7:
                ((AtomicReference) ((zs) this.a).a).set(aqiVar);
                return "getDownloadStateFuture";
            case 8:
                aqiVar.a(new vlj(((vze) this.a).b.ar().ag(new vva(new uwk(aqiVar, 12), 6), new vva(new uwk(aqiVar, i), 7)), 16), new cte(10));
                return "firstDynamicConfigFuture";
            case 9:
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                Object obj2 = this.a;
                aepb aepbVar = (aepb) obj2;
                wkg wkgVar = new wkg(atomicBoolean, aqiVar, aepbVar);
                wki wkiVar = (wki) aepbVar.c;
                wkh wkhVar = new wkh(wkgVar, wkiVar);
                Object obj3 = aepbVar.b;
                wrv wrvVar = ((wrr) wkiVar.a).a;
                ypp yppVarE = wrvVar.c.e();
                yppVarE.h = obj3;
                yppVarE.l(aoll.a);
                yppVarE.g = new wqy(14);
                yppVarE.f = new wrj(9);
                aepbVar.d = ((tir) wrvVar.d.io()).a(new wrx(yppVarE.k()), wkhVar);
                aqiVar.a(new vlj(obj2, 20), MoreExecutors.directExecutor());
                return "ChunkRetrofitter.renderChunk";
            case 10:
                ((yqm) this.a).a = aqiVar;
                return "Onesie response future.";
            case 11:
                ysr ysrVar = yrj.a;
                ((yri) this.a).a = aqiVar;
                return "Onesie init segment future.";
            default:
                ((actq) this.a).c = aqiVar;
                return "PrefetchReelItemWatchResponseReceivedFuture";
        }
    }
}
