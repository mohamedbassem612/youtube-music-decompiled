package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apsv extends aihn implements aiis {
    public static final apsv a;
    public int b;
    public int c = 0;
    public Object d;
    public apst e;

    static {
        apsv apsvVar = new apsv();
        a = apsvVar;
        aihn.registerDefaultInstance(apsv.class, apsvVar);
    }

    private apsv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0006ဉ\u0001", new Object[]{"d", "c", "b", apsq.class, apsp.class, apso.class, andh.class, "e"});
        }
        if (iOrdinal == 3) {
            return new apsv();
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
        return aihn.getParserForClass(apsv.class);
    }
}
