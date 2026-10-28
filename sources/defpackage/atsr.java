package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atsr extends aihn implements aiis {
    public static final atsr a;
    public double b;
    public double c;

    static {
        atsr atsrVar = new atsr();
        a = atsrVar;
        aihn.registerDefaultInstance(atsr.class, atsrVar);
    }

    private atsr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new atsr();
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
        return aihn.getParserForClass(atsr.class);
    }
}
