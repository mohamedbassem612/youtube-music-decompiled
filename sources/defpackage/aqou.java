package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqou extends aihn implements aiis {
    public static final aqou a;
    public int b;
    public String c = "";
    public int d;

    static {
        aqou aqouVar = new aqou();
        a = aqouVar;
        aihn.registerDefaultInstance(aqou.class, aqouVar);
    }

    private aqou() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new aqou();
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
        return aihn.getParserForClass(aqou.class);
    }
}
