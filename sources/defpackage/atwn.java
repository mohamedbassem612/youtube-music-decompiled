package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atwn extends aihn implements aiis {
    public static final atwn a;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        atwn atwnVar = new atwn();
        a = atwnVar;
        aihn.registerDefaultInstance(atwn.class, atwnVar);
    }

    private atwn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0003<\u0000\u0004Ȼ\u0000", new Object[]{"d", "c", "b", "e", aipd.class});
        }
        if (iOrdinal == 3) {
            return new atwn();
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
        return aihn.getParserForClass(atwn.class);
    }
}
