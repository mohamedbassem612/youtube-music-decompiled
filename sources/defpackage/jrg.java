package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class jrg extends aihn implements aiis {
    public static final jrg a;
    public int b;
    public String c = "";
    public aihv d = emptyIntList();

    static {
        jrg jrgVar = new jrg();
        a = jrgVar;
        aihn.registerDefaultInstance(jrg.class, jrgVar);
    }

    private jrg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u0016", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new jrg();
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
        return aihn.getParserForClass(jrg.class);
    }
}
