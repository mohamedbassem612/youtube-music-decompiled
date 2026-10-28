package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aieh extends aihn implements aiis {
    public static final aieh a;
    public aijp b;
    private int c;

    static {
        aieh aiehVar = new aieh();
        a = aiehVar;
        aihn.registerDefaultInstance(aieh.class, aiehVar);
    }

    private aieh() {
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0002", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new aieh();
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
        return aihn.getParserForClass(aieh.class);
    }
}
