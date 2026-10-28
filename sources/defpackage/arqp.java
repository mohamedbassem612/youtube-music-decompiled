package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class arqp extends aihn implements aiis {
    public static final arqp a;
    private aiip b = aiip.a;

    static {
        arqp arqpVar = new arqp();
        a = arqpVar;
        aihn.registerDefaultInstance(arqp.class, arqpVar);
    }

    private arqp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000ÙÙ\u0001\u0001\u0000\u0000Ù2", new Object[]{"b", new ahud(aika.INT32, (Object) 0, aika.FLOAT, (Object) Float.valueOf(0.0f))});
        }
        if (iOrdinal == 3) {
            return new arqp();
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
        return aihn.getParserForClass(arqp.class);
    }
}
