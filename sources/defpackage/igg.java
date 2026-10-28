package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class igg extends abnf {
    @Override // defpackage.abnf
    public final /* synthetic */ int a(Object obj) {
        return hna.r((apzf) obj);
    }

    @Override // defpackage.abnf
    public final /* bridge */ /* synthetic */ jrk b(Object obj) {
        aihf aihfVarCreateBuilder = jrk.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar = (jrk) aihfVarCreateBuilder.instance;
        jrkVar.b |= 1;
        jrkVar.d = "";
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar2 = (jrk) aihfVarCreateBuilder.instance;
        jrkVar2.b |= 2;
        jrkVar2.f = "";
        int iR = hna.r((apzf) obj);
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar3 = (jrk) aihfVarCreateBuilder.instance;
        jrkVar3.b |= 4;
        jrkVar3.g = iR;
        aihfVarCreateBuilder.copyOnWrite();
        jrk jrkVar4 = (jrk) aihfVarCreateBuilder.instance;
        jrkVar4.b |= SemanticState.Obscured;
        jrkVar4.q = "";
        return (jrk) aihfVarCreateBuilder.build();
    }

    @Override // defpackage.abnm
    public final aigw c() {
        return ish.a;
    }

    @Override // defpackage.abnf
    public final /* synthetic */ String d(Object obj) {
        return "";
    }

    @Override // defpackage.abnf
    public final /* synthetic */ String e(Object obj) {
        return "";
    }

    @Override // defpackage.abnf
    public final /* synthetic */ boolean f(Object obj, Object obj2) {
        return hna.u((apzf) obj, (apzf) obj2);
    }
}
