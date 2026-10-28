package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahxs extends aihn implements aiis {
    public static final ahxs a;
    public aigj b = aigj.d;
    public aiie c = emptyProtobufList();
    private int d;

    static {
        ahxs ahxsVar = new ahxs();
        a = ahxsVar;
        aihn.registerDefaultInstance(ahxs.class, ahxsVar);
    }

    private ahxs() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ည\u0000\u0002\u001b", new Object[]{"d", "b", "c", ahxr.class});
        }
        if (iOrdinal == 3) {
            return new ahxs();
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
        return aihn.getParserForClass(ahxs.class);
    }
}
