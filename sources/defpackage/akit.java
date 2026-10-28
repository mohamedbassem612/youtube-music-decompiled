package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akit extends aihn implements aiis {
    public static final akit a;
    public int b;
    public float c;
    public float d;

    static {
        akit akitVar = new akit();
        a = akitVar;
        aihn.registerDefaultInstance(akit.class, akitVar);
    }

    private akit() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0003ခ\u0002", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new akit();
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
        return aihn.getParserForClass(akit.class);
    }
}
