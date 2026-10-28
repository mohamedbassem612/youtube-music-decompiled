package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqip extends aihn implements aiis {
    public static final aqip a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    private int g;

    static {
        aqip aqipVar = new aqip();
        a = aqipVar;
        aihn.registerDefaultInstance(aqip.class, aqipVar);
    }

    private aqip() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"g", "b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new aqip();
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
        return aihn.getParserForClass(aqip.class);
    }
}
