package defpackage;

import app.rive.semantics.SemanticState;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahvh {
    public static final ahvg a;
    private static final ahaa b;
    private final ahwb c;

    static {
        aihf aihfVarCreateBuilder = ahaa.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ahaa ahaaVar = (ahaa) aihfVarCreateBuilder.instance;
        ahaaVar.b |= 1;
        ahaaVar.c = 0L;
        aihfVarCreateBuilder.copyOnWrite();
        ahaa ahaaVar2 = (ahaa) aihfVarCreateBuilder.instance;
        ahaaVar2.b |= 2;
        ahaaVar2.d = 0;
        aihfVarCreateBuilder.copyOnWrite();
        ahaa ahaaVar3 = (ahaa) aihfVarCreateBuilder.instance;
        ahaaVar3.b |= 4;
        ahaaVar3.e = 0;
        b = (ahaa) aihfVarCreateBuilder.build();
        a = ahvg.a().a();
    }

    public ahvh(String str, String str2) {
        aihf aihfVarCreateBuilder = ahwd.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ahwd ahwdVar = (ahwd) aihfVarCreateBuilder.instance;
        str.getClass();
        ahwdVar.b |= 1;
        ahwdVar.c = str;
        if (str2 != null) {
            aihfVarCreateBuilder.copyOnWrite();
            ahwd ahwdVar2 = (ahwd) aihfVarCreateBuilder.instance;
            ahwdVar2.b |= 2;
            ahwdVar2.d = str2;
        }
        aihf aihfVarCreateBuilder2 = ahwb.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        ahwb ahwbVar = (ahwb) aihfVarCreateBuilder2.instance;
        ahwd ahwdVar3 = (ahwd) aihfVarCreateBuilder.build();
        ahwdVar3.getClass();
        ahwbVar.c = ahwdVar3;
        ahwbVar.b |= 1;
        aihf aihfVarCreateBuilder3 = ahwg.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        ahwg ahwgVar = (ahwg) aihfVarCreateBuilder3.instance;
        ahwgVar.c = 3;
        ahwgVar.b |= 1;
        aihfVarCreateBuilder2.copyOnWrite();
        ahwb ahwbVar2 = (ahwb) aihfVarCreateBuilder2.instance;
        ahwg ahwgVar2 = (ahwg) aihfVarCreateBuilder3.build();
        ahwgVar2.getClass();
        ahwbVar2.d = ahwgVar2;
        ahwbVar2.b |= 2;
        this.c = (ahwb) aihfVarCreateBuilder2.build();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0101  */
    /* JADX WARN: Code duplicated, block: B:44:0x0143  */
    private final aihf b(ahab ahabVar, int i, ahvg ahvgVar, Object... objArr) {
        ahwf ahwfVar;
        aiie aiieVar;
        agev agfaVar;
        aihf aihfVarCreateBuilder = ahwf.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ahwf ahwfVar2 = (ahwf) aihfVarCreateBuilder.instance;
        ahwfVar2.c = i - 1;
        ahwfVar2.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        ahwf ahwfVar3 = (ahwf) aihfVarCreateBuilder.instance;
        ahwb ahwbVar = this.c;
        ahwbVar.getClass();
        ahwfVar3.f = ahwbVar;
        ahwfVar3.b |= 32;
        aihfVarCreateBuilder.copyOnWrite();
        ahwf ahwfVar4 = (ahwf) aihfVarCreateBuilder.instance;
        ahabVar.getClass();
        ahwfVar4.g = ahabVar;
        ahwfVar4.b |= 64;
        if (i == 2) {
            if (ahvgVar.b) {
                aihf aihfVarCreateBuilder2 = ahwe.a.createBuilder();
                for (int i2 = 0; i2 < objArr.length; i2++) {
                    Object obj = objArr[i2];
                    if (obj == null) {
                        agfaVar = new agfa("null");
                    } else if (obj instanceof qdt) {
                        String strB = ((qdt) obj).b();
                        strB.getClass();
                        agfaVar = new agfa(strB);
                    } else {
                        agfaVar = agdf.a;
                    }
                    if (agfaVar.g()) {
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahwe ahweVar = (ahwe) aihfVarCreateBuilder2.instance;
                        aihv aihvVar = ahweVar.b;
                        if (!aihvVar.c()) {
                            ahweVar.b = aihn.mutableCopy(aihvVar);
                        }
                        ahweVar.b.h(i2);
                        Object objC = agfaVar.c();
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahwe ahweVar2 = (ahwe) aihfVarCreateBuilder2.instance;
                        aiie aiieVar2 = ahweVar2.c;
                        if (!aiieVar2.c()) {
                            ahweVar2.c = aihn.mutableCopy(aiieVar2);
                        }
                        ahweVar2.c.add(objC);
                    }
                }
                if (((ahwe) aihfVarCreateBuilder2.instance).b.size() > 0) {
                    ahwe ahweVar3 = (ahwe) aihfVarCreateBuilder2.build();
                    aihfVarCreateBuilder.copyOnWrite();
                    ahwf ahwfVar5 = (ahwf) aihfVarCreateBuilder.instance;
                    ahweVar3.getClass();
                    ahwfVar5.j = ahweVar3;
                    ahwfVar5.b |= SemanticState.LiveRegion;
                }
            }
            for (int i3 = 0; i3 < objArr.length; i3++) {
                Object obj2 = objArr[i3];
                if (obj2 != null) {
                    if (!(obj2 instanceof ahve)) {
                        ahvi ahviVar = (ahvi) obj2.getClass().getAnnotation(ahvi.class);
                        if (ahviVar != null && ahviVar.a() != ahvd.e) {
                            aihf aihfVarCreateBuilder3 = ahwh.a.createBuilder();
                            aihfVarCreateBuilder3.copyOnWrite();
                            ahwh ahwhVar = (ahwh) aihfVarCreateBuilder3.instance;
                            ahwhVar.b |= 1;
                            ahwhVar.c = i3;
                            String string = obj2.toString();
                            aihfVarCreateBuilder3.copyOnWrite();
                            ahwh ahwhVar2 = (ahwh) aihfVarCreateBuilder3.instance;
                            string.getClass();
                            ahwhVar2.b |= 2;
                            ahwhVar2.d = string;
                            ahwh ahwhVar3 = (ahwh) aihfVarCreateBuilder3.build();
                            aihfVarCreateBuilder.copyOnWrite();
                            ahwfVar = (ahwf) aihfVarCreateBuilder.instance;
                            ahwhVar3.getClass();
                            aiieVar = ahwfVar.i;
                            if (!aiieVar.c()) {
                                ahwfVar.i = aihn.mutableCopy(aiieVar);
                            }
                            ahwfVar.i.add(ahwhVar3);
                        }
                    } else if (((ahve) obj2).a != ahvd.e) {
                        aihf aihfVarCreateBuilder4 = ahwh.a.createBuilder();
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahwh ahwhVar4 = (ahwh) aihfVarCreateBuilder4.instance;
                        ahwhVar4.b |= 1;
                        ahwhVar4.c = i3;
                        String string2 = obj2.toString();
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahwh ahwhVar5 = (ahwh) aihfVarCreateBuilder4.instance;
                        string2.getClass();
                        ahwhVar5.b |= 2;
                        ahwhVar5.d = string2;
                        ahwh ahwhVar6 = (ahwh) aihfVarCreateBuilder4.build();
                        aihfVarCreateBuilder.copyOnWrite();
                        ahwfVar = (ahwf) aihfVarCreateBuilder.instance;
                        ahwhVar6.getClass();
                        aiieVar = ahwfVar.i;
                        if (!aiieVar.c()) {
                            ahwfVar.i = aihn.mutableCopy(aiieVar);
                        }
                        ahwfVar.i.add(ahwhVar6);
                    }
                }
            }
        }
        return aihfVarCreateBuilder;
    }

    public final aihf a(agsu agsuVar, int i, ahvg ahvgVar) {
        String name;
        Throwable th;
        ahab ahabVar;
        if (agsuVar.m().d(qdn.a) != null) {
            aihf aihfVarCreateBuilder = ahab.a.createBuilder();
            ahaa ahaaVar = b;
            aihfVarCreateBuilder.copyOnWrite();
            ahab ahabVar2 = (ahab) aihfVarCreateBuilder.instance;
            ahaaVar.getClass();
            ahabVar2.c = ahaaVar;
            ahabVar2.b |= 1;
            int iIntValue = agsuVar.q().intValue();
            aihfVarCreateBuilder.copyOnWrite();
            ahab ahabVar3 = (ahab) aihfVarCreateBuilder.instance;
            ahabVar3.b |= 4;
            ahabVar3.e = iIntValue;
            String strB = agsuVar.f().b();
            aihfVarCreateBuilder.copyOnWrite();
            ahab ahabVar4 = (ahab) aihfVarCreateBuilder.instance;
            strB.getClass();
            ahabVar4.b |= 8;
            ahabVar4.f = strB;
            String strD = agsuVar.f().d();
            aihfVarCreateBuilder.copyOnWrite();
            ahab ahabVar5 = (ahab) aihfVarCreateBuilder.instance;
            strD.getClass();
            ahabVar5.b |= 16;
            ahabVar5.g = strD;
            int iA = agsuVar.f().a();
            aihfVarCreateBuilder.copyOnWrite();
            ahab ahabVar6 = (ahab) aihfVarCreateBuilder.instance;
            ahabVar6.b |= 32;
            ahabVar6.h = iA;
            String strE = agsuVar.f().e();
            if (strE != null) {
                aihfVarCreateBuilder.copyOnWrite();
                ahab ahabVar7 = (ahab) aihfVarCreateBuilder.instance;
                ahabVar7.b |= 64;
                ahabVar7.i = strE;
            }
            String str = (String) agsuVar.m().d(qdn.b);
            if (str != null) {
                aihfVarCreateBuilder.copyOnWrite();
                ahab ahabVar8 = (ahab) aihfVarCreateBuilder.instance;
                ahabVar8.b |= 2;
                ahabVar8.d = str;
            } else {
                aihfVarCreateBuilder.copyOnWrite();
                ahab ahabVar9 = (ahab) aihfVarCreateBuilder.instance;
                ahabVar9.b |= 2;
                ahabVar9.d = "Unknown native thread";
            }
            agtw agtwVarN = agsuVar.n();
            if (agtwVarN != null) {
                aihfVarCreateBuilder.copyOnWrite();
                ahab ahabVar10 = (ahab) aihfVarCreateBuilder.instance;
                ahabVar10.b |= SemanticState.Hidden;
                ahabVar10.j = agtwVarN.b;
            } else {
                String string = agsuVar.o().toString();
                aihfVarCreateBuilder.copyOnWrite();
                ahab ahabVar11 = (ahab) aihfVarCreateBuilder.instance;
                string.getClass();
                ahabVar11.b |= SemanticState.Hidden;
                ahabVar11.j = string;
            }
            ahabVar = (ahab) aihfVarCreateBuilder.build();
        } else {
            agtw agtwVarN2 = agsuVar.n();
            if (agtwVarN2 != null) {
                name = agtwVarN2.b;
            } else {
                Object objO = agsuVar.o();
                if (objO instanceof String) {
                    name = (String) objO;
                } else {
                    name = objO != null ? objO.getClass().getName() : "null";
                }
            }
            if (i == 2) {
                th = (Throwable) agsuVar.m().d(agrj.a);
            } else {
                th = null;
            }
            agro agroVarF = agsuVar.f();
            Level levelQ = agsuVar.q();
            String strB2 = agroVarF.b();
            String strD2 = agroVarF.d();
            int iA2 = agroVarF.a();
            aihf aihfVarCreateBuilder2 = ahab.a.createBuilder();
            ahaa ahaaVar2 = b;
            aihfVarCreateBuilder2.copyOnWrite();
            ahab ahabVar12 = (ahab) aihfVarCreateBuilder2.instance;
            ahaaVar2.getClass();
            ahabVar12.c = ahaaVar2;
            ahabVar12.b |= 1;
            String name2 = Thread.currentThread().getName();
            aihfVarCreateBuilder2.copyOnWrite();
            ahab ahabVar13 = (ahab) aihfVarCreateBuilder2.instance;
            name2.getClass();
            ahabVar13.b |= 2;
            ahabVar13.d = name2;
            int iIntValue2 = levelQ.intValue();
            aihfVarCreateBuilder2.copyOnWrite();
            ahab ahabVar14 = (ahab) aihfVarCreateBuilder2.instance;
            ahabVar14.b |= 4;
            ahabVar14.e = iIntValue2;
            aihfVarCreateBuilder2.copyOnWrite();
            ahab ahabVar15 = (ahab) aihfVarCreateBuilder2.instance;
            strB2.getClass();
            ahabVar15.b |= 8;
            ahabVar15.f = strB2;
            aihfVarCreateBuilder2.copyOnWrite();
            ahab ahabVar16 = (ahab) aihfVarCreateBuilder2.instance;
            strD2.getClass();
            ahabVar16.b |= 16;
            ahabVar16.g = strD2;
            aihfVarCreateBuilder2.copyOnWrite();
            ahab ahabVar17 = (ahab) aihfVarCreateBuilder2.instance;
            ahabVar17.b |= 32;
            ahabVar17.h = iA2;
            if (name != null) {
                aihfVarCreateBuilder2.copyOnWrite();
                ahab ahabVar18 = (ahab) aihfVarCreateBuilder2.instance;
                ahabVar18.b |= SemanticState.Hidden;
                ahabVar18.j = name;
            }
            if (th != null) {
                aihf aihfVarC = ahvgVar.c ? aext.c(th, false) : aext.b(th, false);
                aihfVarCreateBuilder2.copyOnWrite();
                ahab ahabVar19 = (ahab) aihfVarCreateBuilder2.instance;
                ahag ahagVar = (ahag) aihfVarC.build();
                ahagVar.getClass();
                ahabVar19.k = ahagVar;
                ahabVar19.b |= SemanticState.ReadOnly;
            }
            ahabVar = (ahab) aihfVarCreateBuilder2.build();
        }
        aihf aihfVarB = agsuVar.n() != null ? b(ahabVar, i, ahvgVar, agsuVar.K()) : b(ahabVar, i, ahvgVar, new Object[0]);
        if (i == 2 && ahvgVar.a) {
            axgh axghVar = (axgh) agsuVar.m().d(ahvj.b);
            if (axghVar != null) {
                aihfVarB.copyOnWrite();
                ahwf ahwfVar = (ahwf) aihfVarB.instance;
                ahwf ahwfVar2 = ahwf.a;
                ahwfVar.e = axghVar;
                ahwfVar.b |= 4;
            }
        }
        return aihfVarB;
    }
}
