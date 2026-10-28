package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afyf extends aihn implements aiis {
    public static final afyf a;
    public int b;
    public int c = 5;
    public int d;

    static {
        afyf afyfVar = new afyf();
        a = afyfVar;
        aihn.registerDefaultInstance(afyf.class, afyfVar);
    }

    private afyf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"b", "c", oia.s, "d", oia.t});
        }
        if (iOrdinal == 3) {
            return new afyf();
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
        return aihn.getParserForClass(afyf.class);
    }
}
