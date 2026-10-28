package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aofq extends aihn implements aiis {
    public static final aofq a;
    public int b;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public boolean i;
    public String c = "";
    public String h = "";

    static {
        aofq aofqVar = new aofq();
        a = aofqVar;
        aihn.registerDefaultInstance(aofq.class, aofqVar);
    }

    private aofq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0004ဇ\u0004\u0006᠌\u0006\u0007ဋ\u0002\bဈ\u0007\tဇ\b", new Object[]{"b", "c", "d", "f", "g", aocm.u, "e", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new aofq();
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
        return aihn.getParserForClass(aofq.class);
    }
}
