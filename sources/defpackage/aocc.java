package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aocc extends aihn implements aiis {
    public static final aocc a;
    public String b = "";
    public boolean c;
    private int d;

    static {
        aocc aoccVar = new aocc();
        a = aoccVar;
        aihn.registerDefaultInstance(aocc.class, aoccVar);
    }

    private aocc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"d", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new aocc();
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
        return aihn.getParserForClass(aocc.class);
    }
}
