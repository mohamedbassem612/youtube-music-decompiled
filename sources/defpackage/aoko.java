package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aoko extends aihn implements aiis {
    public static final aoko a;
    public int b;
    public boolean c;
    public boolean d;

    static {
        aoko aokoVar = new aoko();
        a = aokoVar;
        aihn.registerDefaultInstance(aoko.class, aokoVar);
    }

    private aoko() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new aoko();
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
        return aihn.getParserForClass(aoko.class);
    }
}
