package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiot extends aihn implements aiis {
    public static final aiot a;
    public int b;
    public int c;

    static {
        aiot aiotVar = new aiot();
        a = aiotVar;
        aihn.registerDefaultInstance(aiot.class, aiotVar);
    }

    private aiot() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\r\r\u0001\u0000\u0000\u0000\rင\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new aiot();
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
        return aihn.getParserForClass(aiot.class);
    }
}
