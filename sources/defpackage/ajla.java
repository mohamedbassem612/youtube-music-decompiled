package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajla extends aihn implements aiis {
    public static final ajla a;
    public int b;
    public akel c;
    private int d;

    static {
        ajla ajlaVar = new ajla();
        a = ajlaVar;
        aihn.registerDefaultInstance(ajla.class, ajlaVar);
    }

    private ajla() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"d", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new ajla();
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
        return aihn.getParserForClass(ajla.class);
    }
}
