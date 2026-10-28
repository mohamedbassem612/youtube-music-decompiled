package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amuc extends aihn implements aiis {
    public static final amuc a;
    public int b;
    public akvx c;
    public akzo d;
    public aply e;

    static {
        amuc amucVar = new amuc();
        a = amucVar;
        aihn.registerDefaultInstance(amuc.class, amucVar);
    }

    private amuc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0003\u0007\u0003\u0000\u0000\u0000\u0003ဉ\u0002\u0004ဉ\u0003\u0007ဉ\u0006", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new amuc();
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
        return aihn.getParserForClass(amuc.class);
    }
}
