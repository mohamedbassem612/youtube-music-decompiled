package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alea extends aihn implements aiis {
    public static final alea a;
    public static final aihl b;
    public String c = "";
    private int d;

    static {
        alea aleaVar = new alea();
        a = aleaVar;
        aihn.registerDefaultInstance(alea.class, aleaVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aleaVar, aleaVar, null, 113762617, aika.MESSAGE, alea.class);
    }

    private alea() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "c"});
        }
        if (iOrdinal == 3) {
            return new alea();
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
        return aihn.getParserForClass(alea.class);
    }
}
