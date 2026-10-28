package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aiar extends aihn implements aiis {
    public static final aiar a;
    public int b;
    public String c = "";
    public aiie d = emptyProtobufList();
    public aieu e;

    static {
        aiar aiarVar = new aiar();
        a = aiarVar;
        aihn.registerDefaultInstance(aiar.class, aiarVar);
    }

    private aiar() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0004ဉ\u0002", new Object[]{"b", "c", "d", aiaq.class, "e"});
        }
        if (iOrdinal == 3) {
            return new aiar();
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
        return aihn.getParserForClass(aiar.class);
    }
}
