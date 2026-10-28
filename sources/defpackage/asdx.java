package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class asdx extends aihn implements aiis {
    public static final asdx a;
    public long b;
    private int c;

    static {
        asdx asdxVar = new asdx();
        a = asdxVar;
        aihn.registerDefaultInstance(asdx.class, asdxVar);
    }

    private asdx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new asdx();
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
        return aihn.getParserForClass(asdx.class);
    }
}
