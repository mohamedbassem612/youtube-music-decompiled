package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class sdg implements Supplier {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ sdg(rzw rzwVar, AtomicReference atomicReference, AtomicBoolean atomicBoolean, rug rugVar, acfw acfwVar, ListenableFuture listenableFuture, int i) {
        this.$cid = i;
        this.c = rzwVar;
        this.a = atomicReference;
        this.d = atomicBoolean;
        this.f = rugVar;
        this.b = acfwVar;
        this.e = listenableFuture;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v29, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, wjf] */
    /* JADX WARN: Type inference failed for: r11v7, types: [acfw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, wjf] */
    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.$cid;
        if (i == 0) {
            int i2 = sdi.a;
            AtomicReference atomicReference = (AtomicReference) this.a;
            List listA = ((rzw) this.f).a((aqi) atomicReference.get());
            aqi aqiVar = (aqi) atomicReference.get();
            if (aqiVar == null) {
                return listA;
            }
            smr smrVar = (smr) Collection.EL.stream(listA).filter(new sde(6)).findFirst().orElse(null);
            if (smrVar == null) {
                rmp.n(null, "Failed to attach ad scheduling handle even though preroll opportunity was found initially.");
                aqiVar.b(null);
                return listA;
            }
            if (!taq.al((vyo) this.b)) {
                return listA;
            }
            ?? r0 = this.e;
            Object obj = this.d;
            Object obj2 = this.c;
            skh skhVarA = skh.a((String) obj, r0);
            aixn aixnVar = aixn.RENDERING_EVENT_TYPE_PHASE_AD_PLAYBACK_SCHEDULING_EVENTS;
            aixk aixkVar = aixk.PHASE_AD_PLAYBACK_SCHEDULING_EVENT_PLAYBACK_DEFERRAL_HANDLE_ATTACHED;
            obj2.getClass();
            nrk.c((spv) obj2, smrVar, skhVarA, aixnVar, aixkVar, null, 0);
            return listA;
        }
        if (i == 1) {
            smr smrVar2 = (smr) this.b;
            acfw acfwVar = (acfw) smrVar2.d(sjy.class);
            ?? r4 = this.d;
            Object obj3 = this.a;
            Object obj4 = this.c;
            return ((xte) this.f).j((wgk) this.e, (skl) obj4, (String) obj3, r4, acfwVar, smrVar2);
        }
        int i3 = sdi.a;
        AtomicReference atomicReference2 = (AtomicReference) this.a;
        List<smr> listA2 = ((rzw) this.c).a((aqi) atomicReference2.get());
        if (!((AtomicBoolean) this.d).compareAndSet(false, true)) {
            return listA2;
        }
        for (smr smrVar3 : listA2) {
            if (smrVar3 != null && smrVar3.c() == aixo.SLOT_TYPE_PLAYER_BYTES && smrVar3.e(shx.class) && smrVar3.d(shx.class) == slm.PRE_ROLL) {
                ?? r5 = this.e;
                rug rugVar = (rug) this.f;
                rugVar.a();
                if (r5.isDone()) {
                    return listA2;
                }
                ?? r11 = this.b;
                abzo abzoVar = rugVar.a;
                String strE = r11.e();
                if (strE == null) {
                    strE = ((rsr) abzoVar.g.io()).d();
                }
                String str = strE;
                rtz rtzVarJ = abzoVar.j(str);
                rtzVarJ.f = true;
                rtzVarJ.g = r5;
                try {
                    ((acm) abzoVar.f.io()).e(r11, new rty(abzoVar, str, (acfw) r11, 0));
                } catch (rso e) {
                    abzoVar.p(str);
                    Object obj5 = abzoVar.k;
                    rmp.n(null, "CisaShimLegacyGaplessFlow: Failed to request video interrupt for playback deferral: ".concat(e.toString()));
                }
                r5.addListener(afwl.i(new rhz(abzoVar, str, 14, null)), abzoVar.b);
                return listA2;
            }
        }
        aqi aqiVar2 = (aqi) atomicReference2.get();
        if (aqiVar2 == null) {
            return listA2;
        }
        aqiVar2.b(null);
        return listA2;
    }

    public /* synthetic */ sdg(rzw rzwVar, AtomicReference atomicReference, vyo vyoVar, spv spvVar, String str, wjf wjfVar, int i) {
        this.$cid = i;
        this.f = rzwVar;
        this.a = atomicReference;
        this.b = vyoVar;
        this.c = spvVar;
        this.d = str;
        this.e = wjfVar;
    }

    public /* synthetic */ sdg(xte xteVar, wgk wgkVar, skl sklVar, String str, wjf wjfVar, smr smrVar, int i) {
        this.$cid = i;
        this.f = xteVar;
        this.e = wgkVar;
        this.c = sklVar;
        this.a = str;
        this.d = wjfVar;
        this.b = smrVar;
    }
}
