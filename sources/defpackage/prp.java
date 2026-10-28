package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class prp extends awpk implements awqk {
    /* synthetic */ Object a;
    final /* synthetic */ pqk b;
    final /* synthetic */ omm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public prp(omm ommVar, pqk pqkVar, awoq awoqVar) {
        super(2, awoqVar);
        this.c = ommVar;
        this.b = pqkVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        prp prpVar = new prp(this.c, this.b, awoqVar);
        prpVar.a = obj;
        return prpVar;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((prp) create((pym) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        atqp.j(obj);
        aihf builder = ((pym) this.a).toBuilder();
        builder.getClass();
        pqo pqoVar = pqo.UNKNOWN;
        pqk pqkVar = pqk.CHIME;
        int iOrdinal = this.b.ordinal();
        if (iOrdinal != 0) {
            i = iOrdinal != 1 ? 2 : 4;
        } else {
            i = 3;
        }
        qnl.R(i, builder);
        aihn aihnVarBuild = builder.build();
        aihnVarBuild.getClass();
        return (pym) aihnVarBuild;
    }
}
