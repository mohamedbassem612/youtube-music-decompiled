package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajbq extends aihn implements aiis {
    public static final ajbq a;
    public int b;
    public Object d;
    public boolean f;
    public int c = 0;
    public String e = "";

    static {
        ajbq ajbqVar = new ajbq();
        a = ajbqVar;
        aihn.registerDefaultInstance(ajbq.class, ajbqVar);
    }

    private ajbq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002=\u0000\u00037\u0000\u0004;\u0000\u0005;\u0000\u0006ဇ\u0001", new Object[]{"d", "c", "b", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ajbq();
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
        return aihn.getParserForClass(ajbq.class);
    }
}
