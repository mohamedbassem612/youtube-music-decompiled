package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aqkb extends aihn implements aiis {
    public static final aqkb a;
    public String b = "";
    private int c;

    static {
        aqkb aqkbVar = new aqkb();
        a = aqkbVar;
        aihn.registerDefaultInstance(aqkb.class, aqkbVar);
    }

    private aqkb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0000", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new aqkb();
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
        return aihn.getParserForClass(aqkb.class);
    }
}
