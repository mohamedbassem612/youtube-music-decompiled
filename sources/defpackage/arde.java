package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class arde extends aihn implements aiis {
    public static final arde a;
    public int b;
    public int d;
    public String c = "";
    public aigj e = aigj.d;

    static {
        arde ardeVar = new arde();
        a = ardeVar;
        aihn.registerDefaultInstance(arde.class, ardeVar);
    }

    private arde() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ည\u0002", new Object[]{"b", "c", "d", aobi.f, "e"});
        }
        if (iOrdinal == 3) {
            return new arde();
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
        return aihn.getParserForClass(arde.class);
    }
}
