package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ashq extends aihn implements aiis {
    public static final ashq a;
    public int b;
    public String c = "";
    public int d;
    public asgn e;
    public asgo f;

    static {
        ashq ashqVar = new ashq();
        a = ashqVar;
        aihn.registerDefaultInstance(ashq.class, ashqVar);
    }

    private ashq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0003᠌\u0001\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"b", "c", "d", asel.j, "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ashq();
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
        return aihn.getParserForClass(ashq.class);
    }
}
