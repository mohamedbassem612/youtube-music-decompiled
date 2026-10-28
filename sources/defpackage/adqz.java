package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adqz extends awpk implements awqk {
    final /* synthetic */ adrf a;
    final /* synthetic */ awut b;
    final /* synthetic */ awrm c;
    final /* synthetic */ xir d;
    final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adqz(adrf adrfVar, awut awutVar, awrm awrmVar, xir xirVar, boolean z, awoq awoqVar) {
        super(2, awoqVar);
        this.a = adrfVar;
        this.b = awutVar;
        this.c = awrmVar;
        this.d = xirVar;
        this.e = z;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new adqz(this.a, this.b, this.c, this.d, this.e, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((adqz) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        atqp.j(obj);
        adqc adqcVar = (adqc) this.c.a;
        boolean z = this.e;
        xir xirVar = this.d;
        if (!z && xirVar != null) {
            xirVar.f(tau.ACTION_ABANDONED);
        }
        adrf adrfVar = this.a;
        if (adrfVar.g == xirVar) {
            adrfVar.g = null;
        }
        awut awutVar = this.b;
        awwd awwdVar = (awwd) ((axcw) awutVar).a.get(awwd.d);
        adps adpsVar = adrfVar.i;
        adpi adpiVar = adrfVar.j;
        awwd awwdVarB = adpsVar.b();
        awwd awwdVarC = adpiVar.c();
        awrc.O(awutVar);
        if (adqcVar != null) {
            adqcVar.b();
        }
        adrfVar.j(adqcVar, awwdVar, awwdVarB, awwdVarC);
        adqt adqtVar = adrfVar.f;
        adqp adqpVar = adqtVar instanceof adqp ? (adqp) adqtVar : null;
        if ((adqpVar != null ? adqpVar.c : null) == awutVar) {
            adrfVar.f = adqo.a;
            adrfVar.n();
        }
        return awmy.a;
    }
}
