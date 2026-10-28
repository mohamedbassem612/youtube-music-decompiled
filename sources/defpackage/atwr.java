package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atwr extends aihn implements aiis {
    public static final atwr a;
    public Object c;
    public Object e;
    public int b = 0;
    public int d = 0;

    static {
        atwr atwrVar = new atwr();
        a = atwrVar;
        aihn.registerDefaultInstance(atwr.class, atwrVar);
    }

    private atwr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0002\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001?\u0000\u0002?\u0000\u0003<\u0001\u0004Ȼ\u0001", new Object[]{"c", "b", "e", "d", aipd.class});
        }
        if (iOrdinal == 3) {
            return new atwr();
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
        return aihn.getParserForClass(atwr.class);
    }
}
