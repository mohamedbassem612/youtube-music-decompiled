package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auel extends aihn implements aiis {
    public static final auel a;
    public int b;
    public int c;
    public long d;

    static {
        auel auelVar = new auel();
        a = auelVar;
        aihn.registerDefaultInstance(auel.class, auelVar);
    }

    private auel() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"b", "c", audg.b, "d"});
        }
        if (iOrdinal == 3) {
            return new auel();
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
        return aihn.getParserForClass(auel.class);
    }
}
