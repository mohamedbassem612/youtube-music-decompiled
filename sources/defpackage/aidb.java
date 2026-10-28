package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aidb extends aihn implements aiis {
    public static final aidb a;
    public Object c;
    private int g;
    public int b = 0;
    public String d = "";
    public String e = "";
    public aiie f = emptyProtobufList();

    static {
        aidb aidbVar = new aidb();
        a = aidbVar;
        aihn.registerDefaultInstance(aidb.class, aidbVar);
    }

    private aidb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003ဈ\u0000\u0004ဈ\u0001\u0006\u001b", new Object[]{"c", "b", "g", aicx.class, aida.class, "d", "e", "f", aicf.class});
        }
        if (iOrdinal == 3) {
            return new aidb();
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
        return aihn.getParserForClass(aidb.class);
    }
}
