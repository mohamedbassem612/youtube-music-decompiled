package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aicr extends aihn implements aiis {
    public static final aicr a;
    public int b = 0;
    public Object c;

    static {
        aicr aicrVar = new aicr();
        a = aicrVar;
        aihn.registerDefaultInstance(aicr.class, aicrVar);
    }

    private aicr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"c", "b", aico.class, aicn.class, aicm.class, aicl.class, aicp.class, aict.class});
        }
        if (iOrdinal == 3) {
            return new aicr();
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
        return aihn.getParserForClass(aicr.class);
    }
}
