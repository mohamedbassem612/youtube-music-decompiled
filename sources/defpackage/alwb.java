package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class alwb extends aihn implements aiis {
    public static final alwb a;
    public int b = 0;
    public Object c;

    static {
        alwb alwbVar = new alwb();
        a = alwbVar;
        aihn.registerDefaultInstance(alwb.class, alwbVar);
    }

    private alwb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0001\u0000磌䈀磌䈀\u0001\u0000\u0000\u0000磌䈀<\u0000", new Object[]{"c", "b", alwc.class});
        }
        if (iOrdinal == 3) {
            return new alwb();
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
        return aihn.getParserForClass(alwb.class);
    }
}
