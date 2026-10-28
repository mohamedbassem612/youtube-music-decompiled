package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abod extends abnf {
    public static final String h(ariw ariwVar) {
        return (ariwVar.b & 1) != 0 ? ariwVar.c : "";
    }

    @Override // defpackage.abnf
    public final /* synthetic */ int a(Object obj) {
        return ((ariw) obj).d;
    }

    @Override // defpackage.abnf
    public final /* bridge */ /* synthetic */ jrk b(Object obj) {
        ariw ariwVar = (ariw) obj;
        aihf aihfVarCreateBuilder = jrk.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar = (jrk) aihfVarCreateBuilder.instance;
        jrkVar.b |= 1;
        jrkVar.d = "";
        String strH = h(ariwVar);
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar2 = (jrk) aihfVarCreateBuilder.instance;
        strH.getClass();
        jrkVar2.b |= 2;
        jrkVar2.f = strH;
        int i = ariwVar.d;
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar3 = (jrk) aihfVarCreateBuilder.instance;
        jrkVar3.b |= 4;
        jrkVar3.g = i;
        String str = ariwVar.e;
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar4 = (jrk) aihfVarCreateBuilder.instance;
        str.getClass();
        jrkVar4.b |= 16;
        jrkVar4.i = str;
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar5 = (jrk) aihfVarCreateBuilder.instance;
        jrkVar5.b |= SemanticState.Obscured;
        jrkVar5.q = "";
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar6 = (jrk) aihfVarCreateBuilder.instance;
        jrkVar6.b |= SemanticState.Focused;
        jrkVar6.l = false;
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar7 = (jrk) aihfVarCreateBuilder.instance;
        jrkVar7.b |= 64;
        jrkVar7.k = false;
        return (jrk) aihfVarCreateBuilder.build();
    }

    @Override // defpackage.abnm
    public final aigw c() {
        return arix.a;
    }

    @Override // defpackage.abnf
    public final /* bridge */ /* synthetic */ String d(Object obj) {
        return h((ariw) obj);
    }

    @Override // defpackage.abnf
    public final /* synthetic */ String e(Object obj) {
        return "";
    }

    @Override // defpackage.abnf
    public final /* bridge */ /* synthetic */ boolean f(Object obj, Object obj2) {
        ariw ariwVar = (ariw) obj;
        ariw ariwVar2 = (ariw) obj2;
        if (Objects.equals(ariwVar, ariwVar2)) {
            return true;
        }
        return TextUtils.equals(h(ariwVar), h(ariwVar2)) && Math.abs(ariwVar.d - ariwVar2.d) <= 1;
    }
}
