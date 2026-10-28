package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class asrx extends aihn implements aiis {
    public static final asrx a;
    public int b;
    public aiie c = emptyProtobufList();
    public boolean d;
    public aijp e;

    static {
        asrx asrxVar = new asrx();
        a = asrxVar;
        aihn.registerDefaultInstance(asrx.class, asrxVar);
    }

    private asrx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u001b\u0003ဇ\u0001\u0004ဉ\u0002", new Object[]{"b", "c", asrw.class, "d", "e"});
        }
        if (iOrdinal == 3) {
            return new asrx();
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
        return aihn.getParserForClass(asrx.class);
    }
}
