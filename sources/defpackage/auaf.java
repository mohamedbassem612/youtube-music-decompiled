package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class auaf extends aihn implements aiis {
    public static final auaf a;
    public int b;
    public int c;
    public aihv d = emptyIntList();

    static {
        auaf auafVar = new auaf();
        a = auafVar;
        aihn.registerDefaultInstance(auaf.class, auafVar);
    }

    private auaf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aiht aihtVar = atxs.h;
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002ࠞ", new Object[]{"b", "c", aihtVar, "d", aihtVar});
        }
        if (iOrdinal == 3) {
            return new auaf();
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
        return aihn.getParserForClass(auaf.class);
    }
}
