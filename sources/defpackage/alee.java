package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alee extends aihn implements aiis {
    public static final alee a;
    public static final aihl b;
    public alyn c;
    public int d;
    private int e;

    static {
        alee aleeVar = new alee();
        a = aleeVar;
        aihn.registerDefaultInstance(alee.class, aleeVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aleeVar, aleeVar, null, 284673439, aika.MESSAGE, alee.class);
    }

    private alee() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001", new Object[]{"e", "c", "d", alre.n});
        }
        if (iOrdinal == 3) {
            return new alee();
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
        return aihn.getParserForClass(alee.class);
    }
}
