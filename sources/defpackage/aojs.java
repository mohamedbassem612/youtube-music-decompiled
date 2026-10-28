package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aojs extends aihn implements aiis {
    public static final aojs a;
    private int b;
    private aojr c;

    static {
        aojs aojsVar = new aojs();
        a = aojsVar;
        aihn.registerDefaultInstance(aojs.class, aojsVar);
    }

    private aojs() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဉ\u0003", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new aojs();
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
        return aihn.getParserForClass(aojs.class);
    }
}
