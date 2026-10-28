package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajue extends aihn implements aiis {
    public static final aihw a = new aiat(6);
    public static final ajue b;
    public int c;
    public int f;
    public akkd j;
    public String d = "";
    public String e = "";
    public aihv g = emptyIntList();
    public String h = "";
    public String i = "";
    public String k = "";

    static {
        ajue ajueVar = new ajue();
        b = ajueVar;
        aihn.registerDefaultInstance(ajue.class, ajueVar);
    }

    private ajue() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0001\b\u0000\u0001\u0003\n\b\u0000\u0001\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005᠌\u0003\u0006ࠞ\u0007ဈ\u0004\bဈ\u0005\tဉ\u0006\nဈ\u0007", new Object[]{"c", "d", "e", "f", ajpr.n, "g", aiod.q, "h", "i", "j", "k"});
        }
        if (iOrdinal == 3) {
            return new ajue();
        }
        if (iOrdinal == 4) {
            return new aihf(b);
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(ajue.class);
    }
}
