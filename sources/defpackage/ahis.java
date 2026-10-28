package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahis extends aihn implements aiis {
    public static final ahis a;
    public String b = "";
    public int c;
    public int d;
    public int e;

    static {
        ahis ahisVar = new ahis();
        a = ahisVar;
        aihn.registerDefaultInstance(ahis.class, ahisVar);
    }

    private ahis() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new ahis();
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
        return aihn.getParserForClass(ahis.class);
    }
}
