package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jzo extends aihn implements aiis {
    public static final jzo a;
    public int b;
    public String c = "";
    private int d;

    static {
        jzo jzoVar = new jzo();
        a = jzoVar;
        aihn.registerDefaultInstance(jzo.class, jzoVar);
    }

    private jzo() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002᠌\u0001\u0003ဈ\u0002", new Object[]{"d", "b", fxd.j, "c"});
        }
        if (iOrdinal == 3) {
            return new jzo();
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
        return aihn.getParserForClass(jzo.class);
    }
}
