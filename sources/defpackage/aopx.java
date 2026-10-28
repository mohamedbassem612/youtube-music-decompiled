package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aopx extends aihn implements aiis {
    public static final aopx a;
    public int b;
    public int e;
    public boolean f;
    public int g;
    public boolean h;
    public int i;
    public int j;
    public String c = "";
    public aihv d = emptyIntList();
    public boolean k = true;

    static {
        aopx aopxVar = new aopx();
        a = aopxVar;
        aihn.registerDefaultInstance(aopx.class, aopxVar);
    }

    private aopx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0000\u0001\u0002\u000b\t\u0000\u0001\u0000\u0002\u0016\u0003င\u0001\u0004င\u0003\u0005᠌\u0005\u0006ဇ\u0002\u0007ဇ\u0004\bဈ\u0000\tဇ\u0007\u000b᠌\u0006", new Object[]{"b", "d", "e", "g", "i", aomi.p, "f", "h", "c", "k", "j", ajhd.q});
        }
        if (iOrdinal == 3) {
            return new aopx();
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
        return aihn.getParserForClass(aopx.class);
    }
}
