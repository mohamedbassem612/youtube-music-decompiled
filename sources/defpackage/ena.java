package defpackage;

import java.io.EOFException;
import org.chromium.base.AndroidInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ena extends emz {
    private static final axii f = axii.d("'\\");
    private static final axii g = axii.d("\"\\");
    private static final axii h = axii.d("{}[]:, \n\t\r\f/\\;#=");
    private static final axii i = axii.d("\n\r");
    private static final axii j = axii.d("*/");
    private final axih k;
    private final axig l;
    private int m = 0;
    private long n;
    private int o;
    private String p;

    public ena(axih axihVar) {
        this.k = axihVar;
        this.l = ((axin) axihVar).b;
        k(6);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0039  */
    private final boolean A(int i2) throws emy {
        if (i2 != 9 && i2 != 10 && i2 != 12 && i2 != 13 && i2 != 32) {
            if (i2 == 35) {
                w();
            } else if (i2 != 44) {
                if (i2 == 47 || i2 == 61) {
                    w();
                } else if (i2 != 123 && i2 != 125 && i2 != 58) {
                    if (i2 != 59) {
                        switch (i2) {
                            case 92:
                                w();
                            case 91:
                            case 93:
                                return false;
                            default:
                                return true;
                        }
                    } else {
                        w();
                    }
                }
            }
        }
        return false;
    }

    private final int B(String str, boy boyVar) {
        String[] strArr = (String[]) boyVar.a;
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(strArr[i2])) {
                this.m = 0;
                this.d[this.b - 1] = str;
                return i2;
            }
        }
        return -1;
    }

    private final char r() throws emy, EOFException {
        int i2;
        axih axihVar = this.k;
        if (!axihVar.l(1L)) {
            throw c("Unterminated escape sequence");
        }
        axig axigVar = this.l;
        byte b = axigVar.b();
        if (b == 10 || b == 34 || b == 39 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return '\r';
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            throw c("Invalid escape sequence: \\" + ((char) b));
        }
        if (!axihVar.l(4L)) {
            throw new EOFException("Unterminated escape sequence at path ".concat(d()));
        }
        char c = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            byte bA = axigVar.a(i3);
            char c2 = (char) (c << 4);
            if (bA >= 48 && bA <= 57) {
                i2 = bA - 48;
            } else if (bA >= 97 && bA <= 102) {
                i2 = bA - 87;
            } else {
                if (bA < 65 || bA > 70) {
                    throw c("\\u".concat(axigVar.g(4L)));
                }
                i2 = bA - 55;
            }
            c = (char) (c2 + i2);
        }
        axigVar.k(4L);
        return c;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:127:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:134:0x01b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:135:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:142:0x01c4 A[DONT_INVERT, PHI: r1
      0x01c4: PHI (r1v35 char) = (r1v34 char), (r1v38 char) binds: [B:125:0x019f, B:141:0x01c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:143:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:156:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:161:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:167:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:169:0x0200  */
    /* JADX WARN: Code duplicated, block: B:171:0x020a  */
    /* JADX WARN: Code duplicated, block: B:173:0x0211  */
    /* JADX WARN: Code duplicated, block: B:180:0x022e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:181:0x0230 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:187:0x0241  */
    /* JADX WARN: Code duplicated, block: B:190:0x024f  */
    /* JADX WARN: Code duplicated, block: B:226:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x009b  */
    /* JADX WARN: Code duplicated, block: B:43:0x009f  */
    /* JADX WARN: Code duplicated, block: B:84:0x012a  */
    /* JADX WARN: Code duplicated, block: B:87:0x013b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0144  */
    private final int s() throws emy, EOFException {
        int i2;
        int i3;
        int iT;
        int i4;
        int i5;
        String str;
        String str2;
        long j2;
        char cA;
        boolean z;
        long j3;
        char c;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        byte bA;
        char c2;
        int[] iArr = this.c;
        int i11 = this.b - 1;
        int i12 = iArr[i11];
        long j4 = 0;
        int i13 = 2;
        int i14 = 1;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3 || i12 == 5) {
                    iArr[i11] = 4;
                    if (i12 == 5) {
                        int iT2 = t(true);
                        this.l.b();
                        if (iT2 != 44) {
                            if (iT2 == 59) {
                                w();
                            } else if (iT2 != 125) {
                                throw c("Unterminated object");
                            }
                            this.m = i13;
                            return i13;
                        }
                    }
                    int iT3 = t(true);
                    if (iT3 == 34) {
                        this.l.b();
                        this.m = 13;
                        return 13;
                    }
                    if (iT3 == 39) {
                        this.l.b();
                        w();
                        this.m = 12;
                        return 12;
                    }
                    if (iT3 == 125) {
                        if (i12 == 5) {
                            throw c("Expected name");
                        }
                        this.l.b();
                        this.m = 2;
                        return 2;
                    }
                    w();
                    if (!A((char) iT3)) {
                        throw c("Expected name");
                    }
                    i2 = 14;
                } else if (i12 == 4) {
                    iArr[i11] = 5;
                    int iT4 = t(true);
                    axig axigVar = this.l;
                    axigVar.b();
                    if (iT4 != 58) {
                        if (iT4 != 61) {
                            throw c("Expected ':'");
                        }
                        w();
                        if (this.k.l(1L) && axigVar.a(0L) == 62) {
                            axigVar.b();
                        }
                    }
                } else if (i12 == 6) {
                    iArr[i11] = 7;
                } else {
                    i3 = 0;
                    if (i12 == 7) {
                        if (t(false) == -1) {
                            i2 = 18;
                        } else {
                            w();
                        }
                    } else if (i12 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                i13 = i2;
                this.m = i13;
                return i13;
            }
            int iT5 = t(true);
            this.l.b();
            if (iT5 != 44) {
                if (iT5 != 59) {
                    if (iT5 != 93) {
                        throw c("Unterminated array");
                    }
                    i13 = 4;
                    this.m = i13;
                    return i13;
                }
                w();
            }
            iT = t(true);
            if (iT != 34) {
                this.l.b();
                this.m = 9;
                return 9;
            }
            if (iT != 39) {
                if (iT != 44 || iT == 59) {
                    if (i12 == 1 && i12 != 2) {
                        throw c("Unexpected value");
                    }
                    w();
                    i14 = 7;
                    this.m = 7;
                } else if (iT == 91) {
                    this.l.b();
                    i4 = 3;
                    this.m = 3;
                } else if (iT != 93) {
                    axig axigVar2 = this.l;
                    if (iT != 123) {
                        byte bA2 = axigVar2.a(0L);
                        if (bA2 == 116 || bA2 == 84) {
                            i5 = 5;
                            str2 = "TRUE";
                            str = "true";
                        } else {
                            if (bA2 != 102 && bA2 != 70) {
                                if (bA2 == 110 || bA2 == 78) {
                                    i5 = 7;
                                    str2 = "NULL";
                                    str = "null";
                                } else {
                                    j2 = 0;
                                }
                                if (i3 == 0) {
                                    return i3;
                                }
                                z = true;
                                j3 = j2;
                                c = 0;
                                i6 = 0;
                                i7 = 0;
                                while (true) {
                                    i8 = i6 + 1;
                                    if (!this.k.l(i8)) {
                                        bA = axigVar2.a(i6);
                                        if (bA != 43) {
                                            if (bA != 69 || bA == 101) {
                                                if (c != 2 || c == 4) {
                                                    c = 5;
                                                    i6 = i8;
                                                } else {
                                                    i10 = 0;
                                                }
                                            } else if (bA == 45) {
                                                c2 = 6;
                                                if (c == 0) {
                                                    c = 1;
                                                    i7 = 1;
                                                } else {
                                                    if (c != 5) {
                                                        i10 = 0;
                                                    }
                                                    c = c2;
                                                }
                                                i6 = i8;
                                            } else if (bA != 46) {
                                                if (bA >= 48 && bA <= 57) {
                                                    if (c == 1 || c == 0) {
                                                        j3 = -(bA - 48);
                                                        c = 2;
                                                    } else if (c == 2) {
                                                        if (j3 != j2) {
                                                            long j5 = (10 * j3) - ((long) (bA - 48));
                                                            z &= j3 > -922337203685477580L || (j3 == -922337203685477580L && j5 < j3);
                                                            j3 = j5;
                                                        }
                                                    } else if (c == 3) {
                                                        c = 4;
                                                    } else if (c == 5 || c == 6) {
                                                        c = 7;
                                                    }
                                                    i6 = i8;
                                                } else if (!A(bA)) {
                                                }
                                                i10 = 0;
                                            } else if (c == 2) {
                                                c = 3;
                                                i6 = i8;
                                            } else {
                                                i10 = 0;
                                            }
                                            if (i10 != 0) {
                                                return i10;
                                            }
                                            if (!A(axigVar2.a(j2))) {
                                                throw c("Expected value");
                                            }
                                            w();
                                            this.m = 10;
                                            return 10;
                                        }
                                        c2 = 6;
                                        if (c != 5) {
                                            i10 = 0;
                                            if (i10 != 0) {
                                                return i10;
                                            }
                                            if (!A(axigVar2.a(j2))) {
                                                throw c("Expected value");
                                            }
                                            w();
                                            this.m = 10;
                                            return 10;
                                        }
                                        c = c2;
                                        i6 = i8;
                                    }
                                    if (c != 2) {
                                        if (c != 2 || c == 4 || c == 7) {
                                            this.o = i6;
                                            i9 = 17;
                                            this.m = 17;
                                        } else {
                                            i10 = 0;
                                        }
                                        if (i10 != 0) {
                                            return i10;
                                        }
                                        if (!A(axigVar2.a(j2))) {
                                            throw c("Expected value");
                                        }
                                        w();
                                        this.m = 10;
                                        return 10;
                                    }
                                    if (z) {
                                        if (j3 == Long.MIN_VALUE) {
                                            i14 = i7;
                                        } else if (i7 != 0) {
                                        }
                                        if (j3 == j2) {
                                            if (i14 == 0) {
                                                i14 = 0;
                                            }
                                        }
                                        long j6 = i6;
                                        if (i14 == 0) {
                                            j3 = -j3;
                                        }
                                        this.n = j3;
                                        axigVar2.k(j6);
                                        i9 = 16;
                                        this.m = 16;
                                    }
                                    c = 2;
                                    if (c != 2) {
                                    }
                                    this.o = i6;
                                    i9 = 17;
                                    this.m = 17;
                                    i10 = i9;
                                    if (i10 != 0) {
                                        return i10;
                                    }
                                    if (!A(axigVar2.a(j2))) {
                                        throw c("Expected value");
                                    }
                                    w();
                                    this.m = 10;
                                    return 10;
                                }
                            }
                            i5 = 6;
                            str2 = "FALSE";
                            str = "false";
                        }
                        int i15 = 1;
                        while (true) {
                            int length = str.length();
                            axih axihVar = this.k;
                            if (i15 >= length) {
                                j2 = j4;
                                long j7 = length;
                                if (!axihVar.l(length + 1) || !A(axigVar2.a(j7))) {
                                    axigVar2.k(j7);
                                    this.m = i5;
                                    i3 = i5;
                                    break;
                                }
                                i3 = 0;
                                break;
                            }
                            int i16 = i15 + 1;
                            j2 = j4;
                            if (!axihVar.l(i16) || ((cA = axigVar2.a(i15)) != str.charAt(i15) && cA != str2.charAt(i15))) {
                                break;
                            }
                            i15 = i16;
                            j4 = j2;
                        }
                        if (i3 == 0) {
                            return i3;
                        }
                        z = true;
                        j3 = j2;
                        c = 0;
                        i6 = 0;
                        i7 = 0;
                        while (true) {
                            i8 = i6 + 1;
                            if (!this.k.l(i8)) {
                                bA = axigVar2.a(i6);
                                if (bA != 43) {
                                    if (bA != 69) {
                                        if (c != 2) {
                                        }
                                        c = 5;
                                        i6 = i8;
                                    } else {
                                        if (c != 2) {
                                        }
                                        c = 5;
                                        i6 = i8;
                                    }
                                    if (i10 != 0) {
                                        return i10;
                                    }
                                    if (!A(axigVar2.a(j2))) {
                                        throw c("Expected value");
                                    }
                                    w();
                                    this.m = 10;
                                    return 10;
                                }
                                c2 = 6;
                                if (c != 5) {
                                    i10 = 0;
                                    if (i10 != 0) {
                                        return i10;
                                    }
                                    if (!A(axigVar2.a(j2))) {
                                        throw c("Expected value");
                                    }
                                    w();
                                    this.m = 10;
                                    return 10;
                                }
                                c = c2;
                                i6 = i8;
                            }
                            if (c != 2) {
                                if (c != 2) {
                                }
                                this.o = i6;
                                i9 = 17;
                                this.m = 17;
                            } else {
                                if (z) {
                                    if (j3 == Long.MIN_VALUE) {
                                        i14 = i7;
                                    } else if (i7 != 0) {
                                    }
                                    if (j3 == j2) {
                                        if (i14 == 0) {
                                            i14 = 0;
                                        }
                                    }
                                    long j8 = i6;
                                    if (i14 == 0) {
                                        j3 = -j3;
                                    }
                                    this.n = j3;
                                    axigVar2.k(j8);
                                    i9 = 16;
                                    this.m = 16;
                                }
                                c = 2;
                                if (c != 2) {
                                }
                                this.o = i6;
                                i9 = 17;
                                this.m = 17;
                            }
                            i10 = i9;
                            if (i10 != 0) {
                                return i10;
                            }
                            if (!A(axigVar2.a(j2))) {
                                throw c("Expected value");
                            }
                            w();
                            this.m = 10;
                            return 10;
                        }
                    }
                    axigVar2.b();
                    this.m = 1;
                } else {
                    if (i12 == 1) {
                        this.l.b();
                        this.m = 4;
                        return 4;
                    }
                    if (i12 == 1) {
                    }
                    w();
                    i14 = 7;
                    this.m = 7;
                }
                return i14;
            }
            w();
            this.l.b();
            i4 = 8;
            this.m = 8;
            return i4;
        }
        iArr[i11] = 2;
        i3 = 0;
        iT = t(true);
        if (iT != 34) {
            this.l.b();
            this.m = 9;
            return 9;
        }
        if (iT != 39) {
            if (iT != 44) {
                if (i12 == 1) {
                }
                w();
                i14 = 7;
                this.m = 7;
            } else {
                if (i12 == 1) {
                }
                w();
                i14 = 7;
                this.m = 7;
            }
            return i14;
        }
        w();
        this.l.b();
        i4 = 8;
        this.m = 8;
        return i4;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ef A[LOOP:2: B:27:0x0078->B:52:0x00ef, LOOP_END] */
    private final int t(boolean z) throws emy, EOFException {
        int i2;
        axih axihVar;
        axig axigVar;
        byte bA;
        boolean z2;
        long j2;
        long j3;
        while (true) {
            while (true) {
                axihVar = this.k;
                int i3 = i2 + 1;
                if (!axihVar.l(i3)) {
                    if (z) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                axigVar = this.l;
                bA = axigVar.a(i2);
                i2 = (bA == 10 || bA == 32 || bA == 13 || bA == 9) ? i3 : 0;
            }
            axigVar.k(i2);
            if (bA == 47) {
                if (axihVar.l(2L)) {
                    w();
                    long j4 = 1;
                    byte bA2 = axigVar.a(1L);
                    if (bA2 == 42) {
                        axigVar.b();
                        axigVar.b();
                        axii axiiVar = j;
                        axiiVar.getClass();
                        int iB = axiiVar.b();
                        long j5 = iB;
                        AndroidInfo.c(axiiVar.b(), 0L, j5);
                        axin axinVar = (axin) axihVar;
                        if (axinVar.c) {
                            throw new IllegalStateException("closed");
                        }
                        long jMax = 0;
                        while (true) {
                            axig axigVar2 = axinVar.b;
                            long j6 = j5;
                            long jA = axis.a(axigVar2, axiiVar, jMax, Long.MAX_VALUE, iB);
                            int i4 = iB;
                            if (jA == -1) {
                                long j7 = axigVar2.b;
                                long j8 = j4;
                                long j9 = (j7 - j6) + j8;
                                if (j9 < Long.MAX_VALUE) {
                                    if (j7 < Long.MAX_VALUE) {
                                        j2 = j9;
                                    } else {
                                        int iMin = ((int) Math.min(j6, (axigVar2.b - jMax) + j8)) - 1;
                                        if (1 <= iMin) {
                                            int i5 = iMin;
                                            while (true) {
                                                long j10 = axigVar2.b;
                                                j2 = j9;
                                                long j11 = i5;
                                                long j12 = j10 - j11;
                                                if (i5 < 0 || j12 < 0 || j12 + j11 > j10 || i5 > axiiVar.b()) {
                                                    j3 = jMax;
                                                } else {
                                                    if (i5 != 0) {
                                                        j3 = jMax;
                                                        if (axis.a(axigVar2, axiiVar, j12, j12 + j8, i5) != -1) {
                                                        }
                                                    }
                                                    if (axinVar.a.e(axigVar2, 8192L) == -1) {
                                                        jA = -1;
                                                        z2 = true;
                                                    } else {
                                                        jMax = Math.max(j3, j2);
                                                        j5 = j6;
                                                        iB = i4;
                                                        j4 = j8;
                                                    }
                                                }
                                                z2 = true;
                                                if (i5 != 1) {
                                                    i5--;
                                                    j9 = j2;
                                                    jMax = j3;
                                                }
                                            }
                                        }
                                        jA = -1;
                                    }
                                    j3 = jMax;
                                    if (axinVar.a.e(axigVar2, 8192L) == -1) {
                                        jA = -1;
                                        z2 = true;
                                    } else {
                                        jMax = Math.max(j3, j2);
                                        j5 = j6;
                                        iB = i4;
                                        j4 = j8;
                                    }
                                }
                                z2 = true;
                                jA = -1;
                            } else {
                                z2 = true;
                            }
                            boolean z3 = jA != -1 ? z2 : false;
                            axigVar.k(z3 ? jA + ((long) axiiVar.b()) : axigVar.b);
                            if (!z3) {
                                throw c("Unterminated comment");
                            }
                        }
                    } else if (bA2 == 47) {
                        axigVar.b();
                        axigVar.b();
                        y();
                    }
                }
                return 47;
            }
            if (bA != 35) {
                return bA;
            }
            w();
            y();
        }
    }

    private final String u(axii axiiVar) throws emy {
        StringBuilder sb = null;
        while (true) {
            long jD = this.k.d(axiiVar);
            if (jD == -1) {
                throw c("Unterminated string");
            }
            axig axigVar = this.l;
            if (axigVar.a(jD) != 92) {
                if (sb == null) {
                    String strG = axigVar.g(jD);
                    axigVar.b();
                    return strG;
                }
                sb.append(axigVar.g(jD));
                axigVar.b();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(axigVar.g(jD));
            axigVar.b();
            sb.append(r());
        }
    }

    private final String v() {
        long jD = this.k.d(h);
        axig axigVar = this.l;
        return jD != -1 ? axigVar.g(jD) : axigVar.f(axigVar.b, awtd.a);
    }

    private final void w() throws emy {
        throw c("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    private final void x(axii axiiVar) throws emy, EOFException {
        while (true) {
            long jD = this.k.d(axiiVar);
            if (jD == -1) {
                throw c("Unterminated string");
            }
            long j2 = 1 + jD;
            axig axigVar = this.l;
            if (axigVar.a(jD) != 92) {
                axigVar.k(j2);
                return;
            } else {
                axigVar.k(j2);
                r();
            }
        }
    }

    private final void y() {
        long jD = this.k.d(i);
        axig axigVar = this.l;
        axigVar.k(jD != -1 ? jD + 1 : axigVar.b);
    }

    private final void z() {
        long jD = this.k.d(h);
        axig axigVar = this.l;
        if (jD == -1) {
            jD = axigVar.b;
        }
        axigVar.k(jD);
    }

    @Override // defpackage.emz
    public final double a() throws emy, EOFException {
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 16) {
            this.m = 0;
            int[] iArr = this.e;
            int i2 = this.b - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.n;
        }
        if (iS == 17) {
            this.p = this.l.g(this.o);
        } else if (iS == 9) {
            this.p = u(g);
        } else if (iS == 8) {
            this.p = u(f);
        } else if (iS == 10) {
            this.p = v();
        } else if (iS != 11) {
            throw new emx(enb.a(this, "Expected a double but was "));
        }
        this.m = 11;
        try {
            double d = Double.parseDouble(this.p);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                throw new emy("JSON forbids NaN and infinities: " + d + " at path " + d());
            }
            this.p = null;
            this.m = 0;
            int[] iArr2 = this.e;
            int i3 = this.b - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return d;
        } catch (NumberFormatException unused) {
            throw new emx("Expected a double but was " + this.p + " at path " + d());
        }
    }

    @Override // defpackage.emz
    public final int b() throws emy, EOFException {
        String strU;
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 16) {
            long j2 = this.n;
            int i2 = (int) j2;
            if (j2 == i2) {
                this.m = 0;
                int[] iArr = this.e;
                int i3 = this.b - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new emx("Expected an int but was " + j2 + " at path " + d());
        }
        if (iS == 17) {
            this.p = this.l.g(this.o);
        } else {
            if (iS == 9) {
                strU = u(g);
            } else if (iS == 8) {
                strU = u(f);
            } else if (iS != 11) {
                throw new emx(enb.a(this, "Expected an int but was "));
            }
            this.p = strU;
            try {
                int i4 = Integer.parseInt(strU);
                this.m = 0;
                int[] iArr2 = this.e;
                int i5 = this.b - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return i4;
            } catch (NumberFormatException unused) {
            }
        }
        this.m = 11;
        try {
            double d = Double.parseDouble(this.p);
            int i6 = (int) d;
            if (i6 == d) {
                this.p = null;
                this.m = 0;
                int[] iArr3 = this.e;
                int i7 = this.b - 1;
                iArr3[i7] = iArr3[i7] + 1;
                return i6;
            }
            throw new emx("Expected an int but was " + this.p + " at path " + d());
        } catch (NumberFormatException unused2) {
            throw new emx("Expected an int but was " + this.p + " at path " + d());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.m = 0;
        this.c[0] = 8;
        this.b = 1;
        this.l.j();
        this.k.close();
    }

    @Override // defpackage.emz
    public final String e() throws emy, EOFException {
        String strU;
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 14) {
            strU = v();
        } else if (iS == 13) {
            strU = u(g);
        } else if (iS == 12) {
            strU = u(f);
        } else {
            if (iS != 15) {
                throw new emx(enb.a(this, "Expected a name but was "));
            }
            strU = this.p;
        }
        this.m = 0;
        this.d[this.b - 1] = strU;
        return strU;
    }

    @Override // defpackage.emz
    public final String f() throws emy, EOFException {
        String strG;
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 10) {
            strG = v();
        } else if (iS == 9) {
            strG = u(g);
        } else if (iS == 8) {
            strG = u(f);
        } else if (iS == 11) {
            strG = this.p;
            this.p = null;
        } else if (iS == 16) {
            strG = Long.toString(this.n);
        } else {
            if (iS != 17) {
                throw new emx(enb.a(this, "Expected a string but was "));
            }
            strG = this.l.g(this.o);
        }
        this.m = 0;
        int[] iArr = this.e;
        int i2 = this.b - 1;
        iArr[i2] = iArr[i2] + 1;
        return strG;
    }

    @Override // defpackage.emz
    public final void g() throws emy, EOFException {
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 3) {
            throw new emx(enb.a(this, "Expected BEGIN_ARRAY but was "));
        }
        k(1);
        this.e[this.b - 1] = 0;
        this.m = 0;
    }

    @Override // defpackage.emz
    public final void h() throws emy, EOFException {
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 1) {
            throw new emx(enb.a(this, "Expected BEGIN_OBJECT but was "));
        }
        k(3);
        this.m = 0;
    }

    @Override // defpackage.emz
    public final void i() throws emy, EOFException {
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 4) {
            throw new emx(enb.a(this, "Expected END_ARRAY but was "));
        }
        int i2 = this.b;
        this.b = i2 - 1;
        int[] iArr = this.e;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.m = 0;
    }

    @Override // defpackage.emz
    public final void j() throws emy, EOFException {
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 2) {
            throw new emx(enb.a(this, "Expected END_OBJECT but was "));
        }
        int i2 = this.b;
        int i3 = i2 - 1;
        this.b = i3;
        this.d[i3] = null;
        int[] iArr = this.e;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.m = 0;
    }

    @Override // defpackage.emz
    public final void l() throws emy, EOFException {
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 14) {
            z();
        } else if (iS == 13) {
            x(g);
        } else if (iS == 12) {
            x(f);
        } else if (iS != 15) {
            throw new emx(enb.a(this, "Expected a name but was "));
        }
        this.m = 0;
        this.d[this.b - 1] = "null";
    }

    @Override // defpackage.emz
    public final void m() throws emy, EOFException {
        int i2 = 0;
        do {
            int iS = this.m;
            if (iS == 0) {
                iS = s();
            }
            if (iS == 3) {
                k(1);
            } else {
                if (iS == 1) {
                    k(3);
                } else if (iS == 4) {
                    i2--;
                    if (i2 < 0) {
                        throw new emx(enb.a(this, "Expected a value but was "));
                    }
                    this.b--;
                } else if (iS == 2) {
                    i2--;
                    if (i2 < 0) {
                        throw new emx(enb.a(this, "Expected a value but was "));
                    }
                    this.b--;
                } else if (iS == 14 || iS == 10) {
                    z();
                } else if (iS == 9 || iS == 13) {
                    x(g);
                } else if (iS == 8 || iS == 12) {
                    x(f);
                } else if (iS == 17) {
                    this.l.k(this.o);
                } else if (iS == 18) {
                    throw new emx(enb.a(this, "Expected a value but was "));
                }
                this.m = 0;
            }
            i2++;
            this.m = 0;
        } while (i2 != 0);
        int[] iArr = this.e;
        int i3 = this.b - 1;
        iArr[i3] = iArr[i3] + 1;
        this.d[i3] = "null";
    }

    @Override // defpackage.emz
    public final boolean n() throws emy, EOFException {
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        return (iS == 2 || iS == 4 || iS == 18) ? false : true;
    }

    @Override // defpackage.emz
    public final boolean o() throws emy, EOFException {
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 5) {
            this.m = 0;
            int[] iArr = this.e;
            int i2 = this.b - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (iS != 6) {
            throw new emx(enb.a(this, "Expected a boolean but was "));
        }
        this.m = 0;
        int[] iArr2 = this.e;
        int i3 = this.b - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    @Override // defpackage.emz
    public final int p() throws emy, EOFException {
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        switch (iS) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            default:
                return 10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008b A[LOOP:2: B:24:0x0051->B:40:0x008b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x011d A[LOOP:1: B:17:0x003f->B:69:0x011d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0084 A[SYNTHETIC] */
    @Override // defpackage.emz
    public final int q(boy boyVar) throws emy, EOFException {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        axio axioVar;
        byte[] bArr;
        int i7;
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        int i8 = -1;
        if (iS < 12 || iS > 15) {
            return -1;
        }
        if (iS == 15) {
            return B(this.p, boyVar);
        }
        axih axihVar = this.k;
        Object obj = boyVar.b;
        axin axinVar = (axin) axihVar;
        if (axinVar.c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            axig axigVar = axinVar.b;
            int i9 = axis.a;
            axio axioVar2 = axigVar.a;
            if (axioVar2 != null) {
                int[] iArr = ((axik) obj).b;
                int i10 = axioVar2.b;
                int i11 = axioVar2.c;
                byte[] bArr2 = axioVar2.a;
                int i12 = i8;
                axio axioVar3 = axioVar2;
                int i13 = 0;
                while (true) {
                    int i14 = iArr[i13];
                    int i15 = iArr[i13 + 1];
                    if (i15 != i8) {
                        i12 = i15;
                    }
                    if (axioVar3 != null) {
                        int i16 = i13 + 2;
                        if (i14 < 0) {
                            int i17 = (-i14) + i16;
                            while (true) {
                                int i18 = i10 + 1;
                                int i19 = i16 + 1;
                                if ((bArr2[i10] & 255) == iArr[i16]) {
                                    boolean z = true;
                                    boolean z2 = i19 == i17;
                                    if (i18 == i11) {
                                        axioVar3.getClass();
                                        axioVar = axioVar3.f;
                                        axioVar.getClass();
                                        i6 = axioVar.b;
                                        i7 = axioVar.c;
                                        bArr = axioVar.a;
                                        if (axioVar == axioVar2) {
                                            if (z2) {
                                                axioVar = null;
                                            }
                                        }
                                        if (z) {
                                            i5 = iArr[i19];
                                            i10 = i6;
                                            i11 = i7;
                                            bArr2 = bArr;
                                            axioVar3 = axioVar;
                                            if (i5 >= 0) {
                                                i3 = i5;
                                            } else {
                                                i13 = -i5;
                                                i8 = -1;
                                            }
                                        } else {
                                            i16 = i19;
                                            i10 = i6;
                                            i11 = i7;
                                            bArr2 = bArr;
                                            axioVar3 = axioVar;
                                        }
                                    } else {
                                        int i20 = i11;
                                        i6 = i18;
                                        axioVar = axioVar3;
                                        bArr = bArr2;
                                        i7 = i20;
                                    }
                                    z = z2;
                                    if (z) {
                                        i5 = iArr[i19];
                                        i10 = i6;
                                        i11 = i7;
                                        bArr2 = bArr;
                                        axioVar3 = axioVar;
                                        if (i5 >= 0) {
                                            i3 = i5;
                                        } else {
                                            i13 = -i5;
                                            i8 = -1;
                                        }
                                    } else {
                                        i16 = i19;
                                        i10 = i6;
                                        i11 = i7;
                                        bArr2 = bArr;
                                        axioVar3 = axioVar;
                                    }
                                } else {
                                    i3 = i12;
                                }
                            }
                        } else {
                            int i21 = i10 + 1;
                            int i22 = bArr2[i10] & 255;
                            int i23 = i16 + i14;
                            while (true) {
                                if (i16 == i23) {
                                    i3 = i12;
                                } else if (i22 == iArr[i16]) {
                                    i5 = iArr[i16 + i14];
                                    if (i21 == i11) {
                                        axioVar3 = axioVar3.f;
                                        axioVar3.getClass();
                                        i10 = axioVar3.b;
                                        i11 = axioVar3.c;
                                        bArr2 = axioVar3.a;
                                        if (axioVar3 == axioVar2) {
                                            axioVar3 = null;
                                        }
                                    } else {
                                        i10 = i21;
                                    }
                                    if (i5 >= 0) {
                                        i3 = i5;
                                    } else {
                                        i13 = -i5;
                                        i8 = -1;
                                    }
                                } else {
                                    i16++;
                                }
                            }
                        }
                        i2 = -2;
                    }
                    i2 = -2;
                    i3 = -2;
                }
            } else {
                i2 = -2;
                i3 = -2;
            }
            if (i3 != i2) {
                if (i3 != -1) {
                    axigVar.k(((axik) obj).a[i3].b());
                    i4 = -1;
                    break;
                }
            } else if (axinVar.a.e(axigVar, 8192L) != -1) {
                i8 = -1;
            }
            i4 = -1;
            i3 = -1;
            break;
        }
        if (i3 != i4) {
            this.m = 0;
            this.d[this.b + i4] = ((String[]) boyVar.a)[i3];
            return i3;
        }
        String str = this.d[this.b + i4];
        String strE = e();
        int iB = B(strE, boyVar);
        if (iB != i4) {
            return iB;
        }
        this.m = 15;
        this.p = strE;
        this.d[this.b + i4] = str;
        return i4;
    }

    public final String toString() {
        return "JsonReader(" + this.k.toString() + ')';
    }
}
