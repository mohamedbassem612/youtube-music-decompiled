package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqia extends aihn implements aiis {
    public static final aqia a;
    public int b;
    public int c;
    public int d;
    public int e;
    public String f = "";
    public long g;

    static {
        aqia aqiaVar = new aqia();
        a = aqiaVar;
        aihn.registerDefaultInstance(aqia.class, aqiaVar);
    }

    private aqia() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဂ\u0004", new Object[]{"b", "c", apdr.p, "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new aqia();
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
        return aihn.getParserForClass(aqia.class);
    }
}
