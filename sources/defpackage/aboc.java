package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aboc extends abnf {
    public static final ajwo h(String str, String str2, int i) {
        return (ajwo) p(str, str2, i, 0.0f, null, null, false).build();
    }

    public static final int o(arij arijVar) {
        return aawb.d(arijVar.f, arijVar.e);
    }

    public static final aihh p(String str, String str2, int i, float f, String str3, String str4, boolean z) {
        aihf aihfVarCreateBuilder = arij.a.createBuilder();
        if (!TextUtils.isEmpty(str)) {
            aihfVarCreateBuilder.copyOnWrite();
            arij arijVar = (arij) aihfVarCreateBuilder.instance;
            str.getClass();
            arijVar.b |= 1;
            arijVar.d = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            aihfVarCreateBuilder.copyOnWrite();
            arij arijVar2 = (arij) aihfVarCreateBuilder.instance;
            str2.getClass();
            arijVar2.b |= 2;
            arijVar2.e = str2;
        }
        if (!TextUtils.isEmpty(str3)) {
            aihfVarCreateBuilder.copyOnWrite();
            arij arijVar3 = (arij) aihfVarCreateBuilder.instance;
            str3.getClass();
            arijVar3.b |= SemanticState.Modal;
            arijVar3.l = str3;
        }
        if (!TextUtils.isEmpty(str4)) {
            aihfVarCreateBuilder.copyOnWrite();
            arij arijVar4 = (arij) aihfVarCreateBuilder.instance;
            str4.getClass();
            arijVar4.b |= 32;
            arijVar4.h = str4;
        }
        aihfVarCreateBuilder.copyOnWrite();
        arij arijVar5 = (arij) aihfVarCreateBuilder.instance;
        arijVar5.c |= 1;
        arijVar5.y = z;
        aihfVarCreateBuilder.copyOnWrite();
        arij arijVar6 = (arij) aihfVarCreateBuilder.instance;
        arijVar6.b |= 4;
        arijVar6.f = i;
        aihfVarCreateBuilder.copyOnWrite();
        arij arijVar7 = (arij) aihfVarCreateBuilder.instance;
        arijVar7.b |= SemanticState.Hidden;
        arijVar7.k = f;
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihhVar.e(arik.a, (arij) aihfVarCreateBuilder.build());
        return aihhVar;
    }

    @Override // defpackage.abnf
    public final /* bridge */ /* synthetic */ int a(Object obj) {
        return o((arij) obj);
    }

    @Override // defpackage.abnf
    public final /* synthetic */ jrk b(Object obj) {
        arij arijVar = (arij) obj;
        aihf aihfVarCreateBuilder = jrk.a.createBuilder();
        String str = arijVar.d;
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar = (jrk) aihfVarCreateBuilder.instance;
        str.getClass();
        jrkVar.b |= 1;
        jrkVar.d = str;
        String str2 = arijVar.e;
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar2 = (jrk) aihfVarCreateBuilder.instance;
        str2.getClass();
        jrkVar2.b |= 2;
        jrkVar2.f = str2;
        int iD = aawb.d(arijVar.f, arijVar.e);
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar3 = (jrk) aihfVarCreateBuilder.instance;
        jrkVar3.b |= 4;
        jrkVar3.g = iD;
        String str3 = arijVar.g;
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar4 = (jrk) aihfVarCreateBuilder.instance;
        str3.getClass();
        jrkVar4.b |= 8;
        jrkVar4.h = str3;
        String str4 = arijVar.h;
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar5 = (jrk) aihfVarCreateBuilder.instance;
        str4.getClass();
        jrkVar5.b |= 16;
        jrkVar5.i = str4;
        String str5 = arijVar.l;
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar6 = (jrk) aihfVarCreateBuilder.instance;
        str5.getClass();
        jrkVar6.b |= SemanticState.Obscured;
        jrkVar6.q = str5;
        boolean z = arijVar.i;
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar7 = (jrk) aihfVarCreateBuilder.instance;
        jrkVar7.b |= SemanticState.Focused;
        jrkVar7.l = z;
        boolean z2 = arijVar.j;
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar8 = (jrk) aihfVarCreateBuilder.instance;
        jrkVar8.b |= SemanticState.Hidden;
        jrkVar8.m = z2;
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar9 = (jrk) aihfVarCreateBuilder.instance;
        jrkVar9.b |= 64;
        jrkVar9.k = false;
        if ((arijVar.b & SemanticState.Hidden) != 0) {
            long millis = TimeUnit.SECONDS.toMillis((long) arijVar.k);
            aihfVarCreateBuilder.copyOnWrite();
            jrk jrkVar10 = (jrk) aihfVarCreateBuilder.instance;
            jrkVar10.b |= SemanticState.LiveRegion;
            jrkVar10.n = millis;
        }
        if ((arijVar.b & 524288) != 0) {
            aojv aojvVar = arijVar.q;
            if (aojvVar == null) {
                aojvVar = aojv.a;
            }
            if ((aojvVar.b & 2) != 0) {
                aojv aojvVar2 = arijVar.q;
                if (aojvVar2 == null) {
                    aojvVar2 = aojv.a;
                }
                aojt aojtVar = aojvVar2.d;
                if (aojtVar == null) {
                    aojtVar = aojt.a;
                }
                aihfVarCreateBuilder.copyOnWrite();
                jrk jrkVar11 = (jrk) aihfVarCreateBuilder.instance;
                aojtVar.getClass();
                jrkVar11.x = aojtVar;
                jrkVar11.b |= 4194304;
            }
            aojv aojvVar3 = arijVar.q;
            if (((aojvVar3 == null ? aojv.a : aojvVar3).b & 1) != 0) {
                if (aojvVar3 == null) {
                    aojvVar3 = aojv.a;
                }
                aojs aojsVar = aojvVar3.c;
                if (aojsVar == null) {
                    aojsVar = aojs.a;
                }
                aihfVarCreateBuilder.copyOnWrite();
                jrk jrkVar12 = (jrk) aihfVarCreateBuilder.instance;
                aojsVar.getClass();
                jrkVar12.w = aojsVar;
                jrkVar12.b |= 1048576;
            }
        }
        for (Map.Entry entry : DesugarCollections.unmodifiableMap(arijVar.u).entrySet()) {
            String str6 = (String) entry.getKey();
            String str7 = (String) entry.getValue();
            str6.getClass();
            str7.getClass();
            aihfVarCreateBuilder.copyOnWrite();
            jrk jrkVar13 = (jrk) aihfVarCreateBuilder.instance;
            aiip aiipVar = jrkVar13.E;
            if (!aiipVar.b) {
                jrkVar13.E = aiipVar.a();
            }
            jrkVar13.E.put(str6, str7);
        }
        int i = arijVar.b;
        if ((1073741824 & i) != 0) {
            int iBc = a.bc(arijVar.w);
            if (iBc == 0) {
                iBc = 1;
            }
            aihfVarCreateBuilder.copyOnWrite();
            jrk jrkVar14 = (jrk) aihfVarCreateBuilder.instance;
            jrkVar14.F = iBc - 1;
            jrkVar14.c |= 1;
        } else if ((i & 268435456) != 0 && arijVar.v) {
            aihfVarCreateBuilder.copyOnWrite();
            jrk jrkVar15 = (jrk) aihfVarCreateBuilder.instance;
            jrkVar15.F = 2;
            jrkVar15.c |= 1;
        }
        if ((arijVar.c & 4) != 0) {
            arig arigVar = arijVar.z;
            if (arigVar == null) {
                arigVar = arig.a;
            }
            aihfVarCreateBuilder.copyOnWrite();
            jrk jrkVar16 = (jrk) aihfVarCreateBuilder.instance;
            arigVar.getClass();
            jrkVar16.H = arigVar;
            jrkVar16.c |= 4;
        }
        if ((arijVar.c & 16) != 0) {
            aigj aigjVar = arijVar.A;
            aihfVarCreateBuilder.copyOnWrite();
            jrk jrkVar17 = (jrk) aihfVarCreateBuilder.instance;
            aigjVar.getClass();
            jrkVar17.c |= 8;
            jrkVar17.I = aigjVar;
        }
        if ((arijVar.c & SemanticState.Focused) != 0) {
            String str8 = arijVar.B;
            aihfVarCreateBuilder.copyOnWrite();
            jrk jrkVar18 = (jrk) aihfVarCreateBuilder.instance;
            str8.getClass();
            jrkVar18.c |= 64;
            jrkVar18.L = str8;
        }
        if ((arijVar.b & SemanticState.Obscured) != 0) {
            String str9 = arijVar.m;
            aihfVarCreateBuilder.copyOnWrite();
            jrk jrkVar19 = (jrk) aihfVarCreateBuilder.instance;
            str9.getClass();
            jrkVar19.b |= SemanticState.Multiline;
            jrkVar19.r = str9;
        }
        if ((arijVar.b & 16777216) != 0) {
            aric aricVar = arijVar.t;
            if (aricVar == null) {
                aricVar = aric.a;
            }
            if ((aricVar.b & 4) != 0) {
                aric aricVar2 = arijVar.t;
                if (aricVar2 == null) {
                    aricVar2 = aric.a;
                }
                boolean z3 = aricVar2.c;
                aihfVarCreateBuilder.copyOnWrite();
                jrk jrkVar20 = (jrk) aihfVarCreateBuilder.instance;
                jrkVar20.c |= SemanticState.Focused;
                jrkVar20.M = z3;
            }
        }
        if ((arijVar.b & 32768) != 0) {
            String str10 = arijVar.o;
            aihfVarCreateBuilder.copyOnWrite();
            jrk jrkVar21 = (jrk) aihfVarCreateBuilder.instance;
            str10.getClass();
            jrkVar21.c |= SemanticState.Hidden;
            jrkVar21.N = str10;
        }
        if ((arijVar.b & Integer.MIN_VALUE) != 0) {
            int i2 = arijVar.x;
            aihfVarCreateBuilder.copyOnWrite();
            jrk jrkVar22 = (jrk) aihfVarCreateBuilder.instance;
            jrkVar22.c |= SemanticState.LiveRegion;
            jrkVar22.O = i2;
        }
        return (jrk) aihfVarCreateBuilder.build();
    }

    @Override // defpackage.abnm
    public final aigw c() {
        return arik.a;
    }

    @Override // defpackage.abnf
    public final /* synthetic */ String d(Object obj) {
        return ((arij) obj).e;
    }

    @Override // defpackage.abnf
    public final /* synthetic */ String e(Object obj) {
        return ((arij) obj).d;
    }

    @Override // defpackage.abnf
    public final /* bridge */ /* synthetic */ boolean f(Object obj, Object obj2) {
        arij arijVar = (arij) obj;
        arij arijVar2 = (arij) obj2;
        if (Objects.equals(arijVar, arijVar2)) {
            return true;
        }
        String str = arijVar.e;
        int iO = o(arijVar);
        String str2 = arijVar2.e;
        int iO2 = o(arijVar2);
        if (!TextUtils.equals(str, str2) || (!TextUtils.equals("", str) && Math.abs(iO - iO2) > 1)) {
            return false;
        }
        return TextUtils.equals(arijVar.d, arijVar2.d);
    }
}
