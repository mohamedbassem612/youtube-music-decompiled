package defpackage;

import androidx.car.app.model.Alert;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class bit extends bho implements RandomAccess, biw, bjo {
    private static final int[] b;
    public int a;
    private int[] c;

    static {
        int[] iArr = new int[0];
        b = iArr;
        new bit(iArr, 0, false);
    }

    bit() {
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

    @Override // defpackage.bho, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i < 0 || i > (i2 = this.a)) {
            throw new IndexOutOfBoundsException(g(i));
        }
        int i3 = i + 1;
        int[] iArr = this.c;
        int length = iArr.length;
        if (i2 < length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.c, 0, iArr2, 0, i);
            System.arraycopy(this.c, i, iArr2, i3, this.a - i);
            this.c = iArr2;
        }
        this.c[i] = iIntValue;
        this.a++;
        this.modCount++;
    }

    @Override // defpackage.bho, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        bix.a(collection);
        if (!(collection instanceof bit)) {
            return super.addAll(collection);
        }
        bit bitVar = (bit) collection;
        int i = bitVar.a;
        if (i == 0) {
            return false;
        }
        int i2 = this.a;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArrCopyOf = this.c;
        if (i3 > iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i3);
            this.c = iArrCopyOf;
        }
        System.arraycopy(bitVar.c, 0, iArrCopyOf, this.a, bitVar.a);
        this.a = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.biw
    public final /* bridge */ /* synthetic */ biw d(int i) {
        if (i >= this.a) {
            return new bit(i == 0 ? b : Arrays.copyOf(this.c, i), this.a, true);
        }
        throw new IllegalArgumentException();
    }

    public final int e(int i) {
        h(i);
        return this.c[i];
    }

    @Override // defpackage.bho, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bit)) {
            return super.equals(obj);
        }
        bit bitVar = (bit) obj;
        if (this.a == bitVar.a) {
            int[] iArr = bitVar.c;
            for (int i = 0; i < this.a; i++) {
                if (this.c[i] == iArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f(int i) {
        a();
        int i2 = this.a;
        int[] iArr = this.c;
        int length = iArr.length;
        if (i2 == length) {
            iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.c, 0, iArr, 0, this.a);
            this.c = iArr;
        }
        int i3 = this.a;
        this.a = i3 + 1;
        iArr[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Integer.valueOf(e(i));
    }

    @Override // defpackage.bho, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.a; i2++) {
            i = (i * 31) + this.c[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.bho, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        h(i);
        int[] iArr = this.c;
        int i2 = iArr[i];
        int i3 = this.a;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.a--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.c;
        System.arraycopy(iArr, i2, iArr, i, this.a - i2);
        this.a -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.bho, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        h(i);
        int[] iArr = this.c;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a;
    }

    private bit(int[] iArr, int i, boolean z) {
        super(z);
        this.c = iArr;
        this.a = i;
    }

    @Override // defpackage.bho, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Integer) obj).intValue());
        return true;
    }
}
