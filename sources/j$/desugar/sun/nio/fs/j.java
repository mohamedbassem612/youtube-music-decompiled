package j$.desugar.sun.nio.fs;

import j$.nio.file.FileSystem;
import j$.nio.file.Path;
import j$.nio.file.q0;
import j$.nio.file.w;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class j extends FileSystem {
    public final String a;
    public final n b;

    public j(n nVar, String str) {
        this.b = nVar;
        this.a = str;
    }

    @Override // j$.nio.file.FileSystem
    public final Iterable a() {
        throw new UnsupportedOperationException("");
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0101  */
    @Override // j$.nio.file.FileSystem
    public final w b(String str) {
        boolean z;
        int i;
        int iIndexOf = str.indexOf(58);
        boolean z2 = true;
        byte b = 0;
        if (iIndexOf <= 0 || iIndexOf == str.length()) {
            throw new IllegalArgumentException(String.format("Requested <syntax>:<pattern> spliterator(':') position(%d) is out of bound in %s", Integer.valueOf(iIndexOf), str));
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring.equalsIgnoreCase("glob")) {
            StringBuilder sb = new StringBuilder("^");
            int i2 = 0;
            boolean z3 = false;
            while (i2 < strSubstring2.length()) {
                int i3 = i2 + 1;
                char cCharAt = strSubstring2.charAt(i2);
                if (cCharAt != '*') {
                    if (cCharAt != ',') {
                        char c = '/';
                        if (cCharAt == '/') {
                            z = z2;
                            sb.append(cCharAt);
                        } else if (cCharAt == '?') {
                            z = z2;
                            sb.append("[^/]");
                        } else if (cCharAt == '{') {
                            z = z2;
                            if (z3) {
                                throw new PatternSyntaxException("Cannot nest groups", strSubstring2, i2);
                            }
                            sb.append("(?:(?:");
                            z3 = z;
                        } else if (cCharAt == '}') {
                            z = z2;
                            if (z3) {
                                sb.append("))");
                                z3 = false;
                            } else {
                                sb.append('}');
                            }
                        } else if (cCharAt == '[') {
                            sb.append("[[^/]&&[");
                            if (g.N(strSubstring2, i3) == '^') {
                                sb.append("\\^");
                                i2 += 2;
                            } else {
                                if (g.N(strSubstring2, i3) == '!') {
                                    sb.append('^');
                                    i3 = i2 + 2;
                                }
                                if (g.N(strSubstring2, i3) == '-') {
                                    sb.append('-');
                                    i2 = i3 + 1;
                                } else {
                                    i2 = i3;
                                }
                            }
                            boolean z4 = false;
                            char c2 = 0;
                            while (true) {
                                if (i2 >= strSubstring2.length()) {
                                    z = z2;
                                    break;
                                }
                                int i4 = i2 + 1;
                                char cCharAt2 = strSubstring2.charAt(i2);
                                if (cCharAt2 == ']') {
                                    z = z2;
                                    i2 = i4;
                                    cCharAt = cCharAt2;
                                    break;
                                }
                                if (cCharAt2 == c) {
                                    throw new PatternSyntaxException("Explicit 'name separator' in class", strSubstring2, i2);
                                }
                                if (cCharAt2 == '\\' || cCharAt2 == '[') {
                                    z = z2;
                                } else {
                                    z = z2;
                                    if (cCharAt2 == '&' && g.N(strSubstring2, i4) == '&') {
                                    }
                                    sb.append(cCharAt2);
                                    if (cCharAt2 != '-') {
                                        c = '/';
                                        z2 = z;
                                        z4 = z2;
                                        i2 = i4;
                                        cCharAt = cCharAt2;
                                        c2 = cCharAt;
                                    } else {
                                        if (z4) {
                                            throw new PatternSyntaxException("Invalid range", strSubstring2, i2);
                                        }
                                        i = i2 + 2;
                                        cCharAt = g.N(strSubstring2, i4);
                                        if (cCharAt != 0 || cCharAt == ']') {
                                            i2 = i;
                                            break;
                                        }
                                        if (cCharAt < c2) {
                                            throw new PatternSyntaxException("Invalid range", strSubstring2, i2 - 1);
                                        }
                                        sb.append(cCharAt);
                                        c = '/';
                                        z2 = z;
                                        i2 = i;
                                        z4 = false;
                                    }
                                }
                                sb.append('\\');
                                sb.append(cCharAt2);
                                if (cCharAt2 != '-') {
                                    if (z4) {
                                        throw new PatternSyntaxException("Invalid range", strSubstring2, i2);
                                    }
                                    i = i2 + 2;
                                    cCharAt = g.N(strSubstring2, i4);
                                    if (cCharAt != 0) {
                                    }
                                    i2 = i;
                                    break;
                                }
                                c = '/';
                                z2 = z;
                                z4 = z2;
                                i2 = i4;
                                cCharAt = cCharAt2;
                                c2 = cCharAt;
                            }
                            if (cCharAt != ']') {
                                throw new PatternSyntaxException("Missing ']", strSubstring2, i2 - 1);
                            }
                            sb.append("]]");
                        } else if (cCharAt != '\\') {
                            if (".^$+{[]|()".indexOf(cCharAt) != -1) {
                                sb.append('\\');
                            }
                            sb.append(cCharAt);
                            z = z2;
                        } else {
                            if (i3 == strSubstring2.length()) {
                                throw new PatternSyntaxException("No character to escape", strSubstring2, i2);
                            }
                            i2 += 2;
                            char cCharAt3 = strSubstring2.charAt(i3);
                            if ("\\*?[{".indexOf(cCharAt3) != -1 || ".^$+{[]|()".indexOf(cCharAt3) != -1) {
                                sb.append('\\');
                            }
                            sb.append(cCharAt3);
                            z = z2;
                        }
                    } else {
                        z = z2;
                        if (z3) {
                            sb.append(")|(?:");
                        } else {
                            sb.append(',');
                        }
                    }
                    i2 = i3;
                } else {
                    z = z2;
                    if (g.N(strSubstring2, i3) == '*') {
                        sb.append(".*");
                        i2 += 2;
                    } else {
                        sb.append("[^/]*");
                        i2 = i3;
                    }
                }
                z2 = z;
            }
            if (z3) {
                throw new PatternSyntaxException("Missing '}", strSubstring2, i2 - 1);
            }
            sb.append('$');
            strSubstring2 = sb.toString();
        } else if (!strSubstring.equalsIgnoreCase("regex")) {
            throw new UnsupportedOperationException(i.a("Syntax '", strSubstring, "' not recognized"));
        }
        return new h(b, Pattern.compile(strSubstring2));
    }

    @Override // j$.nio.file.FileSystem
    public final Iterable c() {
        return g.C(new Object[]{new p(this, "/", this.a, "/")});
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.FileSystem
    public final String d() {
        return "/";
    }

    @Override // j$.nio.file.FileSystem
    public final g e() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.FileSystem
    public final boolean f() {
        return false;
    }

    @Override // j$.nio.file.FileSystem
    public final q0 g() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.FileSystem
    public final Path getPath(String str, String[] strArr) {
        if (strArr.length != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            for (String str2 : strArr) {
                if (!str2.isEmpty()) {
                    if (sb.length() > 0) {
                        sb.append('/');
                    }
                    sb.append(str2);
                }
            }
            str = sb.toString();
        }
        return new p(this, str, this.a, "/");
    }

    @Override // j$.nio.file.FileSystem
    public final j$.nio.file.spi.c h() {
        return this.b;
    }

    @Override // j$.nio.file.FileSystem
    public final Set i() {
        return g.D(new Object[]{"basic"});
    }

    @Override // j$.nio.file.FileSystem
    public final boolean isOpen() {
        return true;
    }
}
