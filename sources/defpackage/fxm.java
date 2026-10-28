package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fxm extends aihn implements aiis {
    public static final fxm a;
    public int b;
    public aigj c;
    public aigj d;
    public aigj e;
    public aigj f;

    static {
        fxm fxmVar = new fxm();
        a = fxmVar;
        aihn.registerDefaultInstance(fxm.class, fxmVar);
    }

    private fxm() {
        aigj aigjVar = aigj.d;
        this.c = aigjVar;
        this.d = aigjVar;
        this.e = aigjVar;
        this.f = aigjVar;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new fxm();
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
        return aihn.getParserForClass(fxm.class);
    }
}
