package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aibw extends aihn implements aiis {
    public static final aibw a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public aibv f;
    public aifv g;

    static {
        aibw aibwVar = new aibw();
        a = aibwVar;
        aihn.registerDefaultInstance(aibw.class, aibwVar);
    }

    private aibw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u001e\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0005\u0004ဈ\u0003\u0005ဈ\u0002\u001eဉ\u0006", new Object[]{"b", "c", "f", "e", "d", "g"});
        }
        if (iOrdinal == 3) {
            return new aibw();
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
        return aihn.getParserForClass(aibw.class);
    }
}
