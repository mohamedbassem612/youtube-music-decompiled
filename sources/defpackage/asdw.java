package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class asdw extends aihn implements aiis {
    public static final asdw a;
    public int b;
    public aigj c = aigj.d;

    static {
        asdw asdwVar = new asdw();
        a = asdwVar;
        aihn.registerDefaultInstance(asdw.class, asdwVar);
    }

    private asdw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new asdw();
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
        return aihn.getParserForClass(asdw.class);
    }
}
