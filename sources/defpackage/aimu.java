package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aimu extends aihn implements aiis {
    public static final aimu a;
    public static final aihl b;
    public int c = 0;
    public Object d;

    static {
        aimu aimuVar = new aimu();
        a = aimuVar;
        aihn.registerDefaultInstance(aimu.class, aimuVar);
        b = aihn.newSingularGeneratedExtension(ahnj.a, aimuVar, aimuVar, null, 116160814, aika.MESSAGE, aimu.class);
    }

    private aimu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0001\u0000\u0001\u0005\u0003\u0000\u0000\u0000\u0001;\u0000\u0002;\u0000\u0005;\u0000", new Object[]{"d", "c"});
        }
        if (iOrdinal == 3) {
            return new aimu();
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
        return aihn.getParserForClass(aimu.class);
    }
}
