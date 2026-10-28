package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class andd extends aihn implements aiis {
    public static final andd a;
    public int b;
    public long c;
    public long d;
    public int e;
    public String f = "";

    static {
        andd anddVar = new andd();
        a = anddVar;
        aihn.registerDefaultInstance(andd.class, anddVar);
    }

    private andd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဈ\u0003", new Object[]{"b", "c", "d", "e", amjn.e, "f"});
        }
        if (iOrdinal == 3) {
            return new andd();
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
        return aihn.getParserForClass(andd.class);
    }
}
