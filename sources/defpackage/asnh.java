package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asnh extends aihn implements aiis {
    public static final asnh a;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public asmk f;

    static {
        asnh asnhVar = new asnh();
        a = asnhVar;
        aihn.registerDefaultInstance(asnh.class, asnhVar);
    }

    private asnh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d", aqvi.l, "e", aqvi.k, "f"});
        }
        if (iOrdinal == 3) {
            return new asnh();
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
        return aihn.getParserForClass(asnh.class);
    }
}
