package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqaq extends aihn implements aiis {
    public static final aqaq a;
    public String b = "";
    public int c;
    private int d;

    static {
        aqaq aqaqVar = new aqaq();
        a = aqaqVar;
        aihn.registerDefaultInstance(aqaq.class, aqaqVar);
    }

    private aqaq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"d", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new aqaq();
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
        return aihn.getParserForClass(aqaq.class);
    }
}
