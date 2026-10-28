package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aluh extends aihn implements aiis {
    public static final aluh a;
    public int b;
    public long c;

    static {
        aluh aluhVar = new aluh();
        a = aluhVar;
        aihn.registerDefaultInstance(aluh.class, aluhVar);
    }

    private aluh() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဂ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new aluh();
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
        return aihn.getParserForClass(aluh.class);
    }
}
