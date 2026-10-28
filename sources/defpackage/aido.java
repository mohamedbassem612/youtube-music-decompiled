package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aido extends aihn implements aiis {
    public static final aido a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    private int j;

    static {
        aido aidoVar = new aido();
        a = aidoVar;
        aihn.registerDefaultInstance(aido.class, aidoVar);
    }

    private aido() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\bဇ\u0007\tဇ\b", new Object[]{"j", "b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new aido();
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
        return aihn.getParserForClass(aido.class);
    }
}
