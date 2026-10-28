package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class arqm extends aihn implements aiis {
    public static final arqm a;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        arqm arqmVar = new arqm();
        a = arqmVar;
        aihn.registerDefaultInstance(arqm.class, arqmVar);
    }

    private arqm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new arqm();
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
        return aihn.getParserForClass(arqm.class);
    }
}
