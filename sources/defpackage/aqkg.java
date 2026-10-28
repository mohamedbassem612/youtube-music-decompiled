package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqkg extends aihn implements aiis {
    public static final aqkg a;
    public int b;
    public int c;
    public int d = 1;
    public int e = 2;

    static {
        aqkg aqkgVar = new aqkg();
        a = aqkgVar;
        aihn.registerDefaultInstance(aqkg.class, aqkgVar);
    }

    private aqkg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"b", "c", aqgv.q, "d", aqgv.p, "e", aqgv.o});
        }
        if (iOrdinal == 3) {
            return new aqkg();
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
        return aihn.getParserForClass(aqkg.class);
    }
}
