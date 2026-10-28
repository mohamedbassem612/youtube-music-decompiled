package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aoow extends aihn implements aiis {
    public static final aoow a;
    public boolean b;
    public int c;
    public int d;
    public boolean e;
    private int f;

    static {
        aoow aoowVar = new aoow();
        a = aoowVar;
        aihn.registerDefaultInstance(aoow.class, aoowVar);
    }

    private aoow() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0000\u0000\u0002ဇ\u0001\u0004င\u0002\u0005င\u0003\u0006ဇ\u0004", new Object[]{"f", "b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new aoow();
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
        return aihn.getParserForClass(aoow.class);
    }
}
