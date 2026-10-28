package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agdq extends agdr {
    public static final agdw a = new agdq();

    private agdq() {
        super("CharMatcher.javaIsoControl()");
    }

    @Override // defpackage.agdw
    public final boolean b(char c) {
        if (c > 31) {
            return c >= 127 && c <= 159;
        }
        return true;
    }
}
