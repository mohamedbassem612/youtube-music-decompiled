package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alup extends aihn implements aiis {
    public static final alup a;
    public int b;
    public int c;
    public aiie d = emptyProtobufList();
    public aigj e = aigj.d;
    private int f;

    static {
        alup alupVar = new alup();
        a = alupVar;
        aihn.registerDefaultInstance(alup.class, alupVar);
    }

    private alup() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002င\u0001\u0003\u001b\u0004ည\u0002", new Object[]{"f", "b", alre.c, "c", "d", alun.class, "e"});
        }
        if (iOrdinal == 3) {
            return new alup();
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
        return aihn.getParserForClass(alup.class);
    }
}
