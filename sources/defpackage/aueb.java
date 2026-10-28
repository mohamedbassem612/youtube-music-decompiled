package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aueb extends aihn implements aiis {
    public static final aueb a;
    public int b;
    public int c;
    public String d = "";
    public String e = "";

    static {
        aueb auebVar = new aueb();
        a = auebVar;
        aihn.registerDefaultInstance(aueb.class, auebVar);
    }

    private aueb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"b", "c", atxs.t, "d", "e"});
        }
        if (iOrdinal == 3) {
            return new aueb();
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
        return aihn.getParserForClass(aueb.class);
    }
}
