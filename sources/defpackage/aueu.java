package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aueu extends aihn implements aiis {
    public static final aueu a;
    public int b;
    public long c;

    static {
        aueu aueuVar = new aueu();
        a = aueuVar;
        aihn.registerDefaultInstance(aueu.class, aueuVar);
    }

    private aueu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new aueu();
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
        return aihn.getParserForClass(aueu.class);
    }
}
