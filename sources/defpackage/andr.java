package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class andr extends aihn implements aiis {
    public static final andr a;
    public int b;
    public int c;
    public int d;

    static {
        andr andrVar = new andr();
        a = andrVar;
        aihn.registerDefaultInstance(andr.class, andrVar);
    }

    private andr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new andr();
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
        return aihn.getParserForClass(andr.class);
    }
}
