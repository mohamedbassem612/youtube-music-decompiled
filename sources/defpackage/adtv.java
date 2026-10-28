package defpackage;

import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Timer;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class adtv implements twn, advw {
    private final wnf a;
    public final Object ae;
    public final HashMap af;
    public final xgn ag;
    public final List ah;
    public final adtq ai;
    public final Queue aj;
    public final ConcurrentHashMap ak;
    public acjx al;
    public final HashMap am;
    public adtm an;
    public adtp ao;
    public boolean ap;
    public boolean aq;
    public boolean ar;
    private final ttm b;
    private final tbt c;
    private final wne d;
    private final awmd e;
    private final List f;

    protected adtv(adxd adxdVar, wnf wnfVar, tbt tbtVar, Object obj, ttm ttmVar, xgn xgnVar, adtq adtqVar, Queue queue, awmd awmdVar) {
        this.ak = new ConcurrentHashMap();
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.ap = false;
        this.aq = false;
        this.ar = false;
        this.a = wnfVar;
        this.c = tbtVar;
        this.b = ttmVar;
        xgnVar.getClass();
        this.ag = xgnVar;
        this.ae = obj;
        this.e = awmdVar;
        this.am = new HashMap();
        this.ai = adtqVar;
        this.aj = queue;
        this.d = new adti(this);
        if (adxdVar instanceof adtu) {
            adtu adtuVar = (adtu) adxdVar;
            this.af = adtuVar.a;
            this.al = adtuVar.b;
            this.ah = adtuVar.c;
            arrayList.addAll(adtuVar.d);
            for (Map.Entry entry : adtuVar.e.entrySet()) {
                this.ak.put((acjx) entry.getKey(), (abfv) entry.getValue());
            }
        } else {
            this.af = new HashMap();
            this.ah = new ArrayList();
        }
        for (byte[] bArr : this.ah) {
            if (bArr != null) {
                xgnVar.d(new xgj(bArr));
            }
        }
    }

    private final ahsx h(adto adtoVar) {
        acjx acjxVar = adtoVar.a;
        kb(new adts(acjxVar));
        if (hv() && acjxVar.h() != null && acjxVar.h().length > 0 && !acjxVar.d()) {
            this.ag.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(acjxVar.h()), adtoVar.i);
        }
        if (!this.ap) {
            this.ak.clear();
        } else if (acjxVar.a() == acjw.d) {
            Collection.EL.removeIf(this.ak.keySet(), new acwb(3));
        }
        ConcurrentHashMap concurrentHashMap = this.ak;
        concurrentHashMap.put(acjxVar, new abfv((this.ar || adtoVar.h) ? adtoVar : adto.a(acjxVar).a(), (Object) null));
        ListenableFuture listenableFutureAw = aw(acjxVar, adtoVar);
        ConcurrentMap.EL.computeIfPresent(concurrentHashMap, acjxVar, new adtf(listenableFutureAw, 0));
        ay(listenableFutureAw, acjxVar, adtoVar);
        return new ahsx(concurrentHashMap, acjxVar, listenableFutureAw);
    }

    private final void kb(Object obj) {
        Object obj2 = this.ae;
        tbt tbtVar = this.c;
        if (obj2 != null) {
            tbtVar.d(obj2, obj, false);
        } else {
            tbtVar.c(obj);
        }
    }

    protected adtq H() {
        return this.ai;
    }

    protected final void aA() {
        HashMap map = this.am;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Timer) ((aciz) it.next()).a).cancel();
        }
        map.clear();
    }

    public final void aB(acjx acjxVar, adud adudVar) {
        if (acjxVar != null) {
            adtn adtnVarA = adto.a(acjxVar);
            adtnVarA.d = agev.i(adudVar);
            adtnVarA.d(true);
            aK(adtnVarA.a());
        }
    }

    public final void aC(acjx acjxVar, ajwo ajwoVar) {
        if (acjxVar != null) {
            adtn adtnVarA = adto.a(acjxVar);
            adtnVarA.b = agev.h(ajwoVar);
            aK(adtnVarA.a());
        }
    }

    public final void aD(twi twiVar, adud adudVar, acjx acjxVar, ajwo ajwoVar) {
        if (acjxVar != null) {
            adtn adtnVarA = adto.a(acjxVar);
            adtnVarA.d = agev.h(adudVar);
            adtnVarA.c = twiVar;
            adtnVarA.b = agev.h(ajwoVar);
            aK(adtnVarA.a());
        }
    }

    public final void aE() {
        acjx acjxVar = this.al;
        if (acjxVar != null) {
            aF(acjxVar, null);
        }
    }

    public final void aF(acjx acjxVar, ajwo ajwoVar) {
        if (acjxVar != null) {
            acjx acjxVar2 = this.al;
            if ((acjxVar2 == null || !this.ak.containsKey(acjxVar2)) && !this.ak.containsKey(acjxVar)) {
                adtn adtnVarA = adto.a(acjxVar);
                adtnVarA.b = agev.h(ajwoVar);
                adtnVarA.b(true);
                h(adtnVarA.a());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    public final void aG(Object obj, acjx acjxVar, Timer timer) {
        long j;
        int i;
        HashMap map;
        taq.d();
        if (acjxVar != null) {
            aqmx aqmxVar = (aqmx) aawb.ag(acjxVar, aqmx.class);
            if (aqmxVar == null) {
                amfj amfjVar = (amfj) aawb.ag(acjxVar, amfj.class);
                if (amfjVar != null) {
                    i = amfjVar.d;
                } else {
                    j = 0;
                }
                if (j == 0) {
                    iM(acjxVar);
                    return;
                }
                map = this.am;
                if (map.containsKey(obj)) {
                    ((Timer) ((aciz) map.get(obj)).a).cancel();
                }
                map.put(obj, new aciz(timer, acjxVar, (char[]) null));
                timer.schedule(new adtj(this, obj, acjxVar), j);
            }
            i = aqmxVar.c;
            j = i;
            if (j == 0) {
                iM(acjxVar);
                return;
            }
            map = this.am;
            if (map.containsKey(obj)) {
                ((Timer) ((aciz) map.get(obj)).a).cancel();
            }
            map.put(obj, new aciz(timer, acjxVar, (char[]) null));
            timer.schedule(new adtj(this, obj, acjxVar), j);
        }
    }

    protected final void aH(acjx acjxVar) {
        this.af.put(acjxVar.a(), acjxVar);
    }

    protected final void aI(List list) {
        z();
        t(list);
    }

    public final void aJ() {
        this.ap = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.google.common.util.concurrent.ListenableFuture] */
    /* JADX WARN: Type inference failed for: r3v6 */
    public final ahsx aK(adto adtoVar) {
        ConcurrentHashMap concurrentHashMap = this.ak;
        acjx acjxVar = adtoVar.a;
        if (!concurrentHashMap.containsKey(acjxVar)) {
            return h(adtoVar);
        }
        abfv abfvVar = (abfv) concurrentHashMap.get(acjxVar);
        return new ahsx(concurrentHashMap, acjxVar, (ListenableFuture) (abfvVar != null ? abfvVar.b : 0));
    }

    public final ListenableFuture aw(acjx acjxVar, adto adtoVar) {
        wnf wnfVar = this.a;
        twi twiVar = adtoVar.c;
        wlu wluVarA = wnfVar.a(acjxVar);
        twiVar.a(wluVarA);
        acjw acjwVar = acjw.f;
        if (((acjxVar != null && acjwVar.equals(acjxVar.a())) || adtoVar.j) && wluVarA.w()) {
            wluVarA.z(2);
        }
        if (adtoVar.j) {
            wluVarA.D();
        }
        hr(wluVarA, adtoVar.g);
        if (!(acjxVar instanceof acjz)) {
            return wnfVar.d(wluVarA, this.d, MoreExecutors.directExecutor());
        }
        acjz acjzVar = (acjz) acjxVar;
        awmd awmdVar = this.e;
        if (awmdVar == null) {
            return ahng.m(new IllegalStateException());
        }
        ajlb ajlbVar = acjzVar.a;
        acjo acjoVar = new acjo(this, adtoVar, 6);
        ajlbVar.getClass();
        aduh aduhVar = (aduh) ((glj) awmdVar).a;
        gme gmeVar = new gme(aduhVar, ajlbVar, acjoVar, (awoq) null, 19);
        return awrc.ag(aduhVar.b, awov.a, gmeVar);
    }

    public Object ax() {
        return this.ae;
    }

    public final void ay(ListenableFuture listenableFuture, final acjx acjxVar, final adto adtoVar) {
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        tab tabVar = new tab() { // from class: adtg
            @Override // defpackage.twi
            /* JADX INFO: renamed from: b */
            public final void a(Throwable th) {
                adtv adtvVar = this.a;
                ConcurrentHashMap concurrentHashMap = adtvVar.ak;
                toe toeVarZ = taq.z(th);
                acjx acjxVar2 = acjxVar;
                if (concurrentHashMap.remove(acjxVar2) != null) {
                    adto adtoVar2 = adtoVar;
                    if (!adtoVar2.f) {
                        adtvVar.ht(toeVarZ, acjxVar2);
                    }
                    adud adudVar = (adud) adtoVar2.d.f();
                    if (adudVar != null) {
                        adudVar.b(toeVarZ, acjxVar2);
                    }
                }
            }
        };
        tae taeVar = new tae() { // from class: adth
            @Override // defpackage.tae, defpackage.twi
            public final void a(Object obj) {
                acjy acjyVar = (acjy) obj;
                adto adtoVar2 = adtoVar;
                ajwo ajwoVar = (ajwo) adtoVar2.b.f();
                adtv adtvVar = this.a;
                ConcurrentHashMap concurrentHashMap = adtvVar.ak;
                acjx acjxVar2 = acjxVar;
                if (concurrentHashMap.remove(acjxVar2) != null) {
                    if (adtoVar2.j) {
                        adtvVar.ah.clear();
                    }
                    if (acjyVar == null) {
                        adtvVar.af.remove(acjxVar2.a());
                    } else {
                        adtq adtqVarH = adtvVar.H();
                        if (adtqVarH != null) {
                            adtqVarH.a(acjxVar2, ajwoVar);
                            Iterator it = adtvVar.aj.iterator();
                            while (it.hasNext()) {
                                adtvVar.ag.l((xgz) it.next());
                            }
                        }
                        if (acjyVar.b() != null) {
                            byte[] bArrD = acjyVar.d();
                            adtvVar.ah.add(bArrD);
                            adtvVar.ag.d(new xgj(bArrD));
                        }
                    }
                    adtp adtpVar = adtvVar.ao;
                    if (adtpVar != null) {
                        adtpVar.q(acjyVar, acjxVar2.a());
                    }
                    agke agkeVar = adtoVar2.e;
                    for (int i = 0; i < ((agpi) agkeVar).d; i++) {
                        ((adtp) agkeVar.get(i)).q(acjyVar, acjxVar2.a());
                    }
                    if (!adtoVar2.f) {
                        adtvVar.hs(acjyVar.b(), acjxVar2);
                    }
                    adud adudVar = (adud) adtoVar2.d.f();
                    if (adudVar != null) {
                        adudVar.a(acjyVar.b(), acjxVar2);
                    }
                }
            }
        };
        Executor executor = taf.a;
        taa taaVar = new taa(taeVar, null, tabVar);
        long j = afwl.a;
        listenableFuture.addListener(new ahei(listenableFuture, new afwj(afty.c(false), taaVar, 0)), executorDirectExecutor);
    }

    public final void az(Object obj) {
        HashMap map = this.am;
        if (map.containsKey(obj)) {
            ((Timer) ((aciz) map.remove(obj)).a).cancel();
        }
    }

    protected abstract Object c(apjh apjhVar);

    public void hN(acjx acjxVar, Timer timer) {
        if (acjxVar != null) {
            aG(acjxVar, acjxVar, timer);
        }
    }

    public acjx hQ(acjw acjwVar) {
        return (acjx) this.af.get(acjwVar);
    }

    public void hR(acjw acjwVar) {
        acjx acjxVar = (acjx) this.af.get(acjwVar);
        if (acjxVar != null) {
            iM(acjxVar);
        }
    }

    public adxd hq() {
        agke agkeVar = agpi.a;
        Map map = agpn.b;
        boolean z = this.ar;
        ConcurrentHashMap concurrentHashMap = this.ak;
        if (z) {
            map = new HashMap(concurrentHashMap);
        } else {
            agkeVar = (agke) Collection.EL.stream(concurrentHashMap.values()).map(new accu(17)).collect(aghu.a);
        }
        return new adtu(new HashMap(this.af), this.al, agkeVar, this.ah, map);
    }

    protected void hs(Object obj, acjx acjxVar) {
        if (obj == null && acjxVar.a() == acjw.b) {
            z();
        }
        kb(new adtk(acjxVar.a(), obj != null, acjxVar.e()));
    }

    protected void ht(toe toeVar, acjx acjxVar) {
        Intent intent;
        twp twpVarA = this.b.a(toeVar);
        Throwable cause = toeVar;
        while (true) {
            if (cause == null) {
                intent = null;
                break;
            } else {
                if (cause instanceof tmg) {
                    intent = ((tmg) cause).a;
                    break;
                }
                cause = cause.getCause();
            }
        }
        kb(new adtr(twpVarA, true, intent, acjxVar));
        adtm adtmVar = this.an;
        if (adtmVar != null) {
            adtmVar.p(toeVar, acjxVar);
        }
    }

    protected boolean hu() {
        return false;
    }

    protected boolean hv() {
        return true;
    }

    @Override // defpackage.twn
    public void i() {
        this.an = null;
        this.ao = null;
        aA();
        z();
    }

    public void iM(acjx acjxVar) {
        if (acjxVar != null) {
            aK(adto.a(acjxVar).a());
        }
    }

    public boolean o(acjw acjwVar) {
        return (acjwVar == acjw.d && this.al != null) || this.af.containsKey(acjwVar);
    }

    public void t(List list) {
        awmd awmdVar;
        ajla ajlaVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            acjx acjxVar = (acjx) it.next();
            this.af.put(acjxVar.a(), acjxVar);
            if (acjxVar.a() == acjw.d) {
                this.al = acjxVar;
            } else if (acjxVar.a() == acjw.m && (awmdVar = this.e) != null && (ajlaVar = (ajla) aawb.ag(acjxVar, ajla.class)) != null) {
                int i = ajlaVar.b;
                if (i == 0) {
                    ((agrc) aduh.a.c().k("com/google/android/libraries/youtube/rendering/ui/DefaultBatchContinuationController", "addBatch", 38, "DefaultBatchContinuationController.kt")).t("Batch continuation data has empty batch id");
                } else {
                    ((aduh) ((glj) awmdVar).a).c.put(Integer.valueOf(i), ajlaVar);
                }
            }
        }
    }

    public void z() {
        this.af.clear();
        this.ak.clear();
        this.f.clear();
    }

    protected void hr(wkf wkfVar, adtl adtlVar) {
    }

    public adtv(adxd adxdVar, wnf wnfVar, tbt tbtVar, Object obj, ttm ttmVar, xgn xgnVar) {
        this(adxdVar, wnfVar, tbtVar, obj, ttmVar, xgnVar, null, new ArrayDeque(), null);
    }

    public adtv(wnf wnfVar, tbt tbtVar, Object obj, ttm ttmVar, xgn xgnVar) {
        this(null, wnfVar, tbtVar, obj, ttmVar, xgnVar, null, new ArrayDeque(), null);
    }
}
