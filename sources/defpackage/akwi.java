package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akwi extends aihn implements aiis {
    public static final akwi a;
    public long b;
    public long c;
    public float d;
    private int e;

    static {
        akwi akwiVar = new akwi();
        a = akwiVar;
        aihn.registerDefaultInstance(akwi.class, akwiVar);
    }

    private akwi() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001\u0003ခ\u0002", new Object[]{"e", "b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new akwi();
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
        return aihn.getParserForClass(akwi.class);
    }
}
