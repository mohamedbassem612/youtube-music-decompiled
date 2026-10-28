package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akjr extends aihn implements aiis {
    public static final akjr a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        akjr akjrVar = new akjr();
        a = akjrVar;
        aihn.registerDefaultInstance(akjr.class, akjrVar);
    }

    private akjr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0004\t\u0005\u0000\u0000\u0000\u0004᠌\u0003\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b", new Object[]{"b", "c", akjs.b, "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new akjr();
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
        return aihn.getParserForClass(akjr.class);
    }
}
