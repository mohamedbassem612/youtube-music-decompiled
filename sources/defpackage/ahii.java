package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahii extends aihn implements aiis {
    public static final ahii a;
    public int b;
    public int c;
    public ahip d;
    public ahip e;
    public ahig f;

    static {
        ahii ahiiVar = new ahii();
        a = ahiiVar;
        aihn.registerDefaultInstance(ahii.class, ahiiVar);
    }

    private ahii() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ahii();
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
        return aihn.getParserForClass(ahii.class);
    }
}
