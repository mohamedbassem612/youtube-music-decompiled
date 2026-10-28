package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ahxb extends aihn implements aiis {
    public static final ahxb a;
    public int b = 0;
    public Object c;

    static {
        ahxb ahxbVar = new ahxb();
        a = ahxbVar;
        aihn.registerDefaultInstance(ahxb.class, ahxbVar);
    }

    private ahxb() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0001\u0000\u0005\u0007\u0003\u0000\u0000\u0000\u0005=\u0000\u0006;\u0000\u0007;\u0000", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new ahxb();
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
        return aihn.getParserForClass(ahxb.class);
    }
}
