package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqkm extends aihn implements aiis {
    public static final aqkm a;
    public int b;
    public float d;
    public aqkl e;
    public String c = "";
    public int f = 2;

    static {
        aqkm aqkmVar = new aqkm();
        a = aqkmVar;
        aihn.registerDefaultInstance(aqkm.class, aqkmVar);
    }

    private aqkm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ဉ\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", "f", aqgv.t});
        }
        if (iOrdinal == 3) {
            return new aqkm();
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
        return aihn.getParserForClass(aqkm.class);
    }
}
