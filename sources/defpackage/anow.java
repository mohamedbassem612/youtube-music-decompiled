package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class anow extends aihn implements aiis {
    public static final anow a;
    public int b;
    public Object d;
    public boolean f;
    public boolean h;
    public int c = 0;
    public String e = "";
    public String g = "";

    static {
        anow anowVar = new anow();
        a = anowVar;
        aihn.registerDefaultInstance(anow.class, anowVar);
    }

    private anow() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002;\u0000\u0003ဇ\u0001\u0004ဈ\u0002\u0005;\u0000\u0006ဇ\u0003", new Object[]{"d", "c", "b", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new anow();
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
        return aihn.getParserForClass(anow.class);
    }
}
