package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class algy extends aihn implements aiis {
    public static final algy a;
    public static final aihl b;
    public String c = "";
    public int d;
    private int e;

    static {
        algy algyVar = new algy();
        a = algyVar;
        aihn.registerDefaultInstance(algy.class, algyVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, algyVar, algyVar, null, 1825, aika.MESSAGE, algy.class);
    }

    private algy() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003င\u0002", new Object[]{"e", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new algy();
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
        return aihn.getParserForClass(algy.class);
    }
}
