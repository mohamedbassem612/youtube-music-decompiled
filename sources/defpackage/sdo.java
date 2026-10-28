package defpackage;

import app.rive.semantics.SemanticState;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sdo {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public sdo(nzw nzwVar, Executor executor, adam adamVar) {
        this.d = nzwVar;
        this.c = executor;
        String strB = nzwVar.b();
        this.a = strB;
        this.b = adamVar;
        nzwVar.d(strB);
    }

    public static final sna d(aqfv aqfvVar, wjf wjfVar, String str, String str2, int i) {
        return new sna(wjfVar.G(), wjfVar.ab(), wjfVar.A(), str, wjfVar.R(), wjfVar.f(), str2, aqfvVar, i);
    }

    public static final sna e(aqfv aqfvVar, aivt aivtVar, wjf wjfVar, String str, String str2, int i) {
        aivu aivuVar = aivtVar.e;
        if (aivuVar == null) {
            aivuVar = aivu.a;
        }
        apji apjiVar = aivuVar.b;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aljy aljyVar = (aljy) aavv.s(apjiVar, aljz.a);
        if (aljyVar == null) {
            throw new sas("Unable to fetch the in player ad layout renderer to build a layout.", 117);
        }
        apji apjiVar2 = aljyVar.c;
        if (apjiVar2 == null) {
            apjiVar2 = apji.a;
        }
        aqfv aqfvVar2 = (aqfv) aavv.s(apjiVar2, aqfy.a);
        if (aqfvVar2 == null) {
            throw new sas("Unable to fetch the survey ad renderer to build a layout.", 117);
        }
        aihf builder = aqfvVar.toBuilder();
        builder.mergeFrom((aihn) aqfvVar2);
        return d((aqfv) builder.build(), wjfVar, str, str2, i);
    }

    public static final sna f(List list, aqfv aqfvVar, wjf wjfVar, String str, String str2, String str3, int i, Optional optional) {
        Optional optionalEmpty;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (aisv aisvVar : ((aisu) it.next()).e) {
                aqfv aqfvVar2 = aisvVar.e;
                if (aqfvVar2 == null) {
                    aqfvVar2 = aqfv.a;
                }
                if ((aqfvVar2.b & SemanticState.Modal) != 0) {
                    aqfv aqfvVar3 = aisvVar.e;
                    if (aqfvVar3 == null) {
                        aqfvVar3 = aqfv.a;
                    }
                    if (aqfvVar3.h.equals(str)) {
                        aqfv aqfvVar4 = aisvVar.e;
                        if (aqfvVar4 == null) {
                            aqfvVar4 = aqfv.a;
                        }
                        aihf builder = aqfvVar4.toBuilder();
                        builder.mergeFrom((aihn) aqfvVar);
                        aqfv aqfvVar5 = aisvVar.e;
                        if (((aqfvVar5 == null ? aqfv.a : aqfvVar5).b & SemanticState.Focused) != 0) {
                            if (aqfvVar5 == null) {
                                aqfvVar5 = aqfv.a;
                            }
                            aigj aigjVar = aqfvVar5.g;
                            builder.copyOnWrite();
                            aqfv aqfvVar6 = (aqfv) builder.instance;
                            aigjVar.getClass();
                            aqfvVar6.b |= SemanticState.Focused;
                            aqfvVar6.g = aigjVar;
                        }
                        aqfv aqfvVar7 = aisvVar.e;
                        int i2 = 2;
                        if (((aqfvVar7 == null ? aqfv.a : aqfvVar7).b & 2) != 0) {
                            if (aqfvVar7 == null) {
                                aqfvVar7 = aqfv.a;
                            }
                            apji apjiVar = aqfvVar7.d;
                            if (apjiVar == null) {
                                apjiVar = apji.a;
                            }
                            aihl aihlVarCheckIsLite = aihn.checkIsLite(aqhj.a);
                            apjiVar.c(aihlVarCheckIsLite);
                            Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
                            aqhi aqhiVar = (aqhi) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                            String str4 = aqhiVar.c;
                            if (optional.isPresent()) {
                                agke agkeVarB = ((wgk) optional.get()).b(agke.q(aixo.SLOT_TYPE_PLAYER_BYTES));
                                int size = agkeVarB.size();
                                int i3 = 0;
                                loop2: while (true) {
                                    if (i3 >= size) {
                                        optionalEmpty = Optional.empty();
                                        break;
                                    }
                                    aivu aivuVar = ((aivt) agkeVarB.get(i3)).e;
                                    if (aivuVar == null) {
                                        aivuVar = aivu.a;
                                    }
                                    apji apjiVar2 = aivuVar.b;
                                    if (apjiVar2 == null) {
                                        apjiVar2 = apji.a;
                                    }
                                    aopn aopnVar = (aopn) aavv.s(apjiVar2, aopo.a);
                                    if (aopnVar != null) {
                                        aiuc aiucVar = aopnVar.c;
                                        if (aiucVar == null) {
                                            aiucVar = aiuc.a;
                                        }
                                        if (aiucVar.c.equals(str4)) {
                                            optionalEmpty = Optional.of(aopnVar);
                                            break;
                                        }
                                        apji apjiVar3 = aopnVar.d;
                                        if (apjiVar3 == null) {
                                            apjiVar3 = apji.a;
                                        }
                                        aopr aoprVar = (aopr) aavv.s(apjiVar3, aops.a);
                                        agke agkeVar = aoprVar != null ? (agke) Collection.EL.stream(aoprVar.b).filter(new uvm(15)).map(new vmw(8)).collect(aghu.a) : agpi.a;
                                        int size2 = agkeVar.size();
                                        int i4 = 0;
                                        while (i4 < size2) {
                                            aopn aopnVar2 = (aopn) agkeVar.get(i4);
                                            aiuc aiucVar2 = aopnVar2.c;
                                            if (aiucVar2 == null) {
                                                aiucVar2 = aiuc.a;
                                            }
                                            i4++;
                                            if (aiucVar2.c.equals(str4)) {
                                                optionalEmpty = Optional.of(aopnVar2);
                                                break loop2;
                                            }
                                        }
                                    }
                                    i3++;
                                }
                            } else {
                                agke agkeVarC = nre.c(wjfVar.u());
                                int size3 = agkeVarC.size();
                                int i5 = 0;
                                loop4: while (true) {
                                    if (i5 >= size3) {
                                        optionalEmpty = Optional.empty();
                                        break;
                                    }
                                    aivu aivuVar2 = ((aivt) agkeVarC.get(i5)).e;
                                    if (aivuVar2 == null) {
                                        aivuVar2 = aivu.a;
                                    }
                                    apji apjiVar4 = aivuVar2.b;
                                    if (apjiVar4 == null) {
                                        apjiVar4 = apji.a;
                                    }
                                    aopn aopnVar3 = (aopn) aavv.s(apjiVar4, aopo.a);
                                    if (aopnVar3 != null) {
                                        aiuc aiucVar3 = aopnVar3.c;
                                        if (aiucVar3 == null) {
                                            aiucVar3 = aiuc.a;
                                        }
                                        if (aiucVar3.c.equals(str4)) {
                                            optionalEmpty = Optional.of(aopnVar3);
                                            break;
                                        }
                                        apji apjiVar5 = aopnVar3.d;
                                        if (apjiVar5 == null) {
                                            apjiVar5 = apji.a;
                                        }
                                        aopr aoprVar2 = (aopr) aavv.s(apjiVar5, aops.a);
                                        agke agkeVar2 = aoprVar2 != null ? (agke) Collection.EL.stream(aoprVar2.b).filter(new sde(i2)).map(new rxg(10)).collect(aghu.a) : agpi.a;
                                        int size4 = agkeVar2.size();
                                        int i6 = 0;
                                        while (i6 < size4) {
                                            aopn aopnVar4 = (aopn) agkeVar2.get(i6);
                                            aiuc aiucVar4 = aopnVar4.c;
                                            if (aiucVar4 == null) {
                                                aiucVar4 = aiuc.a;
                                            }
                                            i6++;
                                            if (aiucVar4.c.equals(str4)) {
                                                optionalEmpty = Optional.of(aopnVar4);
                                                break loop4;
                                            }
                                        }
                                    }
                                    i5++;
                                }
                            }
                            if (optionalEmpty.isPresent()) {
                                aihf builder2 = aqhiVar.toBuilder();
                                apji apjiVar6 = ((aopn) optionalEmpty.get()).d;
                                if (apjiVar6 == null) {
                                    apjiVar6 = apji.a;
                                }
                                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aqhj.a);
                                apjiVar6.c(aihlVarCheckIsLite2);
                                Object objK2 = apjiVar6.j.k(aihlVarCheckIsLite2.d);
                                builder2.mergeFrom((aihn) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2)));
                                aqhi aqhiVar2 = (aqhi) builder2.build();
                                aihh aihhVar = (aihh) apji.a.createBuilder();
                                aihhVar.e(aqhj.a, aqhiVar2);
                                builder.copyOnWrite();
                                aqfv aqfvVar8 = (aqfv) builder.instance;
                                apji apjiVar7 = (apji) aihhVar.build();
                                apjiVar7.getClass();
                                aqfvVar8.d = apjiVar7;
                                aqfvVar8.b |= 2;
                            }
                        }
                        return d((aqfv) builder.build(), wjfVar, str2, str3, i);
                    }
                }
            }
        }
        throw new sas("Not able to create a merged survey ad.", 117);
    }

    public static final void j(acfw acfwVar) throws rso {
        acjb acjbVarD = acfwVar.d();
        if (acjbVarD == null) {
            throw new rso("Null playback timeline for Play Next in Queue", 118);
        }
        acjbVarD.J();
    }

    public static final void k(acfw acfwVar, boolean z, boolean z2, boolean z3, String... strArr) throws rso {
        acjd acjdVarC;
        acjb acjbVarD = acfwVar.d();
        if (acjbVarD == null) {
            throw new rso("Null playback timeline for Ad segment removal", 76);
        }
        long j = (!z2 || (acjdVarC = acjbVarD.c((String) DesugarArrays.stream(strArr).findFirst().orElse(null))) == null || acjdVarC.a() == null) ? 0L : acjdVarC.a().b;
        for (String str : strArr) {
            acjbVarD.d(str);
        }
        if (z) {
            for (String str2 : strArr) {
                acjbVarD.K(str2);
            }
            if (!z2 || j == 0) {
                acjbVarD.e(z3, acjc.REMOVE_QUEUED_SEGMENTS);
            } else {
                acjbVarD.P(new acja(Boolean.valueOf(z3), Long.valueOf(j), acjc.REMOVE_QUEUED_SEGMENTS));
            }
        }
    }

    public static final aciw l(wjf wjfVar, String str, acfw acfwVar, abnp abnpVar, boolean z) throws rso {
        acjb acjbVarD = acfwVar.d();
        if (acjbVarD == null) {
            throw new rso("Null playback timeline for Ad segment creation", 75);
        }
        abno abnoVarB = abnpVar != null ? abnp.b(abnpVar) : abnp.a();
        abnoVarB.g(new abxz(aavv.p(new abxk(false)), aavv.p(abxn.a), aavv.p(new abxj(1.0f, Float.valueOf(1.0f)))));
        return acjbVarD.W(wjfVar, str, abnoVarB.a(), z);
    }

    public static List m(List list) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            axq axqVar = (axq) it.next();
            Object obj2 = axqVar.a;
            if (obj2 != null && (obj = axqVar.b) != null) {
                nzp nzpVar = new nzp();
                nzpVar.b(nzs.NATIVE_LIBRARY_CHECK.x);
                nzpVar.c = Long.valueOf(((Long) obj).longValue() / 1000);
                nzq nzqVarA = nzr.a();
                nzqVarA.c(agpr.a);
                nzqVarA.c = (String) obj2;
                nzqVarA.b = new nzo(false, 0L);
                nzpVar.e = nzqVarA.a();
                arrayList.add(nzpVar);
            }
        }
        return arrayList;
    }

    public final sgt a(aiwa aiwaVar, wjf wjfVar, String str, String str2, int i, smc smcVar) {
        aizx aizxVar = ((vyo) this.b).b().o;
        if (aizxVar == null) {
            aizxVar = aizx.a;
        }
        return new sgt(aiwaVar, wjfVar, str, str2, i, smcVar, aizxVar.I);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x007d  */
    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, mbc] */
    public final skz b(arcg arcgVar, wjf wjfVar, String str, String str2, int i, boolean z) {
        alvt alvtVar;
        alvt alvtVar2;
        wjf wjiVar;
        int i2;
        int i3;
        taq.c();
        wjb wjbVar = (wjb) this.d.io();
        wiu wiuVarF = wjfVar.f();
        aivg aivgVar = arcgVar.f;
        if (aivgVar == null) {
            aivgVar = aivg.a;
        }
        if (aivgVar.b.size() == 0) {
            Object obj = this.c;
            byte[] bArrG = arcgVar.e.G();
            alvtVar = alvt.a;
            alvtVar2 = (alvt) ((wjr) obj).D(bArrG, alvtVar);
            if (alvtVar2 == null) {
                zvp.a(zvn.a, zvm.a, "AdBreakRenderer path ad playerResponse cannot be deserialized.");
            } else {
                alvtVar = alvtVar2;
            }
            wjiVar = new wji(alvtVar, 0L, wjbVar);
        } else {
            aivg aivgVar2 = arcgVar.f;
            if (aivgVar2 == null) {
                aivgVar2 = aivg.a;
            }
            wjiVar = sll.a(wjbVar, aivgVar2, wiuVarF);
            if (wjiVar == null) {
                Object obj2 = this.c;
                byte[] bArrG2 = arcgVar.e.G();
                alvtVar = alvt.a;
                alvtVar2 = (alvt) ((wjr) obj2).D(bArrG2, alvtVar);
                if (alvtVar2 == null) {
                    zvp.a(zvn.a, zvm.a, "AdBreakRenderer path ad playerResponse cannot be deserialized.");
                } else {
                    alvtVar = alvtVar2;
                }
                wjiVar = new wji(alvtVar, 0L, wjbVar);
            }
        }
        wjf wjfVar2 = wjiVar;
        if (z) {
            Duration durationOfMillis = Duration.ofMillis(taq.Y((vyo) this.b));
            int i4 = arcgVar.b & 4;
            Duration durationOfSeconds = Duration.ofSeconds(wjfVar2.a());
            if (i4 == 0 || i != 0) {
                i2 = i;
                i3 = 0;
            } else if (durationOfSeconds.compareTo(durationOfMillis) > 0) {
                i2 = 0;
                i3 = 1;
            } else {
                i2 = 0;
                i3 = 0;
            }
        } else {
            i2 = i;
            i3 = 0;
        }
        return new skz(wjfVar, wjfVar.A(), str, str2, this.a.f().toEpochMilli(), arcgVar, wjfVar2, i2, taq.aZ((vyo) this.b), i3);
    }

    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Object, mbc] */
    public final skz c(List list, arcg arcgVar, wjf wjfVar, wjf wjfVar2, String str, String str2, String str3, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (aisv aisvVar : ((aisu) it.next()).e) {
                arcg arcgVar2 = aisvVar.c;
                if (arcgVar2 == null) {
                    arcgVar2 = arcg.a;
                }
                if ((arcgVar2.b & 8388608) != 0) {
                    arcg arcgVar3 = aisvVar.c;
                    if (arcgVar3 == null) {
                        arcgVar3 = arcg.a;
                    }
                    if (arcgVar3.r.equals(str)) {
                        arcg arcgVar4 = aisvVar.c;
                        if (arcgVar4 == null) {
                            arcgVar4 = arcg.a;
                        }
                        aihf builder = arcgVar4.toBuilder();
                        builder.mergeFrom((aihn) arcgVar);
                        return new skz(wjfVar, wjfVar.A(), str2, str3, this.a.f().toEpochMilli(), (arcg) builder.build(), wjfVar2, i, taq.aZ((vyo) this.b), 0);
                    }
                }
            }
        }
        throw new sas("Not able to create a merged local video ad.", 117);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void g(acfw acfwVar, String str) {
        acjb acjbVarD = acfwVar.d();
        if (acjbVarD != null) {
            acjd acjdVar = acjbVarD.h;
            aciw aciwVar = acjdVar instanceof aciw ? (aciw) acjdVar : null;
            if (aciwVar != null && aciwVar.j()) {
                zvp.a(zvn.a, zvm.k, "b256630371 aftimeout");
                acjbVarD.f.accept("sdai", "aftimeout");
                acjbVarD.m.add(str);
            }
            if (afxw.e((vyo) this.a).aO) {
                this.c.execute(afwl.i(new rno(acjbVarD, 9)));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void h(acfw acfwVar, final long j, final boolean z, final long j2, final aciw... aciwVarArr) throws Throwable {
        final acjb acjbVarD = acfwVar.d();
        if (acjbVarD == null) {
            throw new rso("Null playback timeline for Ad queue", 72);
        }
        if (aciwVarArr.length != 0) {
            if (!afxw.e((vyo) this.a).W) {
                this.b.execute(afwl.i(new Runnable() { // from class: rur
                    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.concurrent.Executor] */
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        aciw[] aciwVarArr2 = aciwVarArr;
                        int length = aciwVarArr2.length;
                        int i = 0;
                        while (true) {
                            acjb acjbVar = acjbVarD;
                            if (i >= length) {
                                boolean z2 = z;
                                long j3 = j2;
                                long j4 = j;
                                sdo sdoVar = this.f;
                                acjbVar.aa(j4, j3 + j4, null, aciwVarArr2);
                                acjbVar.N(z2);
                                sdoVar.c.execute(afwl.i(new rhz(sdoVar, acjbVar, 16, null)));
                                return;
                            }
                            acjbVar.d(aciwVarArr2[i].h);
                            i++;
                        }
                    }
                }));
                return;
            }
            for (aciw aciwVar : aciwVarArr) {
                acjbVarD.d(aciwVar.h);
            }
            acjbVarD.aa(j, j + j2, null, aciwVarArr);
            acjbVarD.N(z);
            if (!a.x()) {
                this.c.execute(afwl.i(new rhz(this, acjbVarD, 15, null)));
                return;
            }
            acjbVarD.e(false, acjc.QUEUE_SEGMENTS);
            acm acmVar = (acm) this.d;
            if (acmVar.f()) {
                acmVar.d();
            }
        }
    }

    public final void i(acfw acfwVar, boolean z, long j, aciw... aciwVarArr) throws Throwable {
        acjb acjbVarD = acfwVar.d();
        if (acjbVarD == null) {
            throw new rso("Null playback timeline for Ad queue via interrupt", 73);
        }
        h(acfwVar, acjbVarD.a(acfwVar.e(), acfwVar.a()), z, j, aciwVarArr);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void n() {
        this.c.execute(new mga(this, 12));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final Map o() {
        ?? r0 = this.c;
        return r0 == 0 ? Collections.EMPTY_MAP : r0;
    }

    public sdo(String str, Map map, lho lhoVar, liw liwVar) {
        this.a = str;
        this.c = map;
        this.d = lhoVar;
        this.b = liwVar;
    }

    public sdo(mbc mbcVar, vyo vyoVar, wjr wjrVar, awmd awmdVar) {
        this.a = mbcVar;
        this.b = vyoVar;
        this.c = wjrVar;
        this.d = awmdVar;
    }

    public sdo(vyo vyoVar, Executor executor, Executor executor2, acm acmVar) {
        this.a = vyoVar;
        this.b = executor;
        this.c = executor2;
        this.d = acmVar;
    }

    public sdo(String str, lho lhoVar) {
        this(str, Collections.EMPTY_MAP, lhoVar, (liw) null);
    }

    public sdo(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, Executor executor) {
        this.d = awmdVar;
        this.c = awmdVar2;
        this.a = executor;
        this.b = awmdVar3;
    }

    public sdo(rqa rqaVar, wnw wnwVar, zwb zwbVar, ajwo ajwoVar) {
        rqaVar.getClass();
        this.d = rqaVar;
        wnwVar.getClass();
        this.a = wnwVar;
        this.b = zwbVar;
        this.c = ajwoVar;
    }
}
