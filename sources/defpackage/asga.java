package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class asga extends aihn implements aiis {
    public static final asga a;
    public int b;
    public aiie c = emptyProtobufList();
    public ajhl d;

    static {
        asga asgaVar = new asga();
        a = asgaVar;
        aihn.registerDefaultInstance(asga.class, asgaVar);
    }

    private asga() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"b", "c", ajhl.class, "d"});
        }
        if (iOrdinal == 3) {
            return new asga();
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
        return aihn.getParserForClass(asga.class);
    }
}
