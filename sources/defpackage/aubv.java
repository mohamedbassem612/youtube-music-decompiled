package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aubv extends aihn implements aiis {
    public static final aubv a;
    public int b;
    public int c;
    public aiie d = emptyProtobufList();
    public aucr e;
    public auco f;

    static {
        aubv aubvVar = new aubv();
        a = aubvVar;
        aihn.registerDefaultInstance(aubv.class, aubvVar);
    }

    private aubv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"b", "c", "d", aubg.class, "e", "f"});
        }
        if (iOrdinal == 3) {
            return new aubv();
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
        return aihn.getParserForClass(aubv.class);
    }
}
