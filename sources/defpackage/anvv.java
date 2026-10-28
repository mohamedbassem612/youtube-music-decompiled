package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class anvv extends aihn implements aiis {
    public static final anvv a;
    public int b;
    public String c = "";
    public int d;

    static {
        anvv anvvVar = new anvv();
        a = anvvVar;
        aihn.registerDefaultInstance(anvv.class, anvvVar);
    }

    private anvv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", anvw.a});
        }
        if (iOrdinal == 3) {
            return new anvv();
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
        return aihn.getParserForClass(anvv.class);
    }
}
