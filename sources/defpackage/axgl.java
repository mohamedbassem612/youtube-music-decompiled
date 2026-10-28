package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axgl extends aihn implements aiis {
    public static final axgl a;
    public static final aihl b;
    public int c;
    public axgi d;
    public axgk e;
    public aijp f;
    public axgj g;

    static {
        axgl axglVar = new axgl();
        a = axglVar;
        aihn.registerDefaultInstance(axgl.class, axglVar);
        b = aihn.newSingularGeneratedExtension(axgh.a, axglVar, axglVar, null, 6, aika.MESSAGE, axgl.class);
    }

    private axgl() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new axgl();
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
        return aihn.getParserForClass(axgl.class);
    }
}
