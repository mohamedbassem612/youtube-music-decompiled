package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afxo extends aihn implements aiis {
    public static final afxo a;

    static {
        afxo afxoVar = new afxo();
        a = afxoVar;
        aihn.registerDefaultInstance(afxo.class, afxoVar);
    }

    private afxo() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new afxo();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(afxo.class);
        }
        return null;
    }
}
