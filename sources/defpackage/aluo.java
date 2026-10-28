package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aluo extends aihn implements aiis {
    public static final aluo a;
    public int b;
    public String c = "";
    public aiie d = emptyProtobufList();
    public aigj e = aigj.d;
    public boolean f;

    static {
        aluo aluoVar = new aluo();
        a = aluoVar;
        aihn.registerDefaultInstance(aluo.class, aluoVar);
    }

    private aluo() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ည\u0001\u0004ဇ\u0002", new Object[]{"b", "c", "d", alun.class, "e", "f"});
        }
        if (iOrdinal == 3) {
            return new aluo();
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
        return aihn.getParserForClass(aluo.class);
    }
}
