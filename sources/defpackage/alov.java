package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alov extends aihn implements aiis {
    public static final alov a;
    public int b;
    public long c;
    public aloz d;
    public aoky e;
    public int f;

    static {
        alov alovVar = new alov();
        a = alovVar;
        aihn.registerDefaultInstance(alov.class, alovVar);
    }

    private alov() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဉ\u0002\u0004ဉ\u0003\u0005᠌\u0004", new Object[]{"b", "c", "d", "e", "f", ajhk.c});
        }
        if (iOrdinal == 3) {
            return new alov();
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
        return aihn.getParserForClass(alov.class);
    }
}
