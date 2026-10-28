package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class anyg extends aihn implements aiis {
    public static final anyg a;
    public int b;
    public int c = 0;
    public Object d;
    public asky e;
    public int f;

    static {
        anyg anygVar = new anyg();
        a = anygVar;
        aihn.registerDefaultInstance(anyg.class, anygVar);
    }

    private anyg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001>\u0000\u0002<\u0000\u0003ဉ\u0000\u0004᠌\u0001", new Object[]{"d", "c", "b", aslb.class, "e", "f", anvw.q});
        }
        if (iOrdinal == 3) {
            return new anyg();
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
        return aihn.getParserForClass(anyg.class);
    }
}
