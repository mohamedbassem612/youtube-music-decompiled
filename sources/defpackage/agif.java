package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Objects;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agif implements Map, Serializable {
    public static final Object a = new Object();
    private static final long serialVersionUID = -1932773068922399442L;
    transient int[] b;
    transient Object[] c;
    transient Object[] d;
    public transient int e;
    public transient int f;
    private transient Object g;

    public agif() {
        l(3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(a.bR(i, "Invalid size: "));
        }
        l(Math.min(i, SemanticState.Hidden));
        for (int i2 = 0; i2 < i; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private final int s(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object objAb = aguu.ab(i2);
        if (i4 != 0) {
            aguu.ad(objAb, i3 & i5, i4 + 1);
        }
        Object objG = g();
        int[] iArrP = p();
        for (int i6 = 0; i6 <= i; i6++) {
            int iAa = aguu.aa(objG, i6);
            while (iAa != 0) {
                int i7 = iAa - 1;
                int i8 = iArrP[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iAa2 = aguu.aa(objAb, i10);
                aguu.ad(objAb, i10, iAa);
                iArrP[i7] = (i9 & (~i5)) | (iAa2 & i5);
                iAa = i8 & i;
            }
        }
        this.g = objAb;
        t(i5);
        return i5;
    }

    private final void t(int i) {
        this.e = (this.e & (-32)) | ((32 - Integer.numberOfLeadingZeros(i)) & 31);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator itI = i();
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    final int a() {
        return isEmpty() ? -1 : 0;
    }

    final int b(int i) {
        int i2 = i + 1;
        if (i2 >= this.f) {
            return -1;
        }
        return i2;
    }

    public final int c() {
        return (1 << (this.e & 31)) - 1;
    }

    @Override // java.util.Map
    public final void clear() {
        if (o()) {
            return;
        }
        k();
        Map mapJ = j();
        if (mapJ != null) {
            this.e = ahng.L(size(), 3, 1073741823);
            mapJ.clear();
            this.g = null;
            this.f = 0;
            return;
        }
        Arrays.fill(q(), 0, this.f, (Object) null);
        Arrays.fill(r(), 0, this.f, (Object) null);
        aguu.ac(g());
        Arrays.fill(p(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapJ = j();
        if (mapJ != null) {
            return mapJ.containsKey(obj);
        }
        return d(obj) != -1;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapJ = j();
        if (mapJ != null) {
            return mapJ.containsValue(obj);
        }
        for (int i = 0; i < this.f; i++) {
            if (Objects.equals(obj, h(i))) {
                return true;
            }
        }
        return false;
    }

    public final int d(Object obj) {
        if (o()) {
            return -1;
        }
        int iX = aguu.X(obj);
        int iC = c();
        int iAa = aguu.aa(g(), iX & iC);
        if (iAa == 0) {
            return -1;
        }
        int i = ~iC;
        int i2 = iX & i;
        do {
            int i3 = iAa - 1;
            int i4 = p()[i3];
            if ((i4 & i) == i2 && Objects.equals(obj, e(i3))) {
                return i3;
            }
            iAa = i4 & iC;
        } while (iAa != 0);
        return -1;
    }

    public final Object e(int i) {
        return q()[i];
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new agia(this);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return aguu.q(this, obj);
    }

    public final Object f(Object obj) {
        int iC;
        int iZ;
        if (o() || (iZ = aguu.Z(obj, null, (iC = c()), g(), p(), q(), null)) == -1) {
            return a;
        }
        Object objH = h(iZ);
        m(iZ, iC);
        this.f--;
        k();
        return objH;
    }

    public final Object g() {
        Object obj = this.g;
        obj.getClass();
        return obj;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        Map mapJ = j();
        if (mapJ != null) {
            return mapJ.get(obj);
        }
        int iD = d(obj);
        if (iD == -1) {
            return null;
        }
        return h(iD);
    }

    public final Object h(int i) {
        return r()[i];
    }

    @Override // java.util.Map
    public final int hashCode() {
        return new agia(this).hashCode();
    }

    final Iterator i() {
        Map mapJ = j();
        return mapJ != null ? mapJ.entrySet().iterator() : new aghy(this);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    final Map j() {
        Object obj = this.g;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    final void k() {
        this.e += 32;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new agic(this);
    }

    final void l(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Expected size must be >= 0");
        }
        this.e = ahng.L(i, 1, 1073741823);
    }

    final void m(int i, int i2) {
        Object objG = g();
        int[] iArrP = p();
        Object[] objArrQ = q();
        Object[] objArrR = r();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrQ[i] = null;
            objArrR[i] = null;
            iArrP[i] = 0;
            return;
        }
        int i4 = i + 1;
        Object obj = objArrQ[i3];
        objArrQ[i] = obj;
        objArrR[i] = objArrR[i3];
        objArrQ[i3] = null;
        objArrR[i3] = null;
        iArrP[i] = iArrP[i3];
        iArrP[i3] = 0;
        int iX = aguu.X(obj) & i2;
        int iAa = aguu.aa(objG, iX);
        if (iAa == size) {
            aguu.ad(objG, iX, i4);
            return;
        }
        while (true) {
            int i5 = iAa - 1;
            int i6 = iArrP[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                iArrP[i5] = (i6 & (~i2)) | (i4 & i2);
                return;
            }
            iAa = i7;
        }
    }

    public final void n(int i, Object obj) {
        r()[i] = obj;
    }

    final boolean o() {
        return this.g == null;
    }

    public final int[] p() {
        int[] iArr = this.b;
        iArr.getClass();
        return iArr;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        Object obj3;
        if (o()) {
            ahno.P(o(), "Arrays already allocated");
            int i2 = this.e;
            int iMax = Math.max(4, aguu.Y(i2 + 1));
            this.g = aguu.ab(iMax);
            t(iMax - 1);
            this.b = new int[i2];
            this.c = new Object[i2];
            this.d = new Object[i2];
        }
        Map mapJ = j();
        if (mapJ != null) {
            return mapJ.put(obj, obj2);
        }
        int[] iArrP = p();
        Object[] objArrQ = q();
        Object[] objArrR = r();
        int i3 = this.f;
        int i4 = i3 + 1;
        int iX = aguu.X(obj);
        int iC = c();
        int i5 = iX & iC;
        int iAa = aguu.aa(g(), i5);
        if (iAa == 0) {
            if (i4 > iC) {
                iC = s(iC, (iC < 32 ? 4 : 2) * (iC + 1), iX, i3);
            } else {
                aguu.ad(g(), i5, i4);
            }
            obj3 = null;
            i = 1;
        } else {
            int i6 = ~iC;
            int i7 = iX & i6;
            int i8 = 0;
            while (true) {
                int i9 = iAa - 1;
                int i10 = iArrP[i9];
                i = 1;
                int i11 = i10 & i6;
                if (i11 == i7 && Objects.equals(obj, objArrQ[i9])) {
                    Object obj4 = objArrR[i9];
                    objArrR[i9] = obj2;
                    return obj4;
                }
                int i12 = i10 & iC;
                int i13 = i8 + 1;
                if (i12 == 0) {
                    if (i13 < 9) {
                        obj3 = null;
                        if (i4 <= iC) {
                            iArrP[i9] = i11 | (i4 & iC);
                            break;
                        }
                        iC = s(iC, (iC < 32 ? 4 : 2) * (iC + 1), iX, i3);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(c() + 1, 1.0f);
                    int iA = a();
                    while (iA >= 0) {
                        linkedHashMap.put(e(iA), h(iA));
                        iA = b(iA);
                    }
                    this.g = linkedHashMap;
                    this.b = null;
                    this.c = null;
                    this.d = null;
                    k();
                    return linkedHashMap.put(obj, obj2);
                }
                iAa = i12;
                i8 = i13;
            }
        }
        int length = p().length;
        if (i4 > length) {
            int i14 = i;
            int iMin = Math.min(1073741823, (Math.max(i14, length >>> 1) + length) | i14);
            if (iMin != length) {
                this.b = Arrays.copyOf(p(), iMin);
                this.c = Arrays.copyOf(q(), iMin);
                this.d = Arrays.copyOf(r(), iMin);
            }
        }
        p()[i3] = iX & (~iC);
        q()[i3] = obj;
        n(i3, obj2);
        this.f = i4;
        k();
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final Object[] q() {
        Object[] objArr = this.c;
        objArr.getClass();
        return objArr;
    }

    public final Object[] r() {
        Object[] objArr = this.d;
        objArr.getClass();
        return objArr;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        Map mapJ = j();
        if (mapJ != null) {
            return mapJ.remove(obj);
        }
        Object objF = f(obj);
        if (objF == a) {
            return null;
        }
        return objF;
    }

    @Override // java.util.Map
    public final int size() {
        Map mapJ = j();
        return mapJ != null ? mapJ.size() : this.f;
    }

    public final String toString() {
        return aguu.n(this);
    }

    @Override // java.util.Map
    public final Collection values() {
        return new agie(this);
    }

    public agif(int i) {
        l(i);
    }
}
