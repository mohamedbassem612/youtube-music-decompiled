package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mqu extends aihn implements aiis {
    public static final mqu a;
    public static final aihl b;
    public int c;
    public int d;

    static {
        mqu mquVar = new mqu();
        a = mquVar;
        aihn.registerDefaultInstance(mqu.class, mquVar);
        b = aihn.newSingularGeneratedExtension(mqt.a, mquVar, mquVar, null, 103, aika.MESSAGE, mqu.class);
    }

    private mqu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "d"});
        }
        if (iOrdinal == 3) {
            return new mqu();
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
        return aihn.getParserForClass(mqu.class);
    }
}
