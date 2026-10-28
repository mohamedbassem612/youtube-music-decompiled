package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajnr extends aihn implements aiis {
    public static final ajnr a;
    public int b;
    public Object d;
    public long f;
    public int c = 0;
    public aigj e = aigj.d;

    static {
        ajnr ajnrVar = new ajnr();
        a = ajnrVar;
        aihn.registerDefaultInstance(ajnr.class, ajnrVar);
    }

    private ajnr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ည\u0000\u0002ဃ\u0001\u0003;\u0000\u0004<\u0000\u0005;\u0000", new Object[]{"d", "c", "b", "e", "f", amqw.class});
        }
        if (iOrdinal == 3) {
            return new ajnr();
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
        return aihn.getParserForClass(ajnr.class);
    }
}
