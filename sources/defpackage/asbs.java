package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asbs extends aihn implements aiis {
    public static final asbs a;
    public static final aihl b;
    public int c;
    public long d;

    static {
        asbs asbsVar = new asbs();
        a = asbsVar;
        aihn.registerDefaultInstance(asbs.class, asbsVar);
        b = aihn.newSingularGeneratedExtension(asbq.a, asbsVar, asbsVar, null, 409515602, aika.MESSAGE, asbs.class);
    }

    private asbs() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဃ\u0000", new Object[]{"c", "d"});
        }
        if (iOrdinal == 3) {
            return new asbs();
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
        return aihn.getParserForClass(asbs.class);
    }
}
