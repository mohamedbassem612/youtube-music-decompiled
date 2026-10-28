package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anhq extends aihn implements aiis {
    public static final anhq a;
    private int b;
    private anhp c;

    static {
        anhq anhqVar = new anhq();
        a = anhqVar;
        aihn.registerDefaultInstance(anhq.class, anhqVar);
    }

    private anhq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0000\u0007ဉ\u0006", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new anhq();
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
        return aihn.getParserForClass(anhq.class);
    }
}
