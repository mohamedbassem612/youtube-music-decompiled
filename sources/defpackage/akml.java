package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akml extends aihn implements aiis {
    public static final akml a;
    public aihv b = emptyIntList();
    public aihv c = emptyIntList();
    public aihv d = emptyIntList();
    public aihv e = emptyIntList();
    public aihv f = emptyIntList();
    public aihv g = emptyIntList();
    public aihv h = emptyIntList();
    public aihv i = emptyIntList();
    public aihv j = emptyIntList();
    public aihv k = emptyIntList();
    public aihv l = emptyIntList();
    public aihv m = emptyIntList();
    public aihv n = emptyIntList();
    public aihv o = emptyIntList();
    public aihv p = emptyIntList();

    static {
        akml akmlVar = new akml();
        a = akmlVar;
        aihn.registerDefaultInstance(akml.class, akmlVar);
    }

    private akml() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000f\u0000\u0000\u0001\u000f\u000f\u0000\u000f\u0000\u0001\u0016\u0002\u0016\u0003\u0016\u0004\u0016\u0005\u0016\u0006\u0016\u0007\u0016\b\u0016\t\u0016\n\u0016\u000b\u0016\f\u0016\r\u0016\u000e\u0016\u000f\u0016", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
        }
        if (iOrdinal == 3) {
            return new akml();
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
        return aihn.getParserForClass(akml.class);
    }
}
