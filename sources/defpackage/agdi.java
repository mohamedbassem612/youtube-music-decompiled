package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agdi extends agdr {
    static final agdw a = new agdi();

    private agdi() {
        super("CharMatcher.any()");
    }

    @Override // defpackage.agdw
    public final boolean b(char c) {
        return true;
    }

    @Override // defpackage.agdw
    public final int c(CharSequence charSequence) {
        return charSequence.length() == 0 ? -1 : 0;
    }

    @Override // defpackage.agdw
    public final int d(CharSequence charSequence, int i) {
        int length = charSequence.length();
        ahno.X(i, length);
        if (i == length) {
            return -1;
        }
        return i;
    }

    @Override // defpackage.agdl, defpackage.agdw
    public final agdw e() {
        return agdt.a;
    }

    @Override // defpackage.agdw
    public final String f(CharSequence charSequence) {
        char[] cArr = new char[charSequence.length()];
        Arrays.fill(cArr, '.');
        return new String(cArr);
    }
}
