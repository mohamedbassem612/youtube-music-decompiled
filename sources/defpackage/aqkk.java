package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqkk extends aihn implements aiis {
    public static final aqkk a;
    public int b;
    public aqkj d;
    public aqkf e;
    public float g;
    public String c = "";
    public int f = 3;

    static {
        aqkk aqkkVar = new aqkk();
        a = aqkkVar;
        aihn.registerDefaultInstance(aqkk.class, aqkkVar);
    }

    private aqkk() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004᠌\u0003\u0005ခ\u0004", new Object[]{"b", "c", "d", "e", "f", aqgv.n, "g"});
        }
        if (iOrdinal == 3) {
            return new aqkk();
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
        return aihn.getParserForClass(aqkk.class);
    }
}
