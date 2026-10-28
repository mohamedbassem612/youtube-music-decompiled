package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oax extends aihn implements aiis {
    public static final oax a;
    public int b;
    public float d;
    public String c = "https://pagead2.googlesyndication.com/pagead/ping?e=2&f=1";
    public long e = 1000;
    public long f = 60000;

    static {
        oax oaxVar = new oax();
        a = oaxVar;
        aihn.registerDefaultInstance(oax.class, oaxVar);
    }

    private oax() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new oax();
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
        return aihn.getParserForClass(oax.class);
    }
}
