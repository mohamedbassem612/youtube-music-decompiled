package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fxp extends aihn implements aiis {
    public static final fxp a;
    public int b;
    public aiie c = emptyProtobufList();
    public aigj d = aigj.d;
    public int e = 1;
    public int f = 1;

    static {
        fxp fxpVar = new fxp();
        a = fxpVar;
        aihn.registerDefaultInstance(fxp.class, fxpVar);
    }

    private fxp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"b", "c", "d", "e", fxi.e, "f", fxi.c});
        }
        if (iOrdinal == 3) {
            return new fxp();
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
        return aihn.getParserForClass(fxp.class);
    }
}
