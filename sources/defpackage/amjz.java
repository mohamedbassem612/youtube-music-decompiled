package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amjz extends aihn implements aiis {
    public static final amjz a;
    public String b = "";
    public int c;
    public int d;
    private int e;

    static {
        amjz amjzVar = new amjz();
        a = amjzVar;
        aihn.registerDefaultInstance(amjz.class, amjzVar);
    }

    private amjz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0004င\u0003", new Object[]{"e", "b", "c", aiwd.j, "d"});
        }
        if (iOrdinal == 3) {
            return new amjz();
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
        return aihn.getParserForClass(amjz.class);
    }
}
