package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amfl extends aihn implements aiis {
    public static final amfl a;
    public int b;
    public int c;
    public aigj d = aigj.d;
    public String e = "";
    public amfk f;

    static {
        amfl amflVar = new amfl();
        a = amflVar;
        aihn.registerDefaultInstance(amfl.class, amflVar);
    }

    private amfl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\ue8e8乿\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ဈ\u0002\ue8e8乿ဉ\u0005", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new amfl();
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
        return aihn.getParserForClass(amfl.class);
    }
}
