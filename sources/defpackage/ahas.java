package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahas extends aihn implements aiis {
    public static final ahas a;
    public int b;
    public ahai c;
    public long d;
    public long e;

    static {
        ahas ahasVar = new ahas();
        a = ahasVar;
        aihn.registerDefaultInstance(ahas.class, ahasVar);
    }

    private ahas() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဃ\u0001\u0003ဃ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new ahas();
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
        return aihn.getParserForClass(ahas.class);
    }
}
