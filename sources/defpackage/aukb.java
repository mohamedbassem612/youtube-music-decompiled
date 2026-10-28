package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aukb extends aihn implements aiis {
    public static final aukb a;
    public int b;
    public String c = "";
    public agzk d;

    static {
        aukb aukbVar = new aukb();
        a = aukbVar;
        aihn.registerDefaultInstance(aukb.class, aukbVar);
    }

    private aukb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new aukb();
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
        return aihn.getParserForClass(aukb.class);
    }
}
