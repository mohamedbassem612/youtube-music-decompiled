package defpackage;

import androidx.car.app.model.Alert;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lws extends lwo implements RandomAccess, lxv, lyv {
    public static final lws a;
    private static final boolean[] c;
    public int b;
    private boolean[] d;

    static {
        boolean[] zArr = new boolean[0];
        c = zArr;
        a = new lws(zArr, 0, false);
    }

    lws() {
        this(c, 0, true);
    }

    private final String h(int i) {
        return "Index:" + i + ", Size:" + this.b;
    }

    private final void i(int i) {
        if (i < 0 || i >= this.b) {
            throw new IndexOutOfBoundsException(h(i));
        }
    }

    @Override // defpackage.lwo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        hZ();
        if (i < 0 || i > (i2 = this.b)) {
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
            System.arraycopy(this.d, i, zArr2, i3, this.b - i);
            this.d = zArr2;
        }
        this.d[i] = zBooleanValue;
        this.b++;
        this.modCount++;
    }

    @Override // defpackage.lwo, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        hZ();
        lyf.a(collection);
        if (!(collection instanceof lws)) {
            return super.addAll(collection);
        }
        lws lwsVar = (lws) collection;
        int i = lwsVar.b;
        if (i == 0) {
            return false;
        }
        int i2 = this.b;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArrCopyOf = this.d;
        if (i3 > zArrCopyOf.length) {
            zArrCopyOf = Arrays.copyOf(zArrCopyOf, i3);
            this.d = zArrCopyOf;
        }
        System.arraycopy(lwsVar.d, 0, zArrCopyOf, this.b, lwsVar.b);
        this.b = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.lye
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final lxv e(int i) {
        if (i >= this.b) {
            return new lws(i == 0 ? c : Arrays.copyOf(this.d, i), this.b, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.lwo, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lws)) {
            return super.equals(obj);
        }
        lws lwsVar = (lws) obj;
        if (this.b == lwsVar.b) {
            boolean[] zArr = lwsVar.d;
            for (int i = 0; i < this.b; i++) {
                if (this.d[i] == zArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.lxv
    public final void f(boolean z) {
        hZ();
        int i = this.b;
        boolean[] zArr = this.d;
        int length = zArr.length;
        if (i == length) {
            zArr = new boolean[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.d, 0, zArr, 0, this.b);
            this.d = zArr;
        }
        int i2 = this.b;
        this.b = i2 + 1;
        zArr[i2] = z;
    }

    @Override // defpackage.lxv
    public final boolean g(int i) {
        i(i);
        return this.d[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Boolean.valueOf(g(i));
    }

    @Override // defpackage.lwo, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iAj = 1;
        for (int i = 0; i < this.b; i++) {
            boolean z = this.d[i];
            byte[] bArr = lyf.a;
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
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.d[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.lwo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        hZ();
        i(i);
        boolean[] zArr = this.d;
        boolean z = zArr[i];
        int i2 = this.b;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.b--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        hZ();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.d;
        System.arraycopy(zArr, i2, zArr, i, this.b - i2);
        this.b -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.lwo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        hZ();
        i(i);
        boolean[] zArr = this.d;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    private lws(boolean[] zArr, int i, boolean z) {
        super(z);
        this.d = zArr;
        this.b = i;
    }

    @Override // defpackage.lwo, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Boolean) obj).booleanValue());
        return true;
    }
}
