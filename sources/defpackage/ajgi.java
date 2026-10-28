package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajgi extends aihn implements aiis {
    public static final ajgi a;
    public int b = 0;
    public Object c;

    static {
        ajgi ajgiVar = new ajgi();
        a = ajgiVar;
        aihn.registerDefaultInstance(ajgi.class, ajgiVar);
    }

    private ajgi() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"c", "b", ajgj.class});
        }
        if (iOrdinal == 3) {
            return new ajgi();
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
        return aihn.getParserForClass(ajgi.class);
    }
}
