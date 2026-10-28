package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class asdu extends aihn implements aiis {
    public static final asdu a;
    public aiip b = aiip.a;

    static {
        asdu asduVar = new asdu();
        a = asduVar;
        aihn.registerDefaultInstance(asdu.class, asduVar);
    }

    private asdu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", new ahud(aika.STRING, "", aika.BYTES, aigj.d)});
        }
        if (iOrdinal == 3) {
            return new asdu();
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
        return aihn.getParserForClass(asdu.class);
    }
}
