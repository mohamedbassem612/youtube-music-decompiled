package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiyv extends aihn implements aiis {
    public static final aiyv a;
    public int b;
    public String c = "";
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;

    static {
        aiyv aiyvVar = new aiyv();
        a = aiyvVar;
        aihn.registerDefaultInstance(aiyv.class, aiyvVar);
    }

    private aiyv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new aiyv();
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
        return aihn.getParserForClass(aiyv.class);
    }
}
