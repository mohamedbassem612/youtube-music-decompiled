package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqoa extends aihn implements aiis {
    public static final aqoa a;
    public int b;
    public int c;
    public float d;
    public int e;
    public boolean f;

    static {
        aqoa aqoaVar = new aqoa();
        a = aqoaVar;
        aihn.registerDefaultInstance(aqoa.class, aqoaVar);
    }

    private aqoa() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0004ခ\u0001\u0005᠌\u0002\bဇ\u0005", new Object[]{"b", "c", aqkp.n, "d", "e", aqkp.k, "f"});
        }
        if (iOrdinal == 3) {
            return new aqoa();
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
        return aihn.getParserForClass(aqoa.class);
    }
}
