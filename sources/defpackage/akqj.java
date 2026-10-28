package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akqj extends aihn implements aiis {
    public static final akqj a;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public akqi f;

    static {
        akqj akqjVar = new akqj();
        a = akqjVar;
        aihn.registerDefaultInstance(akqj.class, akqjVar);
    }

    private akqj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0005ဉ\u0004", new Object[]{"b", "c", "d", albk.g, "e", arfr.d, "f"});
        }
        if (iOrdinal == 3) {
            return new akqj();
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
        return aihn.getParserForClass(akqj.class);
    }
}
