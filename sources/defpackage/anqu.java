package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anqu extends aihn implements aiis {
    public static final anqu a;
    public int b;
    public int c;
    public String d = "";

    static {
        anqu anquVar = new anqu();
        a = anquVar;
        aihn.registerDefaultInstance(anqu.class, anquVar);
    }

    private anqu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002᠌\u0001\u0003ဈ\u0002", new Object[]{"b", "c", anms.n, "d"});
        }
        if (iOrdinal == 3) {
            return new anqu();
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
        return aihn.getParserForClass(anqu.class);
    }
}
