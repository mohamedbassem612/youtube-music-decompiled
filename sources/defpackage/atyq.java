package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atyq extends aihn implements aiis {
    public static final atyq a;
    public int b;
    public int c;
    public boolean d;
    public long e;

    static {
        atyq atyqVar = new atyq();
        a = atyqVar;
        aihn.registerDefaultInstance(atyq.class, atyqVar);
    }

    private atyq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\t\u0004\u0000\u0000\u0000\u0001\u0004\u0003\u0004\b\u0007\t\u0003", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new atyq();
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
        return aihn.getParserForClass(atyq.class);
    }
}
