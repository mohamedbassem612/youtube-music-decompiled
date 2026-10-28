package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axrc extends axph implements RandomAccess {
    public static final axrc a;
    private static final Object[] b;
    private Object[] c;
    private int d;

    static {
        Object[] objArr = new Object[0];
        b = objArr;
        a = new axrc(objArr, 0, false);
    }

    axrc() {
        this(b, 0, true);
    }

    private final String e(int i) {
        return "Index:" + i + ", Size:" + this.d;
    }

    private final void f(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(e(i));
        }
    }

    @Override // defpackage.axph, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        a();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(e(i));
        }
        int i3 = i + 1;
        Object[] objArr = this.c;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.c, 0, objArr2, 0, i);
            System.arraycopy(this.c, i, objArr2, i3, this.d - i);
            this.c = objArr2;
        }
        this.c[i] = obj;
        this.d++;
        this.modCount++;
    }

    @Override // defpackage.axqi
    public final /* bridge */ /* synthetic */ axqi d(int i) {
        if (i >= this.d) {
            return new axrc(i == 0 ? b : Arrays.copyOf(this.c, i), this.d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.axph, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (!(obj instanceof RandomAccess)) {
                return super.equals(obj);
            }
            List list = (List) obj;
            int i = this.d;
            if (i == list.size()) {
                if (!(obj instanceof axrc)) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (this.c[i2].equals(list.get(i2))) {
                        }
                    }
                    return true;
                }
                axrc axrcVar = (axrc) obj;
                for (int i3 = 0; i3 < i; i3++) {
                    if (this.c[i3].equals(axrcVar.c[i3])) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        f(i);
        return this.c[i];
    }

    @Override // defpackage.axph, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = this.d;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode = (iHashCode * 31) + this.c[i2].hashCode();
        }
        return iHashCode;
    }

    @Override // defpackage.axph, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        f(i);
        Object[] objArr = this.c;
        Object obj = objArr[i];
        int i2 = this.d;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return obj;
    }

    @Override // defpackage.axph, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        f(i);
        Object[] objArr = this.c;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    private axrc(Object[] objArr, int i, boolean z) {
        super(z);
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.axph, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i = this.d;
        Object[] objArrCopyOf = this.c;
        int length = objArrCopyOf.length;
        if (i == length) {
            objArrCopyOf = Arrays.copyOf(this.c, Math.max(((length * 3) / 2) + 1, 10));
            this.c = objArrCopyOf;
        }
        int i2 = this.d;
        this.d = i2 + 1;
        objArrCopyOf[i2] = obj;
        this.modCount++;
        return true;
    }
}
