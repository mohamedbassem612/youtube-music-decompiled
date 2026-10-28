package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aibc extends aihn implements aiis {
    public static final aibc a;
    public int b;
    public String c = "";
    public aiby d;
    public aibm e;
    public aieu f;

    static {
        aibc aibcVar = new aibc();
        a = aibcVar;
        aihn.registerDefaultInstance(aibc.class, aibcVar);
    }

    private aibc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new aibc();
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
        return aihn.getParserForClass(aibc.class);
    }
}
