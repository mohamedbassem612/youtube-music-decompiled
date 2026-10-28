package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amul extends aihn implements aiis {
    public static final amul a;
    public int b;
    public int c;
    public long d;
    public String e = "";

    static {
        amul amulVar = new amul();
        a = amulVar;
        aihn.registerDefaultInstance(amul.class, amulVar);
    }

    private amul() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"b", "c", amoe.m, "d", "e"});
        }
        if (iOrdinal == 3) {
            return new amul();
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
        return aihn.getParserForClass(amul.class);
    }
}
