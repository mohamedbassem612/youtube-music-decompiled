package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ajml extends aihn implements aiis {
    public static final ajml a;
    public int b;
    public String c = "";

    static {
        ajml ajmlVar = new ajml();
        a = ajmlVar;
        aihn.registerDefaultInstance(ajml.class, ajmlVar);
    }

    private ajml() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဈ\u0004", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ajml();
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
        return aihn.getParserForClass(ajml.class);
    }
}
