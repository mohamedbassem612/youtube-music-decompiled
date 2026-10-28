package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Objects;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agih extends AbstractSet implements Serializable {
    private static final long serialVersionUID = -6187423658046915740L;
    transient Object[] a;
    public transient int b;
    private transient Object c;
    private transient int[] d;
    private transient int e;

    agih() {
        f(3);
    }

    private final int h() {
        return (1 << (this.b & 31)) - 1;
    }

    private final int i(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object objAb = aguu.ab(i2);
        if (i4 != 0) {
            aguu.ad(objAb, i3 & i5, i4 + 1);
        }
        Object objJ = j();
        int[] iArrL = l();
        for (int i6 = 0; i6 <= i; i6++) {
            int iAa = aguu.aa(objJ, i6);
            while (iAa != 0) {
                int i7 = iAa - 1;
                int i8 = iArrL[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iAa2 = aguu.aa(objAb, i10);
                aguu.ad(objAb, i10, iAa);
                iArrL[i7] = (i9 & (~i5)) | (iAa2 & i5);
                iAa = i8 & i;
            }
        }
        this.c = objAb;
        k(i5);
        return i5;
    }

    private final Object j() {
        Object obj = this.c;
        obj.getClass();
        return obj;
    }

    private final void k(int i) {
        this.b = (this.b & (-32)) | ((32 - Integer.numberOfLeadingZeros(i)) & 31);
    }

    private final int[] l() {
        int[] iArr = this.d;
        iArr.getClass();
        return iArr;
    }

    private final Object[] m() {
        Object[] objArr = this.a;
        objArr.getClass();
        return objArr;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(a.bR(i, "Invalid size: "));
        }
        f(Math.min(i, SemanticState.Hidden));
        for (int i2 = 0; i2 < i; i2++) {
            add(objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    final int a() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int iMin;
        if (g()) {
            ahno.P(g(), "Arrays already allocated");
            int i = this.b;
            int iMax = Math.max(4, aguu.Y(i + 1));
            this.c = aguu.ab(iMax);
            k(iMax - 1);
            this.d = new int[i];
            this.a = new Object[i];
        }
        Set setD = d();
        if (setD != null) {
            return setD.add(obj);
        }
        int[] iArrL = l();
        Object[] objArrM = m();
        int i2 = this.e;
        int i3 = i2 + 1;
        int iX = aguu.X(obj);
        int iH = h();
        int i4 = iX & iH;
        int iAa = aguu.aa(j(), i4);
        if (iAa != 0) {
            int i5 = ~iH;
            int i6 = iX & i5;
            int i7 = 0;
            while (true) {
                int i8 = iAa - 1;
                int i9 = iArrL[i8];
                int i10 = i9 & i5;
                if (i10 == i6 && Objects.equals(obj, objArrM[i8])) {
                    return false;
                }
                int i11 = i9 & iH;
                int i12 = i7 + 1;
                if (i11 == 0) {
                    if (i12 < 9) {
                        if (i3 <= iH) {
                            iArrL[i8] = i10 | (i3 & iH);
                            break;
                        }
                        iH = i(iH, (iH < 32 ? 4 : 2) * (iH + 1), iX, i2);
                        break;
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet(h() + 1, 1.0f);
                    int iA = a();
                    while (iA >= 0) {
                        linkedHashSet.add(c(iA));
                        iA = b(iA);
                    }
                    this.c = linkedHashSet;
                    this.d = null;
                    this.a = null;
                    e();
                    return linkedHashSet.add(obj);
                }
                iAa = i11;
                i7 = i12;
            }
        } else if (i3 > iH) {
            iH = i(iH, (iH >= 32 ? 2 : 4) * (iH + 1), iX, i2);
        } else {
            aguu.ad(j(), i4, i3);
        }
        int length = l().length;
        if (i3 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.d = Arrays.copyOf(l(), iMin);
            this.a = Arrays.copyOf(m(), iMin);
        }
        l()[i2] = iX & (~iH);
        m()[i2] = obj;
        this.e = i3;
        e();
        return true;
    }

    final int b(int i) {
        int i2 = i + 1;
        if (i2 >= this.e) {
            return -1;
        }
        return i2;
    }

    public final Object c(int i) {
        return m()[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (g()) {
            return;
        }
        e();
        Set setD = d();
        if (setD != null) {
            this.b = ahng.L(size(), 3, 1073741823);
            setD.clear();
            this.c = null;
            this.e = 0;
            return;
        }
        Arrays.fill(m(), 0, this.e, (Object) null);
        aguu.ac(j());
        Arrays.fill(l(), 0, this.e, 0);
        this.e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (g()) {
            return false;
        }
        Set setD = d();
        if (setD != null) {
            return setD.contains(obj);
        }
        int iX = aguu.X(obj);
        int iH = h();
        int iAa = aguu.aa(j(), iX & iH);
        if (iAa == 0) {
            return false;
        }
        int i = ~iH;
        int i2 = iX & i;
        do {
            int i3 = iAa - 1;
            int i4 = l()[i3];
            if ((i4 & i) == i2 && Objects.equals(obj, c(i3))) {
                return true;
            }
            iAa = i4 & iH;
        } while (iAa != 0);
        return false;
    }

    final Set d() {
        Object obj = this.c;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    final void e() {
        this.b += 32;
    }

    final void f(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Expected size must be >= 0");
        }
        this.b = ahng.L(i, 1, 1073741823);
    }

    final boolean g() {
        return this.c == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Set setD = d();
        return setD != null ? setD.iterator() : new agig(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        int i2;
        if (g()) {
            return false;
        }
        Set setD = d();
        if (setD != null) {
            return setD.remove(obj);
        }
        int iH = h();
        int iZ = aguu.Z(obj, null, iH, j(), l(), m(), null);
        if (iZ == -1) {
            return false;
        }
        Object objJ = j();
        int[] iArrL = l();
        Object[] objArrM = m();
        int size = size();
        int i3 = size - 1;
        if (iZ < i3) {
            int i4 = iZ + 1;
            Object obj2 = objArrM[i3];
            objArrM[iZ] = obj2;
            objArrM[i3] = null;
            iArrL[iZ] = iArrL[i3];
            iArrL[i3] = 0;
            int iX = aguu.X(obj2) & iH;
            int iAa = aguu.aa(objJ, iX);
            if (iAa == size) {
                aguu.ad(objJ, iX, i4);
            } else {
                while (true) {
                    i = iAa - 1;
                    i2 = iArrL[i];
                    int i5 = i2 & iH;
                    if (i5 == size) {
                        break;
                    }
                    iAa = i5;
                }
                iArrL[i] = (i2 & (~iH)) | (i4 & iH);
            }
        } else {
            objArrM[iZ] = null;
            iArrL[iZ] = 0;
        }
        this.e--;
        e();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set setD = d();
        return setD != null ? setD.size() : this.e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (g()) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        Set setD = d();
        if (setD != null) {
            return setD.toArray(objArr);
        }
        Object[] objArrM = m();
        int i = this.e;
        ahno.N(0, i, objArrM.length);
        int length = objArr.length;
        if (length < i) {
            objArr = aguu.h(objArr, i);
        } else if (length > i) {
            objArr[i] = null;
        }
        System.arraycopy(objArrM, 0, objArr, 0, i);
        return objArr;
    }

    public agih(int i) {
        f(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        if (g()) {
            return new Object[0];
        }
        Set setD = d();
        return setD != null ? setD.toArray() : Arrays.copyOf(m(), this.e);
    }
}
