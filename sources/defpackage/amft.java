package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amft extends aihn implements aiis {
    public static final amft a;
    private int b;
    private alio c;

    static {
        amft amftVar = new amft();
        a = amftVar;
        aihn.registerDefaultInstance(amft.class, amftVar);
    }

    private amft() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\t\t\u0001\u0000\u0000\u0000\tဉ\u0002", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new amft();
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
        return aihn.getParserForClass(amft.class);
    }
}
