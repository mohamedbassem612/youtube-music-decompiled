package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajtm extends aihn implements aiis {
    public static final ajtm a;
    public String b = "";
    public int c;
    private int d;

    static {
        ajtm ajtmVar = new ajtm();
        a = ajtmVar;
        aihn.registerDefaultInstance(ajtm.class, ajtmVar);
    }

    private ajtm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003᠌\u0002", new Object[]{"d", "b", "c", ajpr.j});
        }
        if (iOrdinal == 3) {
            return new ajtm();
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
        return aihn.getParserForClass(ajtm.class);
    }
}
