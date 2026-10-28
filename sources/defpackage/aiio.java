package defpackage;

import androidx.car.app.model.Alert;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aiio extends aifu implements RandomAccess, aihy, aiiy {
    public static final aiio a;
    private static final long[] d;
    public long[] b;
    public int c;

    static {
        long[] jArr = new long[0];
        d = jArr;
        a = new aiio(jArr, 0, false);
    }

    public aiio() {
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

    @Override // defpackage.aihy
    public final long a(int i) {
        i(i);
        return this.b[i];
    }

    @Override // defpackage.aifu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        kh();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(h(i));
        }
        int i3 = i + 1;
        long[] jArr = this.b;
        int length = jArr.length;
        if (i2 < length) {
            System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.b, 0, jArr2, 0, i);
            System.arraycopy(this.b, i, jArr2, i3, this.c - i);
            this.b = jArr2;
        }
        this.b[i] = jLongValue;
        this.c++;
        this.modCount++;
    }

    @Override // defpackage.aifu, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        kh();
        collection.getClass();
        if (!(collection instanceof aiio)) {
            return super.addAll(collection);
        }
        aiio aiioVar = (aiio) collection;
        int i = aiioVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i + i2;
        long[] jArrCopyOf = this.b;
        int length = jArrCopyOf.length;
        if (i3 > length) {
            if (i2 == 0) {
                jArrCopyOf = new long[i3];
                this.b = jArrCopyOf;
            } else {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i3, Math.max(((length * 3) / 2) + 1, 10)));
                this.b = jArrCopyOf;
            }
        }
        System.arraycopy(aiioVar.b, 0, jArrCopyOf, this.c, aiioVar.c);
        this.c = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.aihy
    public final long d(int i, long j) {
        kh();
        i(i);
        long[] jArr = this.b;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    @Override // defpackage.aifu, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aiio)) {
            return super.equals(obj);
        }
        aiio aiioVar = (aiio) obj;
        if (this.c == aiioVar.c) {
            long[] jArr = aiioVar.b;
            for (int i = 0; i < this.c; i++) {
                if (this.b[i] == jArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.aiie
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final aihy e(int i) {
        if (i >= this.c) {
            return new aiio(i == 0 ? d : Arrays.copyOf(this.b, i), this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.aihy
    public final void g(long j) {
        kh();
        int i = this.c;
        long[] jArr = this.b;
        int length = jArr.length;
        if (i == length) {
            jArr = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.b, 0, jArr, 0, this.c);
            this.b = jArr;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        jArr[i2] = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Long.valueOf(a(i));
    }

    @Override // defpackage.aifu, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            long j = this.b[i2];
            byte[] bArr = aiif.a;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.aifu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        kh();
        i(i);
        long[] jArr = this.b;
        long j = jArr[i];
        int i2 = this.c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        kh();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.b;
        System.arraycopy(jArr, i2, jArr, i, this.c - i2);
        this.c -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.aifu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return Long.valueOf(d(i, ((Long) obj).longValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    private aiio(long[] jArr, int i, boolean z) {
        super(z);
        this.b = jArr;
        this.c = i;
    }

    @Override // defpackage.aifu, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Long) obj).longValue());
        return true;
    }
}
