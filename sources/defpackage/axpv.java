package defpackage;

import androidx.car.app.model.Alert;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class axpv extends axph implements RandomAccess, axqi {
    private static final double[] b;
    public int a;
    private double[] c;

    static {
        double[] dArr = new double[0];
        b = dArr;
        new axpv(dArr, 0, false);
    }

    axpv() {
        this(b, 0, true);
    }

    private final String g(int i) {
        return "Index:" + i + ", Size:" + this.a;
    }

    private final void h(int i) {
        if (i < 0 || i >= this.a) {
            throw new IndexOutOfBoundsException(g(i));
        }
    }

    @Override // defpackage.axph, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        if (i < 0 || i > (i2 = this.a)) {
            throw new IndexOutOfBoundsException(g(i));
        }
        int i3 = i + 1;
        double[] dArr = this.c;
        int length = dArr.length;
        if (i2 < length) {
            System.arraycopy(dArr, i, dArr, i3, i2 - i);
        } else {
            double[] dArr2 = new double[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.c, 0, dArr2, 0, i);
            System.arraycopy(this.c, i, dArr2, i3, this.a - i);
            this.c = dArr2;
        }
        this.c[i] = dDoubleValue;
        this.a++;
        this.modCount++;
    }

    @Override // defpackage.axph, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        axqj.a(collection);
        if (!(collection instanceof axpv)) {
            return super.addAll(collection);
        }
        axpv axpvVar = (axpv) collection;
        int i = axpvVar.a;
        if (i == 0) {
            return false;
        }
        int i2 = this.a;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArrCopyOf = this.c;
        if (i3 > dArrCopyOf.length) {
            dArrCopyOf = Arrays.copyOf(dArrCopyOf, i3);
            this.c = dArrCopyOf;
        }
        System.arraycopy(axpvVar.c, 0, dArrCopyOf, this.a, axpvVar.a);
        this.a = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.axqi
    public final /* bridge */ /* synthetic */ axqi d(int i) {
        if (i >= this.a) {
            return new axpv(i == 0 ? b : Arrays.copyOf(this.c, i), this.a, true);
        }
        throw new IllegalArgumentException();
    }

    public final double e(int i) {
        h(i);
        return this.c[i];
    }

    @Override // defpackage.axph, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axpv)) {
            return super.equals(obj);
        }
        axpv axpvVar = (axpv) obj;
        if (this.a == axpvVar.a) {
            double[] dArr = axpvVar.c;
            for (int i = 0; i < this.a; i++) {
                if (Double.doubleToLongBits(this.c[i]) == Double.doubleToLongBits(dArr[i])) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f(double d) {
        a();
        int i = this.a;
        double[] dArr = this.c;
        int length = dArr.length;
        if (i == length) {
            dArr = new double[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.c, 0, dArr, 0, this.a);
            this.c = dArr;
        }
        int i2 = this.a;
        this.a = i2 + 1;
        dArr[i2] = d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Double.valueOf(e(i));
    }

    @Override // defpackage.axph, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iAk = 1;
        for (int i = 0; i < this.a; i++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.c[i]);
            byte[] bArr = axqj.a;
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
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.axph, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        h(i);
        double[] dArr = this.c;
        double d = dArr[i];
        int i2 = this.a;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.a--;
        this.modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.c;
        System.arraycopy(dArr, i2, dArr, i, this.a - i2);
        this.a -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.axph, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        h(i);
        double[] dArr = this.c;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a;
    }

    private axpv(double[] dArr, int i, boolean z) {
        super(z);
        this.c = dArr;
        this.a = i;
    }

    @Override // defpackage.axph, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Double) obj).doubleValue());
        return true;
    }
}
