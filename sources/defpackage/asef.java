package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class asef extends aihn implements aiis {
    public static final asef a;
    public int b = 0;
    public Object c;

    static {
        asef asefVar = new asef();
        a = asefVar;
        aihn.registerDefaultInstance(asef.class, asefVar);
    }

    private asef() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", ased.class, aseo.class});
        }
        if (iOrdinal == 3) {
            return new asef();
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
        return aihn.getParserForClass(asef.class);
    }
}
