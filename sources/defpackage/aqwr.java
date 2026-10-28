package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqwr extends aihn implements aiis {
    public static final aqwr a;
    public long b;
    private int c;

    static {
        aqwr aqwrVar = new aqwr();
        a = aqwrVar;
        aihn.registerDefaultInstance(aqwr.class, aqwrVar);
    }

    private aqwr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new aqwr();
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
        return aihn.getParserForClass(aqwr.class);
    }
}
