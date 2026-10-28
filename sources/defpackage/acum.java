package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acum extends abnf {
    public static final String h(apfp apfpVar) {
        return (apfpVar.c & 32) != 0 ? apfpVar.p : "";
    }

    public static final String o(apfp apfpVar) {
        return (apfpVar.c & 8) != 0 ? apfpVar.o : "";
    }

    @Override // defpackage.abnf
    public final /* synthetic */ int a(Object obj) {
        return ((apfp) obj).s;
    }

    @Override // defpackage.abnf
    public final /* synthetic */ jrk b(Object obj) {
        apfp apfpVar = (apfp) obj;
        aihf aihfVarCreateBuilder = jrk.a.createBuilder();
        String strO = o(apfpVar);
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar = (jrk) aihfVarCreateBuilder.instance;
        strO.getClass();
        jrkVar.b |= 1;
        jrkVar.d = strO;
        String strH = h(apfpVar);
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar2 = (jrk) aihfVarCreateBuilder.instance;
        strH.getClass();
        jrkVar2.b |= 2;
        jrkVar2.f = strH;
        int i = apfpVar.s;
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar3 = (jrk) aihfVarCreateBuilder.instance;
        jrkVar3.b |= 4;
        jrkVar3.g = i;
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar4 = (jrk) aihfVarCreateBuilder.instance;
        jrkVar4.b |= 16;
        jrkVar4.i = "";
        String str = apfpVar.t;
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar5 = (jrk) aihfVarCreateBuilder.instance;
        str.getClass();
        jrkVar5.b |= SemanticState.Obscured;
        jrkVar5.q = str;
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar6 = (jrk) aihfVarCreateBuilder.instance;
        jrkVar6.b |= 32768;
        jrkVar6.t = true;
        if (apfpVar.X) {
            aihfVarCreateBuilder.copyOnWrite();
            jrk jrkVar7 = (jrk) aihfVarCreateBuilder.instance;
            jrkVar7.c |= SemanticState.ReadOnly;
            jrkVar7.P = true;
        }
        if ((apfpVar.c & 16384) != 0) {
            aojv aojvVar = apfpVar.x;
            if (aojvVar == null) {
                aojvVar = aojv.a;
            }
            if ((aojvVar.b & 2) != 0) {
                aojv aojvVar2 = apfpVar.x;
                if (aojvVar2 == null) {
                    aojvVar2 = aojv.a;
                }
                aojt aojtVar = aojvVar2.d;
                if (aojtVar == null) {
                    aojtVar = aojt.a;
                }
                aihfVarCreateBuilder.copyOnWrite();
                jrk jrkVar8 = (jrk) aihfVarCreateBuilder.instance;
                aojtVar.getClass();
                jrkVar8.x = aojtVar;
                jrkVar8.b |= 4194304;
            }
            aojv aojvVar3 = apfpVar.x;
            if (((aojvVar3 == null ? aojv.a : aojvVar3).b & 1) != 0) {
                if (aojvVar3 == null) {
                    aojvVar3 = aojv.a;
                }
                aojs aojsVar = aojvVar3.c;
                if (aojsVar == null) {
                    aojsVar = aojs.a;
                }
                aihfVarCreateBuilder.copyOnWrite();
                jrk jrkVar9 = (jrk) aihfVarCreateBuilder.instance;
                aojsVar.getClass();
                jrkVar9.w = aojsVar;
                jrkVar9.b |= 1048576;
            }
        }
        if ((apfpVar.c & Integer.MIN_VALUE) != 0) {
            aigj aigjVar = apfpVar.K;
            aihfVarCreateBuilder.copyOnWrite();
            jrk jrkVar10 = (jrk) aihfVarCreateBuilder.instance;
            aigjVar.getClass();
            jrkVar10.c |= 8;
            jrkVar10.I = aigjVar;
        }
        if ((apfpVar.c & 536870912) != 0) {
            arig arigVar = apfpVar.I;
            if (arigVar == null) {
                arigVar = arig.a;
            }
            aihfVarCreateBuilder.copyOnWrite();
            jrk jrkVar11 = (jrk) aihfVarCreateBuilder.instance;
            arigVar.getClass();
            jrkVar11.H = arigVar;
            jrkVar11.c |= 4;
        }
        int iAV = a.aV(apfpVar.n);
        if (iAV != 0 && iAV == 3) {
            aihfVarCreateBuilder.copyOnWrite();
            jrk jrkVar12 = (jrk) aihfVarCreateBuilder.instance;
            jrkVar12.b |= 134217728;
            jrkVar12.B = true;
        }
        return (jrk) aihfVarCreateBuilder.build();
    }

    @Override // defpackage.abnm
    public final aigw c() {
        return apfp.b;
    }

    @Override // defpackage.abnf
    public final /* bridge */ /* synthetic */ String d(Object obj) {
        return h((apfp) obj);
    }

    @Override // defpackage.abnf
    public final /* bridge */ /* synthetic */ String e(Object obj) {
        return o((apfp) obj);
    }

    @Override // defpackage.abnf
    public final /* synthetic */ boolean f(Object obj, Object obj2) {
        return Objects.equals((apfp) obj, (apfp) obj2);
    }
}
