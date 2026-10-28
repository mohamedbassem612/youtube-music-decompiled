package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class jrl extends aihn implements aiis {
    public static final jrl a;
    public int b;
    public int e;
    public String c = "";
    public aihv d = emptyIntList();
    public aihv f = emptyIntList();

    static {
        jrl jrlVar = new jrl();
        a = jrlVar;
        aihn.registerDefaultInstance(jrl.class, jrlVar);
    }

    private jrl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u0016\u0003င\u0001\u0004\u0016", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new jrl();
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
        return aihn.getParserForClass(jrl.class);
    }
}
