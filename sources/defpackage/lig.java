package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lig extends aihn implements aiis {
    public static final lig a;
    public int d;
    private int f;
    public String b = "";
    public String c = "";
    public String e = "";

    static {
        lig ligVar = new lig();
        a = ligVar;
        aihn.registerDefaultInstance(lig.class, ligVar);
    }

    private lig() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004င\u0003\u0005ဈ\u0004", new Object[]{"f", "b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new lig();
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
        return aihn.getParserForClass(lig.class);
    }
}
