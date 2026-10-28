package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anlx extends aihn implements aiis {
    public static final anlx a;
    public int b;
    public String c = "";
    public anly d;
    private int e;

    static {
        anlx anlxVar = new anlx();
        a = anlxVar;
        aihn.registerDefaultInstance(anlx.class, anlxVar);
    }

    private anlx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0002\u0007@\u0002\u0000\u0000\u0000\u0007ဈ\u0004@ဉ+", new Object[]{"b", "e", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new anlx();
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
        return aihn.getParserForClass(anlx.class);
    }
}
