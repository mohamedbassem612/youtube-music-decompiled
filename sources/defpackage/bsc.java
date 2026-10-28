package defpackage;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bsc {
    public static final boolean a;
    private static final SparseBooleanArray b;
    private static SparseBooleanArray c;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        b = sparseBooleanArray;
        sparseBooleanArray.put(1, false);
        sparseBooleanArray.put(2, false);
        sparseBooleanArray.put(4, false);
        sparseBooleanArray.put(5, false);
        sparseBooleanArray.put(6, false);
        sparseBooleanArray.put(7, false);
        sparseBooleanArray.put(10, false);
        sparseBooleanArray.put(3, true);
        a = true;
        c = new SparseBooleanArray();
    }

    public static void a(StringBuilder sb, int[] iArr) {
        sb.append('[');
        for (int i = 0; i < iArr.length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(iArr[i]);
        }
        sb.append(']');
    }

    public static synchronized void b(int i) {
        SparseBooleanArray sparseBooleanArray = b;
        if (!bwp.Y(sparseBooleanArray, i) || !sparseBooleanArray.get(i)) {
            SparseBooleanArray sparseBooleanArrayClone = c.clone();
            sparseBooleanArrayClone.put(i, true);
            c = sparseBooleanArrayClone;
        } else {
            if (bwp.Y(c, i)) {
                SparseBooleanArray sparseBooleanArrayClone2 = c.clone();
                sparseBooleanArrayClone2.delete(i);
                c = sparseBooleanArrayClone2;
            }
        }
    }

    public static boolean c(int i) {
        SparseBooleanArray sparseBooleanArray = c;
        int i2 = bwp.a;
        if (sparseBooleanArray.indexOfKey(i) >= 0) {
            return sparseBooleanArray.get(i);
        }
        SparseBooleanArray sparseBooleanArray2 = b;
        return sparseBooleanArray2.indexOfKey(i) >= 0 ? sparseBooleanArray2.get(i) : a;
    }

    public static int[] d(boolean z) {
        SparseBooleanArray sparseBooleanArray = c;
        int i = 0;
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            if (sparseBooleanArray.valueAt(i2) == z) {
                i++;
            }
        }
        int[] iArr = new int[i];
        int i3 = 0;
        for (int i4 = 0; i4 < sparseBooleanArray.size(); i4++) {
            if (sparseBooleanArray.valueAt(i4) == z) {
                iArr[i3] = sparseBooleanArray.keyAt(i4);
                i3++;
            }
        }
        return iArr;
    }
}
