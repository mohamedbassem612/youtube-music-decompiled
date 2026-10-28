package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ains extends aihn implements aiis {
    public static final ains a;
    public int b;
    public String c;

    static {
        ains ainsVar = new ains();
        a = ainsVar;
        aihn.registerDefaultInstance(ains.class, ainsVar);
    }

    private ains() {
        emptyProtobufList();
        this.c = "";
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ለ\u0001", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ains();
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
        return aihn.getParserForClass(ains.class);
    }
}
