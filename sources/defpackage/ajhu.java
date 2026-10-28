package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajhu extends aihn implements aiis {
    public static final ajhu a;
    public String b = "";
    public int c;
    private int d;

    static {
        ajhu ajhuVar = new ajhu();
        a = ajhuVar;
        aihn.registerDefaultInstance(ajhu.class, ajhuVar);
    }

    private ajhu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"d", "b", "c", albk.f});
        }
        if (iOrdinal == 3) {
            return new ajhu();
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
        return aihn.getParserForClass(ajhu.class);
    }
}
