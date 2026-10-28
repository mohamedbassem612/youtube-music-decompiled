package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class anda extends aihn implements aiis {
    public static final anda a;
    public int b = 0;
    public Object c;

    static {
        anda andaVar = new anda();
        a = andaVar;
        aihn.registerDefaultInstance(anda.class, andaVar);
    }

    private anda() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"c", "b", ancs.class});
        }
        if (iOrdinal == 3) {
            return new anda();
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
        return aihn.getParserForClass(anda.class);
    }
}
