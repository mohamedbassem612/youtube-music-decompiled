package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atyp extends aihn implements aiis {
    public static final atyp a;
    public long b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        atyp atypVar = new atyp();
        a = atypVar;
        aihn.registerDefaultInstance(atyp.class, atypVar);
    }

    private atyp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\b\u0004\u0000\u0000\u0000\u0001\u0003\u0004Ȉ\u0006Ȉ\bȈ", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new atyp();
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
        return aihn.getParserForClass(atyp.class);
    }
}
