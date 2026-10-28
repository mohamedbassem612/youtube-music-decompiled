package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agdv extends agdr {
    static final int a = 27;
    public static final agdw b = new agdv();

    public agdv() {
        super("CharMatcher.whitespace()");
    }

    @Override // defpackage.agdw
    public final boolean b(char c) {
        return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c) >>> a) == c;
    }
}
