package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aole extends aihn implements aiis {
    public static final aole a;
    public int b;
    public int c = 0;
    public Object d;
    public long e;

    static {
        aole aoleVar = new aole();
        a = aoleVar;
        aihn.registerDefaultInstance(aole.class, aoleVar);
    }

    private aole() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0001\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဃ\u0000\u0002;\u0000\u0003<\u0000\u0005;\u0000", new Object[]{"d", "c", "b", "e", amqw.class});
        }
        if (iOrdinal == 3) {
            return new aole();
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
        return aihn.getParserForClass(aole.class);
    }
}
