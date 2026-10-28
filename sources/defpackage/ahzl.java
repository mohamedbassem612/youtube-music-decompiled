package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahzl extends aihn implements aiis {
    public static final ahzl a;
    public int b;
    public ahze c;
    public ahzg d;
    public ahzk e;
    public int f;
    public ahzd g;

    static {
        ahzl ahzlVar = new ahzl();
        a = ahzlVar;
        aihn.registerDefaultInstance(ahzl.class, ahzlVar);
    }

    private ahzl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004᠌\u0003\u0005ဉ\u0004", new Object[]{"b", "c", "d", "e", "f", ahzf.c, "g"});
        }
        if (iOrdinal == 3) {
            return new ahzl();
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
        return aihn.getParserForClass(ahzl.class);
    }
}
