package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akrc extends aihn implements aiis {
    public static final akrc a;
    public int b;
    public akre c;
    public double d = 1.0d;

    static {
        akrc akrcVar = new akrc();
        a = akrcVar;
        aihn.registerDefaultInstance(akrc.class, akrcVar);
    }

    private akrc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002က\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new akrc();
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
        return aihn.getParserForClass(akrc.class);
    }
}
