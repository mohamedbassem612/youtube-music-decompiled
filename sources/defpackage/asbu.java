package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asbu extends aihn implements aiis {
    public static final asbu a;
    public static final aihl b;
    public int c;
    public asbt d;

    static {
        asbu asbuVar = new asbu();
        a = asbuVar;
        aihn.registerDefaultInstance(asbu.class, asbuVar);
        b = aihn.newSingularGeneratedExtension(asbq.a, asbuVar, asbuVar, null, 409459387, aika.MESSAGE, asbu.class);
    }

    private asbu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"c", "d"});
        }
        if (iOrdinal == 3) {
            return new asbu();
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
        return aihn.getParserForClass(asbu.class);
    }
}
