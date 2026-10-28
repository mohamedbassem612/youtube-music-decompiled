package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aijt {
    public static final aijt a = new aijt(0, new int[0], new Object[0], false);
    public int b;
    public int[] c;
    public Object[] d;
    public int e;
    private boolean f;

    private aijt(int i, int[] iArr, Object[] objArr, boolean z) {
        this.e = -1;
        this.b = i;
        this.c = iArr;
        this.d = objArr;
        this.f = z;
    }

    static aijt b(aijt aijtVar, aijt aijtVar2) {
        int i = aijtVar.b + aijtVar2.b;
        int[] iArrCopyOf = Arrays.copyOf(aijtVar.c, i);
        System.arraycopy(aijtVar2.c, 0, iArrCopyOf, aijtVar.b, aijtVar2.b);
        Object[] objArrCopyOf = Arrays.copyOf(aijtVar.d, i);
        System.arraycopy(aijtVar2.d, 0, objArrCopyOf, aijtVar.b, aijtVar2.b);
        return new aijt(i, iArrCopyOf, objArrCopyOf, true);
    }

    public final int a() {
        int iNumberOfLeadingZeros;
        int iNumberOfLeadingZeros2;
        int iNumberOfLeadingZeros3;
        int i = this.e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            int i4 = this.c[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.d[i3]).longValue();
                    iNumberOfLeadingZeros3 = ((352 - (Integer.numberOfLeadingZeros(i5 << 3) * 9)) >>> 6) + 8;
                } else if (i6 == 2) {
                    aigj aigjVar = (aigj) this.d[i3];
                    int iNumberOfLeadingZeros4 = Integer.numberOfLeadingZeros(i5 << 3) * 9;
                    int iD = aigjVar.d();
                    iNumberOfLeadingZeros3 = ((352 - iNumberOfLeadingZeros4) >>> 6) + ((352 - (Integer.numberOfLeadingZeros(iD) * 9)) >>> 6) + iD;
                } else if (i6 == 3) {
                    int iNumberOfLeadingZeros5 = Integer.numberOfLeadingZeros(i5 << 3) * 9;
                    iNumberOfLeadingZeros2 = ((aijt) this.d[i3]).a();
                    iNumberOfLeadingZeros = ((352 - iNumberOfLeadingZeros5) >>> 6) << 1;
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(new aiij("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.d[i3]).intValue();
                    iNumberOfLeadingZeros3 = ((352 - (Integer.numberOfLeadingZeros(i5 << 3) * 9)) >>> 6) + 4;
                }
                i2 += iNumberOfLeadingZeros3;
            } else {
                long jLongValue = ((Long) this.d[i3]).longValue();
                iNumberOfLeadingZeros = (352 - (Integer.numberOfLeadingZeros(i5 << 3) * 9)) >>> 6;
                iNumberOfLeadingZeros2 = (640 - (Long.numberOfLeadingZeros(jLongValue) * 9)) >>> 6;
            }
            iNumberOfLeadingZeros3 = iNumberOfLeadingZeros + iNumberOfLeadingZeros2;
            i2 += iNumberOfLeadingZeros3;
        }
        this.e = i2;
        return i2;
    }

    final void c() {
        if (!this.f) {
            throw new UnsupportedOperationException();
        }
    }

    public final void d(int i) {
        int[] iArr = this.c;
        if (i > iArr.length) {
            int i2 = this.b;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.c = Arrays.copyOf(iArr, i);
            this.d = Arrays.copyOf(this.d, i);
        }
    }

    public final void e() {
        if (this.f) {
            this.f = false;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof aijt)) {
            aijt aijtVar = (aijt) obj;
            int i = this.b;
            if (i == aijtVar.b && a.ac(this.c, aijtVar.c, i) && a.ab(this.d, aijtVar.d, this.b)) {
                return true;
            }
        }
        return false;
    }

    final void f(int i, Object obj) {
        c();
        d(this.b + 1);
        int[] iArr = this.c;
        int i2 = this.b;
        iArr[i2] = i;
        this.d[i2] = obj;
        this.b = i2 + 1;
    }

    final boolean g(int i, aigm aigmVar) throws aiik {
        int iN;
        c();
        int i2 = i & 7;
        if (i2 == 0) {
            f(i, Long.valueOf(aigmVar.q()));
            return true;
        }
        if (i2 == 1) {
            f(i, Long.valueOf(aigmVar.p()));
            return true;
        }
        if (i2 == 2) {
            f(i, aigmVar.w());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                aigmVar.Q();
                return false;
            }
            if (i2 != 5) {
                throw new aiij("Protocol message tag had invalid wire type.");
            }
            f(i, Integer.valueOf(aigmVar.h()));
            return true;
        }
        aigmVar.P();
        aigmVar.h++;
        aijt aijtVar = new aijt();
        do {
            iN = aigmVar.n();
            if (iN == 0) {
                break;
            }
        } while (aijtVar.g(iN, aigmVar));
        aigmVar.h--;
        aigmVar.z(((i >>> 3) << 3) | 4);
        f(i, aijtVar);
        return true;
    }

    public final void h(ahud ahudVar) {
        if (this.b != 0) {
            for (int i = 0; i < this.b; i++) {
                int i2 = this.c[i];
                Object obj = this.d[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    ahudVar.E(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    ahudVar.A(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    ahudVar.w(i3, (aigj) obj);
                } else if (i4 == 3) {
                    aigs aigsVar = (aigs) ahudVar.b;
                    aigsVar.w(i3, 3);
                    ((aijt) obj).h(ahudVar);
                    aigsVar.w(i3, 4);
                } else {
                    if (i4 != 5) {
                        throw new RuntimeException(new aiij("Protocol message tag had invalid wire type."));
                    }
                    ahudVar.z(i3, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int hashCode() {
        int i = this.b;
        return ((((i + 527) * 31) + a.Z(this.c, i)) * 31) + a.aa(this.d, this.b);
    }

    public aijt() {
        this(0, new int[8], new Object[8], true);
    }
}
