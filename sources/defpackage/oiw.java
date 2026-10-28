package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oiw extends aihn implements aiis {
    public static final oiw a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public boolean f;

    static {
        oiw oiwVar = new oiw();
        a = oiwVar;
        aihn.registerDefaultInstance(oiw.class, oiwVar);
    }

    private oiw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဇ\u0003\u0005ဈ\u0002", new Object[]{"b", "c", "d", "f", "e"});
        }
        if (iOrdinal == 3) {
            return new oiw();
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
        return aihn.getParserForClass(oiw.class);
    }
}
