package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class auim extends aihn implements aiis {
    public static final auim a;
    public int b;
    public long c;
    public auin e;
    public int g;
    public String d = "";
    public String f = "";

    static {
        auim auimVar = new auim();
        a = auimVar;
        aihn.registerDefaultInstance(auim.class, auimVar);
    }

    private auim() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဉ\u0002\u0004ဈ\u0003", new Object[]{"b", "c", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new auim();
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
        return aihn.getParserForClass(auim.class);
    }
}
