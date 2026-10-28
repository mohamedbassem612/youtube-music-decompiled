package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class poz extends aihn implements aiis {
    public static final aihw a = new qle(1);
    public static final poz b;
    public aihv c = emptyIntList();

    static {
        poz pozVar = new poz();
        b = pozVar;
        aihn.registerDefaultInstance(poz.class, pozVar);
    }

    private poz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠞ", new Object[]{"c", aibu.d});
        }
        if (iOrdinal == 3) {
            return new poz();
        }
        if (iOrdinal == 4) {
            return new aihf(b);
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(poz.class);
    }
}
