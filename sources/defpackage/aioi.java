package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aioi extends aihn implements aiis {
    public static final aioi a;
    public int b;
    public int c = 0;
    public Object d;
    public aiof e;

    static {
        aioi aioiVar = new aioi();
        a = aioiVar;
        aihn.registerDefaultInstance(aioi.class, aioiVar);
    }

    private aioi() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0001\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0007<\u0000\b<\u0000", new Object[]{"d", "c", "b", "e", ainy.class, ainz.class, aiol.class, aioe.class, aiob.class, aiok.class});
        }
        if (iOrdinal == 3) {
            return new aioi();
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
        return aihn.getParserForClass(aioi.class);
    }
}
