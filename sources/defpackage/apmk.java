package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apmk extends aihn implements aiis {
    public static final apmk a;
    public int b;
    public boolean c;
    public String d = "";
    public boolean e;

    static {
        apmk apmkVar = new apmk();
        a = apmkVar;
        aihn.registerDefaultInstance(apmk.class, apmkVar);
    }

    private apmk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0000\u0003ဇ\u0003\u0004ဇ\u0005\u0005ဈ\u0004", new Object[]{"b", "c", "e", "d"});
        }
        if (iOrdinal == 3) {
            return new apmk();
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
        return aihn.getParserForClass(apmk.class);
    }
}
