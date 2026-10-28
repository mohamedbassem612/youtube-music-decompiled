package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class auai extends aihn implements aiis {
    public static final auai a;
    public int b;
    public int c;

    static {
        auai auaiVar = new auai();
        a = auaiVar;
        aihn.registerDefaultInstance(auai.class, auaiVar);
    }

    private auai() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", atxs.i});
        }
        if (iOrdinal == 3) {
            return new auai();
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
        return aihn.getParserForClass(auai.class);
    }
}
