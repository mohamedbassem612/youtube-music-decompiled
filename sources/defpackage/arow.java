package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arow extends aihn implements aiis {
    public static final arow a;
    public static final aihl b;
    public String c = "";
    private int d;

    static {
        arow arowVar = new arow();
        a = arowVar;
        aihn.registerDefaultInstance(arow.class, arowVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, arowVar, arowVar, null, 133724106, aika.MESSAGE, arow.class);
    }

    private arow() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "c"});
        }
        if (iOrdinal == 3) {
            return new arow();
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
        return aihn.getParserForClass(arow.class);
    }
}
