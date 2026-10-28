package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amtu extends aihn implements aiis {
    public static final amtu a;
    public static final aihl b;
    public int c;
    public int d;
    public int e;
    public int f;
    public akzk g;
    public String h = "";
    public long i;
    public int j;

    static {
        amtu amtuVar = new amtu();
        a = amtuVar;
        aihn.registerDefaultInstance(amtu.class, amtuVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, amtuVar, amtuVar, null, 346644970, aika.MESSAGE, amtu.class);
    }

    private amtu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဉ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007᠌\u0006", new Object[]{"c", "d", "e", akvb.l, "f", akvb.m, "g", "h", "i", "j", akux.n});
        }
        if (iOrdinal == 3) {
            return new amtu();
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
        return aihn.getParserForClass(amtu.class);
    }
}
