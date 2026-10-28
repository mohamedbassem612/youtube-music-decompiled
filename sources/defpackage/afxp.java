package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afxp extends aihn implements aiis {
    public static final afxp a;
    public int b = 0;
    public Object c;

    static {
        afxp afxpVar = new afxp();
        a = afxpVar;
        aihn.registerDefaultInstance(afxp.class, afxpVar);
    }

    private afxp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001=\u0000\u0002<\u0000\u0003=\u0000\u0004<\u0000", new Object[]{"c", "b", afxn.class, afxo.class});
        }
        if (iOrdinal == 3) {
            return new afxp();
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
        return aihn.getParserForClass(afxp.class);
    }
}
