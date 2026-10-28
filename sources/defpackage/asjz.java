package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class asjz extends aihn implements aiis {
    public static final asjz a;
    public int b;
    public aijp c;
    public long d;
    public long e;

    static {
        asjz asjzVar = new asjz();
        a = asjzVar;
        aihn.registerDefaultInstance(asjz.class, asjzVar);
    }

    private asjz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0001\u0002ဉ\u0000\u0003ဂ\u0002", new Object[]{"b", "d", "c", "e"});
        }
        if (iOrdinal == 3) {
            return new asjz();
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
        return aihn.getParserForClass(asjz.class);
    }
}
