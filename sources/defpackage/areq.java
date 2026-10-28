package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class areq extends aihn implements aiis {
    public static final areq a;
    public static final aihl b;
    public int c;
    public long d;
    public long e;

    static {
        areq areqVar = new areq();
        a = areqVar;
        aihn.registerDefaultInstance(areq.class, areqVar);
        b = aihn.newSingularGeneratedExtension(aofg.b, areqVar, areqVar, null, 447085533, aika.MESSAGE, areq.class);
    }

    private areq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new areq();
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
        return aihn.getParserForClass(areq.class);
    }
}
