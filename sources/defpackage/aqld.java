package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqld extends aihn implements aiis {
    public static final aqld a;
    public static final aihl b;
    public int c;
    public long e;
    public String d = "";
    public aigj f = aigj.d;

    static {
        aqld aqldVar = new aqld();
        a = aqldVar;
        aihn.registerDefaultInstance(aqld.class, aqldVar);
        b = aihn.newSingularGeneratedExtension(aksn.a, aqldVar, aqldVar, null, 421320458, aika.MESSAGE, aqld.class);
    }

    private aqld() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဂ\u0001\u0004ည\u0002", new Object[]{"c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new aqld();
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
        return aihn.getParserForClass(aqld.class);
    }
}
