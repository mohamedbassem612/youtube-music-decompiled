package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qfs extends aihn implements aiis {
    public static final qfs a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public float f;
    private int g;

    static {
        qfs qfsVar = new qfs();
        a = qfsVar;
        aihn.registerDefaultInstance(qfs.class, qfsVar);
    }

    private qfs() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ခ\u0004", new Object[]{"g", "b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new qfs();
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
        return aihn.getParserForClass(qfs.class);
    }
}
