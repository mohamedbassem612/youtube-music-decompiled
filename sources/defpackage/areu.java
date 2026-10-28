package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class areu extends aihn implements aiis {
    public static final areu a;
    public static final aihl b;
    public int c;
    public String d = "";
    public String e = "";
    public long f;
    public long g;

    static {
        areu areuVar = new areu();
        a = areuVar;
        aihn.registerDefaultInstance(areu.class, areuVar);
        b = aihn.newSingularGeneratedExtension(akvi.a, areuVar, areuVar, null, 76, aika.MESSAGE, areu.class);
    }

    private areu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new areu();
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
        return aihn.getParserForClass(areu.class);
    }
}
