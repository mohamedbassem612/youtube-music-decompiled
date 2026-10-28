package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajcj extends aihn implements aiis {
    public static final ajcj a;
    public static final aihl b;
    public int c;
    public String d = "";
    private int e;

    static {
        ajcj ajcjVar = new ajcj();
        a = ajcjVar;
        aihn.registerDefaultInstance(ajcj.class, ajcjVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, ajcjVar, ajcjVar, null, 128828810, aika.MESSAGE, ajcj.class);
    }

    private ajcj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002᠌\u0000\u0003ဈ\u0001", new Object[]{"e", "c", aixp.k, "d"});
        }
        if (iOrdinal == 3) {
            return new ajcj();
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
        return aihn.getParserForClass(ajcj.class);
    }
}
