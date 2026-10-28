package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aieq extends aihn implements aiis {
    public static final aieq a;
    public Object c;
    public boolean e;
    private int f;
    public int b = 0;
    public String d = "";

    static {
        aieq aieqVar = new aieq();
        a = aieqVar;
        aihn.registerDefaultInstance(aieq.class, aieqVar);
    }

    private aieq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0001\u0002ဈ\u0000\u0003;\u0000\u0004;\u0000\u0005:\u0000\u0006:\u0000", new Object[]{"c", "b", "f", "e", "d"});
        }
        if (iOrdinal == 3) {
            return new aieq();
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
        return aihn.getParserForClass(aieq.class);
    }
}
