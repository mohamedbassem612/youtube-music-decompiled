package defpackage;

import androidx.car.app.model.Alert;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aiga extends aifu implements RandomAccess, aihp, aiiy {
    public static final boolean[] a;
    public static final aiga b;
    public int c;
    private boolean[] d;

    static {
        boolean[] zArr = new boolean[0];
        a = zArr;
        b = new aiga(zArr, 0, false);
    }

    aiga() {
        this(a, 0, true);
    }

    private final String h(int i) {
        return "Index:" + i + ", Size:" + this.c;
    }

    private final void i(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(h(i));
        }
    }

    @Override // defpackage.aifu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        kh();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(h(i));
        }
        int i3 = i + 1;
        boolean[] zArr = this.d;
        int length = zArr.length;
        if (i2 < length) {
            System.arraycopy(zArr, i, zArr, i3, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.d, 0, zArr2, 0, i);
            System.arraycopy(this.d, i, zArr2, i3, this.c - i);
            this.d = zArr2;
        }
        this.d[i] = zBooleanValue;
        this.c++;
        this.modCount++;
    }

    @Override // defpackage.aifu, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        kh();
        collection.getClass();
        if (!(collection instanceof aiga)) {
            return super.addAll(collection);
        }
        aiga aigaVar = (aiga) collection;
        int i = aigaVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i + i2;
        boolean[] zArrCopyOf = this.d;
        int length = zArrCopyOf.length;
        if (i3 > length) {
            if (i2 == 0) {
                zArrCopyOf = new boolean[i3];
                this.d = zArrCopyOf;
            } else {
                zArrCopyOf = Arrays.copyOf(zArrCopyOf, Math.max(i3, Math.max(((length * 3) / 2) + 1, 10)));
                this.d = zArrCopyOf;
            }
        }
        System.arraycopy(aigaVar.d, 0, zArrCopyOf, this.c, aigaVar.c);
        this.c = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.aiie
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final aihp e(int i) {
        if (i >= this.c) {
            return new aiga(i == 0 ? a : Arrays.copyOf(this.d, i), this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.aifu, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aiga)) {
            return super.equals(obj);
        }
        aiga aigaVar = (aiga) obj;
        if (this.c == aigaVar.c) {
            boolean[] zArr = aigaVar.d;
            for (int i = 0; i < this.c; i++) {
                if (this.d[i] == zArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f(boolean z) {
        kh();
        int i = this.c;
        boolean[] zArr = this.d;
        int length = zArr.length;
        if (i == length) {
            zArr = new boolean[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.d, 0, zArr, 0, this.c);
            this.d = zArr;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        zArr[i2] = z;
    }

    @Override // defpackage.aihp
    public final boolean g(int i) {
        i(i);
        return this.d[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Boolean.valueOf(g(i));
    }

    @Override // defpackage.aifu, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iAj = 1;
        for (int i = 0; i < this.c; i++) {
            boolean z = this.d[i];
            byte[] bArr = aiif.a;
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
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.d[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.aifu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        kh();
        i(i);
        boolean[] zArr = this.d;
        boolean z = zArr[i];
        int i2 = this.c;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        kh();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.d;
        System.arraycopy(zArr, i2, zArr, i, this.c - i2);
        this.c -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.aifu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        kh();
        i(i);
        boolean[] zArr = this.d;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    public aiga(boolean[] zArr, int i, boolean z) {
        super(z);
        this.d = zArr;
        this.c = i;
    }

    @Override // defpackage.aifu, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Boolean) obj).booleanValue());
        return true;
    }
}
