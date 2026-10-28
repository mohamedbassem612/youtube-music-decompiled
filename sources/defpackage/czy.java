package defpackage;

import android.util.SparseArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class czy implements cwh {
    private final SparseArray a;
    private final SparseArray b;
    private final long c;
    private final long d;
    private final int e;

    public czy(SparseArray sparseArray, SparseArray sparseArray2, long j, long j2, int i) {
        this.a = sparseArray;
        this.b = sparseArray2;
        this.c = j;
        this.d = j2;
        this.e = i;
    }

    @Override // defpackage.cvz
    public final long a() {
        return this.c;
    }

    @Override // defpackage.cvz
    public final cvx b(long j) {
        return e(j, this.e);
    }

    @Override // defpackage.cvz
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // defpackage.cvz
    public final boolean d() {
        return true;
    }

    @Override // defpackage.cwh
    public final cvx e(long j, int i) {
        SparseArray sparseArray = this.a;
        long[] jArr = (long[]) sparseArray.get(i);
        SparseArray sparseArray2 = this.b;
        long[] jArr2 = (long[]) sparseArray2.get(i);
        if (jArr == null || jArr2 == null) {
            int i2 = this.e;
            jArr = (long[]) sparseArray.get(i2);
            jArr2 = (long[]) sparseArray2.get(i2);
            if (jArr == null || jArr2 == null) {
                jArr = (long[]) sparseArray.valueAt(0);
                jArr2 = (long[]) sparseArray2.valueAt(0);
            }
        }
        if (jArr.length == 0 || j < jArr[0]) {
            cwa cwaVar = new cwa(0L, this.d);
            return new cvx(cwaVar, cwaVar);
        }
        int iAn = bwp.an(jArr, j, true);
        cwa cwaVar2 = new cwa(jArr[iAn], jArr2[iAn]);
        return new cvx(cwaVar2, cwaVar2);
    }

    @Override // defpackage.cwh
    public final boolean f(int i) {
        return this.a.indexOfKey(i) >= 0;
    }
}
