package defpackage;

import android.util.Pair;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class avnz implements avnn {
    private final /* synthetic */ int $cid;
    final Object a;

    public avnz(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [avnm, java.lang.Object] */
    @Override // defpackage.avnn
    public final /* synthetic */ Object a(Object obj) {
        if (this.$cid == 0) {
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            if (length == 9) {
                return this.a.a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7], objArr[8]);
            }
            throw new IllegalArgumentException(a.bR(length, "Array of size 9 expected but got "));
        }
        agkh agkhVar = new agkh(4);
        for (Object obj2 : (Object[]) obj) {
            Pair pair = (Pair) obj2;
            String str = (String) pair.first;
            agev agevVar = (agev) pair.second;
            byte[] bArr = (byte[]) ((agkj) this.a).get(str);
            bArr.getClass();
            agkhVar.e(str, (byte[]) agevVar.e(bArr));
        }
        return agkhVar.d(true);
    }
}
