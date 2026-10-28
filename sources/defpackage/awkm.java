package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awkm {
    public int a;
    public int b;
    int c;
    public Object[] d;

    public awkm(int i) {
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
        this.a = iNumberOfLeadingZeros - 1;
        this.c = (int) (iNumberOfLeadingZeros * 0.75f);
        this.d = new Object[iNumberOfLeadingZeros];
    }

    public final void a(Object obj) {
        Object obj2;
        Object obj3;
        Object[] objArr = this.d;
        int i = this.a;
        int iHashCode = obj.hashCode() * (-1640531527);
        int i2 = (iHashCode ^ (iHashCode >>> 16)) & i;
        Object obj4 = objArr[i2];
        if (obj4 != null) {
            if (obj4.equals(obj)) {
                return;
            }
            do {
                i2 = (i2 + 1) & i;
                obj3 = objArr[i2];
                if (obj3 != null) {
                }
            } while (!obj3.equals(obj));
            return;
        }
        objArr[i2] = obj;
        int i3 = this.b + 1;
        this.b = i3;
        if (i3 < this.c) {
            return;
        }
        Object[] objArr2 = this.d;
        int length = objArr2.length;
        int i4 = length << 1;
        Object[] objArr3 = new Object[i4];
        while (true) {
            int i5 = i4 - 1;
            if (i3 == 0) {
                this.a = i5;
                this.c = (int) (i4 * 0.75f);
                this.d = objArr3;
                return;
            }
            do {
                length--;
                obj2 = objArr2[length];
            } while (obj2 == null);
            int iHashCode2 = obj2.hashCode() * (-1640531527);
            int i6 = (iHashCode2 ^ (iHashCode2 >>> 16)) & i5;
            if (objArr3[i6] != null) {
                do {
                    i6 = (i6 + 1) & i5;
                } while (objArr3[i6] != null);
            }
            objArr3[i6] = objArr2[length];
            i3--;
        }
    }

    public final void b(int i, Object[] objArr, int i2) {
        int i3;
        Object obj;
        this.b--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                obj = objArr[i3];
                if (obj != null) {
                    int iHashCode = obj.hashCode() * (-1640531527);
                    int i5 = (iHashCode ^ (iHashCode >>> 16)) & i2;
                    if (i > i3) {
                        if (i >= i5 && i5 > i3) {
                            break;
                        } else {
                            i4 = i3 + 1;
                        }
                    } else if (i >= i5 || i5 > i3) {
                        break;
                    } else {
                        i4 = i3 + 1;
                    }
                } else {
                    objArr[i] = null;
                    return;
                }
            }
            objArr[i] = obj;
            i = i3;
        }
    }
}
