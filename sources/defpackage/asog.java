package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class asog extends aihn implements aiis {
    public static final asog a;
    public int b;
    public boolean c;
    public aiie d = emptyProtobufList();
    public boolean e;
    public aijp f;

    static {
        asog asogVar = new asog();
        a = asogVar;
        aihn.registerDefaultInstance(asog.class, asogVar);
    }

    private asog() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001b\u0003ဇ\u0001\u0004ဉ\u0002", new Object[]{"b", "c", "d", asof.class, "e", "f"});
        }
        if (iOrdinal == 3) {
            return new asog();
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
        return aihn.getParserForClass(asog.class);
    }
}
