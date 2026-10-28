package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atxg extends aihn implements aiis {
    public static final atxg a;
    public int b;
    public double c;
    public double d;
    public atsr e;
    public int f;
    public long g;

    static {
        atxg atxgVar = new atxg();
        a = atxgVar;
        aihn.registerDefaultInstance(atxg.class, atxgVar);
    }

    private atxg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0003ဉ\u0000\u0004\f\u0005\u0002", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new atxg();
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
        return aihn.getParserForClass(atxg.class);
    }
}
