package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aplr extends aihn implements aiis {
    public static final aplr a;
    public String b = "";
    public String c = "";
    public int d;
    private int e;

    static {
        aplr aplrVar = new aplr();
        a = aplrVar;
        aihn.registerDefaultInstance(aplr.class, aplrVar);
    }

    private aplr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002", new Object[]{"e", "b", "c", "d", apjs.h});
        }
        if (iOrdinal == 3) {
            return new aplr();
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
        return aihn.getParserForClass(aplr.class);
    }
}
