package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajhl extends aihn implements aiis {
    public static final ajhl a;
    public int b;
    public String c = "";
    public String d = "";
    public boolean e;
    public boolean f;

    static {
        ajhl ajhlVar = new ajhl();
        a = ajhlVar;
        aihn.registerDefaultInstance(ajhl.class, ajhlVar);
    }

    private ajhl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0004\u0007\u0004\u0000\u0000\u0000\u0004ဈ\u0000\u0005ဈ\u0001\u0006ဇ\u0002\u0007ဇ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ajhl();
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
        return aihn.getParserForClass(ajhl.class);
    }
}
