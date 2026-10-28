package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class atyu implements CharSequence {
    private final agke a;
    private final int b;

    public atyu(agke agkeVar) {
        this.a = agkeVar;
        int i = ((agpi) agkeVar).d;
        int length = 0;
        for (int i2 = 0; i2 < i; i2++) {
            length += ((CharSequence) agkeVar.get(i2)).length();
        }
        this.b = length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return ((CharSequence) this.a.get(i >> 11)).charAt(i & 2047);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.b;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        StringBuilder sb = new StringBuilder(this.b);
        int i = 0;
        while (true) {
            agke agkeVar = this.a;
            if (i >= ((agpi) agkeVar).d) {
                return sb.toString();
            }
            sb.append((CharSequence) agkeVar.get(i));
            i++;
        }
    }
}
