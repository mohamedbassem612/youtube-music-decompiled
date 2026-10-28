package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class andk extends aihn implements aiis {
    public static final andk a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    static {
        andk andkVar = new andk();
        a = andkVar;
        aihn.registerDefaultInstance(andk.class, andkVar);
    }

    private andk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new andk();
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
        return aihn.getParserForClass(andk.class);
    }
}
