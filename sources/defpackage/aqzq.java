package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqzq extends aihn implements aiis {
    public static final aqzq a;
    public int b;
    public boolean f;
    public int h;
    public int i;
    public int j;
    public String c = "";
    public String d = "";
    public String e = "";
    public String g = "";

    static {
        aqzq aqzqVar = new aqzq();
        a = aqzqVar;
        aihn.registerDefaultInstance(aqzq.class, aqzqVar);
    }

    private aqzq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဈ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new aqzq();
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
        return aihn.getParserForClass(aqzq.class);
    }
}
