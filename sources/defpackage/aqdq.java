package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqdq extends aihn implements aiis {
    public static final aqdq a;

    static {
        aqdq aqdqVar = new aqdq();
        a = aqdqVar;
        aihn.registerDefaultInstance(aqdq.class, aqdqVar);
    }

    private aqdq() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new aqdq();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(aqdq.class);
        }
        return null;
    }
}
