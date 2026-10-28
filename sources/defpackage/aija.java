package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aija extends aifu implements RandomAccess, Serializable {
    public static final Object[] a;
    public static final aija b;
    private static final long serialVersionUID = 1;
    private Object[] c;
    private int d;

    static {
        Object[] objArr = new Object[0];
        a = objArr;
        b = new aija(objArr, 0, false);
    }

    aija() {
        this(a, 0, true);
    }

    private final String f(int i) {
        return "Index:" + i + ", Size:" + this.d;
    }

    private final void g(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(f(i));
        }
    }

    private Object writeReplace() {
        ArrayList arrayList = new ArrayList(this.d);
        for (int i = 0; i < this.d; i++) {
            arrayList.add(this.c[i]);
        }
        return arrayList;
    }

    @Override // defpackage.aifu, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        kh();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(f(i));
        }
        int i3 = i + 1;
        Object[] objArr = this.c;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[((length * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.c, i, objArr2, i3, this.d - i);
            this.c = objArr2;
        }
        this.c[i] = obj;
        this.d++;
        this.modCount++;
    }

    final void d(int i) {
        int length = this.c.length;
        if (i > length) {
            if (length == 0) {
                this.c = new Object[Math.max(i, 10)];
                return;
            }
            while (length < i) {
                length = ((length * 3) / 2) + 1;
            }
            this.c = Arrays.copyOf(this.c, length);
        }
    }

    @Override // defpackage.aiie
    public final /* bridge */ /* synthetic */ aiie e(int i) {
        if (i >= this.d) {
            return new aija(i == 0 ? a : Arrays.copyOf(this.c, i), this.d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.aifu, java.util.AbstractList, java.util.Collection, java.util.List
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
                if (!(obj instanceof aija)) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (this.c[i2].equals(list.get(i2))) {
                        }
                    }
                    return true;
                }
                aija aijaVar = (aija) obj;
                for (int i3 = 0; i3 < i; i3++) {
                    if (this.c[i3].equals(aijaVar.c[i3])) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        g(i);
        return this.c[i];
    }

    @Override // defpackage.aifu, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = this.d;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode = (iHashCode * 31) + this.c[i2].hashCode();
        }
        return iHashCode;
    }

    @Override // defpackage.aifu, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        kh();
        g(i);
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

    @Override // defpackage.aifu, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        kh();
        g(i);
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

    public aija(Object[] objArr, int i, boolean z) {
        super(z);
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.aifu, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        kh();
        int i = this.d;
        Object[] objArrCopyOf = this.c;
        int length = objArrCopyOf.length;
        if (i == length) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, ((length * 3) / 2) + 1);
            this.c = objArrCopyOf;
        }
        int i2 = this.d;
        this.d = i2 + 1;
        objArrCopyOf[i2] = obj;
        this.modCount++;
        return true;
    }
}
