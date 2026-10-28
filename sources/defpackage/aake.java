package defpackage;

import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aake implements aant {
    public static final /* synthetic */ int b = 0;
    private final awmd d;
    private final awmd e;
    private final awmd f;
    private final awmd g;
    private final wco h;
    private final mbc i;
    private final tbt j;
    private final aauk k;
    private static final agrf c = agrf.h("com/google/android/libraries/youtube/offline/features/entitycontroller/LegacyPlaybackDataEntityController");
    static final agke a = agke.s(1, 2, 3);

    public aake(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, mbc mbcVar, tbt tbtVar, wco wcoVar, aauk aaukVar) {
        this.d = awmdVar;
        this.e = awmdVar2;
        this.f = awmdVar3;
        this.g = awmdVar4;
        this.i = mbcVar;
        this.j = tbtVar;
        this.h = wcoVar;
        this.k = aaukVar;
    }

    private final agke e(zwa zwaVar, agke agkeVar, boolean z) {
        long j;
        aogq aogqVar;
        aaqn aaqnVar;
        aaew aaewVar;
        String str;
        aake aakeVar = this;
        aaqn aaqnVarB = ((aanb) aakeVar.f.io()).b();
        aaew aaewVarD = aaqnVarB.d();
        if (!zwaVar.k().equals(aaqnVarB.s())) {
            return g(((agpi) agkeVar).d, 35, false);
        }
        if (aaewVarD == null) {
            return g(((agpi) agkeVar).d, 15, false);
        }
        List list = (List) Collection.EL.stream(agkeVar).map(new aakc(0)).collect(Collectors.toList());
        mbc mbcVar = aakeVar.i;
        aaqn aaqnVar2 = aaqnVarB;
        long epochMilli = mbcVar.f().toEpochMilli();
        aluu aluuVarB = ((aapr) aakeVar.g.io()).b(aaqnVar2, agkz.n(list), epochMilli, z);
        int i = 4;
        if (aluuVarB == null) {
            return g(((agpi) agkeVar).d, 4, aakeVar.k.B());
        }
        aiie<aluy> aiieVar = aluuVarB.d;
        HashMap map = new HashMap();
        for (aluy aluyVar : aiieVar) {
            aogq aogqVar2 = aluyVar.c;
            if (aogqVar2 == null) {
                aogqVar2 = aogq.a;
            }
            for (aluz aluzVar : aluyVar.d) {
                String str2 = aluzVar.d;
                aams aamsVarB = aaqnVar2.k().b(str2);
                if (aamsVarB == null) {
                    map.put(str2, aanp.a);
                } else {
                    aano aanoVarA = aanp.a();
                    int i2 = i;
                    aanoVarA.c = 2;
                    aogp aogpVarA = aogp.a(aogqVar2.h);
                    if (aogpVarA == null) {
                        aogpVarA = aogp.UNKNOWN;
                    }
                    int iOrdinal = aogpVarA.ordinal();
                    List list2 = list;
                    int i3 = 1;
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            aaqt aaqtVarL = aaqnVar2.l();
                            aihf aihfVarCreateBuilder = aoen.a.createBuilder();
                            aihfVarCreateBuilder.copyOnWrite();
                            aoen aoenVar = (aoen) aihfVarCreateBuilder.instance;
                            str2.getClass();
                            aoenVar.b |= 1;
                            aoenVar.c = str2;
                            aofa aofaVar = aluyVar.e;
                            if (aofaVar == null) {
                                aofaVar = aofa.a;
                            }
                            int iBf = a.bf(aofaVar.c);
                            int i4 = iBf == 0 ? 1 : iBf;
                            aihfVarCreateBuilder.copyOnWrite();
                            aoen aoenVar2 = (aoen) aihfVarCreateBuilder.instance;
                            aoenVar2.e = i4 - 1;
                            aoenVar2.b |= 4;
                            aaqtVarL.t(str2, (aoen) aihfVarCreateBuilder.build());
                        } else if (iOrdinal != 3) {
                            agrc agrcVar = (agrc) ((agrc) c.b()).k("com/google/android/libraries/youtube/offline/features/entitycontroller/LegacyPlaybackDataEntityController", "processVideoSetUpdates", 626, "LegacyPlaybackDataEntityController.java");
                            aogp aogpVarA2 = aogp.a(aogqVar2.h);
                            if (aogpVarA2 == null) {
                                aogpVarA2 = aogp.UNKNOWN;
                            }
                            agrcVar.w("[Offline] Unrecognized OfflineState action: %s", aogpVarA2.name());
                            aaqt aaqtVarL2 = aaqnVar2.l();
                            aihf aihfVarCreateBuilder2 = aoen.a.createBuilder();
                            aihfVarCreateBuilder2.copyOnWrite();
                            aoen aoenVar3 = (aoen) aihfVarCreateBuilder2.instance;
                            str2.getClass();
                            aoenVar3.b |= 1;
                            aoenVar3.c = str2;
                            aaqtVarL2.t(str2, (aoen) aihfVarCreateBuilder2.build());
                        } else {
                            long j2 = epochMilli;
                            aogq aogqVar3 = aogqVar2;
                            aaqn aaqnVar3 = aaqnVar2;
                            aakeVar.d(aaqnVar3, j2, aogqVar3, aamsVarB);
                            aaqnVar2 = aaqnVar3;
                            aogqVar2 = aogqVar3;
                            epochMilli = j2;
                        }
                        aakeVar = this;
                        aogqVar = aogqVar2;
                        aaqnVar = aaqnVar2;
                        j = epochMilli;
                        aaewVar = aaewVarD;
                        str = str2;
                    } else {
                        long j3 = epochMilli;
                        aogq aogqVar4 = aogqVar2;
                        aaqn aaqnVar4 = aaqnVar2;
                        aakeVar.d(aaqnVar4, j3, aogqVar4, aamsVarB);
                        j = j3;
                        aogqVar = aogqVar4;
                        Iterator<E> it = new aihx(aluzVar.c, aluz.a).iterator();
                        boolean z2 = false;
                        boolean z3 = false;
                        while (it.hasNext()) {
                            int iOrdinal2 = ((aogc) it.next()).ordinal();
                            if (iOrdinal2 != i3) {
                                int i5 = i2;
                                i2 = i5;
                                if (iOrdinal2 == i5) {
                                    z2 = true;
                                    z3 = true;
                                }
                            } else {
                                i2 = 4;
                                z2 = true;
                            }
                            i3 = 1;
                        }
                        aofb aofbVarF = aakeVar.k.n() ? aakeVar.f(zwaVar, str2) : aofb.OFFLINE_TYPE_UNKNOWN;
                        aofh aofhVar = null;
                        if (z2) {
                            try {
                                String strG = aaewVarD.g(str2);
                                awmd awmdVar = aakeVar.d;
                                aaqnVar = aaqnVar4;
                                try {
                                    ((abqq) awmdVar.io()).f(str2);
                                    aaun aaunVarA = aauo.a(str2, aofbVarF);
                                    aaunVarA.c = aaewVarD.au(str2);
                                    aaunVarA.e = strG;
                                    alva alvaVar = aluzVar.e;
                                    if (alvaVar == null) {
                                        alvaVar = alva.a;
                                    }
                                    if ((alvaVar.b & 1) != 0) {
                                        alva alvaVar2 = aluzVar.e;
                                        if (alvaVar2 == null) {
                                            alvaVar2 = alva.a;
                                        }
                                        aaunVarA.f = Boolean.valueOf(alvaVar2.c);
                                    }
                                    aaewVar = aaewVarD;
                                    str = str2;
                                    try {
                                        aaewVar.B(str, ((abqq) awmdVar.io()).e(aaunVarA.a()), mbcVar.f().toEpochMilli(), true, (wjb) aakeVar.e.io());
                                    } catch (wno unused) {
                                    }
                                } catch (wno unused2) {
                                    aaewVar = aaewVarD;
                                    str = str2;
                                }
                            } catch (wno unused3) {
                                aaqnVar = aaqnVar4;
                            }
                        } else {
                            aaqnVar = aaqnVar4;
                            aaewVar = aaewVarD;
                            str = str2;
                        }
                        if (z3) {
                            aihf aihfVarCreateBuilder3 = aofh.a.createBuilder();
                            String strG2 = wfs.g(120, str);
                            aihfVarCreateBuilder3.copyOnWrite();
                            aofh aofhVar2 = (aofh) aihfVarCreateBuilder3.instance;
                            strG2.getClass();
                            aofhVar2.b |= 2;
                            aofhVar2.d = strG2;
                            aihfVarCreateBuilder3.copyOnWrite();
                            aofh aofhVar3 = (aofh) aihfVarCreateBuilder3.instance;
                            aofhVar3.c = 3;
                            aofhVar3.b |= 1;
                            aihh aihhVar = (aihh) aofg.b.createBuilder();
                            aihhVar.copyOnWrite();
                            aofg aofgVar = (aofg) aihhVar.instance;
                            aofgVar.c |= 1;
                            aofgVar.d = 80;
                            aihhVar.n(a);
                            aihhVar.e(aqpb.b, aqpb.a);
                            aofg aofgVar2 = (aofg) aihhVar.build();
                            aihfVarCreateBuilder3.copyOnWrite();
                            aofh aofhVar4 = (aofh) aihfVarCreateBuilder3.instance;
                            aofgVar2.getClass();
                            aofhVar4.e = aofgVar2;
                            aofhVar4.b |= 4;
                            aofhVar = (aofh) aihfVarCreateBuilder3.build();
                        }
                        if (aofhVar != null) {
                            aanoVarA.b(agke.q(aofhVar));
                        }
                    }
                    map.put(str, aanoVarA.a());
                    aaewVarD = aaewVar;
                    aogqVar2 = aogqVar;
                    list = list2;
                    epochMilli = j;
                    aaqnVar2 = aaqnVar;
                    i = 4;
                }
            }
        }
        agjz agjzVar = new agjz(4);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            aanp aanpVar = (aanp) map.get((String) it2.next());
            if (aanpVar != null) {
                agjzVar.h(aanpVar);
            } else {
                agjzVar.h(aanp.a);
            }
        }
        return agjzVar.g();
    }

    private final aofb f(zwa zwaVar, String str) {
        ardd arddVar = (ardd) this.h.b(zwaVar).g(wfs.g(461, str)).g(ardd.class).E();
        return arddVar == null ? aofb.OFFLINE_TYPE_UNKNOWN : arddVar.getOfflineModeType();
    }

    private static final agke g(int i, int i2, boolean z) {
        agjz agjzVar = new agjz(4);
        for (int i3 = 0; i3 < i; i3++) {
            aano aanoVar = new aano(z ? aanp.b : aanp.c);
            aanoVar.d = i2;
            agjzVar.h(aanoVar.a());
        }
        return agjzVar.g();
    }

    @Override // defpackage.aant
    public final aans a(aofh aofhVar) {
        int iBc = a.bc(aofhVar.c);
        return (iBc == 0 || iBc != 4) ? aans.c : new aakd(aofhVar);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:103:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:106:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:109:0x0308  */
    /* JADX WARN: Code duplicated, block: B:112:0x0323  */
    /* JADX WARN: Code duplicated, block: B:115:0x0350  */
    /* JADX WARN: Code duplicated, block: B:124:0x0438  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:71:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:75:0x020d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0212  */
    /* JADX WARN: Code duplicated, block: B:84:0x025c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0262  */
    /* JADX WARN: Code duplicated, block: B:89:0x0265  */
    /* JADX WARN: Code duplicated, block: B:91:0x0270  */
    /* JADX WARN: Code duplicated, block: B:93:0x027e  */
    /* JADX WARN: Code duplicated, block: B:94:0x028e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0290  */
    /* JADX WARN: Code duplicated, block: B:96:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:98:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:99:0x02bd  */
    @Override // defpackage.aant
    public final ListenableFuture b(zwa zwaVar, aofh aofhVar) {
        aihl aihlVarCheckIsLite;
        Object objK;
        Object objC;
        aofb aofbVarF;
        aanp aanpVarA;
        wjf wjfVarJ;
        boolean zB;
        aogq aogqVarV;
        aihl aihlVarCheckIsLite2;
        Object objK2;
        Object objC2;
        aoom aoomVar;
        int i;
        int iAU;
        aofb aofbVarA;
        aohx aohxVarA;
        int iAS;
        aofh aofhVar2;
        wja wjaVarG;
        agke agkeVarQ;
        aamt aamtVarF;
        aogp aogpVarA;
        wjf wjfVarC;
        aogq aogqVarV2;
        agke agkeVarQ2;
        aanp aanpVarA2;
        String strH = wfs.h(aofhVar.d);
        int iBc = a.bc(aofhVar.c);
        if (iBc == 0) {
            iBc = 1;
        }
        int i2 = iBc - 1;
        boolean z = false;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    agrc agrcVar = (agrc) ((agrc) c.b()).k("com/google/android/libraries/youtube/offline/features/entitycontroller/LegacyPlaybackDataEntityController", "handleAction", 176, "LegacyPlaybackDataEntityController.java");
                    int iBc2 = a.bc(aofhVar.c);
                    agrcVar.x("Could not handle action: %d for type %d", (iBc2 != 0 ? iBc2 : 1) - 1, 119);
                    aano aanoVar = new aano(aanp.c);
                    aanoVar.d = 23;
                    return ahng.n(aanoVar.a());
                }
                agke agkeVarQ3 = agke.q(aofhVar);
                aofg aofgVar = aofhVar.e;
                if (aofgVar == null) {
                    aofgVar = aofg.b;
                }
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aoom.b);
                aofgVar.c(aihlVarCheckIsLite3);
                Object objK3 = aofgVar.j.k(aihlVarCheckIsLite3.d);
                return ahng.n((aanp) e(zwaVar, agkeVarQ3, ((aoom) (objK3 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK3))).n).get(0));
            }
            aofg aofgVar2 = aofhVar.e;
            if (aofgVar2 == null) {
                aofgVar2 = aofg.b;
            }
            aaqn aaqnVarB = ((aanb) this.f.io()).b();
            if (!zwaVar.k().equals(aaqnVarB.s())) {
                aano aanoVar2 = new aano(aanp.b);
                aanoVar2.d = 35;
                aanpVarA2 = aanoVar2.a();
            } else if (aaqnVarB.d() == null) {
                aano aanoVar3 = new aano(aanp.b);
                aanoVar3.d = 15;
                aanpVarA2 = aanoVar3.a();
            } else {
                aano aanoVarA = aanp.a();
                aanoVarA.c = 2;
                wcn wcnVarB = this.h.b(zwaVar);
                String strG = wfs.g(146, strH);
                if (((weh) wcnVarB.g(strG).E()) != null) {
                    aihh aihhVar = (aihh) aofgVar2.toBuilder();
                    aihx aihxVar = new aihx(((aofg) aihhVar.instance).e, aofg.a);
                    aoff aoffVar = aoff.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK;
                    if (!aihxVar.contains(aoffVar)) {
                        aihhVar.o(aoffVar);
                    }
                    aihf aihfVarCreateBuilder = aofh.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    aofh aofhVar3 = (aofh) aihfVarCreateBuilder.instance;
                    aofhVar3.c = 2;
                    aofhVar3.b |= 1;
                    aihfVarCreateBuilder.copyOnWrite();
                    aofh aofhVar4 = (aofh) aihfVarCreateBuilder.instance;
                    strG.getClass();
                    aofhVar4.b |= 2;
                    aofhVar4.d = strG;
                    aihfVarCreateBuilder.copyOnWrite();
                    aofh aofhVar5 = (aofh) aihfVarCreateBuilder.instance;
                    aofg aofgVar3 = (aofg) aihhVar.build();
                    aofgVar3.getClass();
                    aofhVar5.e = aofgVar3;
                    aofhVar5.b |= 4;
                    agkeVarQ2 = agke.q((aofh) aihfVarCreateBuilder.build());
                } else {
                    agkeVarQ2 = agpi.a;
                }
                aanoVarA.b(agkeVarQ2);
                aanpVarA2 = aanoVarA.a();
            }
            return ahng.n(aanpVarA2);
        }
        aofg aofgVar4 = aofhVar.e;
        if (aofgVar4 == null) {
            aofgVar4 = aofg.b;
        }
        aaqn aaqnVarB2 = ((aanb) this.f.io()).b();
        if (true != zwaVar.k().equals(aaqnVarB2.s())) {
            aaqnVarB2 = null;
        }
        if (aaqnVarB2 == null) {
            aano aanoVar4 = new aano(aanp.b);
            aanoVar4.d = 35;
            aanpVarA = aanoVar4.a();
        } else {
            aaew aaewVarD = aaqnVarB2.d();
            if (aaewVarD == null) {
                aano aanoVar5 = new aano(aanp.b);
                aanoVar5.d = 15;
                aanpVarA = aanoVar5.a();
            } else {
                aamt aamtVarF2 = aaewVarD.f(strH);
                if (aamtVarF2 == null) {
                    aano aanoVar6 = new aano(aanp.c);
                    aanoVar6.d = 26;
                    aanpVarA = aanoVar6.a();
                } else if (!aamtVarF2.h() || (wjfVarC = aaewVarD.c(strH)) == null || (aogqVarV2 = wjfVarC.v()) == null) {
                    aihlVarCheckIsLite = aihn.checkIsLite(aoom.b);
                    aofgVar4.c(aihlVarCheckIsLite);
                    objK = aofgVar4.j.k(aihlVarCheckIsLite.d);
                    if (objK == null) {
                        objC = aihlVarCheckIsLite.b;
                    } else {
                        objC = aihlVarCheckIsLite.c(objK);
                    }
                    aoom aoomVar2 = (aoom) objC;
                    if (this.k.n()) {
                        aofbVarF = f(zwaVar, strH);
                    } else {
                        aofbVarF = aofb.OFFLINE_TYPE_UNKNOWN;
                    }
                    try {
                        wjfVarJ = ((abqq) this.d.io()).j(strH, aofbVarF, aoomVar2.d.G(), aoomVar2.m, null);
                        zB = aaewVarD.B(strH, wjfVarJ, this.i.f().toEpochMilli(), true, (wjb) this.e.io());
                        aogqVarV = wjfVarJ.v();
                        if (aaje.q(wjfVarJ.t()) && aogqVarV != null) {
                            aogpVarA = aogp.a(aogqVarV.h);
                            if (aogpVarA == null) {
                                aogpVarA = aogp.UNKNOWN;
                            }
                            if (aogpVarA == aogp.OK) {
                                z = true;
                            }
                        }
                        if (!z) {
                            aaewVarD.S(strH, aamg.CANNOT_OFFLINE);
                            aamtVarF = aaewVarD.f(strH);
                            if (aamtVarF != null) {
                                this.j.e(new aaif(aamtVarF, aogv.NOT_PLAYABLE));
                            }
                        }
                        if (!zB) {
                            aano aanoVar7 = new aano(aanp.c);
                            aanoVar7.d = 6;
                            aanpVarA = aanoVar7.a();
                        } else if (z) {
                            aano aanoVarA2 = aanp.a();
                            aanoVarA2.c = 2;
                            aihlVarCheckIsLite2 = aihn.checkIsLite(aoom.b);
                            aofgVar4.c(aihlVarCheckIsLite2);
                            objK2 = aofgVar4.j.k(aihlVarCheckIsLite2.d);
                            if (objK2 == null) {
                                objC2 = aihlVarCheckIsLite2.b;
                            } else {
                                objC2 = aihlVarCheckIsLite2.c(objK2);
                            }
                            aoomVar = (aoom) objC2;
                            if ((aoomVar.c & 64) != 0) {
                                i = aoomVar.i;
                            } else {
                                i = -1;
                            }
                            aihf aihfVarCreateBuilder2 = aqpb.a.createBuilder();
                            String str = aoomVar.h;
                            aihfVarCreateBuilder2.copyOnWrite();
                            aqpb aqpbVar = (aqpb) aihfVarCreateBuilder2.instance;
                            str.getClass();
                            aqpbVar.c |= 8;
                            aqpbVar.g = str;
                            iAU = a.aU(aoomVar.j);
                            if (iAU == 0) {
                                iAU = 1;
                            }
                            aihfVarCreateBuilder2.copyOnWrite();
                            aqpb aqpbVar2 = (aqpb) aihfVarCreateBuilder2.instance;
                            aqpbVar2.h = iAU - 1;
                            aqpbVar2.c |= 32;
                            aofbVarA = aofb.a(aoomVar.k);
                            if (aofbVarA == null) {
                                aofbVarA = aofb.OFFLINE_TYPE_UNKNOWN;
                            }
                            aihfVarCreateBuilder2.copyOnWrite();
                            aqpb aqpbVar3 = (aqpb) aihfVarCreateBuilder2.instance;
                            aqpbVar3.i = aofbVarA.i;
                            aqpbVar3.c |= SemanticState.Focused;
                            aohxVarA = aohx.a(aoomVar.e);
                            if (aohxVarA == null) {
                                aohxVarA = aohx.UNKNOWN_FORMAT_TYPE;
                            }
                            aihfVarCreateBuilder2.copyOnWrite();
                            aqpb aqpbVar4 = (aqpb) aihfVarCreateBuilder2.instance;
                            aqpbVar4.d = aohxVarA.l;
                            aqpbVar4.c |= 1;
                            String str2 = aoomVar.f;
                            aihfVarCreateBuilder2.copyOnWrite();
                            aqpb aqpbVar5 = (aqpb) aihfVarCreateBuilder2.instance;
                            str2.getClass();
                            aqpbVar5.c |= 2;
                            aqpbVar5.e = str2;
                            iAS = a.aS(aoomVar.l);
                            if (iAS == 0) {
                                iAS = 1;
                            }
                            aihfVarCreateBuilder2.copyOnWrite();
                            aqpb aqpbVar6 = (aqpb) aihfVarCreateBuilder2.instance;
                            aqpbVar6.j = iAS - 1;
                            aqpbVar6.c |= SemanticState.Hidden;
                            aihh aihhVar2 = (aihh) aofgVar4.toBuilder();
                            aihhVar2.copyOnWrite();
                            aofg aofgVar5 = (aofg) aihhVar2.instance;
                            aofgVar5.c |= 1;
                            aofgVar5.d = i;
                            aihhVar2.e(aqpb.b, (aqpb) aihfVarCreateBuilder2.build());
                            aofg aofgVar6 = (aofg) aihhVar2.build();
                            aofh aofhVar6 = aofh.a;
                            aihf aihfVarCreateBuilder3 = aofhVar6.createBuilder();
                            aihfVarCreateBuilder3.copyOnWrite();
                            aofh aofhVar7 = (aofh) aihfVarCreateBuilder3.instance;
                            aofhVar7.c = 1;
                            aofhVar7.b |= 1;
                            String strG2 = wfs.g(120, strH);
                            aihfVarCreateBuilder3.copyOnWrite();
                            aofh aofhVar8 = (aofh) aihfVarCreateBuilder3.instance;
                            strG2.getClass();
                            aofhVar8.b |= 2;
                            aofhVar8.d = strG2;
                            aihfVarCreateBuilder3.copyOnWrite();
                            aofh aofhVar9 = (aofh) aihfVarCreateBuilder3.instance;
                            aofgVar6.getClass();
                            aofhVar9.e = aofgVar6;
                            aofhVar9.b |= 4;
                            aofhVar2 = (aofh) aihfVarCreateBuilder3.build();
                            wjaVarG = wjfVarJ.g();
                            if (wjaVarG != null || wjaVarG.p().isEmpty()) {
                                agkeVarQ = agke.q(aofhVar2);
                            } else {
                                aihf aihfVarCreateBuilder4 = aofhVar6.createBuilder();
                                aihfVarCreateBuilder4.copyOnWrite();
                                aofh aofhVar10 = (aofh) aihfVarCreateBuilder4.instance;
                                aofhVar10.c = 1;
                                aofhVar10.b |= 1;
                                String strG3 = wfs.g(146, strH);
                                aihfVarCreateBuilder4.copyOnWrite();
                                aofh aofhVar11 = (aofh) aihfVarCreateBuilder4.instance;
                                strG3.getClass();
                                aofhVar11.b |= 2;
                                aofhVar11.d = strG3;
                                aihfVarCreateBuilder4.copyOnWrite();
                                aofh aofhVar12 = (aofh) aihfVarCreateBuilder4.instance;
                                aofgVar6.getClass();
                                aofhVar12.e = aofgVar6;
                                aofhVar12.b |= 4;
                                aihfVarCreateBuilder4.copyOnWrite();
                                aofh aofhVar13 = (aofh) aihfVarCreateBuilder4.instance;
                                aofhVar2.getClass();
                                aiie aiieVar = aofhVar13.f;
                                if (!aiieVar.c()) {
                                    aofhVar13.f = aihn.mutableCopy(aiieVar);
                                }
                                aofhVar13.f.add(aofhVar2);
                                agkeVarQ = agke.q((aofh) aihfVarCreateBuilder4.build());
                            }
                            aanoVarA2.b(agkeVarQ);
                            aanpVarA = aanoVarA2.a();
                        } else {
                            aano aanoVar8 = new aano(aanp.c);
                            aanoVar8.d = 12;
                            aanpVarA = aanoVar8.a();
                        }
                    } catch (wno unused) {
                        aaewVarD.S(strH, aamg.NETWORK_READ_ERROR);
                        aano aanoVar9 = new aano(this.k.B() ? aanp.b : aanp.c);
                        aanoVar9.d = 4;
                        aanpVarA = aanoVar9.a();
                    }
                } else {
                    aogp aogpVarA2 = aogp.a(aogqVarV2.h);
                    if (aogpVarA2 == null) {
                        aogpVarA2 = aogp.UNKNOWN;
                    }
                    if (aogpVarA2 == aogp.OK) {
                        aanpVarA = aanp.a;
                    } else {
                        aihlVarCheckIsLite = aihn.checkIsLite(aoom.b);
                        aofgVar4.c(aihlVarCheckIsLite);
                        objK = aofgVar4.j.k(aihlVarCheckIsLite.d);
                        if (objK == null) {
                            objC = aihlVarCheckIsLite.b;
                        } else {
                            objC = aihlVarCheckIsLite.c(objK);
                        }
                        aoom aoomVar3 = (aoom) objC;
                        if (this.k.n()) {
                            aofbVarF = f(zwaVar, strH);
                        } else {
                            aofbVarF = aofb.OFFLINE_TYPE_UNKNOWN;
                        }
                        wjfVarJ = ((abqq) this.d.io()).j(strH, aofbVarF, aoomVar3.d.G(), aoomVar3.m, null);
                        zB = aaewVarD.B(strH, wjfVarJ, this.i.f().toEpochMilli(), true, (wjb) this.e.io());
                        aogqVarV = wjfVarJ.v();
                        if (aaje.q(wjfVarJ.t())) {
                            aogpVarA = aogp.a(aogqVarV.h);
                            if (aogpVarA == null) {
                                aogpVarA = aogp.UNKNOWN;
                            }
                            if (aogpVarA == aogp.OK) {
                                z = true;
                            }
                        }
                        if (!z) {
                            aaewVarD.S(strH, aamg.CANNOT_OFFLINE);
                            aamtVarF = aaewVarD.f(strH);
                            if (aamtVarF != null) {
                                this.j.e(new aaif(aamtVarF, aogv.NOT_PLAYABLE));
                            }
                        }
                        if (!zB) {
                            aano aanoVar10 = new aano(aanp.c);
                            aanoVar10.d = 6;
                            aanpVarA = aanoVar10.a();
                        } else if (z) {
                            aano aanoVar11 = new aano(aanp.c);
                            aanoVar11.d = 12;
                            aanpVarA = aanoVar11.a();
                        } else {
                            aano aanoVarA3 = aanp.a();
                            aanoVarA3.c = 2;
                            aihlVarCheckIsLite2 = aihn.checkIsLite(aoom.b);
                            aofgVar4.c(aihlVarCheckIsLite2);
                            objK2 = aofgVar4.j.k(aihlVarCheckIsLite2.d);
                            if (objK2 == null) {
                                objC2 = aihlVarCheckIsLite2.b;
                            } else {
                                objC2 = aihlVarCheckIsLite2.c(objK2);
                            }
                            aoomVar = (aoom) objC2;
                            if ((aoomVar.c & 64) != 0) {
                                i = aoomVar.i;
                            } else {
                                i = -1;
                            }
                            aihf aihfVarCreateBuilder5 = aqpb.a.createBuilder();
                            String str3 = aoomVar.h;
                            aihfVarCreateBuilder5.copyOnWrite();
                            aqpb aqpbVar7 = (aqpb) aihfVarCreateBuilder5.instance;
                            str3.getClass();
                            aqpbVar7.c |= 8;
                            aqpbVar7.g = str3;
                            iAU = a.aU(aoomVar.j);
                            if (iAU == 0) {
                                iAU = 1;
                            }
                            aihfVarCreateBuilder5.copyOnWrite();
                            aqpb aqpbVar8 = (aqpb) aihfVarCreateBuilder5.instance;
                            aqpbVar8.h = iAU - 1;
                            aqpbVar8.c |= 32;
                            aofbVarA = aofb.a(aoomVar.k);
                            if (aofbVarA == null) {
                                aofbVarA = aofb.OFFLINE_TYPE_UNKNOWN;
                            }
                            aihfVarCreateBuilder5.copyOnWrite();
                            aqpb aqpbVar9 = (aqpb) aihfVarCreateBuilder5.instance;
                            aqpbVar9.i = aofbVarA.i;
                            aqpbVar9.c |= SemanticState.Focused;
                            aohxVarA = aohx.a(aoomVar.e);
                            if (aohxVarA == null) {
                                aohxVarA = aohx.UNKNOWN_FORMAT_TYPE;
                            }
                            aihfVarCreateBuilder5.copyOnWrite();
                            aqpb aqpbVar10 = (aqpb) aihfVarCreateBuilder5.instance;
                            aqpbVar10.d = aohxVarA.l;
                            aqpbVar10.c |= 1;
                            String str4 = aoomVar.f;
                            aihfVarCreateBuilder5.copyOnWrite();
                            aqpb aqpbVar11 = (aqpb) aihfVarCreateBuilder5.instance;
                            str4.getClass();
                            aqpbVar11.c |= 2;
                            aqpbVar11.e = str4;
                            iAS = a.aS(aoomVar.l);
                            if (iAS == 0) {
                                iAS = 1;
                            }
                            aihfVarCreateBuilder5.copyOnWrite();
                            aqpb aqpbVar12 = (aqpb) aihfVarCreateBuilder5.instance;
                            aqpbVar12.j = iAS - 1;
                            aqpbVar12.c |= SemanticState.Hidden;
                            aihh aihhVar3 = (aihh) aofgVar4.toBuilder();
                            aihhVar3.copyOnWrite();
                            aofg aofgVar7 = (aofg) aihhVar3.instance;
                            aofgVar7.c |= 1;
                            aofgVar7.d = i;
                            aihhVar3.e(aqpb.b, (aqpb) aihfVarCreateBuilder5.build());
                            aofg aofgVar8 = (aofg) aihhVar3.build();
                            aofh aofhVar14 = aofh.a;
                            aihf aihfVarCreateBuilder6 = aofhVar14.createBuilder();
                            aihfVarCreateBuilder6.copyOnWrite();
                            aofh aofhVar15 = (aofh) aihfVarCreateBuilder6.instance;
                            aofhVar15.c = 1;
                            aofhVar15.b |= 1;
                            String strG4 = wfs.g(120, strH);
                            aihfVarCreateBuilder6.copyOnWrite();
                            aofh aofhVar16 = (aofh) aihfVarCreateBuilder6.instance;
                            strG4.getClass();
                            aofhVar16.b |= 2;
                            aofhVar16.d = strG4;
                            aihfVarCreateBuilder6.copyOnWrite();
                            aofh aofhVar17 = (aofh) aihfVarCreateBuilder6.instance;
                            aofgVar8.getClass();
                            aofhVar17.e = aofgVar8;
                            aofhVar17.b |= 4;
                            aofhVar2 = (aofh) aihfVarCreateBuilder6.build();
                            wjaVarG = wjfVarJ.g();
                            if (wjaVarG != null) {
                                agkeVarQ = agke.q(aofhVar2);
                            } else {
                                agkeVarQ = agke.q(aofhVar2);
                            }
                            aanoVarA3.b(agkeVarQ);
                            aanpVarA = aanoVarA3.a();
                        }
                    }
                }
            }
        }
        return ahng.n(aanpVarA);
    }

    @Override // defpackage.aant
    public final ListenableFuture c(zwa zwaVar, agke agkeVar) {
        if (agkeVar.isEmpty()) {
            return ahng.n(agpi.a);
        }
        int iBc = a.bc(((aofh) agkeVar.get(0)).c);
        if (iBc == 0 || iBc != 4) {
            return ahng.n(a.Q(((agpi) agkeVar).d, 23));
        }
        aofg aofgVar = ((aofh) agkeVar.get(0)).e;
        if (aofgVar == null) {
            aofgVar = aofg.b;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aoom.b);
        aofgVar.c(aihlVarCheckIsLite);
        Object objK = aofgVar.j.k(aihlVarCheckIsLite.d);
        return ahng.n(e(zwaVar, agkeVar, ((aoom) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).n));
    }

    final void d(aaqn aaqnVar, long j, aogq aogqVar, aams aamsVar) {
        aaqr aaqrVarK = aaqnVar.k();
        aamr aamrVarB = aamsVar.b();
        aamrVarB.b = aogqVar;
        aamrVarB.d = j;
        if (aaqrVarK.j(aamrVarB.a())) {
            this.j.c(new aaie(aamsVar.b));
        } else {
            ((agrc) ((agrc) c.b()).k("com/google/android/libraries/youtube/offline/features/entitycontroller/LegacyPlaybackDataEntityController", "updateVideoPolicy", 663, "LegacyPlaybackDataEntityController.java")).w("[Offline] UpdateVideoPolicy failed for video %s", aamsVar.b);
        }
    }
}
