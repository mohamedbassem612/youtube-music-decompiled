package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aijp extends aihn implements aiis {
    public static final aijp a;
    public long b;
    public int c;

    static {
        aijp aijpVar = new aijp();
        a = aijpVar;
        aihn.registerDefaultInstance(aijp.class, aijpVar);
    }

    private aijp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new aijp();
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
        return aihn.getParserForClass(aijp.class);
    }
}
