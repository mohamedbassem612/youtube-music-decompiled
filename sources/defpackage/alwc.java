package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class alwc extends aihn implements aiis {
    public static final alwc a;
    public String b = "";
    public String c = "";
    private int d;

    static {
        alwc alwcVar = new alwc();
        a = alwcVar;
        aihn.registerDefaultInstance(alwc.class, alwcVar);
    }

    private alwc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new alwc();
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
        return aihn.getParserForClass(alwc.class);
    }
}
