package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aifd extends aihn implements aiis {
    public static final aifd a;
    public int b;
    public int c;
    public int d;
    public int e;
    private int f;

    static {
        aifd aifdVar = new aifd();
        a = aifdVar;
        aihn.registerDefaultInstance(aifd.class, aifdVar);
    }

    private aifd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003", new Object[]{"f", "b", aidl.j, "c", aidl.e, "d", aidl.d, "e", aidl.o});
        }
        if (iOrdinal == 3) {
            return new aifd();
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
        return aihn.getParserForClass(aifd.class);
    }
}
