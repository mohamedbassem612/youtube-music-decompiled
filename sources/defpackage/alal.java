package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alal extends aihn implements aiis {
    public static final alal a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        alal alalVar = new alal();
        a = alalVar;
        aihn.registerDefaultInstance(alal.class, alalVar);
    }

    private alal() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u000b\u0005\u0000\u0000\u0000\u0001ဈ\u0001\u0006ဈ\u0005\u0007ဈ\b\bဈ\u0007\u000bဈ\n", new Object[]{"b", "c", "d", "f", "e", "g"});
        }
        if (iOrdinal == 3) {
            return new alal();
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
        return aihn.getParserForClass(alal.class);
    }
}
