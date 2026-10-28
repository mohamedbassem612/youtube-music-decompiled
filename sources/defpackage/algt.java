package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class algt extends aihn implements aiis {
    public static final algt a;
    public String b = "";
    public String c = "";
    public String d = "";
    private int e;

    static {
        algt algtVar = new algt();
        a = algtVar;
        aihn.registerDefaultInstance(algt.class, algtVar);
    }

    private algt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0007ဈ\u0006", new Object[]{"e", "b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new algt();
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
        return aihn.getParserForClass(algt.class);
    }
}
