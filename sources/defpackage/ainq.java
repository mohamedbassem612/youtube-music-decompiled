package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ainq extends aihn implements aiis {
    public static final ainq a;
    public static final aihl b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;

    static {
        ainq ainqVar = new ainq();
        a = ainqVar;
        aihn.registerDefaultInstance(ainq.class, ainqVar);
        b = aihn.newSingularGeneratedExtension(ainp.a, ainqVar, ainqVar, null, 1001, aika.MESSAGE, ainq.class);
    }

    private ainq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ainq();
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
        return aihn.getParserForClass(ainq.class);
    }
}
