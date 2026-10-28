package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class astt extends aihn implements aiis {
    public static final astt a;
    public long b;
    public aiie c = emptyProtobufList();
    public String d = "";
    private int e;

    static {
        astt asttVar = new astt();
        a = asttVar;
        aihn.registerDefaultInstance(astt.class, asttVar);
    }

    private astt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001a\u0003ဈ\u0001", new Object[]{"e", "b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new astt();
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
        return aihn.getParserForClass(astt.class);
    }
}
