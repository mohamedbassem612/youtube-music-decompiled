package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class asks extends aihn implements aiis {
    public static final asks a;
    public int b;
    public float c;
    public int d;

    static {
        asks asksVar = new asks();
        a = asksVar;
        aihn.registerDefaultInstance(asks.class, asksVar);
    }

    private asks() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", asel.m});
        }
        if (iOrdinal == 3) {
            return new asks();
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
        return aihn.getParserForClass(asks.class);
    }
}
