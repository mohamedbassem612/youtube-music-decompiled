package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import j$.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abnj extends abnf {
    public static final String h(aoht aohtVar) {
        return (aohtVar.b & 2) != 0 ? aohtVar.d : "";
    }

    public static final String o(aoht aohtVar) {
        return (aohtVar.b & 1) != 0 ? aohtVar.c : "";
    }

    public static final int p(aoht aohtVar) {
        return aawb.d(aohtVar.e, h(aohtVar));
    }

    @Override // defpackage.abnf
    public final /* bridge */ /* synthetic */ int a(Object obj) {
        return p((aoht) obj);
    }

    @Override // defpackage.abnf
    public final /* bridge */ /* synthetic */ jrk b(Object obj) {
        aoht aohtVar = (aoht) obj;
        aihf aihfVarCreateBuilder = jrk.a.createBuilder();
        String strO = o(aohtVar);
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar = (jrk) aihfVarCreateBuilder.instance;
        strO.getClass();
        jrkVar.b |= 1;
        jrkVar.d = strO;
        String strH = h(aohtVar);
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar2 = (jrk) aihfVarCreateBuilder.instance;
        strH.getClass();
        jrkVar2.b |= 2;
        jrkVar2.f = strH;
        int iP = p(aohtVar);
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar3 = (jrk) aihfVarCreateBuilder.instance;
        jrkVar3.b |= 4;
        jrkVar3.g = iP;
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar4 = (jrk) aihfVarCreateBuilder.instance;
        jrkVar4.b |= SemanticState.Obscured;
        jrkVar4.q = "";
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar5 = (jrk) aihfVarCreateBuilder.instance;
        jrkVar5.b |= SemanticState.Focused;
        jrkVar5.l = false;
        boolean z = aohtVar.g;
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar6 = (jrk) aihfVarCreateBuilder.instance;
        jrkVar6.b |= SemanticState.Hidden;
        jrkVar6.m = z;
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar7 = (jrk) aihfVarCreateBuilder.instance;
        jrkVar7.b |= 64;
        jrkVar7.k = true;
        if ((aohtVar.b & 16) != 0) {
            long millis = TimeUnit.SECONDS.toMillis((long) aohtVar.f);
            aihfVarCreateBuilder.copyOnWrite();
            jrk jrkVar8 = (jrk) aihfVarCreateBuilder.instance;
            jrkVar8.b |= SemanticState.LiveRegion;
            jrkVar8.n = millis;
        }
        return (jrk) aihfVarCreateBuilder.build();
    }

    @Override // defpackage.abnm
    public final aigw c() {
        return aohu.a;
    }

    @Override // defpackage.abnf
    public final /* bridge */ /* synthetic */ String d(Object obj) {
        return h((aoht) obj);
    }

    @Override // defpackage.abnf
    public final /* bridge */ /* synthetic */ String e(Object obj) {
        return o((aoht) obj);
    }

    @Override // defpackage.abnf
    public final /* bridge */ /* synthetic */ boolean f(Object obj, Object obj2) {
        aoht aohtVar = (aoht) obj;
        aoht aohtVar2 = (aoht) obj2;
        if (Objects.equals(aohtVar, aohtVar2)) {
            return true;
        }
        String strH = h(aohtVar);
        int iP = p(aohtVar);
        String strH2 = h(aohtVar2);
        int iP2 = p(aohtVar2);
        if (TextUtils.equals(strH, strH2) && (TextUtils.equals("", strH) || iP == iP2)) {
            return TextUtils.equals(o(aohtVar), o(aohtVar2));
        }
        return false;
    }
}
