package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agzs extends aihn implements aiis {
    public static final agzs a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public long g;

    static {
        agzs agzsVar = new agzs();
        a = agzsVar;
        aihn.registerDefaultInstance(agzs.class, agzsVar);
    }

    private agzs() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0006ဂ\u0004", new Object[]{"b", "c", agzi.g, "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new agzs();
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
        return aihn.getParserForClass(agzs.class);
    }
}
