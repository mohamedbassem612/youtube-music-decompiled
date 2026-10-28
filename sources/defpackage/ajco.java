package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajco extends aihn implements aiis {
    public static final ajco a;
    public int b;
    public boolean c;
    private int d;

    static {
        ajco ajcoVar = new ajco();
        a = ajcoVar;
        aihn.registerDefaultInstance(ajco.class, ajcoVar);
    }

    private ajco() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"d", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new ajco();
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
        return aihn.getParserForClass(ajco.class);
    }
}
