package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajlr extends aihn implements aiis {
    public static final ajlr a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public String j = "";

    static {
        ajlr ajlrVar = new ajlr();
        a = ajlrVar;
        aihn.registerDefaultInstance(ajlr.class, ajlrVar);
    }

    private ajlr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003᠌\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဈ\u0007", new Object[]{"b", "c", "d", "e", ajhd.j, "f", "g", "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new ajlr();
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
        return aihn.getParserForClass(ajlr.class);
    }
}
