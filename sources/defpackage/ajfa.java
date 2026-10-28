package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajfa extends aihn implements aiis {
    public static final ajfa a;
    public String b = "";
    private int c;

    static {
        ajfa ajfaVar = new ajfa();
        a = ajfaVar;
        aihn.registerDefaultInstance(ajfa.class, ajfaVar);
    }

    private ajfa() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new ajfa();
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
        return aihn.getParserForClass(ajfa.class);
    }
}
