package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aulx extends aihn implements aiis {
    public static final aulx a;
    private int b;
    private aulw c;

    static {
        aulx aulxVar = new aulx();
        a = aulxVar;
        aihn.registerDefaultInstance(aulx.class, aulxVar);
    }

    private aulx() {
        emptyProtobufList();
        emptyProtobufList();
        emptyIntList();
        emptyProtobufList();
        emptyProtobufList();
        emptyIntList();
        emptyIntList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\r\r\u0001\u0000\u0000\u0000\rဉ\u0004", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new aulx();
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
        return aihn.getParserForClass(aulx.class);
    }
}
