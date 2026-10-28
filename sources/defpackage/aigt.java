package defpackage;

import androidx.car.app.model.Alert;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aigt extends aifu implements RandomAccess, aihq, aiiy {
    public static final double[] a;
    public static final aigt b;
    public double[] c;
    public int d;

    static {
        double[] dArr = new double[0];
        a = dArr;
        b = new aigt(dArr, 0, false);
    }

    aigt() {
        this(a, 0, true);
    }

    private final String h(int i) {
        return "Index:" + i + ", Size:" + this.d;
    }

    private final void i(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(h(i));
        }
    }

    @Override // defpackage.aifu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        kh();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(h(i));
        }
        int i3 = i + 1;
        double[] dArr = this.c;
        int length = dArr.length;
        if (i2 < length) {
            System.arraycopy(dArr, i, dArr, i3, i2 - i);
        } else {
            double[] dArr2 = new double[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.c, 0, dArr2, 0, i);
            System.arraycopy(this.c, i, dArr2, i3, this.d - i);
            this.c = dArr2;
        }
        this.c[i] = dDoubleValue;
        this.d++;
        this.modCount++;
    }

    @Override // defpackage.aifu, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        kh();
        collection.getClass();
        if (!(collection instanceof aigt)) {
            return super.addAll(collection);
        }
        aigt aigtVar = (aigt) collection;
        int i = aigtVar.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i + i2;
        double[] dArrCopyOf = this.c;
        int length = dArrCopyOf.length;
        if (i3 > length) {
            if (i2 == 0) {
                dArrCopyOf = new double[i3];
                this.c = dArrCopyOf;
            } else {
                dArrCopyOf = Arrays.copyOf(dArrCopyOf, Math.max(i3, Math.max(((length * 3) / 2) + 1, 10)));
                this.c = dArrCopyOf;
            }
        }
        System.arraycopy(aigtVar.c, 0, dArrCopyOf, this.d, aigtVar.d);
        this.d = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final double d(int i) {
        i(i);
        return this.c[i];
    }

    @Override // defpackage.aifu, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aigt)) {
            return super.equals(obj);
        }
        aigt aigtVar = (aigt) obj;
        if (this.d == aigtVar.d) {
            double[] dArr = aigtVar.c;
            for (int i = 0; i < this.d; i++) {
                if (Double.doubleToLongBits(this.c[i]) == Double.doubleToLongBits(dArr[i])) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.aiie
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final aihq e(int i) {
        if (i >= this.d) {
            return new aigt(i == 0 ? a : Arrays.copyOf(this.c, i), this.d, true);
        }
        throw new IllegalArgumentException();
    }

    public final void g(double d) {
        kh();
        int i = this.d;
        double[] dArr = this.c;
        int length = dArr.length;
        if (i == length) {
            dArr = new double[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.c, 0, dArr, 0, this.d);
            this.c = dArr;
        }
        int i2 = this.d;
        this.d = i2 + 1;
        dArr[i2] = d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Double.valueOf(d(i));
    }

    @Override // defpackage.aifu, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iAk = 1;
        for (int i = 0; i < this.d; i++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.c[i]);
            byte[] bArr = aiif.a;
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
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.aifu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        kh();
        i(i);
        double[] dArr = this.c;
        double d = dArr[i];
        int i2 = this.d;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        kh();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.c;
        System.arraycopy(dArr, i2, dArr, i, this.d - i2);
        this.d -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.aifu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        kh();
        i(i);
        double[] dArr = this.c;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    public aigt(double[] dArr, int i, boolean z) {
        super(z);
        this.c = dArr;
        this.d = i;
    }

    @Override // defpackage.aifu, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Double) obj).doubleValue());
        return true;
    }
}
