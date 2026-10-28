package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aidx extends aihn implements aiis {
    public static final aidx a;
    public int b;
    public aieg c;
    public float d;
    public aidw e;
    public int f;

    static {
        aidx aidxVar = new aidx();
        a = aidxVar;
        aihn.registerDefaultInstance(aidx.class, aidxVar);
    }

    private aidx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ခ\u0001\u0003ဉ\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", "f", aidl.g});
        }
        if (iOrdinal == 3) {
            return new aidx();
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
        return aihn.getParserForClass(aidx.class);
    }
}
