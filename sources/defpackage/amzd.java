package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amzd extends aihn implements aiis {
    public static final amzd a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public amyw f;
    private int g;

    static {
        amzd amzdVar = new amzd();
        a = amzdVar;
        aihn.registerDefaultInstance(amzd.class, amzdVar);
    }

    private amzd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\b\u0019\u0005\u0000\u0000\u0000\bဇ\u0004\u000eဇ\t\u000fဇ\n\u0014ဇ\f\u0019ဉ\u0011", new Object[]{"g", "b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new amzd();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(amzd.class);
    }
}
