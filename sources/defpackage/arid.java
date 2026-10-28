package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arid extends aihn implements aiis {
    public static final arid a;
    public aria b;
    private int c;

    static {
        arid aridVar = new arid();
        a = aridVar;
        aihn.registerDefaultInstance(arid.class, aridVar);
    }

    private arid() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue6e2⸏\ue6e2⸏\u0001\u0000\u0000\u0000\ue6e2⸏ဉ\u0000", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new arid();
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
        return aihn.getParserForClass(arid.class);
    }
}
