package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agdo extends agdl {
    private final char a;
    private final char b;

    public agdo(char c, char c2) {
        this.a = c;
        this.b = c2;
    }

    @Override // defpackage.agdw
    public final boolean b(char c) {
        return c == this.a || c == this.b;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + agdw.k(this.a) + agdw.k(this.b) + "\")";
    }
}
