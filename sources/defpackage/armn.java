package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class armn extends aihn implements aiis {
    public static final armn a;
    public aigj b;
    public aigj c;
    private int d;

    static {
        armn armnVar = new armn();
        a = armnVar;
        aihn.registerDefaultInstance(armn.class, armnVar);
    }

    private armn() {
        aigj aigjVar = aigj.d;
        this.b = aigjVar;
        this.c = aigjVar;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"d", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new armn();
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
        return aihn.getParserForClass(armn.class);
    }
}
