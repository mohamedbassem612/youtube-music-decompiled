package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aisp extends aihn implements aiis {
    public static final aisp a;
    public boolean b;
    private int c;

    static {
        aisp aispVar = new aisp();
        a = aispVar;
        aihn.registerDefaultInstance(aisp.class, aispVar);
    }

    private aisp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new aisp();
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
        return aihn.getParserForClass(aisp.class);
    }
}
