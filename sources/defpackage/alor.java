package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alor extends aihn implements aiis {
    public static final alor a;
    public int b;
    public String c = "";
    public boolean d;
    public boolean e;

    static {
        alor alorVar = new alor();
        a = alorVar;
        aihn.registerDefaultInstance(alor.class, alorVar);
    }

    private alor() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0003\u000f\u0003\u0000\u0000\u0000\u0003ဈ\u0001\u0007ဇ\u0002\u000fဇ\b", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new alor();
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
        return aihn.getParserForClass(alor.class);
    }
}
