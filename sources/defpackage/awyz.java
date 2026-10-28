package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awyz implements awzd {
    final /* synthetic */ awza a;
    final /* synthetic */ awrm b;
    final /* synthetic */ awzd c;

    public awyz(awza awzaVar, awrm awrmVar, awzd awzdVar) {
        this.a = awzaVar;
        this.b = awrmVar;
        this.c = awzdVar;
    }

    @Override // defpackage.awzd
    public final Object emit(Object obj, awoq awoqVar) {
        awrm awrmVar = this.b;
        Object obj2 = awrmVar.a;
        if (obj2 == axca.a || !((Boolean) this.a.b.invoke(obj2, obj)).booleanValue()) {
            awrmVar.a = obj;
            Object objEmit = this.c.emit(obj, awoqVar);
            if (objEmit == awox.a) {
                return objEmit;
            }
        }
        return awmy.a;
    }
}
