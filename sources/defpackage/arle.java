package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class arle extends aihn implements aiis {
    public static final arle a;
    public int b;
    public int c = 0;
    public Object d;
    public int e;

    static {
        arle arleVar = new arle();
        a = arleVar;
        aihn.registerDefaultInstance(arle.class, arleVar);
    }

    private arle() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003;\u0000", new Object[]{"d", "c", "b", "e", albk.m, arkv.class});
        }
        if (iOrdinal == 3) {
            return new arle();
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
        return aihn.getParserForClass(arle.class);
    }
}
