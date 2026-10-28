package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aica extends aihn implements aiis {
    public static final aica a;
    public int b = 0;
    public Object c;

    static {
        aica aicaVar = new aica();
        a = aicaVar;
        aihn.registerDefaultInstance(aica.class, aicaVar);
    }

    private aica() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"c", "b", aiam.class, aice.class, aiag.class, aicd.class, aiak.class, aian.class});
        }
        if (iOrdinal == 3) {
            return new aica();
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
        return aihn.getParserForClass(aica.class);
    }
}
