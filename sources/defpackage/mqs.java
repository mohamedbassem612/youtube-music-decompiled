package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mqs extends aihn implements aiis {
    public static final mqs a;
    public static final aihl b;
    public int c;
    public int d;
    public int e;

    static {
        mqs mqsVar = new mqs();
        a = mqsVar;
        aihn.registerDefaultInstance(mqs.class, mqsVar);
        b = aihn.newSingularGeneratedExtension(mqt.a, mqsVar, mqsVar, null, 101, aika.MESSAGE, mqs.class);
    }

    private mqs() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new mqs();
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
        return aihn.getParserForClass(mqs.class);
    }
}
