package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wzb {
    private static final SparseIntArray a = new aabs(null, null);
    private static final SparseIntArray b = new aabs((char[]) null);
    private final SparseIntArray c;

    public wzb(wza wzaVar) {
        SparseIntArray sparseIntArray;
        int iOrdinal = wzaVar.ordinal();
        if (iOrdinal == 0) {
            sparseIntArray = a;
        } else {
            if (iOrdinal != 1) {
                throw new RuntimeException(null, null);
            }
            sparseIntArray = b;
        }
        sparseIntArray.getClass();
        this.c = sparseIntArray;
    }

    public final int a(int i) {
        SparseIntArray sparseIntArray = this.c;
        if (sparseIntArray.indexOfKey(i) >= 0) {
            return sparseIntArray.get(i);
        }
        return 0;
    }
}
