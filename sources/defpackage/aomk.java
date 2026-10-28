package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aomk extends aihn implements aiis {
    public static final aomk a;
    public boolean b;
    private int c;

    static {
        aomk aomkVar = new aomk();
        a = aomkVar;
        aihn.registerDefaultInstance(aomk.class, aomkVar);
    }

    private aomk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဇ\u0002", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new aomk();
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
        return aihn.getParserForClass(aomk.class);
    }
}
