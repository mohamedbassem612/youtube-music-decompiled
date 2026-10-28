package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agdm extends agdl {
    private final char a;
    private final char b;

    public agdm(char c, char c2) {
        ahno.F(c2 >= c);
        this.a = c;
        this.b = c2;
    }

    @Override // defpackage.agdw
    public final boolean b(char c) {
        return this.a <= c && c <= this.b;
    }

    public final String toString() {
        return "CharMatcher.inRange('" + agdw.k(this.a) + "', '" + agdw.k(this.b) + "')";
    }
}
