package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqhp extends aihn implements aiis {
    public static final aqhp a;
    public int b;
    public String c = "";
    public aijp d;

    static {
        aqhp aqhpVar = new aqhp();
        a = aqhpVar;
        aihn.registerDefaultInstance(aqhp.class, aqhpVar);
    }

    private aqhp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new aqhp();
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
        return aihn.getParserForClass(aqhp.class);
    }
}
