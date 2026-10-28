package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aejr extends auzp {
    final /* synthetic */ aejs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aejr(aejs aejsVar, auyt auytVar) {
        super(auytVar);
        this.a = aejsVar;
    }

    @Override // defpackage.auzq, defpackage.auyt
    public final void a(atxy atxyVar, avbe avbeVar) {
        aejs aejsVar = this.a;
        avbe avbeVar2 = aejsVar.b;
        if (avbeVar2 != null) {
            avbeVar.d(avbeVar2);
        }
        String str = aejsVar.c;
        if (!ahno.aa(str)) {
            avbeVar.e(aejs.a, "Bearer ".concat(String.valueOf(str)));
        }
        super.a(atxyVar, avbeVar);
    }
}
