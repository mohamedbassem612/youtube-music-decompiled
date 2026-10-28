package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agpn extends agkj {
    public static final agkj b = new agpn(null, new Object[0], 0);
    private static final long serialVersionUID = 0;
    final transient Object[] c;
    public final transient int d;
    private final transient Object e;

    private agpn(Object obj, Object[] objArr, int i) {
        this.e = obj;
        this.c = objArr;
        this.d = i;
    }

    public static agpn a(int i, Object[] objArr, agkh agkhVar) {
        if (i == 0) {
            return (agpn) b;
        }
        if (i == 1) {
            objArr[0].getClass();
            objArr[1].getClass();
            return new agpn(null, objArr, 1);
        }
        ahno.X(i, objArr.length >> 1);
        Object objE = e(objArr, i, agkz.f(i), 0);
        if (objE instanceof Object[]) {
            Object[] objArr2 = (Object[]) objE;
            axlj axljVar = (axlj) objArr2[2];
            if (agkhVar == null) {
                throw axljVar.d();
            }
            agkhVar.c = axljVar;
            Object obj = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue << 1);
            objE = obj;
            i = iIntValue;
        }
        return new agpn(objE, objArr, i);
    }

    static Object b(Object[] objArr, int i, int i2, int i3) {
        Object objE = e(objArr, i, i2, i3);
        if (objE instanceof Object[]) {
            throw ((axlj) ((Object[]) objE)[2]).d();
        }
        return objE;
    }

    static Object c(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 != null) {
            if (i != 1) {
                if (obj != null) {
                    if (!(obj instanceof byte[])) {
                        if (!(obj instanceof short[])) {
                            int[] iArr = (int[]) obj;
                            int length = iArr.length - 1;
                            int iW = aguu.W(obj2.hashCode());
                            while (true) {
                                int i3 = iW & length;
                                int i4 = iArr[i3];
                                if (i4 == -1) {
                                    break;
                                }
                                if (obj2.equals(objArr[i4])) {
                                    return objArr[i4 ^ 1];
                                }
                                iW = i3 + 1;
                            }
                        } else {
                            short[] sArr = (short[]) obj;
                            int length2 = sArr.length - 1;
                            int iW2 = aguu.W(obj2.hashCode());
                            while (true) {
                                int i5 = iW2 & length2;
                                char c = (char) sArr[i5];
                                if (c == 65535) {
                                    break;
                                }
                                if (obj2.equals(objArr[c])) {
                                    return objArr[c ^ 1];
                                }
                                iW2 = i5 + 1;
                            }
                        }
                    } else {
                        byte[] bArr = (byte[]) obj;
                        int length3 = bArr.length - 1;
                        int iW3 = aguu.W(obj2.hashCode());
                        while (true) {
                            int i6 = iW3 & length3;
                            int i7 = bArr[i6] & 255;
                            if (i7 == 255) {
                                break;
                            }
                            if (obj2.equals(objArr[i7])) {
                                return objArr[i7 ^ 1];
                            }
                            iW3 = i6 + 1;
                        }
                    }
                }
            } else {
                Object obj3 = objArr[i2];
                obj3.getClass();
                if (obj3.equals(obj2)) {
                    Object obj4 = objArr[i2 ^ 1];
                    obj4.getClass();
                    return obj4;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.Object[]] */
    private static Object e(Object[] objArr, int i, int i2, int i3) {
        byte[] bArr;
        int i4;
        Object[] objArr2;
        axlj axljVar = null;
        int i5 = 1;
        if (i == 1) {
            objArr[i3].getClass();
            objArr[i3 ^ 1].getClass();
            return null;
        }
        int i6 = i2 - 1;
        if (i2 <= 128) {
            bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            int i7 = 0;
            for (int i8 = 0; i8 < i; i8++) {
                int i9 = (i8 << 1) + i3;
                int i10 = (i7 << 1) + i3;
                Object obj = objArr[i9];
                obj.getClass();
                Object obj2 = objArr[i9 ^ 1];
                obj2.getClass();
                int iW = aguu.W(obj.hashCode());
                while (true) {
                    int i11 = iW & i6;
                    int i12 = bArr[i11] & 255;
                    if (i12 == 255) {
                        bArr[i11] = (byte) i10;
                        if (i7 < i8) {
                            objArr[i10] = obj;
                            objArr[i10 ^ 1] = obj2;
                        }
                        i7++;
                        break;
                    }
                    if (obj.equals(objArr[i12])) {
                        int i13 = i12 ^ 1;
                        Object obj3 = objArr[i13];
                        obj3.getClass();
                        axljVar = new axlj(obj, obj2, obj3);
                        objArr[i13] = obj2;
                        break;
                    }
                    iW = i11 + 1;
                }
            }
            if (i7 != i) {
                objArr2 = new Object[]{bArr, Integer.valueOf(i7), axljVar};
                return objArr2;
            }
            return bArr;
        }
        if (i2 <= 32768) {
            bArr = new short[i2];
            Arrays.fill(bArr, (short) -1);
            int i14 = 0;
            for (int i15 = 0; i15 < i; i15++) {
                int i16 = (i15 << 1) + i3;
                int i17 = (i14 << 1) + i3;
                Object obj4 = objArr[i16];
                obj4.getClass();
                Object obj5 = objArr[i16 ^ 1];
                obj5.getClass();
                int iW2 = aguu.W(obj4.hashCode());
                while (true) {
                    int i18 = iW2 & i6;
                    char c = (char) bArr[i18];
                    if (c == 65535) {
                        bArr[i18] = (short) i17;
                        if (i14 < i15) {
                            objArr[i17] = obj4;
                            objArr[i17 ^ 1] = obj5;
                        }
                        i14++;
                        break;
                    }
                    if (obj4.equals(objArr[c])) {
                        int i19 = c ^ 1;
                        Object obj6 = objArr[i19];
                        obj6.getClass();
                        axljVar = new axlj(obj4, obj5, obj6);
                        objArr[i19] = obj5;
                        break;
                    }
                    iW2 = i18 + 1;
                }
            }
            if (i14 != i) {
                objArr2 = new Object[]{bArr, Integer.valueOf(i14), axljVar};
                return objArr2;
            }
        } else {
            bArr = new int[i2];
            Arrays.fill((int[]) bArr, -1);
            int i20 = 0;
            int i21 = 0;
            while (i20 < i) {
                int i22 = (i20 << 1) + i3;
                int i23 = (i21 << 1) + i3;
                Object obj7 = objArr[i22];
                obj7.getClass();
                Object obj8 = objArr[i22 ^ i5];
                obj8.getClass();
                int iW3 = aguu.W(obj7.hashCode());
                while (true) {
                    int i24 = iW3 & i6;
                    ?? r15 = bArr[i24];
                    if (r15 == -1) {
                        bArr[i24] = i23;
                        if (i21 < i20) {
                            objArr[i23] = obj7;
                            objArr[i23 ^ 1] = obj8;
                        }
                        i21++;
                        i4 = i5;
                        break;
                    }
                    i4 = i5;
                    if (obj7.equals(objArr[r15])) {
                        int i25 = r15 ^ 1;
                        Object obj9 = objArr[i25];
                        obj9.getClass();
                        axljVar = new axlj(obj7, obj8, obj9);
                        objArr[i25] = obj8;
                        break;
                    }
                    iW3 = i24 + 1;
                    i5 = i4;
                }
                i20++;
                i5 = i4;
            }
            int i26 = i5;
            if (i21 != i) {
                Integer numValueOf = Integer.valueOf(i21);
                ?? r3 = new Object[3];
                r3[0] = bArr;
                r3[i26] = numValueOf;
                r3[2] = axljVar;
                return r3;
            }
        }
        return bArr;
    }

    @Override // defpackage.agkj, java.util.Map
    /* JADX INFO: renamed from: d */
    public final agjw values() {
        return new agpm(this.c, 1, this.d);
    }

    @Override // defpackage.agkj, java.util.Map
    public final Object get(Object obj) {
        Object objC = c(this.e, this.c, this.d, 0, obj);
        if (objC == null) {
            return null;
        }
        return objC;
    }

    @Override // defpackage.agkj, java.util.Map
    /* JADX INFO: renamed from: s */
    public final agkz entrySet() {
        return new agpk(this, this.c, 0, this.d);
    }

    @Override // java.util.Map
    public final int size() {
        return this.d;
    }

    @Override // defpackage.agkj, java.util.Map
    /* JADX INFO: renamed from: t */
    public final agkz keySet() {
        return new agpl(this, new agpm(this.c, 0, this.d));
    }

    @Override // defpackage.agkj
    public final boolean u() {
        return false;
    }

    @Override // defpackage.agkj
    public Object writeReplace() {
        return super.writeReplace();
    }
}
