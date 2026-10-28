package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class arln extends aihn implements aiis {
    public static final arln a;
    public double b;
    public double c;
    public double d;
    public double e;
    private int f;

    static {
        arln arlnVar = new arln();
        a = arlnVar;
        aihn.registerDefaultInstance(arln.class, arlnVar);
    }

    private arln() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003က\u0002\u0004က\u0003", new Object[]{"f", "b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new arln();
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
        return aihn.getParserForClass(arln.class);
    }
}
