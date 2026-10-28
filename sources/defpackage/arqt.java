package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class arqt extends aihn implements aiis {
    public static final arqt a;
    private aiip b = aiip.a;

    static {
        arqt arqtVar = new arqt();
        a = arqtVar;
        aihn.registerDefaultInstance(arqt.class, arqtVar);
    }

    private arqt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000II\u0001\u0001\u0000\u0000I2", new Object[]{"b", new ahud(aika.INT32, (Object) 0, aika.MESSAGE, (Object) asql.a)});
        }
        if (iOrdinal == 3) {
            return new arqt();
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
        return aihn.getParserForClass(arqt.class);
    }
}
