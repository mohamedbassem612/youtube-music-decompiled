package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajii extends aihn implements aiis {
    public static final ajii a;
    public int b;
    public int c;
    private int d;

    static {
        ajii ajiiVar = new ajii();
        a = ajiiVar;
        aihn.registerDefaultInstance(ajii.class, ajiiVar);
    }

    private ajii() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new ajii();
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
        return aihn.getParserForClass(ajii.class);
    }
}
