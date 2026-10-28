package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awbb extends avlr {
    final avlu[] a;
    final Iterable b;
    final avnn c;
    final int d;

    public awbb(avlu[] avluVarArr, Iterable iterable, avnn avnnVar, int i) {
        this.a = avluVarArr;
        this.b = iterable;
        this.c = avnnVar;
        this.d = i;
    }

    @Override // defpackage.avlr
    public final void e(avlw avlwVar) {
        int length;
        avlu[] avluVarArr = this.a;
        if (avluVarArr == null) {
            avlu[] avluVarArr2 = new avlr[8];
            length = 0;
            for (avlu avluVar : this.b) {
                if (length == avluVarArr2.length) {
                    avlu[] avluVarArr3 = new avlu[(length >> 2) + length];
                    System.arraycopy(avluVarArr2, 0, avluVarArr3, 0, length);
                    avluVarArr2 = avluVarArr3;
                }
                avluVarArr2[length] = avluVar;
                length++;
            }
            avluVarArr = avluVarArr2;
        } else {
            length = avluVarArr.length;
        }
        if (length == 0) {
            avlwVar.d(avns.a);
            avlwVar.kn();
            return;
        }
        awba awbaVar = new awba(avlwVar, this.c, length, this.d);
        awaz[] awazVarArr = awbaVar.c;
        avlw avlwVar2 = awbaVar.a;
        int length2 = awazVarArr.length;
        avlwVar2.d(awbaVar);
        for (int i = 0; i < length2 && !awbaVar.g && !awbaVar.f; i++) {
            avluVarArr[i].ak(awazVarArr[i]);
        }
    }
}
