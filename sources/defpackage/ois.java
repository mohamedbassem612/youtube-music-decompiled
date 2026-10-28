package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ois extends aihn implements aiis {
    public static final ois a;
    public String b = "";
    public String c = "";
    private int d;

    static {
        ois oisVar = new ois();
        a = oisVar;
        aihn.registerDefaultInstance(ois.class, oisVar);
    }

    private ois() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new ois();
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
        return aihn.getParserForClass(ois.class);
    }
}
