package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahig extends aihn implements aiis {
    public static final ahig a;
    public int b;
    public int c;

    static {
        ahig ahigVar = new ahig();
        a = ahigVar;
        aihn.registerDefaultInstance(ahig.class, ahigVar);
    }

    private ahig() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ahig();
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
        return aihn.getParserForClass(ahig.class);
    }
}
