package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kcz extends hna {
    final /* synthetic */ kda a;

    public kcz(kda kdaVar) {
        this.a = kdaVar;
    }

    @Override // defpackage.hna
    public final void G() {
        khn khnVar = kda.a;
        khn.e();
        kda kdaVar = this.a;
        kdaVar.c();
        aihf aihfVarC = kdaVar.d.c(kdaVar.f);
        agzo agzoVar = ((agzp) aihfVarC.instance).k;
        if (agzoVar == null) {
            agzoVar = agzo.a;
        }
        aihf aihfVarCreateBuilder = agzo.a.createBuilder(agzoVar);
        aihfVarCreateBuilder.copyOnWrite();
        agzo agzoVar2 = (agzo) aihfVarCreateBuilder.instance;
        agzoVar2.b |= SemanticState.Obscured;
        agzoVar2.j = 0;
        aihfVarCreateBuilder.copyOnWrite();
        agzo agzoVar3 = (agzo) aihfVarCreateBuilder.instance;
        agzoVar3.b |= SemanticState.Multiline;
        agzoVar3.k = 101;
        agzo agzoVar4 = (agzo) aihfVarCreateBuilder.build();
        aihfVarC.copyOnWrite();
        agzp agzpVar = (agzp) aihfVarC.instance;
        agzoVar4.getClass();
        agzpVar.k = agzoVar4;
        agzpVar.c |= 4;
        kdaVar.b.a((agzp) aihfVarC.build(), 232);
    }
}
