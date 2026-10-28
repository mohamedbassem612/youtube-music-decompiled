package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class armh extends aihn implements aiis {
    public static final armh a;
    public aigj b = aigj.d;
    private int c;

    static {
        armh armhVar = new armh();
        a = armhVar;
        aihn.registerDefaultInstance(armh.class, armhVar);
    }

    private armh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new armh();
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
        return aihn.getParserForClass(armh.class);
    }
}
