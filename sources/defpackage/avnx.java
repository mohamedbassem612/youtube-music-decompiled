package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avnx implements avnn {
    private final /* synthetic */ int $cid;
    final Object a;

    public avnx(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [avnj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v5, types: [avnf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8, types: [avnk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [avnl, java.lang.Object] */
    @Override // defpackage.avnn
    public final /* synthetic */ Object a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            if (length == 3) {
                return this.a.a(objArr[0], objArr[1], objArr[2]);
            }
            throw new IllegalArgumentException(a.bR(length, "Array of size 3 expected but got "));
        }
        if (i == 1) {
            Object[] objArr2 = (Object[]) obj;
            int length2 = objArr2.length;
            if (length2 == 2) {
                return this.a.a(objArr2[0], objArr2[1]);
            }
            throw new IllegalArgumentException(a.bR(length2, "Array of size 2 expected but got "));
        }
        if (i != 2) {
            Object[] objArr3 = (Object[]) obj;
            int length3 = objArr3.length;
            if (length3 == 5) {
                return this.a.a(objArr3[0], objArr3[1], objArr3[2], objArr3[3], objArr3[4]);
            }
            throw new IllegalArgumentException(a.bR(length3, "Array of size 5 expected but got "));
        }
        Object[] objArr4 = (Object[]) obj;
        int length4 = objArr4.length;
        if (length4 == 4) {
            return this.a.a(objArr4[0], objArr4[1], objArr4[2], objArr4[3]);
        }
        throw new IllegalArgumentException(a.bR(length4, "Array of size 4 expected but got "));
    }
}
