package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ansz extends aihn implements aiis {
    public static final ansz a;
    public int b;
    public int c;
    public int d;

    static {
        ansz anszVar = new ansz();
        a = anszVar;
        aihn.registerDefaultInstance(ansz.class, anszVar);
    }

    private ansz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002᠌\u0002\u0003᠌\u0003", new Object[]{"b", "c", aofw.n, "d", aocm.e});
        }
        if (iOrdinal == 3) {
            return new ansz();
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
        return aihn.getParserForClass(ansz.class);
    }
}
