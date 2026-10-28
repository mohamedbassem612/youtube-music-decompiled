package defpackage;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lzd extends AbstractMap {
    private volatile lzc d;
    public boolean c = false;
    public Object[] a = null;
    public int b = 0;
    private volatile boolean e = true;

    private final void e(int i) {
        int length;
        Object[] objArr = this.a;
        if (objArr == null || (length = objArr.length) == 0) {
            this.a = new Object[Math.max(16, i)];
            return;
        }
        if (i > length) {
            if (!this.e) {
                c();
                if (i <= this.a.length) {
                    return;
                }
            }
            Object[] objArr2 = this.a;
            int length2 = objArr2.length;
            int i2 = length2 + (length2 >> 1);
            if (i2 - i >= 0) {
                i = i2;
            }
            if ((-2147483639) + i > 0) {
                i = 2147483639;
            }
            this.a = Arrays.copyOf(objArr2, i);
        }
    }

    private final void f() {
        int i = this.b - 1;
        if (i < 0) {
            return;
        }
        Object obj = ((lzb) this.a[i >>> 1]).c;
        throw null;
    }

    public final Map.Entry a(int i) {
        c();
        if (i < this.b) {
            return (lzb) this.a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final void b() {
        if (this.c) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040 A[Catch: all -> 0x005a, TryCatch #0 {, blocks: (B:7:0x0009, B:9:0x000d, B:11:0x000f, B:13:0x0014, B:15:0x0016, B:16:0x001d, B:18:0x0021, B:20:0x0029, B:22:0x003b, B:24:0x0046, B:23:0x0040, B:26:0x004b, B:27:0x0054, B:28:0x0056), top: B:35:0x0009 }] */
    public final void c() {
        int i;
        if (this.c || this.e) {
            return;
        }
        synchronized (this) {
            if (this.e) {
                return;
            }
            int i2 = this.b;
            if (i2 <= 1) {
                return;
            }
            int i3 = 0;
            Arrays.sort(this.a, 0, i2);
            int i4 = 0;
            while (true) {
                i = this.b;
                if (i3 >= i) {
                    break;
                }
                Object[] objArr = this.a;
                lzb lzbVar = (lzb) objArr[i3];
                if (i4 > 0) {
                    int i5 = i4 - 1;
                    if (((lxs) ((lzb) objArr[i5]).c).equals(lzbVar.c)) {
                        this.a[i5] = lzbVar;
                    } else {
                        this.a[i4] = lzbVar;
                        i4++;
                    }
                } else {
                    this.a[i4] = lzbVar;
                    i4++;
                }
                i3++;
            }
            if (i4 < i) {
                this.b = i4;
                Object[] objArr2 = this.a;
                Arrays.fill(objArr2, i4, objArr2.length, (Object) null);
            }
            this.e = true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (this.b != 0) {
            this.a = null;
            this.b = 0;
            this.e = true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        c();
        f();
        return false;
    }

    public final void d(lxs lxsVar, Object obj) {
        b();
        lxsVar.getClass();
        boolean z = this.e;
        int i = this.b;
        if (i > 0) {
            Object obj2 = ((lzb) this.a[i - 1]).c;
            throw null;
        }
        e(i + 1);
        Object[] objArr = this.a;
        int i2 = this.b;
        this.b = i2 + 1;
        objArr[i2] = new lzb(this, lxsVar, obj, 0);
        this.e = z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        c();
        if (this.d == null) {
            this.d = new lzc(this);
        }
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzd)) {
            return super.equals(obj);
        }
        lzd lzdVar = (lzd) obj;
        int size = size();
        if (size == lzdVar.size()) {
            Object[] objArr = this.a;
            Object[] objArr2 = lzdVar.a;
            for (int i = 0; i < size; i++) {
                if (objArr[i].equals(objArr2[i])) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        c();
        f();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += this.a[i].hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        d((lxs) obj, obj2);
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        b();
        if (!(map instanceof lzd)) {
            e(this.b + map.size());
            for (Map.Entry entry : map.entrySet()) {
                d((lxs) entry.getKey(), entry.getValue());
            }
            return;
        }
        lzd lzdVar = (lzd) map;
        e(this.b + lzdVar.b);
        int i = this.b;
        int i2 = lzdVar.b + i;
        for (int i3 = i; i3 < i2; i3++) {
            lzb lzbVar = (lzb) lzdVar.a[i3 - i];
            d((lxs) lzbVar.c, lzbVar.a);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        c();
        f();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        c();
        return this.b;
    }
}
