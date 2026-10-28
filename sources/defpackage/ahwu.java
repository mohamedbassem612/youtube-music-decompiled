package defpackage;

import app.rive.semantics.SemanticState;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ahwu implements Closeable {
    public long d;
    public int e;
    public String f;
    public String[] h;
    public int[] i;
    private final Reader j;
    private int[] o;
    public final char[] a = new char[SemanticState.ReadOnly];
    public int b = 0;
    private int k = 0;
    private long l = 0;
    private int m = 0;
    private int n = 0;
    public int c = 0;
    public int g = 1;

    static {
        aewo.f = new aewo(null);
    }

    public ahwu(Reader reader) {
        int[] iArr = new int[32];
        this.o = iArr;
        iArr[0] = 6;
        this.h = new String[32];
        this.i = new int[32];
        this.j = reader;
    }

    private final int k(boolean z) throws IOException {
        int i = this.b;
        int i2 = this.k;
        while (true) {
            if (i == i2) {
                this.b = i;
                if (!n(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(d()));
                    }
                    return -1;
                }
                i = this.b;
                i2 = this.k;
            }
            char[] cArr = this.a;
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.m++;
                this.n = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.b = i3;
                    if (i3 == i2) {
                        this.b = i;
                        boolean zN = n(2);
                        this.b++;
                        if (zN) {
                        }
                        return 47;
                    }
                    l();
                    int i4 = this.b;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.b = i4 + 1;
                        while (true) {
                            if (this.b + 2 > this.k && !n(2)) {
                                throw b("Unterminated comment");
                            }
                            int i5 = this.b;
                            if (cArr[i5] != '\n') {
                                int i6 = 0;
                                while (true) {
                                    int i7 = this.b;
                                    if (i6 >= 2) {
                                        i = i7 + 2;
                                        i2 = this.k;
                                        break;
                                    }
                                    if (cArr[i7 + i6] != "*/".charAt(i6)) {
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                this.m++;
                                this.n = i5 + 1;
                            }
                            this.b++;
                        }
                    } else {
                        if (c2 != '/') {
                            return 47;
                        }
                        this.b = i4 + 1;
                        m();
                        i = this.b;
                        i2 = this.k;
                    }
                } else {
                    if (c != '#') {
                        this.b = i3;
                        return c;
                    }
                    this.b = i3;
                    l();
                    m();
                    i = this.b;
                    i2 = this.k;
                }
            }
            i = i3;
        }
    }

    private final void l() throws ahwv {
        throw b("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
    }

    private final void m() {
        char c;
        do {
            if (this.b >= this.k && !n(1)) {
                return;
            }
            char[] cArr = this.a;
            int i = this.b;
            int i2 = i + 1;
            this.b = i2;
            c = cArr[i];
            if (c == '\n') {
                this.m++;
                this.n = i2;
                return;
            }
        } while (c != '\r');
    }

    private final boolean n(int i) throws IOException {
        int i2;
        int i3 = this.n;
        int i4 = this.b;
        this.n = i3 - i4;
        this.l += (long) i4;
        char[] cArr = this.a;
        int i5 = this.k;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.k = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.k = 0;
        }
        this.b = 0;
        do {
            Reader reader = this.j;
            int i7 = this.k;
            int i8 = reader.read(cArr, i7, 1024 - i7);
            if (i8 == -1) {
                return false;
            }
            i2 = this.k + i8;
            this.k = i2;
            if (this.l == 0 && this.b == 0 && i2 > 0 && cArr[0] == 65279) {
                this.b = 1;
                this.n++;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0039  */
    private final boolean o(char c) throws ahwv {
        if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
            if (c == '#') {
                l();
            } else if (c != ',') {
                if (c == '/' || c == '=') {
                    l();
                } else if (c != '{' && c != '}' && c != ':') {
                    if (c != ';') {
                        switch (c) {
                            case '\\':
                                l();
                            case '[':
                            case ']':
                                return false;
                            default:
                                return true;
                        }
                    } else {
                        l();
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0166  */
    /* JADX WARN: Code duplicated, block: B:103:0x016e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0184  */
    /* JADX WARN: Code duplicated, block: B:111:0x0196  */
    /* JADX WARN: Code duplicated, block: B:113:0x019a  */
    /* JADX WARN: Code duplicated, block: B:115:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:116:0x01a6 A[PHI: r1 r4
      0x01a6: PHI (r1v36 int) = (r1v35 int), (r1v54 int) binds: [B:110:0x0194, B:115:0x01a2] A[DONT_GENERATE, DONT_INLINE]
      0x01a6: PHI (r4v8 int) = (r4v7 int), (r4v9 int) binds: [B:110:0x0194, B:115:0x01a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:118:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:120:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:12:0x003d  */
    /* JADX WARN: Code duplicated, block: B:155:0x0217  */
    /* JADX WARN: Code duplicated, block: B:156:0x0219  */
    /* JADX WARN: Code duplicated, block: B:158:0x021f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x0222  */
    /* JADX WARN: Code duplicated, block: B:163:0x0228 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:165:0x022b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x023c A[DONT_INVERT, PHI: r9
      0x023c: PHI (r9v16 char) = (r9v7 char), (r9v17 char) binds: [B:154:0x0215, B:169:0x023b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:171:0x023e  */
    /* JADX WARN: Code duplicated, block: B:182:0x0256 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:183:0x0258  */
    /* JADX WARN: Code duplicated, block: B:186:0x025d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:191:0x0267  */
    /* JADX WARN: Code duplicated, block: B:193:0x0271  */
    /* JADX WARN: Code duplicated, block: B:194:0x0279  */
    /* JADX WARN: Code duplicated, block: B:196:0x0280  */
    /* JADX WARN: Code duplicated, block: B:197:0x0282  */
    /* JADX WARN: Code duplicated, block: B:198:0x0284 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:200:0x0287  */
    /* JADX WARN: Code duplicated, block: B:202:0x028b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:206:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:207:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:215:0x0264 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0264 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0215 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x009e  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:72:0x0103  */
    /* JADX WARN: Code duplicated, block: B:74:0x0112  */
    /* JADX WARN: Code duplicated, block: B:76:0x0116  */
    /* JADX WARN: Code duplicated, block: B:78:0x011a  */
    /* JADX WARN: Code duplicated, block: B:80:0x011e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0122  */
    /* JADX WARN: Code duplicated, block: B:85:0x012c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0132  */
    /* JADX WARN: Code duplicated, block: B:90:0x0140  */
    /* JADX WARN: Code duplicated, block: B:92:0x0145  */
    /* JADX WARN: Code duplicated, block: B:94:0x014d  */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0228, code lost:
    
        if (r15 == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0284, code lost:
    
        if (r4 == 1) goto L208;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahwu.a():int");
    }

    public final ahwv b(String str) throws ahwv {
        throw new ahwv(str + d() + "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json");
    }

    public final IllegalStateException c(String str) throws IOException {
        int i = i();
        String strAH = a.aH(i());
        String strD = d();
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(str);
        sb.append(" but was ");
        sb.append(strAH);
        sb.append(strD);
        sb.append("\nSee ");
        sb.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(i == 9 ? "adapter-not-null-safe" : "unexpected-json-structure"));
        return new IllegalStateException(sb.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.c = 0;
        this.o[0] = 8;
        this.g = 1;
        this.j.close();
    }

    public final String d() {
        int i = this.m + 1;
        int i2 = this.b - this.n;
        return " at line " + i + " column " + (i2 + 1) + " path " + j();
    }

    public final String e(char c) throws ahwv {
        char[] cArr;
        int i;
        StringBuilder sb = null;
        do {
            int i2 = this.b;
            int i3 = this.k;
            int i4 = i2;
            while (true) {
                cArr = this.a;
                if (i2 < i3) {
                    int i5 = i2 + 1;
                    char c2 = cArr[i2];
                    if (c2 == c) {
                        int i6 = (i5 - i4) - 1;
                        this.b = i5;
                        if (sb == null) {
                            return new String(cArr, i4, i6);
                        }
                        sb.append(cArr, i4, i6);
                        return sb.toString();
                    }
                    char c3 = '\n';
                    if (c2 == '\\') {
                        int i7 = i5 - i4;
                        int i8 = i7 - 1;
                        this.b = i5;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max(i7 << 1, 16));
                        }
                        sb.append(cArr, i4, i8);
                        if (this.b == this.k && !n(1)) {
                            throw b("Unterminated escape sequence");
                        }
                        int i9 = this.b;
                        int i10 = i9 + 1;
                        this.b = i10;
                        char c4 = cArr[i9];
                        if (c4 != '\n') {
                            if (c4 != '\"' && c4 != '\'' && c4 != '/' && c4 != '\\') {
                                if (c4 == 'b') {
                                    c3 = '\b';
                                } else if (c4 == 'f') {
                                    c3 = '\f';
                                } else if (c4 != 'n') {
                                    if (c4 == 'r') {
                                        c3 = '\r';
                                    } else if (c4 == 't') {
                                        c3 = '\t';
                                    } else {
                                        if (c4 != 'u') {
                                            throw b("Invalid escape sequence");
                                        }
                                        if (i9 + 5 > this.k && !n(4)) {
                                            throw b("Unterminated escape sequence");
                                        }
                                        int i11 = this.b;
                                        int i12 = i11 + 4;
                                        int i13 = 0;
                                        while (i11 < i12) {
                                            int i14 = i13 << 4;
                                            char c5 = cArr[i11];
                                            if (c5 >= '0' && c5 <= '9') {
                                                i = c5 - '0';
                                            } else if (c5 >= 'a' && c5 <= 'f') {
                                                i = c5 - 'W';
                                            } else {
                                                if (c5 < 'A' || c5 > 'F') {
                                                    throw b("Malformed Unicode escape \\u".concat(new String(cArr, this.b, 4)));
                                                }
                                                i = c5 - '7';
                                            }
                                            i13 = i14 + i;
                                            i11++;
                                        }
                                        this.b += 4;
                                        c3 = (char) i13;
                                    }
                                }
                            }
                            sb.append(c3);
                            i4 = this.b;
                            i3 = this.k;
                            i2 = i4;
                        } else {
                            this.m++;
                            this.n = i10;
                        }
                        c3 = c4;
                        sb.append(c3);
                        i4 = this.b;
                        i3 = this.k;
                        i2 = i4;
                    } else {
                        if (c2 == '\n') {
                            this.m++;
                            this.n = i5;
                        }
                        i2 = i5;
                    }
                }
            }
            int i15 = i2 - i4;
            if (sb == null) {
                sb = new StringBuilder(Math.max(i15 << 1, 16));
            }
            sb.append(cArr, i4, i15);
            this.b = i2;
        } while (n(1));
        throw b("Unterminated string");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0042. Please report as an issue. */
    public final String f() throws ahwv {
        String string;
        int i = 0;
        StringBuilder sb = null;
        while (true) {
            int i2 = 0;
            while (true) {
                int i3 = this.b + i2;
                if (i3 < this.k) {
                    char c = this.a[i3];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        l();
                    }
                    i = i2;
                } else if (i2 >= 1024) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i2, 16));
                    }
                    sb.append(this.a, this.b, i2);
                    this.b += i2;
                    if (!n(1)) {
                    }
                } else if (!n(i2 + 1)) {
                    i = i2;
                }
                char[] cArr = this.a;
                if (sb == null) {
                    string = new String(cArr, this.b, i);
                } else {
                    sb.append(cArr, this.b, i);
                    string = sb.toString();
                }
                this.b += i;
                return string;
            }
        }
    }

    public final void g(int i) throws ahwv {
        int i2 = this.g;
        if (i2 - 1 >= 1280) {
            throw new ahwv("Nesting limit 1280 reached" + d());
        }
        int[] iArr = this.o;
        if (i2 == iArr.length) {
            int i3 = i2 << 1;
            this.o = Arrays.copyOf(iArr, i3);
            this.i = Arrays.copyOf(this.i, i3);
            this.h = (String[]) Arrays.copyOf(this.h, i3);
        }
        int[] iArr2 = this.o;
        int i4 = this.g;
        this.g = i4 + 1;
        iArr2[i4] = i;
    }

    public final boolean h() throws IOException {
        int iA = this.c;
        if (iA == 0) {
            iA = a();
        }
        return (iA == 2 || iA == 4 || iA == 17) ? false : true;
    }

    public final int i() throws IOException {
        int iA = this.c;
        if (iA == 0) {
            iA = a();
        }
        switch (iA) {
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
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }

    public final String j() {
        StringBuilder sb = new StringBuilder("$");
        for (int i = 0; i < this.g; i++) {
            int i2 = this.o[i];
            switch (i2) {
                case 1:
                case 2:
                    int i3 = this.i[i];
                    sb.append('[');
                    sb.append(i3);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.h[i];
                    if (str != null) {
                        sb.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(a.bR(i2, "Unknown scope value: "));
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return String.valueOf(getClass().getSimpleName()).concat(d());
    }
}
