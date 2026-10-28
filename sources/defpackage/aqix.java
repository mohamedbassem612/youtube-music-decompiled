package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqix extends aihn implements aiis {
    public static final aqix a;
    public int b;
    public int c;
    public boolean d;
    private int e;

    static {
        aqix aqixVar = new aqix();
        a = aqixVar;
        aihn.registerDefaultInstance(aqix.class, aqixVar);
    }

    private aqix() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002င\u0001\u0003င\u0002\u0005ဇ\u0004", new Object[]{"e", "b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new aqix();
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
        return aihn.getParserForClass(aqix.class);
    }
}
