package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aoje extends aihn implements aiis {
    public static final aoje a;
    public int b;
    public aiie c = emptyProtobufList();
    public boolean d;
    public int e;

    static {
        aoje aojeVar = new aoje();
        a = aojeVar;
        aihn.registerDefaultInstance(aoje.class, aojeVar);
    }

    private aoje() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000\u0003င\u0001", new Object[]{"b", "c", apfo.class, "d", "e"});
        }
        if (iOrdinal == 3) {
            return new aoje();
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
        return aihn.getParserForClass(aoje.class);
    }
}
