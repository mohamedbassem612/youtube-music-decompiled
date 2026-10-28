package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akxt extends aihn implements aiis {
    public static final akxt a;
    public boolean b;
    private int c;

    static {
        akxt akxtVar = new akxt();
        a = akxtVar;
        aihn.registerDefaultInstance(akxt.class, akxtVar);
    }

    private akxt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\b\b\u0001\u0000\u0000\u0000\bဇ\b", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new akxt();
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
        return aihn.getParserForClass(akxt.class);
    }
}
