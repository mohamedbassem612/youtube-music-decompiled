package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class u implements Serializable, p {
    private static final long serialVersionUID = 1;
    private final int a;
    private final boolean b;
    private final boolean c;
    private final double d;
    private final double e;
    private final long[] f;
    private final int g;

    public u(int i, boolean z, int i2, boolean z2, double d, double d2, long[] jArr) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = d;
        this.e = d2;
        this.f = jArr;
        this.g = i2;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0045  */
    /* JADX WARN: Code duplicated, block: B:36:0x004d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0055  */
    /* JADX WARN: Code duplicated, block: B:41:0x0058  */
    /* JADX WARN: Code duplicated, block: B:45:0x0060  */
    /* JADX WARN: Code duplicated, block: B:49:0x006a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0075  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.p
    public final boolean a(q qVar) {
        long j;
        double d;
        int i;
        boolean z;
        long[] jArr;
        int i2;
        int i3;
        int i4 = this.g;
        int i5 = i4 - 1;
        if (i5 == 1) {
            j = qVar.f;
        } else {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 == 4) {
                        i3 = qVar.b;
                    } else if (i5 != 5) {
                        d = qVar.a;
                    } else {
                        i3 = qVar.c;
                    }
                    d = i3;
                } else {
                    j = qVar.e;
                }
                if ((this.c || d - ((long) d) == 0.0d) && (i4 != 7 || qVar.b == 0)) {
                    i = this.a;
                    if (i != 0) {
                        d %= (double) i;
                    }
                    if (d >= this.d || d > this.e) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z && (jArr = this.f) != null) {
                        z = false;
                        for (i2 = 0; !z && i2 < jArr.length; i2 += 2) {
                            if (d >= jArr[i2] || d > jArr[i2 + 1]) {
                                z = false;
                            } else {
                                z = true;
                            }
                        }
                    }
                    if (this.b == z) {
                        return true;
                    }
                } else if (!this.b) {
                    return true;
                }
                return false;
            }
            j = qVar.d;
        }
        d = j;
        if (this.c) {
            i = this.a;
            if (i != 0) {
                d %= (double) i;
            }
            if (d >= this.d) {
                z = false;
            } else {
                z = false;
            }
            if (z) {
                z = false;
                while (!z) {
                    if (d >= jArr[i2]) {
                        z = false;
                    } else {
                        z = false;
                    }
                }
            }
            if (this.b == z) {
                return true;
            }
        } else {
            i = this.a;
            if (i != 0) {
                d %= (double) i;
            }
            if (d >= this.d) {
                z = false;
            } else {
                z = false;
            }
            if (z) {
                z = false;
                while (!z) {
                    if (d >= jArr[i2]) {
                        z = false;
                    } else {
                        z = false;
                    }
                }
            }
            if (this.b == z) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        switch (this.g) {
            case 1:
                str = "n";
                break;
            case 2:
                str = "i";
                break;
            case 3:
                str = "f";
                break;
            case 4:
                str = "t";
                break;
            case 5:
                str = "v";
                break;
            case 6:
                str = "w";
                break;
            default:
                str = "j";
                break;
        }
        sb.append((Object) str);
        int i = this.a;
        if (i != 0) {
            sb.append(" % ");
            sb.append(i);
        }
        double d = this.d;
        double d2 = this.e;
        String str2 = " = ";
        if (d != d2) {
            boolean z = this.c;
            boolean z2 = this.b;
            if (!z) {
                str2 = z2 ? " within " : " not within ";
            } else if (!z2) {
                str2 = " != ";
            }
        } else if (!this.b) {
            str2 = " != ";
        }
        sb.append(str2);
        long[] jArr = this.f;
        if (jArr != null) {
            int i2 = 0;
            while (i2 < jArr.length) {
                x.b(sb, jArr[i2], jArr[i2 + 1], i2 != 0);
                i2 += 2;
            }
        } else {
            x.b(sb, d, d2, false);
        }
        return sb.toString();
    }
}
