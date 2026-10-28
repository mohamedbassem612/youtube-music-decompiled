package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class askg extends aihn implements aiis {
    public static final askg a;
    public int b;
    public aijp c;
    public String d = "";
    public String e = "";
    public int f;
    public int g;
    public long h;
    public long i;
    public askh j;

    static {
        askg askgVar = new askg();
        a = askgVar;
        aihn.registerDefaultInstance(askg.class, askgVar);
    }

    private askg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0001\u0002ဈ\u0002\u0003᠌\u0003\u0004ဉ\u0000\u0005᠌\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဉ\u0007", new Object[]{"b", "d", "e", "f", apsb.c, "c", "g", apsb.d, "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new askg();
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
        return aihn.getParserForClass(askg.class);
    }
}
