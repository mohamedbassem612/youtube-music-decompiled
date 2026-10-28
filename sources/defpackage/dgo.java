package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dgo extends ast {
    final /* synthetic */ dgr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgo(dgr dgrVar) {
        super(null);
        this.b = dgrVar;
    }

    @Override // defpackage.ast
    public final void f(dhp dhpVar, dhq dhqVar) {
        dgr dgrVar = this.b;
        dih dihVarC = dgrVar.c(dhpVar);
        if (dihVarC != null) {
            dgrVar.q(dihVarC, dhqVar);
        }
    }
}
