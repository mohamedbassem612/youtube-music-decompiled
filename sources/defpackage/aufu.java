package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aufu extends aihn implements aiis {
    public static final aufu a;
    public static final aihl b;
    public int c;
    public alcv d;

    static {
        aufu aufuVar = new aufu();
        a = aufuVar;
        aihn.registerDefaultInstance(aufu.class, aufuVar);
        b = aihn.newSingularGeneratedExtension(aufs.a, aufuVar, aufuVar, null, 1011, aika.MESSAGE, aufu.class);
    }

    private aufu() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "d"});
        }
        if (iOrdinal == 3) {
            return new aufu();
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
        return aihn.getParserForClass(aufu.class);
    }
}
