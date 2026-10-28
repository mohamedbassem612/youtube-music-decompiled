package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awcu extends avlr {
    final Object[] a;

    public awcu(Object[] objArr) {
        this.a = objArr;
    }

    @Override // defpackage.avlr
    public final void e(avlw avlwVar) {
        awct awctVar = new awct(avlwVar, this.a);
        avlwVar.d(awctVar);
        if (awctVar.d) {
            return;
        }
        Object[] objArr = awctVar.b;
        for (int i = 0; i < objArr.length && !awctVar.e; i++) {
            Object obj = objArr[i];
            avlw avlwVar2 = awctVar.a;
            if (obj == null) {
                avlwVar2.b(new NullPointerException(a.bP(i, "The element at index ", " is null")));
                return;
            }
            avlwVar2.kk(obj);
        }
        if (awctVar.e) {
            return;
        }
        awctVar.a.kn();
    }
}
