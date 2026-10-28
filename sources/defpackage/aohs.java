package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aohs extends aihn implements aiis {
    public static final aohs a;
    public int b;
    public boolean c;
    public aihv d = emptyIntList();
    public boolean e;
    public int f;
    public boolean g;
    public int h;

    static {
        aohs aohsVar = new aohs();
        a = aohsVar;
        aihn.registerDefaultInstance(aohs.class, aohsVar);
    }

    private aohs() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0003\b\u0006\u0000\u0001\u0000\u0003ဇ\u0002\u0004\u0016\u0005ဇ\u0003\u0006᠌\u0004\u0007ဇ\u0005\b᠌\u0006", new Object[]{"b", "c", "d", "e", "f", amyr.u, "g", "h", aobi.h});
        }
        if (iOrdinal == 3) {
            return new aohs();
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
        return aihn.getParserForClass(aohs.class);
    }
}
