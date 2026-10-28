package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agdp extends agdl {
    private final char a;

    public agdp(char c) {
        this.a = c;
    }

    @Override // defpackage.agdw
    public final boolean b(char c) {
        return c != this.a;
    }

    @Override // defpackage.agdl, defpackage.agdw
    public final agdw e() {
        return new agdn(this.a);
    }

    public final String toString() {
        return "CharMatcher.isNot('" + agdw.k(this.a) + "')";
    }
}
