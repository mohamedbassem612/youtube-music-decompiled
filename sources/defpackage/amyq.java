package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amyq extends aihn implements aiis {
    public static final amyq a;
    public int b;
    public int c;
    public int d;

    static {
        amyq amyqVar = new amyq();
        a = amyqVar;
        aihn.registerDefaultInstance(amyq.class, amyqVar);
    }

    private amyq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", amyr.a});
        }
        if (iOrdinal == 3) {
            return new amyq();
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
        return aihn.getParserForClass(amyq.class);
    }
}
