package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pmt extends awpk implements awqk {
    int a;
    final /* synthetic */ pmz b;
    final /* synthetic */ plx c;
    final /* synthetic */ pmi d;
    final /* synthetic */ aicw e;
    final /* synthetic */ pmo f;
    final /* synthetic */ plb g;
    final /* synthetic */ long h;
    final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pmt(pmz pmzVar, plx plxVar, pmi pmiVar, aicw aicwVar, pmo pmoVar, plb plbVar, long j, long j2, awoq awoqVar) {
        super(2, awoqVar);
        this.b = pmzVar;
        this.c = plxVar;
        this.d = pmiVar;
        this.e = aicwVar;
        this.f = pmoVar;
        this.g = plbVar;
        this.h = j;
        this.i = j2;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new pmt(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((pmt) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar = awox.a;
        int i = this.a;
        atqp.j(obj);
        if (i == 0) {
            ozk ozkVar = (ozk) ((agev) this.b.b.io()).c();
            plx plxVar = this.c;
            pmi pmiVar = this.d;
            aicw aicwVar = this.e;
            pmo pmoVar = this.f;
            plb plbVar = this.g;
            long j = this.h;
            long j2 = this.i;
            this.a = 1;
            pnb pnbVar = pmoVar.b;
            if (ozkVar.e(plxVar, pmiVar, aicwVar, plbVar, j, j2, this) == awoxVar) {
                return awoxVar;
            }
        }
        return awmy.a;
    }
}
