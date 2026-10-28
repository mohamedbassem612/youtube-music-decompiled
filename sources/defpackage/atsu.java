package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class atsu extends aihn implements aiis {
    public static final atsu a;
    public int b;
    public int c;

    static {
        atsu atsuVar = new atsu();
        a = atsuVar;
        aihn.registerDefaultInstance(atsu.class, atsuVar);
    }

    private atsu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new atsu();
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
        return aihn.getParserForClass(atsu.class);
    }
}
