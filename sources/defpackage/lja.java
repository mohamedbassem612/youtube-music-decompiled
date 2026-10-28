package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lja extends aihn implements aiis {
    public static final lja a;
    public aiie b = emptyProtobufList();
    public liy c;
    private int d;

    static {
        lja ljaVar = new lja();
        a = ljaVar;
        aihn.registerDefaultInstance(lja.class, ljaVar);
    }

    private lja() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"d", "b", ljb.class, "c"});
        }
        if (iOrdinal == 3) {
            return new lja();
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
        return aihn.getParserForClass(lja.class);
    }
}
