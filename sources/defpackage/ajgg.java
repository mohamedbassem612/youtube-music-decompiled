package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajgg extends aihn implements aiis {
    public static final ajgg a;
    public static final aihl b;
    public String c = "";
    public String d = "";
    private int e;

    static {
        ajgg ajggVar = new ajgg();
        a = ajggVar;
        aihn.registerDefaultInstance(ajgg.class, ajggVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, ajggVar, ajggVar, null, 1209, aika.MESSAGE, ajgg.class);
    }

    private ajgg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"e", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ajgg();
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
        return aihn.getParserForClass(ajgg.class);
    }
}
