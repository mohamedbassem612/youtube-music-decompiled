package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akwf extends aihn implements aiis {
    public static final akwf a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public int f;

    static {
        akwf akwfVar = new akwf();
        a = akwfVar;
        aihn.registerDefaultInstance(akwf.class, akwfVar);
    }

    private akwf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဇ\u0001\u0003င\u0000\u0004ဇ\u0002\u0005᠌\u0003", new Object[]{"b", "d", "c", "e", "f", ajhk.u});
        }
        if (iOrdinal == 3) {
            return new akwf();
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
        return aihn.getParserForClass(akwf.class);
    }
}
