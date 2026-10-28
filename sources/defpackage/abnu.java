package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abnu extends abnf {
    @Override // defpackage.abnf
    public final /* synthetic */ int a(Object obj) {
        return ((aoyc) obj).f;
    }

    @Override // defpackage.abnf
    public final /* bridge */ /* synthetic */ jrk b(Object obj) {
        aoyc aoycVar = (aoyc) obj;
        aihf aihfVarCreateBuilder = jrk.a.createBuilder();
        String str = aoycVar.d;
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar = (jrk) aihfVarCreateBuilder.instance;
        str.getClass();
        jrkVar.b |= 1;
        jrkVar.d = str;
        String str2 = aoycVar.e;
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar2 = (jrk) aihfVarCreateBuilder.instance;
        str2.getClass();
        jrkVar2.b |= 2;
        jrkVar2.f = str2;
        int i = aoycVar.f;
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar3 = (jrk) aihfVarCreateBuilder.instance;
        jrkVar3.b |= 4;
        jrkVar3.g = i;
        String str3 = aoycVar.g;
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar4 = (jrk) aihfVarCreateBuilder.instance;
        str3.getClass();
        jrkVar4.b |= SemanticState.Obscured;
        jrkVar4.q = str3;
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar5 = (jrk) aihfVarCreateBuilder.instance;
        jrkVar5.b |= 64;
        jrkVar5.k = false;
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar6 = (jrk) aihfVarCreateBuilder.instance;
        jrkVar6.b |= 32768;
        jrkVar6.t = true;
        if ((aoycVar.c & 1048576) != 0) {
            String str4 = aoycVar.l;
            aihfVarCreateBuilder.copyOnWrite();
            jrk jrkVar7 = (jrk) aihfVarCreateBuilder.instance;
            str4.getClass();
            jrkVar7.b |= 16;
            jrkVar7.i = str4;
        }
        if ((aoycVar.c & SemanticState.ReadOnly) != 0) {
            long millis = TimeUnit.SECONDS.toMillis((long) aoycVar.k);
            aihfVarCreateBuilder.copyOnWrite();
            jrk jrkVar8 = (jrk) aihfVarCreateBuilder.instance;
            jrkVar8.b |= SemanticState.LiveRegion;
            jrkVar8.n = millis;
        }
        if ((aoycVar.c & 64) != 0) {
            aojv aojvVar = aoycVar.h;
            if (aojvVar == null) {
                aojvVar = aojv.a;
            }
            if ((aojvVar.b & 2) != 0) {
                aojv aojvVar2 = aoycVar.h;
                if (aojvVar2 == null) {
                    aojvVar2 = aojv.a;
                }
                aojt aojtVar = aojvVar2.d;
                if (aojtVar == null) {
                    aojtVar = aojt.a;
                }
                aihfVarCreateBuilder.copyOnWrite();
                jrk jrkVar9 = (jrk) aihfVarCreateBuilder.instance;
                aojtVar.getClass();
                jrkVar9.x = aojtVar;
                jrkVar9.b |= 4194304;
            }
            aojv aojvVar3 = aoycVar.h;
            if (((aojvVar3 == null ? aojv.a : aojvVar3).b & 1) != 0) {
                if (aojvVar3 == null) {
                    aojvVar3 = aojv.a;
                }
                aojs aojsVar = aojvVar3.c;
                if (aojsVar == null) {
                    aojsVar = aojs.a;
                }
                aihfVarCreateBuilder.copyOnWrite();
                jrk jrkVar10 = (jrk) aihfVarCreateBuilder.instance;
                aojsVar.getClass();
                jrkVar10.w = aojsVar;
                jrkVar10.b |= 1048576;
            }
        }
        if ((aoycVar.c & SemanticState.Focused) != 0) {
            arig arigVar = aoycVar.i;
            if (arigVar == null) {
                arigVar = arig.a;
            }
            aihfVarCreateBuilder.copyOnWrite();
            jrk jrkVar11 = (jrk) aihfVarCreateBuilder.instance;
            arigVar.getClass();
            jrkVar11.H = arigVar;
            jrkVar11.c |= 4;
        }
        if ((aoycVar.c & SemanticState.Hidden) != 0) {
            aigj aigjVar = aoycVar.j;
            aihfVarCreateBuilder.copyOnWrite();
            jrk jrkVar12 = (jrk) aihfVarCreateBuilder.instance;
            aigjVar.getClass();
            jrkVar12.c |= 8;
            jrkVar12.I = aigjVar;
        }
        return (jrk) aihfVarCreateBuilder.build();
    }

    @Override // defpackage.abnm
    public final aigw c() {
        return aoyc.b;
    }

    @Override // defpackage.abnf
    public final /* synthetic */ String d(Object obj) {
        return ((aoyc) obj).e;
    }

    @Override // defpackage.abnf
    public final /* synthetic */ String e(Object obj) {
        return ((aoyc) obj).d;
    }

    @Override // defpackage.abnf
    public final /* synthetic */ boolean f(Object obj, Object obj2) {
        return Objects.equals((aoyc) obj, (aoyc) obj2);
    }
}
