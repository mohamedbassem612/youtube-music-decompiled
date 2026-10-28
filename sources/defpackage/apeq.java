package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apeq extends aihn implements aiis {
    public static final apeq a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    private int f;
    private int g;
    private int h;

    static {
        apeq apeqVar = new apeq();
        a = apeqVar;
        aihn.registerDefaultInstance(apeq.class, apeqVar);
    }

    private apeq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0003\u0005E\u0004\u0000\u0000\u0000\u0005ဇ\u0004'ဇ$1င.E᠌A", new Object[]{"f", "g", "h", "b", "c", "d", "e", apdr.a});
        }
        if (iOrdinal == 3) {
            return new apeq();
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
        return aihn.getParserForClass(apeq.class);
    }
}
