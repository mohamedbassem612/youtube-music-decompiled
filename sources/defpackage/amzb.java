package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amzb extends aihn implements aiis {
    public static final amzb a;
    public amzc c;
    private int e;
    public aiie b = emptyProtobufList();
    public aiie d = emptyProtobufList();

    static {
        amzb amzbVar = new amzb();
        a = amzbVar;
        aihn.registerDefaultInstance(amzb.class, amzbVar);
    }

    private amzb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0005\b\u0003\u0000\u0002\u0000\u0005\u001a\u0006ဉ\u0003\b\u001a", new Object[]{"e", "b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new amzb();
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
        return aihn.getParserForClass(amzb.class);
    }
}
