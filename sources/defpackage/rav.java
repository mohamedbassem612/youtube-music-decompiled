package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class rav extends agdy {
    final /* synthetic */ raw a;

    public rav(raw rawVar) {
        this.a = rawVar;
    }

    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        qwd qwdVar = (qwd) obj;
        float fA = qwdVar.a();
        raq raqVar = this.a.a.a;
        float fD = nqx.d(fA, raqVar.b());
        float fD2 = nqx.d(qwdVar.b(), raqVar.b());
        float fD3 = nqx.d(qwdVar.c(), raqVar.b());
        aihf aihfVarCreateBuilder = atrz.a.createBuilder();
        int iD = qwdVar.d();
        aihfVarCreateBuilder.copyOnWrite();
        atrz atrzVar = (atrz) aihfVarCreateBuilder.instance;
        atrzVar.b |= 1;
        atrzVar.c = iD;
        aihfVarCreateBuilder.copyOnWrite();
        atrz atrzVar2 = (atrz) aihfVarCreateBuilder.instance;
        atrzVar2.b |= 4;
        atrzVar2.e = fD;
        aihf aihfVarCreateBuilder2 = aims.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        aims aimsVar = (aims) aihfVarCreateBuilder2.instance;
        aimsVar.b |= 1;
        aimsVar.c = fD2;
        aihfVarCreateBuilder2.copyOnWrite();
        aims aimsVar2 = (aims) aihfVarCreateBuilder2.instance;
        aimsVar2.b |= 2;
        aimsVar2.d = fD3;
        aihfVarCreateBuilder.copyOnWrite();
        atrz atrzVar3 = (atrz) aihfVarCreateBuilder.instance;
        aims aimsVar3 = (aims) aihfVarCreateBuilder2.build();
        aimsVar3.getClass();
        atrzVar3.d = aimsVar3;
        atrzVar3.b |= 2;
        return (atrz) aihfVarCreateBuilder.build();
    }
}
