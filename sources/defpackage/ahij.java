package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahij extends aihn implements aiis {
    public static final ahij a;
    public int b;
    public int c;
    public int d;

    static {
        ahij ahijVar = new ahij();
        a = ahijVar;
        aihn.registerDefaultInstance(ahij.class, ahijVar);
    }

    private ahij() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ahij();
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
        return aihn.getParserForClass(ahij.class);
    }
}
