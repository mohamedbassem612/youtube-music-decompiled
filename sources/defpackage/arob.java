package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arob extends aihn implements aiis {
    public static final arob a;
    public int b;
    public int d;
    public aigj c = aigj.d;
    public String e = "";
    public String f = "";

    static {
        arob arobVar = new arob();
        a = arobVar;
        aihn.registerDefaultInstance(arob.class, arobVar);
    }

    private arob() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002᠌\u0001\u0007ဈ\u0006\bဈ\u0007", new Object[]{"b", "c", "d", arke.j, "e", "f"});
        }
        if (iOrdinal == 3) {
            return new arob();
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
        return aihn.getParserForClass(arob.class);
    }
}
