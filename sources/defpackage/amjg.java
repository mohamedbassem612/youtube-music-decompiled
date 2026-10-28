package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amjg extends aihn implements aiis {
    public static final amjg a;
    public int b;
    public int c;
    public String d = "";
    public String e = "";
    public boolean f;
    public int g;

    static {
        amjg amjgVar = new amjg();
        a = amjgVar;
        aihn.registerDefaultInstance(amjg.class, amjgVar);
    }

    private amjg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဋ\u0005", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new amjg();
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
        return aihn.getParserForClass(amjg.class);
    }
}
