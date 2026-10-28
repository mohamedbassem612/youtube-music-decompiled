package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqjb extends aihn implements aiis {
    public static final aqjb a;
    public int b;
    public boolean c;
    private int d;

    static {
        aqjb aqjbVar = new aqjb();
        a = aqjbVar;
        aihn.registerDefaultInstance(aqjb.class, aqjbVar);
    }

    private aqjb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0002\u0006\u0002\u0000\u0000\u0000\u0002င\u0001\u0006ဇ\u0005", new Object[]{"d", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new aqjb();
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
        return aihn.getParserForClass(aqjb.class);
    }
}
