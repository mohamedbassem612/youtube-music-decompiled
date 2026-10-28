package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class atoz extends aihn implements aiis {
    public static final atoz a;
    public int b;
    public int g;
    public long h;
    public atpc i;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String j = "";
    public String k = "";

    static {
        atoz atozVar = new atoz();
        a = atozVar;
        aihn.registerDefaultInstance(atoz.class, atozVar);
    }

    private atoz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005᠌\u0004\u0006ဃ\u0005\u0007ဉ\u0006\bဈ\u0007\tဈ\b", new Object[]{"b", "c", "d", "e", "f", "g", assp.e, "h", "i", "j", "k"});
        }
        if (iOrdinal == 3) {
            return new atoz();
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
        return aihn.getParserForClass(atoz.class);
    }
}
