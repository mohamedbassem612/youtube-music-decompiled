package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class asld extends aihn implements aiis {
    public static final asld a;
    private aiip b = aiip.a;

    static {
        asld asldVar = new asld();
        a = asldVar;
        aihn.registerDefaultInstance(asld.class, asldVar);
    }

    private asld() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", new ahud(aika.INT32, (Object) 0, aika.MESSAGE, (Object) asle.a)});
        }
        if (iOrdinal == 3) {
            return new asld();
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
        return aihn.getParserForClass(asld.class);
    }
}
