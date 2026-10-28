package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class arap extends aihn implements aiis {
    public static final arap a;
    public int b;
    public araq c;
    public int d;
    public int e;

    static {
        arap arapVar = new arap();
        a = arapVar;
        aihn.registerDefaultInstance(arap.class, arapVar);
    }

    private arap() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", alre.o, "e", alre.p});
        }
        if (iOrdinal == 3) {
            return new arap();
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
        return aihn.getParserForClass(arap.class);
    }
}
