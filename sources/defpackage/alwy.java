package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alwy extends aihn implements aiis {
    public static final alwy a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;

    static {
        alwy alwyVar = new alwy();
        a = alwyVar;
        aihn.registerDefaultInstance(alwy.class, alwyVar);
    }

    private alwy() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004᠌\u0003\u0005င\u0004\u0006ဇ\u0005\u0007င\u0006", new Object[]{"b", "c", alre.e, "d", "e", "f", alre.f, "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new alwy();
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
        return aihn.getParserForClass(alwy.class);
    }
}
