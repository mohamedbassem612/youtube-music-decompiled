package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class arlb extends aihn implements aiis {
    public static final arlb a;
    public String b = "";
    public arkv c;
    private int d;

    static {
        arlb arlbVar = new arlb();
        a = arlbVar;
        aihn.registerDefaultInstance(arlb.class, arlbVar);
    }

    private arlb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"d", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new arlb();
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
        return aihn.getParserForClass(arlb.class);
    }
}
