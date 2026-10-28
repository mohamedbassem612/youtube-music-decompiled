package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aiuk extends aihn implements aiis {
    public static final aiuk a;
    public int b;
    public int c;
    public int d;
    public int e;
    public String f = "";

    static {
        aiuk aiukVar = new aiuk();
        a = aiukVar;
        aihn.registerDefaultInstance(aiuk.class, aiukVar);
    }

    private aiuk() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0005ဈ\u0004", new Object[]{"b", "c", alip.p, "d", alip.q, "e", alip.r, "f"});
        }
        if (iOrdinal == 3) {
            return new aiuk();
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
        return aihn.getParserForClass(aiuk.class);
    }
}
