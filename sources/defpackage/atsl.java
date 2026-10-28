package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atsl extends aihn implements aiis {
    public static final atsl a;
    public int b;
    public String c = "";

    static {
        atsl atslVar = new atsl();
        a = atslVar;
        aihn.registerDefaultInstance(atsl.class, atslVar);
    }

    private atsl() {
        emptyIntList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new atsl();
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
        return aihn.getParserForClass(atsl.class);
    }
}
