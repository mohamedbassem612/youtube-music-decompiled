package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class askz extends aihn implements aiis {
    public static final askz a;
    public int b;
    public int c = 0;
    public Object d;
    public aslb e;

    static {
        askz askzVar = new askz();
        a = askzVar;
        aihn.registerDefaultInstance(askz.class, askzVar);
    }

    private askz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0003\u0005\u0003\u0000\u0000\u0000\u00034\u0000\u0004:\u0000\u0005ဉ\u0002", new Object[]{"d", "c", "b", "e"});
        }
        if (iOrdinal == 3) {
            return new askz();
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
        return aihn.getParserForClass(askz.class);
    }
}
