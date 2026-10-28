package defpackage;

import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abii implements abif {
    public final awmd a;
    public final Executor b;
    public final awmd c;
    public volatile String d;
    public final ConcurrentHashMap e;
    public final ConcurrentHashMap f;
    public volatile acga g;
    private final awmd h;
    private final avlh i;
    private final zvl j;
    private final awmd k;
    private final avmm l;

    public abii(awmd awmdVar, awmd awmdVar2, avlh avlhVar, avlh avlhVar2, zvl zvlVar, Executor executor, awmd awmdVar3, awmd awmdVar4) {
        awmdVar2.getClass();
        avlhVar.getClass();
        zvlVar.getClass();
        executor.getClass();
        this.a = awmdVar;
        this.h = awmdVar2;
        this.i = avlhVar2;
        this.j = zvlVar;
        this.b = executor;
        this.c = awmdVar3;
        this.k = awmdVar4;
        this.e = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
        avmm avmmVar = new avmm();
        this.l = avmmVar;
        avmmVar.c(avlhVar.al(new abid(new yrc(this, 14), 4), new abid(new yrc(this, 15), 5)));
        avmmVar.c(avlhVar2.al(new abid(new yrc(this, 16), 6), new abid(new yrc(this, 17), 7)));
    }

    public static /* synthetic */ void a(abii abiiVar, String str, Throwable th, ajtv ajtvVar, int i) {
        if ((i & 4) != 0) {
            ajtvVar = ajtv.ERROR_LEVEL_ERROR;
        }
        if ((i & 2) != 0) {
            th = null;
        }
        zvl zvlVar = abiiVar.j;
        zvj zvjVarA = zvk.a();
        zvjVarA.c(ajtvVar);
        zvjVarA.j = 21;
        zvjVarA.i = 1;
        zvjVarA.d(str);
        if (th != null) {
            zvjVarA.f(th);
        }
        zvlVar.a(zvjVarA.a());
    }

    /* JADX WARN: Code duplicated, block: B:69:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:76:0x02d9  */
    /* JADX WARN: Type inference failed for: r0v6, types: [acey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v27, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v35, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v39, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v46, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v53, types: [awmd, java.lang.Object] */
    @Override // defpackage.abif
    public final auzk b(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (str.length() == 0) {
            aihf aihfVarCreateBuilder = aosi.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aosi aosiVar = (aosi) aihfVarCreateBuilder.instance;
            aosiVar.c = acfz.bu(104);
            aosiVar.b |= 1;
            aihfVarCreateBuilder.copyOnWrite();
            aosi aosiVar2 = (aosi) aihfVarCreateBuilder.instance;
            aosiVar2.b |= 2;
            aosiVar2.d = "fromCpn is empty";
            aihn aihnVarBuild = aihfVarCreateBuilder.build();
            aihnVarBuild.getClass();
            return aajc.i((aosi) aihnVarBuild);
        }
        if (str2.length() == 0) {
            aihf aihfVarCreateBuilder2 = aosi.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            aosi aosiVar3 = (aosi) aihfVarCreateBuilder2.instance;
            aosiVar3.c = acfz.bu(202);
            aosiVar3.b |= 1;
            aihfVarCreateBuilder2.copyOnWrite();
            aosi aosiVar4 = (aosi) aihfVarCreateBuilder2.instance;
            aosiVar4.b |= 2;
            aosiVar4.d = "toCpn is empty";
            aihn aihnVarBuild2 = aihfVarCreateBuilder2.build();
            aihnVarBuild2.getClass();
            return aajc.i((aosi) aihnVarBuild2);
        }
        xsc xscVar = (xsc) this.k.io();
        if (str.length() == 0) {
            aihf aihfVarCreateBuilder3 = aosi.a.createBuilder();
            aihfVarCreateBuilder3.getClass();
            acfz.bt(104, aihfVarCreateBuilder3);
            acfz.bs("fromCpn is empty", aihfVarCreateBuilder3);
            return aajc.i(acfz.br(aihfVarCreateBuilder3));
        }
        if (str2.length() == 0) {
            aihf aihfVarCreateBuilder4 = aosi.a.createBuilder();
            aihfVarCreateBuilder4.getClass();
            acfz.bt(202, aihfVarCreateBuilder4);
            acfz.bs("toCpn is empty", aihfVarCreateBuilder4);
            return aajc.i(acfz.br(aihfVarCreateBuilder4));
        }
        ?? r0 = ((abwk) xscVar.c).d;
        if (r0 == 0) {
            zvl zvlVar = (zvl) xscVar.b.io();
            zvj zvjVarA = zvk.a();
            zvjVarA.d("[ChildPlaybackSkipperImpl] Director not found");
            zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
            zvjVarA.j = 21;
            zvlVar.a(zvjVarA.a());
            aihf aihfVarCreateBuilder5 = aosi.a.createBuilder();
            aihfVarCreateBuilder5.getClass();
            acfz.bt(303, aihfVarCreateBuilder5);
            acfz.bs("[ChildPlaybackSkipperImpl] Director not found", aihfVarCreateBuilder5);
            return aajc.i(acfz.br(aihfVarCreateBuilder5));
        }
        acip acipVarM = r0.m();
        if (acipVarM == null) {
            String strConcat = "[ChildPlaybackSkipperImpl] Content component not found for toCpn: ".concat(str2);
            zvl zvlVar2 = (zvl) xscVar.b.io();
            zvj zvjVarA2 = zvk.a();
            zvjVarA2.d(strConcat);
            zvjVarA2.c(ajtv.ERROR_LEVEL_ERROR);
            zvjVarA2.j = 21;
            zvjVarA2.i = 1;
            zvlVar2.a(zvjVarA2.a());
            aihf aihfVarCreateBuilder6 = aosi.a.createBuilder();
            aihfVarCreateBuilder6.getClass();
            acfz.bt(205, aihfVarCreateBuilder6);
            acfz.bs(strConcat, aihfVarCreateBuilder6);
            return aajc.i(acfz.br(aihfVarCreateBuilder6));
        }
        acjb acjbVarX = acipVarM.x();
        if (acjbVarX == null) {
            String strConcat2 = "[ChildPlaybackSkipperImpl] Timeline not found for toCpn: ".concat(str2);
            zvl zvlVar3 = (zvl) xscVar.b.io();
            zvj zvjVarA3 = zvk.a();
            zvjVarA3.d(strConcat2);
            zvjVarA3.c(ajtv.ERROR_LEVEL_ERROR);
            zvjVarA3.j = 21;
            zvlVar3.a(zvjVarA3.a());
            aihf aihfVarCreateBuilder7 = aosi.a.createBuilder();
            aihfVarCreateBuilder7.getClass();
            acfz.bt(2, aihfVarCreateBuilder7);
            acfz.bs(strConcat2, aihfVarCreateBuilder7);
            return aajc.i(acfz.br(aihfVarCreateBuilder7));
        }
        wjj wjjVarU = ((xsc) xscVar.a.io()).u(str);
        if (wjjVarU == null || !wjjVarU.a || !awrc.c(acipVarM.au(), str2)) {
            acjd acjdVarC = acjbVarX.c(str);
            if (acjdVarC == null) {
                String strConcat3 = "[ChildPlaybackSkipperImpl] Segment not found for fromCpn: ".concat(str);
                zvl zvlVar4 = (zvl) xscVar.b.io();
                zvj zvjVarA4 = zvk.a();
                zvjVarA4.d(strConcat3);
                zvjVarA4.c(ajtv.ERROR_LEVEL_ERROR);
                zvjVarA4.j = 21;
                zvlVar4.a(zvjVarA4.a());
                aihf aihfVarCreateBuilder8 = aosi.a.createBuilder();
                aihfVarCreateBuilder8.getClass();
                acfz.bt(203, aihfVarCreateBuilder8);
                acfz.bs(strConcat3, aihfVarCreateBuilder8);
                return aajc.i(acfz.br(aihfVarCreateBuilder8));
            }
            acjd acjdVarC2 = acjbVarX.c(str2);
            if (acjdVarC2 == null) {
                String strConcat4 = "[ChildPlaybackSkipperImpl] Segment not found for toCpn: ".concat(str2);
                zvl zvlVar5 = (zvl) xscVar.b.io();
                zvj zvjVarA5 = zvk.a();
                zvjVarA5.d(strConcat4);
                zvjVarA5.c(ajtv.ERROR_LEVEL_ERROR);
                zvjVarA5.j = 21;
                zvlVar5.a(zvjVarA5.a());
                aihf aihfVarCreateBuilder9 = aosi.a.createBuilder();
                aihfVarCreateBuilder9.getClass();
                acfz.bt(202, aihfVarCreateBuilder9);
                acfz.bs(strConcat4, aihfVarCreateBuilder9);
                return aajc.i(acfz.br(aihfVarCreateBuilder9));
            }
            acjb acjbVarA = acjdVarC.a();
            if (acjbVarA != null && (acjdVarC2 instanceof aciw) && awrc.c(((aciw) acjdVarC2).a(), acjbVarA)) {
                acjbVarA.M(acjdVarC2);
            }
            if (acjdVarC instanceof aciv) {
                if (acjdVarC2 instanceof aciv) {
                    r0.H(str2);
                } else if (acjdVarC2 instanceof aciw) {
                    acjd acjdVarB = acjbVarX.B(str, Optional.of(new aaep(10)));
                    if (awrc.c(acjdVarB != null ? acjdVarB.b() : null, str2)) {
                        r0.R();
                    } else {
                        acjbVarX.O(str2, true, acjc.SKIP);
                    }
                } else if (acjdVarC instanceof aciw) {
                    if (acjdVarC2 instanceof aciw) {
                        acjbVarX.O(str2, true, acjc.SKIP);
                    } else if (acjdVarC2 instanceof aciv) {
                        r0.e();
                        r0.H(str2);
                    }
                }
            } else if (acjdVarC instanceof aciw) {
                if (acjdVarC2 instanceof aciw) {
                    acjbVarX.O(str2, true, acjc.SKIP);
                } else if (acjdVarC2 instanceof aciv) {
                    r0.e();
                    r0.H(str2);
                }
            }
        } else if (acjbVarX.ad(str).isEmpty()) {
            String str3 = String.format("[ChildPlaybackSkipperImpl] skipClip failed to remove segments for fromCpn: %s, toCpn: %s", Arrays.copyOf(new Object[]{str, str2}, 2));
            str3.getClass();
            zvl zvlVar6 = (zvl) xscVar.b.io();
            zvj zvjVarA6 = zvk.a();
            zvjVarA6.d(str3);
            zvjVarA6.c(ajtv.ERROR_LEVEL_WARNING);
            zvjVarA6.j = 21;
            zvlVar6.a(zvjVarA6.a());
        } else {
            acjbVarX.e(true, acjc.SKIP);
        }
        return new auzk(true, (aosi) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v7, types: [acey, java.lang.Object] */
    @Override // defpackage.abif
    public final auzk c(List list, wjj wjjVar, String str) throws Throwable {
        ?? r1;
        acjb acjbVarO;
        acjd acjdVarF;
        abnp abnpVarA;
        list.getClass();
        str.getClass();
        if (str.length() == 0) {
            aihf aihfVarCreateBuilder = aosi.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aosi aosiVar = (aosi) aihfVarCreateBuilder.instance;
            aosiVar.c = acfz.bu(102);
            aosiVar.b |= 1;
            aihfVarCreateBuilder.copyOnWrite();
            aosi aosiVar2 = (aosi) aihfVarCreateBuilder.instance;
            aosiVar2.b |= 2;
            aosiVar2.d = "contentCpn is empty";
            aihn aihnVarBuild = aihfVarCreateBuilder.build();
            aihnVarBuild.getClass();
            return aajc.i((aosi) aihnVarBuild);
        }
        if (!awrc.c(str, this.d)) {
            String str2 = "contentCpn mismatch: current=" + this.d + ", provided=" + str + ". Aborting scheduling.";
            a(this, str2, null, ajtv.ERROR_LEVEL_WARNING, 2);
            aihf aihfVarCreateBuilder2 = aosi.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            aosi aosiVar3 = (aosi) aihfVarCreateBuilder2.instance;
            aosiVar3.c = acfz.bu(302);
            aosiVar3.b |= 1;
            aihfVarCreateBuilder2.copyOnWrite();
            aosi aosiVar4 = (aosi) aihfVarCreateBuilder2.instance;
            aosiVar4.b |= 2;
            aosiVar4.d = str2;
            aihn aihnVarBuild2 = aihfVarCreateBuilder2.build();
            aihnVarBuild2.getClass();
            return aajc.i((aosi) aihnVarBuild2);
        }
        agjz agjzVar = new agjz(4);
        abic abicVar = (abic) atqq.Z(list);
        String str3 = abicVar != null ? abicVar.b : null;
        Object objIo = this.h.io();
        objIo.getClass();
        abvk abvkVar = (abvk) objIo;
        Object objIo2 = this.a.io();
        objIo2.getClass();
        xsc xscVar = (xsc) objIo2;
        agqs agqsVarListIterator = ((agke) list).listIterator(0);
        boolean z = false;
        while (agqsVarListIterator.hasNext()) {
            abic abicVar2 = (abic) agqsVarListIterator.next();
            String str4 = abicVar2.b;
            if (str4.length() == 0) {
                aihf aihfVarCreateBuilder3 = aosi.a.createBuilder();
                aihfVarCreateBuilder3.copyOnWrite();
                aosi aosiVar5 = (aosi) aihfVarCreateBuilder3.instance;
                aosiVar5.c = acfz.bu(104);
                aosiVar5.b |= 1;
                aihfVarCreateBuilder3.copyOnWrite();
                aosi aosiVar6 = (aosi) aihfVarCreateBuilder3.instance;
                aosiVar6.b |= 2;
                aosiVar6.d = "child CPN is empty";
                aihn aihnVarBuild3 = aihfVarCreateBuilder3.build();
                aihnVarBuild3.getClass();
                return aajc.i((aosi) aihnVarBuild3);
            }
            xscVar.c.put(str4, wjjVar);
            wjf wjfVar = abicVar2.a;
            if (wjfVar == null) {
                abnpVarA = null;
            } else {
                abno abnoVarA = abnp.a();
                abnoVarA.h(z);
                abnpVarA = abnoVarA.a();
            }
            agjzVar.h(new abni(str4, wjfVar, abnpVarA));
            z = wjfVar == null;
            acga acgaVar = this.g;
            if (acgaVar != null) {
                abih abihVar = new abih(this, str4, wjjVar, str);
                acgaVar.g(abihVar);
                if (awrc.c(str4, str3)) {
                    this.e.put(str3, abihVar);
                }
            } else {
                a(this, "contentCueRangeRegistrar is null, cannot add ad cue range for ".concat(str4), null, ajtv.ERROR_LEVEL_WARNING, 2);
            }
        }
        agke agkeVarG = agjzVar.g();
        agkeVarG.getClass();
        if (!agkeVarG.isEmpty()) {
            long jC = wjjVar.c();
            long jC2 = wjjVar.c();
            abhh abhhVar = abvkVar.t;
            if (!agkeVarG.isEmpty() && (r1 = ((abwk) abhhVar.b).d) != 0 && (acjbVarO = r1.o()) != null && r1.m() != null) {
                if (((abmt) abhhVar.a).au()) {
                    ArrayList arrayList = new ArrayList(atqq.N(agkeVarG, 10));
                    agqs agqsVarListIterator2 = agkeVarG.listIterator(0);
                    while (agqsVarListIterator2.hasNext()) {
                        abni abniVar = (abni) agqsVarListIterator2.next();
                        wjf wjfVar2 = abniVar.b;
                        if (wjfVar2 == null) {
                            acjdVarF = new aciv(acjbVarO, abniVar.a);
                        } else {
                            abniVar.getClass();
                            acjdVarF = abhhVar.f(acjbVarO, abniVar, wjfVar2);
                        }
                        arrayList.add(acjdVarF);
                    }
                    acjd[] acjdVarArr = (acjd[]) arrayList.toArray(new acjd[0]);
                    acjbVarO.ac(str, jC, jC2, (acjd[]) Arrays.copyOf(acjdVarArr, acjdVarArr.length));
                    acjbVarO.O(((abni) agkeVarG.get(0)).a, false, acjc.QUEUE_SEGMENTS);
                } else {
                    ArrayList arrayList2 = new ArrayList(atqq.N(agkeVarG, 10));
                    agqs agqsVarListIterator3 = agkeVarG.listIterator(0);
                    while (agqsVarListIterator3.hasNext()) {
                        abni abniVar2 = (abni) agqsVarListIterator3.next();
                        abniVar2.getClass();
                        wjf wjfVar3 = abniVar2.b;
                        if (wjfVar3 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        arrayList2.add(abhhVar.f(acjbVarO, abniVar2, wjfVar3));
                    }
                    aciw[] aciwVarArr = (aciw[]) arrayList2.toArray(new aciw[0]);
                    acjbVarO.ab(str, jC, jC2, (aciw[]) Arrays.copyOf(aciwVarArr, aciwVarArr.length));
                    acjbVarO.e(false, acjc.QUEUE_SEGMENTS);
                }
            }
        }
        return new auzk(true, (aosi) null);
    }
}
