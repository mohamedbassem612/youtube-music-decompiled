package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqkf extends aihn implements aiis {
    public static final aqkf a;
    public int b;
    public aqkh c;
    public float d;
    public arby e;
    public int f;

    static {
        aqkf aqkfVar = new aqkf();
        a = aqkfVar;
        aihn.registerDefaultInstance(aqkf.class, aqkfVar);
    }

    private aqkf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ခ\u0001\u0003ဉ\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", "f", aqgv.m});
        }
        if (iOrdinal == 3) {
            return new aqkf();
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
        return aihn.getParserForClass(aqkf.class);
    }
}
