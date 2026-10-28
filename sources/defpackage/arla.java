package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class arla extends aihn implements aiis {
    public static final arla a;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        arla arlaVar = new arla();
        a = arlaVar;
        aihn.registerDefaultInstance(arla.class, arlaVar);
    }

    private arla() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002<\u0000\u0003;\u0000", new Object[]{"d", "c", "b", "e", arkv.class});
        }
        if (iOrdinal == 3) {
            return new arla();
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
        return aihn.getParserForClass(arla.class);
    }
}
