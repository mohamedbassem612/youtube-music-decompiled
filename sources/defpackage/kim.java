package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kim extends aihn implements aiis {
    public static final kim a;
    public int b;
    public kik c;
    public kil d;
    public int e;

    static {
        kim kimVar = new kim();
        a = kimVar;
        aihn.registerDefaultInstance(kim.class, kimVar);
    }

    private kim() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0000\u0001᠌\u0002\u0003ဉ\u0001\u0006ဉ\u0000", new Object[]{"b", "e", audg.h, "d", "c"});
        }
        if (iOrdinal == 3) {
            return new kim();
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
        return aihn.getParserForClass(kim.class);
    }
}
