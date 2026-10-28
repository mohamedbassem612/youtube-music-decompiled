package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ands extends aihn implements aiis {
    public static final ands a;
    public int b;
    public int c;
    public long d;

    static {
        ands andsVar = new ands();
        a = andsVar;
        aihn.registerDefaultInstance(ands.class, andsVar);
    }

    private ands() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"b", "c", anbz.h, "d"});
        }
        if (iOrdinal == 3) {
            return new ands();
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
        return aihn.getParserForClass(ands.class);
    }
}
