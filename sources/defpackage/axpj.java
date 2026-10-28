package defpackage;

import androidx.car.app.model.Alert;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class axpj extends axph implements RandomAccess, axqi {
    private static final boolean[] b;
    public int a;
    private boolean[] c;

    static {
        boolean[] zArr = new boolean[0];
        b = zArr;
        new axpj(zArr, 0, false);
    }

    axpj() {
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
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i < 0 || i > (i2 = this.a)) {
            throw new IndexOutOfBoundsException(g(i));
        }
        int i3 = i + 1;
        boolean[] zArr = this.c;
        int length = zArr.length;
        if (i2 < length) {
            System.arraycopy(zArr, i, zArr, i3, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.c, 0, zArr2, 0, i);
            System.arraycopy(this.c, i, zArr2, i3, this.a - i);
            this.c = zArr2;
        }
        this.c[i] = zBooleanValue;
        this.a++;
        this.modCount++;
    }

    @Override // defpackage.axph, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        axqj.a(collection);
        if (!(collection instanceof axpj)) {
            return super.addAll(collection);
        }
        axpj axpjVar = (axpj) collection;
        int i = axpjVar.a;
        if (i == 0) {
            return false;
        }
        int i2 = this.a;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArrCopyOf = this.c;
        if (i3 > zArrCopyOf.length) {
            zArrCopyOf = Arrays.copyOf(zArrCopyOf, i3);
            this.c = zArrCopyOf;
        }
        System.arraycopy(axpjVar.c, 0, zArrCopyOf, this.a, axpjVar.a);
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
            return new axpj(i == 0 ? b : Arrays.copyOf(this.c, i), this.a, true);
        }
        throw new IllegalArgumentException();
    }

    public final void e(boolean z) {
        a();
        int i = this.a;
        boolean[] zArr = this.c;
        int length = zArr.length;
        if (i == length) {
            zArr = new boolean[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.c, 0, zArr, 0, this.a);
            this.c = zArr;
        }
        int i2 = this.a;
        this.a = i2 + 1;
        zArr[i2] = z;
    }

    @Override // defpackage.axph, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axpj)) {
            return super.equals(obj);
        }
        axpj axpjVar = (axpj) obj;
        if (this.a == axpjVar.a) {
            boolean[] zArr = axpjVar.c;
            for (int i = 0; i < this.a; i++) {
                if (this.c[i] == zArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f(int i) {
        h(i);
        return this.c[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Boolean.valueOf(f(i));
    }

    @Override // defpackage.axph, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iAj = 1;
        for (int i = 0; i < this.a; i++) {
            boolean z = this.c[i];
            byte[] bArr = axqj.a;
            iAj = (iAj * 31) + a.aj(z);
        }
        return iAj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.axph, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        h(i);
        boolean[] zArr = this.c;
        boolean z = zArr[i];
        int i2 = this.a;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.a--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.c;
        System.arraycopy(zArr, i2, zArr, i, this.a - i2);
        this.a -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.axph, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        h(i);
        boolean[] zArr = this.c;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a;
    }

    private axpj(boolean[] zArr, int i, boolean z) {
        super(z);
        this.c = zArr;
        this.a = i;
    }

    @Override // defpackage.axph, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Boolean) obj).booleanValue());
        return true;
    }
}
