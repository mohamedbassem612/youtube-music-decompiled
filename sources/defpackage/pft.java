package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pft extends awpk implements awqk {
    Object a;
    int b;
    final /* synthetic */ pfu c;
    final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pft(pfu pfuVar, long j, awoq awoqVar) {
        super(2, awoqVar);
        this.c = pfuVar;
        this.d = j;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new pft(this.c, this.d, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((pft) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        Object pkvVar = awox.a;
        if (this.b == 0) {
            atqp.j(obj);
            pfu pfuVar = this.c;
            long j = this.d;
            pkx pkxVar = pkx.e;
            try {
                pgd pgdVarW = pfuVar.b.w();
                long epochMilli = pfuVar.c.f().toEpochMilli() - j;
                this.a = pkxVar;
                this.b = 1;
                if (apb.g(((pgh) pgdVarW).a, false, true, new ahrf(epochMilli, 1), this) != pkvVar) {
                    obj2 = pkxVar;
                }
            } catch (Exception e) {
                e = e;
                obj2 = pkxVar;
                awro.A(getContext());
                pkvVar = new pkv(e, (pkx) obj2);
            }
            return pkvVar;
        }
        obj2 = this.a;
        try {
            atqp.j(obj);
        } catch (Exception e2) {
            e = e2;
            awro.A(getContext());
            pkvVar = new pkv(e, (pkx) obj2);
        }
        pkvVar = new pla(awmy.a);
        if (pkvVar instanceof pku) {
            ((agsj) ((agsj) pfu.a.c()).j(((pku) pkvVar).b())).t("Exception thrown on thread storage periodic cleanup.");
        }
        return pkvVar;
    }
}
