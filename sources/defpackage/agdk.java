package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agdk extends agdr {
    public static final agdw a = new agdk();

    public agdk() {
        super("CharMatcher.ascii()");
    }

    @Override // defpackage.agdw
    public final boolean b(char c) {
        return c <= 127;
    }
}
