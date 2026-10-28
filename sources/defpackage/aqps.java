package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqps extends aihn implements aiis {
    public static final aqps a;
    public int b;
    public boolean c;

    static {
        aqps aqpsVar = new aqps();
        a = aqpsVar;
        aihn.registerDefaultInstance(aqps.class, aqpsVar);
    }

    private aqps() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new aqps();
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
        return aihn.getParserForClass(aqps.class);
    }
}
