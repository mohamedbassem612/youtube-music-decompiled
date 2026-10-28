package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class asle extends aihn implements aiis {
    public static final asle a;
    private aiip b = aiip.a;

    static {
        asle asleVar = new asle();
        a = asleVar;
        aihn.registerDefaultInstance(asle.class, asleVar);
    }

    private asle() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", new ahud(aika.INT32, (Object) 0, aika.BOOL, (Object) Boolean.FALSE)});
        }
        if (iOrdinal == 3) {
            return new asle();
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
        return aihn.getParserForClass(asle.class);
    }
}
