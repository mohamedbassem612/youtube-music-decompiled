package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiqd extends aihn implements aiis {
    public static final aiqd a;
    public int b;
    public String c = "";

    static {
        aiqd aiqdVar = new aiqd();
        a = aiqdVar;
        aihn.registerDefaultInstance(aiqd.class, aiqdVar);
    }

    private aiqd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new aiqd();
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
        return aihn.getParserForClass(aiqd.class);
    }
}
