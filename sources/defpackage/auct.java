package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auct extends aihn implements aiis {
    public static final auct a;
    public int b;
    public aucj c;
    public aubn d;
    public aubq e;
    public int f;

    static {
        auct auctVar = new auct();
        a = auctVar;
        aihn.registerDefaultInstance(auct.class, auctVar);
    }

    private auct() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0004\u0007\u0004\u0000\u0000\u0000\u0004ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002\u0007င\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new auct();
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
        return aihn.getParserForClass(auct.class);
    }
}
