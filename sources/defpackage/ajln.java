package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajln extends aihn implements aiis {
    public static final ajln a;
    public int b;
    public int c;
    public int d;

    static {
        ajln ajlnVar = new ajln();
        a = ajlnVar;
        aihn.registerDefaultInstance(ajln.class, ajlnVar);
    }

    private ajln() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"b", "c", ajhd.h, "d"});
        }
        if (iOrdinal == 3) {
            return new ajln();
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
        return aihn.getParserForClass(ajln.class);
    }
}
