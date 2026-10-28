package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajcc extends aihn implements aiis {
    public static final ajcc a;
    public ajcb b;
    private int c;

    static {
        ajcc ajccVar = new ajcc();
        a = ajccVar;
        aihn.registerDefaultInstance(ajcc.class, ajccVar);
    }

    private ajcc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001ﲡ㤸ﲡ㤸\u0001\u0000\u0000\u0000ﲡ㤸ဉ\u0000", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new ajcc();
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
        return aihn.getParserForClass(ajcc.class);
    }
}
