package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class agkz extends agjw implements Set, j$.util.Set {
    private static final long serialVersionUID = 912559;
    private transient agke a;

    static int f(int i) {
        int iHighestOneBit;
        int iMax = Math.max(i, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit <<= 1;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        return iHighestOneBit;
    }

    public static agkx i(int i) {
        aguu.ag(i, "expectedSize");
        return new agkx(i);
    }

    public static agkz j(int i, Object... objArr) {
        if (i == 0) {
            return agpr.a;
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new agqj(obj);
        }
        int iF = f(i);
        Object[] objArr2 = new Object[iF];
        int i2 = iF - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            aguu.i(obj2, i5);
            int iHashCode = obj2.hashCode();
            int iW = aguu.W(iHashCode);
            while (true) {
                int i6 = iW & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iW++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new agqj(obj4);
        }
        if (f(i4) < iF / 2) {
            return j(i4, objArr);
        }
        if (v(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new agpr(objArr, i3, objArr2, i2, i4);
    }

    public static agkz n(Collection collection) {
        if ((collection instanceof agkz) && !(collection instanceof SortedSet)) {
            agkz agkzVar = (agkz) collection;
            if (!agkzVar.l()) {
                return agkzVar;
            }
        }
        Object[] array = collection.toArray();
        return j(array.length, array);
    }

    public static agkz o(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? j(length, (Object[]) objArr.clone()) : new agqj(objArr[0]);
        }
        return agpr.a;
    }

    public static agkz p() {
        return agpr.a;
    }

    public static agkz q(Object obj, Object obj2) {
        return j(2, obj, obj2);
    }

    public static agkz r(Object obj, Object obj2, Object obj3) {
        return j(3, obj, obj2, obj3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static agkz s(Object obj, Object obj2, Object obj3, Object obj4) {
        return j(4, obj, obj2, obj3, obj4);
    }

    public static agkz t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return j(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static agkz u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        int length = objArr.length;
        int i = length + 6;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return j(i, objArr2);
    }

    public static boolean v(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public boolean c() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof agkz) && c() && ((agkz) obj).c() && hashCode() != obj.hashCode()) {
            return false;
        }
        return ahng.al(this, obj);
    }

    @Override // defpackage.agjw
    public agke g() {
        agke agkeVar = this.a;
        if (agkeVar != null) {
            return agkeVar;
        }
        agke agkeVarH = h();
        this.a = agkeVarH;
        return agkeVarH;
    }

    public agke h() {
        return agke.h(toArray());
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return ahng.ab(this);
    }

    @Override // defpackage.agjw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public abstract agqr iterator();

    @Override // defpackage.agjw
    public Object writeReplace() {
        return new agky(toArray());
    }
}
