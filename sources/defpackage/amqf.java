package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amqf extends aihn implements aiis {
    public static final amqf a;
    public static final aihl b;
    public aigj c = aigj.d;
    private int d;

    static {
        amqf amqfVar = new amqf();
        a = amqfVar;
        aihn.registerDefaultInstance(amqf.class, amqfVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, amqfVar, amqfVar, null, 133030216, aika.MESSAGE, amqf.class);
    }

    private amqf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"d", "c"});
        }
        if (iOrdinal == 3) {
            return new amqf();
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
        return aihn.getParserForClass(amqf.class);
    }
}
