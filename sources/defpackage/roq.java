package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class roq {
    public final Object a;

    public roq(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8) {
        HashMap map = new HashMap();
        map.put(aixr.TRIGGER_TYPE_SLOT_ID_SCHEDULED, agke.q(awmdVar));
        map.put(aixr.TRIGGER_TYPE_ON_NEXT_SLOT_ENTER_REQUESTED, agke.q(awmdVar));
        map.put(aixr.TRIGGER_TYPE_SLOT_ID_ENTERED, agke.q(awmdVar));
        map.put(aixr.TRIGGER_TYPE_SLOT_ID_EXITED, agke.q(awmdVar));
        map.put(aixr.TRIGGER_TYPE_LAYOUT_ID_ENTERED, agke.q(awmdVar));
        map.put(aixr.TRIGGER_TYPE_ON_DIFFERENT_LAYOUT_ID_ENTERED, agke.q(awmdVar));
        map.put(aixr.TRIGGER_TYPE_LAYOUT_ID_EXITED, agke.q(awmdVar));
        map.put(aixr.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON, agke.q(awmdVar));
        map.put(aixr.TRIGGER_TYPE_MINI_APP_PAGE_ENTERED, agke.q(awmdVar2));
        map.put(aixr.TRIGGER_TYPE_MINI_APP_ABANDONED, agke.q(awmdVar2));
        map.put(aixr.TRIGGER_TYPE_MINI_APP_PLAYBACK_ENDED, agke.q(awmdVar2));
        map.put(aixr.TRIGGER_TYPE_MINI_APP_SKIP_REQUESTED, agke.q(awmdVar2));
        map.put(aixr.TRIGGER_TYPE_ON_PAGE_ENTERED, agke.q(awmdVar2));
        map.put(aixr.TRIGGER_TYPE_ON_PAGE_EXITED, agke.q(awmdVar2));
        map.put(aixr.TRIGGER_TYPE_REEL_ITEM_SEQUENCE_ABANDONED, agke.q(awmdVar2));
        map.put(aixr.TRIGGER_TYPE_ON_LAYOUT_SELF_EXIT_REQUESTED, agke.q(awmdVar4));
        map.put(aixr.TRIGGER_TYPE_ON_VIDEO_AD_START_PLAYING, agke.q(awmdVar3));
        map.put(aixr.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID, agke.q(awmdVar3));
        map.put(aixr.TRIGGER_TYPE_ON_PLAYBACK_WITH_CONTENT_VIDEO_ID, agke.q(awmdVar3));
        map.put(aixr.TRIGGER_TYPE_MEDIA_TIME_RANGE, agke.q(awmdVar5));
        map.put(aixr.TRIGGER_TYPE_ENGAGEMENT_PANEL_CLOSE_REQUESTED, agke.q(awmdVar6));
        map.put(aixr.TRIGGER_TYPE_ENGAGEMENT_PANEL_AUTO_CLOSE, agke.q(awmdVar6));
        map.put(aixr.TRIGGER_TYPE_SURVEY_SUBMITTED, agke.q(awmdVar7));
        map.put(aixr.TRIGGER_TYPE_MEDIA_RESUMED, agke.q(awmdVar8));
        this.a = map;
    }

    public static ajwo i(xgn xgnVar, ajwo ajwoVar, int i) {
        return j(xgnVar, ajwoVar, Optional.of(Integer.valueOf(i)), Optional.empty());
    }

    public static ajwo j(xgn xgnVar, ajwo ajwoVar, Optional optional, Optional optional2) {
        if (xgnVar == null || xgnVar.a() == null) {
            return ajwoVar;
        }
        aihf aihfVarCreateBuilder = aoar.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        saa saaVar = new saa(aihfVarCreateBuilder, 18);
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            Object obj2 = saaVar.a;
            int iIntValue = ((Integer) obj).intValue();
            aihf aihfVar = (aihf) obj2;
            aihfVar.copyOnWrite();
            aoar aoarVar = (aoar) aihfVar.instance;
            aoarVar.b |= 2;
            aoarVar.d = iIntValue;
        }
        optional2.isPresent();
        xgt xgtVarA = xgnVar.a();
        if (xgtVarA != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aoar aoarVar2 = (aoar) aihfVarCreateBuilder.instance;
            String str = xgtVarA.a;
            str.getClass();
            aoarVar2.b |= 1;
            aoarVar2.c = str;
        }
        aihh aihhVar = (aihh) ajwoVar.toBuilder();
        aihhVar.e(aoaq.b, (aoar) aihfVarCreateBuilder.build());
        aihhVar.copyOnWrite();
        ajwo ajwoVar2 = (ajwo) aihhVar.instance;
        ajwoVar2.b &= -2;
        ajwoVar2.c = ajwo.a.c;
        return (ajwo) aihhVar.build();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    public final rol a(rnp rnpVar, ViewGroup viewGroup) {
        Context context = (Context) this.a.io();
        context.getClass();
        rnpVar.getClass();
        return new rol(context, rnpVar, viewGroup);
    }

    public final void b() {
        WeakHashMap weakHashMap = (WeakHashMap) this.a;
        for (Animator animator : weakHashMap.values()) {
            animator.removeAllListeners();
            animator.cancel();
        }
        weakHashMap.clear();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection] */
    public final agke c() {
        return agke.n(this.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final boolean d(aixr aixrVar) {
        List list;
        ?? r2 = this.a;
        return (!r2.containsKey(aixrVar) || (list = (List) r2.get(aixrVar)) == null || list.isEmpty()) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final scr e(int i, aizs aizsVar, smr smrVar, sko skoVar, sgp sgpVar) throws sav {
        aixr aixrVarA = aixr.a(aizsVar.e);
        if (aixrVarA == null) {
            aixrVarA = aixr.TRIGGER_TYPE_UNSPECIFIED;
        }
        if (!d(aixrVarA)) {
            aixr aixrVarA2 = aixr.a(aizsVar.e);
            if (aixrVarA2 == null) {
                aixrVarA2 = aixr.TRIGGER_TYPE_UNSPECIFIED;
            }
            throw new sav("Trigger adapter not found for trigger type: " + aixrVarA2.aT, 11);
        }
        scr scrVar = (scr) ((awmd) ((List) this.a.get(aixrVarA)).get(0)).io();
        ?? r0 = scrVar.d.a;
        if (!r0.containsKey(aizsVar.d)) {
            scrVar.a(aizsVar, smrVar);
            r0.put(aizsVar.d, new snl(i, aizsVar, smrVar, skoVar));
            scrVar.v(i, aizsVar, smrVar, sgpVar);
            if (scrVar.ae(aizsVar, smrVar, sgpVar)) {
                scrVar.s(aizsVar);
            }
            return scrVar;
        }
        aixr aixrVarA3 = aixr.a(aizsVar.e);
        if (aixrVarA3 == null) {
            aixrVarA3 = aixr.TRIGGER_TYPE_UNSPECIFIED;
        }
        throw new sav("Tried to register duplicate trigger: " + aixrVarA3.aT + " for slot: " + smrVar.a, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v14 */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v18 */
    /* JADX WARN: Type inference failed for: r17v19 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r1v17, types: [awmd] */
    /* JADX WARN: Type inference failed for: r1v23, types: [spv] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v3, types: [spv] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v14, types: [agke, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v34, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r4v28, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v33, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void f(int i, skh skhVar, Supplier supplier) {
        ?? r17;
        ?? r13 = this.a;
        rsk rskVar = (rsk) r13.io();
        rskVar.f.f(aixe.ADS_CLIENT_EVENT_TYPE_OPPORTUNITY_RECEIVED, null, null, null, null, i, null, null, skhVar, null, null, false);
        agqr it = ((agqj) rskVar.e).iterator();
        while (it.hasNext()) {
            sbj sbjVar = (sbj) it.next();
            ArrayList arrayList = new ArrayList();
            for (sni sniVar : sbjVar.g.aa()) {
                snk snkVar = sniVar.b;
                if ((snkVar instanceof sly) && ((sly) snkVar).a == i) {
                    arrayList.add(sniVar);
                }
            }
            if (!arrayList.isEmpty()) {
                ((rsk) sbjVar.a.io()).q(arrayList);
            }
        }
        List list = (List) supplier.get();
        rsk rskVar2 = (rsk) r13.io();
        spv spvVar = rskVar2.f;
        spvVar.f(aixe.ADS_CLIENT_EVENT_TYPE_OPPORTUNITY_PROCESSED, null, null, null, null, i, list, null, skhVar, null, null, false);
        if (list == null || list.isEmpty()) {
            return;
        }
        ?? r1 = spvVar;
        ?? it2 = list.iterator();
        while (it2.hasNext()) {
            smr smrVar = (smr) it2.next();
            r1.f(aixe.ADS_CLIENT_EVENT_TYPE_SLOT_RECEIVED, smrVar, null, null, null, 0, null, null, skhVar, null, null, false);
            r1.f(aixe.ADS_CLIENT_EVENT_TYPE_SCHEDULE_SLOT_REQUESTED, smrVar, null, null, null, 0, null, null, skhVar, null, null, false);
            try {
                srh srhVar = rskVar2.g;
                try {
                    if (smrVar == null) {
                        throw new sau("Slot was null", 5);
                    }
                    if (TextUtils.isEmpty(smrVar.a)) {
                        throw new sau("Slot ID was empty", 2);
                    }
                    if (!((agkz) srhVar.j).contains(smrVar.c())) {
                        throw new sau("Slot type not supported by this application", 2);
                    }
                    ?? r2 = smrVar.d;
                    if (r2.isEmpty()) {
                        throw new sau("Slot entry trigger was empty", 8);
                    }
                    int i2 = ((agpi) r2).d;
                    int i3 = 0;
                    while (i3 < i2) {
                        snk snkVar2 = (snk) r2.get(i3);
                        i3++;
                        if (srhVar.e.get(snkVar2.a()) == null) {
                            throw new sau("No trigger adapter registered for entry with trigger of type: ".concat(String.valueOf(snkVar2.a().name())), 11);
                        }
                    }
                    if (smrVar.k.isPresent()) {
                        throw new sau("V2 trigger as slot entry triggers are not supported for V1 slot", 141);
                    }
                    agke agkeVar = smrVar.e;
                    if (agkeVar.isEmpty()) {
                        throw new sau("Slot fulfillment trigger was empty", 9);
                    }
                    int i4 = ((agpi) agkeVar).d;
                    int i5 = 0;
                    while (i5 < i4) {
                        snk snkVar3 = (snk) agkeVar.get(i5);
                        i5++;
                        if (srhVar.e.get(snkVar3.a()) == null) {
                            throw new sau("No trigger adapter registered for fulfillment with trigger of type: ".concat(String.valueOf(snkVar3.a().name())), 11);
                        }
                    }
                    agke agkeVar2 = smrVar.f;
                    if (agkeVar2.isEmpty()) {
                        throw new sau("Slot expiration trigger was empty", 10);
                    }
                    int i6 = ((agpi) agkeVar2).d;
                    int i7 = 0;
                    while (i7 < i6) {
                        snk snkVar4 = (snk) agkeVar2.get(i7);
                        i7++;
                        if (srhVar.e.get(snkVar4.a()) == null) {
                            throw new sau("No trigger adapter registered for expiration with trigger of type: ".concat(String.valueOf(snkVar4.a().name())), 11);
                        }
                    }
                    if (!smrVar.l.isEmpty()) {
                        throw new sau("V2 triggers as slot expiration triggers are not supported for V1 slot", 141);
                    }
                    srhVar.m(smrVar, skhVar);
                    srhVar.f(smrVar);
                    try {
                        rsl rslVarA = srhVar.a(smrVar);
                        int i8 = 0;
                        while (i8 < i2) {
                            snk snkVar5 = (snk) r2.get(i8);
                            ?? r16 = r1;
                            try {
                                scg scgVar = (scg) ((awmd) srhVar.e.get(snkVar5.a())).io();
                                r17 = r2;
                                scgVar.z(8, snkVar5, smrVar, null);
                                rslVarA.d.put(snkVar5.b(), scgVar);
                                i8++;
                                r1 = r16;
                                r2 = r17;
                            } catch (rwp | sau | sbe e) {
                                e = e;
                                r17 = it2;
                                r1 = r16;
                                rskVar2.f.d(4, ((sar) e).a(), skhVar, smrVar);
                                rmp rmpVar = rskVar2.h;
                                e.toString();
                                rskVar2.r(smrVar, true);
                                rskVar2.s(smrVar, true);
                                it2 = r17;
                                r1 = r1;
                            }
                        }
                        ?? r18 = r1;
                        for (int i9 = 0; i9 < i4; i9++) {
                            snk snkVar6 = (snk) agkeVar.get(i9);
                            scg scgVar2 = (scg) ((awmd) srhVar.e.get(snkVar6.a())).io();
                            scgVar2.z(7, snkVar6, smrVar, null);
                            rslVarA.e.put(snkVar6.b(), scgVar2);
                        }
                        for (int i10 = 0; i10 < i6; i10++) {
                            snk snkVar7 = (snk) agkeVar2.get(i10);
                            scg scgVar3 = (scg) ((awmd) srhVar.e.get(snkVar7.a())).io();
                            scgVar3.z(6, snkVar7, smrVar, null);
                            rslVarA.g.put(snkVar7.b(), scgVar3);
                        }
                        r1 = (awmd) ((agkj) ((rnj) srhVar.f).a).get(smrVar.c());
                        try {
                            if (r1 == 0) {
                                throw new rwp("Could not find a matching fulfillmentAdapterFactory for slotType: ".concat(String.valueOf(smrVar.c().name())));
                            }
                            rvo rvoVarA = ((rwq) r1.io()).a(smrVar);
                            Object obj = srhVar.d;
                            awmd awmdVar = (awmd) ((agkj) ((tld) obj).a).get(smrVar.c());
                            if (awmdVar == null) {
                                throw new sbe("Could not find a matching slotAdapterFactory for slotType: ".concat(String.valueOf(smrVar.c().name())));
                            }
                            sba sbaVarA = ((sbf) awmdVar.io()).a((rsk) ((tld) obj).b.io(), smrVar);
                            rslVarA.o = rvoVarA;
                            rslVarA.p = sbaVarA;
                            r17 = it2;
                            r1 = r18;
                            r1.f(aixe.ADS_CLIENT_EVENT_TYPE_SLOT_SCHEDULED, smrVar, null, null, null, 0, null, null, skhVar, null, null, false);
                            srhVar.h(smrVar);
                            Iterator it3 = rskVar2.a.iterator();
                            while (it3.hasNext()) {
                                ((sao) it3.next()).h(smrVar);
                            }
                            rskVar2.r(smrVar, false);
                            it2 = r17;
                            r1 = r1;
                        } catch (rwp e2) {
                            e = e2;
                            rskVar2.f.d(4, ((sar) e).a(), skhVar, smrVar);
                            rmp rmpVar2 = rskVar2.h;
                            e.toString();
                            rskVar2.r(smrVar, true);
                            rskVar2.s(smrVar, true);
                        } catch (sau e3) {
                            e = e3;
                            rskVar2.f.d(4, ((sar) e).a(), skhVar, smrVar);
                            rmp rmpVar3 = rskVar2.h;
                            e.toString();
                            rskVar2.r(smrVar, true);
                            rskVar2.s(smrVar, true);
                        } catch (sbe e4) {
                            e = e4;
                            rskVar2.f.d(4, ((sar) e).a(), skhVar, smrVar);
                            rmp rmpVar4 = rskVar2.h;
                            e.toString();
                            rskVar2.r(smrVar, true);
                            rskVar2.s(smrVar, true);
                        }
                    } catch (rwp | sau | sbe e5) {
                        e = e5;
                        r17 = it2;
                    }
                } catch (sau e6) {
                    e = e6;
                    rskVar2.f.d(3, e.a, skhVar, smrVar);
                    rmp rmpVar5 = rskVar2.h;
                    e.toString();
                }
            } catch (sau e7) {
                e = e7;
                r17 = it2;
            }
        }
    }

    public final avlr g() {
        return ((avlr) this.a).r();
    }

    public final void h(awqg awqgVar) {
        taq.d();
        taq.d();
        awli awliVar = (awli) this.a;
        Object objAu = awliVar.au();
        objAu.getClass();
        awliVar.kk(awqgVar.invoke(objAu));
    }

    public final ugo k(xhc xhcVar) {
        return new ugo(this, new xgj(xhcVar));
    }

    public roq(Object obj, char[] cArr) {
        this.a = obj;
    }

    public roq(awmd awmdVar) {
        awmdVar.getClass();
        this.a = awmdVar;
    }

    public roq(Object obj) {
        obj.getClass();
        this.a = new awli(obj);
    }

    public roq(ovo ovoVar) {
        ovoVar.getClass();
        this.a = ovoVar;
    }

    public roq() {
        this.a = new ArrayList();
    }

    public roq(acwq acwqVar, Context context) {
        acwqVar.getClass();
        context.getClass();
        this.a = acwqVar;
    }

    public roq(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public roq(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new awku();
    }

    public roq(byte[] bArr, char[] cArr) {
        this.a = new AtomicReference();
    }

    public roq(char[] cArr) {
        this.a = new AtomicReference();
    }

    public roq(byte[] bArr, byte[] bArr2) {
        this.a = new ArrayList();
    }

    public roq(byte[] bArr) {
        this.a = new WeakHashMap();
    }

    public roq(char[] cArr, byte[] bArr) {
        this.a = new HashSet();
    }
}
