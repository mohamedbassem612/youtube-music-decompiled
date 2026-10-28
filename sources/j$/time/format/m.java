package j$.time.format;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class m implements e {
    public final String a;

    public m(String str) {
        this.a = str;
    }

    @Override // j$.time.format.e
    public final boolean h(t tVar, StringBuilder sb) {
        sb.append(this.a);
        return true;
    }

    @Override // j$.time.format.e
    public final int k(r rVar, CharSequence charSequence, int i) {
        if (i > charSequence.length() || i < 0) {
            throw new IndexOutOfBoundsException();
        }
        String str = this.a;
        return !rVar.g(charSequence, i, str, 0, str.length()) ? ~i : str.length() + i;
    }

    public final String toString() {
        return j$.desugar.sun.nio.fs.i.a("'", this.a.replace("'", "''"), "'");
    }
}
