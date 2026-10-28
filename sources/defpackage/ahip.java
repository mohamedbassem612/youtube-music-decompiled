package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahip extends aihn implements aiis {
    public static final ahip a;
    public String b = "";
    public aigj c = aigj.d;
    public int d;

    static {
        ahip ahipVar = new ahip();
        a = ahipVar;
        aihn.registerDefaultInstance(ahip.class, ahipVar);
    }

    private ahip() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ahip();
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
        return aihn.getParserForClass(ahip.class);
    }
}
