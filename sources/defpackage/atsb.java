package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class atsb extends aihn implements aiis {
    public static final atsb a;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        atsb atsbVar = new atsb();
        a = atsbVar;
        aihn.registerDefaultInstance(atsb.class, atsbVar);
    }

    private atsb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0001\u0003\b\u0005\u0000\u0000\u0000\u0003;\u0000\u0004;\u0000\u0005;\u0000\u0006;\u0000\bဈ\u0001", new Object[]{"d", "c", "b", "e"});
        }
        if (iOrdinal == 3) {
            return new atsb();
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
        return aihn.getParserForClass(atsb.class);
    }
}
