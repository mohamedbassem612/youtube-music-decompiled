package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class augh extends aihn implements aiis {
    public static final augh a;
    public int b;
    public anfg c;

    static {
        augh aughVar = new augh();
        a = aughVar;
        aihn.registerDefaultInstance(augh.class, aughVar);
    }

    private augh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new augh();
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
        return aihn.getParserForClass(augh.class);
    }
}
