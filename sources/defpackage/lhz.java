package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lhz extends aihn implements aiis {
    public static final lhz a;
    public int b;
    public int c;
    private int d;

    static {
        lhz lhzVar = new lhz();
        a = lhzVar;
        aihn.registerDefaultInstance(lhz.class, lhzVar);
    }

    private lhz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aiht aihtVar = fxd.o;
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"d", "b", aihtVar, "c", aihtVar});
        }
        if (iOrdinal == 3) {
            return new lhz();
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
        return aihn.getParserForClass(lhz.class);
    }
}
