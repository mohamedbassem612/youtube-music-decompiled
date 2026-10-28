package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akjv extends aihn implements aiis {
    public static final akjv a;
    public int b;
    public Object d;
    public int c = 0;
    public aigj e = aigj.d;
    public String f = "";
    public String g = "";

    static {
        akjv akjvVar = new akjv();
        a = akjvVar;
        aihn.registerDefaultInstance(akjv.class, akjvVar);
    }

    private akjv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u083f\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u00047\u0000\u0005ည\u0000", new Object[]{"d", "c", "b", akjs.c, "f", "g", "e"});
        }
        if (iOrdinal == 3) {
            return new akjv();
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
        return aihn.getParserForClass(akjv.class);
    }
}
