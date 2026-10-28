package defpackage;

import androidx.car.app.model.Alert;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class axqq extends axph implements RandomAccess, axqi {
    private static final long[] b;
    public int a;
    private long[] c;

    static {
        long[] jArr = new long[0];
        b = jArr;
        new axqq(jArr, 0, false);
    }

    axqq() {
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
        long jLongValue = ((Long) obj).longValue();
        a();
        if (i < 0 || i > (i2 = this.a)) {
            throw new IndexOutOfBoundsException(g(i));
        }
        int i3 = i + 1;
        long[] jArr = this.c;
        int length = jArr.length;
        if (i2 < length) {
            System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.c, 0, jArr2, 0, i);
            System.arraycopy(this.c, i, jArr2, i3, this.a - i);
            this.c = jArr2;
        }
        this.c[i] = jLongValue;
        this.a++;
        this.modCount++;
    }

    @Override // defpackage.axph, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        axqj.a(collection);
        if (!(collection instanceof axqq)) {
            return super.addAll(collection);
        }
        axqq axqqVar = (axqq) collection;
        int i = axqqVar.a;
        if (i == 0) {
            return false;
        }
        int i2 = this.a;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArrCopyOf = this.c;
        if (i3 > jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i3);
            this.c = jArrCopyOf;
        }
        System.arraycopy(axqqVar.c, 0, jArrCopyOf, this.a, axqqVar.a);
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
            return new axqq(i == 0 ? b : Arrays.copyOf(this.c, i), this.a, true);
        }
        throw new IllegalArgumentException();
    }

    public final long e(int i) {
        h(i);
        return this.c[i];
    }

    @Override // defpackage.axph, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axqq)) {
            return super.equals(obj);
        }
        axqq axqqVar = (axqq) obj;
        if (this.a == axqqVar.a) {
            long[] jArr = axqqVar.c;
            for (int i = 0; i < this.a; i++) {
                if (this.c[i] == jArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f(long j) {
        a();
        int i = this.a;
        long[] jArr = this.c;
        int length = jArr.length;
        if (i == length) {
            jArr = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.c, 0, jArr, 0, this.a);
            this.c = jArr;
        }
        int i2 = this.a;
        this.a = i2 + 1;
        jArr[i2] = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Long.valueOf(e(i));
    }

    @Override // defpackage.axph, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iAk = 1;
        for (int i = 0; i < this.a; i++) {
            long j = this.c[i];
            byte[] bArr = axqj.a;
            iAk = (iAk * 31) + a.ak(j);
        }
        return iAk;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.axph, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        h(i);
        long[] jArr = this.c;
        long j = jArr[i];
        int i2 = this.a;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.a--;
        this.modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.c;
        System.arraycopy(jArr, i2, jArr, i, this.a - i2);
        this.a -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.axph, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        a();
        h(i);
        long[] jArr = this.c;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a;
    }

    private axqq(long[] jArr, int i, boolean z) {
        super(z);
        this.c = jArr;
        this.a = i;
    }

    @Override // defpackage.axph, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Long) obj).longValue());
        return true;
    }
}
