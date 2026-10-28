package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akkn extends aihn implements aiis {
    public static final akkn a;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        akkn akknVar = new akkn();
        a = akknVar;
        aihn.registerDefaultInstance(akkn.class, akknVar);
    }

    private akkn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", "e", akkx.b});
        }
        if (iOrdinal == 3) {
            return new akkn();
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
        return aihn.getParserForClass(akkn.class);
    }
}
