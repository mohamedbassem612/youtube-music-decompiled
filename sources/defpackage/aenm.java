package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aenm {
    public static final ajij a = ajij.AUTOMATED_LOG_EVENT_SOURCE_PAGE_SYSTEM;
    private final tqj b;

    public aenm(tqj tqjVar) {
        this.b = tqjVar;
    }

    public static final void b(aenr aenrVar, xie xieVar) {
        ajij ajijVar;
        Long lValueOf = xieVar != null ? Long.valueOf(xieVar.a) : null;
        if (lValueOf != null) {
            xih xihVarB = aenrVar.b();
            long jLongValue = lValueOf.longValue();
            ajijVar = a;
            xihVarB.c(jLongValue, ajijVar);
        } else {
            xih xihVarB2 = aenrVar.b();
            ajij ajijVar2 = a;
            xihVarB2.b(ajijVar2);
            ajijVar = ajijVar2;
        }
        int iK = atqp.K(aenrVar.c.a);
        if (iK == 0) {
            iK = 188;
        }
        aihf aihfVarCreateBuilder = amiu.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        agvp.ae(iK, aihfVarCreateBuilder);
        aenrVar.b().a(agvp.ab(aihfVarCreateBuilder), ajijVar);
    }

    public final void a(aenr aenrVar, boolean z) {
        ajij ajijVar;
        argn argnVarC;
        if (z) {
            tqj tqjVar = this.b;
            int i = tqr.a;
            if (tqjVar.k(1073829997)) {
                aeno aenoVar = aenrVar.c;
                Integer num = aenoVar.h;
                int iIntValue = num != null ? num.intValue() : 0;
                Integer num2 = aenoVar.i;
                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                aigj aigjVar = aenoVar.b;
                if (xgt.g(iIntValue)) {
                    argnVarC = xgt.c(iIntValue, iIntValue2);
                } else {
                    aihf aihfVarCreateBuilder = argn.a.createBuilder();
                    if (aigjVar != null && !aigjVar.E()) {
                        aihfVarCreateBuilder.copyOnWrite();
                        argn argnVar = (argn) aihfVarCreateBuilder.instance;
                        argnVar.b |= 1;
                        argnVar.c = aigjVar;
                    }
                    argnVarC = (argn) aihfVarCreateBuilder.build();
                }
                argn argnVar2 = argnVarC;
                xfq xfqVarA = aenrVar.a();
                xhc xhcVarA = xhb.a(aenoVar.g);
                xgu xguVar = xgu.a;
                argnVar2.getClass();
                String str = aenoVar.e;
                String str2 = aenoVar.f;
                amdd amddVar = aenoVar.k;
                amdd amddVar2 = aenoVar.l;
                ajijVar = a;
                xfqVarA.Q(xhcVarA, xguVar, argnVar2, str, str2, amddVar, amddVar2, ajijVar);
            } else {
                aeno aenoVar2 = aenrVar.c;
                aenoVar2.getClass();
                aihf builder = aenoVar2.j.toBuilder();
                String str3 = aenoVar2.c;
                if (str3 != null) {
                    builder.copyOnWrite();
                    aoar aoarVar = (aoar) builder.instance;
                    aoarVar.b |= SemanticState.ReadOnly;
                    aoarVar.k = str3;
                } else {
                    builder.copyOnWrite();
                    aoar aoarVar2 = (aoar) builder.instance;
                    aoarVar2.b &= -1025;
                    aoarVar2.k = aoar.a.k;
                }
                String str4 = aenoVar2.d;
                if (str4 != null) {
                    builder.copyOnWrite();
                    aoar aoarVar3 = (aoar) builder.instance;
                    aoarVar3.b |= 64;
                    aoarVar3.g = str4;
                } else {
                    builder.copyOnWrite();
                    aoar aoarVar4 = (aoar) builder.instance;
                    aoarVar4.b &= -65;
                    aoarVar4.g = aoar.a.g;
                }
                String str5 = aenoVar2.e;
                if (str5 != null) {
                    builder.copyOnWrite();
                    aoar aoarVar5 = (aoar) builder.instance;
                    aoarVar5.b |= 1;
                    aoarVar5.c = str5;
                } else {
                    builder.copyOnWrite();
                    aoar aoarVar6 = (aoar) builder.instance;
                    aoarVar6.b &= -2;
                    aoarVar6.c = aoar.a.c;
                }
                String str6 = aenoVar2.f;
                if (str6 != null) {
                    builder.copyOnWrite();
                    aoar aoarVar7 = (aoar) builder.instance;
                    aoarVar7.b |= 32;
                    aoarVar7.f = str6;
                } else {
                    builder.copyOnWrite();
                    aoar aoarVar8 = (aoar) builder.instance;
                    aoarVar8.b &= -33;
                    aoarVar8.f = aoar.a.f;
                }
                int i2 = aenoVar2.g;
                builder.copyOnWrite();
                aoar aoarVar9 = (aoar) builder.instance;
                aoarVar9.b |= SemanticState.Focused;
                aoarVar9.h = i2;
                Integer num3 = aenoVar2.h;
                if (num3 != null) {
                    int iIntValue3 = num3.intValue();
                    builder.copyOnWrite();
                    aoar aoarVar10 = (aoar) builder.instance;
                    aoarVar10.b |= 2;
                    aoarVar10.d = iIntValue3;
                } else {
                    builder.copyOnWrite();
                    aoar aoarVar11 = (aoar) builder.instance;
                    aoarVar11.b &= -3;
                    aoarVar11.d = 0;
                }
                Integer num4 = aenoVar2.i;
                if (num4 != null) {
                    int iIntValue4 = num4.intValue();
                    builder.copyOnWrite();
                    aoar aoarVar12 = (aoar) builder.instance;
                    aoarVar12.b |= 4;
                    aoarVar12.e = iIntValue4;
                } else {
                    builder.copyOnWrite();
                    aoar aoarVar13 = (aoar) builder.instance;
                    aoarVar13.b &= -5;
                    aoarVar13.e = 0;
                }
                aihn aihnVarBuild = builder.build();
                aihnVarBuild.getClass();
                aoar aoarVar14 = (aoar) aihnVarBuild;
                aihh aihhVar = (aihh) ajwo.a.createBuilder();
                aihhVar.getClass();
                aihh aihhVar2 = (aihh) atqp.W(aihhVar).toBuilder();
                aihhVar2.getClass();
                aigj aigjVar2 = aenoVar2.b;
                if (aigjVar2 != null) {
                    aihhVar2.copyOnWrite();
                    ajwo ajwoVar = (ajwo) aihhVar2.instance;
                    ajwoVar.b |= 1;
                    ajwoVar.c = aigjVar2;
                }
                amdd amddVar3 = aenoVar2.k;
                if (amddVar3 != null || aenoVar2.l != null) {
                    aihh aihhVar3 = (aihh) ajwp.a.createBuilder();
                    aihhVar3.getClass();
                    if (amddVar3 != null) {
                        aihl aihlVar = amdx.b;
                        aihlVar.getClass();
                        aihhVar3.e(aihlVar, amddVar3);
                    }
                    amdd amddVar4 = aenoVar2.l;
                    if (amddVar4 != null) {
                        aihl aihlVar2 = amdx.a;
                        aihlVar2.getClass();
                        aihhVar3.e(aihlVar2, amddVar4);
                    }
                    aihn aihnVarBuild2 = aihhVar3.build();
                    aihnVarBuild2.getClass();
                    aihhVar2.copyOnWrite();
                    ajwo ajwoVar2 = (ajwo) aihhVar2.instance;
                    ajwoVar2.e = (ajwp) aihnVarBuild2;
                    ajwoVar2.b |= 2;
                }
                aihl aihlVar3 = aoaq.b;
                aihlVar3.getClass();
                aihhVar2.e(aihlVar3, aoarVar14);
                ajwo ajwoVarW = atqp.W(aihhVar2);
                xfq xfqVarA2 = aenrVar.a();
                xhc xhcVarA2 = xhb.a(aenrVar.c.g);
                xgu xguVar2 = xgu.a;
                amdd amddVarDl = aenrVar.c.k;
                if (amddVarDl == null) {
                    amddVarDl = yno.dl(ajwoVarW, amdx.b);
                }
                amdd amddVar5 = amddVarDl;
                amdd amddVarDl2 = aenrVar.c.l;
                if (amddVarDl2 == null) {
                    amddVarDl2 = yno.dl(ajwoVarW, amdx.a);
                }
                ajij ajijVar2 = a;
                xfqVarA2.P(xhcVarA2, xguVar2, ajwoVarW, amddVar5, amddVarDl2, ajijVar2);
                ajijVar = ajijVar2;
            }
            xih xihVarB = aenrVar.b();
            String strI = aenrVar.a().i();
            strI.getClass();
            xihVarB.d(strI, ajijVar);
            aenrVar.a().d(new xgj(xhb.b(22156)));
        } else {
            xih xihVarB2 = aenrVar.b();
            tau tauVar = tau.VISIBILITY_CHANGED;
            ajijVar = a;
            xihVarB2.e(tauVar, ajijVar);
        }
        aenrVar.a().K(ajijVar);
        aenrVar.b().e(tau.PAGE_ACTIVE, ajijVar);
    }
}
