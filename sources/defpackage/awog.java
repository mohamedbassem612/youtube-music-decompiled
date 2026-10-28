package defpackage;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awog implements Map, Serializable, awrp {
    public static final awog a;
    public Object[] b;
    public Object[] c;
    public int[] d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    private int[] i;
    private int j;
    private int k;
    private awoi l;
    private awoh m;
    private awnh n;

    static {
        awog awogVar = new awog(0);
        awogVar.h = true;
        a = awogVar;
    }

    public awog(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int[] iArr2 = new int[atqq.i(i)];
        this.b = objArr;
        this.c = null;
        this.d = iArr;
        this.i = iArr2;
        this.j = 2;
        this.e = 0;
        this.k = Integer.numberOfLeadingZeros(l()) + 1;
    }

    private final int l() {
        return this.i.length;
    }

    private final int m(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.k;
    }

    private final void n(boolean z) {
        int i;
        Object[] objArr = this.c;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.e;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.d;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                int i5 = i3 + 1;
                Object[] objArr2 = this.b;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.i[i4] = i5;
                }
                i3 = i5;
            }
            i2++;
        }
        atqq.m(this.b, i3, i);
        if (objArr != null) {
            atqq.m(objArr, i3, this.e);
        }
        this.e = i3;
    }

    private final void o(int i) {
        Object[] objArrCopyOf;
        int iD = d();
        int i2 = this.e;
        int i3 = iD - i2;
        int i4 = i2 - this.g;
        if (i3 < i && i3 + i4 >= i && i4 >= (d() >> 2)) {
            n(true);
            return;
        }
        int i5 = this.e + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > d()) {
            int iH = atqp.h(d(), i5);
            Object[] objArr = this.b;
            objArr.getClass();
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, iH);
            objArrCopyOf2.getClass();
            this.b = objArrCopyOf2;
            Object[] objArr2 = this.c;
            if (objArr2 != null) {
                objArrCopyOf = Arrays.copyOf(objArr2, iH);
                objArrCopyOf.getClass();
            } else {
                objArrCopyOf = null;
            }
            this.c = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.d, iH);
            iArrCopyOf.getClass();
            this.d = iArrCopyOf;
            int i6 = atqq.i(iH);
            if (i6 > l()) {
                q(i6);
            }
        }
    }

    private final void p() {
        this.f++;
    }

    private final void q(int i) {
        int[] iArr;
        p();
        int i2 = 0;
        if (this.e > this.g) {
            n(false);
        }
        this.i = new int[i];
        this.k = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.e) {
            int i3 = i2 + 1;
            int iM = m(this.b[i2]);
            int i4 = this.j;
            while (true) {
                iArr = this.i;
                if (iArr[iM] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                iM = iM == 0 ? l() - 1 : iM - 1;
            }
            iArr[iM] = i3;
            this.d[i2] = iM;
            i2 = i3;
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.h) {
            return new awok(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int a(Object obj) {
        f();
        while (true) {
            int iM = m(obj);
            int i = this.j << 1;
            int iL = l() >> 1;
            int i2 = 0;
            while (true) {
                int i3 = this.i[iM];
                if (i3 == 0) {
                    if (this.e >= d()) {
                        o(1);
                        break;
                    }
                    int i4 = this.e;
                    int i5 = i4 + 1;
                    this.e = i5;
                    this.b[i4] = obj;
                    this.d[i4] = iM;
                    this.i[iM] = i5;
                    this.g++;
                    p();
                    if (i2 <= this.j) {
                        return i4;
                    }
                    this.j = i2;
                    return i4;
                }
                if (awrc.c(this.b[i3 - 1], obj)) {
                    return -i3;
                }
                i2++;
                if (i2 > (i > iL ? iL : i)) {
                    q(l() << 1);
                    break;
                }
                iM = iM == 0 ? l() - 1 : iM - 1;
            }
        }
    }

    public final int b(Object obj) {
        int iM = m(obj);
        int i = this.j;
        while (true) {
            int i2 = this.i[iM];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (awrc.c(this.b[i3], obj)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iM = iM == 0 ? l() - 1 : iM - 1;
        }
    }

    public final int c(Object obj) {
        int i = this.e;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.d[i] >= 0) {
                Object[] objArr = this.c;
                objArr.getClass();
                if (awrc.c(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        f();
        int i = this.e - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.d;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.i[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        atqq.m(this.b, 0, this.e);
        Object[] objArr = this.c;
        if (objArr != null) {
            atqq.m(objArr, 0, this.e);
        }
        this.g = 0;
        this.e = 0;
        p();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return b(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return c(obj) >= 0;
    }

    public final int d() {
        return this.b.length;
    }

    public final Map e() {
        f();
        this.h = true;
        if (this.g > 0) {
            return this;
        }
        awog awogVar = a;
        awogVar.getClass();
        return awogVar;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        awoh awohVar = this.m;
        if (awohVar != null) {
            return awohVar;
        }
        awoh awohVar2 = new awoh(this);
        this.m = awohVar2;
        return awohVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.g == map.size() && h(map.entrySet())) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (this.h) {
            throw new UnsupportedOperationException();
        }
    }

    public final void g(int i) {
        int i2;
        int i3;
        atqq.l(this.b, i);
        Object[] objArr = this.c;
        if (objArr != null) {
            atqq.l(objArr, i);
        }
        int iL = this.d[i];
        loop0: while (true) {
            int i4 = iL;
            int i5 = 0;
            do {
                iL = iL == 0 ? l() - 1 : iL - 1;
                int[] iArr = this.i;
                i2 = iArr[iL];
                i5++;
                if (i5 > this.j) {
                    iArr[i4] = 0;
                    break loop0;
                } else {
                    if (i2 == 0) {
                        iArr[i4] = 0;
                        break loop0;
                    }
                    i3 = i2 - 1;
                }
            } while (((m(this.b[i3]) - iL) & (l() - 1)) < i5);
            this.i[i4] = i2;
            this.d[i3] = i4;
        }
        this.d[i] = -1;
        this.g--;
        p();
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iB = b(obj);
        if (iB < 0) {
            return null;
        }
        Object[] objArr = this.c;
        objArr.getClass();
        return objArr[iB];
    }

    public final boolean h(Collection collection) {
        collection.getClass();
        for (Object obj : collection) {
            if (obj == null) {
                return false;
            }
            try {
                if (!i((Map.Entry) obj)) {
                    return false;
                }
            } catch (ClassCastException unused) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final int hashCode() {
        awob awobVar = new awob(this);
        int i = 0;
        while (awobVar.hasNext()) {
            int i2 = awobVar.b;
            awog awogVar = awobVar.a;
            if (i2 >= awogVar.e) {
                throw new NoSuchElementException();
            }
            awobVar.b = i2 + 1;
            awobVar.c = i2;
            Object obj = awogVar.b[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = awogVar.c;
            objArr.getClass();
            Object obj2 = objArr[awobVar.c];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            awobVar.b();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final boolean i(Map.Entry entry) {
        int iB = b(entry.getKey());
        if (iB < 0) {
            return false;
        }
        Object[] objArr = this.c;
        objArr.getClass();
        return awrc.c(objArr[iB], entry.getValue());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.g == 0;
    }

    public final boolean j(Object obj) {
        f();
        int iB = b(obj);
        if (iB < 0) {
            return false;
        }
        g(iB);
        return true;
    }

    public final Object[] k() {
        Object[] objArr = this.c;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArr2 = new Object[d()];
        this.c = objArr2;
        return objArr2;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        awoi awoiVar = this.l;
        if (awoiVar != null) {
            return awoiVar;
        }
        awoi awoiVar2 = new awoi(this);
        this.l = awoiVar2;
        return awoiVar2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        f();
        int iA = a(obj);
        Object[] objArrK = k();
        if (iA >= 0) {
            objArrK[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArrK[i];
        objArrK[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        f();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        o(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArrK = k();
            if (iA >= 0) {
                objArrK[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!awrc.c(entry.getValue(), objArrK[i])) {
                    objArrK[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        f();
        int iB = b(obj);
        if (iB < 0) {
            return null;
        }
        Object[] objArr = this.c;
        objArr.getClass();
        Object obj2 = objArr[iB];
        g(iB);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.g * 3) + 2);
        sb.append('{');
        awob awobVar = new awob(this);
        int i = 0;
        while (awobVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = awobVar.b;
            awog awogVar = awobVar.a;
            if (i2 >= awogVar.e) {
                throw new NoSuchElementException();
            }
            awobVar.b = i2 + 1;
            awobVar.c = i2;
            Object obj = awogVar.b[i2];
            if (obj == awogVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = awogVar.c;
            objArr.getClass();
            Object obj2 = objArr[awobVar.c];
            if (obj2 == awogVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            awobVar.b();
            i++;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        awnh awnhVar = this.n;
        if (awnhVar != null) {
            return awnhVar;
        }
        awnh awnhVar2 = new awnh(this);
        this.n = awnhVar2;
        return awnhVar2;
    }

    public awog() {
        throw null;
    }
}
