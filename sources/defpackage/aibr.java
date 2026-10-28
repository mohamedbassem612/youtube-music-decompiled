package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aibr extends aihn implements aiis {
    public static final aibr a;
    public int b;
    public String c = "";
    public String d = "";
    public int e;
    public int f;

    static {
        aibr aibrVar = new aibr();
        a = aibrVar;
        aihn.registerDefaultInstance(aibr.class, aibrVar);
    }

    private aibr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", aibu.b, "f", fxi.u});
        }
        if (iOrdinal == 3) {
            return new aibr();
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
        return aihn.getParserForClass(aibr.class);
    }
}
