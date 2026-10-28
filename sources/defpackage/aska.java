package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aska extends aihn implements aiis {
    public static final aska a;
    public int b;
    public askk c;
    public ascl d;
    public boolean e;

    static {
        aska askaVar = new aska();
        a = askaVar;
        aihn.registerDefaultInstance(aska.class, askaVar);
    }

    private aska() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new aska();
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
        return aihn.getParserForClass(aska.class);
    }
}
