package defpackage;

import androidx.car.app.model.Alert;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lxi extends lwo implements RandomAccess, lxw, lyv {
    public static final lxi a;
    private static final double[] d;
    public double[] b;
    public int c;

    static {
        double[] dArr = new double[0];
        d = dArr;
        a = new lxi(dArr, 0, false);
    }

    lxi() {
        this(d, 0, true);
    }

    private final String h(int i) {
        return "Index:" + i + ", Size:" + this.c;
    }

    private final void i(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(h(i));
        }
    }

    @Override // defpackage.lwo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        hZ();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(h(i));
        }
        int i3 = i + 1;
        double[] dArr = this.b;
        int length = dArr.length;
        if (i2 < length) {
            System.arraycopy(dArr, i, dArr, i3, i2 - i);
        } else {
            double[] dArr2 = new double[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.b, 0, dArr2, 0, i);
            System.arraycopy(this.b, i, dArr2, i3, this.c - i);
            this.b = dArr2;
        }
        this.b[i] = dDoubleValue;
        this.c++;
        this.modCount++;
    }

    @Override // defpackage.lwo, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        hZ();
        lyf.a(collection);
        if (!(collection instanceof lxi)) {
            return super.addAll(collection);
        }
        lxi lxiVar = (lxi) collection;
        int i = lxiVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArrCopyOf = this.b;
        if (i3 > dArrCopyOf.length) {
            dArrCopyOf = Arrays.copyOf(dArrCopyOf, i3);
            this.b = dArrCopyOf;
        }
        System.arraycopy(lxiVar.b, 0, dArrCopyOf, this.c, lxiVar.c);
        this.c = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.lxw
    public final double d(int i) {
        i(i);
        return this.b[i];
    }

    @Override // defpackage.lwo, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxi)) {
            return super.equals(obj);
        }
        lxi lxiVar = (lxi) obj;
        if (this.c == lxiVar.c) {
            double[] dArr = lxiVar.b;
            for (int i = 0; i < this.c; i++) {
                if (Double.doubleToLongBits(this.b[i]) == Double.doubleToLongBits(dArr[i])) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.lye
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final lxw e(int i) {
        if (i >= this.c) {
            return new lxi(i == 0 ? d : Arrays.copyOf(this.b, i), this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.lxw
    public final void g(double d2) {
        hZ();
        int i = this.c;
        double[] dArr = this.b;
        int length = dArr.length;
        if (i == length) {
            dArr = new double[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.b, 0, dArr, 0, this.c);
            this.b = dArr;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        dArr[i2] = d2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Double.valueOf(d(i));
    }

    @Override // defpackage.lwo, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iAk = 1;
        for (int i = 0; i < this.c; i++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.b[i]);
            byte[] bArr = lyf.a;
            iAk = (iAk * 31) + a.ak(jDoubleToLongBits);
        }
        return iAk;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.lwo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        hZ();
        i(i);
        double[] dArr = this.b;
        double d2 = dArr[i];
        int i2 = this.c;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.c--;
        this.modCount++;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        hZ();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.b;
        System.arraycopy(dArr, i2, dArr, i, this.c - i2);
        this.c -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.lwo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        hZ();
        i(i);
        double[] dArr = this.b;
        double d2 = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    private lxi(double[] dArr, int i, boolean z) {
        super(z);
        this.b = dArr;
        this.c = i;
    }

    @Override // defpackage.lwo, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Double) obj).doubleValue());
        return true;
    }
}
