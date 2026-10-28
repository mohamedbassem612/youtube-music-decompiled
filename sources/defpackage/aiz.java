package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aiz implements RandomAccess {
    public Object[] a;
    public int b = 0;
    private List c;

    public aiz(Object[] objArr) {
        this.a = objArr;
    }

    public final int a(Object obj) {
        Object[] objArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (awrc.c(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final Object b(int i) {
        Object[] objArr = this.a;
        Object obj = objArr[i];
        int i2 = this.b;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.b - 1;
        this.b = i4;
        objArr[i4] = null;
        return obj;
    }

    public final Object c(int i, Object obj) {
        Object[] objArr = this.a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final List d() {
        List list = this.c;
        if (list != null) {
            return list;
        }
        aiw aiwVar = new aiw(this);
        this.c = aiwVar;
        return aiwVar;
    }

    public final void e(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length << 1)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.a = objArr2;
    }

    public final boolean f(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.b + size;
        if (this.a.length < i3) {
            e(i3);
        }
        Object[] objArr = this.a;
        int i4 = this.b;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                atqq.M();
            }
            objArr[i2 + i] = obj;
            i2 = i5;
        }
        this.b += size;
        return true;
    }

    public final boolean g(Object obj) {
        int i = this.b - 1;
        if (i < 0) {
            return false;
        }
        for (int i2 = 0; !awrc.c(this.a[i2], obj); i2++) {
            if (i2 == i) {
                return false;
            }
        }
        return true;
    }

    public final boolean h(Object obj) {
        int iA = a(obj);
        if (iA < 0) {
            return false;
        }
        b(iA);
        return true;
    }

    public final void i(Object obj) {
        int i = this.b + 1;
        if (this.a.length < i) {
            e(i);
        }
        Object[] objArr = this.a;
        int i2 = this.b;
        objArr[i2] = obj;
        this.b = i2 + 1;
    }
}
