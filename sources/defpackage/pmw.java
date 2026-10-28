package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pmw extends awpk implements awqk {
    int a;
    final /* synthetic */ pmz b;
    final /* synthetic */ pmi c;
    final /* synthetic */ plb d;
    final /* synthetic */ long e;
    final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pmw(pmz pmzVar, pmi pmiVar, plb plbVar, long j, long j2, awoq awoqVar) {
        super(2, awoqVar);
        this.b = pmzVar;
        this.c = pmiVar;
        this.d = plbVar;
        this.e = j;
        this.f = j2;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new pmw(this.b, this.c, this.d, this.e, this.f, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((pmw) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar = awox.a;
        int i = this.a;
        atqp.j(obj);
        if (i == 0) {
            pmz pmzVar = this.b;
            pmi pmiVar = this.c;
            plb plbVar = this.d;
            long j = this.e;
            long j2 = this.f;
            this.a = 1;
            if (pmzVar.g(pmiVar, plbVar, j, j2, this) == awoxVar) {
                return awoxVar;
            }
        }
        return awmy.a;
    }
}
