package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class agcz extends aihn implements aiis {
    public static final agcz a;
    public int b;
    public aigj c;
    public aigj d;
    public agcy e;
    public aigj f;

    static {
        agcz agczVar = new agcz();
        a = agczVar;
        aihn.registerDefaultInstance(agcz.class, agczVar);
    }

    private agcz() {
        aigj aigjVar = aigj.d;
        this.c = aigjVar;
        this.d = aigjVar;
        this.f = aigjVar;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ဉ\u0002\u0005ည\u0004", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new agcz();
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
        return aihn.getParserForClass(agcz.class);
    }
}
