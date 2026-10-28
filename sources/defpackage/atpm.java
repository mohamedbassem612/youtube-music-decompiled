package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atpm extends aihn implements aiis {
    public static final atpm a;
    public String b = "";
    private int c;

    static {
        atpm atpmVar = new atpm();
        a = atpmVar;
        aihn.registerDefaultInstance(atpm.class, atpmVar);
    }

    private atpm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဈ\u0003", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new atpm();
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
        return aihn.getParserForClass(atpm.class);
    }
}
