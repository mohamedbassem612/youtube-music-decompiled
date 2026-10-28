package defpackage;

import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aa implements Cloneable {
    public static final int[] e;
    private static final int h;
    public String a;
    public ArrayList c;
    public boolean d;
    private boolean g;
    public ArrayList b = new ArrayList();
    public final int f = h;

    static {
        int i;
        String strA = d.a();
        int iHashCode = strA.hashCode();
        if (iHashCode == -413919155) {
            if (strA.equals("DOUBLE_REQUIRED")) {
                i = 2;
                h = i;
                e = afxw.f();
                return;
            }
            throw new IllegalArgumentException();
        }
        if (iHashCode == -99796978 && strA.equals("DOUBLE_OPTIONAL")) {
            i = 1;
            h = i;
            e = afxw.f();
            return;
        }
        throw new IllegalArgumentException();
    }

    public aa(String str) {
        i(str);
    }

    private final int j(int i) {
        char cCharAt;
        while (i < this.a.length() && (((cCharAt = this.a.charAt(i)) >= '0' || "+-.".indexOf(cCharAt) >= 0) && (cCharAt <= '9' || cCharAt == 'e' || cCharAt == 'E' || cCharAt == 8734))) {
            i++;
        }
        return i;
    }

    private final int k(int i) {
        String str = this.a;
        byte[] bArr = g.a;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt > 255) {
                if (cCharAt >= 8206) {
                    if (cCharAt > 12336) {
                        if (cCharAt >= 64830 && cCharAt <= 65094 && (cCharAt <= 64831 || cCharAt >= 65093)) {
                            break;
                        }
                    } else if (((g.c[g.b[(cCharAt - 8192) >> 5]] >> (cCharAt & 31)) & 1) != 0) {
                        break;
                    }
                } else {
                    continue;
                }
                i++;
            } else {
                if (g.a[cCharAt] != 0) {
                    break;
                }
                i++;
            }
        }
        return i;
    }

    private final int l(int i) {
        String str = this.a;
        byte[] bArr = g.a;
        while (i < str.length() && g.a(str.charAt(i))) {
            i++;
        }
        return i;
    }

    private final String m() {
        return o(this.a, 0);
    }

    private final String n(int i) {
        return o(this.a, i);
    }

    private static String o(String str, int i) {
        StringBuilder sb = new StringBuilder(44);
        if (i == 0) {
            sb.append('\"');
        } else {
            sb.append("[at pattern index ");
            sb.append(i);
            sb.append("] \"");
        }
        if (str.length() - i <= 24) {
            if (i != 0) {
                str = str.substring(i);
            }
            sb.append(str);
        } else {
            int i2 = i + 20;
            int i3 = i + 19;
            if (true == Character.isHighSurrogate(str.charAt(i3))) {
                i2 = i3;
            }
            sb.append((CharSequence) str, i, i2);
            sb.append(" ...");
        }
        sb.append('\"');
        return sb.toString();
    }

    private final void p(double d, int i, int i2) {
        int size;
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            this.c = new ArrayList();
            size = 0;
        } else {
            size = arrayList.size();
            if (size > 32767) {
                throw new IndexOutOfBoundsException("Too many numeric values");
            }
        }
        this.c.add(Double.valueOf(d));
        v(14, i, i2, size);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0059 A[LOOP:0: B:22:0x0059->B:32:0x0077, LOOP_START, PHI: r0 r1 r3
      0x0059: PHI (r0v6 char) = (r0v5 char), (r0v11 char) binds: [B:12:0x0031, B:32:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x0059: PHI (r1v5 int) = (r1v4 int), (r1v6 int) binds: [B:12:0x0031, B:32:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x0059: PHI (r3v1 int) = (r3v0 int), (r3v3 int) binds: [B:12:0x0031, B:32:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    private final void q(int i, int i2, boolean z) {
        int i3;
        int i4;
        double d;
        char cCharAt = this.a.charAt(i);
        int i5 = i + 1;
        int i6 = 0;
        if (cCharAt != '-') {
            if (cCharAt == '+') {
                if (i5 != i2) {
                    char cCharAt2 = this.a.charAt(i5);
                    i5 = i + 2;
                    cCharAt = cCharAt2;
                }
            }
            i3 = 0;
            if (cCharAt == 8734) {
                while (true) {
                    i4 = i2 - i;
                    if (cCharAt < '0') {
                        break;
                    } else {
                        break;
                    }
                    char cCharAt3 = this.a.charAt(i5);
                    i5++;
                    cCharAt = cCharAt3;
                }
                p(Double.parseDouble(this.a.substring(i, i2)), i, i4);
                return;
            }
            if (z) {
                int i7 = i2 - i;
                if (1 != i3) {
                    d = Double.POSITIVE_INFINITY;
                } else {
                    d = Double.NEGATIVE_INFINITY;
                }
                p(d, i, i7);
                return;
            }
        } else if (i5 != i2) {
            char cCharAt4 = this.a.charAt(i5);
            i5 = i + 2;
            cCharAt = cCharAt4;
            i3 = 1;
            if (cCharAt == 8734) {
                while (true) {
                    i4 = i2 - i;
                    if (cCharAt < '0' || cCharAt > '9' || (i6 = (i6 * 10) + (cCharAt - '0')) > i3 + 32767) {
                        break;
                    }
                    if (i5 == i2) {
                        if (i3 != 0) {
                            i6 = -i6;
                        }
                        v(13, i, i4, i6);
                        return;
                    } else {
                        char cCharAt5 = this.a.charAt(i5);
                        i5++;
                        cCharAt = cCharAt5;
                    }
                }
                p(Double.parseDouble(this.a.substring(i, i2)), i, i4);
                return;
            }
            if (z && i5 == i2) {
                int i8 = i2 - i;
                if (1 != i3) {
                    d = Double.POSITIVE_INFINITY;
                } else {
                    d = Double.NEGATIVE_INFINITY;
                }
                p(d, i, i8);
                return;
            }
        }
        throw new NumberFormatException("Bad syntax for numeric value: ".concat(String.valueOf(this.a.substring(i, i2))));
    }

    private final boolean r(int i) {
        return i > 0 || ((z) this.b.get(0)).e == 1;
    }

    private final boolean s(int i) {
        char cCharAt = this.a.charAt(i);
        if (cCharAt != 's' && cCharAt != 'S') {
            return false;
        }
        char cCharAt2 = this.a.charAt(i + 1);
        if (cCharAt2 != 'e' && cCharAt2 != 'E') {
            return false;
        }
        int i2 = i + 3;
        char cCharAt3 = this.a.charAt(i + 2);
        if (cCharAt3 != 'l' && cCharAt3 != 'L') {
            return false;
        }
        int i3 = i + 4;
        char cCharAt4 = this.a.charAt(i2);
        if (cCharAt4 != 'e' && cCharAt4 != 'E') {
            return false;
        }
        int i4 = i + 5;
        char cCharAt5 = this.a.charAt(i3);
        if (cCharAt5 != 'c' && cCharAt5 != 'C') {
            return false;
        }
        char cCharAt6 = this.a.charAt(i4);
        return cCharAt6 == 't' || cCharAt6 == 'T';
    }

    /* JADX WARN: Code duplicated, block: B:140:0x021e  */
    /* JADX WARN: Code duplicated, block: B:142:0x0228  */
    /* JADX WARN: Code duplicated, block: B:144:0x022c  */
    /* JADX WARN: Code duplicated, block: B:146:0x0236  */
    /* JADX WARN: Code duplicated, block: B:148:0x023a  */
    /* JADX WARN: Code duplicated, block: B:150:0x0246  */
    /* JADX WARN: Code duplicated, block: B:152:0x024a  */
    /* JADX WARN: Code duplicated, block: B:154:0x0256  */
    /* JADX WARN: Code duplicated, block: B:156:0x025a  */
    /* JADX WARN: Code duplicated, block: B:158:0x0266  */
    /* JADX WARN: Code duplicated, block: B:160:0x026a  */
    /* JADX WARN: Code duplicated, block: B:164:0x0276  */
    /* JADX WARN: Code duplicated, block: B:166:0x027c  */
    /* JADX WARN: Code duplicated, block: B:203:0x0301 A[PHI: r9
      0x0301: PHI (r9v24 int) = (r9v6 int), (r9v8 int), (r9v6 int) binds: [B:170:0x0287, B:202:0x0300, B:165:0x027a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0116 A[EDGE_INSN: B:71:0x0116->B:74:0x011b BREAK  A[LOOP:6: B:60:0x00f2->B:69:0x010a]] */
    /* JADX WARN: Multi-variable type inference failed */
    private final int t(int i, int i2, int i3, int i4) {
        int i5;
        char cCharAt;
        int i6;
        int i7;
        char cCharAt2;
        int i8;
        int iL;
        boolean z;
        int iK;
        int i9;
        char cCharAt3;
        char cCharAt4;
        int i10;
        char cCharAt5;
        int i11;
        char cCharAt6;
        int i12;
        char cCharAt7;
        char cCharAt8;
        char cCharAt9;
        char cCharAt10;
        int i13;
        int i14;
        int i15;
        int i16 = i3;
        int i17 = i4;
        if (i16 > 32767) {
            throw new IndexOutOfBoundsException();
        }
        int size = this.b.size();
        boolean z2 = true;
        v(1, i, i2, i16);
        int length = i + i2;
        while (true) {
            if (length >= this.a.length()) {
                int i18 = i16;
                int i19 = size;
                if (i18 > 0 && (i18 != 1 || i17 != 3 || ((z) this.b.get(0)).e == 1)) {
                    throw new IllegalArgumentException("Unmatched '{' braces in message ".concat(m()));
                }
                u(i19, 2, length, 0, i18);
                return length;
            }
            i5 = length + 1;
            cCharAt = this.a.charAt(length);
            if (cCharAt == '\'') {
                if (i5 != this.a.length()) {
                    char cCharAt11 = this.a.charAt(i5);
                    if (cCharAt11 != '\'') {
                        if (this.f != 2 && cCharAt11 != '{' && cCharAt11 != '}') {
                            if (i17 != 3) {
                                i15 = i17;
                            } else if (cCharAt11 != '|') {
                                i15 = 3;
                            }
                            if (!a.b(i15) || cCharAt11 != '#') {
                                v(4, i5, 0, 39);
                            }
                        }
                        v(3, length, z2 ? 1 : 0, 0);
                        while (true) {
                            int iIndexOf = this.a.indexOf(39, i5 + (z2 ? 1 : 0));
                            String str = this.a;
                            if (iIndexOf < 0) {
                                length = str.length();
                                v(4, length, 0, 39);
                                break;
                            }
                            i5 = iIndexOf + 1;
                            if (i5 >= str.length() || this.a.charAt(i5) != '\'') {
                                v(3, iIndexOf, z2 ? 1 : 0, 0);
                                length = i5;
                                break;
                            }
                            v(3, i5, z2 ? 1 : 0, 0);
                        }
                    } else {
                        length += 2;
                        v(3, i5, z2 ? 1 : 0, 0);
                    }
                } else {
                    v(4, i5, 0, 39);
                }
            } else if (a.b(i17) && cCharAt == '#') {
                v(5, length, z2 ? 1 : 0, 0);
            } else {
                if (cCharAt != '{') {
                    if (i16 > 0 && cCharAt == '}') {
                        cCharAt = '}';
                        i6 = 3;
                        break;
                    }
                    i6 = 3;
                    if (i17 == 3 && cCharAt == '|') {
                        i17 = 3;
                        break;
                    }
                } else {
                    int size2 = this.b.size();
                    v(6, length, z2 ? 1 : 0, 0);
                    int iL2 = l(length + 1);
                    if (iL2 == this.a.length()) {
                        throw new IllegalArgumentException("Unmatched '{' braces in message ".concat(m()));
                    }
                    int iK2 = k(iL2);
                    String str2 = this.a;
                    byte b = -1;
                    if (iL2 >= iK2) {
                        i7 = -2;
                        break;
                    }
                    int i20 = iL2 + 1;
                    char cCharAt12 = str2.charAt(iL2);
                    if (cCharAt12 == '0') {
                        if (i20 == iK2) {
                            i7 = 0;
                        } else {
                            i13 = 0;
                            i14 = z2 ? 1 : 0;
                        }
                    } else {
                        if (cCharAt12 < '1' || cCharAt12 > '9') {
                            i7 = -1;
                            break;
                        }
                        i13 = cCharAt12 - '0';
                        i14 = 0;
                    }
                    while (true) {
                        if (i20 >= iK2) {
                            if (i14 == 0) {
                                i7 = i13;
                                break;
                            }
                            i7 = -2;
                            break;
                        }
                        int i21 = i20 + 1;
                        char cCharAt13 = str2.charAt(i20);
                        if (cCharAt13 < '0' || cCharAt13 > '9') {
                            i7 = -1;
                            break;
                        }
                        i14 |= (i13 >= 214748364 ? (char) 0 : z2 ? 1 : 0) ^ (z2 ? 1 : 0);
                        i13 = (i13 * 10) + (cCharAt13 - '0');
                        i20 = i21;
                    }
                    if (i7 >= 0) {
                        int i22 = iK2 - iL2;
                        if (i22 > 65535 || i7 > 32767) {
                            throw new IndexOutOfBoundsException("Argument number too large: ".concat(n(iL2)));
                        }
                        v(8, iL2, i22, i7);
                    } else {
                        if (i7 != -1) {
                            throw new IllegalArgumentException("Bad argument syntax: ".concat(n(iL2)));
                        }
                        int i23 = iK2 - iL2;
                        if (i23 > 65535) {
                            throw new IndexOutOfBoundsException("Argument name too long: ".concat(n(iL2)));
                        }
                        this.d = z2;
                        v(9, iL2, i23, 0);
                    }
                    int iL3 = l(iK2);
                    if (iL3 == this.a.length()) {
                        throw new IllegalArgumentException("Unmatched '{' braces in message ".concat(m()));
                    }
                    char cCharAt14 = this.a.charAt(iL3);
                    if (cCharAt14 != '}') {
                        if (cCharAt14 != ',') {
                            throw new IllegalArgumentException("Bad argument syntax: ".concat(n(iL2)));
                        }
                        int iL4 = l(iL3 + 1);
                        int i24 = iL4;
                        while (true) {
                            byte b2 = b;
                            if (i24 >= this.a.length() || (((cCharAt10 = this.a.charAt(i24)) < 'a' || cCharAt10 > 'z') && (cCharAt10 < 'A' || cCharAt10 > 'Z'))) {
                                break;
                            }
                            i24++;
                            b = b2;
                        }
                        int i25 = i24 - iL4;
                        int iL5 = l(i24);
                        if (iL5 == this.a.length()) {
                            throw new IllegalArgumentException("Unmatched '{' braces in message ".concat(m()));
                        }
                        if (i25 != 0) {
                            char cCharAt15 = this.a.charAt(iL5);
                            if (cCharAt15 != ',') {
                                if (cCharAt15 == '}') {
                                    cCharAt15 = '}';
                                }
                            }
                            if (i25 > 65535) {
                                throw new IndexOutOfBoundsException("Argument type name too long: ".concat(n(iL2)));
                            }
                            if (i25 == 6) {
                                int i26 = iL4 + 1;
                                char cCharAt16 = this.a.charAt(iL4);
                                if (cCharAt16 == 'c' || cCharAt16 == 'C') {
                                    int i27 = iL4 + 2;
                                    char cCharAt17 = this.a.charAt(i26);
                                    if (cCharAt17 == 'h' || cCharAt17 == 'H') {
                                        int i28 = iL4 + 3;
                                        char cCharAt18 = this.a.charAt(i27);
                                        if (cCharAt18 == 'o' || cCharAt18 == 'O') {
                                            int i29 = iL4 + 4;
                                            char cCharAt19 = this.a.charAt(i28);
                                            if (cCharAt19 == 'i' || cCharAt19 == 'I') {
                                                int i30 = iL4 + 5;
                                                char cCharAt20 = this.a.charAt(i29);
                                                if ((cCharAt20 == 'c' || cCharAt20 == 'C') && ((cCharAt3 = this.a.charAt(i30)) == 'e' || cCharAt3 == 'E')) {
                                                    i8 = 3;
                                                } else {
                                                    cCharAt4 = this.a.charAt(iL4);
                                                    if (cCharAt4 != 'p' || cCharAt4 == 'P') {
                                                        i10 = iL4 + 2;
                                                        cCharAt5 = this.a.charAt(i26);
                                                        if (cCharAt5 != 'l' || cCharAt5 == 'L') {
                                                            i11 = iL4 + 3;
                                                            cCharAt6 = this.a.charAt(i10);
                                                            if (cCharAt6 != 'u' || cCharAt6 == 'U') {
                                                                i12 = iL4 + 4;
                                                                cCharAt7 = this.a.charAt(i11);
                                                                if (cCharAt7 != 'r' || cCharAt7 == 'R') {
                                                                    int i31 = iL4 + 5;
                                                                    cCharAt8 = this.a.charAt(i12);
                                                                    if ((cCharAt8 == 'a' && cCharAt8 != 'A') || ((cCharAt9 = this.a.charAt(i31)) != 'l' && cCharAt9 != 'L')) {
                                                                        if (s(iL4)) {
                                                                            i8 = 5;
                                                                        } else {
                                                                            i8 = 2;
                                                                        }
                                                                    }
                                                                } else if (s(iL4)) {
                                                                    i8 = 5;
                                                                } else {
                                                                    i8 = 2;
                                                                }
                                                            } else if (s(iL4)) {
                                                                i8 = 5;
                                                            } else {
                                                                i8 = 2;
                                                            }
                                                        } else if (s(iL4)) {
                                                            i8 = 5;
                                                        } else {
                                                            i8 = 2;
                                                        }
                                                    } else if (s(iL4)) {
                                                        i8 = 5;
                                                    } else {
                                                        i8 = 2;
                                                    }
                                                }
                                            } else {
                                                cCharAt4 = this.a.charAt(iL4);
                                                if (cCharAt4 != 'p') {
                                                    i10 = iL4 + 2;
                                                    cCharAt5 = this.a.charAt(i26);
                                                    if (cCharAt5 != 'l') {
                                                        i11 = iL4 + 3;
                                                        cCharAt6 = this.a.charAt(i10);
                                                        if (cCharAt6 != 'u') {
                                                            i12 = iL4 + 4;
                                                            cCharAt7 = this.a.charAt(i11);
                                                            if (cCharAt7 != 'r') {
                                                                int i32 = iL4 + 5;
                                                                cCharAt8 = this.a.charAt(i12);
                                                                i8 = cCharAt8 == 'a' ? 4 : 4;
                                                            } else {
                                                                int i33 = iL4 + 5;
                                                                cCharAt8 = this.a.charAt(i12);
                                                                if (cCharAt8 == 'a') {
                                                                }
                                                            }
                                                        } else {
                                                            i12 = iL4 + 4;
                                                            cCharAt7 = this.a.charAt(i11);
                                                            if (cCharAt7 != 'r') {
                                                                int i34 = iL4 + 5;
                                                                cCharAt8 = this.a.charAt(i12);
                                                                if (cCharAt8 == 'a') {
                                                                }
                                                            } else {
                                                                int i35 = iL4 + 5;
                                                                cCharAt8 = this.a.charAt(i12);
                                                                if (cCharAt8 == 'a') {
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        i11 = iL4 + 3;
                                                        cCharAt6 = this.a.charAt(i10);
                                                        if (cCharAt6 != 'u') {
                                                            i12 = iL4 + 4;
                                                            cCharAt7 = this.a.charAt(i11);
                                                            if (cCharAt7 != 'r') {
                                                                int i36 = iL4 + 5;
                                                                cCharAt8 = this.a.charAt(i12);
                                                                if (cCharAt8 == 'a') {
                                                                }
                                                            } else {
                                                                int i37 = iL4 + 5;
                                                                cCharAt8 = this.a.charAt(i12);
                                                                if (cCharAt8 == 'a') {
                                                                }
                                                            }
                                                        } else {
                                                            i12 = iL4 + 4;
                                                            cCharAt7 = this.a.charAt(i11);
                                                            if (cCharAt7 != 'r') {
                                                                int i38 = iL4 + 5;
                                                                cCharAt8 = this.a.charAt(i12);
                                                                if (cCharAt8 == 'a') {
                                                                }
                                                            } else {
                                                                int i39 = iL4 + 5;
                                                                cCharAt8 = this.a.charAt(i12);
                                                                if (cCharAt8 == 'a') {
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    i10 = iL4 + 2;
                                                    cCharAt5 = this.a.charAt(i26);
                                                    if (cCharAt5 != 'l') {
                                                        i11 = iL4 + 3;
                                                        cCharAt6 = this.a.charAt(i10);
                                                        if (cCharAt6 != 'u') {
                                                            i12 = iL4 + 4;
                                                            cCharAt7 = this.a.charAt(i11);
                                                            if (cCharAt7 != 'r') {
                                                                int i310 = iL4 + 5;
                                                                cCharAt8 = this.a.charAt(i12);
                                                                if (cCharAt8 == 'a') {
                                                                }
                                                            } else {
                                                                int i311 = iL4 + 5;
                                                                cCharAt8 = this.a.charAt(i12);
                                                                if (cCharAt8 == 'a') {
                                                                }
                                                            }
                                                        } else {
                                                            i12 = iL4 + 4;
                                                            cCharAt7 = this.a.charAt(i11);
                                                            if (cCharAt7 != 'r') {
                                                                int i312 = iL4 + 5;
                                                                cCharAt8 = this.a.charAt(i12);
                                                                if (cCharAt8 == 'a') {
                                                                }
                                                            } else {
                                                                int i313 = iL4 + 5;
                                                                cCharAt8 = this.a.charAt(i12);
                                                                if (cCharAt8 == 'a') {
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        i11 = iL4 + 3;
                                                        cCharAt6 = this.a.charAt(i10);
                                                        if (cCharAt6 != 'u') {
                                                            i12 = iL4 + 4;
                                                            cCharAt7 = this.a.charAt(i11);
                                                            if (cCharAt7 != 'r') {
                                                                int i314 = iL4 + 5;
                                                                cCharAt8 = this.a.charAt(i12);
                                                                if (cCharAt8 == 'a') {
                                                                }
                                                            } else {
                                                                int i315 = iL4 + 5;
                                                                cCharAt8 = this.a.charAt(i12);
                                                                if (cCharAt8 == 'a') {
                                                                }
                                                            }
                                                        } else {
                                                            i12 = iL4 + 4;
                                                            cCharAt7 = this.a.charAt(i11);
                                                            if (cCharAt7 != 'r') {
                                                                int i316 = iL4 + 5;
                                                                cCharAt8 = this.a.charAt(i12);
                                                                if (cCharAt8 == 'a') {
                                                                }
                                                            } else {
                                                                int i317 = iL4 + 5;
                                                                cCharAt8 = this.a.charAt(i12);
                                                                if (cCharAt8 == 'a') {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            cCharAt4 = this.a.charAt(iL4);
                                            if (cCharAt4 != 'p') {
                                                i10 = iL4 + 2;
                                                cCharAt5 = this.a.charAt(i26);
                                                if (cCharAt5 != 'l') {
                                                    i11 = iL4 + 3;
                                                    cCharAt6 = this.a.charAt(i10);
                                                    if (cCharAt6 != 'u') {
                                                        i12 = iL4 + 4;
                                                        cCharAt7 = this.a.charAt(i11);
                                                        if (cCharAt7 != 'r') {
                                                            int i318 = iL4 + 5;
                                                            cCharAt8 = this.a.charAt(i12);
                                                            if (cCharAt8 == 'a') {
                                                            }
                                                        } else {
                                                            int i319 = iL4 + 5;
                                                            cCharAt8 = this.a.charAt(i12);
                                                            if (cCharAt8 == 'a') {
                                                            }
                                                        }
                                                    } else {
                                                        i12 = iL4 + 4;
                                                        cCharAt7 = this.a.charAt(i11);
                                                        if (cCharAt7 != 'r') {
                                                            int i3110 = iL4 + 5;
                                                            cCharAt8 = this.a.charAt(i12);
                                                            if (cCharAt8 == 'a') {
                                                            }
                                                        } else {
                                                            int i3111 = iL4 + 5;
                                                            cCharAt8 = this.a.charAt(i12);
                                                            if (cCharAt8 == 'a') {
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    i11 = iL4 + 3;
                                                    cCharAt6 = this.a.charAt(i10);
                                                    if (cCharAt6 != 'u') {
                                                        i12 = iL4 + 4;
                                                        cCharAt7 = this.a.charAt(i11);
                                                        if (cCharAt7 != 'r') {
                                                            int i3112 = iL4 + 5;
                                                            cCharAt8 = this.a.charAt(i12);
                                                            if (cCharAt8 == 'a') {
                                                            }
                                                        } else {
                                                            int i3113 = iL4 + 5;
                                                            cCharAt8 = this.a.charAt(i12);
                                                            if (cCharAt8 == 'a') {
                                                            }
                                                        }
                                                    } else {
                                                        i12 = iL4 + 4;
                                                        cCharAt7 = this.a.charAt(i11);
                                                        if (cCharAt7 != 'r') {
                                                            int i3114 = iL4 + 5;
                                                            cCharAt8 = this.a.charAt(i12);
                                                            if (cCharAt8 == 'a') {
                                                            }
                                                        } else {
                                                            int i3115 = iL4 + 5;
                                                            cCharAt8 = this.a.charAt(i12);
                                                            if (cCharAt8 == 'a') {
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                i10 = iL4 + 2;
                                                cCharAt5 = this.a.charAt(i26);
                                                if (cCharAt5 != 'l') {
                                                    i11 = iL4 + 3;
                                                    cCharAt6 = this.a.charAt(i10);
                                                    if (cCharAt6 != 'u') {
                                                        i12 = iL4 + 4;
                                                        cCharAt7 = this.a.charAt(i11);
                                                        if (cCharAt7 != 'r') {
                                                            int i3116 = iL4 + 5;
                                                            cCharAt8 = this.a.charAt(i12);
                                                            if (cCharAt8 == 'a') {
                                                            }
                                                        } else {
                                                            int i3117 = iL4 + 5;
                                                            cCharAt8 = this.a.charAt(i12);
                                                            if (cCharAt8 == 'a') {
                                                            }
                                                        }
                                                    } else {
                                                        i12 = iL4 + 4;
                                                        cCharAt7 = this.a.charAt(i11);
                                                        if (cCharAt7 != 'r') {
                                                            int i3118 = iL4 + 5;
                                                            cCharAt8 = this.a.charAt(i12);
                                                            if (cCharAt8 == 'a') {
                                                            }
                                                        } else {
                                                            int i3119 = iL4 + 5;
                                                            cCharAt8 = this.a.charAt(i12);
                                                            if (cCharAt8 == 'a') {
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    i11 = iL4 + 3;
                                                    cCharAt6 = this.a.charAt(i10);
                                                    if (cCharAt6 != 'u') {
                                                        i12 = iL4 + 4;
                                                        cCharAt7 = this.a.charAt(i11);
                                                        if (cCharAt7 != 'r') {
                                                            int i31110 = iL4 + 5;
                                                            cCharAt8 = this.a.charAt(i12);
                                                            if (cCharAt8 == 'a') {
                                                            }
                                                        } else {
                                                            int i31111 = iL4 + 5;
                                                            cCharAt8 = this.a.charAt(i12);
                                                            if (cCharAt8 == 'a') {
                                                            }
                                                        }
                                                    } else {
                                                        i12 = iL4 + 4;
                                                        cCharAt7 = this.a.charAt(i11);
                                                        if (cCharAt7 != 'r') {
                                                            int i31112 = iL4 + 5;
                                                            cCharAt8 = this.a.charAt(i12);
                                                            if (cCharAt8 == 'a') {
                                                            }
                                                        } else {
                                                            int i31113 = iL4 + 5;
                                                            cCharAt8 = this.a.charAt(i12);
                                                            if (cCharAt8 == 'a') {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        cCharAt4 = this.a.charAt(iL4);
                                        if (cCharAt4 != 'p') {
                                            i10 = iL4 + 2;
                                            cCharAt5 = this.a.charAt(i26);
                                            if (cCharAt5 != 'l') {
                                                i11 = iL4 + 3;
                                                cCharAt6 = this.a.charAt(i10);
                                                if (cCharAt6 != 'u') {
                                                    i12 = iL4 + 4;
                                                    cCharAt7 = this.a.charAt(i11);
                                                    if (cCharAt7 != 'r') {
                                                        int i31114 = iL4 + 5;
                                                        cCharAt8 = this.a.charAt(i12);
                                                        if (cCharAt8 == 'a') {
                                                        }
                                                    } else {
                                                        int i31115 = iL4 + 5;
                                                        cCharAt8 = this.a.charAt(i12);
                                                        if (cCharAt8 == 'a') {
                                                        }
                                                    }
                                                } else {
                                                    i12 = iL4 + 4;
                                                    cCharAt7 = this.a.charAt(i11);
                                                    if (cCharAt7 != 'r') {
                                                        int i31116 = iL4 + 5;
                                                        cCharAt8 = this.a.charAt(i12);
                                                        if (cCharAt8 == 'a') {
                                                        }
                                                    } else {
                                                        int i31117 = iL4 + 5;
                                                        cCharAt8 = this.a.charAt(i12);
                                                        if (cCharAt8 == 'a') {
                                                        }
                                                    }
                                                }
                                            } else {
                                                i11 = iL4 + 3;
                                                cCharAt6 = this.a.charAt(i10);
                                                if (cCharAt6 != 'u') {
                                                    i12 = iL4 + 4;
                                                    cCharAt7 = this.a.charAt(i11);
                                                    if (cCharAt7 != 'r') {
                                                        int i31118 = iL4 + 5;
                                                        cCharAt8 = this.a.charAt(i12);
                                                        if (cCharAt8 == 'a') {
                                                        }
                                                    } else {
                                                        int i31119 = iL4 + 5;
                                                        cCharAt8 = this.a.charAt(i12);
                                                        if (cCharAt8 == 'a') {
                                                        }
                                                    }
                                                } else {
                                                    i12 = iL4 + 4;
                                                    cCharAt7 = this.a.charAt(i11);
                                                    if (cCharAt7 != 'r') {
                                                        int i311110 = iL4 + 5;
                                                        cCharAt8 = this.a.charAt(i12);
                                                        if (cCharAt8 == 'a') {
                                                        }
                                                    } else {
                                                        int i311111 = iL4 + 5;
                                                        cCharAt8 = this.a.charAt(i12);
                                                        if (cCharAt8 == 'a') {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            i10 = iL4 + 2;
                                            cCharAt5 = this.a.charAt(i26);
                                            if (cCharAt5 != 'l') {
                                                i11 = iL4 + 3;
                                                cCharAt6 = this.a.charAt(i10);
                                                if (cCharAt6 != 'u') {
                                                    i12 = iL4 + 4;
                                                    cCharAt7 = this.a.charAt(i11);
                                                    if (cCharAt7 != 'r') {
                                                        int i311112 = iL4 + 5;
                                                        cCharAt8 = this.a.charAt(i12);
                                                        if (cCharAt8 == 'a') {
                                                        }
                                                    } else {
                                                        int i311113 = iL4 + 5;
                                                        cCharAt8 = this.a.charAt(i12);
                                                        if (cCharAt8 == 'a') {
                                                        }
                                                    }
                                                } else {
                                                    i12 = iL4 + 4;
                                                    cCharAt7 = this.a.charAt(i11);
                                                    if (cCharAt7 != 'r') {
                                                        int i311114 = iL4 + 5;
                                                        cCharAt8 = this.a.charAt(i12);
                                                        if (cCharAt8 == 'a') {
                                                        }
                                                    } else {
                                                        int i311115 = iL4 + 5;
                                                        cCharAt8 = this.a.charAt(i12);
                                                        if (cCharAt8 == 'a') {
                                                        }
                                                    }
                                                }
                                            } else {
                                                i11 = iL4 + 3;
                                                cCharAt6 = this.a.charAt(i10);
                                                if (cCharAt6 != 'u') {
                                                    i12 = iL4 + 4;
                                                    cCharAt7 = this.a.charAt(i11);
                                                    if (cCharAt7 != 'r') {
                                                        int i311116 = iL4 + 5;
                                                        cCharAt8 = this.a.charAt(i12);
                                                        if (cCharAt8 == 'a') {
                                                        }
                                                    } else {
                                                        int i311117 = iL4 + 5;
                                                        cCharAt8 = this.a.charAt(i12);
                                                        if (cCharAt8 == 'a') {
                                                        }
                                                    }
                                                } else {
                                                    i12 = iL4 + 4;
                                                    cCharAt7 = this.a.charAt(i11);
                                                    if (cCharAt7 != 'r') {
                                                        int i311118 = iL4 + 5;
                                                        cCharAt8 = this.a.charAt(i12);
                                                        if (cCharAt8 == 'a') {
                                                        }
                                                    } else {
                                                        int i311119 = iL4 + 5;
                                                        cCharAt8 = this.a.charAt(i12);
                                                        if (cCharAt8 == 'a') {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    cCharAt4 = this.a.charAt(iL4);
                                    if (cCharAt4 != 'p') {
                                        i10 = iL4 + 2;
                                        cCharAt5 = this.a.charAt(i26);
                                        if (cCharAt5 != 'l') {
                                            i11 = iL4 + 3;
                                            cCharAt6 = this.a.charAt(i10);
                                            if (cCharAt6 != 'u') {
                                                i12 = iL4 + 4;
                                                cCharAt7 = this.a.charAt(i11);
                                                if (cCharAt7 != 'r') {
                                                    int i3111110 = iL4 + 5;
                                                    cCharAt8 = this.a.charAt(i12);
                                                    if (cCharAt8 == 'a') {
                                                    }
                                                } else {
                                                    int i3111111 = iL4 + 5;
                                                    cCharAt8 = this.a.charAt(i12);
                                                    if (cCharAt8 == 'a') {
                                                    }
                                                }
                                            } else {
                                                i12 = iL4 + 4;
                                                cCharAt7 = this.a.charAt(i11);
                                                if (cCharAt7 != 'r') {
                                                    int i3111112 = iL4 + 5;
                                                    cCharAt8 = this.a.charAt(i12);
                                                    if (cCharAt8 == 'a') {
                                                    }
                                                } else {
                                                    int i3111113 = iL4 + 5;
                                                    cCharAt8 = this.a.charAt(i12);
                                                    if (cCharAt8 == 'a') {
                                                    }
                                                }
                                            }
                                        } else {
                                            i11 = iL4 + 3;
                                            cCharAt6 = this.a.charAt(i10);
                                            if (cCharAt6 != 'u') {
                                                i12 = iL4 + 4;
                                                cCharAt7 = this.a.charAt(i11);
                                                if (cCharAt7 != 'r') {
                                                    int i3111114 = iL4 + 5;
                                                    cCharAt8 = this.a.charAt(i12);
                                                    if (cCharAt8 == 'a') {
                                                    }
                                                } else {
                                                    int i3111115 = iL4 + 5;
                                                    cCharAt8 = this.a.charAt(i12);
                                                    if (cCharAt8 == 'a') {
                                                    }
                                                }
                                            } else {
                                                i12 = iL4 + 4;
                                                cCharAt7 = this.a.charAt(i11);
                                                if (cCharAt7 != 'r') {
                                                    int i3111116 = iL4 + 5;
                                                    cCharAt8 = this.a.charAt(i12);
                                                    if (cCharAt8 == 'a') {
                                                    }
                                                } else {
                                                    int i3111117 = iL4 + 5;
                                                    cCharAt8 = this.a.charAt(i12);
                                                    if (cCharAt8 == 'a') {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i10 = iL4 + 2;
                                        cCharAt5 = this.a.charAt(i26);
                                        if (cCharAt5 != 'l') {
                                            i11 = iL4 + 3;
                                            cCharAt6 = this.a.charAt(i10);
                                            if (cCharAt6 != 'u') {
                                                i12 = iL4 + 4;
                                                cCharAt7 = this.a.charAt(i11);
                                                if (cCharAt7 != 'r') {
                                                    int i3111118 = iL4 + 5;
                                                    cCharAt8 = this.a.charAt(i12);
                                                    if (cCharAt8 == 'a') {
                                                    }
                                                } else {
                                                    int i3111119 = iL4 + 5;
                                                    cCharAt8 = this.a.charAt(i12);
                                                    if (cCharAt8 == 'a') {
                                                    }
                                                }
                                            } else {
                                                i12 = iL4 + 4;
                                                cCharAt7 = this.a.charAt(i11);
                                                if (cCharAt7 != 'r') {
                                                    int i31111110 = iL4 + 5;
                                                    cCharAt8 = this.a.charAt(i12);
                                                    if (cCharAt8 == 'a') {
                                                    }
                                                } else {
                                                    int i31111111 = iL4 + 5;
                                                    cCharAt8 = this.a.charAt(i12);
                                                    if (cCharAt8 == 'a') {
                                                    }
                                                }
                                            }
                                        } else {
                                            i11 = iL4 + 3;
                                            cCharAt6 = this.a.charAt(i10);
                                            if (cCharAt6 != 'u') {
                                                i12 = iL4 + 4;
                                                cCharAt7 = this.a.charAt(i11);
                                                if (cCharAt7 != 'r') {
                                                    int i31111112 = iL4 + 5;
                                                    cCharAt8 = this.a.charAt(i12);
                                                    if (cCharAt8 == 'a') {
                                                    }
                                                } else {
                                                    int i31111113 = iL4 + 5;
                                                    cCharAt8 = this.a.charAt(i12);
                                                    if (cCharAt8 == 'a') {
                                                    }
                                                }
                                            } else {
                                                i12 = iL4 + 4;
                                                cCharAt7 = this.a.charAt(i11);
                                                if (cCharAt7 != 'r') {
                                                    int i31111114 = iL4 + 5;
                                                    cCharAt8 = this.a.charAt(i12);
                                                    if (cCharAt8 == 'a') {
                                                    }
                                                } else {
                                                    int i31111115 = iL4 + 5;
                                                    cCharAt8 = this.a.charAt(i12);
                                                    if (cCharAt8 == 'a') {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (i25 != 13) {
                                i8 = 2;
                            } else {
                                if (s(iL4)) {
                                    char cCharAt21 = this.a.charAt(iL4 + 6);
                                    if (cCharAt21 == 'o' || cCharAt21 == 'O') {
                                        int i40 = iL4 + 8;
                                        char cCharAt22 = this.a.charAt(iL4 + 7);
                                        if (cCharAt22 == 'r' || cCharAt22 == 'R') {
                                            int i41 = iL4 + 9;
                                            char cCharAt23 = this.a.charAt(i40);
                                            if (cCharAt23 == 'd' || cCharAt23 == 'D') {
                                                int i42 = iL4 + 10;
                                                char cCharAt24 = this.a.charAt(i41);
                                                if (cCharAt24 == 'i' || cCharAt24 == 'I') {
                                                    int i43 = iL4 + 11;
                                                    char cCharAt25 = this.a.charAt(i42);
                                                    if (cCharAt25 == 'n' || cCharAt25 == 'N') {
                                                        int i44 = iL4 + 12;
                                                        char cCharAt26 = this.a.charAt(i43);
                                                        if ((cCharAt26 == 'a' || cCharAt26 == 'A') && ((cCharAt2 = this.a.charAt(i44)) == 'l' || cCharAt2 == 'L')) {
                                                            i25 = 13;
                                                            i8 = 6;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                i25 = 13;
                                i8 = 2;
                            }
                            ((z) this.b.get(size2)).c = (short) ((i8 == true ? 1 : 0) - 1);
                            if (i8 == 2) {
                                v(10, iL4, i25, 0);
                            }
                            if (cCharAt15 != '}') {
                                int i45 = iL5 + 1;
                                if (i8 == 2) {
                                    iL = i45;
                                    int i46 = 0;
                                    while (true) {
                                        if (iL >= this.a.length()) {
                                            throw new IllegalArgumentException("Unmatched '{' braces in message ".concat(m()));
                                        }
                                        int i47 = iL + 1;
                                        char cCharAt27 = this.a.charAt(iL);
                                        if (cCharAt27 == '\'') {
                                            int iIndexOf2 = this.a.indexOf(39, i47);
                                            if (iIndexOf2 < 0) {
                                                throw new IllegalArgumentException("Quoted literal argument style text reaches to the end of the message: ".concat(n(i45)));
                                            }
                                            iL = iIndexOf2 + 1;
                                        } else {
                                            if (cCharAt27 == '{') {
                                                i46++;
                                            } else if (cCharAt27 == '}') {
                                                if (i46 <= 0) {
                                                    int i48 = iL - i45;
                                                    if (i48 > 65535) {
                                                        throw new IndexOutOfBoundsException("Argument style text too long: ".concat(n(i45)));
                                                    }
                                                    v(11, i45, i48, 0);
                                                    break;
                                                }
                                                i46--;
                                            }
                                            iL = i47;
                                        }
                                    }
                                } else if (i8 == 3) {
                                    int iL6 = l(i45);
                                    if (iL6 == this.a.length() || this.a.charAt(iL6) == '}') {
                                        throw new IllegalArgumentException("Missing choice argument pattern in ".concat(m()));
                                    }
                                    while (true) {
                                        int iJ = j(iL6);
                                        int i49 = iJ - iL6;
                                        if (i49 == 0) {
                                            throw new IllegalArgumentException("Bad choice pattern syntax: ".concat(n(i45)));
                                        }
                                        if (i49 > 65535) {
                                            throw new IndexOutOfBoundsException("Choice number too long: ".concat(n(iL6)));
                                        }
                                        q(iL6, iJ, true);
                                        int iL7 = l(iJ);
                                        if (iL7 == this.a.length()) {
                                            throw new IllegalArgumentException("Bad choice pattern syntax: ".concat(n(i45)));
                                        }
                                        char cCharAt28 = this.a.charAt(iL7);
                                        if (cCharAt28 != '#' && cCharAt28 != '<' && cCharAt28 != 8804) {
                                            throw new IllegalArgumentException("Expected choice separator (#<≤) instead of '" + cCharAt28 + "' in choice pattern " + n(i45));
                                        }
                                        v(12, iL7, 1, 0);
                                        iL = t(iL7 + 1, 0, i16 + 1, 3);
                                        if (iL == this.a.length()) {
                                            break;
                                        }
                                        if (this.a.charAt(iL) == '}') {
                                            if (r(i16)) {
                                                break;
                                            }
                                            throw new IllegalArgumentException("Bad choice pattern syntax: ".concat(n(i45)));
                                        }
                                        iL6 = l(iL + 1);
                                    }
                                } else {
                                    int iJ2 = i45;
                                    boolean z3 = false;
                                    boolean z4 = true;
                                    while (true) {
                                        iL = l(iJ2);
                                        z = iL == this.a.length();
                                        if (z || this.a.charAt(iL) == '}') {
                                            break;
                                        }
                                        if (a.b(i8 == true ? 1 : 0) && this.a.charAt(iL) == '=') {
                                            int i50 = iL + 1;
                                            iK = j(i50);
                                            int i51 = iK - iL;
                                            if (i51 == 1) {
                                                throw new IllegalArgumentException("Bad " + a.a(i8 == true ? 1 : 0).toLowerCase(Locale.ENGLISH) + " pattern syntax: " + n(i45));
                                            }
                                            if (i51 > 65535) {
                                                throw new IndexOutOfBoundsException("Argument selector too long: ".concat(n(iL)));
                                            }
                                            v(12, iL, i51, 0);
                                            q(i50, iK, false);
                                        } else {
                                            iK = k(iL);
                                            int i52 = iK - iL;
                                            if (i52 == 0) {
                                                throw new IllegalArgumentException("Bad " + a.a(i8 == true ? 1 : 0).toLowerCase(Locale.ENGLISH) + " pattern syntax: " + n(i45));
                                            }
                                            if (a.b(i8 == true ? 1 : 0) && i52 == 6) {
                                                if (iK >= this.a.length() || !this.a.regionMatches(iL, "offset:", 0, 7)) {
                                                    i52 = 6;
                                                } else {
                                                    if (!z4) {
                                                        throw new IllegalArgumentException("Plural argument 'offset:' (if present) must precede key-message pairs: ".concat(n(i45)));
                                                    }
                                                    int iL8 = l(iK + 1);
                                                    iJ2 = j(iL8);
                                                    if (iJ2 == iL8) {
                                                        throw new IllegalArgumentException("Missing value for plural 'offset:' ".concat(n(i45)));
                                                    }
                                                    if (iJ2 - iL8 > 65535) {
                                                        throw new IndexOutOfBoundsException("Plural offset value too long: ".concat(n(iL8)));
                                                    }
                                                    q(iL8, iJ2, false);
                                                }
                                                z4 = false;
                                            }
                                            if (i52 > 65535) {
                                                throw new IndexOutOfBoundsException("Argument selector too long: ".concat(n(iL)));
                                            }
                                            v(12, iL, i52, 0);
                                            if (this.a.regionMatches(iL, "other", 0, i52)) {
                                                z3 = true;
                                            }
                                        }
                                        int iL9 = l(iK);
                                        if (iL9 == this.a.length() || this.a.charAt(iL9) != '{') {
                                            throw new IllegalArgumentException("No message fragment after " + a.a(i8 == true ? 1 : 0).toLowerCase(Locale.ENGLISH) + " selector: " + n(iL));
                                        }
                                        iJ2 = t(iL9, 1, i16 + 1, i8 == true ? 1 : 0);
                                        z4 = false;
                                    }
                                    if (z == r(i16)) {
                                        throw new IllegalArgumentException("Bad " + a.a(i8 == true ? 1 : 0).toLowerCase(Locale.ENGLISH) + " pattern syntax: " + n(i45));
                                    }
                                    if (!z3) {
                                        throw new IllegalArgumentException("Missing 'other' keyword in " + a.a(i8 == true ? 1 : 0).toLowerCase(Locale.ENGLISH) + " pattern in " + m());
                                    }
                                }
                                i9 = iL;
                            } else {
                                if (i8 != 2) {
                                    throw new IllegalArgumentException("No style field for complex argument: ".concat(n(iL2)));
                                }
                                i9 = iL5;
                            }
                        }
                        throw new IllegalArgumentException("Bad argument syntax: ".concat(n(iL2)));
                    }
                    i8 = z2 ? 1 : 0;
                    i9 = iL3;
                    u(size2, 7, i9, 1, i8 - 1);
                    length = i9 + 1;
                }
                z2 = true;
            }
            size = size;
            i16 = i16;
            length = i5;
            z2 = true;
        }
        u(size, 2, length, (i17 == i6 && cCharAt == '}') ? 0 : 1, i16);
        return i17 != i6 ? i5 : length;
    }

    private final void u(int i, int i2, int i3, int i4, int i5) {
        ((z) this.b.get(i)).d = this.b.size();
        v(i2, i3, i4, i5);
    }

    private final void v(int i, int i2, int i3, int i4) {
        this.b.add(new z(i, i2, i3, i4));
    }

    public final double a(z zVar) {
        int i = zVar.e;
        if (i == 13) {
            return zVar.c;
        }
        if (i == 14) {
            return ((Double) this.c.get(zVar.c)).doubleValue();
        }
        return -1.23456789E8d;
    }

    public final int b() {
        return this.b.size();
    }

    public final int c(int i) {
        int i2 = ((z) this.b.get(i)).d;
        return i2 >= i ? i2 : i;
    }

    public final Object clone() {
        return e();
    }

    public final z d(int i) {
        return (z) this.b.get(i);
    }

    public final aa e() {
        try {
            aa aaVar = (aa) super.clone();
            aaVar.b = (ArrayList) this.b.clone();
            ArrayList arrayList = this.c;
            if (arrayList != null) {
                aaVar.c = (ArrayList) arrayList.clone();
            }
            aaVar.g = false;
            return aaVar;
        } catch (CloneNotSupportedException e2) {
            throw new ab(e2);
        }
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aa aaVar = (aa) obj;
            int i = this.f;
            int i2 = aaVar.f;
            if (i == 0) {
                throw null;
            }
            if (i == i2 && ((str = this.a) != null ? str.equals(aaVar.a) : aaVar.a == null) && this.b.equals(aaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final String f(z zVar) {
        int i = zVar.a;
        return this.a.substring(i, zVar.b + i);
    }

    public final boolean g(z zVar, String str) {
        return this.a.regionMatches(zVar.a, str, 0, zVar.b);
    }

    public final int h(int i) {
        return ((z) this.b.get(i)).e;
    }

    public final int hashCode() {
        int i = this.f;
        a.bj(i);
        String str = this.a;
        return (((i * 37) + (str != null ? str.hashCode() : 0)) * 37) + this.b.hashCode();
    }

    public final void i(String str) {
        this.a = str;
        this.d = false;
        this.b.clear();
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            arrayList.clear();
        }
        t(0, 0, 0, 1);
    }

    public final String toString() {
        return this.a;
    }

    public aa() {
    }
}
