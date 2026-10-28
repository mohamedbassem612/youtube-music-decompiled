package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axgp extends aihn implements aiis {
    public static final axgp a;
    public int b;
    public axgo c;
    public axhg d;
    public int e;
    public axgn f;
    public String g = "";

    static {
        axgp axgpVar = new axgp();
        a = axgpVar;
        aihn.registerDefaultInstance(axgp.class, axgpVar);
    }

    private axgp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0004ဉ\u0003\u0005ဈ\u0004", new Object[]{"b", "c", "d", "e", audg.o, "f", "g"});
        }
        if (iOrdinal == 3) {
            return new axgp();
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
        return aihn.getParserForClass(axgp.class);
    }
}
