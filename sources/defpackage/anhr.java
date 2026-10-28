package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anhr extends aihn implements aiis {
    public static final anhr a;
    public int b;
    public String c = "";
    public String d = "";
    public int e;
    public int f;

    static {
        anhr anhrVar = new anhr();
        a = anhrVar;
        aihn.registerDefaultInstance(anhr.class, anhrVar);
    }

    private anhr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004င\u0003", new Object[]{"b", "c", "d", "e", aomi.i, "f"});
        }
        if (iOrdinal == 3) {
            return new anhr();
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
        return aihn.getParserForClass(anhr.class);
    }
}
