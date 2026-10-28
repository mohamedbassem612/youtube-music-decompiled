package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agdj extends agdw {
    private final char[] a;

    public agdj(CharSequence charSequence) {
        char[] charArray = charSequence.toString().toCharArray();
        this.a = charArray;
        Arrays.sort(charArray);
    }

    @Override // defpackage.agdw
    public final boolean b(char c) {
        return Arrays.binarySearch(this.a, c) >= 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
        for (char c : this.a) {
            sb.append(agdw.k(c));
        }
        sb.append("\")");
        return sb.toString();
    }
}
