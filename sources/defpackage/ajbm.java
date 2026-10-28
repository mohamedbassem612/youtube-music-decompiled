package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajbm extends aihn implements aiis {
    public static final ajbm a;
    public boolean b;
    public boolean c;
    public float d;
    public boolean e;
    private int f;
    private int g;

    static {
        ajbm ajbmVar = new ajbm();
        a = ajbmVar;
        aihn.registerDefaultInstance(ajbm.class, ajbmVar);
    }

    private ajbm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0002\u0005&\u0004\u0000\u0000\u0000\u0005ဇ\u0007\u0010ဇ\r\u0012ခ\u000f&ဇ!", new Object[]{"f", "g", "b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new ajbm();
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
        return aihn.getParserForClass(ajbm.class);
    }
}
