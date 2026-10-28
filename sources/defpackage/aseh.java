package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aseh extends aihn implements aiis {
    public static final aseh a;
    public int b;
    public long c;
    public long d;
    public boolean e;

    static {
        aseh asehVar = new aseh();
        a = asehVar;
        aihn.registerDefaultInstance(aseh.class, asehVar);
    }

    private aseh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0005ဇ\u0004", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new aseh();
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
        return aihn.getParserForClass(aseh.class);
    }
}
