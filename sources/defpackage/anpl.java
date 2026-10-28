package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anpl extends aihn implements aiis {
    public static final anpl a;
    public boolean b;
    private int c;

    static {
        anpl anplVar = new anpl();
        a = anplVar;
        aihn.registerDefaultInstance(anpl.class, anplVar);
    }

    private anpl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဇ\u0004", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new anpl();
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
        return aihn.getParserForClass(anpl.class);
    }
}
