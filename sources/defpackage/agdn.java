package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agdn extends agdl {
    private final char a;

    public agdn(char c) {
        this.a = c;
    }

    @Override // defpackage.agdw
    public final boolean b(char c) {
        return c == this.a;
    }

    @Override // defpackage.agdl, defpackage.agdw
    public final agdw e() {
        return new agdp(this.a);
    }

    @Override // defpackage.agdw
    public final String f(CharSequence charSequence) {
        return charSequence.toString().replace(this.a, '.');
    }

    public final String toString() {
        return "CharMatcher.is('" + agdw.k(this.a) + "')";
    }
}
