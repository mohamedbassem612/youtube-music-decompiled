package j$.time.format;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class c implements e {
    public final char a;

    public c(char c) {
        this.a = c;
    }

    @Override // j$.time.format.e
    public final boolean h(t tVar, StringBuilder sb) {
        sb.append(this.a);
        return true;
    }

    @Override // j$.time.format.e
    public final int k(r rVar, CharSequence charSequence, int i) {
        char cCharAt;
        char c;
        return (i == charSequence.length() || ((cCharAt = charSequence.charAt(i)) != (c = this.a) && (rVar.b || !(Character.toUpperCase(cCharAt) == Character.toUpperCase(c) || Character.toLowerCase(cCharAt) == Character.toLowerCase(c))))) ? ~i : i + 1;
    }

    public final String toString() {
        char c = this.a;
        if (c == '\'') {
            return "''";
        }
        return "'" + c + "'";
    }
}
