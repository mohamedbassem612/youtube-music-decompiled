package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class arqq extends aihn implements aiis {
    public static final arqq a;
    private aiip b = aiip.a;

    static {
        arqq arqqVar = new arqq();
        a = arqqVar;
        aihn.registerDefaultInstance(arqq.class, arqqVar);
    }

    private arqq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000ƱƱ\u0001\u0001\u0000\u0000Ʊ2", new Object[]{"b", new ahud(aika.INT32, (Object) 0, aika.FLOAT, (Object) Float.valueOf(0.0f))});
        }
        if (iOrdinal == 3) {
            return new arqq();
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
        return aihn.getParserForClass(arqq.class);
    }
}
