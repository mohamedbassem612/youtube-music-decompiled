package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajbz extends aihn implements aiis {
    public static final ajbz a;
    public int b;
    public aobg c;

    static {
        ajbz ajbzVar = new ajbz();
        a = ajbzVar;
        aihn.registerDefaultInstance(ajbz.class, ajbzVar);
    }

    private ajbz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\uf166₴\uf166₴\u0001\u0000\u0000\u0000\uf166₴ဉ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ajbz();
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
        return aihn.getParserForClass(ajbz.class);
    }
}
