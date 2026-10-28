package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqiu extends aihn implements aiis {
    public static final aqiu a;
    public boolean b;
    public aqiv c;
    private int d;

    static {
        aqiu aqiuVar = new aqiu();
        a = aqiuVar;
        aihn.registerDefaultInstance(aqiu.class, aqiuVar);
    }

    private aqiu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0005ဉ\u0004", new Object[]{"d", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new aqiu();
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
        return aihn.getParserForClass(aqiu.class);
    }
}
