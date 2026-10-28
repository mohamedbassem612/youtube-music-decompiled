package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aufl extends aihn implements aiis {
    public static final aufl a;
    public String b = "";
    public aufc c;
    private int d;

    static {
        aufl auflVar = new aufl();
        a = auflVar;
        aihn.registerDefaultInstance(aufl.class, auflVar);
    }

    private aufl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0000\u0004ဈ\u0002\u0005ဉ\u0003", new Object[]{"d", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new aufl();
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
        return aihn.getParserForClass(aufl.class);
    }
}
