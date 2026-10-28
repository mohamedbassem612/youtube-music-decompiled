package defpackage;

import android.util.Pair;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adjh implements euh {
    public final adic a;
    private final awmd b;
    private final awmd c;
    private final Map d;
    private final eyl e;
    private final mbc f;
    private final adji g;
    private final Executor h;
    private final tqj i;
    private final awmd j;
    private final ScheduledExecutorService k;
    private volatile ScheduledFuture l;
    private final vxz m;

    public adjh(adic adicVar, awmd awmdVar, awmd awmdVar2, Map map, eyl eylVar, vxz vxzVar, mbc mbcVar, adji adjiVar, Executor executor, tqj tqjVar, awmd awmdVar3, ScheduledExecutorService scheduledExecutorService) {
        this.a = adicVar;
        this.b = awmdVar;
        this.c = awmdVar2;
        this.d = map;
        this.e = eylVar;
        this.m = vxzVar;
        this.f = mbcVar;
        this.g = adjiVar;
        this.h = executor;
        this.i = tqjVar;
        this.j = awmdVar3;
        this.k = scheduledExecutorService;
    }

    @Override // defpackage.euh
    public final Class a() {
        return this.a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, zwn] */
    /* JADX WARN: Type inference failed for: r4v1, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, zwa] */
    public final void b(esf esfVar, eug eugVar) {
        tnr tnrVar;
        Optional optionalEmpty = Optional.empty();
        HashMap map = new HashMap();
        map.putAll(this.d);
        eyl eylVar = this.e;
        for (Map.Entry entry : eylVar.d().entrySet()) {
            if (!ahno.ag("user-agent", (CharSequence) entry.getKey())) {
                map.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        String strC = eylVar.c();
        aeod aeodVar = (aeod) this.c.io();
        Stream stream = Collection.EL.stream((List) aeodVar.b.io());
        strC.getClass();
        if (stream.anyMatch(new hkn(strC, 16))) {
            zwa zwaVarE = ((zwb) aeodVar.c.io()).e();
            optionalEmpty = zwaVarE.h() ? Optional.empty() : Optional.of(zwaVarE);
            if (optionalEmpty.isPresent()) {
                ?? r4 = optionalEmpty.get();
                if (!r4.h()) {
                    zwk zwkVarA = aeodVar.a.a(r4).a(r4);
                    if (zwkVarA.f()) {
                        Optional optionalB = zwkVarA.b(strC);
                        if (optionalB.isPresent()) {
                            map.put((String) ((Pair) optionalB.get()).first, (String) ((Pair) optionalB.get()).second);
                        }
                    }
                }
            }
        }
        Optional optional = optionalEmpty;
        vxz vxzVar = this.m;
        adic adicVar = this.a;
        boolean zL = vxzVar.l(67, 45750287L, false);
        int iOrdinal = esfVar.ordinal();
        if (iOrdinal == 0) {
            tnrVar = tnr.d;
        } else if (iOrdinal != 1) {
            tnrVar = iOrdinal != 3 ? tnr.b : tnr.a;
        } else {
            tnrVar = tnr.c;
        }
        tnr tnrVar2 = tnrVar;
        agkj agkjVarH = agkj.h(map);
        mbc mbcVar = this.f;
        adji adjiVar = this.g;
        tqj tqjVar = this.i;
        int i = tqr.a;
        adjg adjgVar = new adjg(adicVar, strC, eugVar, tnrVar2, agkjVarH, optional, mbcVar, adjiVar, zL, tqjVar.a(1074026394));
        if (vxzVar.m(14, 45627566L)) {
            adjgVar.B(tok.VOLLEY_GLIDE_REQUEST);
        }
        adjiVar.j(strC);
        awmd awmdVar = this.b;
        if (!zL) {
            ((tgg) awmdVar.io()).b(adjgVar);
            return;
        }
        ListenableFuture listenableFutureC = ((tgg) awmdVar.io()).c(adjgVar);
        Executor executor = this.h;
        wuy wuyVar = new wuy(eugVar, 19);
        xwl xwlVar = new xwl(this, eugVar, 18);
        Executor executor2 = taf.a;
        taa taaVar = new taa(xwlVar, null, wuyVar);
        long j = afwl.a;
        listenableFutureC.addListener(new ahei(listenableFutureC, new afwj(afty.c(false), taaVar, 0)), executor);
    }

    @Override // defpackage.euh
    public final void f(esf esfVar, eug eugVar) {
        int i = tqr.a;
        long jA = this.i.a(1074419797);
        if (jA > 0) {
            eyl eylVar = this.e;
            awmd awmdVar = this.j;
            String strC = eylVar.c();
            trd trdVar = ((tre) awmdVar.io()).h;
            if (trdVar != null && trd.m(trdVar.a(264)) && trdVar.a(SemanticState.Hidden) == 3 && !trdVar.l()) {
                boolean z = strC != null && (strC.contains("googleusercontent.com/a/") || strC.contains("googleusercontent.com/a-/"));
                boolean z2 = strC != null && strC.contains("yt3.ggpht.com");
                if (!z && !z2) {
                    this.l = this.k.schedule(new adab(this, esfVar, eugVar, 4, (byte[]) null), jA * 10, TimeUnit.MILLISECONDS);
                    return;
                }
            }
        }
        b(esfVar, eugVar);
    }

    @Override // defpackage.euh
    public final int g() {
        return 2;
    }

    @Override // defpackage.euh
    public final void gI() {
        ScheduledFuture scheduledFuture;
        int i = tqr.a;
        if (this.i.a(1074419797) <= 0 || (scheduledFuture = this.l) == null) {
            return;
        }
        scheduledFuture.cancel(false);
    }

    @Override // defpackage.euh
    public final void d() {
    }
}
