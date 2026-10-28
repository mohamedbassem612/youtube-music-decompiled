package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class anzh extends aihn implements aiis {
    public static final anzh a;
    public int b;
    public int d;
    public long e;
    public String c = "";
    public String f = "";

    static {
        anzh anzhVar = new anzh();
        a = anzhVar;
        aihn.registerDefaultInstance(anzh.class, anzhVar);
    }

    private anzh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0003င\u0002\u0005ဂ\u0004\u0006ဈ\u0005", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new anzh();
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
        return aihn.getParserForClass(anzh.class);
    }
}
