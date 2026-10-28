package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aofo extends aihn implements aiis {
    public static final aofo a;
    public int b;
    public int c;
    public String d = "";

    static {
        aofo aofoVar = new aofo();
        a = aofoVar;
        aihn.registerDefaultInstance(aofo.class, aofoVar);
    }

    private aofo() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"b", "c", aomi.k, "d"});
        }
        if (iOrdinal == 3) {
            return new aofo();
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
        return aihn.getParserForClass(aofo.class);
    }
}
