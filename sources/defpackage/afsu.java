package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afsu extends aihn implements aiis {
    public static final afsu a;
    public int b;
    public long e;
    public long c = -1;
    public aiie d = emptyProtobufList();
    public aihv f = emptyIntList();

    static {
        afsu afsuVar = new afsu();
        a = afsuVar;
        aihn.registerDefaultInstance(afsu.class, afsuVar);
    }

    private afsu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဂ\u0000\u0002\u001b\u0003ဂ\u0001\u0004\u0016", new Object[]{"b", "c", "d", afst.class, "e", "f"});
        }
        if (iOrdinal == 3) {
            return new afsu();
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
        return aihn.getParserForClass(afsu.class);
    }
}
