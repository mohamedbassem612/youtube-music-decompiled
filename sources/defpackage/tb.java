package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class tb implements Iterable {
    private final List a;

    public tb(String str) {
        azs.l(str);
        this.a = new ArrayList();
        try {
            c(str);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + ": " + str);
        }
    }

    private final void c(String str) {
        boolean z;
        String strSubstring;
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                z = false;
                i = -1;
                break;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt == ']') {
                throw new IllegalArgumentException("Malformed path (no starting '[')");
            }
            if (cCharAt == '[' || cCharAt == '.') {
                if (cCharAt != '[') {
                    z = false;
                    break;
                } else {
                    z = true;
                    break;
                }
            }
            i++;
        }
        if (i == 0 || str.isEmpty()) {
            throw new IllegalArgumentException("Malformed path (blank property name)");
        }
        if (i == -1) {
            this.a.add(new ta(str, -1));
            return;
        }
        if (z) {
            azs.l(str);
            String strSubstring2 = str.substring(0, i);
            int iIndexOf = str.indexOf(93, i);
            if (iIndexOf == -1) {
                throw new IllegalArgumentException("Malformed path (no ending ']')");
            }
            int i2 = iIndexOf + 1;
            if (i2 < str.length() && str.charAt(i2) != '.') {
                throw new IllegalArgumentException("Malformed path (']' not followed by '.'): ".concat(String.valueOf(str)));
            }
            String strSubstring3 = str.substring(i + 1, iIndexOf);
            try {
                int i3 = Integer.parseInt(strSubstring3);
                if (i3 < 0) {
                    throw new IllegalArgumentException("Malformed path (path index less than 0)");
                }
                this.a.add(new ta(strSubstring2, i3));
                strSubstring = i2 < str.length() ? str.substring(iIndexOf + 2) : null;
                if (strSubstring == null) {
                    return;
                }
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(a.bT(strSubstring3, "Malformed path (\"", "\" as path index)"));
            }
        } else {
            String strSubstring4 = str.substring(0, i);
            strSubstring = str.substring(i + 1);
            this.a.add(new ta(strSubstring4, -1));
        }
        c(strSubstring);
    }

    public final int a() {
        return this.a.size();
    }

    public final ta b(int i) {
        return (ta) this.a.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof tb)) {
            return false;
        }
        return Objects.equals(this.a, ((tb) obj).a);
    }

    public final int hashCode() {
        return aie.e(this.a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return sb.toString();
            }
            sb.append(b(i).toString());
            if (i < list.size() - 1) {
                sb.append('.');
            }
            i++;
        }
    }
}
