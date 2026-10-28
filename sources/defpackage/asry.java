package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class asry extends aihn implements aiis {
    public static final asry a;
    public String b = "";
    public aifv c;
    private int d;

    static {
        asry asryVar = new asry();
        a = asryVar;
        aihn.registerDefaultInstance(asry.class, asryVar);
    }

    private asry() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"d", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new asry();
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
        return aihn.getParserForClass(asry.class);
    }
}
