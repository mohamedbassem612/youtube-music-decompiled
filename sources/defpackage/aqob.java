package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqob extends aihn implements aiis {
    public static final aqob a;
    public int b;
    private int c;

    static {
        aqob aqobVar = new aqob();
        a = aqobVar;
        aihn.registerDefaultInstance(aqob.class, aqobVar);
    }

    private aqob() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"c", "b", aqkp.m});
        }
        if (iOrdinal == 3) {
            return new aqob();
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
        return aihn.getParserForClass(aqob.class);
    }
}
