package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ankh extends aihn implements aiis {
    public static final ankh a;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public long g;

    static {
        ankh ankhVar = new ankh();
        a = ankhVar;
        aihn.registerDefaultInstance(ankh.class, ankhVar);
    }

    private ankh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\r\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0005ဇ\u0004\u0007င\u0006\u000b᠌\n\rဂ\f", new Object[]{"b", "c", amyr.n, "d", "e", "f", amyr.t, "g"});
        }
        if (iOrdinal == 3) {
            return new ankh();
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
        return aihn.getParserForClass(ankh.class);
    }
}
